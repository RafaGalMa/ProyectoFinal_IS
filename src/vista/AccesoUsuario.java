
package vista;
//librerias de conexion
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos

public class AccesoUsuario extends javax.swing.JFrame {
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
  
    public AccesoUsuario() {
        initComponents();
        this.setTitle("Bienvenido al Software de Administración Olimpus 7");// pone titulo
        this.setLocationRelativeTo(null);//centra la ventana
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

        lblTitulo = new javax.swing.JLabel();
        panCaptura = new javax.swing.JPanel();
        lblUsuarioAcceso = new javax.swing.JLabel();
        lblPasswordAcceso = new javax.swing.JLabel();
        txtPasswordAcceso = new javax.swing.JPasswordField();
        txtUsuarioAcceso = new javax.swing.JTextField();
        btnEntrarSistema = new javax.swing.JButton();
        panRol = new javax.swing.JPanel();
        optAdministrador = new javax.swing.JRadioButton();
        optJugador = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        lblImgLogo = new javax.swing.JLabel();
        lblImgUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 204, 0));
        lblTitulo.setText("Acceso a software de administración Olimpus 7");

        panCaptura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresa datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 102, 102))); // NOI18N

        lblUsuarioAcceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuarioAcceso.setForeground(new java.awt.Color(255, 102, 102));
        lblUsuarioAcceso.setText("Usuario");

        lblPasswordAcceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPasswordAcceso.setForeground(new java.awt.Color(255, 102, 102));
        lblPasswordAcceso.setText("Password");

        txtUsuarioAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioAccesoActionPerformed(evt);
            }
        });

        btnEntrarSistema.setBackground(new java.awt.Color(204, 204, 255));
        btnEntrarSistema.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar a sistema");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        panRol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona Rol Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 102, 102))); // NOI18N

        optAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optAdministrador.setForeground(new java.awt.Color(102, 153, 255));
        optAdministrador.setText("Administrador");

        optJugador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optJugador.setForeground(new java.awt.Color(102, 153, 255));
        optJugador.setText("Jugador");

        javax.swing.GroupLayout panRolLayout = new javax.swing.GroupLayout(panRol);
        panRol.setLayout(panRolLayout);
        panRolLayout.setHorizontalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(optAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(optJugador)
                .addGap(65, 65, 65))
        );
        panRolLayout.setVerticalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRolLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAdministrador)
                    .addComponent(optJugador))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout panCapturaLayout = new javax.swing.GroupLayout(panCaptura);
        panCaptura.setLayout(panCapturaLayout);
        panCapturaLayout.setHorizontalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(lblPasswordAcceso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtPasswordAcceso))
                .addGap(97, 97, 97))
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCapturaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCapturaLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnEntrarSistema)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panCapturaLayout.setVerticalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordAcceso)
                    .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrarSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeNB.png"))); // NOI18N
        btnSalir.setText("Salir del Programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Olimpus240NB.png"))); // NOI18N

        lblImgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImgUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnSalir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgLogo)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgLogo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(lblImgUsuario)
                        .addGap(40, 40, 40)
                        .addComponent(btnSalir)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioAccesoActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        conectarBase();//llamada a la conexion de BD
        if (optAdministrador.isSelected()) { //if para usuario administrador
            try {
                String usuarioAcceso=txtUsuarioAcceso.getText();
                String passwordAcceso=txtPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from useradmin");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("user_admin"))&&passwordAcceso.equals(rs.getString("password_admin"))){
                        error=false;

                        CRUDEquipos ventanaCRUDProyecto = new CRUDEquipos();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema Administrador\n"+usuarioAcceso);
                        ventanaCRUDProyecto.setVisible(true);
                        this.hide();
                    }//termina if
                }//termina while
                if(error == true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuarioAcceso.setText(usuarioAcceso);
                    txtPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }
        } else if (optJugador.isSelected()){ //if para usuario vendedor
            try {
                String usuarioAcceso=txtUsuarioAcceso.getText();
                String passwordAcceso=txtPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from userjugador");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("user_jugador"))&&passwordAcceso.equals(rs.getString("password_jugador"))){
                        error=false;

                        AltaConsultaJugador ventanaAltaConsultaLibro = new AltaConsultaJugador();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema Jugador\n"+usuarioAcceso);
                        ventanaAltaConsultaLibro.setVisible(true);
                        this.hide();
                    }//termina if
                }//termina while
                if(error == true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuarioAcceso.setText(usuarioAcceso);
                    txtPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }
        }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje Importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblImgUsuario;
    private javax.swing.JLabel lblPasswordAcceso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioAcceso;
    private javax.swing.JRadioButton optAdministrador;
    private javax.swing.JRadioButton optJugador;
    private javax.swing.JPanel panCaptura;
    private javax.swing.JPanel panRol;
    private javax.swing.JPasswordField txtPasswordAcceso;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
