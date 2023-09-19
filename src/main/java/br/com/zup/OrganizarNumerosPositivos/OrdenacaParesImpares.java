package br.com.zup.OrganizarNumerosPositivos;

import java.util.*;

public class OrdenacaParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Instruções: ");
        System.out.println("Digite um numero, aperte a tecla enter.");
        System.out.println("Após colocar, a quantidade que quiser, digite -1 para encerrar e ver a mágica acontecer.");
        System.out.println("Digite valores inteiros não negativos: ");

        int valor;
        do {
            valor = scanner.nextInt();
            if (valor >= 0) {
                if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }
        } while (valor != -1);
        scanner.close();

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Pares em ordem crescente: " + pares);
        System.out.println("Impares em ordem decrescente: " + impares);
    }
}
