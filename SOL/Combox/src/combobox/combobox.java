/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package combobox;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DAM2_06
 */
public class combobox extends javax.swing.JFrame {

    /**
     * Creates new form combox
     */
    private enum dam1 {
        BBDD, Entornos, Sistemas, Programacion, FOL, Lenguaje
    };

    private enum dam2 {
        Android, Acceso_a_datos, Sistemas2, Inglés, DI, Empresa, Programacion
    };

    public combobox() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto_label = new javax.swing.JLabel();
        combo_elementos = new javax.swing.JComboBox<>();
        texto_asignaturas = new javax.swing.JTextField();
        boton_añadir = new javax.swing.JButton();
        boton_añadir_todo = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        elegir_grado = new javax.swing.JComboBox<>();
        boton_basura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar elementos combox");

        texto_label.setText("Añade el nombre de los módulos de los que estés matriculado:");

        combo_elementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_elementosActionPerformed(evt);
            }
        });

        boton_añadir.setText("Añadir");
        boton_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_añadirActionPerformed(evt);
            }
        });

        boton_añadir_todo.setText("Añadir todos");
        boton_añadir_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_añadir_todoActionPerformed(evt);
            }
        });

        boton_borrar.setText("Borrar todos");
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });

        elegir_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAM1", "DAM2" }));
        elegir_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegir_gradoActionPerformed(evt);
            }
        });

        boton_basura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combobox/media/trash.png"))); // NOI18N
        boton_basura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_basuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_añadir)
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_añadir_todo)
                                    .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(texto_label))
                        .addContainerGap(172, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_asignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elegir_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_basura)))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(texto_label)
                .addGap(18, 18, 18)
                .addComponent(elegir_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_basura))
                    .addComponent(texto_asignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(boton_añadir))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_añadir_todo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_borrar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void existe(String modulo) {
        boolean existe = false;
        for (int i = 0; i < combo_elementos.getItemCount(); i++) {
            //Compara un String con otro String ignorando mayúsculas y minúsculas
            if (combo_elementos.getItemAt(i).equalsIgnoreCase(modulo)) {
                existe = true;
                texto_asignaturas.setText("");
                break;
            }
        }
        if (!existe) {
            combo_elementos.addItem(modulo);
            texto_asignaturas.setText("");
        }
    }
    private void combo_elementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_elementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_elementosActionPerformed

    private void boton_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadirActionPerformed
        String asignaturas = texto_asignaturas.getText().trim();  //trim quita los espacios en blanco
        if (!asignaturas.isEmpty()) {
            existe(asignaturas);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor rellena el campo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_añadirActionPerformed

    private void boton_añadir_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadir_todoActionPerformed
        String curso = elegir_grado.getSelectedItem().toString().trim();

        if (curso.equals("DAM1")) {
            for (dam1 modulos : dam1.values()) {
                existe(modulos.toString());
            }
        }
        if (curso.equals("DAM2")) {
            for (dam2 modulos : dam2.values()) {
                existe(modulos.toString());
            }
        }
    }//GEN-LAST:event_boton_añadir_todoActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        for (int i = 0; i < combo_elementos.getItemCount(); i++) {
            combo_elementos.removeAllItems();
        }
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void boton_basuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_basuraActionPerformed
        combo_elementos.removeItem(combo_elementos.getSelectedItem());
    }//GEN-LAST:event_boton_basuraActionPerformed

    private void elegir_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegir_gradoActionPerformed

    }//GEN-LAST:event_elegir_gradoActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    System.out.println("Look and Feel de Windows aplicado correctamente.");
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error al aplicar el Look and Feel de Windows.");
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new combobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_añadir;
    private javax.swing.JButton boton_añadir_todo;
    private javax.swing.JButton boton_basura;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JComboBox<String> combo_elementos;
    private javax.swing.JComboBox<String> elegir_grado;
    private javax.swing.JTextField texto_asignaturas;
    private javax.swing.JLabel texto_label;
    // End of variables declaration//GEN-END:variables
}
