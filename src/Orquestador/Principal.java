
package Orquestador;


import controlador.Controlador;
import vista.BotonesDiseño;
import vista.LblTxtDiseño;
import vista.PanelTablaDiseño;
import vista.VistaPrincipal;


public class Principal {
    public static void main(String args[]) {
     BotonesDiseño boton = new BotonesDiseño();
      LblTxtDiseño label = new  LblTxtDiseño();
      PanelTablaDiseño panel = new PanelTablaDiseño();
      VistaPrincipal vista = new VistaPrincipal(label, boton, panel);
      Controlador controlador = new Controlador(vista);
      vista.setVisible(true);
      vista.setLocationRelativeTo(null);
    
    }
    
    
}
