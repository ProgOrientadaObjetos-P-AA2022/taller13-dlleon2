/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
   
    private ArrayList<Matricula> Lista;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void establecerPromedioMatriculas(double pm) {
        promedioMatriculas = pm;
    }

    public ArrayList<Matricula> obtnerLista() {
        return Lista;
    }

    public void establecerLista(ArrayList<Matricula> L) {
        Lista = L;
    }


    
    public void establecerMatricula(ArrayList<Matricula> M){
        double suma = 0;
        for (int i = 0; i < obtenerLista.size(); i++) {
            promedioMatriculas = suma / obtenerLista().size(); 
            
        }
    }
   
}
