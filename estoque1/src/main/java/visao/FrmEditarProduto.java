package visao;

import dao.DB;
import dao.ProdutoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Categoria;
import modelo.Produto;


public class FrmEditarProduto extends javax.swing.JFrame {

    private Produto produtoSelecionado;
    private Object jTextField3;

    
    public FrmEditarProduto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        voltarEditarProduto = new javax.swing.JButton();
        JTFCategoria = new javax.swing.JTextField();
        JTFValor = new javax.swing.JTextField();
        JTFQtMax = new javax.swing.JTextField();
        JTFQtMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFQtEst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFUnidade = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        JTFId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLId.setText("Id:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Valor Unitário:");

        jLabel6.setText("Qt. Max:");

        jLabel7.setText("Qt. Min:");

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        voltarEditarProduto.setText("Voltar");
        voltarEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarEditarProdutoActionPerformed(evt);
            }
        });

        JTFCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCategoriaActionPerformed(evt);
            }
        });

        JTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Qt. Est:");

        jLabel2.setText("Unidade");

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarEditarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBApagar)
                        .addGap(18, 18, 18)
                        .addComponent(JBAlterar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFQtEst, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(JTFUnidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(JTFQtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(JTFQtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFId)
                                    .addComponent(JTFCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBBuscar)
                    .addComponent(JLId)
                    .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFQtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFQtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFQtEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar)
                    .addComponent(voltarEditarProduto))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(466, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
     try {
        int id = Integer.parseInt(JTFId.getText());
        
        // Certifique-se de que este campo JTFNome EXISTE no seu formulário!
        String nome = JTFId.getText(); 

        String unidade = JTFUnidade.getText();
        double valor = Double.parseDouble(JTFValor.getText());
        int qtMax = Integer.parseInt(JTFQtMax.getText());
        int qtMin = Integer.parseInt(JTFQtMin.getText());
        int qtEst = Integer.parseInt(JTFQtEst.getText());
        String nomeCategoria = JTFCategoria.getText();

        // Criação da categoria com apenas o nome
        Categoria categoria = new Categoria(nomeCategoria); 

        // Criação do produto com os dados coletados
        Produto produto = new Produto(id, nome, unidade, valor, qtMin, qtMax, qtEst, categoria);

        // Atualização do produto
        ProdutoDAO dao = new ProdutoDAO();
        dao.atualizar(produto);

        JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro ao converter valores numéricos. Verifique os campos!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar o produto: " + e.getMessage());
    }

    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JTFCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCategoriaActionPerformed
    JTFValor.requestFocus();
    }//GEN-LAST:event_JTFCategoriaActionPerformed

    private void JTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorActionPerformed
    JTFQtEst.requestFocus();
    }//GEN-LAST:event_JTFValorActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
    int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

    if (opcao == JOptionPane.YES_OPTION) {
        int id = Integer.parseInt(JTFId.getText());
        ProdutoDAO dao = new ProdutoDAO();
        dao.excluir(id);

        JOptionPane.showMessageDialog(this, "Produto excluído.");
        this.dispose(); // Fecha tela
    }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void voltarEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarEditarProdutoActionPerformed
        new visao.FrmTelaInicial().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_voltarEditarProdutoActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
         try {
        int id = Integer.parseInt(JTFId.getText());
        ProdutoDao dao = new ProdutoDao();
        produtoSelecionado = dao.buscarPorId(id);
        if (produtoSelecionado != null) {
            JTFId.setText(produtoSelecionado.getNome());
            JTFCategoria.setText(produtoSelecionado.getCategoria().getNome());
        } else {
            JOptionPane.showMessageDialog(this, "Produto não encontrado.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
    }//GEN-LAST:event_JBBuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JLabel JLId;
    private javax.swing.JTextField JTFCategoria;
    private javax.swing.JTextField JTFId;
    private javax.swing.JTextField JTFQtEst;
    private javax.swing.JTextField JTFQtMax;
    private javax.swing.JTextField JTFQtMin;
    private javax.swing.JTextField JTFUnidade;
    private javax.swing.JTextField JTFValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton voltarEditarProduto;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class ProdutoDAO {

        public ProdutoDAO() {
        }

        private void atualizar(Produto produto) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void excluir(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Produto buscarPorId(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
