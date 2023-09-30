
package pantallas;
import entidades.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GestorCursos extends javax.swing.JFrame {
    
    private List<Curso> cursos = new ArrayList<Curso>();
    private DefaultListModel listaCursos = new DefaultListModel();
    
    public GestorCursos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPrincipal = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        PantxtBuscar = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        PanListaGestor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        lblGestor = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JLabel();
        btnProfesor = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnEstudiantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(570, 380));

        PanPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lblTítulo.setText("Gestor de Cursos");

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

        PanListaGestor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstCursos.setBorder(null);
        lstCursos.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstCursos);

        PanListaGestor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 160));

        lblGestor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Panel.png"))); // NOI18N
        PanListaGestor.add(lblGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BtnBuscar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });

        btnProfesor.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnProfesor.setForeground(new java.awt.Color(255, 255, 255));
        btnProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Profesores.png"))); // NOI18N
        btnProfesor.setText("Profesores");
        btnProfesor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfesorMouseClicked(evt);
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

        btnEstudiantes.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Estudiantes.png"))); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstudiantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanPrincipalLayout = new javax.swing.GroupLayout(PanPrincipal);
        PanPrincipal.setLayout(PanPrincipalLayout);
        PanPrincipalLayout.setHorizontalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTítulo)
                    .addGroup(PanPrincipalLayout.createSequentialGroup()
                        .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar))
                    .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanPrincipalLayout.createSequentialGroup()
                            .addComponent(btnProfesor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEstudiantes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar))
                        .addComponent(PanListaGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        PanPrincipalLayout.setVerticalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanListaGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProfesor)
                        .addComponent(btnAgregar)
                        .addComponent(btnEstudiantes)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        EditarCurso pantalla = new EditarCurso(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
        if(listaCursos.isEmpty()) {
            JOptionPane.showMessageDialog( 
                    this,
                    "No hay cursos");
        }
        
        int index = lstCursos.getSelectedIndex();
        if(index == -1){
            JOptionPane.showMessageDialog(
                    this, 
                    "Seleccione un curso");
        }else {
            cursos.remove(index);
            listaCursos.remove(index);
            
            lstCursos.setModel(listaCursos); 
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        txtBuscar.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
            }

            public void removeUpdate(DocumentEvent e) {
                if (txtBuscar.getText().trim().isEmpty()) {
                    lstCursos.setModel(listaCursos);
                }
            }

            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        String textoBusqueda = txtBuscar.getText().trim().toLowerCase();

        if (textoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Ingrese el término que desee buscar ", 
                    "Campo de búsqueda vacío", 
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            DefaultListModel resultadosModel = new DefaultListModel(); 

            for (Curso curso : cursos) {
                String codigoCur = 
                        curso.getCodigoCur().toLowerCase(); 
                
                String nombreCur =
                        curso.getNombreCur().toLowerCase();
            
                if (codigoCur.contains(textoBusqueda) || 
                        nombreCur.contains(textoBusqueda))
                {
                    resultadosModel.addElement(
                            curso.getTextoCur()); 
                }
            }
        
            if (resultadosModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "No se encontraron resultados"
                                + " para la búsqueda.",
                        "Sin resultados", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            
                // Restablece el modelo original
                lstCursos.setModel(listaCursos);
            } else {
                // Configura el modelo de resultados
                lstCursos.setModel(resultadosModel);
            }
        }
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void btnProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMouseClicked
        ListaProfesores pantalla2 = new ListaProfesores(this);
        pantalla2.setLocationRelativeTo(this);
        pantalla2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfesorMouseClicked

    private void btnEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudiantesMouseClicked
        ListaEstudiantes pantalla2 = new ListaEstudiantes(this);
        pantalla2.setLocationRelativeTo(this);
        pantalla2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstudiantesMouseClicked
    
    public void AgregarCursos(Curso curso){
        cursos.add(curso);
        listaCursos.addElement(curso.getTextoCur());
        lstCursos.setModel(listaCursos);
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBuscar;
    private javax.swing.JPanel PanListaGestor;
    private javax.swing.JPanel PanPrincipal;
    private javax.swing.JPanel PantxtBuscar;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnEstudiantes;
    private javax.swing.JLabel btnProfesor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblGestor;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
