/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class VentasTvs {
    private ArrayList<Televisor> Tv;
     double precioTotal ;
     String marcasVendidas;
    
    public void establecerTelevisores(ArrayList<Televisor> t){
        Tv = t;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return Tv;
    }
    
    public void establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < Tv.size(); i++) {
            s = s + Tv.get(i).obtenerPrecio();
            
        }
        precioTotal = s;
    }
    public double obtenerPrecio(){
        return precioTotal;
    }
    
    public void establecerMarcasVendidas(){
        String s = "";
        for (int i = 0; i < Tv.size(); i++) {
            s = String.format("%s%s\n", s, Tv.get(i).obtenerMarca());
            
        }
        marcasVendidas = s;
    }
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }
    
    public String toString(){
        return String.format("TV:%s\n%s\n",
                obtenerTelevisores(),
                obtenerMarcasVendidas(),
                obtenerPrecio());
                
    }

}
