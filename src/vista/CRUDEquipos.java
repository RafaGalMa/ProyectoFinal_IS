
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
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

public class CRUDEquipos extends javax.swing.JFrame {
    Jugador objJugador = new Jugador (); //generación de objeto
    
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public CRUDEquipos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        lblImgGestion = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        panelEditarBorrar = new javax.swing.JTabbedPane();
        panEliminar = new javax.swing.JPanel();
        lblCapturaId = new javax.swing.JLabel();
        txtRegistroEliminar = new javax.swing.JTextField();
        btnEliminarRegistro = new javax.swing.JButton();
        lblImgLogo2 = new javax.swing.JLabel();
        panEditar = new javax.swing.JPanel();
        lblIdMod = new javax.swing.JLabel();
        txtIdMod = new javax.swing.JTextField();
        lblEquipoMod = new javax.swing.JLabel();
        txtEquipoMod = new javax.swing.JTextField();
        lblApellidoMod = new javax.swing.JLabel();
        txtApellidoMod = new javax.swing.JTextField();
        lblDireccionMod = new javax.swing.JLabel();
        txtDireccionMod = new javax.swing.JTextField();
        btnBuscarRegistro = new javax.swing.JButton();
        btnEditarRegistro = new javax.swing.JButton();
        lbNombreMod = new javax.swing.JLabel();
        txtNombreMod = new javax.swing.JTextField();
        lblImgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgJugador)
                        .addGap(47, 47, 47))))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
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
                            .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addGap(17, 17, 17)
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblImgJugador)
                        .addGap(30, 30, 30)
                        .addComponent(btnRegistrarLibro)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lblSistema.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblSistema.setText("Bienvenido al software de administración del torneo Olimpus 7");

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Equipo", "Nombre", "Apellido", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnActualizar.setText("Actualizar Lista Total de Equipos y Jugadores");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblImgGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionNB.png"))); // NOI18N

        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnReporte.setText("Ver Reporte PDF");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/print.png"))); // NOI18N
        btnImprimir.setText("Imprimir Lista de Equipos");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        panelEditarBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        panEliminar.setBackground(new java.awt.Color(255, 153, 153));

        lblCapturaId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCapturaId.setText("Captura el Id numérico del Registro a eliminar");

        btnEliminarRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminarRegistro.setText("Eliminar Registro");
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        lblImgLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Olimpus240NB.png"))); // NOI18N

        javax.swing.GroupLayout panEliminarLayout = new javax.swing.GroupLayout(panEliminar);
        panEliminar.setLayout(panEliminarLayout);
        panEliminarLayout.setHorizontalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImgLogo2)
                .addGap(121, 121, 121))
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblCapturaId))
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(txtRegistroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnEliminarRegistro)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panEliminarLayout.setVerticalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblImgLogo2)
                .addGap(34, 34, 34)
                .addComponent(lblCapturaId)
                .addGap(27, 27, 27)
                .addComponent(txtRegistroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEliminarRegistro)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelEditarBorrar.addTab("Eliminar Registro", panEliminar);

        panEditar.setBackground(new java.awt.Color(204, 153, 255));

        lblIdMod.setText("Id:");

        txtIdMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdModActionPerformed(evt);
            }
        });

        lblEquipoMod.setText("Equipo:");

        lblApellidoMod.setText("Apellido:");

        lblDireccionMod.setText("Direccion:");

        btnBuscarRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarRegistro.setText("Buscar Registro");
        btnBuscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRegistroActionPerformed(evt);
            }
        });

        btnEditarRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarRegistro.setText("Editar Registro");
        btnEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRegistroActionPerformed(evt);
            }
        });

        lbNombreMod.setText("Nombre:");

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Olimpus240NB.png"))); // NOI18N

        javax.swing.GroupLayout panEditarLayout = new javax.swing.GroupLayout(panEditar);
        panEditar.setLayout(panEditarLayout);
        panEditarLayout.setHorizontalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblImgLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createSequentialGroup()
                                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panEditarLayout.createSequentialGroup()
                                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApellidoMod)
                                            .addComponent(lblDireccionMod)
                                            .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblEquipoMod)
                                                .addComponent(lbNombreMod)))
                                        .addGap(27, 27, 27))
                                    .addGroup(panEditarLayout.createSequentialGroup()
                                        .addComponent(lblIdMod)
                                        .addGap(47, 47, 47)))
                                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdMod)
                                    .addComponent(txtEquipoMod)
                                    .addComponent(txtNombreMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtApellidoMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarRegistro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panEditarLayout.setVerticalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblImgLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdMod))
                        .addGap(18, 18, 18)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEquipoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipoMod))
                        .addGap(18, 18, 18)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreMod))
                        .addGap(18, 18, 18)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoMod))))
                .addGap(18, 18, 18)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionMod))
                .addGap(41, 41, 41)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRegistro)
                    .addComponent(btnEditarRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEditarBorrar.addTab("Editar/Buscar Registro", panEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(btnActualizar))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelEditarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReporte)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnImprimir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblImgGestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(lblSistema)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblSistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEditarBorrar)
                        .addGap(68, 68, 68)
                        .addComponent(btnReporte)
                        .addGap(42, 42, 42)
                        .addComponent(btnImprimir)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelEditarBorrar.getAccessibleContext().setAccessibleName("Eliminar Registro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipoActionPerformed

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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptRegistros.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de Equipos Olimpus 7");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptRegistros.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de Equipos Olimpus 7");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            int registrobaja = Integer.parseInt(txtRegistroEliminar.getText());
            confirmaBaja = stmt.executeUpdate("DELETE FROM equipo WHERE id = '"+registrobaja+"' ");

            if (confirmaBaja == 1 ) {
                JOptionPane.showMessageDialog(null, "Baja del libro exitosamente de la BD\n\n" + registrobaja + "\n\nVerifica consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe Id del libro en la BD\n\n" + registrobaja + "\n\nVerifica consulta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar baja de BD\n\n"+ e);
        }
    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void txtIdModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdModActionPerformed

    private void btnBuscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRegistroActionPerformed

        try {
            conectarBase();
            objJugador.setId(Integer.parseInt(txtIdMod.getText()));
            rs=stmt.executeQuery("SELECT * FROM equipo WHERE id = '"+objJugador.getId()+"' ");

            JOptionPane.showMessageDialog(null, "Buscando Registro... ");
            if (rs.next()==true) {
                txtEquipoMod.setText(rs.getString("nombre_equipo"));
                txtNombreMod.setText(rs.getString("nombre"));
                txtApellidoMod.setText(rs.getString("apellido"));
                txtDireccionMod.setText(rs.getString("direccion"));
            } else {
                JOptionPane.showMessageDialog(null, "Error No existe Registro con ese ID\n\n" + objJugador.getId());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar baja de BD\n\n" + ex);
        }

    }//GEN-LAST:event_btnBuscarRegistroActionPerformed

    private void btnEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRegistroActionPerformed
        try {
            conectarBase();
            PreparedStatement pst = cn.prepareStatement("UPDATE equipo SET nombre_equipo='"+txtEquipoMod.getText()+"',nombre='"+txtNombreMod.getText()+"',apellido='"+txtApellidoMod.getText()+"',direccion='"+txtDireccionMod.getText()+"' WHERE id='"+txtIdMod.getText()+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Modificados Exitosamente\n\n");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnEditarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarRegistro;
    private javax.swing.JButton btnEditarRegistro;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lbNombreMod;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoMod;
    private javax.swing.JLabel lblCapturaId;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionMod;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblEquipoMod;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdMod;
    private javax.swing.JLabel lblImgGestion;
    private javax.swing.JLabel lblImgJugador;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblImgLogo2;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JPanel panEditar;
    private javax.swing.JPanel panEliminar;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JTabbedPane panelEditarBorrar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoMod;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionMod;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtEquipoMod;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdMod;
    private javax.swing.JTextField txtJugador;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtRegistroEliminar;
    // End of variables declaration//GEN-END:variables
}
