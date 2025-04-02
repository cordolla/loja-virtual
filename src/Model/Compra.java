package Model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private final List<Produto> produtos;

    public Compra() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "produtos=" + produtos +
                '}';
    }
}
