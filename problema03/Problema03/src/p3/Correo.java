/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p0.Outlook;

/**
 *
 * @author reroes
 */
public class Correo {
    private DominioGmail dominioGmail;
    private String correo;
    private String username;
    
    public void establecerDominio(DominioGmail g){
        dominioGmail = g;
    }
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public DominioGmail obtenerDominio(){
        return dominioGmail;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }

    public void establecerDominio(Outlook o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}