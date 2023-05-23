package com.priscila.cursojava.aula11;

public class CuriosidadeInt {
    public static void main(String[] args) {

        int var1 = 2147483647; //o java volta e retorna -2147483648 mesmo que o valor seja maior que o limite nao da erro

        int var2 = 1;

        System.out.println(var1 + var2);

        //-2147483648
        //-2147483648
    }
}
