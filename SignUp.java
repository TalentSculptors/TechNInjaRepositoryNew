package com.signupLogin;
import java.sql.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
	import java.sql.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;


	public class SignUp extends javax.swing.JFrame {

	   
		
		    public SignUp() {
		    	setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/images/talent.jpg")));
		    	setTitle("Talent Sculptors");
		        initComponents();
		    }

		    @SuppressWarnings("unchecked")
		    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
		    private void initComponents() {

		        jLabel1 = new javax.swing.JLabel();
		        jLabel1.setIcon(new ImageIcon(SignUp.class.getResource("/images/register.png")));
		        jLabel2 = new javax.swing.JLabel();
		        jLabel3 = new javax.swing.JLabel();
		        jLabel4 = new javax.swing.JLabel();
		        jLabel5 = new javax.swing.JLabel();
		        jLabel6 = new javax.swing.JLabel();
		        txtname = new javax.swing.JTextField();
		        txtmail = new javax.swing.JTextField();
		        txtusername = new javax.swing.JTextField();
		        txtpassword = new javax.swing.JPasswordField();
		        jCheckBox1 = new javax.swing.JCheckBox();
		        jLabel7 = new javax.swing.JLabel();
		        jButton1 = new javax.swing.JButton();
		        jButton1.setToolTipText("Create Account");
		        combobox = new javax.swing.JComboBox<>();
		        combobox.setToolTipText("Select Country");
		        lblexception = new javax.swing.JLabel();
		        lblresult = new javax.swing.JLabel();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		        getContentPane().setLayout(null);

		        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));

		        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		        jLabel2.setText("Name");

		        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		        jLabel3.setText("Mail");

		        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		        jLabel4.setText("Create UserName");

		        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		        jLabel5.setText("Create Password");

		        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		        jLabel6.setText("Country");

		        txtpassword.setMaximumSize(new java.awt.Dimension(8, 8));
		        txtpassword.setMinimumSize(new java.awt.Dimension(6, 6));

		        jLabel7.setText("I agree to terms & conditions.");

		        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        jButton1.setText("SignUp");
		        jButton1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });

		        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select item", "india", "paris", "US", "UA", "UK", "Brazil", "Pakistan" }));
		        combobox.addContainerListener(new java.awt.event.ContainerAdapter() {
		            public void componentAdded(java.awt.event.ContainerEvent evt) {
		                comboboxComponentAdded(evt);
		            }
		        });

		        lblresult.setFont(new java.awt.Font("Tahoma", 1, 11));

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        layout.setHorizontalGroup(
		        	layout.createParallelGroup(Alignment.TRAILING)
		        		.addGroup(layout.createSequentialGroup()
		        			.addGap(0, 302, Short.MAX_VALUE)
		        			.addComponent(lblresult)
		        			.addGap(178))
		        		.addGroup(layout.createSequentialGroup()
		        			.addGap(34)
		        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
		        				.addComponent(jLabel1, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
		        				.addGroup(layout.createSequentialGroup()
		        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
		        						.addComponent(lblexception)
		        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
		        							.addComponent(jLabel2)
		        							.addComponent(jLabel3)
		        							.addComponent(jLabel4)
		        							.addComponent(jLabel5)
		        							.addComponent(jLabel6)
		        							.addGroup(layout.createSequentialGroup()
		        								.addComponent(jCheckBox1)
		        								.addPreferredGap(ComponentPlacement.UNRELATED)
		        								.addComponent(jLabel7))))
		        					.addGap(46)
		        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
		        						.addComponent(txtname)
		        						.addComponent(txtmail)
		        						.addComponent(txtusername)
		        						.addComponent(txtpassword, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
		        						.addComponent(jButton1)
		        						.addComponent(combobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		        			.addContainerGap(86, Short.MAX_VALUE))
		        );
		        layout.setVerticalGroup(
		        	layout.createParallelGroup(Alignment.LEADING)
		        		.addGroup(layout.createSequentialGroup()
		        			.addContainerGap()
		        			.addComponent(jLabel1)
		        			.addGap(30)
		        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        				.addComponent(jLabel2)
		        				.addComponent(txtname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        			.addGap(18)
		        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        				.addComponent(jLabel3)
		        				.addComponent(txtmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        			.addGap(18)
		        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        				.addComponent(jLabel4)
		        				.addComponent(txtusername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        			.addGap(18)
		        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        				.addComponent(jLabel5)
		        				.addComponent(txtpassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
		        				.addGroup(layout.createSequentialGroup()
		        					.addGap(18)
		        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
		        						.addComponent(jLabel6)
		        						.addComponent(combobox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		        					.addGap(18)
		        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
		        						.addComponent(jLabel7)
		        						.addComponent(jCheckBox1)))
		        				.addGroup(layout.createSequentialGroup()
		        					.addGap(69)
		        					.addComponent(jButton1)))
		        			.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
		        			.addComponent(lblexception)
		        			.addPreferredGap(ComponentPlacement.RELATED)
		        			.addComponent(lblresult)
		        			.addGap(36))
		        );
		        getContentPane().setLayout(layout);

		        pack();
		    }// </editor-fold>                        

		    private void comboboxComponentAdded(java.awt.event.ContainerEvent evt) {                                        
		        // TODO add your handling code here:
		    }                                       

		    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

		        String name=txtname.getText();
		        String mail=txtmail.getText();
		        String username=txtusername.getText();
		        String password=txtpassword.getText();
		        String country=(String) combobox.getSelectedItem();
		     //   jLabel8.setText(name+" "+mail+" "+username+" "+password+" "+country);
		    
		        try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "1234");
						java.sql.Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("insert into userdata values ('"+name+"','"+mail+"','"+country+"','"+username+"','"+password+"')");
		                                lblresult.setText("Data inserted..");
		                        }
		        catch(Exception e)
		        {
		            lblexception.setText("Error"+e.getMessage());
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
		            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Create and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new SignUp().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify                     
		    private javax.swing.JComboBox<String> combobox;
		    private javax.swing.JButton jButton1;
		    private javax.swing.JCheckBox jCheckBox1;
		    private javax.swing.JLabel jLabel1;
		    private javax.swing.JLabel jLabel2;
		    private javax.swing.JLabel jLabel3;
		    private javax.swing.JLabel jLabel4;
		    private javax.swing.JLabel jLabel5;
		    private javax.swing.JLabel jLabel6;
		    private javax.swing.JLabel jLabel7;
		    private javax.swing.JLabel lblexception;
		    private javax.swing.JLabel lblresult;
		    private javax.swing.JTextField txtmail;
		    private javax.swing.JTextField txtname;
		    private javax.swing.JPasswordField txtpassword;
		    private javax.swing.JTextField txtusername;
		}



	/**
	 * Create the frame.
	 */
	


