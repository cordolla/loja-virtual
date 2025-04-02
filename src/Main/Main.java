package Main;

import Services.GerenciarClientes;
import Services.GerenciarCompras;
import Services.GerenciarProdutos;
import View.PrintMenu;

public class Main {
    public static void main(String[] args) {
        PrintMenu printMenu = new PrintMenu();
        int numeroEscolhido = printMenu.exibirMenu();
        GerenciarProdutos novoProduto = new GerenciarProdutos();
        GerenciarClientes novoCliente = new GerenciarClientes();
        GerenciarCompras novaCompra = new GerenciarCompras();

        do {
            if (numeroEscolhido == 1) {
                novoProduto.cadastrarProduto();
                GerenciarProdutos.listarProdutos();
            }
            if (numeroEscolhido == 2) {
                novoCliente.cadastrarCliente();
                GerenciarClientes.listarClientes();
            }
            if (numeroEscolhido == 3) {
                GerenciarProdutos.listarProdutos();
            }
            if (numeroEscolhido == 4) {
                GerenciarClientes.listarClientes();
            }
            if (numeroEscolhido == 5) {
                novaCompra.realizarCompra();
            }
            if (numeroEscolhido == 6) {
                novaCompra.mostrarCompraCliente();
            }
            numeroEscolhido = printMenu.exibirMenu();
        } while (numeroEscolhido != 7);
    }
}
