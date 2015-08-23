
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class semester_frame extends javax.swing.JFrame {

 
    public semester_frame() {
        initComponents();
    }
 

    semester_frame(int roll) throws IOException {
        initComponents();this.setLocationRelativeTo(null);
        roll_no=roll;
         String str;
        str = "reg_files"+roll+".txt";
        File data_file=new File(str);
        data_file.createNewFile();
        display_course();
        
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        core_panel = new javax.swing.JScrollPane();
        core = new javax.swing.JPanel();
        elect_panel = new javax.swing.JScrollPane();
        elect = new javax.swing.JPanel();
        elect_var = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Core Subjects :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Electives :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Conform");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coreLayout = new javax.swing.GroupLayout(core);
        core.setLayout(coreLayout);
        coreLayout.setHorizontalGroup(
            coreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        coreLayout.setVerticalGroup(
            coreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        core_panel.setViewportView(core);

        javax.swing.GroupLayout electLayout = new javax.swing.GroupLayout(elect);
        elect.setLayout(electLayout);
        electLayout.setHorizontalGroup(
            electLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        electLayout.setVerticalGroup(
            electLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        elect_panel.setViewportView(elect);

        jLabel3.setText("All are Mandatary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jButton1)
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(elect_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222))
                            .addComponent(core_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elect_var, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(core_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elect_var, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(elect_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int c=1;
        for(int i=0;i<no_core;i++){
            if(rbd1[i].isSelected()) ;
            else {JOptionPane.showMessageDialog(core_panel,"Please Select All Core Courses !");c=0;
            break;}   }
        System.out.println(c);
        if(c==1){
            int selt=0;
          for(int i=0;i<no_elect;i++){
            if(rbd2[i].isSelected()){selt++;}
         }
          System.out.println(selt+" , "+no_elect_req);
          if(selt==no_elect_req)
          {
        FileWriter file=null;
        try {
            String str;
            str = "reg_files"+roll_no+".txt";
            file = new FileWriter(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(course_detail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(course_detail.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter bfrd;
        bfrd = new PrintWriter(file);
        
        //write core courses in data base
        bfrd.println(no_core);
        for(int i=0;i<no_core;i++)
        bfrd.println(i+1);
        
        //write electives  in data base
        bfrd.println(no_elect_req);
        for(int i=0;i<no_elect;i++){
            if(rbd2[i].isSelected()){
                bfrd.println(i+1);
            }
        }
        bfrd.close();
        JOptionPane.showMessageDialog(core_panel,"Registered Successfully");
        }
          else
          {JOptionPane.showMessageDialog(core_panel,"Please Select Required number of Electives !");}
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void display_course() throws FileNotFoundException, IOException
    {
        FileReader file;
        file = new FileReader("Core.txt");
        BufferedReader bfrd=new BufferedReader(file);
       int no_core_req;
        no_core_req = Integer.parseInt(bfrd.readLine());
        no_core=Integer.parseInt(bfrd.readLine());
        rbd1=new JRadioButton[no_core];
        for(int i=0;i<no_core;i++) rbd1[i]=new JRadioButton();
        core.setLayout(new BoxLayout(core,BoxLayout.Y_AXIS));
         for(int i=0;i<no_core;i++)
         {
             String str;
             str="[ "+bfrd.readLine()+" , "+bfrd.readLine()+" , "+bfrd.readLine()+" ]";
             rbd1[i].setText(str);
             rbd1[i].setSelected(true);
             //rbd1[i].addActionListener();
             //rbd1[i].setEnabled(false);
            core.add(rbd1[i]);
         }
       bfrd.close();
         
        file = new FileReader("Elective.txt");
        bfrd=new BufferedReader(file);
        
        no_elect_req=Integer.parseInt(bfrd.readLine());
        this.elect_var.setText("(Select any "+no_elect_req+" )");
        
        no_elect=Integer.parseInt(bfrd.readLine());
           rbd2=new JRadioButton[no_elect];
        for(int i=0;i<no_elect;i++) rbd2[i]=new JRadioButton();
        elect.setLayout(new BoxLayout(elect,BoxLayout.Y_AXIS));
         for(int i=0;i<no_elect;i++)
         {
              String str;
             str="[ "+bfrd.readLine()+" , "+ bfrd.readLine()+" , "+bfrd.readLine()+" ]";
             rbd2[i].setText(str);
            elect.add(rbd2[i]);
          
         }
         bfrd.close();
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new semester_frame(roll_no).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(semester_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel core;
    private javax.swing.JScrollPane core_panel;
    private javax.swing.JPanel elect;
    private javax.swing.JScrollPane elect_panel;
    private javax.swing.JLabel elect_var;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private static int roll_no=0;
    private static int no_core=0,no_elect=0,no_elect_req=0;
    private JRadioButton[] rbd1,rbd2;
}
