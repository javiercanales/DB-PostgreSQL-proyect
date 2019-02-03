/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Consultas;
import Clases.Modificaciones;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class VentanaAsociarEspecialidadGuia extends javax.swing.JFrame {
    public Modificaciones modificacion;
    public Consultas consulta;
    public String updateSQL;
    public ResultSet rs;
    
    public JComboBox<String> getVerEspecialidades() {
        return verEspecialidades;
    }
    public JComboBox<String> getVerGuias() {
        return verGuias;
    }
    
    public void setModificacion(Modificaciones modificacion) {
        this.modificacion = modificacion;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }
    /**
     * Creates new form VentanaAsociarEspecialidadGuia
     */
    public VentanaAsociarEspecialidadGuia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asociar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarEspecialidad = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        verEspecialidades = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        verGuias = new javax.swing.JComboBox<>();
        nivelExpertise = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        asociar.setText("Asociar Especialidad a Guía");
        asociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asociarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Para asociar, presione el siguiente botón:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel4.setText("Si no encuentra la Especialidad que busca, presione aquí para agregar una nueva:");

        agregarEspecialidad.setText("Agregar nueva Especialidad");
        agregarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEspecialidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Nivel de expertise:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Seleccione la Especialidad a asociar:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Seleccione el Guía al que asociará la Especialidad:");

        nivelExpertise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Medio", "Alto", "Experto" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarEspecialidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verEspecialidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verGuias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asociar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nivelExpertise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(verGuias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nivelExpertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(asociar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(agregarEspecialidad))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asociarActionPerformed
        int n1 = verEspecialidades.getSelectedItem().toString().length();
        int n2 = verGuias.getSelectedItem().toString().length();

        String IDe = verEspecialidades.getSelectedItem().toString().substring(n1-1, n1);
        if(Character.isDigit(verEspecialidades.getSelectedItem().toString().charAt(n1-2))){
            IDe = verEspecialidades.getSelectedItem().toString().substring(n1-2, n1);
        }
        
        //seleccionar RUT desde el combobox (RUT al final)
        String RUT = verGuias.getSelectedItem().toString().substring(n2-11, n2);
        if(Character.isDigit(verGuias.getSelectedItem().toString().charAt(n2-12))){
            RUT = verGuias.getSelectedItem().toString().substring(n2-12, n2);
        }

        updateSQL = "INSERT INTO Ejerce(RUT_guía, cod_especialidad, nivel_expertise) "
        + "VALUES "
        + "('"
        + RUT + "', "
        + IDe + ", '"
        + nivelExpertise.getSelectedItem() + "') ";

        try{
            modificacion.hacerModificacion(updateSQL);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar.");
        }
    }//GEN-LAST:event_asociarActionPerformed

    private void agregarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEspecialidadActionPerformed
        VentanaAgregarEspecialidad ventanaAgregarEspecialidad = new VentanaAgregarEspecialidad();
        ventanaAgregarEspecialidad.setModificacion(modificacion);
        ventanaAgregarEspecialidad.setVisible(true);
    }//GEN-LAST:event_agregarEspecialidadActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(VentanaAsociarEspecialidadGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEspecialidadGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEspecialidadGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEspecialidadGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAsociarEspecialidadGuia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregarEspecialidad;
    private javax.swing.JButton asociar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> nivelExpertise;
    private javax.swing.JComboBox<String> verEspecialidades;
    private javax.swing.JComboBox<String> verGuias;
    // End of variables declaration//GEN-END:variables
}