package com.priscila.cursojava.aula13.labs;

import java.util.Scanner;


//        Tendo como dados de entrada a altura e o sexo de uma pessoa,
//        construa um algoritmo que calcule seu peso ideal, utilizando as
//        seguintes fórmulas:
//        . Para homens: (72.7*h) - 58
//        a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//        b. Peça o peso da pessoa e informe se ela está dentro, acima ou
//        abaixo do peso


public class Exer13 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a altura: ");
        double altura = scan.nextDouble();

        System.out.println("Entre com o sexo: ");
        String sexo = scan.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("f")){
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }

        System.out.println("Peso ideal: " + pesoIdeal);

    }
}
