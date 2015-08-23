package mcte;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class test extends javax.swing.JFrame {

    public test() {
        initComponents();
    }
    public test(String name) throws FileNotFoundException, IOException {
        std_name=name;  i=1;
        initComponents();
     //   this.setLocationRelativeTo(null);
      display_question();
      this.setSize(572,372);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        qst_no_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        qst = new javax.swing.JLabel();
        opt_1 = new javax.swing.JRadioButton();
        opt_3 = new javax.swing.JRadioButton();
        opt_2 = new javax.swing.JRadioButton();
        opt_4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(null);

        qst_no_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qst_no_label.setForeground(new java.awt.Color(255, 255, 0));
        qst_no_label.setText("Question 1");
        getContentPane().add(qst_no_label);
        qst_no_label.setBounds(202, 11, 169, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" a)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(89, 207, 18, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("b)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(347, 207, 15, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(" c)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(89, 256, 17, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(" d)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(343, 256, 19, 17);

        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(230, 291, 91, 25);

        qst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qst.setForeground(new java.awt.Color(153, 255, 0));
        getContentPane().add(qst);
        qst.setBounds(29, 51, 520, 125);

        buttonGroup1.add(opt_1);
        opt_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt_1.setForeground(new java.awt.Color(51, 204, 0));
        opt_1.setText("jRadioButton1");
        opt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_1ActionPerformed(evt);
            }
        });
        getContentPane().add(opt_1);
        opt_1.setBounds(125, 208, 127, 14);

        buttonGroup1.add(opt_3);
        opt_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt_3.setForeground(new java.awt.Color(51, 204, 0));
        opt_3.setText("jRadioButton1");
        opt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_3ActionPerformed(evt);
            }
        });
        getContentPane().add(opt_3);
        opt_3.setBounds(124, 257, 127, 14);

        buttonGroup1.add(opt_2);
        opt_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt_2.setForeground(new java.awt.Color(51, 204, 0));
        opt_2.setText("jRadioButton1");
        opt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_2ActionPerformed(evt);
            }
        });
        getContentPane().add(opt_2);
        opt_2.setBounds(393, 208, 127, 14);

        buttonGroup1.add(opt_4);
        opt_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opt_4.setForeground(new java.awt.Color(51, 204, 0));
        opt_4.setText("jRadioButton1");
        opt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt_4ActionPerformed(evt);
            }
        });
        getContentPane().add(opt_4);
        opt_4.setBounds(393, 257, 127, 14);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        if(opt_1.isSelected() || opt_2.isSelected() || opt_3.isSelected() || opt_4.isSelected())
        {
                    int is_crt;
                    is_crt=check_qst();
                 //    System.out.println(sel_opt);
               //      System.out.println(mark);      
            PrintWriter bfrd = null;
            try {
                  String str="marks\\"+std_name+"eval"+".txt";
                  FileWriter frt=new FileWriter(str,true);
                  bfrd=new PrintWriter(frt);
                } catch (IOException ex) {
                Logger.getLogger(data_entry.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(is_crt==1)
            bfrd.println("4"+" "+sel_opt+" "+opt_crt+" ");
            else
             bfrd.println("-1"+" "+sel_opt+" "+opt_crt+" ");
            
                       if(i==no_pro)
                       {
                           bfrd.println(mark); bfrd.close();
                           System.out.println("Your toatl marks is ="+mark);
                        try {
                         
                            new final_frame(mark,std_name,no_pro).setVisible(true);
                        } catch (IOException ex) {
                            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                        }
                          
                           dispose();
                
                       }
                 if(i<no_pro){
                  i++;
                try {
                 display_question();
                  }  catch (IOException ex) {
              Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
        bfrd.close();}
        else
            JOptionPane.showMessageDialog(rootPane,"Please select atleast one option !");
          /*  System.out.println(opt1);
                    System.out.println(opt2);
                    System.out.println(opt3);
                    System.out.println(opt4);
                    System.out.println(opt_crt);
                   */
    }//GEN-LAST:event_submitActionPerformed
 
   private int check_qst()
   {
          int is_crt=0;
             if(opt_1.isSelected()) 
             {     sel_opt=opt1;
                 if(opt1.equals(opt_crt)) {is_crt=1;}
                 else {
                     is_crt=2;}
             }
             else
                 if(opt_2.isSelected())
                 {
                     sel_opt=opt2;
                     if(opt2.equals(opt_crt)){ is_crt=1;}
                     else is_crt=2;
                 } 
                  else
                     if(opt_3.isSelected())
                     {
                         sel_opt=opt3;
                         if(opt3.equals(opt_crt)) {is_crt=1;}
                         else is_crt=2;
                     }
                     else
                     {
                         sel_opt=opt4;
                         if(opt4.equals(opt_crt)) {is_crt=1;}
                         else is_crt=2;
                     }
             
             if(is_crt==1) mark+=4;
             else    mark--;
        return is_crt;
   }
    private void opt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_1ActionPerformed
        opt_1.setForeground(Color.red);
        opt_2.setForeground(null);
        opt_3.setForeground(null);
        opt_4.setForeground(null);
        
        
    }//GEN-LAST:event_opt_1ActionPerformed

    private void opt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_2ActionPerformed
        
        opt_1.setForeground(null);
        opt_2.setForeground(Color.red);
        opt_3.setForeground(null);
        opt_4.setForeground(null);
    }//GEN-LAST:event_opt_2ActionPerformed

    private void opt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_3ActionPerformed
         opt_1.setForeground(null); 
         opt_2.setForeground(null);
         opt_3.setForeground(Color.red);
         opt_4.setForeground(null);
    }//GEN-LAST:event_opt_3ActionPerformed

    private void opt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt_4ActionPerformed
         opt_1.setForeground(null); 
         opt_2.setForeground(null);
         opt_3.setForeground(null);
         opt_4.setForeground(Color.red);
    }//GEN-LAST:event_opt_4ActionPerformed

    private void display_question() throws FileNotFoundException, IOException {
        FileReader file=new FileReader("qst.txt");
        String str;
        try (BufferedReader bfrd = new BufferedReader(file)) {
            no_pro=Integer.parseInt(bfrd.readLine());
            int j=1;
            while(j<i)
            {bfrd.readLine();
            bfrd.readLine();
            j++;
            }   qest=bfrd.readLine();
            str = bfrd.readLine();
            bfrd.close();
        }
      //  System.out.println(qest+"\n"+str);
         char c[]=str.toCharArray();
         str="";
         int qst_no=1;
         for(int k=0;k<c.length;)
         {
      //       System.out.println(c[k]);
             
             while(c[k]!=' ') {                
             str+=c[k];
             if( k!=c.length-1)
              k++;
             else break;}
            switch(qst_no)
               {
                   case 1:
                       opt1=str;
                       break;
                   case 2:
                       opt2=str;
                       break;
                   case 3:
                       opt3=str;
                       break;
                   case 4:
                       opt4=str;
                       break;
                   case 5:
                       opt_crt=str;
                       break;
               }
            qst_no++;
            k++;
            str="";
         }
      /* if(c[k]!=' ' && c[k]!='\n') str+=c[k];
           else
           {
               switch(qst_no)
               {
                   case 1:
                       opt1=str;
                       break;
                   case 2:
                       opt2=str;
                       break;
                   case 3:
                       opt3=str;
                       break;
                   case 4:
                       opt4=str;
                       break; 
               }
               str="";
               qst_no++;
                 }
        } *///opt_crt=str;
         
         //System.out.println(opt_crt);
        
        qst_no_label.setText("Question "+Integer.toString(i));
        qst.setText((qest));
        opt_1.setText("  "+opt1);
        opt_2.setText("  "+opt2);
        opt_3.setText("  "+opt3);
        opt_4.setText("  "+opt4);
    
        buttonGroup1.clearSelection();
        
        opt_1.setForeground(null);
        opt_2.setForeground(null);
        opt_3.setForeground(null);
        opt_4.setForeground(null);
    }
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new test("").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opt_1;
    private javax.swing.JRadioButton opt_2;
    private javax.swing.JRadioButton opt_3;
    private javax.swing.JRadioButton opt_4;
    private javax.swing.JLabel qst;
    private javax.swing.JLabel qst_no_label;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
  private static int no_pro=1;
  private static int mark=0;
  private  int i=1;
  private  String qest;
  private  String opt1;
  private  String opt2;
  private  String opt3;
  private  String opt4;
  private  String opt_crt;
  private String sel_opt;
  private static String std_name;

   
}
