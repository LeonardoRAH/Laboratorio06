
package pantallas;

public class ListaProfesores extends javax.swing.JFrame {
    private GestorCursos padre;
    
    public ListaProfesores() {
        initComponents();
    }
    
    public ListaProfesores(GestorCursos padre) {
        initComponents();
        this.padre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPrincipalProfesores = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        PantxtBuscar = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        PanListaProfesores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesores = new javax.swing.JList<>();
        lblListaProfesores = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanPrincipalProfesores.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lblTítulo.setText("Profesores de: [Nombre del Curso]");

        PantxtBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        PantxtBuscar.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Lupa.png"))); // NOI18N
        PantxtBuscar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 37));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanListaProfesores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstProfesores.setBorder(null);
        lstProfesores.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstProfesores);

        PanListaProfesores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 160));

        lblListaProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Panel.png"))); // NOI18N
        PanListaProfesores.add(lblListaProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BtnBuscar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSalir.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanPrincipalProfesoresLayout = new javax.swing.GroupLayout(PanPrincipalProfesores);
        PanPrincipalProfesores.setLayout(PanPrincipalProfesoresLayout);
        PanPrincipalProfesoresLayout.setHorizontalGroup(
            PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalProfesoresLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTítulo)
                    .addGroup(PanPrincipalProfesoresLayout.createSequentialGroup()
                        .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar))
                    .addGroup(PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanPrincipalProfesoresLayout.createSequentialGroup()
                            .addComponent(btnSalir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar))
                        .addComponent(PanListaProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        PanPrincipalProfesoresLayout.setVerticalGroup(
            PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalProfesoresLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addGroup(PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanListaProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(PanPrincipalProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(btnAgregar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipalProfesores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanPrincipalProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        cerrar();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked
    
    private void cerrar() {
        this.padre.setLocationRelativeTo(this);
        this.padre.setVisible(true);
        this.setVisible(false);
        
        this.setVisible(true);
        this.dispose();
    }
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBuscar;
    private javax.swing.JPanel PanListaProfesores;
    private javax.swing.JPanel PanPrincipalProfesores;
    private javax.swing.JPanel PantxtBuscar;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblListaProfesores;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JList<String> lstProfesores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
