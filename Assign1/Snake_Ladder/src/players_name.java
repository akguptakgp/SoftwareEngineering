
import javax.swing.JOptionPane;


public class players_name extends javax.swing.JFrame {

    public players_name() {
        initComponents();
    }
   public players_name(int p) {
       nop=p;
        initComponents();
        if(nop==2)  this.player3_panel.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        players_panel = new javax.swing.JPanel();
        player1_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p1_name = new javax.swing.JTextField();
        player2_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        p2_name = new javax.swing.JTextField();
        player3_panel = new javax.swing.JPanel();
        p3_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ok_but = new javax.swing.JButton();
        back_but = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        player1_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        player1_panel.setPreferredSize(new java.awt.Dimension(507, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Your Name :");

        javax.swing.GroupLayout player1_panelLayout = new javax.swing.GroupLayout(player1_panel);
        player1_panel.setLayout(player1_panelLayout);
        player1_panelLayout.setHorizontalGroup(
            player1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player1_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(p1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        player1_panelLayout.setVerticalGroup(
            player1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player2_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        player2_panel.setPreferredSize(new java.awt.Dimension(495, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Your Name :");

        javax.swing.GroupLayout player2_panelLayout = new javax.swing.GroupLayout(player2_panel);
        player2_panel.setLayout(player2_panelLayout);
        player2_panelLayout.setHorizontalGroup(
            player2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(p2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        player2_panelLayout.setVerticalGroup(
            player2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player2_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player3_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        player3_panel.setPreferredSize(new java.awt.Dimension(495, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Your Name :");

        javax.swing.GroupLayout player3_panelLayout = new javax.swing.GroupLayout(player3_panel);
        player3_panel.setLayout(player3_panelLayout);
        player3_panelLayout.setHorizontalGroup(
            player3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player3_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(p3_name, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        player3_panelLayout.setVerticalGroup(
            player3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player3_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ok_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ok_but.setText("OK");
        ok_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_butActionPerformed(evt);
            }
        });

        back_but.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_but.setText("back");
        back_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout players_panelLayout = new javax.swing.GroupLayout(players_panel);
        players_panel.setLayout(players_panelLayout);
        players_panelLayout.setHorizontalGroup(
            players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(players_panelLayout.createSequentialGroup()
                .addGroup(players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(players_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(players_panelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(ok_but, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(back_but)))
                .addContainerGap())
        );

        players_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {player1_panel, player2_panel, player3_panel});

        players_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back_but, ok_but});

        players_panelLayout.setVerticalGroup(
            players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(players_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_but, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_but, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        players_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back_but, ok_but});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(players_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(players_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_back_butActionPerformed

    private void ok_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_butActionPerformed
       p1=p1_name.getText();
       p2=p2_name.getText();
       if(nop!=2)
       p3=p3_name.getText();
     if(nop==2)
     {
         if(p1==null || p2==null)
           JOptionPane.showMessageDialog(players_panel, "please fill players names!");
         else
           this.setVisible(false);
     }
     else
     {
         if(p1==null || p2==null || p3==null)
         JOptionPane.showMessageDialog(player1_panel, "please fill players names!");
         else
           this.setVisible(false);
     }
     
    }//GEN-LAST:event_ok_butActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new players_name(nop).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_but;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ok_but;
    private javax.swing.JTextField p1_name;
    private javax.swing.JTextField p2_name;
    private javax.swing.JTextField p3_name;
    private javax.swing.JPanel player1_panel;
    private javax.swing.JPanel player2_panel;
    private javax.swing.JPanel player3_panel;
    private javax.swing.JPanel players_panel;
    // End of variables declaration//GEN-END:variables
private static int nop;
public static String p1,p2,p3;
}
