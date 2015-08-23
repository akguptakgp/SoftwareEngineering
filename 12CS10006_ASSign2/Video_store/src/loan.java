import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class loan extends javax.swing.JFrame {

     public loan(String s) throws SQLException {
    //  System.out.println(s);
        cust_name=s;
        initComponents();
        get_connection();
    }
    public loan(String s,customer c) throws SQLException {
    //  System.out.println(s);
        cust_name=s;
        initComponents();
        get_connection();
        cust=c;
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        tb.setForeground(new java.awt.Color(0, 102, 102));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "RENT", "TYPE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(tb);

        jButton1.setText("Take Loan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<-Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Select the Row of the Item You Want to Purchase ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(69, 69, 69)
                        .addComponent(jButton2)
                        .addGap(126, 126, 126))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
public void get_items(String p1,String p2)
{
      id1=null;
     date1=null;
     type1=null;
     rent1=null;
       id2=null;
     date2=null;
     type2=null;
     rent2=null;
    if(p1!=null){
    int i,k;
    String str="";
    char c1[]=p1.toCharArray();
    i=0;k=1;
    str="";
   
    while(i<c1.length)
    {
       // System.out.println(str);
        //System.out.println(c1[i]);
        if(c1[i]!=' ' && i!=c1.length-1)
            str+=c1[i];
        else {
            if(i==c1.length-1){
                 str+=c1[i] ; 
             rent1=str;
            }
           else
           switch(k)
           {
               case 1:
                     id1=str;
                   break;
               case 2:
                   date1=str;
                   break;
               case 3:
                  type1=str;
                   break;
               case 4:
                   break;
           }
           str="";
           k++;
        }
        //System.out.println(i+" "+c1.length);
          i++;
     }
    }
   /* System.out.println(id1);
    System.out.println(date1);
    System.out.println(type1);
    System.out.println(rent1);*/
    
    if(p2!=null){
        
     int i,k;
   String str="";
     char c2[]=p2.toCharArray();
     i=0;k=1;
     
    while(i<c2.length)
    {
       // System.out.println(str);
        //System.out.println(c1[i]);
        if(c2[i]!=' ' &&i!=c2.length-1)
            str+=c2[i];
        else {
             if(i==c2.length-1){
                str+=c2[i] ;
                rent2=str;
             }
           else
           switch(k)
           {
               case 1:
                    id2=str;
                   break;
               case 2:
                   date2=str;
                   break;
               case 3:
                   type2=str;
                   break;
               case 4:
                   break;
           }
           str="";
           k++;
        }
          i++;
     }}
   /* System.out.println(id2);
     System.out.println(date2);
    System.out.println(type2);
    System.out.println(rent2);*/
}
 public int check_file() throws FileNotFoundException, IOException
 { 
      int i = 0;
    String fname="user_files\\"+cust_name+".txt";
   // System.out.println("readung "+fname);
    FileReader file= new FileReader(fname);
        try (BufferedReader bfrd = new BufferedReader(file)) {
           String  cust_name1=bfrd.readLine();
           String   cust_cell=bfrd.readLine();
            String cust_add=bfrd.readLine();
          String   cust_ID=bfrd.readLine();
            p1=bfrd.readLine();
            p2=bfrd.readLine();
            bfrd.close();
        }
            
        get_items(p1,p2);
       // if(id1==null && id2==null)
          //System.out.println("yes id1 and id2"+1+p2);
         //System.out.println("no id1 and id2"+p1+p2);
       /*  System.out.println("case 1");
          System.out.println(type);
         System.out.println(type1);
         System.out.println(type2);*/
        
        if(id1==null && id2==null)
            return 1;
        else{
            
     if((id1==null && id2!=null) ||(id2==null && id1!=null) )
     {
        /*   System.out.println("case 2");
         System.out.println(type);
         System.out.println(type1);
         System.out.println(type2);*/
        if(type.equals(type1) || type.equals(type2)){ 
        /*      System.out.println("case 5");
             System.out.println(type);
            System.out.println(type1);
            System.out.println(type2);*/
            
            return 2;}
        else {
         /*     System.out.println("case 3");
             System.out.println(type);
            System.out.println(type1);
            System.out.println(type2);*/
            return 1;}
     }
     else {
         /*   System.out.println("case 4");
             System.out.println(type);
            System.out.println(type1);
            System.out.println(type2);*/
         return 0;
     }}
 }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sltr ;
        sltr = tb.getSelectedRow();
        if(sltr!=-1){
        id=tb.getValueAt(sltr,0);
        rent=tb.getValueAt(sltr,1);
        type=tb.getValueAt(sltr,2);
        status=tb.getValueAt(sltr,3);
        if(!status.equals("OUT OF STOCK")){
       Object[] selectedObject={id,rent,type,status};
       
              /*  System.out.println(selectedObject[0]);
                System.out.println(selectedObject[1]);
                System.out.println(selectedObject[2]);
                System.out.println(selectedObject[3]);*/
       
        try {
            int _can=check_file();
            System.out.println(_can);
         //   System.out.println(_can);
            if(_can==1)
            {
            // System.out.println("writing user_files\\"+cust_name+".txt");
             FileWriter file=new FileWriter("user_files\\"+cust_name+".txt",true);
             PrintWriter pnrt=new PrintWriter(file);
             Date  date =new Date();
             SimpleDateFormat smp=new SimpleDateFormat("yyyy-MM-dd");
             String str=smp.format(date);
            // System.out.println(str);
                pnrt.println(id+" "+str+" "+type+" "+rent);
                pnrt.close();
                
            Connection conn=(Connection)DriverManager.getConnection("jdbc:derby://localhost:1527/manager");
            Statement st=conn.createStatement();
            String qry="update manager_data set status='OUT OF STOCK' where id="+id.toString();
             st.executeUpdate(qry);
             st.close();
             conn.close();
                JOptionPane.showMessageDialog(rootPane,"Loan successfull!");
                 new customer(cust.cust_name,cust.pos_);
                // cust.dispose();;
                get_connection();
            }
            else
             if(_can==0)
            {
               JOptionPane.showMessageDialog(rootPane,"You have already taken maximum possible items !");
            }
            else
             {
               JOptionPane.showMessageDialog(rootPane,"You have already taken item of "+type+" type !");
             }
  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(loan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(loan.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
                Logger.getLogger(loan.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(loan.class.getName()).log(Level.SEVERE, null, ex);
            }}else{
             JOptionPane.showMessageDialog(rootPane,"Item is out of stock!");  }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Please select the row corresponding to item!");}
    }//GEN-LAST:event_jButton1ActionPerformed
public void get_connection() throws SQLException {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/manager");
        } catch (SQLException ex) {
            Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date d = new Date();
        SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
        String sd=String.format("yyyy-mm-dd", d);
      String   qry = "select ID,RENT,TYPE,STATUS from manager_data order by id";
        st.executeQuery(qry);
        ResultSet rs = null;
        rs = st.getResultSet(); 
        
     tb.setModel(DbUtils.resultSetToTableModel(rs));
       rs.close();
        st.close();
        conn.close();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new loan(cust_name).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(loan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
private static String cust_name;
private String p1,p2;
private Object id,rent,type,status;
// public static String p1,p2; 
   public static String id1,id2;
   public static String rent1,rent2;
   public static String date1,date2;
   public static String type1,type2;
   public static customer cust;
}
