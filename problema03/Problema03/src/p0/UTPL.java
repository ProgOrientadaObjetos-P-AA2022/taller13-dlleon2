/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p0;

/**
 *
 * @author LENOVO
 */
public class UTPL implements DominioG{
   private String dominio;
    
    @Override
    public void establecerDominio(){
        dominio = "utpl.edu.ec";
    }
    
    @Override
    public String obtenerDominio(){
        return dominio;
    } 
}
