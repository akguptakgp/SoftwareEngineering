
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class purchase_frame extends javax.swing.JFrame {

  private int CN;
    public purchase_frame() {
        initComponents();
    }
public purchase_frame (int N){
this.CN=N;
initComponents();
}

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        items_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        item = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        items_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        items_label.setText("items in store ");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("    ItemID        Price\n1.   IT1            250 \n2.   IT2            500\n3.   IT3            760\n4.   IT4            900\n5.   IT5            1100\n6.   IT6            1500\n7.   IT7            1700 \n8.   IT8            2500\n");
        jScrollPane2.setViewportView(jTextArea1);

        item.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   IT1             ", "   IT2            ", "   IT3           ", "   IT4            ", "   IT5            ", "   IT6            ", "   IT7            ", "   IT8" }));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("select item you want to purchase");

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(items_label, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(items_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
                                                      
                        int temp;
                        FileReader frd = null;
                        try {
                            frd = new FileReader("credit.txt");
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(purchase_frame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        BufferedReader bfrd =new BufferedReader(frd);
                        
                        ArrayList<String> str = new ArrayList<>();
                        String s;
                        try {
                            while((s=bfrd.readLine())!=null)
                            {
                                str.add(s);
                            }
                            bfrd.close();
                        } catch (IOException ex) {
                            Logger.getLogger(purchase_frame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                            if(evt.getSource()==item)
                            {
                                temp=item.getSelectedIndex();
                                int n1=Integer.parseInt(str.get(CN-1));
                                
                                switch(temp+1)
                                {
                                    case 1 :
                                        n1+=Integer.parseInt("250");
                                        String n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 2:
                                        n1+=Integer.parseInt("500");
                                        n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 3:
                                        n1+=Integer.parseInt("760");
                                        n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 4:
                                        n1+=Integer.parseInt("900");
                                        n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 5:
                                        n1+=Integer.parseInt("1100");
                                         n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 6:
                                        n1+=Integer.parseInt("1500");
                                         n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 7:
                                        n1+=Integer.parseInt("1700");
                                         n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                    case 8:
                                        n1+=Integer.parseInt("2500");
                                         n=Integer.toString(n1);
                                        str.set(CN-1,n);
                                        break;
                                        
                                }
                            }
                         
                   FileWriter f = null ;
                        PrintWriter writer1;
                        try {
                            f = new FileWriter("credit.txt");
                        } catch (IOException ex) {
                            Logger.getLogger(register_frame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        writer1 = new PrintWriter(f);
      for(int i=0;i<str.size();i++)
          writer1.println(str.get(i));
      writer1.close();
      JOptionPane.showMessageDialog(rootPane,"Purchased Successfully!");
        
    }//GEN-LAST:event_itemActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      this.setVisible(rootPaneCheckingEnabled);
      dispose();
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_frame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox item;
    private javax.swing.JLabel items_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
