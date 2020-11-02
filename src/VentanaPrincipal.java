
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rioja
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });

        jMenuItem1.setText("Guardar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuGuardar.setText("Guardar como");
        menuGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuGuardarMousePressed(evt);
            }
        });
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        jMenuItem2.setText("Cargar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este menú se va a encargar de que al presionar dicho botón o su shorcut guarde lo escrito en el text area.
    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed

    }//GEN-LAST:event_menuGuardarActionPerformed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed

    }//GEN-LAST:event_jMenu1MousePressed

    private void menuGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGuardarMousePressed
        guardarComo();
    }//GEN-LAST:event_menuGuardarMousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        cargar();
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        guardar();
    }//GEN-LAST:event_jMenuItem1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void guardarComo() {
        //Creamos un JFileChooser
        JFileChooser fc = new JFileChooser();
        //Llamamos al JFileChooser para que se muestre mediante el dialog
        fc.showSaveDialog(this);
        //Llamamos de nuevo al JFileChooser para usarlo con el FileWriter
        File f = fc.getSelectedFile();

        try {
            //Declaramos el FileWriter y llamamos el File (f)
            FileWriter fw = new FileWriter(f);
            //Obtenemos el texto escrito de nuestro TextArea
            String text = jTextArea1.getText();
            //Escribimos el texto obtenido del TextArea
            fw.write(text);
            //Cerramos la ejecución del FileWriter
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    private void cargar() {
        //Creamos un JFileChooser
        JFileChooser jf = new JFileChooser();
        //Llamamos al JFileChooser para que se muestre mediante el dialog
        jf.showOpenDialog(null);
        //Llamamos de nuevo al JFileChooser para usarlo con el FileReader y el BufferedReader
        File f = jf.getSelectedFile();
        //Obtenemos la ruta del archivo que queremos abrir
        String filename = f.getAbsolutePath();

        try {
            //Con el FileReader leemos el archivo previamente seleccionado
            FileReader fr = new FileReader(filename);
            //Con el BufferedReader obtenemos el texto del archivo
            BufferedReader br = new BufferedReader(fr);
            //Actualizamos el contenido del jTextArea
            jTextArea1.read(br, null);
            //Cerramos la ejecución
            br.close();
            
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void guardar() {
        //Seleccionamos la ruta del guardado rápido
        String ruta = "C:\\Users\\Public\\Documents\\Document.txt";

        try {
            //Mediante el BufferedWriter editamos el archivo previamente seleccionado
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            //Modificamos el archivo poniendo el contenido del jTextArea
            bw.write(jTextArea1.getText());
            //Cerramos la ejecución
            bw.close();

        } catch (Exception e) {
            System.out.println("Error en la escritura del fichero");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuGuardar;
    // End of variables declaration//GEN-END:variables
}
