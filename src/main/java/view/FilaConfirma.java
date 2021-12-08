/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author pp
 */
public class FilaConfirma extends javax.swing.JFrame {

    /**
     * Creates new form FilaConfirma
     */
    public FilaConfirma() {
        initComponents();
        buscarPaciente();
    }
     
 int i = 0;
 int b ;

    
    public void buscarPaciente(){
        
        DAO dao = new DAO();
        try {
            ArrayList<Paciente> paciente = dao.obterPacientes();
            
            Paciente vetorPaciente[] = new Paciente[paciente.size()];
            i = 0;
            paciente.forEach(e -> vetorPaciente[i++] = (Paciente) e);
            
            DefaultTableModel model =(DefaultTableModel)filaPaciente.getModel();
            model.setNumRows(0);
            
            for(int a = 0; a<paciente.size(); a++){
                
                model.addRow(new Object[]{
                    paciente.get(a).getNome(),
                    paciente.get(a).getIdade(),
                    paciente.get(a).getEndereco(),
                    paciente.get(a).isFunSaude()
                    
                    });
     
            }
            
            LabelMostrarPaciente.setText(paciente.get(0).getNome());
            b = paciente.get(0).getId();
       
          
        } catch (Exception ex) {
            Logger.getLogger(FilaConfirma.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        filaPaciente = new javax.swing.JTable();
        LabelMostrarPaciente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVacinar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(548, 662));
        jPanel1.setMinimumSize(new java.awt.Dimension(548, 662));

        jScrollPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        filaPaciente.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        filaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Endereço", "Funcionario Saude"
            }
        ));
        filaPaciente.setMaximumSize(new java.awt.Dimension(548, 662));
        filaPaciente.setMinimumSize(new java.awt.Dimension(548, 662));
        filaPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(filaPaciente);

        LabelMostrarPaciente.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        LabelMostrarPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMostrarPaciente.setToolTipText("");
        LabelMostrarPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        LabelMostrarPaciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LabelMostrarPacienteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setForeground(new java.awt.Color(77, 77, 77));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("©️ Copyright - 2021");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnVacinar.setText("Vacinar");
        btnVacinar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVacinarMouseClicked(evt);
            }
        });
        btnVacinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelMostrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVacinar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVacinar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMostrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2AncestorAdded

    private void LabelMostrarPacienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LabelMostrarPacienteAncestorAdded
        DAO dao = new DAO();
        try {
            
          //  LabelMostrarPaciente.setText(dao.buscarPaciente());
            
        } catch (Exception ex) {
            Logger.getLogger(FilaConfirma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_LabelMostrarPacienteAncestorAdded

    private void btnVacinarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVacinarMouseClicked

    }//GEN-LAST:event_btnVacinarMouseClicked

    private void btnVacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinarActionPerformed
    
      
        
        int opcao = JOptionPane.showConfirmDialog(this,"Confirma vacina?");
        
        if (opcao == JOptionPane.YES_OPTION){
            
            DAO dao = new DAO();
            try {
                dao.vacinar(b);
                buscarPaciente();
                JOptionPane.showMessageDialog(this, "Paciente vacinado ");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Falha ao cadastrar admin");
            }
            
        }

    }//GEN-LAST:event_btnVacinarActionPerformed

        
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
            java.util.logging.Logger.getLogger(FilaConfirma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilaConfirma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilaConfirma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilaConfirma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilaConfirma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMostrarPaciente;
    private javax.swing.JButton btnVacinar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JTable filaPaciente;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
