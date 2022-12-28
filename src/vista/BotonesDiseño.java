
package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonesDiseño extends JFrame {

    private JButton btnActualizar;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnGuardar;
    private JButton btnListar;

    public BotonesDiseño() {
        UnirComponentes();
    }

    private void UnirComponentes() {
        
        btnGuardar = new JButton();
        btnGuardar.setFont(new Font("Tahoma", 1, 16));
        btnGuardar.setText("Guardar");
        
        
        btnListar = new JButton();
        btnListar.setFont(new Font("Tahoma", 1, 16));
        btnListar.setText("Listar");

        btnEditar = new JButton();
        btnEditar.setFont(new Font("Tahoma", 1, 16)); 
        btnEditar.setText("Editar");
        
        
        btnActualizar = new JButton();
        btnActualizar.setFont(new Font("Tahoma", 1, 16));
        btnActualizar.setText("Actualizar");

        btnEliminar = new javax.swing.JButton();
        btnEliminar.setFont(new Font("Tahoma", 1, 16)); 
        btnEliminar.setText("Eliminar");


    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }
    
    

}
