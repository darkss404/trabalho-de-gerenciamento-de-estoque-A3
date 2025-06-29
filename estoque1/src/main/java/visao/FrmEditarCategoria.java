package visao;

import dao.CategoriaDao;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class FrmEditarCategoria extends javax.swing.JFrame {

    public FrmEditarCategoria() {
        initComponents();
    }

    private void carregarTabela() {
        try {
            CategoriaDao dao = new CategoriaDao();
            List<Categoria> lista = dao.listar();

            DefaultTableModel model = (DefaultTableModel) TabelaCategorias.getModel();
            model.setRowCount(0);

            for (Categoria c : lista) {
                System.out.println("Carregando: ID=" + c.getId() + ", Nome=" + c.getNome());
                model.addRow(new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getTamanho(),
                    c.getEmbalagem()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCategorias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFTamanho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFEmbalagem = new javax.swing.JTextField();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TabelaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tamanho", "Embalagem"
            }
        ));
        TabelaCategorias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaCategorias);

        jLabel1.setText("Nome:");

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamanho:");

        jLabel3.setText("Embalagem:");

        JTFEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEmbalagemActionPerformed(evt);
            }
        });

        JBAlterar.setText("Salvar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar Categoria");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBAlterar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JBApagar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFEmbalagem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFTamanho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar)
                    .addComponent(JBVoltar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(498, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarTabela();
        TabelaCategorias.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                int linhaSelecionada = TabelaCategorias.getSelectedRow();
                if (linhaSelecionada >= 0) {
                    JTFNome.setText(TabelaCategorias.getValueAt(linhaSelecionada, 1).toString());
                    JTFTamanho.setText(TabelaCategorias.getValueAt(linhaSelecionada, 2).toString());
                    JTFEmbalagem.setText(TabelaCategorias.getValueAt(linhaSelecionada, 3).toString());
                }
            }
        });

    }//GEN-LAST:event_formWindowOpened

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int linhaSelecionada = TabelaCategorias.getSelectedRow();
        if (linhaSelecionada >= 0) {
            try {
                int id = (int) TabelaCategorias.getValueAt(linhaSelecionada, 0);
                String nome = JTFNome.getText();
                String tamanho = JTFTamanho.getText();
                String embalagem = JTFEmbalagem.getText();

                Categoria categoria = new Categoria(id, nome, tamanho, embalagem);

                CategoriaDao dao = new CategoriaDao();
                dao.atualizar(categoria);

                JOptionPane.showMessageDialog(this, "Categoria atualizada com sucesso!");
                carregarTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para alterar.");
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JTFEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEmbalagemActionPerformed

    }//GEN-LAST:event_JTFEmbalagemActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        int linhaSelecionada = TabelaCategorias.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja excluir esta categoria?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    int id = (int) TabelaCategorias.getValueAt(linhaSelecionada, 0);
                    CategoriaDao dao = new CategoriaDao();
                    dao.remover(id);

                    JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!");
                    carregarTabela();
                    limparCampos();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para excluir.");
        }

        FrmTelaInicial objeto = new FrmTelaInicial();
        objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        FrmTelaInicial objeto = new FrmTelaInicial();
        objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFEmbalagem;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTamanho;
    private javax.swing.JTable TabelaCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        JTFNome.setText("");
        JTFTamanho.setText("");
        JTFEmbalagem.setText("");
    }

}
