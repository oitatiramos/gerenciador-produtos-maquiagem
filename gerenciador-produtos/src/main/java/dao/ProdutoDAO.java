package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDAO {

    public boolean incluir(Produto produto) {
        boolean status = false;
        Connection cnx = Dao.getConexao();
       
        String SQL = "INSERT INTO produtos(nome, categoria, preco) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(SQL);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getCategoria());
            ps.setDouble(3, produto.getPreco());
            int x = ps.executeUpdate();
            status = x > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        Connection cnx = Dao.getConexao();
       
        String SQL = "SELECT * FROM produtos";
        try {
            PreparedStatement ps = cnx.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setPreco(rs.getDouble("preco"));
                lista.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}