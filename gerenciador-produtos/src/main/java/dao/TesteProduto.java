package dao;

import java.util.List;
import java.util.Scanner;

import model.Produto;
import service.ProdutoService;

public class TesteProduto {

    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();

        // Listar todos os produtos
        System.out.println("Lista de produtos disponíveis:");
        List<Produto> lista = service.listar();
        for (Produto p : lista) {
            System.out.println(p);
        }

        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Adicionar novo produto
        System.out.println("Vamos adicionar um novo produto.");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a categoria do produto: ");
        String categoria = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        Produto novoProduto = new Produto();
        novoProduto.setNome(nome);
        novoProduto.setCategoria(categoria);
        novoProduto.setPreco(preco);

        if (service.incluirProduto(novoProduto)) {
            System.out.println("Produto incluído com sucesso!");
        } else {
            System.out.println("Erro ao incluir o produto.");
        }

        System.out.println("--------------------------------------");

        // Listar novamente para verificar a inclusão
        System.out.println("Lista de produtos atualizada:");
        lista = service.listar();
        for (Produto p : lista) {
            System.out.println(p);
        }

        scanner.close();
    }
}
