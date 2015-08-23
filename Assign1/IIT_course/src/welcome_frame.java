
import javax.swing.JOptionPane;




public class welcome_frame extends javax.swing.JFrame {

   
    public welcome_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_panel = new javax.swing.JPanel();
        faculty = new javax.swing.JButton();
        student = new javax.swing.JButton();
        welcome_label = new javax.swing.JLabel();
        dean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IIT academic Course management");

        faculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        faculty.setText("Faculty");
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });

        student.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        welcome_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcome_label.setText("Welcome to IIT KGP");

        dean.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dean.setText("Dean");
        dean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
        welcome_panel.setLayout(welcome_panelLayout);
        welcome_panelLayout.setHorizontalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcome_panelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcome_panelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dean, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        welcome_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dean, faculty, student});

        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(dean)
                .addGap(28, 28, 28)
                .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        welcome_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dean, faculty, student});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
     String passwd;
        passwd=JOptionPane.showInputDialog("Please Enter Your Password to Enter");
    if("Faculty_Passwd".equals(passwd)){    
     faculty_frame fact=new faculty_frame();
     fact.setLocationRelativeTo(null);
    } else
        {
            JOptionPane.showMessageDialog(rootPane,"Incorrect Password!");
        }
    }//GEN-LAST:event_facultyActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        
      student_frame stdnt =new student_frame();
      stdnt.setVisible(true);
      stdnt.setLocationRelativeTo(null);
    }//GEN-LAST:event_studentActionPerformed

    private void deanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deanActionPerformed
       String passwd;
        passwd=JOptionPane.showInputDialog("Please Enter Your Password to Enter");
    if("Dean_Passwd".equals(passwd)){    
       course_detail course=new course_detail();
       course.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Incorrect Password!");
        }
    }//GEN-LAST:event_deanActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dean;
    private javax.swing.JButton faculty;
    private javax.swing.JButton student;
    private javax.swing.JLabel welcome_label;
    private javax.swing.JPanel welcome_panel;
    // End of variables declaration//GEN-END:variables
}
