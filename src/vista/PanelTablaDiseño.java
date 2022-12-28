
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelTablaDiseño extends JFrame{
    
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable tabla;
    
    public PanelTablaDiseño(){
        UnirComponentes();
    }
    private void UnirComponentes(){
        
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tabla = new JTable();

        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(0, 0, 0));
        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "DATOS USUARIO", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", 1, 18), new Color(255, 255, 255)));
        jPanel1.setForeground(new Color(255, 255, 255));

        jPanel2 = new JPanel();
        jPanel2.setBackground(new Color(0, 0, 0));
        jPanel2.setBorder(BorderFactory.createTitledBorder(null, "TABLA", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 18), new Color(255, 255, 255)));

        tabla.setModel(new DefaultTableModel(new Object[][]{},new String[]{"Alias", "Nombres", "Apellidos", "Email", "Celular", "Contraseña", "Fecha de nacimiento"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, Double.class, String.class, String.class};
            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });

        jScrollPane1.setViewportView(tabla);

    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    
    
}
