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
public class VentanaAsociarEnfermedadesTuristas extends javax.swing.JFrame {
    public Modificaciones modificacion;
    public Consultas consulta;
    public String updateSQL;
    public ResultSet rs;
    
    public JComboBox<String> getVerTuristas() {
        return verTuristas;
    }
    public JComboBox<String> getVerEnfermedades() {
        return verEnfermedades;
    }
    
    public void setModificacion(Modificaciones modificacion) {
        this.modificacion = modificacion;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }
    /**
     * Creates new form VentanaAsociarEnfermedadTurista
     */
    public VentanaAsociarEnfermedadesTuristas() {
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

        asociarEnfermedad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregarEnfermedad = new javax.swing.JToggleButton();
        verTuristas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        verEnfermedades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        asociarEnfermedad.setText("Agregar Enfermedad al Turista");
        asociarEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asociarEnfermedadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Para asociar, presione el siguiente botón:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel4.setText("Si no encuentra la Enfermedad que busca, presione aquí para agregar una nueva:");

        agregarEnfermedad.setText("Agregar nueva Enfermedad");
        agregarEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEnfermedadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Seleccione el Turista:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Seleccione la Enfermedad a asociar al Turista:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(agregarEnfermedad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verTuristas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verEnfermedades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asociarEnfermedad, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(verTuristas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(verEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(asociarEnfermedad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(agregarEnfermedad))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asociarEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asociarEnfermedadActionPerformed
        int n1 = verTuristas.getSelectedItem().toString().length();
        int n2 = verEnfermedades.getSelectedItem().toString().length();

        String IDe = verEnfermedades.getSelectedItem().toString().substring(n2-1, n2);
        if(Character.isDigit(verEnfermedades.getSelectedItem().toString().charAt(n2-2))){
            IDe = verEnfermedades.getSelectedItem().toString().substring(n2-2, n2);
        }

        //seleccionar RUT desde el combobox (RUT al final)
        String RUT = verTuristas.getSelectedItem().toString().substring(n1-11, n1);
        if(Character.isDigit(verTuristas.getSelectedItem().toString().charAt(n1-12))){
            RUT = verTuristas.getSelectedItem().toString().substring(n1-12, n1);
        }

        updateSQL = "INSERT INTO Padecen(RUT_turista, cod_enfermedad) "
        + "VALUES "
        + "('"
        + RUT + "', "
        + IDe + ")";

        try{
            modificacion.hacerModificacion(updateSQL);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al agregar.");
        }
    }//GEN-LAST:event_asociarEnfermedadActionPerformed

    private void agregarEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEnfermedadActionPerformed
        VentanaAgregarEnfermedades ventanaAgregarEnfermedades = new VentanaAgregarEnfermedades();
        ventanaAgregarEnfermedades.setModificacion(modificacion);
        ventanaAgregarEnfermedades.setVisible(true);
    }//GEN-LAST:event_agregarEnfermedadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAsociarEnfermedadesTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEnfermedadesTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEnfermedadesTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAsociarEnfermedadesTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAsociarEnfermedadesTuristas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregarEnfermedad;
    private javax.swing.JButton asociarEnfermedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> verEnfermedades;
    private javax.swing.JComboBox<String> verTuristas;
    // End of variables declaration//GEN-END:variables
}
