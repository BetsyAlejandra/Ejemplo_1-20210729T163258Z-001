/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author dacastro
 */
public class ManejoArchivo {

    public static boolean guardarArchivo(LinkedList<Estudiante> le) {
        boolean t = false;
        FileWriter fichero = null;
        PrintWriter pw = null;
        String rutanombre = "estudiantes.txt";
        try {
            fichero = new FileWriter(rutanombre);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < le.size(); i++) {
                Estudiante objestudiante = le.get(i);
                pw.println(objestudiante.toString());
                t = true;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.toString());
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
                t = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }

            return t;
        }
    }

    public static LinkedList<Estudiante> leerArchivo() {
        LinkedList<Estudiante> le = new LinkedList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
             // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("estudiantes.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
             
             String [] elcontenido=linea.split(",");
             Estudiante obje=new Estudiante(elcontenido[3], elcontenido[4], 
                     elcontenido[0], elcontenido[1], elcontenido[2]);
            le.add(obje);
         }
        }catch(Exception e){
            System.out.println("Error "+e.toString());
        }
        
        return le;

    }

}
