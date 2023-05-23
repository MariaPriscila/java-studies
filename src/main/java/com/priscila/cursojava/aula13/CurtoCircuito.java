package com.priscila.cursojava.aula13;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & // & = AND a diferença é que o & não faz curto-circuito
                verdadeiro;
        boolean resultado2 = falso && // && = AND curto-circuito
                verdadeiro;
        //curto circuito = se o primeiro valor já for suficiente para definir o resultado, o segundo valor não é avaliado
        System.out.println(resultado1);
        System.out.println(resultado2);


        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }
}
