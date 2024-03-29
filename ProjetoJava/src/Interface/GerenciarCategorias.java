package Interface;


import Interface.ControllerJFrame;
import simulador.compraevenda.java.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CONDUCTOR\saulo.terceiro
 */
public class GerenciarCategorias extends ControllerJFrame {

    public GerenciarCategorias(Controller controller) {
        super(controller);
        initComponents();
    }

    /**
     * Creates new form GerenciarCategorias
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adicionarProdutosBotao = new javax.swing.JButton();
        listarCategoriasBotao = new javax.swing.JButton();
        VoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Gerenciar Categorias");
        jLabel1.setToolTipText("");

        adicionarProdutosBotao.setText("Adicionar Categoria");
        adicionarProdutosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProdutosBotaoActionPerformed(evt);
            }
        });

        listarCategoriasBotao.setText("Listar Categorias");
        listarCategoriasBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCategoriasBotaoActionPerformed(evt);
            }
        });

        VoltarMenu.setText("Voltar");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(VoltarMenu)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionarProdutosBotao)
                    .addComponent(listarCategoriasBotao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(VoltarMenu))
                .addGap(18, 18, 18)
                .addComponent(listarCategoriasBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarProdutosBotao)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarProdutosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProdutosBotaoActionPerformed
        // TODO add your handling code here:
        AdicionarCategoria tela = new AdicionarCategoria(controller);
        this.inicializarCena(tela, this);
    }//GEN-LAST:event_adicionarProdutosBotaoActionPerformed

    private void listarCategoriasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCategoriasBotaoActionPerformed
        // TODO add your handling code here:
        ListarCategorias listar = new ListarCategorias(controller);
        this.inicializarCena(listar, this);
    }//GEN-LAST:event_listarCategoriasBotaoActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(controller);
        this.inicializarCena(menu, this);
    }//GEN-LAST:event_VoltarMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JButton adicionarProdutosBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listarCategoriasBotao;
    // End of variables declaration//GEN-END:variables
}
