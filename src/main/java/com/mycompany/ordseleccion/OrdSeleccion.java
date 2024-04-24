/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordseleccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YULIETH
 */
public class OrdSeleccion {
       static Scanner lec = new Scanner(System.in);
        
    private static  ArrayList<Corredor > corredores = new ArrayList();
    
    public static void main(String[] args) {
        
        
         System.out.println("Escribir de tiempos a ingresar ");
        int input = lec.nextInt();
        
        for (int i = 0; i < input ; i++) {
            System.out.println("digite el tiempo del corredor"+(i+1));
            double tiempocorredor= lec.nextDouble();
            registrar(tiempocorredor);
        }
        System.out.println("Listado de los tiempos ");
       mostrar();
       
       
        System.out.println("");
        System.out.println("lista ordenada");
        ordenarporselecion();
        mostrar();
    }
    
    public static void registrar(double Tiempo) {
        Corredor nevoT = new Corredor (Tiempo);
         corredores.add(nevoT);

    }

    public static void mostrar() {
        for (Corredor a :  corredores) {
            System.out.println(a.getTiempo());

        }
    }
    
    public static void ordenarporselecion (){
        
        for (int i = 0; i <  corredores.size() -1 ; i++) {
            
            int posmenor = i;
            
            for (int j = i + 1 ; j <  corredores.size(); j++) {
              
               
               if ( corredores.get(j).getTiempo()<corredores.get(posmenor).getTiempo()){
                  
                   posmenor = j ;
               }
            }
            Corredor  temp = corredores.get(posmenor);
            corredores.set(posmenor, corredores.get(i));
            corredores.set(i, temp);
        }
    
}
}
