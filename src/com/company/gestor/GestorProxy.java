package com.company.gestor;

import com.company.entidades.Biciusuario;
import com.company.entidades.Empresa;
import com.company.entidades.User;
import com.company.proxy.GestorInteface;
import com.company.entidades.Componente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorProxy implements GestorInteface {

    private User user;
    private GestorSingleton gestorSingleton;
    private ArrayList<Componente> componentes = new ArrayList<Componente>();

    public GestorProxy(User user) {
        this.user = user;
        actualizarComponentes();
    }

    @Override
    public void ejecutarAccion(String accion) {
        String correo = user.getCorreo();
        String password = user.getPassword();
        List<String> acciones = Arrays.asList(accion.split(","));
        String metodo = acciones.get(0);

        if (this.user.getCorreo().equals("admin@movelo.org") && this.user.getPassword().equals("Movelo123")) {
            if (metodo.equals("crearBiciusuario")) {
                GestorSingleton.build().crearBiciusuario(correo, password, acciones.get(1), acciones.get(2), acciones.get(3), acciones.get(4));
            } else if (metodo.equals("crearEmpresa")) {
                GestorSingleton.build().crearEmpresa(correo, password, acciones.get(1), acciones.get(2), acciones.get(3));
            } else if (metodo.equals("consultarBiciusuario")) {
                GestorSingleton.build().consultarBiciusuario(acciones.get(1));
            } else if (metodo.equals("consultarEmpresa")) {
                GestorSingleton.build().consultarEmpresa(acciones.get(1));
            } else if (metodo.equals("actualizarBiciusuario")) {
                GestorSingleton.build().actualizarBiciusuario(correo, password, acciones.get(1), acciones.get(2), acciones.get(3), acciones.get(4));
            } else if (metodo.equals("actualizarEmpresa")) {
                GestorSingleton.build().actualizarEmpresa(correo, password, acciones.get(1), acciones.get(2), acciones.get(3));
            } else if (metodo.equals("eliminarBiciusuario")) {
                GestorSingleton.build().eliminarBiciusuario(acciones.get(1));
            } else if (metodo.equals("eliminarEmpresa")) {
                GestorSingleton.build().eliminarEmpresa(acciones.get(1));
            } else if (metodo.equals("crearComposicionEmpresa")) {
                GestorSingleton.build().crearComposicionEmpresaEmpresa(acciones.get(1), acciones.get(2));
            } else if (metodo.equals("crearComposicionEmpleado")) {
                GestorSingleton.build().crearComposicionEmpresaEmpleado(acciones.get(1), acciones.get(2));
            } else if (metodo.equals("eliminarComposicionEmpleado")) {
                GestorSingleton.build().eliminarComposicionEmpresaEmpleado(acciones.get(1), acciones.get(2));
            } else if (metodo.equals("agregarBicicleta")) {
                GestorSingleton.build().agregarBicicleta(acciones.get(1), acciones.get(2), acciones.get(3), acciones.get(4), acciones.get(5), acciones.get(6));
            }
            actualizarComponentes();
        } else {
            for (Componente componente : componentes) {
                if (componente instanceof Empresa) {
                    if (correo.equalsIgnoreCase(((Empresa) componente).getCorreo()) && password.equals(((Empresa) componente).getContrasena())) {
                        if (metodo.equals("actualizarEmpresa")) {
                            GestorSingleton.build().actualizarEmpresa(correo, password, acciones.get(1), acciones.get(2), acciones.get(3));
                        } else if (metodo.equals("eliminarEmpresa")) {
                            GestorSingleton.build().eliminarEmpresa(acciones.get(1));
                        } else if (metodo.equals("crearComposicionEmpleado")) {
                            GestorSingleton.build().crearComposicionEmpresaEmpleado(acciones.get(1), acciones.get(2));
                        } else if (metodo.equals("eliminarComposicionEmpleado")) {
                            GestorSingleton.build().eliminarComposicionEmpresaEmpleado(acciones.get(1), acciones.get(2));
                        }
                    } else if (componente instanceof Biciusuario) {
                        if (correo.equalsIgnoreCase(((Biciusuario) componente).getCorreo()) && password.equals(((Biciusuario) componente).getPassword())) {
                            if (metodo.equals("actualizarBiciusuario")) {
                                GestorSingleton.build().actualizarBiciusuario(correo, password, acciones.get(1), acciones.get(2), acciones.get(3), acciones.get(4));
                            } else if (metodo.equals("eliminarBiciusuario")) {
                                GestorSingleton.build().eliminarBiciusuario(acciones.get(1));
                            } else if (metodo.equals("agregarBicicleta")) {
                                GestorSingleton.build().agregarBicicleta(acciones.get(1), acciones.get(2), acciones.get(3), acciones.get(4), acciones.get(5), acciones.get(6));
                            }
                        }
                    }
                }
            }
            actualizarComponentes();
        }
        actualizarComponentes();
    }
   public void actualizarComponentes(){
        componentes = GestorSingleton.build().getComponentes();
   }
}
