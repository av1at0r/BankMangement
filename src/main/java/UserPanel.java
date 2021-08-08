/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sverm
 */
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.util.*;

public class UserPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
    }
    
    static String userid = MainMenu.userid;

    //public void getUid(String userid) {
      //  this.userid = userid;
        //System.out.println(userid+"/////////////////////");
    //}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddressChange = new javax.swing.JRadioButton();
        DepoWith = new javax.swing.JRadioButton();
        Transfer = new javax.swing.JRadioButton();
        CloseAccount = new javax.swing.JRadioButton();
        ViewStatement = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 40, -1, -1));

        buttonGroup1.add(AddressChange);
        AddressChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddressChange.setText("Address Change");
        AddressChange.setOpaque(false);
        jPanel1.add(AddressChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 157, -1, -1));

        buttonGroup1.add(DepoWith);
        DepoWith.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DepoWith.setText("Money Deposit or Withdrawl");
        DepoWith.setOpaque(false);
        jPanel1.add(DepoWith, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        buttonGroup1.add(Transfer);
        Transfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Transfer.setText("Money Transfer");
        Transfer.setOpaque(false);
        jPanel1.add(Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        buttonGroup1.add(CloseAccount);
        CloseAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CloseAccount.setText("Close Account");
        CloseAccount.setOpaque(false);
        jPanel1.add(CloseAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        buttonGroup1.add(ViewStatement);
        ViewStatement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewStatement.setText("View Statement");
        ViewStatement.setOpaque(false);
        jPanel1.add(ViewStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 471, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sverm\\Pictures\\BankMngmt\\login.png")); // NOI18N
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sverm\\Pictures\\BankMngmt\\Logout.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Current Account Balance");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 101, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sverm\\Pictures\\BankMngmt\\background.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jLabel1.setText("Welcome "+ userid);
        DepoWith dw = new DepoWith();
        jLabel2.setText("Current Account Balance: "+dw.ChBal(userid));
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(AddressChange.isSelected()){
            setVisible(false);
            new AddressChange().setVisible(true);
        }
        if(DepoWith.isSelected()) {
            setVisible(false);
            new DepositWithdraw().setVisible(true);
        }
        else if(Transfer.isSelected()) {
            setVisible(false);
            new Transfer().setVisible(true);            
        }
        else if(CloseAccount.isSelected()) {
            CloseAccount c = new CloseAccount();
            c.ClAcc(userid);
            setVisible(false);
            new MainMenu().setVisible(true);
        }
        else if (ViewStatement.isSelected()) {
            setVisible(false);
            new ViewStatement().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AddressChange;
    private javax.swing.JRadioButton CloseAccount;
    private javax.swing.JRadioButton DepoWith;
    private javax.swing.JRadioButton Transfer;
    private javax.swing.JRadioButton ViewStatement;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

class CloseAccount {
    public void ClAcc(String userid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmngmt","root","121102");
            PreparedStatement st = con.prepareStatement("select * from user where userid = ?");
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();
            rs.next();
            String password = rs.getString(2);
            String fname = rs.getString(3);
            String lname = rs.getString(4);
            String accno = rs.getString(5);
            int accbal = rs.getInt(6);
            String address = rs.getString(7);
            int pincode = rs.getInt(8);
            String state = rs.getString(9);
            
            st = con.prepareStatement("Delete from user where userid = ?");
            st.setString(1, userid);
            int x = st.executeUpdate();
            if(x==1) {
                System.out.println("Account deleted from user table");  
            }
            
            java.util.Date utildate = new java.util.Date();
            java.sql.Date date = new java.sql.Date(utildate.getTime());
            st = con.prepareStatement("Insert into closedacc values(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, userid);
            st.setString(2, password);
            st.setString(3, fname);
            st.setString(4, lname);
            st.setString(5, accno);
            st.setInt(6, accbal);
            st.setString(7, address);
            st.setInt(8, pincode);
            st.setString(9, state);
            st.setDate(10, date);
            x = st.executeUpdate();
            if(x==1) {
                JOptionPane.showMessageDialog(null, "Account Closed Successfully!");
            }
            
            st.close();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}