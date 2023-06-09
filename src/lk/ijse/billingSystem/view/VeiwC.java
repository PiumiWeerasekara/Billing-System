/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.billingSystem.controller.ControllerFactory;
import lk.ijse.billingSystem.controller.custom.BatchController;
import lk.ijse.billingSystem.controller.custom.CourseController;
import lk.ijse.billingSystem.controller.custom.RegistrationController;
import lk.ijse.billingSystem.dto.BatchDTO;
import lk.ijse.billingSystem.dto.CourseDTO;

/**
 *
 * @author DEll
 */
public class VeiwC extends javax.swing.JFrame {
    RegistrationController registrationController = (RegistrationController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.REGISTRATION);
    BatchController batchController = (BatchController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.BATCH);
    CourseController courseController = (CourseController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.COURSE);

    /**
     * Creates new form VeiwPayments
     */
    public VeiwC() {
        initComponents();
        initComponents();
        loadDate();
        loadTime();
        loadCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayments = new javax.swing.JTable();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbBranch = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox();
        txtCid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBid = new javax.swing.JTextField();
        txtBatchName = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtDueDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 193, 161));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Payments");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 80));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/billingSystem/resources/icons8-home-55.png"))); // NOI18N
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });
        jPanel1.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/billingSystem/resources/icons8-minimize-window-48.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 50, 40));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/billingSystem/resources/icons8-close-window-48.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 50, 40));

        tblPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No", "Name", "Nic", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tblPayments);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 530, 150));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 102));
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 110, 30));

        lblDate.setBackground(new java.awt.Color(255, 153, 255));
        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 51, 102));
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Branch");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        cmbBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Panadura", "Galle" }));
        cmbBranch.setSelectedIndex(-1);
        cmbBranch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBranchItemStateChanged(evt);
            }
        });
        cmbBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBranchActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Course");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 120, 30));

        cmbCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCourseItemStateChanged(evt);
            }
        });
        cmbCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCourseMouseClicked(evt);
            }
        });
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 160, 30));
        jPanel1.add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 40, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Batch");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 120, 30));
        jPanel1.add(txtBid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 40, 30));

        txtBatchName.setBorder(null);
        txtBatchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtBatchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 120, 30));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 120, 30));

        txtDueDate.setBorder(null);
        txtDueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Due Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 30));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-close-window-48.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-close-window-55.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        lblClose.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-close-window-55.png"));
        int response = JOptionPane.showConfirmDialog(this, "Are you sure want to exit?");
        if (response == 0) {
            System.exit(0);
        } else if (response == 1) {
        } else if (response == 2) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        lblMinimize.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-minimize-window-48.png"));
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        lblMinimize.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-minimize-window-55.png"));
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        lblMinimize.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-minimize-window-55.png"));
        this.setExtendedState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        lblHome.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-home-55.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        lblHome.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-home-64.png"));

        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        lblHome.setIcon(new javax.swing.ImageIcon("J:\\3rd semester\\Niroth Sir\\4\\images\\icons8-home-64.png"));
        Main m=new Main();
        this.setVisible(false);
        m.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseClicked

    private void cmbBranchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBranchItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBranchItemStateChanged

    private void cmbBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBranchActionPerformed
        //        String branch = (String) cmbBranch.getSelectedItem();
        //        int cid = Integer.parseInt(txtCid.getText());
        //        loadBatches(branch, cid);
        //        loadDetails();
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBranchActionPerformed

    private void cmbCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCourseItemStateChanged

    }//GEN-LAST:event_cmbCourseItemStateChanged

    private void cmbCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCourseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseMouseClicked

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        try {
            String course = (String) cmbCourse.getSelectedItem();
            if (course != null) {
                CourseDTO courseDTO = courseController.searchCourse(course);
                txtCid.setText(Integer.toString(courseDTO.getCid()));
                String branch = (String) cmbBranch.getSelectedItem();
                int cid = Integer.parseInt(txtCid.getText());
                if(cid!=0 & branch!=null){
                    loadBatches(branch, cid);
                }
            }

            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void txtBatchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchNameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchNameActionPerformed

    private void txtDueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueDateActionPerformed

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
            java.util.logging.Logger.getLogger(VeiwC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiwC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiwC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiwC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiwC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBranch;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblPayments;
    private javax.swing.JTextField txtBatchName;
    private javax.swing.JTextField txtBid;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtDueDate;
    // End of variables declaration//GEN-END:variables


    private void loadTime() {
        new javax.swing.Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss ");
                String DateFormat = df.format(d1);
                lblTime.setText(DateFormat);
            }
        }).start();
    }
    void loadBatches(String branch, int cid) {
        // cmbBatch.removeAllItems();
        try {
            BatchDTO batchDTO = batchController.getBatch(branch, cid);
            txtBatchName.setText(batchDTO.getName());
            txtBid.setText(Integer.toString(batchDTO.getBid()));
            System.out.println(batchDTO.getBid());
//            ArrayList<BatchDTO> alBatches = batchController.getBatches(branch, cid);
//            for (BatchDTO Batch : alBatches) {
//                cmbBatch.addItem(Batch.getName());
//                //cmbBatch.setSelectedIndex(-1);
//            }

        } catch (Exception ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCourses() {
        cmbCourse.removeAllItems();
        try {
            ArrayList<CourseDTO> alCourses = courseController.getCourses();
            for (CourseDTO course : alCourses) {
                cmbCourse.addItem(course.getName());
                cmbCourse.setSelectedIndex(-1);
            }
        } catch (Exception ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    private void loadDate() {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        String dateFormat = sf.format(date);
        txtDueDate.setText(dateFormat);
    }
}


