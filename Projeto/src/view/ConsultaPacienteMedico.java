package view;

import java.util.Locale;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ConsultaPacienteMedico extends javax.swing.JFrame {
    
    ConsultaAdicionar telaConsultaAdicionar;
    ConsultaBuscar telaConsultaBuscar;
    ConsultaRemover telaConsultaRemover;
    ConsultaBuscarEditar telaConsultaBuscarEditar;
    
    MedicoAdicionar telaMedicoAdicionar;
    MedicoBuscar telaMedicoBuscar;
    MedicoRemover telaMedicoRemover;
    MedicoBuscarEditar telaMedicoBuscarEditar;
    MedicoListar telaMedicoListar;
    
    PacienteAdicionar telaPacienteAdicionar;
    PacienteBuscar telaPacienteBuscar;
    PacienteRemover telaPacienteRemover;
    PacienteBuscarEditar telaPacienteBuscarEditar;

    /**
     * Creates new form ConsultaPacienteMedico
     */
    public ConsultaPacienteMedico() {
        initComponents();
        
        telaConsultaAdicionar = new ConsultaAdicionar();
        telaConsultaBuscar = new ConsultaBuscar();
        telaConsultaRemover = new ConsultaRemover();
        telaConsultaBuscarEditar = new ConsultaBuscarEditar();
        
        telaMedicoAdicionar = new MedicoAdicionar();
        telaMedicoBuscar = new MedicoBuscar();
        telaMedicoRemover = new MedicoRemover();
        telaMedicoBuscarEditar = new MedicoBuscarEditar();
        telaMedicoListar = new MedicoListar();
        
        telaPacienteAdicionar = new PacienteAdicionar();
        telaPacienteBuscar = new PacienteBuscar();
        telaPacienteRemover = new PacienteRemover();
        telaPacienteBuscarEditar = new PacienteBuscarEditar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btAdicionarConsulta = new javax.swing.JButton();
        btRemoverConsulta = new javax.swing.JButton();
        btEditarConsulta = new javax.swing.JButton();
        btBuscarConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btAdicionarPaciente = new javax.swing.JButton();
        btRemoverPaciente = new javax.swing.JButton();
        btEditarPaciente = new javax.swing.JButton();
        btBuscarPaciente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btAdicionarMedico = new javax.swing.JButton();
        btBuscarMedico = new javax.swing.JButton();
        btRemoverMedico = new javax.swing.JButton();
        btEditarMedico = new javax.swing.JButton();
        btRelacaoPacienteMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        jPanel2.setToolTipText("");

        btAdicionarConsulta.setText("Adicionar");
        btAdicionarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarConsultaActionPerformed(evt);
            }
        });

        btRemoverConsulta.setText("Remover");
        btRemoverConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverConsultaActionPerformed(evt);
            }
        });

        btEditarConsulta.setText("Editar");
        btEditarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarConsultaActionPerformed(evt);
            }
        });

        btBuscarConsulta.setText("Buscar");
        btBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemoverConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverConsulta)
                    .addComponent(btAdicionarConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscarConsulta)
                    .addComponent(btEditarConsulta))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pacientes"));
        jPanel3.setName(""); // NOI18N

        btAdicionarPaciente.setText("Adicionar");
        btAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPacienteActionPerformed(evt);
            }
        });

        btRemoverPaciente.setText("Remover");
        btRemoverPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPacienteActionPerformed(evt);
            }
        });

        btEditarPaciente.setText("Editar");
        btEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPacienteActionPerformed(evt);
            }
        });

        btBuscarPaciente.setText("Buscar");
        btBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRemoverPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverPaciente)
                    .addComponent(btAdicionarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarPaciente)
                    .addComponent(btBuscarPaciente))
                .addGap(22, 22, 22))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Médicos"));

        btAdicionarMedico.setText("Adicionar");
        btAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarMedicoActionPerformed(evt);
            }
        });

        btBuscarMedico.setText("Buscar");
        btBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarMedicoActionPerformed(evt);
            }
        });

        btRemoverMedico.setText("Remover");
        btRemoverMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverMedicoActionPerformed(evt);
            }
        });

        btEditarMedico.setText("Editar");
        btEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarMedicoActionPerformed(evt);
            }
        });

        btRelacaoPacienteMedico.setText("Listar médicos/pacientes");
        btRelacaoPacienteMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelacaoPacienteMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btRemoverMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btRelacaoPacienteMedico)
                        .addGap(26, 26, 26))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdicionarMedico)
                            .addComponent(btRemoverMedico)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btRelacaoPacienteMedico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscarMedico)
                    .addComponent(btEditarMedico))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarConsultaActionPerformed
        telaConsultaAdicionar.setLocationRelativeTo(null);
        telaConsultaAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarConsultaActionPerformed

    private void btRemoverConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverConsultaActionPerformed
        telaConsultaRemover.setLocationRelativeTo(null);
        telaConsultaRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverConsultaActionPerformed

    private void btAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPacienteActionPerformed
        telaPacienteAdicionar.setLocationRelativeTo(null);
        telaPacienteAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarPacienteActionPerformed

    private void btRemoverPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPacienteActionPerformed
        telaPacienteRemover.setLocationRelativeTo(null);
        telaPacienteRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverPacienteActionPerformed

    private void btAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarMedicoActionPerformed
        telaMedicoAdicionar.setLocationRelativeTo(null);
        telaMedicoAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarMedicoActionPerformed

    private void btRemoverMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverMedicoActionPerformed
        telaMedicoRemover.setLocationRelativeTo(null);
        telaMedicoRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverMedicoActionPerformed

    private void btEditarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarConsultaActionPerformed
        telaConsultaBuscarEditar.setLocationRelativeTo(null);
        telaConsultaBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarConsultaActionPerformed

    private void btBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarConsultaActionPerformed
        telaConsultaBuscar.setLocationRelativeTo(null);
        telaConsultaBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarConsultaActionPerformed

    private void btBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPacienteActionPerformed
        telaPacienteBuscar.setLocationRelativeTo(null);
        telaPacienteBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarPacienteActionPerformed

    private void btEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPacienteActionPerformed
        telaPacienteBuscarEditar.setLocationRelativeTo(null);
        telaPacienteBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarPacienteActionPerformed

    private void btBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarMedicoActionPerformed
        telaMedicoBuscar.setLocationRelativeTo(null);
        telaMedicoBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarMedicoActionPerformed

    private void btEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarMedicoActionPerformed
        telaMedicoBuscarEditar.setLocationRelativeTo(null);
        telaMedicoBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarMedicoActionPerformed

    private void btRelacaoPacienteMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelacaoPacienteMedicoActionPerformed
        telaMedicoListar.setLocationRelativeTo(null);
        telaMedicoListar.setVisible(true);
    }//GEN-LAST:event_btRelacaoPacienteMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPacienteMedico().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarConsulta;
    private javax.swing.JButton btAdicionarMedico;
    private javax.swing.JButton btAdicionarPaciente;
    private javax.swing.JButton btBuscarConsulta;
    private javax.swing.JButton btBuscarMedico;
    private javax.swing.JButton btBuscarPaciente;
    private javax.swing.JButton btEditarConsulta;
    private javax.swing.JButton btEditarMedico;
    private javax.swing.JButton btEditarPaciente;
    private javax.swing.JButton btRelacaoPacienteMedico;
    private javax.swing.JButton btRemoverConsulta;
    private javax.swing.JButton btRemoverMedico;
    private javax.swing.JButton btRemoverPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
