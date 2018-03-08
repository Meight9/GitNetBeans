/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos1;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class EjerciciosBasicos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int entrada;
        int max = 0;
        int min = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int total=0;
        int contador = 0;
        
        do{
            
            System.out.println("Ingrese un umero, si se desea detener ingrese \"-1\"");
            entrada = input.nextInt();
            
            if(contador == 0){
                max = entrada;
                min = entrada;
            }else{
            
                if(entrada>max){
                    max = entrada;
                }
                if(entrada<min){
                    min = entrada;
                }
            }
            if(entrada>0){
                sumaPositivos+=entrada;
            }
            if(entrada<0){
                sumaNegativos+=entrada;
            }
            total+=entrada;
            contador++;
        }while(entrada != -1);
        
        int promedio = total/contador;
        
        System.out.println("maximo: "+max);
        System.out.println("minimo: "+min);
        System.out.println("total de suma: "+total);
        System.out.println("total de suma de positivos: "+sumaPositivos);
        System.out.println("total de suma de negativos: "+sumaNegativos);
        System.out.println("promedio: "+promedio);
        
        
        /*System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int i = num;
        int cont=0;
        while(i>0){
            if(num%i == 0){
                cont++;
            }
            i--;
        }
        
        if(cont == 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("el numero no es primo");
        }
        
        int num1 = 5;
        int num2 = 6;
        
        System.out.println(num1+num2+" "+num1*num2+" "+num1/num2);*/
    }
    
}
