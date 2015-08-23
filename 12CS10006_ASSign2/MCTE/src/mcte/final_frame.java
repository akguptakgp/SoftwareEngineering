package mcte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class final_frame extends javax.swing.JFrame {

    public final_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public final_frame(int marks,String s,int q) throws FileNotFoundException, IOException {
    
        System.out.println(marks);
        System.out.println(s);
        System.out.println(q);
        name=s;
        qst=q;
        mark=marks;
        
        initComponents();
        this.setLocationRelativeTo(null);
           qstq=q*4;
        this.marks.setText("You Scored "+marks+" out of "+qstq);
        this.jLabel2.setText("Congratulation "+name);
        switch(marks/qstq)
        {
            case 9:
                grade.setText("Your Grade Point is EX");
                str="EX";
                break;
            case 8:
                grade.setText("Your Grade Point is A");
                str="A";
                break;
            case 7:
                grade.setText("Your Grade Point is B");
                str="B";
                break;
            case 6:
                grade.setText("Your Grade Point is C");
                str="C";
                break;  
            case 5:
                grade.setText("Your Grade Point is D");
                str="D";
                break;  
            case 4:
                grade.setText("Your Grade Point is P");
                str="P";
                break;        
           default:
                grade.setText("Your Grade Point is F");
                str="F";
                break;         
        }
        get_tabel();
          statics();
    }
    private void statics() {
       PrintWriter bfrd;
        try {
            FileWriter frt=new FileWriter("reg_stu.txt",true);
             bfrd=new PrintWriter(frt);
             bfrd.println(mark);
             bfrd.println(str);
             bfrd.println(crt_ans);
             bfrd.println(wrg_ans);
             bfrd.close();
            } catch (IOException ex) {
            Logger.getLogger(data_entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        marks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        grade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Performance");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("Congratulation");

        marks.setBackground(new java.awt.Color(204, 0, 102));
        marks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        marks.setForeground(new java.awt.Color(204, 0, 102));
        marks.setText("You Scored 14 out of 25");

        tb.setBackground(new java.awt.Color(102, 204, 255));
        tb.setForeground(new java.awt.Color(255, 0, 102));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question No.", "Correct Ans.", "Your Ans.", "Marks Obtained"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        grade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grade.setForeground(new java.awt.Color(255, 0, 153));
        grade.setText("Your Grade Point is EX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grade, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
private void get_tabel() throws FileNotFoundException, IOException{
     String str="marks\\"+name+"eval"+".txt";
   FileReader file=new FileReader(str);
   BufferedReader bfrd=new BufferedReader(file);
   String s = null;
   int qst_no=1;
   DefaultTableModel dtb=(DefaultTableModel)tb.getModel();
   while((qst_no<=qst))
   {
       s=bfrd.readLine();
       // System.out.println(s);
       int i=1;
       String sel = null,crt = null,marks = null;
       String tmp="";
       char c[]=s.toCharArray();
       int k=0;
       while(k<c.length)
       {
          while(c[k]!=' ')
          {
           tmp+=c[k];   
            if( k!=c.length-1)
              k++;
             else break;
          }
        switch(i)
        {
            case 1:
                marks=tmp;
                break;
           case 2:
                sel=tmp;
                break;
            case 3:
                crt=tmp;
                break;   
        }
        
        i++;
        tmp="";
        k++;
       }
        if(Integer.parseInt(marks)==4)
          crt_ans++;
       else wrg_ans++;
          
     Object obj[]={qst_no,sel,crt,marks};
    // if(qst_no<=qst+1)
     dtb.addRow(obj);
     qst_no++;
   } System.out.println(s);
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new final_frame(mark,name,qst).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(final_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marks;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
private static String name="ankit";
private static int  mark=15;
private static int qst=5;
private static int crt_ans=0,wrg_ans=0;
private static  int  qstq;
private static String str;
}
