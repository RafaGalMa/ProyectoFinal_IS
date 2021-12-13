
package vista;
//librerias de conexión
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.PreparedStatement;
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL     DDL,DML,DCL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.Jugador;

public class AltaConsultaJugador extends javax.swing.JFrame {
    Jugador objJugador = new Jugador (); //generación de objeto
    
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;

    public AltaConsultaJugador() {
        initComponents();
    }
    
    //metodo para conectar a base de datos
    public void conectarBase(){
    try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdgaliciaproyectois_final","root","");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nGALICIA");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
    }
}//termina metodo conectar

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        panRegistro = new javax.swing.JPanel();
        lblEquipo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtJugador = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnRegistrarLibro = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblImgJugador = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        lblImgGestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnActualizar.setText("Actualizar Lista Total de Equipos y Jugadores");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Equipo", "Nombre", "Apellido", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        panRegistro.setBackground(new java.awt.Color(204, 255, 153));
        panRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Jugador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblEquipo.setText("Nombre del equipo:");

        lblId.setText("Id:");

        lblJugador.setText("Nombre del jugador:");

        lblApellido.setText("Apellido:");

        txtEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnRegistrarLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        btnRegistrarLibro.setText("Registrar Jugador");
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion:");

        lblImgJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugadorNB.png"))); // NOI18N

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEquipo)
                            .addGroup(panRegistroLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblId))
                            .addGroup(panRegistroLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblApellido))))
                        .addGap(18, 18, 18)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarLibro)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgJugador)
                        .addGap(48, 48, 48))))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipo)
                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJugador)
                            .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImgJugador))
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addGap(17, 17, 17)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnRegistrarLibro)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lblSistema.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblSistema.setText("Bienvenido al software de administración del torneo Olimpus 7");

        lblImgGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionNB.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblImgGestion)
                .addGap(43, 43, 43)
                .addComponent(lblSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSistema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conectarBase(); //llamar a la conexión
            // Declaración de un objeto de almacenamiento lógico de datos "Modelo de datos"
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);
            rs = stmt.executeQuery("SELECT * FROM equipo ORDER BY nombre_equipo ASC");

            //imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id");
            modeloDatos.addColumn("Equipo");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Apellido");
            modeloDatos.addColumn("Direccion");

            //imprimir filas y registros
            while (rs.next()){
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]= rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error 2 de BD en consulta" + e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        // 1er paso llamar a la conexión
        conectarBase();
        // Almacenar los valores del formulario en el objeto
        objJugador.setId(Integer.parseInt(txtId.getText())); //guarda valor de tipo entero en el objeto
        objJugador.setNombre_equipo(txtEquipo.getText()); //guarda nombre del equipo en el objeto
        objJugador.setNombre_jugador(txtJugador.getText()); //guarda nombre del jugador en el objeto
        objJugador.setApellido(txtApellido.getText()); //guarda apellido en el objeto
        objJugador.setDireccion(txtDireccion.getText()); //guarda la direccion en el objeto

        //variable objeto para registrar un alumno
        String altaEquipo = "INSERT INTO equipo (`id`,`nombre_equipo`,`nombre`,`apellido`,`direccion`) VALUES ('"+objJugador.getId()+"','"+objJugador.getNombre_equipo()+"','"+objJugador.getNombre_jugador()+"','"+objJugador.getApellido()+"','"+objJugador.getDireccion()+"')";
        //estructura de control de tratamiento de errores en ejecución
        try {
            stmt.executeUpdate(altaEquipo);
            JOptionPane.showMessageDialog(null, "Se registro Jugador de forma exitosa\n\n"+objJugador.getNombre_equipo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD al generar alta Jugador\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(AltaConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaConsultaJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImgGestion;
    private javax.swing.JLabel lblImgJugador;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJugador;
    // End of variables declaration//GEN-END:variables
}
