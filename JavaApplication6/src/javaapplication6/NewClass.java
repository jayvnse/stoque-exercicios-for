/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author jacks
 */
public class NewClass {
    /* Faça um programa que peça 10 números inteiros, calcule e mostre a
    quantidade de números pares e ímpares. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        
        for (int i=0; i<10; i++){
            System.out.println("Entre com um número:");
            num = scan.nextInt();
            
            if(num % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Ímpares: " + impar);
    }
}
