package com.priscila.cursojava.aula13.labs;

import java.util.Scanner;

// Faça um Programa que peça um número e então mostre a mensagem (O número informado foi [número]).

public class Exer02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); // importa a classe Scanner para ler o que o usuário digitar
        
        System.out.println("Entre com um número inteiro:");
        int numero = scan.nextInt(); // lê o que o usuário digitar e armazena na variável numero
        System.out.println("O número information foi: " + numero); // imprime na tela o que o usuário digitou
    }
}
