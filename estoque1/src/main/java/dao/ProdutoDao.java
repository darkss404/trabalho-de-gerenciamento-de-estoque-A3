package dao;

import modelo.Produto;
import modelo.Categoria;
import java.sql.*;
import java.util.*;

public class ProdutoDao {

    private final CategoriaDao categoriaDAO = new CategoriaDao();

    public void inserir(Produto p) throws SQLException {
        String sql = "INSERT INTO produtos (nome, unidade, valor_unitario, qtd_min, qtd_max, qtd_atual, id_categoria) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DB.get(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getUnidade());
            ps.setDouble(3, p.getValorUnitario());
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
                int idCategoria = rs.getInt("id_categoria");
                Categoria cat = categoriaDAO.buscarPorId(idCategoria);

                Produto p = new Produto(
                        rs.getString("nome"),
                        rs.getString("unidade"),
                        rs.getDouble("valor_unitario"),
                        rs.getInt("qtd_min"),
                        rs.getInt("qtd_max"),
                        rs.getInt("qtd_atual"),
                        cat
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
            ps.setDouble(3, p.getValorUnitario());
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
