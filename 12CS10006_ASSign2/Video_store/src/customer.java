import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class customer extends javax.swing.JFrame {
public customer(String us,welcome_frame prs) throws FileNotFoundException, IOException, ParseException {
       pos_=prs;
      // System.out.println(us);
        cust_name=us;
        initComponents();
        get_profile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        take_loan_but = new javax.swing.JButton();
        retrun_but = new javax.swing.JButton();
        cancel_but = new javax.swing.JButton();
        home_but1 = new javax.swing.JButton();
        profile_but1 = new javax.swing.JButton();
        signout_but1 = new javax.swing.JButton();
        profile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amount_txt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        home_but2 = new javax.swing.JButton();
        profile_but2 = new javax.swing.JButton();
        signout_but2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cust_no = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cust_addr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 204));
        setForeground(new java.awt.Color(0, 153, 51));

        main_panel.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(0, 204, 204));
        home.setForeground(new java.awt.Color(51, 255, 255));
        home.setFocusTraversalPolicyProvider(true);

        take_loan_but.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        take_loan_but.setText("Take Loan");
        take_loan_but.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        take_loan_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_loan_butActionPerformed(evt);
            }
        });

        retrun_but.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retrun_but.setText("Return Item");
        retrun_but.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        retrun_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrun_butActionPerformed(evt);
            }
        });

        cancel_but.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel_but.setText("Cancel MemberShip");
        cancel_but.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        cancel_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_butActionPerformed(evt);
            }
        });

        home_but1.setBackground(new java.awt.Color(204, 204, 255));
        home_but1.setForeground(new java.awt.Color(51, 51, 255));
        home_but1.setText("home");
        home_but1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home_but1.setDoubleBuffered(true);
        home_but1.setMaximumSize(new java.awt.Dimension(39, 19));
        home_but1.setPreferredSize(new java.awt.Dimension(39, 19));
        home_but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_but1ActionPerformed(evt);
            }
        });

        profile_but1.setBackground(new java.awt.Color(204, 204, 255));
        profile_but1.setForeground(new java.awt.Color(0, 51, 255));
        profile_but1.setText("profile");
        profile_but1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profile_but1.setMaximumSize(new java.awt.Dimension(39, 19));
        profile_but1.setPreferredSize(new java.awt.Dimension(39, 19));
        profile_but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_but1ActionPerformed(evt);
            }
        });

        signout_but1.setBackground(new java.awt.Color(204, 204, 255));
        signout_but1.setForeground(new java.awt.Color(51, 51, 255));
        signout_but1.setText("sign out");
        signout_but1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signout_but1.setMaximumSize(new java.awt.Dimension(39, 19));
        signout_but1.setPreferredSize(new java.awt.Dimension(39, 19));
        signout_but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_but1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_but1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(profile_but1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signout_but1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(take_loan_but, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retrun_but, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_but, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        homeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {home_but1, profile_but1});

        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_but1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_but1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signout_but1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(take_loan_but, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(retrun_but, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cancel_but, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        homeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {home_but1, profile_but1, signout_but1});

        homeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancel_but, retrun_but, take_loan_but});

        main_panel.add(home, "card2");

        profile.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Personal  Profile of Customer Name");

        jLabel2.setText(" Name :");

        name_label.setText("Customer Name");

        jLabel4.setText("Customer ID:");

        id_label.setText("ID");

        tb.setBackground(new java.awt.Color(204, 255, 204));
        tb.setForeground(new java.awt.Color(0, 102, 102));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   Item ID", "   Date ", "   Type", "   Rent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.setRowHeight(25);
        jScrollPane1.setViewportView(tb);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Your Current  Check-outs");

        jLabel7.setText("Your Total  Due Amount  :");

        amount_txt.setText("Customer Credits");

        jLabel9.setText("Note :  Due amount is calculated up to Today Date");

        home_but2.setBackground(new java.awt.Color(204, 204, 255));
        home_but2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        home_but2.setForeground(new java.awt.Color(0, 51, 255));
        home_but2.setText("home");
        home_but2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home_but2.setDoubleBuffered(true);
        home_but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_but2ActionPerformed(evt);
            }
        });

        profile_but2.setBackground(new java.awt.Color(204, 204, 255));
        profile_but2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        profile_but2.setForeground(new java.awt.Color(0, 51, 255));
        profile_but2.setText("profile");
        profile_but2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profile_but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_but2ActionPerformed(evt);
            }
        });

        signout_but2.setBackground(new java.awt.Color(204, 204, 255));
        signout_but2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signout_but2.setForeground(new java.awt.Color(0, 51, 255));
        signout_but2.setText("sign out");
        signout_but2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signout_but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_but2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone No. :");

        cust_no.setText("cell no.");

        jLabel10.setText("Address  :");

        cust_addr.setText("customer Address");

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_but2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(profile_but2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signout_but2)
                        .addGap(24, 24, 24))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(profileLayout.createSequentialGroup()
                                    .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cust_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cust_no, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(86, Short.MAX_VALUE))))
            .addGroup(profileLayout.createSequentialGroup()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profileLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        profileLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, name_label});

        profileLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {home_but2, profile_but2});

        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_but2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_but2)
                    .addComponent(signout_but2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cust_no))
                .addGap(18, 18, 18)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cust_addr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        profileLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, name_label});

        profileLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {home_but2, profile_but2, signout_but2});

        main_panel.add(profile, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
public Double set_due(int n) throws ParseException
{
      Date curr_date =new Date();
     // System.out.println(curr_date);
    switch(n)
    {
        case 1:
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
             //   System.out.println(date); 
                int days1=daysBetween(curr_date,date);
                //System.out.println(days1);
                return  Math.abs(days1*Double.parseDouble(rent1)); 
        case 2:
                Date dat=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
               int days2=daysBetween(curr_date,dat);
            //   System.out.println(dat);
            //   System.out.println(days2);
              return Math.abs(days2*Double.parseDouble(rent2)); 
    }
    return 0.0;
}
    void get_profile() throws FileNotFoundException, IOException, ParseException
{
    String fname="user_files\\"+cust_name+".txt";
   // System.out.println("readung "+fname);
    FileReader file= new FileReader(fname);
        try (BufferedReader bfrd = new BufferedReader(file)) {
            cust_name=bfrd.readLine();
            cust_cell=bfrd.readLine();
            cust_add=bfrd.readLine();
            cust_ID=bfrd.readLine();
            p1=bfrd.readLine();
            p2=bfrd.readLine();
            bfrd.close();
        }
         
        jLabel1.setText("Personal  Profile of "+cust_name);
        name_label.setText(cust_name);
        id_label.setText(cust_ID);
        cust_no.setText(cust_cell);
        cust_addr.setText(cust_add);
        get_items(p1,p2);
        DefaultTableModel dtb= (DefaultTableModel)tb.getModel();
        int no_r=dtb.getRowCount();
        //System.out.println(no_r);
     //  int i=0;
        while(no_r!=0){ dtb.removeRow(no_r-1);no_r--;}
        
     //  if(id1==null && id2==null)
     //       System.out.println("yes id1 and id2"+id1+id2+p1+p2);
     //   System.out.println("no id1 and id2"+p1+p2);
        Object[] rowData1={id1,date1,type1,rent1};
        dtb.addRow(rowData1);
        Object[]  rowData2={id2,date2,type2,rent2};
        dtb.addRow(rowData2);
        Double rent=0.0;
        if(date1!=null)
        rent+=set_due(1);
        if(date2!=null)
         rent+=set_due(2);   
         amount_txt.setText(""+rent.floatValue());
}

    private void take_loan_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_loan_butActionPerformed
         loan ln = null;
        try {
            ln = new loan(cust_name,this);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            ln.setVisible(true);
            
    }//GEN-LAST:event_take_loan_butActionPerformed

    private void retrun_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrun_butActionPerformed
          welcome_frame frm =  new welcome_frame(cust_name);
          frm.setVisible(true);
            
    }//GEN-LAST:event_retrun_butActionPerformed

    private void cancel_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_butActionPerformed
      Float amount=Float.parseFloat(amount_txt.getText());
      if(amount!=0.0 ||id1!=null || id2!=null)
      {
          JOptionPane.showMessageDialog(main_panel,"please Clear Dues first!");
      }
      else
      {
          try {
              Connection conn = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/manager");
                Statement st=conn.createStatement();
             st.executeUpdate("delete from users where username ='"+cust_name+"'");   
             
             File file=new File("user_files\\"+cust_name+".txt");
             file.delete();
          } catch (SQLException ex) {
              Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
          }
          JOptionPane.showMessageDialog(main_panel,"Cancelled Successfully \n You Can Collect your 1000Rs. from clerk!");
      }
    }//GEN-LAST:event_cancel_butActionPerformed

    private void signout_but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_but1ActionPerformed
        pos_.dispose();
        new welcome_frame().setVisible(true);
       dispose();
    }//GEN-LAST:event_signout_but1ActionPerformed

    private void profile_but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_but1ActionPerformed
    try { 
        get_profile();
    } catch (IOException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    }
        CardLayout cl=(CardLayout)main_panel.getLayout();
       cl.show(main_panel,"card3");
    }//GEN-LAST:event_profile_but1ActionPerformed

    private void home_but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_but1ActionPerformed
         CardLayout cl=(CardLayout)main_panel.getLayout();
       cl.show(main_panel,"card2");
    }//GEN-LAST:event_home_but1ActionPerformed

    private void home_but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_but2ActionPerformed
       CardLayout cl=(CardLayout)main_panel.getLayout();
       cl.show(main_panel,"card2");
    }//GEN-LAST:event_home_but2ActionPerformed

    private void profile_but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_but2ActionPerformed
    try {
        get_profile();
    } catch (IOException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
    }
          CardLayout cl=(CardLayout)main_panel.getLayout();
       cl.show(main_panel,"card3");
    }//GEN-LAST:event_profile_but2ActionPerformed

    private void signout_but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_but2ActionPerformed

        new welcome_frame().setVisible(true);
       dispose();
    }//GEN-LAST:event_signout_but2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new customer(cust_name,pos_).setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount_txt;
    private javax.swing.JButton cancel_but;
    private javax.swing.JLabel cust_addr;
    private javax.swing.JLabel cust_no;
    private javax.swing.JPanel home;
    private javax.swing.JButton home_but1;
    private javax.swing.JButton home_but2;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel name_label;
    private javax.swing.JPanel profile;
    private javax.swing.JButton profile_but1;
    private javax.swing.JButton profile_but2;
    private javax.swing.JButton retrun_but;
    private javax.swing.JButton signout_but1;
    private javax.swing.JButton signout_but2;
    private javax.swing.JButton take_loan_but;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
   public static String cust_name; 
   public static String cust_cell; 
   public static String cust_add; 
   public static String cust_ID; 
   public static String p1,p2; 
   public static String id1,id2;
   public static String rent1,rent2;
   public static String date1,date2;
   public static String type1,type2;
   public static welcome_frame pos_;
}
