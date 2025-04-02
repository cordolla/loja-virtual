package Services;

import Model.Cliente;
import Model.Compra;
import Model.Produto;

import java.util.List;
import java.util.Scanner;

public class GerenciarCompras {
    private final Scanner in = new Scanner(System.in);

    public void realizarCompra() {
        Cliente cliente = selecionarCliente();
        if (cliente == null) return;

        Compra compra = new Compra();

        while (true) {
            Produto produto = selecionarProduto();
            if (produto == null) {
                System.out.println("Finalizando seleção de produtos...");
                break;
            }
            compra.adicionarProduto(produto);
            System.out.println(produto.getNome() + " adicionado à compra!");
        }

        if (!compra.getProdutos().isEmpty()) {
            cliente.adicionarCompra(compra);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Nenhum produto foi adicionado. Voltando ao menu...");
        }
    }

    public void mostrarCompraCliente() {
        Cliente cliente = selecionarCliente();
        if (cliente == null) return;

        System.out.println("\nCompra de " + cliente.getNome() + ":");
        if (cliente.getCompras().isEmpty()) {
            System.out.println("nenhuma compra realizada");
        } else {
            for (int i = 0; i < cliente.getCompras().size(); i++) {
                System.out.println("\nCompra " + (i + 1) + ":");
                System.out.println(cliente.getCompras().get(i));
            }
        }

    }


    private Cliente selecionarCliente() {
        List<Cliente> clientes = GerenciarClientes.getListaClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return null;
        }

        System.out.println("Escolha um cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + " - " + clientes.get(i).getNome());
        }

        System.out.print("\nDigite o número do cliente: ");
        int opcao = in.nextInt();
        in.nextLine();

        if (opcao < 1 || opcao > clientes.size()) {
            System.out.println("Opção inválida.");
            return null;
        }

        return clientes.get(opcao - 1);
    }

    private Produto selecionarProduto() {
        List<Produto> produtos = GerenciarProdutos.getListaProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return null;
        }

        while (true) {
            System.out.println("Escolha um produto (ou 0 para finalizar):");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + " - " + produtos.get(i));
            }
            int opcao = in.nextInt();

            if (opcao == 0) return null;
            if (opcao >= 1 && opcao <= produtos.size()) {
                return produtos.get(opcao - 1);
            }

            System.out.println("Opção inválida. Tente novamente.");
        }
    }


}
