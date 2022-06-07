package aula1;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        /*Um programa que recebe dois números (inicial e final) e mostre:
        a quantidade de números inteiros dentro do intervalo,
        a soma, a média deles, e a quantidade de números pares.
        */

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero");
        num1 = sc.nextInt();

        System.out.println("Entre com o segundo numero");
        num2 = sc.nextInt();

        mostrarIntervalo(num1, num2);
        mostrarSoma(num1, num2);
        mostrarMedia(num1, num2);
        mostrarQtdPares(num1, num2);
    }

    private static void mostrarQtdPares(int num1, int num2) {
        int maior, menor;

        if (num1 > num2) {
            maior = num1;
            menor = num2 + 1;
        }
        else {
            menor = num1 + 1;
            maior = num2;
        }

        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void mostrarMedia(int num1, int num2) {
        System.out.println((num1 + num2) / 2);
    }

    private static void mostrarSoma(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void mostrarIntervalo(int num1, int num2) {
        int maior, menor;

        if (num1 > num2) {
            maior = num1;
            menor = num2 + 1;
        }
        else {
            menor = num1 + 1;
            maior = num2;
        }

        while (menor < maior) {
            System.out.println(menor);
            menor++;
        }
    }
}
