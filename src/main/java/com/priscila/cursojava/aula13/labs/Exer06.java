package com.priscila.cursojava.aula13.labs;

import java.util.Scanner;

// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Exer06 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o raio do círculo:");
        double raio = scan.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A área do círculo é: " + area);
    }
}
