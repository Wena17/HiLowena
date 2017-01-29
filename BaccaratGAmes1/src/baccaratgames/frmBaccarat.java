package baccaratgames;

import java.util.Random;
import java.lang.*;
import javax.swing.JButton;

public class frmBaccarat extends javax.swing.JFrame {

    int NUM1, NUM2, Streak = 0;

    public frmBaccarat() {
        initComponents();
        setSize(582, 439);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jLabel2 = new javax.swing.JLabel();
        Play = new btnPlay();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        FirstNumber = new javax.swing.JLabel();
        SecondNumber = new javax.swing.JLabel();
        High = new javax.swing.JButton();
        Low = new javax.swing.JButton();
        Streaking = new javax.swing.JLabel();
        Continue = new javax.swing.JButton();
        Main = new javax.swing.JButton();
        Playground = new javax.swing.JLabel();
        WinLose = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("*** High de Low/Low de High ***");
        jLabel2.setName("txtbox"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 40, 530, 41);

        Play.setText("Play");
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
        });
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play);
        Play.setBounds(190, 240, 73, 38);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(350, 240, 72, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Sarino & Bersabe Proj. 2015.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 340, 310, 28);

        Icon.setIcon(new javax.swing.ImageIcon("E:\\BaccaratGAmes\\src\\image\\c.jpg")); // NOI18N
        getContentPane().add(Icon);
        Icon.setBounds(190, 120, 90, 120);

        FirstNumber.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        FirstNumber.setForeground(new java.awt.Color(0, 204, 204));
        FirstNumber.setText("******");
        getContentPane().add(FirstNumber);
        FirstNumber.setBounds(140, 160, 40, 60);

        SecondNumber.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        SecondNumber.setForeground(new java.awt.Color(0, 204, 204));
        SecondNumber.setText("******");
        getContentPane().add(SecondNumber);
        SecondNumber.setBounds(200, 170, 50, 40);

        High.setText("High");
        High.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HighMouseClicked(evt);
            }
        });
        High.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighActionPerformed(evt);
            }
        });
        getContentPane().add(High);
        High.setBounds(330, 180, 60, 30);

        Low.setText("Low");
        Low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowActionPerformed(evt);
            }
        });
        getContentPane().add(Low);
        Low.setBounds(400, 180, 60, 30);

        Streaking.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Streaking.setForeground(new java.awt.Color(51, 255, 204));
        Streaking.setText("jLabel3");
        getContentPane().add(Streaking);
        Streaking.setBounds(270, 120, 140, 30);

        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue);
        Continue.setBounds(330, 210, 130, 30);

        Main.setText("Back to Menu");
        Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMouseClicked(evt);
            }
        });
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });
        getContentPane().add(Main);
        Main.setBounds(330, 150, 150, 30);

        Playground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Playground.setIcon(new javax.swing.ImageIcon("E:\\BaccaratGAmes\\src\\image\\a.jpg")); // NOI18N
        Playground.setMaximumSize(new java.awt.Dimension(500, 500));
        Playground.setMinimumSize(new java.awt.Dimension(500, 500));
        Playground.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(Playground);
        Playground.setBounds(0, -10, 600, 490);

        WinLose.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        WinLose.setForeground(new java.awt.Color(51, 255, 204));
        WinLose.setText("jLabel5");
        getContentPane().add(WinLose);
        WinLose.setBounds(270, 100, 180, 20);

        Background.setIcon(new javax.swing.ImageIcon("E:\\BaccaratGAmes\\src\\image\\b.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(-20, 0, 590, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        Play.setVisible(false);
        Exit.setVisible(false);
        Streaking.setVisible(false);
        Main.setVisible(false);
        High.setVisible(true);
        Low.setVisible(true);
        Continue.setVisible(false);
        FirstNumber.setVisible(true);
        SecondNumber.setVisible(true);
        Icon.setVisible(true);
        Playground.setVisible(false);
        Background.setVisible(true);
        Random rand = new Random();
        NUM1 = rand.nextInt(100);
        FirstNumber.setText(NUM1 + "");
    }//GEN-LAST:event_PlayActionPerformed

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
    }//GEN-LAST:event_PlayMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jLabel1.setVisible(false);
        Main.setVisible(false);
        FirstNumber.setVisible(false);
        SecondNumber.setVisible(false);
        WinLose.setVisible(false);
        High.setVisible(false);
        Low.setVisible(false);
        Continue.setVisible(false);
        Icon.setVisible(false);
        Streaking.setVisible(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void HighMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HighMouseClicked
    }//GEN-LAST:event_HighMouseClicked

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        Streaking.setVisible(true);
        High.setVisible(true);
        Low.setVisible(true);
        Icon.setVisible(true);
        WinLose.setVisible(false);
        Continue.setVisible(false);
        Random rand = new Random();
        NUM1 = rand.nextInt(100);
        FirstNumber.setText(NUM1 + "");
        NUM2 = rand.nextInt(100);
        SecondNumber.setText(NUM2 + "");
        
    }//GEN-LAST:event_ContinueActionPerformed

    private void HighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighActionPerformed

        Continue.setVisible(true);
        Icon.setVisible(false);
        WinLose.setVisible(true);

        Random rand = new Random();

        NUM2 = rand.nextInt(100);
        SecondNumber.setText(NUM2 + "");

        if (NUM2 > NUM1) {
            Streak++;
            WinLose.setText("You Win");
            Streaking.setVisible(true);
            Streaking.setText("Streak : " + Streak);

        } else if (NUM2 == NUM1) {
            WinLose.setText("DRAW");

        } else if (NUM2 < NUM1) {
            WinLose.setText("You Lose");
            High.setVisible(false);
            Low.setVisible(false);
            Continue.setVisible(false);
            Main.setVisible(true);
            Streaking.setText("Streak : " + Streak);
            Streak = 0;
            Exit.setVisible(true);
            
        }


        High.setVisible(false);
        Low.setVisible(false);
    }//GEN-LAST:event_HighActionPerformed

    private void LowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowActionPerformed


        Continue.setVisible(true);
        Icon.setVisible(false);
        WinLose.setVisible(true);

        Random rand = new Random();

        NUM2 = rand.nextInt(100);
        FirstNumber.setText(NUM1 + "");
        SecondNumber.setText(NUM2 + "");


        if (NUM1 > NUM2) {
            Streak++;
            WinLose.setText("You Win");
            Streaking.setVisible(true);
            Streaking.setText("Streak : " + Streak);
        } else if (NUM2 == NUM1) {
            WinLose.setText("DRAW");
        } else if (NUM1 < NUM2) {
            WinLose.setText("You Lose");
            High.setVisible(false);
            Low.setVisible(false);
            Continue.setVisible(false);
            Main.setVisible(true);
            Streaking.setText("Streak : " + Streak);
            Streak = 0;
            Exit.setVisible(true);
            
        }


        High.setVisible(false);
        Low.setVisible(false);
    }//GEN-LAST:event_LowActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        // TODO add your handling code here:
        Playground.setVisible(true);
        Play.setVisible(true);
        Exit.setVisible(true);
        Main.setVisible(false);
        FirstNumber.setVisible(false);
        SecondNumber.setVisible(false);
        WinLose.setVisible(false);
        Streaking.setVisible(false);



    }//GEN-LAST:event_MainActionPerformed

    private void MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MainMouseClicked

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
            java.util.logging.Logger.getLogger(frmBaccarat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBaccarat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBaccarat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBaccarat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmBaccarat().setVisible(true);
                System.out.println("hi");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Continue;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel FirstNumber;
    private javax.swing.JButton High;
    private javax.swing.JLabel Icon;
    private javax.swing.JButton Low;
    private javax.swing.JButton Main;
    private javax.swing.JButton Play;
    private javax.swing.JLabel Playground;
    private javax.swing.JLabel SecondNumber;
    private javax.swing.JLabel Streaking;
    private javax.swing.JLabel WinLose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    // End of variables declaration//GEN-END:variables
}
