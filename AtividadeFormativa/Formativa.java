package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Formativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Digite o numeros de colunas");
        int colunas = sc.nextInt();
        System.out.println("Digite o numeros de linhas");
        int linhas = sc.nextInt();
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < linhas; i++) {
            System.out.print("| ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");

        }
        System.out.println("  ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = rd.nextInt(9);

                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }

            }

        }
        for (int i = 0; i < linhas; i++) {
            System.out.print("| ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");

        }

    }

    public void exercicio2() {

        int nSorteado = rd.nextInt(1000);
        int nDigitado;
        System.out.println("Digite um numero");
        nDigitado = sc.nextInt();
        int contador = 1;
        while (nSorteado != nDigitado) {
            if (nDigitado > nSorteado) {
                System.out.println("Voçê digitou um numero maior ");
                System.out.println("Digite um novo numero MENOR ");
                nDigitado=sc.nextInt();
               
            } if(nDigitado<nSorteado) {
                System.out.println("Voçê digitou um numero menor ");
                System.out.println("Digite um novo numero MAIOR ");
                nDigitado=sc.nextInt();
                
            }
            contador++;
        }
        if (nSorteado == nDigitado) {
            System.out.println("Voçê acertou o numero com um total de " + contador + " tentativas");
        }
    }
    public void exercicio3() {
        int nPar =0;
        int nImpar=0;
   
        int tVetor=rd.nextInt(100,1000);
        int vetor[]=new int[tVetor];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;
            
        
        }
     for (int i = 0; i < vetor.length; i++) {
        if (vetor[i]%2==0){
            System.out.println("numetos pares "+vetor[i]);
            for (int j = 0; j < vetor.length; i++) {
                if (vetor[j]%1==0){
                    System.out.println("numetos impares "+vetor[j]);
                }
        }
        
     }
    }
}}
