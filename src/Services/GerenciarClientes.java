package Services;

import Model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarClientes {
    private static final List<Cliente> listaClientes = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public void cadastrarCliente() {
        System.out.println("Digite o nome do cliente");
        String nomeCliente = in.nextLine();

        System.out.println("Digite o cpf do cliente");
        Long cpfCliente = in.nextLong();

        in.nextLine();

        System.out.println("Digite o email do cliente");
        String emailCliente = in.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);
        listaClientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso");
    }

    public static void listarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("não tem nenhum cliente cadastrado");
        } else {
            System.out.println("\nLista de Clientes");
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
}
