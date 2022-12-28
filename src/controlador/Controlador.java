
package controlador;

import Acceso.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.UsuarioTO;
import vista.BotonesDiseño;
import vista.LblTxtDiseño;
import vista.PanelTablaDiseño;
import vista.VistaPrincipal;

public class Controlador implements ActionListener {
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    UsuarioTO usuarioTO = new UsuarioTO();
    BotonesDiseño boton = new BotonesDiseño();
    LblTxtDiseño label = new  LblTxtDiseño();
    PanelTablaDiseño panel = new PanelTablaDiseño();
    VistaPrincipal vista = new VistaPrincipal(label,boton,panel);
    DefaultTableModel modelo = new DefaultTableModel();
    
   
    
    
    public Controlador(VistaPrincipal vista){
        this.vista = vista;
        this.vista.boton.getBtnListar().addActionListener(this);
        this.vista.boton.getBtnGuardar().addActionListener(this);
        this.vista.boton.getBtnEditar().addActionListener(this);
        this.vista.boton.getBtnActualizar().addActionListener(this);
        this.vista.boton.getBtnEliminar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.boton.getBtnListar()){
            limpiarTabla();
            listar(vista.panel.getTabla());
        }if(ae.getSource() == vista.boton.getBtnGuardar()) {
            agregar();
            limpiarTabla();
            listar(vista.panel.getTabla());
            limpiarCeldas();
        }if(ae.getSource() == vista.boton.getBtnEditar()){
          editar();
        }if(ae.getSource() == vista.boton.getBtnActualizar()){
            actualizar();
            limpiarTabla();
            listar(vista.panel.getTabla());
            limpiarCeldas();
        }if(ae.getSource() == vista.boton.getBtnEliminar()){
            eliminar();
            limpiarTabla();
            listar(vista.panel.getTabla());

        }
    }
    
    public void listar (JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();  //permite que la tabla se muestre al ejercutar.
        List<UsuarioTO> lista= usuarioDAO.Listar();
        
        Object[] arregloDatosUsuario = new Object[7];
        
        for(int i=0;i<lista.size();i++){ //el tamaño de la lista de objetos que tengamos.
            
        arregloDatosUsuario[0]=lista.get(i).getAlias(); //muestra el alias del usuario i.
        arregloDatosUsuario[1]=lista.get(i).getNombres(); //muestra el nombre del usuario i.
        arregloDatosUsuario[2]=lista.get(i).getApellidos(); //muestra el apellido del usuario i.
        arregloDatosUsuario[3]=lista.get(i).getEmail(); //muestra el email del usuario i.
        arregloDatosUsuario[4]=lista.get(i).getCelular(); //muestra el celular del usuario i.
        arregloDatosUsuario[5]=lista.get(i).getContraseña(); //muestra el contraseña del usuario i.
        arregloDatosUsuario[6]=lista.get(i).getNacimiento(); //muestra el Nacimiento del usuario i.
        
        modelo.addRow(arregloDatosUsuario);
    }
        vista.panel.getTabla().setModel(modelo);
    }
    
    public void agregar(){
        String alias = vista.label.getTxtAlias().getText();
        String nombres = vista.label.getTxtNombres().getText();
        String apellidos =vista.label.getTxtApellidos().getText();
        String email = vista.label.getTxtEmail().getText();
        String celular = vista.label.getTxtCelular().getText();
        String contraseña =vista.label.getTxtContraseña().getText();
        String nacimiento = vista.label.getTxtNacimiento().getText();
        
        String [] campoVacio = new String [7];
        campoVacio[0] = alias;
        campoVacio[1] = nombres;
        campoVacio[2] = apellidos;
        campoVacio[3] = email;
        campoVacio[4] = celular;
        campoVacio[5] = contraseña;
        campoVacio[6] = nacimiento;
        
        boolean bandera = true;
       
        for (String i : campoVacio) {
            if (i.length() == 0) {
                bandera = false;
            }
        }
        
        if (bandera == false) {
            JOptionPane.showMessageDialog(vista, "Debe llenar cada campo para agregar usuario.");
        } else {
            try {
                usuarioTO.setAlias(alias);
                usuarioTO.setNombres(nombres);
                usuarioTO.setApellidos(apellidos);
                usuarioTO.setEmail(email);
                usuarioTO.setCelular(celular);
                usuarioTO.setContraseña(contraseña);
                usuarioTO.setNacimiento(nacimiento);

                int numeroAgregados = usuarioDAO.Agregar(usuarioTO);
                if (numeroAgregados == 1) {
                    JOptionPane.showMessageDialog(vista, "Usuario agregado con exito.");
                } else {
                    JOptionPane.showMessageDialog(vista, "El usuario NO fue agregado con exito.");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(vista, "Debe ingresar números en el campo Celular.");
            }
        }

        
    }
    void limpiarTabla() {
        for (int i = 0; i < vista.panel.getTabla().getRowCount(); i++) {//cuenta todas las filas de la tabla
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void actualizar(){
        String alias = vista.label.getTxtAlias().getText();
        String nombres = vista.label.getTxtNombres().getText();
        String apellidos = vista.label.getTxtApellidos().getText();
        String email = vista.label.getTxtEmail().getText();
        String celular = vista.label.getTxtCelular().getText();
        String contraseña = vista.label.getTxtContraseña().getText();
        String nacimiento = vista.label.getTxtNacimiento().getText();
        
         String [] campoVacio = new String [7];
        campoVacio[0] = alias;
        campoVacio[1] = nombres;
        campoVacio[2] = apellidos;
        campoVacio[3] = email;
        campoVacio[4] = celular;
        campoVacio[5] = contraseña;
        campoVacio[6] = nacimiento;
        
        boolean bandera = true;
       
        for (String i : campoVacio) {
            if (i.length() == 0) {
                bandera = false;
            }
        }
        
        if (bandera == false) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila y editar.");
        } else {
            try {
                usuarioTO.setAlias(alias);
                usuarioTO.setNombres(nombres);
                usuarioTO.setApellidos(apellidos);
                usuarioTO.setEmail(email);
                usuarioTO.setCelular(celular);
                usuarioTO.setContraseña(contraseña);
                usuarioTO.setNacimiento(nacimiento);
                vista.label.getTxtAlias().setEditable(true);

                int resultado = usuarioDAO.Actualizar(usuarioTO);
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(vista, "Usuario actualizado con exito.");
                } else {
                    JOptionPane.showMessageDialog(vista, "El usuario NO fue actualizado.");
                }
            }
                catch (Exception e){
                JOptionPane.showMessageDialog(vista, "Debe ingresar números en el campo Celular.");
            }

            
        }
    }

    public void eliminar(){
         int fila = vista.panel.getTabla().getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Seleccione un usuario.");
            } else {
                String alias = (String)vista.panel.getTabla().getValueAt(fila, 0);
                usuarioDAO.Eliminar(alias);
                JOptionPane.showMessageDialog(vista, "El usuario ha sido eliminado con exito.");
            }
    }
    
    public void editar(){
         int fila = vista.panel.getTabla().getSelectedRow();
            if(fila == -1){
                JOptionPane.showMessageDialog(vista,"Seleccione una fila.");
            } else{
                String alias = (String)vista.panel.getTabla().getValueAt(fila, 0);
                String nombres =(String)vista.panel.getTabla().getValueAt(fila, 1);
                String apellidos =(String)vista.panel.getTabla().getValueAt(fila, 2);
                String email =(String)vista.panel.getTabla().getValueAt(fila, 3);
                Double celular =(Double)vista.panel.getTabla().getValueAt(fila, 4);
                String contraseña =(String)vista.panel.getTabla().getValueAt(fila, 5);
                String nacimiento =(String)vista.panel.getTabla().getValueAt(fila, 6);
                
                vista.label.getTxtAlias().setText(alias);
                vista.label.getTxtAlias().setEditable(false);
                vista.label.getTxtNombres().setText(nombres);
                vista.label.getTxtApellidos().setText(apellidos);
                vista.label.getTxtEmail().setText(email);
                vista.label.getTxtCelular().setText(""+celular);
                vista.label.getTxtContraseña().setText(contraseña);
                vista.label.getTxtNacimiento().setText(nacimiento);
            }
    }
    
    public void limpiarCeldas(){
        vista.label.getTxtAlias().setText(null);
        vista.label.getTxtNombres().setText(null);
        vista.label.getTxtApellidos().setText(null);
        vista.label.getTxtEmail().setText(null);
        vista.label.getTxtCelular().setText(null);
        vista.label.getTxtContraseña().setText(null);
        vista.label.getTxtNacimiento().setText(null);
    }
    
}
    
    

