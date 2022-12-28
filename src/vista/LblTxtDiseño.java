
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LblTxtDiseño extends JFrame{
    
    private JLabel lblAlias;
    private JLabel lblApellidos;
    private JLabel lblCelular;
    private JLabel lblContraseña;
    private JLabel lblEmail;
    private JLabel lblNacimiento;
    private JLabel lblNombres;
    
    private JTextField txtAlias;
    private JTextField txtApellidos;
    private JTextField txtCelular;
    private JTextField txtContraseña;
    private JTextField txtEmail;
    private JTextField txtNacimiento;
    private JTextField txtNombres;
    
    
    
    public LblTxtDiseño(){
        UnirComponentes();
    }
    
    private void UnirComponentes(){
        
        lblAlias = new JLabel();
        lblAlias.setFont(new Font("Sitka Text", 0, 14));
        lblAlias.setForeground(new Color(255, 255, 255));
        lblAlias.setText("Alias: ");

        lblNombres = new JLabel();
        lblNombres.setFont(new Font("Sitka Text", 0, 14));
        lblNombres.setForeground(new Color(255, 255, 255));
        lblNombres.setText("Nombres: ");

        lblApellidos = new JLabel();
        lblApellidos.setFont(new Font("Sitka Text", 0, 14));
        lblApellidos.setForeground(new Color(255, 255, 255));
        lblApellidos.setText("Apellidos: ");

        lblEmail = new JLabel();
        lblEmail.setFont(new Font("Sitka Text", 0, 14));
        lblEmail.setForeground(new Color(255, 255, 255));
        lblEmail.setText("Email: ");

        lblContraseña = new JLabel();
        lblContraseña.setFont(new Font("Sitka Text", 0, 14));
        lblContraseña.setForeground(new Color(255, 255, 255));
        lblContraseña.setText("Contraseña: ");

        lblCelular = new JLabel();
        lblCelular.setFont(new Font("Sitka Text", 0, 14));
        lblCelular.setForeground(new Color(255, 255, 255));
        lblCelular.setText("Celular:");

        lblNacimiento = new JLabel();
        lblNacimiento.setFont(new Font("Sitka Text", 0, 14));
        lblNacimiento.setForeground(new Color(255, 255, 255));
        lblNacimiento.setText("Fecha de nacimiento:");

        txtAlias = new JTextField();
        txtNombres = new JTextField();
        txtApellidos = new JTextField();
        txtEmail = new JTextField();
        txtCelular = new JTextField();
        txtContraseña = new JTextField();
        txtNacimiento = new JTextField();

    }

    public JLabel getLblAlias() {
        return lblAlias;
    }

    public void setLblAlias(JLabel lblAlias) {
        this.lblAlias = lblAlias;
    }

    public JLabel getLblApellidos() {
        return lblApellidos;
    }

    public void setLblApellidos(JLabel lblApellidos) {
        this.lblApellidos = lblApellidos;
    }

    public JLabel getLblCelular() {
        return lblCelular;
    }

    public void setLblCelular(JLabel lblCelular) {
        this.lblCelular = lblCelular;
    }

    public JLabel getLblContraseña() {
        return lblContraseña;
    }

    public void setLblContraseña(JLabel lblContraseña) {
        this.lblContraseña = lblContraseña;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

    public JLabel getLblNacimiento() {
        return lblNacimiento;
    }

    public void setLblNacimiento(JLabel lblNacimiento) {
        this.lblNacimiento = lblNacimiento;
    }

    public JLabel getLblNombres() {
        return lblNombres;
    }

    public void setLblNombres(JLabel lblNombres) {
        this.lblNombres = lblNombres;
    }

    public JTextField getTxtAlias() {
        return txtAlias;
    }

    public void setTxtAlias(JTextField txtAlias) {
        this.txtAlias = txtAlias;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(JTextField txtCelular) {
        this.txtCelular = txtCelular;
    }

    public JTextField getTxtContraseña() {
        return txtContraseña;
    }

    public void setTxtContraseña(JTextField txtContraseña) {
        this.txtContraseña = txtContraseña;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtNacimiento() {
        return txtNacimiento;
    }

    public void setTxtNacimiento(JTextField txtNacimiento) {
        this.txtNacimiento = txtNacimiento;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }
    
    
    

}
