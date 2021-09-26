package Startup;

import client.ClientInit;
import server.ServerInit;
import javax.swing.ImageIcon;

public class MainUI extends javax.swing.JFrame {

    /*
    *
    *   Default Constuctor of JFrame(PCRemoteUI)
    *   to initialize the JFrame with
    *   custom icon, location
    *   and title.
    *
    */
    
    public MainUI() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Mode Selection Windows");
        ImageIcon icon = new ImageIcon(getClass().getResource("/Startup/icon.png"));
        setIconImage(icon.getImage());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clientBtn = new javax.swing.JButton();
        serverLabel = new javax.swing.JLabel();
        clientLabel = new javax.swing.JLabel();
        serverBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PC Remote");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        clientBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clientBtn.setForeground(new java.awt.Color(255, 0, 255));
        clientBtn.setText("CLIENT MODE");
        clientBtn.setAlignmentX(25.0F);
        clientBtn.setAlignmentY(25.0F);
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        serverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Startup/server.png"))); // NOI18N
        serverLabel.setText("jLabel1");
        serverLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serverLabelMouseClicked(evt);
            }
        });

        clientLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Startup/client.png"))); // NOI18N
        clientLabel.setText("b");
        clientLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientLabelMouseClicked(evt);
            }
        });

        serverBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        serverBtn.setForeground(new java.awt.Color(0, 153, 51));
        serverBtn.setText("SERVER MODE");
        serverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select your mode ? (Server / Client)");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("   L.D.M.Perera - Final Year Project ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("RDesk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLabel)
                    .addComponent(serverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverBtnActionPerformed
        ServerInit si = new ServerInit();
        si.setVisible(true); //Display ServerInit JFrame
        this.dispose(); //Close PCRemoteUI.java
    }//GEN-LAST:event_serverBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        ClientInit ci = new ClientInit();
        ci.setVisible(true); //Display ClientInit JFrame
        this.dispose();   //Close PCRemoteUI.java
    }//GEN-LAST:event_clientBtnActionPerformed

    private void serverLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serverLabelMouseClicked
        serverBtn.doClick(); //Display ClientInit JFrame from Server image 
    }//GEN-LAST:event_serverLabelMouseClicked

    private void clientLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientLabelMouseClicked
        clientBtn.doClick(); //Display ClientInit JFrame from Client image
    }//GEN-LAST:event_clientLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientBtn;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton serverBtn;
    private javax.swing.JLabel serverLabel;
    // End of variables declaration//GEN-END:variables
}
