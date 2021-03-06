/*
 * Menu.java
 *
 * Created on 8 de octubre de 2008, 10:48 AM
 */
package oscar;

import ch.randelshofer.quaqua.JSheet;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import oscar.ArbolAbstracto.otros.Estatuto;
import oscar.ArbolAbstracto.otros.Programa;
import oscar.ArbolAbstracto.otros.SemanticException;
import oscar.CodigoObjeto.GeneracionCodigoObjeto;
import oscar.compilador1.Oscar2;
import oscar.compilador1.ParseException;
import oscar.compilador1.TokenMgrError;
import oscar.compilador2.Compilador2;
import oscar.gui.JTextFieldLimit;

/**
 *
 * @author  OSCAR
 */
public class Menu extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    /**
     * Archivo fuente seleccionado por el usuario
     */
    private File archivoMostrado = new File(System.getProperty("user.dir") + File.separator + "hola.txt");
    /**
     * Canal de Entradade la variable acrchivoMostrado
     */
    private ObjectInputStream archivoEntrada;
    /**
     * Canal de Salida de la variable acrchivoMostrado
     */
    private ObjectOutputStream archivoSalida;

    /** Creates new form Menu */
    public Menu() {
        initComponents();
        //PlainDocument pa = new PlainDocument();
        //pa.putProperty(PlainDocument.tabSizeAttribute, new Integer(2));
        JTextFieldLimit pa = new JTextFieldLimit(areaTexto);
        areaTexto.setDocument(pa);
        jPanel2.setOpaque(true);
        boolean van = true;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelDegradado1 = new oscar.gui.PanelDegradado();
        jLabel1 = new javax.swing.JLabel();
        botonGramaticaGrande = new javax.swing.JToggleButton();
        botonGramaticaChica = new javax.swing.JToggleButton();
        jXStatusBar1 = new org.jdesktop.swingx.JXStatusBar();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoArbol = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoCodigoIntermedio = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oscar++ Compiler");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/pdmX.png"))); // NOI18N
        jLabel1.setText("Compiler");

        buttonGroup1.add(botonGramaticaGrande);
        botonGramaticaGrande.setText("Gramatica Grande");

        buttonGroup1.add(botonGramaticaChica);
        botonGramaticaChica.setText("Gramatica Chica");

        javax.swing.GroupLayout panelDegradado1Layout = new javax.swing.GroupLayout(panelDegradado1);
        panelDegradado1.setLayout(panelDegradado1Layout);
        panelDegradado1Layout.setHorizontalGroup(
            panelDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDegradado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(botonGramaticaChica, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonGramaticaGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDegradado1Layout.setVerticalGroup(
            panelDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDegradado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonGramaticaChica)
                        .addComponent(botonGramaticaGrande))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelDegradado1, java.awt.BorderLayout.PAGE_START);

        jXStatusBar1.setPreferredSize(new java.awt.Dimension(27, 25));
        getContentPane().add(jXStatusBar1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(100, 35));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/folder_blue_open.png"))); // NOI18N
        jButton1.setMnemonic('A');
        jButton1.setText("Abrir");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/disquete7.png"))); // NOI18N
        jButton2.setMnemonic('G');
        jButton2.setText("Guardar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/gtk-stock-book.png"))); // NOI18N
        jButton3.setMnemonic('N');
        jButton3.setText("Nuevo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/gksu.png"))); // NOI18N
        jButton4.setMnemonic('C');
        jButton4.setText("Compilar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/dialog-cancel.png"))); // NOI18N
        jButton5.setMnemonic('S');
        jButton5.setText("Salir");
        jButton5.setFocusable(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setMaximumSize(new java.awt.Dimension(65, 39));
        jButton5.setMinimumSize(new java.awt.Dimension(65, 39));
        jButton5.setPreferredSize(new java.awt.Dimension(65, 39));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 333));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/gtkdiskfree.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("<html><br>\n<b> Alumno:<br></b>\n Oscar Blancarte<br><br>\n\n<b> Matricula:<br></b>\n XXXXXXXX<br><br>\n\n <b>Profesor:</b><br>\n Dr.XXX XXX<br><br>\n\n<b> Proyecto:</b><br>\nCompilador<br><br>\n\n <b>Materia:</b><br>\n Programacion de Sistemas<br><br>\n\n<b>Escuela:</b><br>\nTecnologico de Culiacan\n\n </html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel3.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Codigo Fuente [ Compiler ]", jPanel3);

        jPanel4.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        campoArbol.setColumns(20);
        campoArbol.setRows(5);
        jScrollPane2.setViewportView(campoArbol);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("   [ Arbol Generado ]   ", jPanel4);

        jPanel5.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        campoCodigoIntermedio.setColumns(20);
        campoCodigoIntermedio.setRows(5);
        jScrollPane3.setViewportView(campoCodigoIntermedio);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("   [ Codigo Intermedio ]   ", jPanel5);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Nuevo");
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Compliar");
        jMenu1.add(jMenuItem5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Informacion");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-788)/2, (screenSize.height-668)/2, 788, 668);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
    if(!cargarFuente()){
        return;
    }
    try {
        MostrarFuente();
    } catch (IOException io) {
        JSheet.showMessageSheet(this, "Se genero un error al cargar el archivo\n\n" + io);
    }
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    if(!cargarFuente()){
        return;
    }
    try {
        MostrarFuente();
    } catch (IOException io) {
        JSheet.showMessageSheet(this, "Se genero un error al cargar el archivo\n\n" + io);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    try {
        guardarFichero();
    } catch (Exception e) {
        JSheet.showMessageSheet(this, "Se genero un error al guardar el archivo");
    }

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    areaTexto.setText("");
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    try {
        compilar();
        mostrarArbol(Programa.getEstatutos());
        String outputPath =  System.getProperty("user.dir") + File.separator + "salida.txt";
        new GeneracionCodigoObjeto(new File(outputPath),campoCodigoIntermedio, Programa.getEstatutos()).start();
//        Desktop dek = Desktop.getDesktop();
//        dek.open(new File("C:\\salida.txt"));
    }
    catch(ParseException parse){
        //JSheet.showMessageSheet(this, "[ParseException] - Error de compilacion\n\n"+parse.getMessage());
        JSheet.showMessageSheet(this, "[ParseException] - Error de compilacion\n\n"+parse.getMessage(), JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/oscar/imagenes/dialog-warning.png")), null);
        parse.printStackTrace();
    }
    catch(TokenMgrError mgr){
        JSheet.showMessageSheet(this, "[TokenMgrError] - Error de compilacion\n\n"+mgr.getMessage());
        mgr.printStackTrace();
    }
    catch(SemanticException sem){
        JSheet.showMessageSheet(this, "[Error Semantico] -"+sem);
        sem.printStackTrace();
    }
    catch (Exception io) {
        JSheet.showMessageSheet(this, "[IOException] - Error al guardar el archivo para su compilacion\n\n"+io);
        io.printStackTrace();
    }finally{
        Programa.getEstatutos().clear();
        Programa.getListaStatement().clear();
        Programa.getListaVariables().clear();
        Programa.getEstatutos().clear();
    }
}//GEN-LAST:event_jButton4ActionPerformed

    private void mostrarArbol(List<Estatuto> lista){
        campoArbol.setText("");
        for (Estatuto estatuto : lista) {
            campoArbol.append(estatuto.toString());
        }
    }

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    try {
        guardarFichero();
    } catch (Exception e) {
        JSheet.showMessageSheet(this, "Se genero un error al guardar el archivo");
    }
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_jButton5ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
// TODO add your handling code here:
    JSheet.showMessageSheet(this, "Materia: Programacion de Sistemas\nAlumno: Oscar Javier Blancarte Iturralde\nProyecto: Analizador Lexico");
}//GEN-LAST:event_jMenuItem6ActionPerformed
   
    private boolean compilar()throws IOException, oscar.compilador2.ParseException, ParseException, SemanticException{
        String outputPath = System.getProperty("user.dir") + File.separator + "default.txt";
        File direccion = new File(outputPath);
        if(direccion.exists()){
            direccion.delete();
        }
        direccion.createNewFile();
        
        BufferedWriter buf = new BufferedWriter(new FileWriter(direccion));
        buf.write(areaTexto.getText());
        buf.close();
        
        FileInputStream stream = new FileInputStream(direccion);
        
        if(botonGramaticaChica.isSelected()){
            Oscar2 oscar = new Oscar2(stream);
            oscar.programa();
        }else if(botonGramaticaGrande.isSelected()){
            Compilador2 compilador = new Compilador2(stream);
            compilador.programa();
        }else{
            JSheet.showMessageSheet(this, "Para continuar seleccione el compilador a utilizar");
            return false;
        }

        JSheet.showMessageSheet(this, "Compilacion Terminada con Exito");
        return true;
    }
    
    private void guardarFichero()throws IOException{
        String path = System.getProperty("user.dir");
        JFileChooser selector = new JFileChooser(new File(path));
        int op = selector.showSaveDialog(this);
        
        if( op !=JFileChooser.APPROVE_OPTION){
            return;
        }
        
        File direccion = selector.getSelectedFile();
        try {
            direccion = new File(direccion.getAbsolutePath()+".o++");
            direccion.createNewFile();
        } catch (IOException io) {            
            JSheet.showMessageSheet(this, "Se genero un error al crear el fichero nuevo\n\n"+io);
            return;
        }
        
        BufferedWriter buf = new BufferedWriter(new FileWriter(direccion));
        StringTokenizer token = new StringTokenizer(areaTexto.getText(),"\n");
        while(token.hasMoreTokens()){
            String linea = token.nextToken();
            buf.write(linea+"$");
        }
        buf.close();
    }

    /**
     * Metodo encargado de leer de disco el archivo fuente
     * @return regresa true si se selecciono un archivo, false de lo contrario
     */
    private boolean cargarFuente(){
        String initPath = System.getProperty("user.dir");
        JFileChooser selector = new JFileChooser( new File(initPath));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos Oscar++", "o++");
        selector.setFileFilter(filtro);
        selector.setMultiSelectionEnabled(false);
        int op = selector.showOpenDialog(this);
        
        if(op != JFileChooser.OPEN_DIALOG){
            return false;        
        }

        archivoMostrado = selector.getSelectedFile();
        return true;
    }

    /**
     * Metodo encargado de mostrar la el archivo fuente en pantalla
     */
    private void MostrarFuente()throws IOException{
        areaTexto.setText("");
        java.io.BufferedReader reader = new BufferedReader(new FileReader(archivoMostrado));
        
        String linea = reader.readLine();
        while(linea!=null){
            StringTokenizer token = new StringTokenizer(linea,"\n$");
            while(token.hasMoreTokens()){
                areaTexto.append(token.nextToken()+"\n");
            }
            linea = reader.readLine();
        }
        
        reader.close();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JToggleButton botonGramaticaChica;
    private javax.swing.JToggleButton botonGramaticaGrande;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea campoArbol;
    private javax.swing.JTextArea campoCodigoIntermedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar1;
    private oscar.gui.PanelDegradado panelDegradado1;
    // End of variables declaration//GEN-END:variables

}
