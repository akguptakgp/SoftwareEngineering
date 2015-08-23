
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class manager_frame extends javax.swing.JFrame {
    public manager_frame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        gold = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gold_text = new javax.swing.JTextArea();
        surprise = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        surprise_text = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gold.setText("Display Gold Winner :");
        gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldActionPerformed(evt);
            }
        });

        gold_text.setEditable(false);
        gold_text.setColumns(20);
        gold_text.setRows(5);
        jScrollPane1.setViewportView(gold_text);

        surprise.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surprise.setText("Display Surprise Winner :");
        surprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surpriseActionPerformed(evt);
            }
        });

        surprise_text.setEditable(false);
        surprise_text.setColumns(20);
        surprise_text.setRows(5);
        jScrollPane2.setViewportView(surprise_text);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reset credits :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(surprise))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(gold))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gold, surprise});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surprise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gold, surprise});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void gold_display(int n,int i) throws IOException
    {
        FileReader file = null;
        try {
             file=new FileReader("address.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bfrd=new BufferedReader(file);
        for(int j=1;j!=n;j++) { bfrd.readLine();}
        String s=bfrd.readLine();
        gold_text.append(Integer.toString(i));
        gold_text.append(".  ");
        gold_text.append(s);
        gold_text.append("\n");
    }
    @SuppressWarnings("empty-statement")
    private void goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldActionPerformed
        FileReader file = null;
        try {
             file=new FileReader("credit.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bfrd=new BufferedReader(file);
       
        
        int i=1,c=1;
        String s;
        try {
            while((s=bfrd.readLine())!=null)
            {
                int n=Integer.parseInt(s);
               if(n>=10000)   {gold_display(i,c);c++;};  
                i++;
              }
            bfrd.close(); 
            if(c==1) gold.setText("No Gold Coin Winner");
            gold.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_goldActionPerformed
private void display_surprise(int n) {
        FileReader file = null;
        try {
             file=new FileReader("address.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bfrd=new BufferedReader(file);
        for(int j=1;j!=n;j++) {try {
            bfrd.readLine();
            } catch (IOException ex) {
                Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        String s = null;
        try {
            s = bfrd.readLine();
        } catch (IOException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        surprise_text.append(s);
        surprise_text.append("\n");
}
    private void surpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surpriseActionPerformed
         FileReader file = null;
        try {
             file=new FileReader("credit.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bfrd=new BufferedReader(file);
       
       int max=0,max_i=1;
       int i=1;
       String s;
       try {
            while((s=bfrd.readLine())!=null)
            {
                int n=Integer.parseInt(s);
               if(n>=max) max_i=i;  
                i++;
              }
            bfrd.close();   
            display_surprise(max_i);
            surprise.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(manager_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_surpriseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        
        FileWriter f = null ;
     PrintWriter writer4;
        try {
            f = new FileWriter("credit.txt");
        } catch (IOException ex) {
            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer4= new PrintWriter(f);
        for(int i=0;i<CN;i++)
            writer4.println("0");
          writer4.close();
          JOptionPane.showMessageDialog(rootPane,"Reset Successful");
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gold;
    private javax.swing.JTextArea gold_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton surprise;
    private javax.swing.JTextArea surprise_text;
    // End of variables declaration//GEN-END:variables
}