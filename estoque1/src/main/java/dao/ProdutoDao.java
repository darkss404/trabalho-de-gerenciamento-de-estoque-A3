/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import modelo.Categoria;

public class ProdutoDao {

    private final CategoriaDao categoriaDAO = new CategoriaDao();

    public void inserir(Produto p) throws SQLException {
        String sql = "INSERT INTO produtos (nome, unidade, valor_unitario, qtd_min, qtd_max, qtd_atual, id_categoria) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DB.get(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getUnidade());
            ps.setBigDecimal(3, p.getValorUnitario());
            ps.setInt(4, p.getQtdMin());
            ps.setInt(5, p.getQtdMax());
            ps.setInt(6, p.getQtdAtual());
            ps.setInt(7, p.getCategoria().getId());
            ps.executeUpdate();
        }
    }

    public List<Produto> listar() throws SQLException {
        String sql = "SELECT * FROM produtos";
        List<Produto> lista = new ArrayList<>();

        try (Connection conn = DB.get(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Categoria cat = categoriaDAO.buscarPorId(rs.getInt("id_categoria"));

                Produto p = new Produto(
                        rs.getString("nome"), rs.getInt("id"),
                        rs.getString("unidade"),
                        rs.getInt("qtd_min"),
                        rs.getInt("qtd_max"),
                        rs.getInt("qtd_atual")
                );
                lista.add(p);
            }
        }
        return lista;
    }

    public void atualizar(Produto p) throws SQLException {
        String sql = "UPDATE produtos SET nome=?, unidade=?, valor_unitario=?, qtd_min=?, qtd_max=?, qtd_atual=?, id_categoria=? "
                + "WHERE id=?";
        try (Connection conn = DB.get(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getUnidade());
            ps.setBigDecimal(3, p.getValorUnitario());
            ps.setInt(4, p.getQtdMin());
            ps.setInt(5, p.getQtdMax());
            ps.setInt(6, p.getQtdAtual());
            ps.setInt(7, p.getCategoria().getId());
            ps.setInt(8, p.getId());
            ps.executeUpdate();
        }
    }

    public void remover(int id) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id=?";
        try (Connection conn = DB.get(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
