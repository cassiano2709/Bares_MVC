
package view;

import controller.ControleAcesso;
import java.util.ArrayList;


public class Menu extends javax.swing.JFrame {
    private static ControleAcesso loja;

    public Menu() {
        initComponents();
        loja = new ControleAcesso("Moe");
    }
    
    public ControleAcesso getLoja(){
        return loja;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addClienteButton = new javax.swing.JButton();
        removeClienteButton = new javax.swing.JButton();
        mostaClienteButton = new javax.swing.JButton();
        fechaProgramaButton = new javax.swing.JButton();
        buttonClientesPorGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addClienteButton.setText("Adicionar Cliente");
        addClienteButton.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                addClienteButtonComponentAdded(evt);
            }
        });
        addClienteButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addClienteButtonStateChanged(evt);
            }
        });
        addClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClienteButtonActionPerformed(evt);
            }
        });

        removeClienteButton.setText("Remover Cliente");
        removeClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClienteButtonActionPerformed(evt);
            }
        });

        mostaClienteButton.setText("Mostrar Clientes");
        mostaClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostaClienteButtonActionPerformed(evt);
            }
        });

        fechaProgramaButton.setLabel("Fechar Programa");
        fechaProgramaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaProgramaButtonActionPerformed(evt);
            }
        });

        buttonClientesPorGenero.setText("Clientes por Genero");
        buttonClientesPorGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientesPorGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeClienteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostaClienteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonClientesPorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaProgramaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(addClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostaClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonClientesPorGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaProgramaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addClienteButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addClienteButtonStateChanged
    }//GEN-LAST:event_addClienteButtonStateChanged

    private void addClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClienteButtonActionPerformed
        new Adiciona(getLoja()).setVisible(true);
    }//GEN-LAST:event_addClienteButtonActionPerformed

    private void addClienteButtonComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_addClienteButtonComponentAdded
    }//GEN-LAST:event_addClienteButtonComponentAdded

    private void removeClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClienteButtonActionPerformed
        new Remove(getLoja()).setVisible(true);
    }//GEN-LAST:event_removeClienteButtonActionPerformed

    private void mostaClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostaClienteButtonActionPerformed
        ArrayList<String> lista = new ArrayList<String>();
        lista = getLoja().mostraClientes();
        new ListaClientes(lista).setVisible(true);
    }//GEN-LAST:event_mostaClienteButtonActionPerformed

    private void fechaProgramaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaProgramaButtonActionPerformed
        setVisible(false);
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÂO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
                this.dispose();  
        }  
    }//GEN-LAST:event_fechaProgramaButtonActionPerformed

    private void buttonClientesPorGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientesPorGeneroActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showConfirmDialog(null,""+getLoja().numeroClientesPorGenero(),"Número de Clientes por genero ",javax.swing.JOptionPane.CLOSED_OPTION );
    }//GEN-LAST:event_buttonClientesPorGeneroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClienteButton;
    private javax.swing.JButton buttonClientesPorGenero;
    private javax.swing.JButton fechaProgramaButton;
    private javax.swing.JButton mostaClienteButton;
    private javax.swing.JButton removeClienteButton;
    // End of variables declaration//GEN-END:variables
}
