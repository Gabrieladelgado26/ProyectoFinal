/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.ControladorLogin;
import DAO.DAOLogin;
import javax.swing.JOptionPane;

/**
 *Esta clase inicia la interfaz grafica del login (iniciar seción)
 * @author gabriela Delgado
 * Version: 1.0
 */
public class Login extends javax.swing.JFrame {

    // En esta variable se guardara el estado de la clase Login
    private static Login login;
    
    // En esta variable se guardara el estado de la clase ControladorLogin
    private DAOLogin cLogin = ControladorLogin.getControlaodrLogin();
    
    /**
     * Constructo de tipo privado en la clase lOGIN
     */
    private Login() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }
    
    /**
     * Devuelve una instancia de la clase Login
     * @return login
     */
    public static Login getLogin(){
        if(login == null){
            login = new Login();
        }
        return login;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        olvido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        contrasenia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        olvido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olvido.setText("¿Olvido su contraseña?");
        olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidoMouseExited(evt);
            }
        });
        getContentPane().add(olvido, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Logo");
        jPanel1.add(jLabel6);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        usuario.setText("Usuario...");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(usuario);

        contrasenia.setText("Contraseña");
        contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseniaMouseClicked(evt);
            }
        });
        jPanel2.add(contrasenia);

        jButton1.setText("Iniciar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    // Aqui se realiza la verificacion con los parametro de usuario y contraseña
    // Utilizamos un condicional if para la verificación
        
        if (cLogin.VerificarUsuarios(usuario.getText(), contrasenia.getText()))
            JOptionPane.showMessageDialog(this, "Usuario correcto", "Información", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Información", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // No se ha realizado nada
    }//GEN-LAST:event_usuarioActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        // Se utiliza para que al momento de presionar el textfield se borre el texto que ya esta
        usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaMouseClicked
        // TODO add your handling code here:
        // Se utiliza para que al momento de presionar el textfield se borre el texto que ya esta
        contrasenia.setText("");
    }//GEN-LAST:event_contraseniaMouseClicked

    private void olvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseEntered
        // Color de texto en el boton
        olvido.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_olvidoMouseEntered

    private void olvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseExited
        // Color de texto en el boton
        olvido.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_olvidoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasenia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel olvido;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}