/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author jacks
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Faça um programa que leia 5 números inteiros e informe a soma
        e a média dos números */
        
        Scanner scan = new Scanner(System.in);
        int num;
        double media = 0;
        int soma = 0;
                
        for (int i = 0; i < 5; i++){
            System.out.println("Digite um número");
            num = scan.nextInt();
            
            soma += num;
            media = soma / (i+1);
        }
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
    
}
