
package view;

import controller.ControleAcesso;


public class Adiciona extends javax.swing.JFrame {
    private static ControleAcesso loja;
    private static char genero;

    public Adiciona(ControleAcesso loja) {
        initComponents();
        this.loja = loja;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldCPF = new javax.swing.JTextField();
        fieldIdade = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        radioM = new javax.swing.JRadioButton();
        radioF = new javax.swing.JRadioButton();
        labelSexo = new javax.swing.JLabel();
        buttonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("NOME: ");

        labelCpf.setText("CPF: ");

        labelIdade.setText("IDADE: ");

        addButton.setText("Adicionar Cliente");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        radioM.setText("M");
        radioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMActionPerformed(evt);
            }
        });

        radioF.setText("F");
        radioF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFActionPerformed(evt);
            }
        });

        labelSexo.setText("SEXO:");

        buttonReturn.setText("Voltar");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
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
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(fieldCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fieldIdade, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(radioM)
                                .addGap(18, 18, 18)
                                .addComponent(radioF)
                                .addGap(0, 79, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioM)
                    .addComponent(radioF)
                    .addComponent(labelSexo))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(buttonReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean liberaAdicao(){
        if(fieldNome.getText().length() > 0
                && fieldCPF.getText().length() > 0
                && fieldIdade.getText().length() > 0
                && (radioF.isSelected() != false || radioM.isSelected() != false)
                ) return true;
        
        return false;
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(liberaAdicao()){
            loja.cadastraCliente(fieldNome.getText(), fieldCPF.getText(), Integer.parseInt(fieldIdade.getText()), genero);
            setVisible(false);
            this.dispose();
        } else {
           javax.swing.JOptionPane.showConfirmDialog(null,"Você deve preencher corretamente os campos!","ATENÇÂO ",javax.swing.JOptionPane.CLOSED_OPTION );
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void radioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMActionPerformed
        radioF.setSelected(false);
        genero = 'M';
    }//GEN-LAST:event_radioMActionPerformed

    private void radioFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFActionPerformed
        radioM.setSelected(false);
        genero = 'F';
    }//GEN-LAST:event_radioFActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_buttonReturnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adiciona(loja).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldIdade;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JRadioButton radioF;
    private javax.swing.JRadioButton radioM;
    // End of variables declaration//GEN-END:variables
}
