package br.com.elshaddai.telas;

import br.com.elshaddai.dal.ModuloConexao;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    
    public TelaPrincipal() {
        initComponents();
        setIcon();
        setExtendedState(MAXIMIZED_BOTH);
        conexao = ModuloConexao.conector();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadPro = new javax.swing.JMenuItem();
        menuCadVenda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuConCli = new javax.swing.JMenuItem();
        meuConPro = new javax.swing.JMenuItem();
        menuConVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuUpCli = new javax.swing.JMenuItem();
        menuUpProd = new javax.swing.JMenuItem();
        menuUpVenda = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        menRelProd = new javax.swing.JMenuItem();
        menRelVendas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento Ateliê El-Shaddai");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        desktop.setPreferredSize(new java.awt.Dimension(1000, 550));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        menuCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuCadCli.setText("Clientes");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadCli);

        menuCadPro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuCadPro.setText("Produtos");
        menuCadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadPro);

        menuCadVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menuCadVenda.setText("Vendas");
        menuCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadVendaActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadVenda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        menuConCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuConCli.setText("Clientes");
        menuConCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConCliActionPerformed(evt);
            }
        });
        jMenu2.add(menuConCli);

        meuConPro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        meuConPro.setText("Produtos");
        meuConPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meuConProActionPerformed(evt);
            }
        });
        jMenu2.add(meuConPro);

        menuConVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menuConVenda.setText("Vendas");
        menuConVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConVendaActionPerformed(evt);
            }
        });
        jMenu2.add(menuConVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Atualizar");

        menuUpCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuUpCli.setText("Clientes");
        menuUpCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpCliActionPerformed(evt);
            }
        });
        jMenu3.add(menuUpCli);

        menuUpProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuUpProd.setText("Produtos");
        menuUpProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpProdActionPerformed(evt);
            }
        });
        jMenu3.add(menuUpProd);

        menuUpVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menuUpVenda.setText("Vendas");
        menuUpVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpVendaActionPerformed(evt);
            }
        });
        jMenu3.add(menuUpVenda);

        jMenuBar1.add(jMenu3);

        menRel.setText("Relatórios");

        menRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menRelCli.setText("Clientes");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        menRel.add(menRelCli);

        menRelProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menRelProd.setText("Produção");
        menRelProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelProdActionPerformed(evt);
            }
        });
        menRel.add(menRelProd);

        menRelVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menRelVendas.setText("Vendas");
        menRelVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelVendasActionPerformed(evt);
            }
        });
        menRel.add(menRelVendas);

        jMenuBar1.add(menRel);

        jMenu5.setText("Ajuda");

        menuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenu5.add(menuSobre);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Opções");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu6.add(menuSair);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1216, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProActionPerformed
        // Chamando a tela de cadastro de produtos
        TelaCadProd telaCadprod = new TelaCadProd();
        telaCadprod.setVisible(true);
        desktop.add(telaCadprod);
    }//GEN-LAST:event_menuCadProActionPerformed

    private void menuCadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadVendaActionPerformed
        // Chamando a tela de cadastro de vendas
        TelaCadVenda telaCadvenda = new TelaCadVenda();
        telaCadvenda.setVisible(true);
        desktop.add(telaCadvenda);
    }//GEN-LAST:event_menuCadVendaActionPerformed

    private void menuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCliActionPerformed
        // Chamando a tela de cadastro de clientes
        TelaCadCli telaCadastro = new TelaCadCli();
        telaCadastro.setVisible(true);
        desktop.add(telaCadastro);
        
    }//GEN-LAST:event_menuCadCliActionPerformed

    private void meuConProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meuConProActionPerformed
        // Chamando a tela de consulta de produtos
        TelaProdutos telaProduto = new TelaProdutos();
        telaProduto.setVisible(true);
        desktop.add(telaProduto);
    }//GEN-LAST:event_meuConProActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // Chamando a Tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuConCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConCliActionPerformed
        // Chamando a tela TelaClientes
        TelaClientes cliente = new TelaClientes();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menuConCliActionPerformed

    private void menuConVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConVendaActionPerformed
        // Chamando a tela TelaVendas
        TelaVendas vendas = new TelaVendas();
        vendas.setVisible(true);
        desktop.add(vendas);
    }//GEN-LAST:event_menuConVendaActionPerformed

    private void menuUpCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpCliActionPerformed
        // Chamando a tela TelaClienteUpdate
        TelaClienteUpdate updateCli = new TelaClienteUpdate();
        updateCli.setVisible(true);
        desktop.add(updateCli);
    }//GEN-LAST:event_menuUpCliActionPerformed

    private void menuUpProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpProdActionPerformed
        //Chamando a tela TelaProdUpdate
        TelaProdUpdate updateProd = new TelaProdUpdate();
        updateProd.setVisible(true);
        desktop.add(updateProd);
    }//GEN-LAST:event_menuUpProdActionPerformed

    private void menuUpVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpVendaActionPerformed
        // Chamando a tela TelaVendaUpdate
        TelaVendaUpdate upVenda = new TelaVendaUpdate();
        upVenda.setVisible(true);
        desktop.add(upVenda);
    }//GEN-LAST:event_menuUpVendaActionPerformed

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelCliActionPerformed
        // Gerando relatório de clientes
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            // Imprimindo o relatório
            try {
                JasperPrint print = JasperFillManager.fillReport("C:\\Users\\solda\\JaspersoftWorkspace\\MyReports\\Relatório_Clientes.jasper", null, conexao);
                // Exibindo o Relatório
                JasperViewer.viewReport(print,false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menRelCliActionPerformed

    private void menRelProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelProdActionPerformed
        // Gerando relatório de produção
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            // Imprimindo o relatório
            try {
                JasperPrint print = JasperFillManager.fillReport("C:\\Users\\solda\\JaspersoftWorkspace\\MyReports\\Relatório_Produção.jasper", null, conexao);
                // Exibindo o Relatório
                JasperViewer.viewReport(print,false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menRelProdActionPerformed

    private void menRelVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelVendasActionPerformed
        // Gerando relatório de Vendas
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //Imprimindo o Relatório
            try {
                JasperPrint print = JasperFillManager.fillReport("C:\\Users\\solda\\JaspersoftWorkspace\\MyReports\\Relatório_Vendas.jasper", null, conexao);
                //Exibindo o Relatório
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menRelVendasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelCli;
    private javax.swing.JMenuItem menRelProd;
    private javax.swing.JMenuItem menRelVendas;
    private javax.swing.JMenuItem menuCadCli;
    private javax.swing.JMenuItem menuCadPro;
    private javax.swing.JMenuItem menuCadVenda;
    private javax.swing.JMenuItem menuConCli;
    private javax.swing.JMenuItem menuConVenda;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuUpCli;
    private javax.swing.JMenuItem menuUpProd;
    private javax.swing.JMenuItem menuUpVenda;
    private javax.swing.JMenuItem meuConPro;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ESicon.png")));
    }

}
