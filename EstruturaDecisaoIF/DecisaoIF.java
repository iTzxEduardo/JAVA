package EstruturaDecisaoIF;

import java.util.Scanner;

public class DecisaoIF {
    Scanner sc = new Scanner(System.in);

    public void calcularDescontoIF() {
        System.out.println("Informe o valor do Produto");
        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (precoProduto >= 100 && precoProduto < 200) { // Estrutura de desisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
        }
        if (precoProduto >= 200 && precoProduto < 300) {
            percentualDesconto = 10.0;
        }
        if (precoProduto >= 300) {
            percentualDesconto = 15.0;
        }
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
    }

    // Decisão IF Encadeada
    public void DecisaoIfElse() {
        System.out.println("Informe o Valor do Produto");
        double precoProduto = sc.nextDouble();
        double percentualDesconto;
        // Estrutura de Decição
        if (precoProduto >= 300) {
            percentualDesconto = 15.0;

        } else if (precoProduto >= 200) {
            percentualDesconto = 10.0;

        } else if (precoProduto >= 100) {
            percentualDesconto = 5.0;
        }

        else {
            percentualDesconto = 0.0;
        }
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
    }

}
