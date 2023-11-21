/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import GritonClientSocket.*;
import javax.swing.JOptionPane;


/**
 *
 * @author lopez
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    GestionDeGrupo gestor = new GestionDeGrupo();
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    public GestionDeGrupo getGestor() {
        return gestor;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresarGasto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnListarPersonas = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestión de gastos grupales.");

        jLabel2.setText("Numero de personas del grupo");

        btnIngresar.setText("Ingresar personas");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese un gasto");

        jLabel4.setText("Categoria");

        jLabel5.setText("Valor");

        jLabel6.setText("Referencia");

        btnIngresarGasto.setText("Ingresar gasto");
        btnIngresarGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarGastoActionPerformed(evt);
            }
        });

        jLabel8.setText("Cedula");

        btnListarPersonas.setText("Listar personas");
        btnListarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnIngresarGasto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel4)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumeroPersonas))
                                .addGap(59, 59, 59)
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(btnListarPersonas)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar)
                            .addComponent(btnListarPersonas))))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnIngresarGasto)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try{
            int numeroPersonas = Integer.parseInt(txtNumeroPersonas.getText());
            for(int i=0;i<numeroPersonas;i++){
                IngresoPersonas personas = new IngresoPersonas(this, true);
                personas.setVisible(true);
                String nombre = personas.enviarPersona().getNombre();
                String cedula = personas.enviarPersona().getCedula();
                gestor.agregarPersona(nombre, cedula);
                txtNumeroPersonas.setText("");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Valor ingresado no es numérico.");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarGastoActionPerformed
        String cedula;
        if(gestor.validarCedula(cedula = txtCedula.getText())){
            String categoria = txtCategoria.getText();
            String referencia = txtReferencia.getText();
            int valor;
            try{
                valor = Integer.parseInt(txtValor.getText());
                Gasto gasto = new Gasto(categoria, referencia, valor);
                gestor.agregarGasto(gasto, cedula);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Gasto agregado exitosamente.");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Valor ingresado no valido, debe ingresar un número.");
            }
        }else{
            JOptionPane.showMessageDialog(this,"La cedula ingresada no es de nadie del grupo, por favor, verifique la información.");
        }
        
    }//GEN-LAST:event_btnIngresarGastoActionPerformed

    private void btnListarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPersonasActionPerformed
        gestor.listarPersonas();
    }//GEN-LAST:event_btnListarPersonasActionPerformed

    public void limpiarCampos(){
        txtCedula.setText("");
        txtCategoria.setText("");
        txtReferencia.setText("");
        txtValor.setText("");
    }
    
    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresarGasto;
    private javax.swing.JButton btnListarPersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
