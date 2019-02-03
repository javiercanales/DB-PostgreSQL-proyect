/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;

/**
 *
 * @author Javier
 */
public class Datos {
    public Vector<String> usuarios;
    public Datos(){
        usuarios = new Vector<>();
    }

    public Vector<String> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(Vector<String> usuarios) {
        this.usuarios = usuarios;
    }
    public void addUsuario(String usuario){
        usuarios.add(usuario);
    }
    
}
