package com.priscila.cursojava.aula13.labs;

//         Faça um Programa para uma loja de tintas. O programa deverá pedir o
//         tamanho em metros quadrados da área a ser pintada.
//
//         Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
//         e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou
//         em galões de 3,6 litros, que custam R$ 25,00.
//         o Informe ao usuário as quantidades de tinta a serem compradas
//         e os respectivos preços em 3 situações:
//         o comprar apenas latas de 18 litros;
//         o comprar apenas galões de 3,6 litros;
//         o misturar latas e galões, de forma que o preço seja o
//         menor. Acrescente 10% de folga e sempre arredonde os
//         valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class Exer17 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho da área em metros quadrados que deverá ser pintada:");
        double area = scan.nextDouble();

        double metroQuadradoPorLitro = 6;

        double litrosLata = 18; //valor por litro sai a 4.44
        double litrosGalao = 3.6; //valor por litro sai a 6.94
        int precoLata = 80;
        int precoGalao = 25;
        double metrosQuadrados = area;

        double litrosUsados = metrosQuadrados / metroQuadradoPorLitro * 1.1;

        int qtdLatas = (int)Math.ceil(litrosUsados / litrosLata); //cast converte para inteiro
        int qtdGaloes = (int)Math.ceil(litrosUsados / litrosGalao);

        int precoTotalLatas = qtdLatas * precoLata;
        int precoTotalGaloes = qtdGaloes * precoGalao;

        System.out.println("Quantidade de latas: " + qtdLatas);
        System.out.println("Preço total: " + precoTotalLatas);

        System.out.println("Quantidade de galões: " + qtdGaloes);
        System.out.println("Preço total: " + precoTotalGaloes);


        // misturando latas e galões

        int qtdLatasMistas = 0;
        int qtdGaloesMistos = 0;

        //até que ponto é mais benefico comprar latas

        while (metrosQuadrados > 0){
            if (metrosQuadrados > 64.8){
                metrosQuadrados -= 108;
                qtdLatasMistas++;
            } else {
                qtdGaloesMistos += (int)Math.ceil(metrosQuadrados / 21.6);
                break;
            }
        }

        System.out.println("Quantidade de latas misturadas: " + qtdLatasMistas);
        System.out.println("Quantidade de galões misturadas: " + qtdGaloesMistos);
        System.out.println("Preço total: " + (qtdLatasMistas * precoLata + qtdGaloesMistos * precoGalao));
    }
}
