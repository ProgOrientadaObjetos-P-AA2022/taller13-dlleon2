/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p0.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        lista.add(c);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        */
        ArrayList<Correo> lista = new ArrayList<>();
        
        Correo c1 = new Correo();
        Correo c2 = new Correo();
        Correo c3 = new Correo();
        Correo c4 = new Correo();
        Correo c5 = new Correo();
        
        Estudiante e = new Estudiante();
        e.establecerNombres("Mario Isaac Calva Abad");
        e.establecerUserName("maiscal1999");
        
        Gmail g1 = new Gmail();
        g1.establecerDominio();
        c1.establecerDominio(g1);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();
        lista.add(c1);
        
        Gobierno g2 = new Gobierno();
        g2.establecerDominio();
        c2.establecerDominio(g2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        lista.add(c2);
        
        Outlook o = new Outlook();
        o.establecerDominio();
        c3.establecerDominio(o);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        lista.add(c3);
        
        Yahoo y = new Yahoo();
        y.establecerDominio();
        c4.establecerDominio(y);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        lista.add(c4);
        
        Utpl ut = new Utpl();
        ut.establecerDominio();
        e.establecerUserName("micalva");// otro tipo de userName
        c5.establecerDominio(ut);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        lista.add(c5);
        
        e.establecerCorreos(lista);
        System.out.printf("%s\n", e);
    }
    
}
