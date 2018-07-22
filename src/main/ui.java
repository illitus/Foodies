/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sarve
 */
public class ui extends javax.swing.JFrame {

    /**
     * Creates new form ui
     */
    
    CardLayout cl;
    String name, email, password;
    public ui() {
        initComponents();
        cl=(CardLayout)getContentPane().getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        Account = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Hotel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Successful = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        SignUp = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Card = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Order = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Past = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 560));
        setPreferredSize(new java.awt.Dimension(725, 559));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        Account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Login.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Account.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\SignUP.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Account.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Welcome.jpg")); // NOI18N
        Account.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Account, "Account");
        Account.getAccessibleContext().setAccessibleName("");

        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Guest Guest");
        Menu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 300, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Select Hotel.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Past Orders.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\SignOut.png")); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
        });
        Menu.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Welcome Screen.jpg")); // NOI18N
        Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Menu, "Menu");

        Hotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\icon1.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Hotel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\icon2.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Hotel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 330, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\icon3.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        Hotel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\HotelBG.jpg")); // NOI18N
        Hotel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Hotel, "Hotel");

        Successful.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Payement.png")); // NOI18N
        Successful.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Home.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        Successful.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\main_bg.jpg")); // NOI18N
        Successful.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        getContentPane().add(Successful, "Successful");

        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Login.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 170, 30));
        jTextField1.getAccessibleContext().setAccessibleName("");

        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        Login.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Login.png")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        Login.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setText("Email ID:");
        Login.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel28.setText("Password:");
        Login.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\main_bg.jpg")); // NOI18N
        Login.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Login, "Login");

        SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        SignUp.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 190, 30));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        SignUp.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 190, 30));

        jPasswordField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        SignUp.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 190, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\SignUP.png")); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        SignUp.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Name:");
        SignUp.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setText("Email ID:");
        SignUp.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("Password:");
        SignUp.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\main_bg.jpg")); // NOI18N
        SignUp.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(SignUp, "SignUp");

        Card.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Burger.png")); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        Card.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Taco.png")); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        Card.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Cake.png")); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        Card.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Lemonade.png")); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        Card.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Card.jpg")); // NOI18N
        Card.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Card, "Card");

        Order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Order.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 620, 250));

        jLabel30.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Add to cart.png")); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        Order.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Checkout.png")); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        Order.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Order.jpg")); // NOI18N
        Order.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Order, "Order");

        Past.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Past.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 580, 310));

        jLabel33.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Home.png")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        Past.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon("D:\\Projects\\SE project\\Past.jpg")); // NOI18N
        Past.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Past, "Past");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
cl.show(getContentPane(),"Login");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
cl.show(getContentPane(),"SignUp");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
cl.show(getContentPane(),"Hotel");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
JOptionPane.showMessageDialog(null,"Hotel not yet supported!");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
JOptionPane.showMessageDialog(null,"Hotel not yet supported!");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
cl.show(getContentPane(),"Menu");
jTextArea1.setText(null);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        String id1=jTextField1.getText();
        String pass1=jPasswordField1.getText();
        
        String str="select * from Login where email='"+id1+"' ";
        PreparedStatement ps=(PreparedStatement) cn.prepareStatement(str);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
        {
            name=rs.getString("name");
            password=rs.getString("password");
            email=rs.getString("email");
 
        }
       if(pass1.equals(password) && id1.equals(email))
       {
           cl.show(getContentPane(),"Menu");
            
           jLabel26.setText(name);
           
        }
       else
       {
           JOptionPane.showMessageDialog(null,"Username/Password is incorrect. Please try Again");
           jTextField1.setText(null);
           jPasswordField1.setText(null);
       }
        cn.close();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    cl.show(getContentPane(),"Card");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        String id2=jTextField2.getText();
        String name2=jTextField3.getText();
        String pass2=jPasswordField2.getText();
        
        
       String str1="insert into Login values(?,?,?)";
       PreparedStatement ps1=(PreparedStatement) cn.prepareStatement(str1);
       ps1.setString(1,id2);
        ps1.setString(2, name2);
        ps1.setString(3,pass2);
        ps1.executeUpdate();
        JOptionPane.showMessageDialog(null,"Sign up successful!");
        name=name2;
        email=id2;
        password=pass2;
       
        cl.show(getContentPane(),"Menu");
        jLabel26.setText(name);
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }    // TODO add your handling code here:
    
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
cl.show(getContentPane(), "Card");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
cl.show(getContentPane(), "Successful");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        
        
        
       String str1="insert into past values(?,?,?)";
       PreparedStatement ps1=(PreparedStatement) cn.prepareStatement(str1);
       ps1.setString(1,email);
        ps1.setString(2, "Burger & Fries");
        ps1.setString(3,"Rs.150");
        ps1.executeUpdate();
        
       
        cl.show(getContentPane(),"Order");
        jTextArea1.append("\nBurger & Fries\t\t\t\t\tRs.150");
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        
        
        
       String str1="insert into past values(?,?,?)";
       PreparedStatement ps1=(PreparedStatement) cn.prepareStatement(str1);
       ps1.setString(1,email);
        ps1.setString(2, "Taco & Coke");
        ps1.setString(3,"Rs.120");
        ps1.executeUpdate();
        
       
        cl.show(getContentPane(),"Order");
        jTextArea1.append("\nTaco & Coke\t\t\t\t\tRs.120");
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        
        
        
       String str1="insert into past values(?,?,?)";
       PreparedStatement ps1=(PreparedStatement) cn.prepareStatement(str1);
       ps1.setString(1,email);
        ps1.setString(2, "Cheese Cake");
        ps1.setString(3,"Rs.100");
        ps1.executeUpdate();
        
       
        cl.show(getContentPane(),"Order");
        jTextArea1.append("\nCheese Cake\t\t\t\t\tRs.100");
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        
        
        
       String str1="insert into past values(?,?,?)";
       PreparedStatement ps1=(PreparedStatement) cn.prepareStatement(str1);
       ps1.setString(1,email);
        ps1.setString(2, "Lemonade");
        ps1.setString(3,"Rs.50");
        ps1.executeUpdate();
        
       
        cl.show(getContentPane(),"Order");
        jTextArea1.append("\nLemonade\t\t\t\t\tRs.50");
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
cl.show(getContentPane(), "Menu");
jTextArea2.setText(null);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked


try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/RestMgmt?user=root&password=password");
        
        String str2="select * from past where email='"+email+"'";
        PreparedStatement ps2=(PreparedStatement) cn.prepareStatement(str2);
        ResultSet rs2=ps2.executeQuery();
       
        cl.show(getContentPane(),"Past");
        while(rs2.next())
        {
            jTextArea2.append("   "+rs2.getString("email")+"\t\t"+rs2.getString("item")+"\t\t"+rs2.getString("price")+"\n");
        }    
            
        
        
        cn.close();
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
    }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
cl.show(getContentPane(),"Account");
jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);
jPasswordField1.setText(null);
jPasswordField2.setText(null);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseEntered

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
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JPanel Card;
    private javax.swing.JPanel Hotel;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Order;
    private javax.swing.JPanel Past;
    private javax.swing.JPanel SignUp;
    private javax.swing.JPanel Successful;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
