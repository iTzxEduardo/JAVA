package Matriz;

import java.util.Scanner;
import java.util.Random;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar uma matriz 10x9,preencher,imprimir e manipular
        // declarar a mariz
        int matriz[][] = new int[10][9];// 10 linhas x 9 colunas
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        // mostrar a minha matriz(imprimir)posição por posição
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);

            }

        }
        // imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("|");
        }
        int somaLinha = 0;
        for (int i = 0; i < 10; i++) {

            somaLinha += matriz[3][i];
        }
        System.out.println("+++++++++++++++++");
        System.out.println("Soma da 4ª Linha é " + somaLinha);
        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];

        }
        System.out.println("+++++++++++++++++");
        System.out.println("Soma da 4ª Coluna é " + somaColuna);
    }

    int a = 0;

    public void exemplo2() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
           
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("|");
            fori
        }
    }

}