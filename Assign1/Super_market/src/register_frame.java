
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class register_frame extends javax.swing.JFrame {

    public register_frame() {
        initComponents();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address_label = new javax.swing.JLabel();
        number_label = new javax.swing.JLabel();
        license_label = new javax.swing.JLabel();
        address_text = new javax.swing.JTextField();
        number_text = new javax.swing.JTextField();
        license_text = new javax.swing.JTextField();
        register_label = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registor for Super market");

        address_label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        address_label.setText("Residential address :");

        number_label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        number_label.setText("Telephone  number :");

        license_label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        license_label.setText("Driving license number :");

        register_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        register_label.setText("Register");

        register_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        back_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(license_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(license_text, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(register_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(register_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(license_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(license_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(26, 26, 26)
                .addComponent(register_button)
                .addGap(18, 18, 18)
                .addComponent(back_button)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed

        // TODO add your handling code here:
        int CN = 0;
        Scanner bfrd = null;
        try {
            bfrd = new Scanner(new FileReader("CN.txt"));
            if(bfrd.hasNext()) CN=bfrd.nextInt();
           else CN=0;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
            CN=0;
        }
        bfrd.close();
 
        String s1=address_text.getText();
        String s2=number_text.getText();
        String s3=license_text.getText();
        
        if((!"".equals(s3)) && (!"".equals(s2)) && (!"".equals(s1)) && (null!=s3) && (s1!=null) && (s2!=null))
        {
         FileWriter fwrd=null;
        try {
            fwrd = new FileWriter("CN.txt");
        } catch (IOException ex) {
            
        }
        PrintWriter cnwrt= new PrintWriter(fwrd);
        if(CN!=0)
        cnwrt.println(CN+1);
        else
            cnwrt.write("1");
        cnwrt.close();
        
       
     FileWriter f = null ;
     PrintWriter writer4;
        try {
            f = new FileWriter("credit.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer4= new PrintWriter(f);
            writer4.println("0");
          writer4.close();
      
          
        
        try {
            f = new FileWriter("address.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            PrintWriter writer1;
            writer1 = new PrintWriter(f);
            writer1.println(s1);
            writer1.close();
        
            
        
        
        
        try {
            f = new FileWriter("number.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            PrintWriter writer2;
            writer2 = new PrintWriter(f);
            writer2.println(s2);
            writer2.close();
        
          
        try {
            f = new FileWriter("license.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter writer3;
        writer3 = new PrintWriter(f);
        writer3.println(s3);
        writer3.close();
       
        CN++;
         JOptionPane.showMessageDialog(this.getComponent(0),"Registered successfully\n"+"Your CN number is "+CN);
         this.setVisible(false);
        dispose();
    }
        else {
          JOptionPane.showMessageDialog(this.getComponent(0),"Please fill Details!"); 
                }
    }//GEN-LAST:event_register_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
       
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

  
    public static void register(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                new register_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel license_label;
    private javax.swing.JTextField license_text;
    private javax.swing.JLabel number_label;
    private javax.swing.JTextField number_text;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_label;
    // End of variables declaration//GEN-END:variables
}
