package Services;

import Model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {
    private static final List<Produto> listaProdutos = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public static List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = in.nextLine();

        System.out.println("Digite o valor do produto ");
        double valorProduto = in.nextDouble();

        in.nextLine();

        Produto produto = new Produto(nomeProduto, valorProduto);
        listaProdutos.add(produto);

        System.out.println("Produto adicionado com sucesso");
    }

    public static void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("nenhum produto adicionado");
        } else {
            System.out.println("\nLista de Produtos");
            for (Produto p : listaProdutos) {
                System.out.println("- " + p);
            }
        }
    }
}
