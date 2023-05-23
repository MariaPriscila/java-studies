package com.priscila.cursojava.aula13.labs;


//        Faça um programa para uma loja de tintas. O programa deverá pedir o
//        tamanho em metros quadrados da área a ser pintada. Considere que a
//        cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//        tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//        usuário a quantidades de latas de tinta a serem compradas e o preço
//        total.


import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho da área em emtros quadrados que deverá ser pintada:");
        double area = scan.nextDouble();

        double litrosTinta = 18;
        double precoLata = 80;
        double metrosQuadrados = area;

        double qtdLatas = metrosQuadrados / litrosTinta;
        double precoTotal = qtdLatas * precoLata;

        System.out.println("Quantidade de latas: " + qtdLatas);
        System.out.println("Preço total: " + precoTotal);
    }
}


