package br.com.elshaddai.telas;

import java.sql.*;
import br.com.elshaddai.dal.ModuloConexao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TelaVendas extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaVendas() {
        initComponents();
        
        btnRefresh.setBorderPainted(false);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setFocusPainted(true);
        
        conexao = ModuloConexao.conector();
        
        //Preenchendo a tabela ao iniciar o jinternalframe
        String result = "select idvenda as ID, datavenda as 'Data', clivenda as Cliente, precovenda as 'Valor Total', tipovenda as Tipo, quantparc as Parcelamento, statusvenda as 'Status' from tbvendas";
        try {
            pst = conexao.prepareStatement(result);
            rs = pst.executeQuery();
            tblVendas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void buscar_venda(){
        String sql = "select idvenda as ID, datavenda as 'Data', clivenda as Cliente, precovenda as 'Valor Total', tipovenda as Tipo, quantparc as Parcelamento, statusvenda as 'Status' from tbvendas where clivenda like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtVendaCli.getText() + "%");
            rs = pst.executeQuery();
            tblVendas.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setar_campos(){
        int setar = tblVendas.getSelectedRow();
        lblDataVenda.setText(tblVendas.getModel().getValueAt(setar, 1).toString());
        lblNomeCliente.setText(tblVendas.getModel().getValueAt(setar, 2).toString());
        lblValorVenda.setText(tblVendas.getModel().getValueAt(setar, 3).toString());
        lblTipoVenda.setText(tblVendas.getModel().getValueAt(setar, 4).toString());
        lblParcelamento.setText(tblVendas.getModel().getValueAt(setar, 5).toString());
        lblStatus.setText(tblVendas.getModel().getValueAt(setar, 6).toString());
        if ("Pago".equals(lblStatus.getText())) {
            lblStatus.setForeground(Color.GREEN);
            }
        if ("Em Prazo".equals(lblStatus.getText())) {
            lblStatus.setForeground(Color.ORANGE);
            }
        if("Vencido".equals(lblStatus.getText())){
            lblStatus.setForeground(Color.RED);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVendaCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTipoVenda = new javax.swing.JLabel();
        lblParcelamento = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Vendas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/elshaddai/icones/ESicon.png"))); // NOI18N

        tblVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data da Venda", "Cliente", "Valor da Venda", "Tipo da Venda", "Parcelamento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        tblVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblVendasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        jLabel1.setText("Buscar Venda (Cliente)");

        txtVendaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaCliActionPerformed(evt);
            }
        });
        txtVendaCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVendaCliKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data da Venda:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor da Venda:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo da Venda:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Parcelamento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Status:");

        lblTipoVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoVenda.setText("Aqui aparecerá o tipo da venda");

        lblParcelamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblParcelamento.setText("Informações de parcelamento");

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus.setText("Status da venda selecionada");

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Aqui aparecerá o nome do cliente");

        lblDataVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataVenda.setText("Aqui aparecerá a data da venda");

        lblValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorVenda.setText("Aqui aparecerá o valor da venda");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/elshaddai/icones/refresh p.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel8.setText("Recarregar Lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVendaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblValorVenda, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDataVenda, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomeCliente)))
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoVenda)
                                    .addComponent(lblParcelamento)
                                    .addComponent(lblStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(9, 9, 9)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVendaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(lblTipoVenda)
                            .addComponent(lblNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(lblParcelamento)
                            .addComponent(lblDataVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(lblStatus)
                            .addComponent(lblValorVenda)))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1010, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaCliActionPerformed

    private void txtVendaCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendaCliKeyReleased
        // Chamando o método buscar_venda
        buscar_venda();
    }//GEN-LAST:event_txtVendaCliKeyReleased

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
        setar_campos();
    }//GEN-LAST:event_tblVendasMouseClicked

    private void tblVendasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVendasKeyPressed

    }//GEN-LAST:event_tblVendasKeyPressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        String result = "select idvenda as ID, datavenda as 'Data', clivenda as Cliente, precovenda as 'Valor Total', tipovenda as Tipo, quantparc as Parcelamento, statusvenda as 'Status' from tbvendas";
        try {
            pst = conexao.prepareStatement(result);
            rs = pst.executeQuery();
            tblVendas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblParcelamento;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipoVenda;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtVendaCli;
    // End of variables declaration//GEN-END:variables
}
