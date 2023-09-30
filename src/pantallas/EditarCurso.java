
package pantallas;

import entidades.Curso;

public class EditarCurso extends javax.swing.JFrame {
    
    private GestorCursos padre;
    
    public EditarCurso() {
        initComponents();
    }
    
    public EditarCurso(GestorCursos padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanEditarCurso = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        PantxtCodigoCur = new javax.swing.JPanel();
        txtCodigoCur = new javax.swing.JTextField();
        lblCodigoCur = new javax.swing.JLabel();
        PantxtCreditosCur = new javax.swing.JPanel();
        txtCreditosCur = new javax.swing.JTextField();
        lblCreditosCur = new javax.swing.JLabel();
        PantxtNombreCur = new javax.swing.JPanel();
        txtNombreCur = new javax.swing.JTextField();
        lblNombreCur = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanEditarCurso.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lblTítulo.setText("[Nombre del Curso]");

        PantxtCodigoCur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoCur.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtCodigoCur.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigoCur.setText("codigo");
        txtCodigoCur.setBorder(null);
        PantxtCodigoCur.add(txtCodigoCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblCodigoCur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtCodigoCur.add(lblCodigoCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PantxtCreditosCur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCreditosCur.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtCreditosCur.setForeground(new java.awt.Color(102, 102, 102));
        txtCreditosCur.setText("créditos");
        txtCreditosCur.setBorder(null);
        PantxtCreditosCur.add(txtCreditosCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblCreditosCur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtCreditosCur.add(lblCreditosCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PantxtNombreCur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreCur.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtNombreCur.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreCur.setText("nombre");
        txtNombreCur.setBorder(null);
        PantxtNombreCur.add(txtNombreCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblNombreCur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtNombreCur.add(lblNombreCur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Agregar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Eliminar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanEditarCursoLayout = new javax.swing.GroupLayout(PanEditarCurso);
        PanEditarCurso.setLayout(PanEditarCursoLayout);
        PanEditarCursoLayout.setHorizontalGroup(
            PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanEditarCursoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTítulo)
                    .addComponent(PantxtCodigoCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PantxtCreditosCur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanEditarCursoLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(PantxtNombreCur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanEditarCursoLayout.setVerticalGroup(
            PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanEditarCursoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addComponent(PantxtCodigoCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PantxtCreditosCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PantxtNombreCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanEditarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanEditarCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String codigo = txtCodigoCur.getText();
        String creditosTexto = txtCreditosCur.getText();
        int creditos = Integer.parseInt(creditosTexto);
        String nombre = txtNombreCur.getText();
        
        Curso curso = new Curso (codigo, nombre, creditos);
        
        this.padre.AgregarCursos(curso);
        cerrar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        cerrar();
    }//GEN-LAST:event_btnCancelarMouseClicked

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
                new EditarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanEditarCurso;
    private javax.swing.JPanel PantxtCodigoCur;
    private javax.swing.JPanel PantxtCreditosCur;
    private javax.swing.JPanel PantxtNombreCur;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel lblCodigoCur;
    private javax.swing.JLabel lblCreditosCur;
    private javax.swing.JLabel lblNombreCur;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTextField txtCodigoCur;
    private javax.swing.JTextField txtCreditosCur;
    private javax.swing.JTextField txtNombreCur;
    // End of variables declaration//GEN-END:variables
}
