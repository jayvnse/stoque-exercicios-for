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
public class exer2 {
    /* Faça um programa que receba dois números inteiros e imprima quais os
    números inteiros no intervalo entre eles */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();
        
        for ( ;num1<=num2; num1++){
            System.out.println(num1);
        }
        
        /*for (int i = num1; i<=num2; i++){
            System.out.println(i);
        }*/
    }
}
