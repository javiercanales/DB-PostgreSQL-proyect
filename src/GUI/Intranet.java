/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Consultas;
import Clases.Modificaciones;
import Clases.PostgreSQL;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Javier
 */
public class Intranet extends javax.swing.JFrame {
    private static PostgreSQL database;
    public ResultSet rs;
    
    public String consultaSQL;
    public String enunciadoConsulta;
    public Consultas consulta;
    public String titulo;
    
    public String updateSQL;
    public Modificaciones modificacion;
    /**
     * Creates new form PrincipalBD
     */
    public Intranet() {
        database = null;
        initComponents();
        this.setTitle("Sistema Intranet de SERNATUR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JButton();
        usuarioTexto = new javax.swing.JLabel();
        contraTexto = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        textoEstado = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        edicion = new javax.swing.JMenu();
        edicionTours = new javax.swing.JMenu();
        agregarTour = new javax.swing.JMenuItem();
        modificarTour = new javax.swing.JMenuItem();
        eliminarTour = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        agregarGuia = new javax.swing.JMenuItem();
        modificarGuia = new javax.swing.JMenuItem();
        eliminarGuia = new javax.swing.JMenuItem();
        agregarStaff = new javax.swing.JMenuItem();
        eliminarStaff = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agregarTurista = new javax.swing.JMenuItem();
        modificarTurista = new javax.swing.JMenuItem();
        eliminarTurista = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        agregarTuristasTours = new javax.swing.JMenuItem();
        modificarTuristasTours = new javax.swing.JMenuItem();
        eliminarTuristasTours = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        agregarVehiculoTour = new javax.swing.JMenuItem();
        modificarVehiculoTour = new javax.swing.JMenuItem();
        eliminarVehiculoTour = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        consulta1 = new javax.swing.JMenuItem();
        consulta2 = new javax.swing.JMenuItem();
        consulta3 = new javax.swing.JMenuItem();
        consulta4 = new javax.swing.JMenuItem();
        consulta5 = new javax.swing.JMenuItem();
        consultasTodas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Sistema Intranet de");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Base de Datos: PostgreSQL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Alumno: Javier Ignacio Canales Castro ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("RUT: 18.418.705-1");

        iniciarSesion.setText("Iniciar sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        iniciarSesion.registerKeyboardAction(iniciarSesion.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER
            , 0, false)),KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),JComponent.WHEN_FOCUSED);

usuarioTexto.setText("Usuario:");

contraTexto.setText("Contraseña:");

password.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        passwordActionPerformed(evt);
    }
    });

    textoEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    textoEstado.setText("Estado:");

    estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    estado.setForeground(new java.awt.Color(0, 51, 255));
    estado.setText("NO CONECTADO");

    mensaje.setText("Debe iniciar sesión para poder ver las opciones del sistema.");

    jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 51, 255));
    jLabel6.setText("SERNATUR");

    edicion.setText("Opciones de edición");
    edicion.setMnemonic(KeyEvent.VK_E);

    edicionTours.setText("Opciones Tours");

    agregarTour.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
    agregarTour.setText("Agregar Tour");
    agregarTour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarTourActionPerformed(evt);
        }
    });
    edicionTours.add(agregarTour);

    modificarTour.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
    modificarTour.setText("Modificar Tour");
    modificarTour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarTourActionPerformed(evt);
        }
    });
    edicionTours.add(modificarTour);

    eliminarTour.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
    eliminarTour.setText("Eliminar Tour");
    eliminarTour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarTourActionPerformed(evt);
        }
    });
    edicionTours.add(eliminarTour);

    edicion.add(edicionTours);

    jMenu1.setText("Opciones Guías y Staff Tours");

    agregarGuia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
    agregarGuia.setText("Agregar Guía");
    agregarGuia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarGuiaActionPerformed(evt);
        }
    });
    jMenu1.add(agregarGuia);

    modificarGuia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
    modificarGuia.setText("Modificar Guía");
    modificarGuia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarGuiaActionPerformed(evt);
        }
    });
    jMenu1.add(modificarGuia);

    eliminarGuia.setText("Eliminar Guía");
    eliminarGuia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarGuiaActionPerformed(evt);
        }
    });
    jMenu1.add(eliminarGuia);

    agregarStaff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.ALT_MASK));
    agregarStaff.setText("Agregar Guías a Staff de Tours");
    agregarStaff.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarStaffActionPerformed(evt);
        }
    });
    jMenu1.add(agregarStaff);

    eliminarStaff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK));
    eliminarStaff.setText("Eliminar Guías de Staff de Tours");
    eliminarStaff.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarStaffActionPerformed(evt);
        }
    });
    jMenu1.add(eliminarStaff);

    edicion.add(jMenu1);

    jMenu2.setText("Opciones Turistas");

    agregarTurista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.ALT_MASK));
    agregarTurista.setText("Agregar Turista (o Enfermedades a un Turista)");
    agregarTurista.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarTuristaActionPerformed(evt);
        }
    });
    jMenu2.add(agregarTurista);

    modificarTurista.setText("Modificar Turista");
    modificarTurista.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarTuristaActionPerformed(evt);
        }
    });
    jMenu2.add(modificarTurista);

    eliminarTurista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.ALT_MASK));
    eliminarTurista.setText("Eliminar Turista (o Enfermedades de un Turista)");
    eliminarTurista.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarTuristaActionPerformed(evt);
        }
    });
    jMenu2.add(eliminarTurista);

    edicion.add(jMenu2);

    jMenu3.setText("Opciones Jornadas de Tours");

    agregarTuristasTours.setText("Agregar Turistas a Tours");
    agregarTuristasTours.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarTuristasToursActionPerformed(evt);
        }
    });
    jMenu3.add(agregarTuristasTours);

    modificarTuristasTours.setText("Modificar Turistas en Tours");
    modificarTuristasTours.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarTuristasToursActionPerformed(evt);
        }
    });
    jMenu3.add(modificarTuristasTours);

    eliminarTuristasTours.setText("Eliminar Turistas de Tours");
    eliminarTuristasTours.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarTuristasToursActionPerformed(evt);
        }
    });
    jMenu3.add(eliminarTuristasTours);

    edicion.add(jMenu3);

    jMenu4.setText("Opciones Vehículos en Tours");

    agregarVehiculoTour.setText("Agregar Vehículo a Tour");
    agregarVehiculoTour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarVehiculoTourActionPerformed(evt);
        }
    });
    jMenu4.add(agregarVehiculoTour);

    modificarVehiculoTour.setText("Modificar Vehículo de un Tour");
    jMenu4.add(modificarVehiculoTour);

    eliminarVehiculoTour.setText("Eliminar Vehículo de un Tour");
    eliminarVehiculoTour.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarVehiculoTourActionPerformed(evt);
        }
    });
    jMenu4.add(eliminarVehiculoTour);

    edicion.add(jMenu4);

    jMenuBar1.add(edicion);
    edicion.setVisible(false);

    consultas.setBackground(new java.awt.Color(153, 255, 255));
    consultas.setText("Consultas");

    consulta1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
    consulta1.setText("Consulta 1");
    consulta1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consulta1ActionPerformed(evt);
        }
    });
    consultas.add(consulta1);

    consulta2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
    consulta2.setText("Consulta 2");
    consulta2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consulta2ActionPerformed(evt);
        }
    });
    consultas.add(consulta2);

    consulta3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
    consulta3.setText("Consulta 3");
    consulta3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consulta3ActionPerformed(evt);
        }
    });
    consultas.add(consulta3);

    consulta4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
    consulta4.setText("Consulta 4");
    consulta4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consulta4ActionPerformed(evt);
        }
    });
    consultas.add(consulta4);

    consulta5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
    consulta5.setText("Consulta 5");
    consulta5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consulta5ActionPerformed(evt);
        }
    });
    consultas.add(consulta5);

    consultasTodas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
    consultasTodas.setText("Consultas de todas las tablas y vistas");
    consultasTodas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultasTodasActionPerformed(evt);
        }
    });
    consultas.add(consultasTodas);

    jMenuBar1.add(consultas);
    consultas.setVisible(false);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(iniciarSesion))
                .addGroup(layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contraTexto)
                        .addComponent(usuarioTexto))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(user)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mensaje)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 74, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textoEstado)
                            .addGap(26, 26, 26)
                            .addComponent(estado)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(mensaje)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(usuarioTexto)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(contraTexto)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(iniciarSesion)
            .addGap(51, 51, 51)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoEstado)
                .addComponent(estado))
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel5))
            .addGap(18, 18, 18))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta1ActionPerformed
        titulo = "Consulta 1";
        consultaSQL = "SELECT RS.nombreRegion, RS.cantidad " +
                      "FROM REGIONES_SINDESCUENTO RS " +
                      "WHERE RS.cantidad = (SELECT MAX(RSD.cantidad) " +
                                          "FROM REGIONES_SINDESCUENTO RSD)";
        
        enunciadoConsulta = "Consulta Q1: Genere la vista REGIONES_SINDESCUENTO(nombreRegion, cantidad) que \n" +
"contiene el nombre de cada region y la cantidad de personas a las que no se les ha \n" +
"aplicado descuento y que han visitado algun lugar de la region en algun tour, \n" +
"durante el mes de noviembre del presente ano. Luego utilizando la vista, \n" +
"muestre las regiones que han recibido la mayor cantidad de turistas sin descuento.";
        
        consulta = new Consultas(database);
        
        VistaConsultas vista = new VistaConsultas();
        vista.setConsultaSQL(consultaSQL);
        vista.setConsulta(consulta);
        vista.setTitulo(titulo);
        vista.setEnunciadoConsulta(enunciadoConsulta);
        vista.setVisible(true);
    }//GEN-LAST:event_consulta1ActionPerformed

    private void consulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta3ActionPerformed
        titulo = "Consulta 3";
        consultaSQL = "SELECT TC.nombreT, TC.TotalCoordinadores " +
"FROM TOTAL_COORDINADORES TC " +
"WHERE TC.TotalCoordinadores = (SELECT MAX(TC2.TotalCoordinadores) " +
                               "FROM TOTAL_COORDINADORES TC2)";
        
        enunciadoConsulta = "Consulta Q3: Genere la vista TOTAL COORDINADORES(idT, nombreT, TotalCoordinadores) que almacena\n" +
" el identificador y nombre de los tour que poseen guías coordinadores con más de tres especialidades \n" +
" y que han participado en tours que visitan lugares con nivel de esfuerzo medio. Luego, utilizando \n" +
" la vista, muestre los tours que poseen la mayor cantidad de coordinadores con las características \n" +
" mencionadas.";
        
        consulta = new Consultas(database);
        
        VistaConsultas vista = new VistaConsultas();
        vista.setConsultaSQL(consultaSQL);
        vista.setConsulta(consulta);
        vista.setTitulo(titulo);
        vista.setEnunciadoConsulta(enunciadoConsulta);
        vista.setVisible(true);
    }//GEN-LAST:event_consulta3ActionPerformed

    private void consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta2ActionPerformed
        titulo = "Consulta 2";
        consultaSQL = "SELECT TD.nombret, (VT.TotalVentas - TD.TotalDescuentos) AS Total_Real " +
                      "FROM Tour T, VALORES_TOURS VT, TOUR_DESCUENTOS TD " +
                      "WHERE T.Código_tour = VT.idT AND T.Código_tour = TD.idT";
        
        enunciadoConsulta = "Consulta Q2: Vista VALORES TOURS(idT, nombreT, TotalVentas), " +
"que contiene \nel identificador y nombre de cada tour, ademas del total " +
"de ventas \nde cada tour. Par ello debe considerar todas las ventas realizadas del tour. \n" +
"Genere la vista >> TOUR DESCUENTOS(idT, nombreT, TotalDescuentos) << que \ncontiene el" +
"identificador y nombre de cada tour, ademas del total de descuentos aplicados \n" +
"en todas las ventas de cada tour. Luego utilizando las vistas, muestre el nombre \nde " +
"los tours y valor total recibido, considerando el dinero recibido menos los descuentos.";
        
        consulta = new Consultas(database);
        
        VistaConsultas vista = new VistaConsultas();
        vista.setConsultaSQL(consultaSQL);
        vista.setConsulta(consulta);
        vista.setTitulo(titulo);
        vista.setEnunciadoConsulta(enunciadoConsulta);
        vista.setVisible(true);
    }//GEN-LAST:event_consulta2ActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        
        database = new PostgreSQL(user.getText(),password.getText());
        
        try{
            if(database.getConnection()!=null){
                
                JOptionPane.showMessageDialog(null, "Conexion realizada exitosamente.");
                estado.setText("CONECTADO");
                estado.setForeground(Color.red);
                usuarioTexto.setVisible(false);
                contraTexto.setVisible(false);
                user.setVisible(false);
                password.setVisible(false);
                iniciarSesion.setVisible(false);
                mensaje.setText("Sea bienvenido. Puede acceder a las opciones en el menu superior.");
                
                consultas.setVisible(true);
                edicion.setVisible(true);
            }
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error... reintente conectarse.");
        }
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void consulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta4ActionPerformed
        titulo = "Consulta 4";
        consultaSQL = "SELECT TT.nombreT, TT.TotalTuristas " +
"FROM TOTAL_TURISTAS TT " +
"WHERE TT.TotalTuristas = (SELECT MAX(TT2.TotalTuristas) " +
                          "FROM Total_Turistas TT2)";
        
        enunciadoConsulta = "Consulta Q4: Genere la vista TOTAL TURISTAS(idT, nombreT, TotalTuristas) que contiene el identificador\n" +
" y nombre de los tours, y la cantidad de turistas que no tienen enfermedades cardiacas ni\n" +
" respiratorias y que han visitado lugares cuyo nivel de exigencia es experto durante el mes de\n" +
" octubre del presente ano. Luego, utilizando la vista, muestre los tours que poseen la mayor\n" +
" cantidad de turistas que han visitado lugares con exigencia experto y que cumplan el requisito\n" +
" de no tener las enfermedades mencionadas.";
        
        consulta = new Consultas(database);
        
        VistaConsultas vista = new VistaConsultas();
        vista.setConsultaSQL(consultaSQL);
        vista.setConsulta(consulta);
        vista.setTitulo(titulo);
        vista.setEnunciadoConsulta(enunciadoConsulta);
        vista.setVisible(true);
    }//GEN-LAST:event_consulta4ActionPerformed

    private void consulta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta5ActionPerformed
        titulo = "Consulta 5";
        consultaSQL = "SELECT (TA.TotalArriendo*100/TV.TotalVeh) AS porcentaje_arriendo " +
                      "FROM TOTAL_ARRIENDOS TA, TOTAL_VEHICULO TV";
        
        enunciadoConsulta = "Consulta Q5: Genere la vista TOTAL ARRIENDOS(TotalArriendo) que almacena el total de arriendos de\n" +
" vehículos (no precio) realizados por SERNATUR durante los meses de Enero y Febrero del\n" +
" presente a~no y la vista TOTAL VEHICULOS(TotalVeh) que contiene el total de vehiculos que\n" +
" posee SERNATUR. Luego, utilizando las vistas muestre el porcentaje de arriendo de vehiculos\n" +
" realizados por SERNATUR (nUmero de vehiculos arrendados/numero total de vehiculos).";
        
        consulta = new Consultas(database);
        
        VistaConsultas vista = new VistaConsultas();
        vista.setConsultaSQL(consultaSQL);
        vista.setConsulta(consulta);
        vista.setTitulo(titulo);
        vista.setEnunciadoConsulta(enunciadoConsulta);
        vista.setVisible(true);
    }//GEN-LAST:event_consulta5ActionPerformed

    private void agregarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTourActionPerformed
        try {
            modificacion = new Modificaciones(database);
        
            VentanaAgregarTour ventanaAgregarTour = new VentanaAgregarTour();
            ventanaAgregarTour.setModificacion(modificacion);
            
            
            String consultaCiudadSQL = "SELECT cod_ciudad, nombre_ciudad "
                    + "FROM Ciudad "
                    + "ORDER BY cod_ciudad";
            
            consulta = new Consultas(database);
            ventanaAgregarTour.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código del Tour.
            rs = consulta.hacerConsulta(consultaCiudadSQL);
            while(rs.next()){
                ventanaAgregarTour.getVerCiudades().addItem(rs.getString("nombre_ciudad") + " - " + rs.getString("cod_ciudad"));
            }
            ventanaAgregarTour.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_agregarTourActionPerformed

    private void modificarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTourActionPerformed
        try {
            String consultaTourSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            String consultaCiudadSQL = "SELECT cod_ciudad, nombre_ciudad "
                    + "FROM Ciudad "
                    + "ORDER BY cod_ciudad";
            
            modificacion = new Modificaciones(database);
            
            VentanaModificarTour ventanaModificarTour = new VentanaModificarTour();
            ventanaModificarTour.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaTourSQL);
            while(rs.next()){
                ventanaModificarTour.getVerTours().addItem(rs.getString("nombre_repres") + ", con ID Tour: " + rs.getString("código_tour"));
            }
            
            //Consulta para llenar combobox con Nombre y Código de las Ciudades.
            rs = consulta.hacerConsulta(consultaCiudadSQL);
            while(rs.next()){
                ventanaModificarTour.getVerCiudades().addItem(rs.getString("nombre_ciudad") + " - " + rs.getString("cod_ciudad"));
            }
            ventanaModificarTour.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_modificarTourActionPerformed

    private void eliminarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTourActionPerformed
        try {
            String consultaTourSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            
            modificacion = new Modificaciones(database);
            
            VentanaEliminarTour ventanaEliminarTour = new VentanaEliminarTour();
            ventanaEliminarTour.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            
            //Consulta para llenar combobox con Nombre y Código del Tour.
            rs = consulta.hacerConsulta(consultaTourSQL);
            while(rs.next()){
                ventanaEliminarTour.getVerTours().addItem(rs.getString("nombre_repres") + " - ID Tour: " + rs.getString("código_tour"));
            }
            
            ventanaEliminarTour.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarTourActionPerformed

    private void eliminarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarGuiaActionPerformed
        try {
            String consultaGuiaSQL = "SELECT nombre_completo, RUT_guía "
                    + "FROM Guía ";
            
            modificacion = new Modificaciones(database);
            
            VentanaEliminarGuia ventanaEliminarGuia = new VentanaEliminarGuia();
            ventanaEliminarGuia.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            
            //Consulta para llenar combobox con Nombre y Código del Tour.
            rs = consulta.hacerConsulta(consultaGuiaSQL);
            while(rs.next()){
                ventanaEliminarGuia.getVerGuias().addItem(rs.getString("nombre_completo") + ", con RUT: " + rs.getString("RUT_guía"));
            }
            
            ventanaEliminarGuia.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarGuiaActionPerformed

    private void agregarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarGuiaActionPerformed
        try {
            modificacion = new Modificaciones(database);
        
            VentanaAgregarGuia ventanaAgregarGuia = new VentanaAgregarGuia();
            ventanaAgregarGuia.setModificacion(modificacion);
            
            
            String consultaCiudadSQL = "SELECT cod_ciudad, nombre_ciudad "
                    + "FROM Ciudad "
                    + "ORDER BY cod_ciudad";
            
            consulta = new Consultas(database);
            ventanaAgregarGuia.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código del Tour.
            rs = consulta.hacerConsulta(consultaCiudadSQL);
            while(rs.next()){
                ventanaAgregarGuia.getVerCiudades().addItem(rs.getString("nombre_ciudad") + " - " + rs.getString("cod_ciudad"));
            }
            ventanaAgregarGuia.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_agregarGuiaActionPerformed

    private void modificarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarGuiaActionPerformed
        try {
            String consultaGuiaSQL = "SELECT nombre_completo, RUT_guía "
                    + "FROM Guía ";
            String consultaCiudadSQL = "SELECT cod_ciudad, nombre_ciudad "
                    + "FROM Ciudad "
                    + "ORDER BY cod_ciudad";
            
            modificacion = new Modificaciones(database);
            
            VentanaModificarGuia ventanaModificarGuia = new VentanaModificarGuia();
            ventanaModificarGuia.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            ventanaModificarGuia.setConsulta(consulta);
            
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaGuiaSQL);
            while(rs.next()){
                ventanaModificarGuia.getVerGuias().addItem(rs.getString("nombre_completo") + ", con RUT: " + rs.getString("RUT_guía"));
            }
            
            //Consulta para llenar combobox con Nombre y Código de las Ciudades.
            rs = consulta.hacerConsulta(consultaCiudadSQL);
            while(rs.next()){
                ventanaModificarGuia.getVerCiudades().addItem(rs.getString("nombre_ciudad") + " - " + rs.getString("cod_ciudad"));
            }
            ventanaModificarGuia.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_modificarGuiaActionPerformed

    private void agregarStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarStaffActionPerformed
        try {
            String consultaTourSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            String consultaGuiaSQL = "SELECT nombre_completo, RUT_guía "
                    + "FROM Guía ";
            String consultaCategoriaSQL = "SELECT cod_categoría, descrip_cat "
                    + "FROM Categoría "
                    + "ORDER BY cod_categoría";
            
            modificacion = new Modificaciones(database);
            consulta = new Consultas(database);
            
            VentanaAgregarStaff ventanaAgregarStaff = new VentanaAgregarStaff();
            ventanaAgregarStaff.setModificacion(modificacion);
            
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaTourSQL);
            while(rs.next()){
                ventanaAgregarStaff.getVerTours().addItem(rs.getString("nombre_repres") + " - " + rs.getString("código_tour"));
            }
            
            //Consulta para llenar combobox con Nombre y Código de los(as) Guías.
            rs = consulta.hacerConsulta(consultaGuiaSQL);
            while(rs.next()){
                ventanaAgregarStaff.getVerGuias().addItem(rs.getString("nombre_completo") + ", con RUT: " + rs.getString("RUT_guía"));
            }
            
            //Consulta para llenar combobox con Nombre y Código de las Categorías.
            rs = consulta.hacerConsulta(consultaCategoriaSQL);
            while(rs.next()){
                ventanaAgregarStaff.getVerCategorias().addItem(rs.getString("descrip_cat") + " - " + rs.getString("cod_categoría"));
            }
            
            ventanaAgregarStaff.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_agregarStaffActionPerformed

    private void eliminarStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarStaffActionPerformed
        try {
            String consultaTourSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            
            modificacion = new Modificaciones(database);
            consulta = new Consultas(database);
            
            VentanaEliminarStaff ventanaEliminarStaff = new VentanaEliminarStaff();
            ventanaEliminarStaff.setModificacion(modificacion);
            ventanaEliminarStaff.setConsulta(consulta);
            
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaTourSQL);
            while(rs.next()){
                ventanaEliminarStaff.getVerTours().addItem(rs.getString("nombre_repres") + " - " + rs.getString("código_tour"));
            }
            
            ventanaEliminarStaff.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarStaffActionPerformed

    private void consultasTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasTodasActionPerformed
        consulta = new Consultas(database);
        
        VistaTablasBD vistaTablas = new VistaTablasBD();
        vistaTablas.setConsulta(consulta);
        vistaTablas.setVisible(true);
    }//GEN-LAST:event_consultasTodasActionPerformed

    private void agregarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTuristaActionPerformed
        consulta = new Consultas(database);
        modificacion = new Modificaciones(database);
        VentanaAgregarTuristas ventanaAgregarTuristas = new VentanaAgregarTuristas();
        ventanaAgregarTuristas.setConsulta(consulta);
        ventanaAgregarTuristas.setModificacion(modificacion);
        ventanaAgregarTuristas.setVisible(true);
    }//GEN-LAST:event_agregarTuristaActionPerformed

    private void modificarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTuristaActionPerformed
        try {
            String consultaTuristasSQL = "SELECT nombre_turista, RUT_turista "
                    + "FROM Turistas ";
            
            modificacion = new Modificaciones(database);
            consulta = new Consultas(database);
            VentanaModificarTuristas ventanaModificarTuristas = new VentanaModificarTuristas();
            ventanaModificarTuristas.setModificacion(modificacion);
            
            rs = consulta.hacerConsulta(consultaTuristasSQL);
            while(rs.next()){
                ventanaModificarTuristas.getVerTuristas().addItem(rs.getString("nombre_turista") + " - RUT: " + rs.getString("RUT_turista"));
            }
            ventanaModificarTuristas.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Intranet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarTuristaActionPerformed

    private void eliminarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTuristaActionPerformed
        try {
            String consultaTuristasSQL = "SELECT nombre_turista, RUT_turista "
                    + "FROM Turistas ";
            
            modificacion = new Modificaciones(database);
            VentanaEliminarTuristas ventanaEliminarTuristas = new VentanaEliminarTuristas();
            ventanaEliminarTuristas.setModificacion(modificacion);
            
            
            consulta = new Consultas(database);
            ventanaEliminarTuristas.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaTuristasSQL);
            while(rs.next()){
                ventanaEliminarTuristas.getVerTuristas().addItem(rs.getString("nombre_turista") + " - RUT: " + rs.getString("RUT_turista"));
            }
            
            ventanaEliminarTuristas.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarTuristaActionPerformed

    private void agregarTuristasToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTuristasToursActionPerformed
        try {
            String consultaTuristasSQL = "SELECT nombre_turista, RUT_turista "
                    + "FROM Turistas ";
            String consultaToursSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            
            modificacion = new Modificaciones(database);
            VentanaAgregarTuristasTours ventanaAgregarTuristasTours = new VentanaAgregarTuristasTours();
            ventanaAgregarTuristasTours.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            ventanaAgregarTuristasTours.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaTuristasSQL);
            while(rs.next()){
                ventanaAgregarTuristasTours.getVerTuristas().addItem(rs.getString("nombre_turista") + " - RUT: " + rs.getString("RUT_turista"));
            }
            
            rs = consulta.hacerConsulta(consultaToursSQL);
            while(rs.next()){
                ventanaAgregarTuristasTours.getVerTours().addItem(rs.getString("nombre_repres") + ", " + rs.getString("código_tour"));
            }
            
            ventanaAgregarTuristasTours.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_agregarTuristasToursActionPerformed

    private void modificarTuristasToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTuristasToursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTuristasToursActionPerformed

    private void eliminarTuristasToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTuristasToursActionPerformed
        try {
            String consultaToursSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            
            modificacion = new Modificaciones(database);
            VentanaEliminarTuristasDeTours ventanaEliminarTuristasDeTours = new VentanaEliminarTuristasDeTours();
            ventanaEliminarTuristasDeTours.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            ventanaEliminarTuristasDeTours.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaToursSQL);
            while(rs.next()){
                ventanaEliminarTuristasDeTours.getVerTours().addItem(rs.getString("nombre_repres") + ", " + rs.getString("código_tour"));
            }
            
            ventanaEliminarTuristasDeTours.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarTuristasToursActionPerformed

    private void eliminarVehiculoTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVehiculoTourActionPerformed
        try {
            String consultaToursSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            
            modificacion = new Modificaciones(database);
            VentanaEliminarVehiculosDeTours ventanaEliminarVehiculosDeTours = new VentanaEliminarVehiculosDeTours();
            ventanaEliminarVehiculosDeTours.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            ventanaEliminarVehiculosDeTours.setConsulta(consulta);
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaToursSQL);
            while(rs.next()){
                ventanaEliminarVehiculosDeTours.getVerTours().addItem(rs.getString("nombre_repres") + ", " + rs.getString("código_tour"));
            }
            
            ventanaEliminarVehiculosDeTours.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_eliminarVehiculoTourActionPerformed

    private void agregarVehiculoTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVehiculoTourActionPerformed
        try {
            String consultaToursSQL = "SELECT código_tour, nombre_repres "
                    + "FROM Tour "
                    + "ORDER BY código_tour";
            String consultaVehiculosSQL = "SELECT patente "
                    + "FROM Vehículo ";
            
            modificacion = new Modificaciones(database);
            VentanaAgregarVehiculosTours ventanaAgregarVehiculosTours = new VentanaAgregarVehiculosTours();
            ventanaAgregarVehiculosTours.setModificacion(modificacion);
            
            consulta = new Consultas(database);
            //Consulta para llenar combobox con Nombre y Código de los Tours.
            rs = consulta.hacerConsulta(consultaToursSQL);
            while(rs.next()){
                ventanaAgregarVehiculosTours.getVerTours().addItem(rs.getString("nombre_repres") + ", " + rs.getString("código_tour"));
            }
            
            rs = consulta.hacerConsulta(consultaVehiculosSQL);
            while(rs.next()){
                ventanaAgregarVehiculosTours.getVerVehiculos().addItem(rs.getString("patente"));
            }
            
            ventanaAgregarVehiculosTours.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar." + ex.getMessage());
        }
    }//GEN-LAST:event_agregarVehiculoTourActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String args[]) throws SQLException {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intranet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //Conexion al servidor
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Intranet().setVisible(true);
        });       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarGuia;
    private javax.swing.JMenuItem agregarStaff;
    private javax.swing.JMenuItem agregarTour;
    private javax.swing.JMenuItem agregarTurista;
    private javax.swing.JMenuItem agregarTuristasTours;
    private javax.swing.JMenuItem agregarVehiculoTour;
    private javax.swing.JMenuItem consulta1;
    private javax.swing.JMenuItem consulta2;
    private javax.swing.JMenuItem consulta3;
    private javax.swing.JMenuItem consulta4;
    private javax.swing.JMenuItem consulta5;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenuItem consultasTodas;
    private javax.swing.JLabel contraTexto;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenu edicionTours;
    private javax.swing.JMenuItem eliminarGuia;
    private javax.swing.JMenuItem eliminarStaff;
    private javax.swing.JMenuItem eliminarTour;
    private javax.swing.JMenuItem eliminarTurista;
    private javax.swing.JMenuItem eliminarTuristasTours;
    private javax.swing.JMenuItem eliminarVehiculoTour;
    private javax.swing.JLabel estado;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JMenuItem modificarGuia;
    private javax.swing.JMenuItem modificarTour;
    private javax.swing.JMenuItem modificarTurista;
    private javax.swing.JMenuItem modificarTuristasTours;
    private javax.swing.JMenuItem modificarVehiculoTour;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel textoEstado;
    private javax.swing.JTextField user;
    private javax.swing.JLabel usuarioTexto;
    // End of variables declaration//GEN-END:variables
}
