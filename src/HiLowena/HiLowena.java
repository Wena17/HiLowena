package HiLowena;

import java.util.Random;
import java.lang.*;
import javax.swing.JButton;

public class HiLowena extends javax.swing.JFrame {

    int NUM1, NUM2, Streak = 0;

    public HiLowena() {
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
        FirstNumber = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        SecondNumber = new javax.swing.JLabel();
        Icon1 = new javax.swing.JLabel();
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
        jLabel2.setForeground(new java.awt.Color(0, 255, 102));
        jLabel2.setText("\" High de Low/Low de High \"");
        jLabel2.setName("txtbox"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 30, 460, 41);

        Play.setBackground(new java.awt.Color(0, 0, 204));
        Play.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
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
        Play.setBounds(80, 330, 90, 38);

        Exit.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(450, 330, 72, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Pagayanan, Rowena");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 340, 310, 28);

        FirstNumber.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        FirstNumber.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(FirstNumber);
        FirstNumber.setBounds(110, 170, 50, 40);

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c.jpg"))); // NOI18N
        getContentPane().add(Icon);
        Icon.setBounds(90, 140, 90, 120);

        SecondNumber.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        SecondNumber.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(SecondNumber);
        SecondNumber.setBounds(220, 170, 50, 40);

        Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c_1.jpg"))); // NOI18N
        Icon1.setText("jLabel3");
        getContentPane().add(Icon1);
        Icon1.setBounds(200, 140, 90, 120);

        High.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
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
        High.setBounds(320, 220, 70, 40);

        Low.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        Low.setText("Low");
        Low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowActionPerformed(evt);
            }
        });
        getContentPane().add(Low);
        Low.setBounds(410, 220, 60, 40);

        Streaking.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Streaking.setForeground(new java.awt.Color(51, 255, 204));
        getContentPane().add(Streaking);
        Streaking.setBounds(320, 160, 140, 30);

        Continue.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue);
        Continue.setBounds(340, 270, 130, 40);

        Main.setBackground(new java.awt.Color(51, 0, 153));
        Main.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
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
        Main.setBounds(320, 140, 150, 40);

        Playground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Playground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a.jpg"))); // NOI18N
        Playground.setMaximumSize(new java.awt.Dimension(500, 500));
        Playground.setMinimumSize(new java.awt.Dimension(500, 500));
        Playground.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(Playground);
        Playground.setBounds(0, 0, 570, 380);

        WinLose.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        WinLose.setForeground(new java.awt.Color(51, 255, 204));
        WinLose.setText("jLabel5");
        getContentPane().add(WinLose);
        WinLose.setBounds(270, 100, 180, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b.jpg"))); // NOI18N
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
        Icon1.setVisible(false);
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
                new HiLowena().setVisible(true);
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
    private javax.swing.JLabel Icon1;
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
