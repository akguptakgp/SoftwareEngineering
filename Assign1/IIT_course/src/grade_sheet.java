
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;


public class grade_sheet extends javax.swing.JFrame {
    public grade_sheet() {
        initComponents();
        String[] title = {"Subno.", "Sub. Name", "Type", "CRD","GRD"};
        Object[][] playerdata = {       
        {new Integer(4), "United States", "Sterling Davis" , "Forward","EX"},
        {new Integer(6), "Germany", "Moritz Wohlers", "Forward/Centre","A"},
        {new Integer(7), "United Kingdom", "Ross Hutton", "Centre","A"},
        {new Integer(8), "Belgium", "Hugo Sterk", "Guard","A"},
        {new Integer(10), "United Kingdom", "Andy Pearson", "Forward","A"},
        {new Integer(11), "United States", "Robert Yanders", "Guard","A"},
        {new Integer(12), "United Kingdom", "Graham Hunter", "Guard","A"},
        {new Integer(14), "United Kingdom", "Julius Joseph", "Guard/Forward","A"},
        {new Integer(15), "United Kingdom", "Gareth Murray", "Forward","A"},
        {new Integer(21), "United States", "Maurice Hampton", "Guard","A"}};
        JTable table = new JTable(playerdata, title);
        scroll_pane= new JScrollPane(table); 
       // scroll_pane.setPreferredSize(new Dimension(500, 200));
        scroll_pane.setVisible(true);
        main_panel=new JPanel();
        this.setContentPane(main_panel);
        main_panel.add(scroll_pane);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //this.pack();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        grade_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grade Sheet");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Subno.", "Sub. Name", "Type", "CRD","GRD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        grade_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grade_name.setText("Grade Sheet :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(grade_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grade_name)
                .addGap(18, 18, 18)
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("empty-statement")
    public grade_sheet(int roll) throws FileNotFoundException, IOException
{
 
         initComponents();
         FileReader frd=new FileReader("reg_students.txt");
         BufferedReader bfrd=new BufferedReader(frd);
         bfrd.readLine();
         int i=1;
         String name = null;
         while(i!=roll){
           bfrd.readLine();
           bfrd.readLine();
           bfrd.readLine();
           i++;
         }
         name=bfrd.readLine();
         frd.close();
  
        grade_name.setText("Grade list of "+name);
      
        
      //  ArrayList<Object[]> grade=new ArrayList<Object[]>();
        
        int no_cor,no_elect;
         frd=new FileReader("reg_files"+roll+".txt");
         bfrd=new BufferedReader(frd);
         FileReader frd1=new FileReader("Core.txt");
         BufferedReader bfrd1=new BufferedReader(frd1);
         
         bfrd1.readLine();bfrd1.readLine();
         no_cor=Integer.parseInt(bfrd.readLine());
         Object[][] grade;
        grade = new Object[no_cor][5];
         for(int j=1;j<=no_cor;j++)
         {
            grade[j-1]=new Object[]{bfrd.readLine(),bfrd.readLine(),"CORE",bfrd.readLine(),"EX"};
            //grade.add(temp);
         }
        // no_elect=Integer.parseInt(bfrd.readLine());
         bfrd.close();
         bfrd1.close();
         
          String[] title = {"Sub. Name","Subno.", "Type", "CRD","GRD"};
         
         jTable1.setModel(new javax.swing.table.DefaultTableModel(grade ,title ));
       //jTable1=new JTable(grade,title);  
        
          
        for(i=0;i<3;i++)
            for(int j=0;j<5;j++)
        {
        jTable1.setValueAt("grade", i,j);
        }
      //  this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grade_sheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grade_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel main_panel;
    // End of variables declaration//GEN-END:variables
   private javax.swing.JScrollPane scroll_pane;
     private javax.swing.JTable tabel;
}
