/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mina
 */
import java.util.Scanner;

public class Circulo 
{
        /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
     {
     // TODO code application logic here
     final double PI=3.1416;
     // TODO Apéndice de método generado automáticamente
     try{
         Scanner s=new Scanner(System.in);
            System.out.println("Introduce el radio:");
            double r=s.nextDouble();
            double area=(PI*r*r);
            System.out.printf("El valor del área es %f\n", area);
            double longitud = (2*PI*r);
            System.out.println("La longitud del circulo es: " + longitud);
            
            //calcular redondeo de area y longitud
            System.out.println("cambio para el apartado 9");
     }
     catch (Exception E)
     {
         System.out.println("Error");
     }
   }  
}
