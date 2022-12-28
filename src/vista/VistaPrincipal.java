
package vista;
import java.awt.Color;
import java.awt.Font;
import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class VistaPrincipal extends JFrame {
    
    public BotonesDiseño boton; 
    public LblTxtDiseño label;
    public PanelTablaDiseño panel; 

    public VistaPrincipal(LblTxtDiseño label, BotonesDiseño boton, PanelTablaDiseño panel) {
        this.boton = new BotonesDiseño();
        this.label = new LblTxtDiseño();
        this.panel  = new PanelTablaDiseño();
        this.boton = boton;
        this.label = label;
        this.panel = panel;
                
        UnirComponentes();
    }
    
    

       @SuppressWarnings("unchecked")
    private void UnirComponentes() {
        
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        GroupLayout jPanel1Layout = new GroupLayout(panel.getjPanel1());
        panel.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(label.getLblNombres(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label.getLblAlias(), GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label.getLblEmail(), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label.getLblApellidos(),GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton.getBtnGuardar(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label.getTxtApellidos())
                            .addComponent(label.getTxtNombres())
                            .addComponent(label.getTxtEmail())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label.getTxtAlias(), GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton.getBtnListar(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton.getBtnEditar(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(label.getLblContraseña(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label.getLblCelular(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label.getLblNacimiento(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label.getTxtCelular())
                            .addComponent(label.getTxtContraseña())
                            .addComponent(label.getTxtNacimiento(),GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(155, 155, 155))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boton.getBtnActualizar())
                        .addGap(18, 18, 18)
                        .addComponent(boton.getBtnEliminar(), GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label.getLblAlias(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getLblCelular(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtAlias(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtCelular(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label.getLblNombres(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getLblContraseña(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtNombres(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtContraseña(), GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label.getLblApellidos(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getLblNacimiento(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtApellidos(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtNacimiento(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label.getLblEmail(), GroupLayout.PREFERRED_SIZE, 23,GroupLayout.PREFERRED_SIZE)
                    .addComponent(label.getTxtEmail(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(boton.getBtnGuardar(), GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(boton.getBtnListar(), GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(boton.getBtnEditar(), GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(boton.getBtnActualizar(), GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(boton.getBtnEliminar(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        panel.getjPanel2().setBackground(new Color(0, 0, 0));
        panel.getjPanel2().setBorder(createTitledBorder(null, "TABLA", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 18), new Color(255, 255, 255)));

        panel.getTabla().setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alias", "Nombres", "Apellidos", "Email", "Celular", "Contraseña", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
               String.class, String.class, String.class, String.class, Double.class, String.class, String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        panel.getjScrollPane1().setViewportView(panel.getTabla());

        GroupLayout jPanel2Layout = new GroupLayout(panel.getjPanel2());
        panel.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel.getjScrollPane1())
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel.getjScrollPane1(), GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(panel.getjPanel2(), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel.getjPanel1(), GroupLayout.PREFERRED_SIZE, 666, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel.getjPanel1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel.getjPanel2(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
        

        

      
     
       
    }


