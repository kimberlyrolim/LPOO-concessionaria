package view;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Venda;
import model.dao.VendaDAO;

/**
 *
 * @author vanessalagomachado
 */
public class ListaVendas extends javax.swing.JFrame {

    VendaDAO dao;

    public ListaVendas() {
        initComponents();
        dao = new VendaDAO();
        loadVendas();
    }

     public void loadVendas() {

        DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();
        modelo.setNumRows(0);
        
        if (dao.listaVendas() != null) {
            for (Venda obj : dao.listaVendas()) {
                Object[] linha = {
                    obj, 
                    obj.getVeiculo(), 
                    obj.getCliente(),
                    obj.getValorVenda() 
                };
                modelo.addRow(linha);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        areaBusca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnAction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Vendas Cadastradas");

        javax.swing.GroupLayout areaBuscaLayout = new javax.swing.GroupLayout(areaBusca);
        areaBusca.setLayout(areaBuscaLayout);
        areaBuscaLayout.setHorizontalGroup(
            areaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        areaBuscaLayout.setVerticalGroup(
            areaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data Venda", "Veículo", "Cliente", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnInfo.setText("Mais Informações");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnAction.setText("Ação Automática");
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(areaBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnInfo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnAction)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnInfo)
                    .addComponent(btnEditar))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAction)
                    .addComponent(btnRemover))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        CadastroVendaJD telaVenda = new CadastroVendaJD(this, rootPaneCheckingEnabled);
        telaVenda.setVisible(true);

        Venda novoObj = telaVenda.getVenda();

        if (novoObj != null) {
            try {
                dao.persist(novoObj);
                loadVendas();
            } catch (Exception ex) {
                System.err.println("Erro ao salvar nova Venda: " + novoObj + "\n Erro: " + ex);
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar Venda: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblVendas.getSelectedRow() != -1) {
            Venda obj_venda = (Venda) tblVendas.getModel().getValueAt(tblVendas.getSelectedRow(), 0);
            
            CadastroVendaJD telaEdicao = new CadastroVendaJD(this, rootPaneCheckingEnabled);
            telaEdicao.setVenda(obj_venda);

            telaEdicao.setVisible(true);
            
            Venda vendaEditada = telaEdicao.getVenda();

            if (vendaEditada != null) {
                try {
                    dao.persist(vendaEditada); 
                    loadVendas(); 
                } catch (Exception ex) {
                    System.err.println("Erro ao editar venda\n Erro: " + ex);
                    JOptionPane.showMessageDialog(rootPane, "Erro ao editar Venda: " + ex.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma venda para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tblVendas.getSelectedRow() != -1) {
            Venda obj_venda = (Venda) tblVendas.getModel().getValueAt(tblVendas.getSelectedRow(), 0);
            int op_remover = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover a venda selecionada?", "Confirmar Remoção", JOptionPane.YES_NO_OPTION);
            if (op_remover == JOptionPane.YES_OPTION) {
                try {
                    dao.remover(obj_venda); 
                } catch (Exception ex) {
                    System.out.println("Erro ao remover venda " + obj_venda + "\n Erro: " + ex);
                    JOptionPane.showMessageDialog(rootPane, "Erro ao remover Venda: " + ex.getMessage());
                }
                JOptionPane.showMessageDialog(rootPane, "Venda removida com sucesso... ");
                loadVendas(); 
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma venda para remover");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        if (tblVendas.getSelectedRow() != -1) {
            Venda obj_venda = (Venda) tblVendas.getModel().getValueAt(tblVendas.getSelectedRow(), 0);
            JOptionPane.showMessageDialog(rootPane, obj_venda.exibirDados(), "Detalhes da Venda", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma venda para ver os detalhes");
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
                // 
    }//GEN-LAST:event_btnActionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBusca;
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    // End of variables declaration//GEN-END:variables
}
