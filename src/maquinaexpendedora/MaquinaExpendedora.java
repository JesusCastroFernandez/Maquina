/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class MaquinaExpendedora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean continuar = true;
        while(continuar)  {
            
       
            Scanner scanner= new Scanner(System.in);  

            System.out.println("MÁQUINA EXPENDEDORA DE PRODUCTOS");
            System.out.println("--------------------------------");
            System.out.print("Precio del Producto en céntimos: ");
            int precio= scanner.nextInt();
            System.out.print("Dinero Introducido: ");
            int dinero= scanner.nextInt();
            if(dinero<0){

            }
            System.out.println();
            System.out.println("RESULTADO");
            System.out.println("---------");
            if(dinero>precio){
                int cambio= dinero - precio;
                System.out.println("El cambio es: "+ cambio+" céntimos");
               
                int cantidadMonedas20 = cambio/20;
                int dineroQueYaSehadado = cantidadMonedas20*20;
                int calculadelresto =cambio-dineroQueYaSehadado;
                
                int cantidadMonedas10 = 0;
                int cantidadMonedas5 = 0;
                int cantidadMonedas2 = 0;
                int cantidadMonedas1 = 0;
                if(calculadelresto>9){
                    cantidadMonedas10 = calculadelresto/10;
                    calculadelresto = calculadelresto-(cantidadMonedas10*10);
                }
                if(calculadelresto>4){
                    cantidadMonedas5 = calculadelresto/5;
                    calculadelresto = calculadelresto-(cantidadMonedas5*5);
                }
                if(calculadelresto>1){
                    cantidadMonedas2 = calculadelresto/2;
                    calculadelresto = calculadelresto-(cantidadMonedas2*2);
                }
                if(calculadelresto>=0){
                     cantidadMonedas1 = calculadelresto/1;
                    calculadelresto = calculadelresto-(cantidadMonedas1*1);
                }
                
                System.out.println("Monedas de 20 céntimos: "+ cantidadMonedas20);
                System.out.println("Monedas de 10 céntimos: "+ cantidadMonedas10);
                System.out.println("Monedas de 5 céntimos: "+ cantidadMonedas5);
                System.out.println("Monedas de 2 céntimos: "+ cantidadMonedas2);
                System.out.println("Monedas de 1 céntimos: "+ cantidadMonedas1);

                System.out.println("Total de monedas: "+( cantidadMonedas20+cantidadMonedas10+cantidadMonedas5+cantidadMonedas2+cantidadMonedas1));  

            }else{
                System.out.println("Total de producto es mayor que nuestro dinero. ");  
            }

             System.out.println("Continuar con la maquina expendedora?(1 Continuar 0 Salir del programa)");
           
             int decision= scanner.nextInt();
            if(decision == 1){
                continuar = true;
                 System.out.println("------------------------------- ");
                 System.out.println(" ");
                 System.out.println("------------------------------- ");
            }else if(decision == 0){
                continuar = false;
            }
        }
        System.out.print("Gracias!.)");
        
    }
}
