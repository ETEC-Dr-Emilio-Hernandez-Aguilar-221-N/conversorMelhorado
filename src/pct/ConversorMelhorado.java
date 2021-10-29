/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class ConversorMelhorado {
    public static void main(String[] args) {
        //variaveis
        int op_menu;
        double temp, temp_convetida;
        //objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        do{
            //menu
            System.out.println("\n\n Conversor de temperatura... digite: ");
            System.out.println("\t\t[1] Para converter de Celsius para Fahrenheit");
            System.out.println("\t\t[2] Para converter de Celsius para Kelvin");
            System.out.println("\t\t[3] Para converter de Fahrenheit para Celsius");            
            System.out.println("\t\t[4] Para converter de Fahrenheit para Kelvin");
            System.out.println("\t\t[5] Para converter de Kelvin para Celsius");            
            System.out.println("\t\t[6] Para converter de Kelvin para Fahrenheit");
            System.out.println("\t\t[7] Para sair .....");
            System.out.print("\t\tEai? : ");
            op_menu = entrada.nextInt();
            switch (op_menu){
                case 1:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = ((temp / 5 ) * 9) + 32; 
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                case 2:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = temp + 273.15;
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                case 3:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = ((temp - 32)/9) * 5;
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                case 4:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = (((temp - 32)/9) * 5) + 273.15;
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                case 5:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = temp - 273.15;
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                case 6:
                    System.out.print("\tDigite a temperatura: ");
                    temp = entrada.nextDouble();
                    temp_convetida = (((temp - 273.15) / 5 ) * 9) + 32;
                    System.out.printf("\tA temperatura convertida é de %.2f", temp_convetida);
                    break;
                default:
                    System.out.println("\t\t\t Opção invalida......");   
            }            
        }while (op_menu!=7);        
    }
    
}
