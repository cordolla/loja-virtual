package View;

import java.util.Scanner;

public class PrintMenu {
    public int exibirMenu() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("\n1 - Cadastrar produto");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Listar produtos Disponíveis");
            System.out.println("4 - Listar cliente cadastrados");
            System.out.println("5 - Realizar compra");
            System.out.println("6 - Exibir historico de compras de um cliente");
            System.out.println("Sair");

            if (!in.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número.");
                in.nextLine();
                continue;
            }
            return Integer.parseInt(in.nextLine());
        }
    }
}
