package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private final Long cpf;
    private final String email;
    private final List<Compra> compras;

    public Cliente(String nome, Long cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.compras = new ArrayList<>();

    }

    public void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    public String getNome() {
        return nome;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "nome: " + nome +
                ", cpf: " + cpf +
                ", email: " + email;
    }
}
