
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class student_frame extends javax.swing.JFrame {
    public student_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_label = new javax.swing.JLabel();
        pre_reg = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        result = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Section");

        welcome_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcome_label.setText("     Welcome To Student Section");

        pre_reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pre_reg.setText("Pre Registration");
        pre_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_regActionPerformed(evt);
            }
        });

        reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg.setText("Registration");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result.setText("Check Your Result");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pre_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pre_reg, reg, result});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pre_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pre_reg, reg, result});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pre_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_regActionPerformed
       pre_register_frame preg=new pre_register_frame();
      preg.setVisible(true);
    }//GEN-LAST:event_pre_regActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
      int _rol = 0;
       FileReader file = null;
        try {
            file = new FileReader("reg_students.txt");
            } catch (FileNotFoundException ex) {
            Logger.getLogger(pre_register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
       BufferedReader bfrd=new BufferedReader(file);
      String s;
        try {
            if((s=bfrd.readLine())!=null)
                _rol=Integer.parseInt(s);
            else
                _rol=0;
        } catch (IOException ex) {
            Logger.getLogger(pre_register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    int roll=Integer.parseInt(JOptionPane.showInputDialog(rootPane,"Please Enter Your Number :"));
    while(roll>_rol)
    {
       roll= Integer.parseInt(JOptionPane.showInputDialog(rootPane,"Please Enter valid Number :"));
    }
    //JOptionPane.showMessageDialog(rootPane,"Registration Completed Successfully");
    semester_frame reg = null;
        try {
            reg = new semester_frame(roll);
        } catch (IOException ex) {
            Logger.getLogger(student_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    reg.setVisible(true);
    }//GEN-LAST:event_regActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        int roll;
        roll = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your Roll No.!"));
        grade_sheet grd = null;
        try {
            grd = new grade_sheet(roll);
        } catch (IOException ex) {
            Logger.getLogger(student_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
          grd.setVisible(true);
    }//GEN-LAST:event_resultActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton pre_reg;
    private javax.swing.JButton reg;
    private javax.swing.JButton result;
    private javax.swing.JLabel welcome_label;
    // End of variables declaration//GEN-END:variables
}
