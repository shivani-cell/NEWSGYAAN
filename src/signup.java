
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL1
 */
public class signup extends javax.swing.JFrame {

   Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   
    /**
     * Creates new form signup
     */
    public signup() {
        
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           System.out.println("Could not establish connection");
       }
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3308/softablitz","root","");
       } catch (SQLException ex) {
           Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
       }
       System.out.println("Connected");
       
       
       initComponents();
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        preference = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 280, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Email-ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 280, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Confirm Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 340, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Preference");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 280, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("<html><u>Signup Form</u></html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 280, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 280, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 280, 50));

        emailid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 290, 40));

        fname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 290, 40));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 130, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 90, -1));

        preference.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        preference.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top news", "Sports", "Weather", "Politics", "Bollywood", "Currency rate", " " }));
        jPanel1.add(preference, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 270, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 190, 40));

        cpassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 300, 50));

        password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 300, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Log in");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Already Sign in ?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 220, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 840));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String gender="male";
    if(female.isSelected()){
        gender="female";
    }
        try{    
                String sql = "INSERT INTO table2"+
                                "(fname,emailid,password,cpassword,gender,preference)"
                                    +"VALUES (?,?,?,?,?,?)";

              
                pst = con.prepareStatement(sql);
                
                pst.setString(1,fname.getText());
                String Id=fname.getText().toString();
                pst.setString(2,emailid.getText());
                String email=emailid.getText();
               
               
                pst.setString(3,password.getText());
                String pass=password.getText();
                pst.setString(4,cpassword.getText());
                String cp=cpassword.getText();
                pst.setString(5,gender);
                
                String val1=preference.getSelectedItem().toString();
pst.setString(6,val1);
                
                
                if(Id.equals("")){
                 JOptionPane.showMessageDialog(null,"Username is mandatory");
                }
                else if(email.equals("")){
                 JOptionPane.showMessageDialog(null,"Email-ID is mandatory");
                }
                 else if(pass.equals("")){
                 JOptionPane.showMessageDialog(null,"Password is mandatory");
                }
                  else if(cp.equals("")){
                 JOptionPane.showMessageDialog(null,"Confirm Password is mandatory");
                }
                 
                  else{ 
                      if(pass.equals(cp)){
                          String email_Pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9_]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.com)";
                Pattern pattern=Pattern.compile(email_Pattern);
                Matcher matcher=pattern.matcher(email);
             
                if(matcher.matches()){
                    
                              try { 
                                  pst.executeUpdate();
                              } catch (SQLException ex) {
                                  Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          JOptionPane.showMessageDialog(null, "inserted successfully");
                      
 Home obj=new Home();
obj.setVisible(true);
this.setVisible(false);
                  }
                else{
                     JOptionPane.showMessageDialog(null,"Email-Id is invalid");
                }
                      }
                      else{
                        JOptionPane.showMessageDialog(null,"Password and confirm password should be equal");  
                      }
                  }
        }
        catch(SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Login obj=new Login();
obj.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JTextField emailid;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> preference;
    // End of variables declaration//GEN-END:variables
}