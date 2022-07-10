
package proyectofinalds3;

import empleados.Empleado;
import java.awt.BorderLayout;
import java.awt.Color;
import planilla.EmpPlanilla;
import utilmax.*;

public class PanelEmpleadoPlanilla extends javax.swing.JPanel {

    public PanelEmpleadoPlanilla() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        txtHrsTrabajadas = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtSegundoNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtBuscarCedula = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        btnFind2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JPanel();
        btnAddEmpleadoToPlanilla = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarDatosPlanilla = new javax.swing.JLabel();
        txtSalxHora = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        btnCerrar.setBackground(new java.awt.Color(221, 221, 221));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        txtPrimerNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerNombre.setToolTipText("Ingrese el primer nombre");
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Primer Nombre");

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Segundo Nombre");

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Primer Apellido");

        txtPrimerApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerApellido.setToolTipText("Ingrese el primer apellido");
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setEnabled(false);

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Horas Trabajadas");

        txtHrsTrabajadas.setBackground(new java.awt.Color(244, 244, 244));
        txtHrsTrabajadas.setForeground(new java.awt.Color(153, 153, 153));
        txtHrsTrabajadas.setToolTipText("Ingrese la direccion");
        txtHrsTrabajadas.setBorder(null);
        txtHrsTrabajadas.setEnabled(false);

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Salario por Hora");

        txtSegundoApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoApellido.setToolTipText("Ingrese el telefono");
        txtSegundoApellido.setBorder(null);
        txtSegundoApellido.setEnabled(false);

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));

        txtSegundoNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoNombre.setToolTipText("Ingrese el segundo nombre");
        txtSegundoNombre.setBorder(null);
        txtSegundoNombre.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2022/06/27");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Busqueda de Empleado");

        txtBuscarCedula.setBackground(new java.awt.Color(244, 244, 244));
        txtBuscarCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarCedula.setText("Ingrese la cedula");
        txtBuscarCedula.setBorder(null);
        txtBuscarCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarCedulaMousePressed(evt);
            }
        });
        txtBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCedulaActionPerformed(evt);
            }
        });

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setBackground(new java.awt.Color(244, 244, 244));

        btnFind2.setForeground(new java.awt.Color(0, 0, 0));
        btnFind2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        btnFind2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFind2btnFindMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFind2btnFindMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFind2btnFindMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFind2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(btnFind2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Segundo Apellido");

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnAddEmpleadoToPlanilla.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        btnAddEmpleadoToPlanilla.setForeground(new java.awt.Color(0, 0, 0));
        btnAddEmpleadoToPlanilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddEmpleadoToPlanilla.setText("Agregar");
        btnAddEmpleadoToPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmpleadoToPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddEmpleadoToPlanillaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddEmpleadoToPlanilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addComponent(btnAddEmpleadoToPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnRegresar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegresar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnRegresarDatosPlanilla.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        btnRegresarDatosPlanilla.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarDatosPlanilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresarDatosPlanilla.setText("Regresar");
        btnRegresarDatosPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarDatosPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarDatosPlanillaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarDatosPlanilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addComponent(btnRegresarDatosPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtSalxHora.setBackground(new java.awt.Color(244, 244, 244));
        txtSalxHora.setForeground(new java.awt.Color(153, 153, 153));
        txtSalxHora.setToolTipText("Ingrese el telefono");
        txtSalxHora.setBorder(null);
        txtSalxHora.setEnabled(false);
        txtSalxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalxHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17)
                        .addComponent(txtPrimerApellido)
                        .addComponent(jSeparator12)
                        .addComponent(txtSegundoNombre)
                        .addComponent(jSeparator11)
                        .addComponent(txtPrimerNombre)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel20))
                    .addComponent(jLabel21)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator15)
                        .addComponent(txtHrsTrabajadas, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHrsTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarDatosPlanillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarDatosPlanillaMousePressed
        
        PanelBtnCrear obj = new PanelBtnCrear();
        obj.setSize(1020, 780);
        obj.setLocation(0, 0);

        this.removeAll();
        this.add(obj, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnRegresarDatosPlanillaMousePressed

    private void btnAddEmpleadoToPlanillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmpleadoToPlanillaMousePressed
        // TODO add your handling code here:
        
          String errors=verificarTodos();
          if(errors.length()>0){   
             String msg="Se han encontrado los siguientes errores:\n";
             msg+=errors;
             Utilitario.erro(msg,null);
         }
         else{
         
                Utilitario.erro("se inserto",null);
          }
    }//GEN-LAST:event_btnAddEmpleadoToPlanillaMousePressed

    private void btnFind2btnFindMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFind2btnFindMousePressed

    }//GEN-LAST:event_btnFind2btnFindMousePressed

    private void btnFind2btnFindMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFind2btnFindMouseExited
        btnBuscar.setBackground(new Color(244,244,244));
    }//GEN-LAST:event_btnFind2btnFindMouseExited

    private void btnFind2btnFindMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFind2btnFindMouseEntered
        btnBuscar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnFind2btnFindMouseEntered

    private void txtBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCedulaActionPerformed

    private void txtBuscarCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCedulaMousePressed

    }

    private void txtSegundoNombreMousePressed(java.awt.event.MouseEvent evt) {
            // No se usa pero no me deja borrarlo como que se bugueo xd
    }//GEN-LAST:event_txtBuscarCedulaMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        btnCerrar.setBackground(new Color(221,221,221));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void txtSalxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalxHoraActionPerformed

    
    
    //utilidades
     public String verificarTodos(){
         String err="";
          String pN=txtPrimerNombre.getText();
          String sN=txtSegundoNombre.getText();
          String pA=txtPrimerApellido.getText();
          String sA=txtSegundoApellido.getText();
          String hT=txtHrsTrabajadas.getText();
        String sH=txtSalxHora.getText();
          String ar[]={
           
             pN,
             sN,
             pA,
             sA,
             hT,
             sH
            
          };
          
          String def[]={
              "el campo primer Nombre esta vacio",
               "el campo segundo Nombre esta vacio",
                "el campo primer Apellido esta vacio",
                 "el campo segundo Apellido esta vacio",
                  "el campo horasTrabajadas esta vacio",
                   "el campo salario por hora esta vacio"
                 
          };
        
 
        
           for(int i=0;i<=ar.length-1;i++){
                   if(Utilitario.estaVacia(ar[i])){
                       
                           err+=def[i];
                           err+="\n";
                          
                     }
                }
        
        
            //campos numerios
            if(pN.matches(".*[0-9].*")){
                 err+="el primer Nombre no puede ser numérico";
                      err+="\n";
            }
            
            if(sN.matches(".*[0-9].*")){
                 err+="el segundo Nombre no puede ser numérico";
                      err+="\n";
            }
            
              if(pA.matches(".*[0-9].*")){
                 err+="el primer Apellido no puede ser numérico";
                      err+="\n";
            }
             if(sA.matches(".*[0-9].*")){
                 err+="el segundo Apellido no puede ser numérico";
                      err+="\n";
            }
             
            
           
 
        
        
        
        return err;
    
    }
    
    public void cargarForm(String vals[]){
        
        
          txtPrimerNombre.setText(vals[1]);
          txtSegundoNombre.setText(vals[2]);
          txtPrimerApellido.setText(vals[3]);
          txtSegundoApellido.setText(vals[4]);
          txtHrsTrabajadas.setText(vals[5]);
           txtSalxHora.setText(vals[6]);
    }
    
    
    public void limpiarForm(){
        
          txtPrimerNombre.setText("");
          txtSegundoNombre.setText("");
          txtPrimerApellido.setText("");
          txtSegundoApellido.setText("");
          txtHrsTrabajadas.setText("");
           txtSalxHora.setText("");
    }
    

    
    

      public void onPn(){
        txtPrimerNombre.setEnabled(true);
    }
      
        public void offPn(){
        txtPrimerNombre.setEnabled(false);
    }

        public void onSn(){
        txtSegundoNombre.setEnabled(true);
    }
      
        public void offSn(){
        txtSegundoNombre.setEnabled(false);
    }
        
        public void onPa(){
        txtPrimerApellido.setEnabled(true);
    }
      
        public void offPa(){
        txtPrimerApellido.setEnabled(false);
    }
        
        public void onSa(){
        txtSegundoApellido.setEnabled(true);
    }
      
        public void offSa(){
        txtSegundoApellido.setEnabled(false);
    }
        
        
      
      
        
        public void enableTxt(){
           
              txtPrimerNombre.setEnabled(true);
                txtSegundoNombre.setEnabled(true);
                 txtPrimerApellido.setEnabled(true);
                  txtSegundoApellido.setEnabled(true);
                  txtHrsTrabajadas.setEnabled(true);
                   txtSalxHora.setEnabled(true);
                 
        }
        
          public void disableTxt(){
           
              txtPrimerNombre.setEnabled(false);
                txtSegundoNombre.setEnabled(false);
                 txtPrimerApellido.setEnabled(false);
                  txtSegundoApellido.setEnabled(false);
                      
        }
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddEmpleadoToPlanilla;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel btnFind2;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarDatosPlanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JTextField txtBuscarCedula;
    private javax.swing.JTextField txtHrsTrabajadas;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSalxHora;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables
}
