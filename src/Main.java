
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = {
                new Televisao(),
                new Radio(),
                new Videogame(),
                new Tablet(),
                new Celular()
        };

        Produto[] compras = new Produto[1000];
        int[] quantidades = new int[1000];

        int totalCompras = 0;
        int opcao;

        System.out.println("=====================================");
        System.out.println(" BEM-VINDO À LOJA DE ELETRÔNICOS!");
        System.out.println("=====================================");

        do {
            System.out.println("\n========== MENU DE PRODUTOS ==========");

            for (int i = 0; i < produtos.length; i++) {
                System.out.print((i + 1) + " - ");
                produtos[i].exibirInformacoes();
            }

            System.out.println("0 - Finalizar Compra");

            System.out.print("\nEscolha um produto: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao < 1 || opcao > produtos.length) {
                System.out.println("Produto inválido! Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade desejada: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Quantidade inválida!");
                scanner.next();
                continue;
            }

            int quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero!");
                continue;
            }

            if (totalCompras >= compras.length) {
                System.out.println("Limite de itens atingido!");
                continue;
            }

            compras[totalCompras] = produtos[opcao - 1];
            quantidades[totalCompras] = quantidade;

            totalCompras++;

            System.out.println("Produto adicionado ao carrinho!");

        } while (true);

        // Finalização da compra

        System.out.println("\n=====================================");
        System.out.println("          RESUMO DA COMPRA");
        System.out.println("=====================================");

        double valorTotal = 0;

        if (totalCompras == 0) {
            System.out.println("Nenhum produto foi comprado.");
        }

        for (int i = 0; i < totalCompras; i++) {

            Produto produto = compras[i];
            int quantidade = quantidades[i];

            double subtotal = produto.getPreco() * quantidade;

            System.out.println("\nProduto: " + produto.getNome());
            System.out.println("Quantidade: " + quantidade);

            System.out.printf("Preço unitário: R$ %.2f%n",
                    produto.getPreco());

            System.out.printf("Subtotal: R$ %.2f%n", subtotal);

            valorTotal += subtotal;
        }

        System.out.println("\n=====================================");
        System.out.printf("VALOR TOTAL: R$ %.2f%n", valorTotal);
        System.out.println("=====================================");
        System.out.println("Obrigado por comprar conosco!");

        scanner.close();
    }
}
