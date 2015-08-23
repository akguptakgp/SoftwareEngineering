
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class item_return extends javax.swing.JFrame {

    public item_return(String s) {
        cust_name=s;
        initComponents();
        print_panel.setVisible(false);
       //  this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        return_panel = new javax.swing.JPanel();
        id_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        return_but = new javax.swing.JButton();
        print_panel = new javax.swing.JPanel();
        print_rec = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name_txt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        return_txt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rent_txt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idifo_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));

        return_panel.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Enter Item ID you want to return");

        return_but.setText("Return");
        return_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout return_panelLayout = new javax.swing.GroupLayout(return_panel);
        return_panel.setLayout(return_panelLayout);
        return_panelLayout.setHorizontalGroup(
            return_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(return_panelLayout.createSequentialGroup()
                .addGroup(return_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(return_panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(return_panelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(return_but)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        return_panelLayout.setVerticalGroup(
            return_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, return_panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(return_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(return_but)
                .addGap(5, 5, 5))
        );

        print_panel.setBackground(new java.awt.Color(0, 204, 204));

        print_rec.setText("Print Receipt");
        print_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_recActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer Name :");

        name_txt.setText("Ankit Kumar Gupta");

        jLabel4.setText("Return Date :");

        return_txt.setText("Return Date");

        jLabel6.setText("Amount  Paid :");

        rent_txt.setText("Rent of CD/DVD");

        jLabel9.setText("Item Return Receipt");

        jLabel8.setText("Item ID");

        idifo_txt.setText("ID ofo");

        javax.swing.GroupLayout print_panelLayout = new javax.swing.GroupLayout(print_panel);
        print_panel.setLayout(print_panelLayout);
        print_panelLayout.setHorizontalGroup(
            print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(print_panelLayout.createSequentialGroup()
                .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(print_panelLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(print_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(print_panelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(return_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idifo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(print_panelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        print_panelLayout.setVerticalGroup(
            print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, print_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name_txt))
                .addGap(18, 18, 18)
                .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_txt)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rent_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(print_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idifo_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(print_rec)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(return_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(return_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(print_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static BufferedImage getimage(Component comp)
{
 BufferedImage bfim= new  BufferedImage(comp.getWidth(),comp.getHeight(), BufferedImage.TYPE_INT_RGB);
 comp.paint(bfim.getGraphics());
 return bfim;
}
public static void save_image(Component comp,String fname) throws Exception{
    
    BufferedImage img=getimage(comp);
    ImageIO.write(img,"png",new File(fname)); 
}
private Double check_amt(int id) throws ParseException
{
    Double amt=null;
    if(id==1){
               
         amt=set_due(1);
         amo_pay=amt;
         return amt;
             }
    if(id==2){
        amt=set_due(2);
        amo_pay=amt;
        return amt;
              }
    return null;
}
public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
public Double set_due(int n) throws ParseException
{
      Date curr_date =new Date();
  //    System.out.println(curr_date);
    switch(n)
    {
        case 1:
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
              //  System.out.println(date); 
                int days1=daysBetween(curr_date,date);
               // System.out.println(days1);
                return  Math.abs(days1*Double.parseDouble(rent1)); 
        case 2:
                Date dat=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
               int days2=daysBetween(curr_date,dat);
             //  System.out.println(dat);
             //  System.out.println(days2);
              return Math.abs(days2*Double.parseDouble(rent2)); 
    }
    return 0.0;
}
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
private Double check_amount(int id) throws FileNotFoundException, IOException, ParseException
{
   String fname="user_files\\"+cust_name+".txt";
       FileReader file= new FileReader(fname);
        try (BufferedReader bfrd = new BufferedReader(file)) { 
         String s;   
         int i=0;
            p1=null;
            p2=null;
         //System.out.println("reading starts!");
            while((s=bfrd.readLine())!=null)
          {  
           //   System.out.println(s);
              switch(i){
                  case 0:
                      cust_name=s;
                      break;
                  case 1:
                      cust_cell=s;
                      break;
                  case 2:
                      cust_addr=s;
                      break;
                  case 3:
                      cust_ID=s;
                      break;    
                  case 4:
                      p1=s;
                      break;
                  case 5:    
                      p2=s;
                      break;
              }
              i++;
           } // System.out.println(s);
            bfrd.close();
        }
       /* System.out.println("pre_getitems reading starts!");
      System.out.println(cust_name);
       System.out.println(cust_cell);
       System.out.println(cust_addr);
       System.out.println(cust_ID);
       System.out.println(p1);
       System.out.println(p2);*/
     get_items(p1,p2);
     
      /* System.out.println("pppp reading starts!");
      System.out.println(cust_name);
       System.out.println(cust_cell);
       System.out.println(cust_addr);
       System.out.println(cust_ID);
       System.out.println(p1);
       System.out.println(p2);*/
     if(id1!=null || id2!=null)
     {
                    if(id1!=null)
                    {
                        if(id1.equals(prnt_id))
                        {
                            flag=1;
                        return check_amt(1);}
                    }
               if(id2!=null) {
                          if(id2.equals(prnt_id)){
                              flag=2;
                          return check_amt(2);}
                    } 
     }
     else
     { 
      return null;  
     }  
        return null;
}
public void enter_file(int id) throws IOException
{
    String fname="user_files\\"+cust_name+".txt";
    FileWriter file=new FileWriter(fname);
    PrintWriter pnrt=new PrintWriter(file);
    pnrt.println(cust_name);
    pnrt.println(cust_cell);
    pnrt.println(cust_addr);
    pnrt.println(cust_ID);
    //System.out.println("flag="+flag+" p1="+p1);
    // System.out.println("flag="+flag+" p2="+p2);
     if(flag==1){
        if(p2!=null)
    pnrt.println(p2);
     }
     if(flag==2)
     {
        pnrt.println(p1); 
     }
    pnrt.close();
}
    private void return_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_butActionPerformed
     
        prnt_id=id_txt.getText();
        if(!"".equals(prnt_id))
        {        
        name_txt.setText(cust_name);
        Date date= new Date();
     //  System.out.println(date);
       SimpleDateFormat spd=new SimpleDateFormat("yyyy-MM-dd");
        prnt_date=spd.format(date);
      // System.out.println(prnt_date);
      //name_txt.setText(prnt_name);
       return_txt.setText(prnt_date);
       //rent_txt.setText(prnt_rent);
       idifo_txt.setText(prnt_id);
      // System.out.println(prnt_id);
       
       Double amount;
        int n = 0;
        try{
        n=Integer.parseInt(prnt_id);
                 try {
                   //  System.out.println(n);
                amount=check_amount(n);
                if(amount!=null){
                 int r=JOptionPane.showConfirmDialog(print_panel,"Pay "+amount+" to clerk!");
                 if(r==0)
                 {
                     enter_file(Integer.parseInt(prnt_id));
                     Connection conn=(Connection)DriverManager.getConnection("jdbc:derby://localhost:1527/manager");
                     Statement st=conn.createStatement();
                     String qry="update manager_data set status='IN STOCK' where id="+prnt_id;
                     st.executeUpdate(qry);
                     st.close();
                     conn.close();
                     JOptionPane.showMessageDialog(print_panel,"returned Successfully!");
                     rent_txt.setText(""+amount.floatValue());
                     print_panel.setVisible(true);
                 }else
                 {
                     JOptionPane.showMessageDialog(print_panel,"Process Canceled by User!");
                     id_txt.setText("");
                 }
                }
                else
                   JOptionPane.showMessageDialog(print_panel,"item ID is not found in Your Check outs Record!");
            } catch (IOException ex) {
                Logger.getLogger(item_return.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(item_return.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(item_return.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
         catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(print_panel,"please enter valid item ID!");
            id_txt.setText("");
        }
        }else
        {
            JOptionPane.showMessageDialog(print_panel,"Please Enter item ID!");
        }

    }//GEN-LAST:event_return_butActionPerformed

    private void print_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_recActionPerformed
        try {
            save_image(print_panel,"print.png");     
        } catch (Exception ex) {
            Logger.getLogger(item_return.class.getName()).log(Level.SEVERE, null, ex);
        }
       dispose();
    }//GEN-LAST:event_print_recActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item_return(cust_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel idifo_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_txt;
    private javax.swing.JPanel print_panel;
    private javax.swing.JButton print_rec;
    private javax.swing.JLabel rent_txt;
    private javax.swing.JButton return_but;
    private javax.swing.JPanel return_panel;
    private javax.swing.JLabel return_txt;
    // End of variables declaration//GEN-END:variables
    public static String prnt_name;
    public static String prnt_date;
    public static String prnt_rent;
    public static String prnt_id;
    public static String cust_name="rewert";
    public String cust_ID,cust_cell,cust_addr;
    public String p1,p2;
    public String date1,date2;   
    public String id1,id2;   
    public String type1,type2;   
    public String rent1,rent2;    
    public Double amo_pay;
    public int flag=1;
}
