package service;

import java.util.List;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {
    public boolean incluirProduto(Produto produto) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.incluir(produto);
    }

    public List<Produto> listar() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.listar();
    }
}