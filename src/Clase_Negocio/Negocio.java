/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Negocio;

import Pantalla.JDPantalla;
import javax.swing.JOptionPane;
import Pantalla.JDlogin;

/**
 *
 * @author elbet
 */
public class Negocio {
    private String UsuarioVal="Admin";
    private String ContraseñaVal="12345";
    private String usuario;
    private String password;
    
public static void Ingresar(){
    String UsuarioVal="Admin";
    String ContraseñaVal="12345";
    String usuario, password;
    
    usuario =JDlogin.jTUser.getText();
    password =JDlogin.jTPassword.getText();
    
    if(UsuarioVal.equals(usuario)){
        if(ContraseñaVal.equals(password)){
            
            //JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
            llama();
            
        }else{
        JOptionPane.showMessageDialog(null,"La contraseña es Incorrecta", "ERROR",JOptionPane.ERROR_MESSAGE);}
    }else{
        JOptionPane.showMessageDialog(null,"El Usuario es Invalido", "ERROR",JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private static void llama(){
        JDPantalla b = new JDPantalla();
        b.setVisible(true);

    }    

    private String Integer(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuarioVal() {
        return UsuarioVal;
    }

    public void setUsuarioVal(String UsuarioVal) {
        this.UsuarioVal = UsuarioVal;
    }

    public String getContraseñaVal() {
        return ContraseñaVal;
    }

    public void setContraseñaVal(String ContraseñaVal) {
        this.ContraseñaVal = ContraseñaVal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
