/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete00;

/**
 *
 * @author LENOVO
 */
public class Televisor {
    private String marca;
    private double precio;
    
    public Televisor(String m, double p){
        marca = m;
        precio = p;
    }
    
    public void establecerMarca(String m){
        marca = m;
    }
    public void establecerPrecio(double m){
        precio = m;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerPrecio(){
        return precio;
    }
}
