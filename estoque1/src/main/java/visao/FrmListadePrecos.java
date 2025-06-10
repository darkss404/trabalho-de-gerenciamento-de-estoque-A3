package visao;

import java.sql.SQLException;
import dao.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class FrmListadePrecos extends javax.swing.JFrame {

    public FrmListadePrecos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) JBTabela.getModel();
        JBTabela.setRowSorter(new javax.swing.table.TableRowSorter<>(modelo));
        preencherTabela();
    }

    private void preencherTabela() {
        try {
            ProdutoDao dao = new ProdutoDao();
            List<Produto> produtos = dao.listar();

            DefaultTableModel model = (DefaultTableModel) JBTabela.getModel();
            model.setRowCount(0);

            for (Produto p : produtos) {
                model.addRow(new Object[]{
                    p.getNome(),
                    p.getValorUnitario(),
                    p.getUnidade(),
                    p.getCategoria().getNome()
                    
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher tabela: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JBTabela = new javax.swing.JTable();
        JBVoltar = new javax.swing.JButton();
        excluirListaDePrecos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Valor Unitário", "Unidade", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(JBTabela);

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        excluirListaDePrecos.setText("Excluir");
        excluirListaDePrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirListaDePrecosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(excluirListaDePrecos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirListaDePrecos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(JBVoltar)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(636, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        FrmTelaInicial objeto = new FrmTelaInicial();
        objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void excluirListaDePrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirListaDePrecosActionPerformed
        // TODO add your handling code here:
         int linha = JBTabela.getSelectedRow();

    if (linha == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um produto para excluir.");
        return;
    }

    // Supondo que a coluna do nome é a 0
    String nomeProduto = JBTabela.getValueAt(linha, 0).toString();

    try {
        ProdutoDao dao = new ProdutoDao();

        // Buscar o ID pelo nome (alternativa provisória)
        List<Produto> lista = dao.listar();
        for (Produto p : lista) {
            if (p.getNome().equals(nomeProduto)) {
                dao.desativar(p.getId());
                break;
            }
        }

        JOptionPane.showMessageDialog(this, "Produto excluído com sucesso.");
        preencherTabela(); // recarrega os produtos ativos
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir produto: " + ex.getMessage());
    }
    }//GEN-LAST:event_excluirListaDePrecosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListadePrecos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JBTabela;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JButton excluirListaDePrecos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
