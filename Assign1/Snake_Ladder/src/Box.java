
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Box extends javax.swing.JFrame {

  
    public Box() {
        initComponents(); 
         this.setLocationRelativeTo(null);
    }
    public Box(int nr,int nc,int np) throws IOException
    {
        nor=nr;noc=nc;nop=np;
      initComponents();
       this.setLocationRelativeTo(null);
       p1_turn.setVisible(true);
       p2_turn.setVisible(false);
       p3_turn.setVisible(false);
      //  JPanel main_panel =new JPanel();
        GridLayout grid=new GridLayout(nor,noc);
        main_panel.setLayout(grid);
        
       JPanel[] panelArr=new JPanel[nor*noc];
       
       for(int i=0;i<noc*nor;i++)
           panelArr[i]=new JPanel();
       
        int  k1,k2;
       JPanel tmp = null;
        for(int i=1;i<=nor;i++)
        {
            k1=0;k2=1;
            for(int j=1;j<=noc;j++)
            {
                int n = 0;
                if(nor%2==0)
                {
                if((i%2)==1)
                n=nor*noc+1-((i-1)*noc+j);
                else
                    n=nor*noc+1-((i-1)*noc+noc+1-j);
                }
                else
                {
                    if((i%2)!=1)
                n=nor*noc+1-((i-1)*noc+j);
                else
                    n=nor*noc+1-((i-1)*noc+noc+1-j);
                }
          //      System.out.println("curr="+i+","+j+"com="+cord_i(n)+","+cord_j(n));
               String str=Integer.toString(n);
               JLabel temp=new JLabel(str,JLabel.CENTER);
               temp.setFont(new Font("Arial",Font.BOLD,14));
               temp.setForeground(Color.BLACK);
               if(i%2==0)
                panelArr[(i-1)*noc+j-1].setBackground(clr[(k1++)%2]);
               else
                   panelArr[(i-1)*noc+j-1].setBackground(clr[(k2++)%2]); 
                panelArr[(i-1)*noc+j-1].add(temp);
                main_panel.add(panelArr[(i-1)*noc+j-1]);
              }}
        if(nop==2) { p3_label.setVisible(false);p3_turn.setVisible(false);p3_text.setVisible(false);}
       this.roll_but.setEnabled(false);
     //  ImageIcon start_icon =new ImageIcon("d3.jpg");
     //  this.roll_but.setIcon(start_icon);
       get_snake();
    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        south_panel = new javax.swing.JPanel();
        start_but = new javax.swing.JButton();
        roll_but = new javax.swing.JButton();
        exit_but = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        p3_text = new javax.swing.JTextField();
        p2_text = new javax.swing.JTextField();
        p1_text = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        p3_turn = new javax.swing.JLabel();
        p1_label = new javax.swing.JLabel();
        p3_label = new javax.swing.JLabel();
        p2_turn = new javax.swing.JLabel();
        p1_turn = new javax.swing.JLabel();
        p2_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        start_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start_but.setText("START");
        start_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_butActionPerformed(evt);
            }
        });

        roll_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roll_but.setText("ROLL");
        roll_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roll_butActionPerformed(evt);
            }
        });

        exit_but.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit_but.setText("Exit");
        exit_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_butActionPerformed(evt);
            }
        });

        p3_text.setEditable(false);
        p3_text.setText("your current position is 0");

        p2_text.setEditable(false);
        p2_text.setText("your current position is 0");

        p1_text.setEditable(false);
        p1_text.setText("your current position is 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2_text)
                    .addComponent(p1_text, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(p3_text, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p2_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(p3_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {p1_text, p2_text, p3_text});

        p3_turn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p3_turn.setText("Your turn :");

        p1_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p1_label.setText("Player 1 :");

        p3_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p3_label.setText(" Player3 :");

        p2_turn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p2_turn.setText("Your turn :");

        p1_turn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p1_turn.setText("Your turn :");

        p2_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p2_label.setText("Player2 :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p2_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p2_turn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1_turn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p3_label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3_turn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {p1_label, p2_label, p3_label});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {p1_turn, p2_turn, p3_turn});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1_turn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2_label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2_turn))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3_turn)
                    .addComponent(p3_label))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {p1_label, p2_label, p3_label});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {p1_turn, p2_turn, p3_turn});

        javax.swing.GroupLayout south_panelLayout = new javax.swing.GroupLayout(south_panel);
        south_panel.setLayout(south_panelLayout);
        south_panelLayout.setHorizontalGroup(
            south_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(south_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(south_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(south_panelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(exit_but, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(south_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(south_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roll_but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        south_panelLayout.setVerticalGroup(
            south_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(south_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(south_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(south_panelLayout.createSequentialGroup()
                        .addComponent(roll_but, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(start_but, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(exit_but))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(south_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(south_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private int cord_i(int n)
{
    //if(nor%2==0)
    { n=n/noc;
    n=nor-n;}
   // else
        
      return n;
}

private int cord_j(int n)
{
    int i=cord_i(n);
    if(nor%2==0)
    {
    if(i%2==1)
        return nor*noc-i*noc-n;
    else
    {
       n=nor*noc-i*noc-n;
       return noc-1-n;
    }
    }
    else
    {
     if(i%2!=1) 
         return nor*noc-i*noc-n;
     else
     {
        n=nor*noc-i*noc-n;
       return noc-1-n; 
     }
    }
}

 private void move_pos(int turn,int pos)
{
    switch(turn)
    {
        case 1:
            break;
        case 2:
            break;
        case 3:   
            break;
    }
}
    @SuppressWarnings("empty-statement")
    private void check_data(String str,int l) throws FileNotFoundException, IOException
{
    FileReader file=new FileReader("data.txt");
    BufferedReader bfrd=new BufferedReader(file);
        String s;
        int i=0;int pl = 0;
    while((s=bfrd.readLine())!=null)
    {
        i=i+2;
        if(s==str) {pl=Integer.parseInt(bfrd.readLine());bfrd.close();break;}
        else bfrd.readLine();
    }bfrd.close();
    
    File tmp=new File("temp.txt");
    tmp.createNewFile();
     file=new FileReader("data.txt");
     bfrd=new BufferedReader(file);
    
    FileWriter frt=new FileWriter(tmp);
   PrintWriter pnrt=null;
        pnrt = new PrintWriter(frt);
   int j=1;
   while((s=bfrd.readLine())!=null)
   {
    if(j==i) {pnrt.println(l);}
    else pnrt.println(s);
    j++;
    }
    if(pl>l)
        JOptionPane.showMessageDialog(main_panel,"Congratulation"+str+"\nYou broke your Past Record of "+pl);
 bfrd.close();
 pnrt.close();
}
private void get_snake()
{
     
                 FileReader file = null;
        try {
            file = new FileReader("position.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bfrd=new BufferedReader(file);
        no_snake = 0;
        try {
            no_snake = Integer.parseInt(bfrd.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(no_snake);
  
         
            String s="";
            String str = null;
        try {
            str = bfrd.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i=0;
        char[] c=str.toCharArray();
        while(i<c.length)
        {
          if(c[i]!=',')
           s=s+c[i];
          else
          {
              snakeh.add(Integer.parseInt(s));
              s="";
          }
          i++;
        }
        snakeh.add(Integer.parseInt(s));
        
       // for(int j=0;j<snakeh.size();j++) System.out.println(snakeh.get(j));
               s="";
             str = null;
        try {
            str = bfrd.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
         i=0;
        c=str.toCharArray();
        while(i<c.length)
        {
          if(c[i]!=',')
           s=s+c[i];
          else
          {
              snaket.add(Integer.parseInt(s));
              s="";
          }
          i++;
        }
        snaket.add(Integer.parseInt(s));
        
        //for(int j=0;j<snaket.size();j++) System.out.println(snaket.get(j));
        //ladder
        
       no_ladder = 0;
        try {
            no_ladder = Integer.parseInt(bfrd.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  System.out.println(no_ladder);
              s="";
             str = null;
        try {
            str = bfrd.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
         i=0;
        c=str.toCharArray();
        while(i<c.length)
        {
          if(c[i]!=',')
           s=s+c[i];
          else
          {
              ladderh.add(Integer.parseInt(s));
              s="";
          }
          i++;
        }
        ladderh.add(Integer.parseInt(s));
        
      //  for(int j=0;j<ladderh.size();j++) System.out.println(ladderh.get(j)); 
          s="";
             str = null;
        try {
            str = bfrd.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
         i=0;
        c=str.toCharArray();
        while(i<c.length)
        {
          if(c[i]!=',')
           s=s+c[i];
          else
          {
              laddert.add(Integer.parseInt(s));
              s="";
          }
          i++;
        }
        laddert.add(Integer.parseInt(s));
}
private int turn_label()
{
       int turn=1;
       if(nop==3)
       {
        boolean b1;
         b1=p1_turn.isVisible();
       
        if(b1)
        {
        p1_turn.setVisible(!b1);
        p2_turn.setVisible(b1);
        p3_turn.setVisible(!b1);
        return 1;
        }
        else
        {
            boolean b2=p2_turn.isVisible();
            if(b2)
            {
                p1_turn.setVisible(!b2);
                p2_turn.setVisible(!b2);
                p3_turn.setVisible(b2);
                return 2;
            }
            else{
                  p1_turn.setVisible(!b2);
                  p2_turn.setVisible(b2);
                  p3_turn.setVisible(b2);
                  return 3;
                }
           }
       }
         else
       {
          boolean b1=p1_turn.isVisible();
          p1_turn.setVisible(!b1);
          p2_turn.setVisible(b1);
          if(b1) return 1;
          else return 2;
       }
  }
private void check_snake(int pos,int n)
{
    int flag=0;
    for(int i=0;i<snakeh.size();i++) {
        if(pos==snakeh.get(i)){
            JOptionPane.showMessageDialog(main_panel,"Sanke at "+pos+" got you");
            pos=snaket.get(i); 
              flag=1;}
         }
    switch(n)
    {
        case 1:{ //if(flag==1) move_pos(1,pos);
        pos1=pos;break;}
        case 2:{ //if(flag==1) move_pos(2,pos);
            pos2=pos;break;}
        case 3:{ ///if(flag==1) move_pos(3,pos);
            pos3=pos;break;}  
    }
}
private void check_ladder(int pos,int n)
{
      int flag=0;
     for(int i=0;i<laddert.size();i++) {
        if(pos==laddert.get(i)){
            JOptionPane.showMessageDialog(main_panel,"You are up through Ladder at "+pos);
            pos=ladderh.get(i);
            flag=1;}
         }
    switch(n)
    {
        case 1: {  //if(flag==1) move_pos(1,pos);
            pos1=pos;break;}
        case 2: {  //if(flag==1) move_pos(2,pos);
            pos2=pos;break;}
        case 3: { //if(flag==1)  move_pos(3,pos);
            pos3=pos;break;}    
    }
}
private void set_pos(int turn,int rndm) throws IOException
{
    switch(turn)
    {
        case 1:
        {
            if(pos1+rndm==nor*noc)
            {
                pos1=nor*noc;
               // move_pos(1,pos1);
                JOptionPane.showMessageDialog(main_panel,"Congratulation \n "+p1_name +"you won the game in "+nop1+" rounds");
                check_data(p1_name,nop1);
                dispose();
           }
            if(pos1+rndm < nor*noc){
            pos1+=rndm;
            //move_pos(1,pos1);}
            check_snake(pos1,1);
            check_ladder(pos1,1);
            break;
        }
         }
        case 2:
        {
            if(pos2+rndm==nor*noc)
            {
                pos2=nor*noc;
              //  move_pos(2,pos2);
              JOptionPane.showMessageDialog(main_panel,"Congratulation \n "+p2_name+"you won the game in "+nop2+" rounds");  
              check_data(p1_name,nop1);
              dispose();
          }
            if(pos2+rndm <nor*noc){
            pos2+=rndm;
           // move_pos(2,pos2);}
            check_snake(pos2,2);
            check_ladder(pos2,2);
            break;
        }
          }
        case 3:
        {
            
            if(pos3+rndm==nor*noc)
            {
                pos3=nor*noc;
               // move_pos(3,pos3);
                JOptionPane.showMessageDialog(main_panel,"Congratulation \n "+p3_name+"you won the game in "+nop1+" rounds");
               check_data(p1_name,nop1);
                dispose();
            }
            if(pos3+rndm < nor*noc){
            pos3+=rndm;
          //  move_pos(3,pos3);}
            check_snake(pos3,3);
            check_ladder(pos3,3);
            break;
        }}
    } 
}
private void display_text(int turn,int rndm) throws IOException
{
    set_pos(turn,rndm);
    String str="you got "+Integer.toString(rndm)+" and your current position is ";
      if(nop==3)   
      switch(turn)
           {
               case 1: str+=Integer.toString(pos1);
                       p1_text.setText(str);
                       p2_text.setText("your current position is "+Integer.toString(pos2));
                       p3_text.setText("your current position is "+Integer.toString(pos3));
                       nop1++;
                       break;
               case 2: str+=Integer.toString(pos2);
                       p2_text.setText(str);
                       p1_text.setText("your current position is "+Integer.toString(pos1));
                       p3_text.setText("your current position is "+Integer.toString(pos3));
                       nop2++;
                       break;
               case 3 :str+=Integer.toString(pos3);
                       p3_text.setText(str);
                       p1_text.setText("your current position is "+Integer.toString(pos1));
                       p2_text.setText("your current position is "+Integer.toString(pos2));
                       nop3++;
                       break;
            }
      else
         switch(turn)
           {
               case 1: str+=Integer.toString(pos1);
                       p1_text.setText(str);
                       p2_text.setText("your current position is "+Integer.toString(pos2));
                       nop1++;
                       break;
               case 2: str+=Integer.toString(pos2);
                       p2_text.setText(str);
                       p1_text.setText("your current position is "+Integer.toString(pos1));
                       nop2++;
                       break;
            } 
           
}
    private void roll_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roll_butActionPerformed
    
           int turn=turn_label();
          int rndm=(int) (Math.random()*50)%6+1;
        try {
            // System.out.println(turn+" "+rndm);
            display_text(turn,rndm);
        } catch (IOException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_roll_butActionPerformed

    private void exit_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_butActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_exit_butActionPerformed

    private void start_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_butActionPerformed
        //players_name data= new players_name(nop);
        //data.setVisible(true);
        p1_name= JOptionPane.showInputDialog("Enter Name of Player 1");
        p2_name= JOptionPane.showInputDialog("Enter Name of Player 2");
        if(nop!=2)
        p3_name= JOptionPane.showInputDialog("Enter Name of Player 3");
        System.out.println(p1_name);
        System.out.println(p2_name);
        if(nop!=2)
        System.out.println(p3_name);
        this.roll_but.setEnabled(true);
        this.p1_label.setText(p1_name+" :");
        this.p2_label.setText(p2_name+" :");
        this.p3_label.setText(p3_name+" :");
    }//GEN-LAST:event_start_butActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Box().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_but;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel p1_label;
    private javax.swing.JTextField p1_text;
    private javax.swing.JLabel p1_turn;
    private javax.swing.JLabel p2_label;
    private javax.swing.JTextField p2_text;
    private javax.swing.JLabel p2_turn;
    private javax.swing.JLabel p3_label;
    private javax.swing.JTextField p3_text;
    private javax.swing.JLabel p3_turn;
    private javax.swing.JButton roll_but;
    private javax.swing.JPanel south_panel;
    private javax.swing.JButton start_but;
    // End of variables declaration//GEN-END:variables

private static int nor,noc,nop;
private final Color[] clr={Color.cyan,Color.MAGENTA};

private static String p1_name,p2_name,p3_name;
private static int no_snake;
private static int no_ladder;
private static  ArrayList <Integer> snakeh=new ArrayList<Integer>();
private static  ArrayList <Integer> snaket=new ArrayList<Integer>();
private static  ArrayList <Integer> ladderh=new ArrayList<Integer>();
private static  ArrayList <Integer> laddert=new ArrayList<Integer>();
private static int pos1=0,pos2=0,pos3=0;
private static int nop1=0,nop2=0,nop3=0;
}
