/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import AdminPanel.AdminPanel;
import DB.DBBank;
import DB.DBConnections;
import Game1.Game1;
import Game2.Game2;
import Game3.Game3;
import Game4.Game4;
import LoginAndRegister.AdminLogin;
import LoginAndRegister.Start;
import Menu.MoreMoneyToBank;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s1601396
 */
public final class CasinoFirstPage extends javax.swing.JFrame {

    static double kassa;
    double Kassa;
    static String uName;
    static String eName;
    static String sName;
    static String Salasana;
    static int Back;

    public CasinoFirstPage() {

        initComponents();
        jToggleButton3.setVisible(false);
        jToggleButton4.setVisible(false);
        FirstName.setVisible(false);
        FirstNameField.setVisible(false);
        LastName.setVisible(false);
        LastNameField.setVisible(false);
        SaveButton1.setVisible(false);
        SaveButton2.setVisible(false);
        NewPassword.setVisible(false);
        RepeatPassword.setVisible(false);
        PasswordField.setVisible(false);
        PasswordField2.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        BackGround(Back);
        Kassa = kassa;
        DBtoKassa();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        FirstNameField = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        SaveButton1 = new javax.swing.JButton();
        NewPassword = new javax.swing.JLabel();
        RepeatPassword = new javax.swing.JLabel();
        PasswordField = new javax.swing.JTextField();
        PasswordField2 = new javax.swing.JTextField();
        SaveButton2 = new javax.swing.JButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        try {
            jButton3 =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "Casino.CasinoFirstPage_jButton3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/MenuExitButton.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 180, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/MenuAdminButton.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/MenuBankButton.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/MenuLogoutButton.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 130, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/CFPProfileFrame.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 46, 110, 230));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 250, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(72, 74, 82));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 15, 110, 18));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profile");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 250, 20));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/CFPMenuButton.png"))); // NOI18N
        jToggleButton5.setBorderPainted(false);
        jToggleButton5.setContentAreaFilled(false);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1248, 8, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Bar2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 120));

        jPanel2.setOpaque(false);
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UserName");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FirtsName");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LastName");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, -1, -1));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Edit");
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        FirstNameField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        FirstNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FirstNameField.setOpaque(false);
        jPanel2.add(FirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 250, 20));

        FirstName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("FirstName");
        jPanel2.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 180, -1, -1));

        LastName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("LastName");
        jPanel2.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 230, -1, -1));

        LastNameField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LastNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LastNameField.setOpaque(false);
        jPanel2.add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 250, 20));

        SaveButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SaveButton1.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton1.setText("Save");
        SaveButton1.setContentAreaFilled(false);
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 100, 20));

        NewPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        NewPassword.setForeground(new java.awt.Color(255, 255, 255));
        NewPassword.setText("New Password");
        jPanel2.add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 180, -1, -1));

        RepeatPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RepeatPassword.setForeground(new java.awt.Color(255, 255, 255));
        RepeatPassword.setText("Repeat Password");
        jPanel2.add(RepeatPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 230, -1, -1));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PasswordField.setOpaque(false);
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 250, 20));

        PasswordField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PasswordField2.setOpaque(false);
        jPanel2.add(PasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 250, 20));

        SaveButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SaveButton2.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton2.setText("Save");
        SaveButton2.setContentAreaFilled(false);
        SaveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 100, 20));

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Profile");
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 20));

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setText("Password");
        jToggleButton4.setContentAreaFilled(false);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/CFPProfileFrame.png"))); // NOI18N
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 450, 620));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 176));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/game2ButtonDesing.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 310, 176));

        jButton7.setText("Game4");
        jButton7.setPreferredSize(new java.awt.Dimension(200, 112));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 196, 310, 176));

        jButton5.setText("Game3");
        jButton5.setPreferredSize(new java.awt.Dimension(200, 112));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 196, 310, 176));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 650, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Best HD Walls - FreeHD.Blogspot (64).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        setSize(new java.awt.Dimension(1350, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void bankBalance(double Kassa) {

        kassa = Kassa;
        CasinoFirstPage CFP = new CasinoFirstPage();
        CFP.toKassa(Kassa);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jToggleButton4.doClick();
        new Game1().setVisible(true);
        this.setVisible(false);
        DBBank.GameBank();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void DBtoKassa() {
        toKassa(Kassa);

    }

    public static void Profile(String uName, String eName, String sName, String Password, double bank) {
        Salasana = Password;
        CasinoFirstPage CFP = new CasinoFirstPage();
        CFP.DBtoProfile(uName, eName, sName, bank);
    }

    public void DBtoProfile(String uname, String ename, String sname, double bank) {
        uName = uname;
        eName = ename;
        sName = sname;
        toProfile(uname, ename, sname, bank);
        System.out.println(uName + " Joo");
        System.out.println(eName + " Joo2");
        System.out.println(sName + " Joo3");
        toProfile(uname, ename, sname, bank);
    }

    public void toProfile(String uname, String ename, String sname, double bank) {
        uName = uname;
        eName = ename;
        sName = sname;
        jToggleButton1.setText(uname);

        CasinoFirstPage CFP = new CasinoFirstPage();

    }

    public void toKassa(double kassa) {

        jTextField1.setText(Double.toString(kassa));

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            jToggleButton4.doClick();
        }
        this.setVisible(false);
        new Game2().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            jToggleButton4.doClick();
        }
        this.setVisible(false);
        new Game3().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            jToggleButton4.doClick();
        }
        this.setVisible(false);
        new Game4().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:


    }//GEN-LAST:event_jPanel2AncestorAdded

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            if (jToggleButton4.isSelected()) {
                jToggleButton4.doClick();
            }
            if (jToggleButton2.isSelected()) {
                jToggleButton2.doClick();
            }
            try {
                DBConnections.getProfile();
                jLabel5.setText(uName);
                jLabel8.setText(eName);
                jLabel9.setText(sName);
                jPanel2.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(CasinoFirstPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton2.isSelected()) {

            jToggleButton3.setVisible(true);
            jToggleButton4.setVisible(true);
        } else {
            jToggleButton3.setVisible(false);
            jToggleButton4.setVisible(false);
            if (jToggleButton3.isSelected()) {
                jToggleButton3.doClick();
            }
            if (jToggleButton4.isSelected()) {
                jToggleButton4.doClick();
            }
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        // TODO add your handling code here:
        if (FirstNameField.equals("")) {
        } else {
            eName = FirstNameField.getText();
            if (LastNameField.equals("")) {
            } else {
                sName = LastNameField.getText();
            }
            DBConnections.toProfile(eName, sName, Salasana);
            FirstNameField.setText(eName);
            LastNameField.setText(sName);
            jToggleButton1.doClick();
            FirstNameField.setText("");
            LastNameField.setText("");
        }

    }//GEN-LAST:event_SaveButton1ActionPerformed

    private void SaveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton2ActionPerformed
        // TODO add your handling code here:
        if (PasswordField.equals("")) {
            if (PasswordField2.equals("")) {
                if (PasswordField.equals(PasswordField2)) {
                    Salasana = PasswordField2.getText();
                    DBConnections.toProfile(eName, sName, Salasana);
                    jToggleButton1.doClick();
                    PasswordField.setText("");
                    PasswordField2.setText("");
                }
            }
        }
    }//GEN-LAST:event_SaveButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton3.isSelected()) {
            if (jToggleButton4.isSelected()) {
                jToggleButton4.doClick();
            }
            FirstName.setVisible(true);
            FirstNameField.setVisible(true);
            LastName.setVisible(true);
            LastNameField.setVisible(true);
            SaveButton1.setVisible(true);
        } else {
            FirstName.setVisible(false);
            FirstNameField.setVisible(false);
            LastName.setVisible(false);
            LastNameField.setVisible(false);
            SaveButton1.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton4.isSelected()) {
            if (jToggleButton3.isSelected()) {
                jToggleButton3.doClick();
            }
            SaveButton2.setVisible(true);
            NewPassword.setVisible(true);
            RepeatPassword.setVisible(true);
            PasswordField.setVisible(true);
            PasswordField2.setVisible(true);
        } else {
            SaveButton2.setVisible(false);
            NewPassword.setVisible(false);
            RepeatPassword.setVisible(false);
            PasswordField.setVisible(false);
            PasswordField2.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Start().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MoreMoneyToBank().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DBConnections.Admin();
            AdminHelp();
        } catch (SQLException ex) {
            Logger.getLogger(CasinoFirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void admin(int luku) {

        if (luku == 1) {
            this.setVisible(false);
            new AdminLogin().setVisible(true);
        } else if (luku == 2) {

            new AdminPanel().setVisible(true);
        }
    }
    
    public void AdminHelp(){
        this.setVisible(false);
    }
    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton5.isSelected()) {
            jPanel4.setVisible(true);
        } else {
            jPanel4.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    public void BackGround(int luku) {
        Back = luku;
        if (luku == 0) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Best HD Walls - FreeHD.Blogspot (64).jpg")));
        } else if (luku == 1) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/1pqkC3.png")));
        } else if (luku == 2) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/bicycle-1280x720.png")));
        } else if (luku == 3) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Cherry-Blossom-Flower-Wallpaper-Collection-HD.png")));
        } else if (luku == 4) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Desktop-HD-Wallpaper-Free-Download-1.png")));
        } else if (luku == 5) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImages/Eiffel-Tower-lanscape-Wallpaper-HD.png")));
        }
    }

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
            java.util.logging.Logger.getLogger(CasinoFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasinoFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasinoFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasinoFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CasinoFirstPage CFP = new CasinoFirstPage();
                bankBalance(kassa);
                //DBConnections DB = new DBConnections();
                //String uName = DB.getProfile("");
                //new CasinoFirstPage().jTextField1.setText("moi");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel NewPassword;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JTextField PasswordField2;
    private javax.swing.JLabel RepeatPassword;
    private javax.swing.JButton SaveButton1;
    private javax.swing.JButton SaveButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables
}
