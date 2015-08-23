package mcte;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class welcome extends javax.swing.JFrame {

    public welcome() throws IOException {
        initComponents();
     this.setSize(450,340);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        teacher = new javax.swing.JButton();
        student = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        teacher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        teacher.setText("Teacher");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        getContentPane().add(teacher);
        teacher.setBounds(160, 100, 110, 33);

        student.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        getContentPane().add(student);
        student.setBounds(160, 160, 110, 29);

        image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mcte/SOFTWARE-TESTING-PRACTICE-EXAM-ITLM.jpg"))); // NOI18N
        getContentPane().add(image_label);
        image_label.setBounds(0, 0, 430, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        try {
            new teacher().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_teacherActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        data_entry data=new data_entry();
        data.setVisible(true);

    }//GEN-LAST:event_studentActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new welcome().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_label;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton student;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables
}
