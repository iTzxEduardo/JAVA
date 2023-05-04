package InteracaoFor;

import java.util.Scanner;

import javax.swing.plaf.ViewportUI;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o nº da interação é " + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];// criando o vetor 10 posições
        // preenchendo o vetor com for
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor mais [" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        // imprimeir o vetor na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.print("Vetor [" + i + "]=" + vetor[i]);
        }

    }

    public void exemplo44() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        int contConsoante = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {
                System.out.println(letras[i] + "vogal");
            } else {
                System.out.println(letras[i] + "consoante");
                contConsoante++;
            }
        }

    }// contando as consoantes de uma palavra

    public void exemplo444() {
        System.out.println("Digite uma Palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        // ler a palavra letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + "vogal");
            } else {
                System.out.println(c + "consoante");
                contConsoante++;
            }
        }

    }

    public void exemplo555() {
        // ler um vetor de20º e determinar Impares e Pares
        // gardar dentro de outros vetores
        int nuemros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;
        int contImpar = 0;
        for (int i = 0; i < nuemros.length; i++) {
            if (nuemros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        // criar os vetores Par e Impar
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < nuemros.length; i++) {
            if (nuemros[i] % 2 == 0) {
                nPar[contPar] = nuemros[i];
                contPar++;// atribui elementos do vetor n}
                // a posição diferente no vetore nPar
            } else {
                nImpar[contImpar] = nuemros[i];
                contImpar++;
            }

        }
        for (int i = 0; i < nuemros.length; i++) {
            System.out.println("vetorPar[" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nuemros.length; i++) {
            System.out.println("vetorImpar[" + i + "]=" + nImpar[i]);
        }
    }

    public void exemplo3() {
        // carrinho de compras
        double valorFinal = 0;
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            // imprimir valor parcial da compra
            System.out.println(" o valor parcial da compra: R$ " + valorFinal);
        }
        // mostras o valor final da compra
        System.out.println(" o valor da compra é R$ " + valorFinal);

    }

    public void exemplo4() {
        // ler 4 notas e mostras as 4 notas e a média
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota " + (+i + 1) + ".");
            vetorNotas[i] = sc.nextDouble();
        }
        // imprimir as 4 notas e calcular a nédia
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "ª Nota é " + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.println("A média do aluno é " + mediaNotas);
    }

    public void exemplo5() {
        // ler 4 notas de 10 alunos
        // vetor para criar as medias
        double vetorMedia[] = new double[10];
        // preencher o vetor de médias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (+j + 1) + " Aluno " + (i + 1) + ":");
                notas += sc.nextDouble();
            }
            notas /= 4;
            vetorMedia[i] = notas;// colocar media no vetor
        }

        // imprimir notas >=7 do vetor medias
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A media do Aluno " + (i + 1) + " é " + vetorMedia[i]);
            }
        }
    }

    public void exemplo6() {
        double altura[] = new double[5];
        for (int i = 4; i >= 0; i--) {
            System.out.print("Digite sua altura ");
            altura[i] = sc.nextDouble();
            double idade = 0;
            for (int j = 4; j >= 0; j--) {
                System.out.println("Digite sua idade ");
                idade += sc.nextDouble();
            }
            System.out.println("Altura " + altura);
            System.out.println("Idade" + idade);
        }
    }

    public void exemplo7() {

    }
}
