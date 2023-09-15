
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Anojan
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
    }
 private void Erase(){
    txtstaffid.setText("");
    txtname.setText("");
    txtdob.setText("");
    txtcontact.setText("");
    txtemail.setText("");
    txtstaffid.requestFocus();
    }
 
    public void Ref4(){
    
        try {
            DefaultTableModel mod=(DefaultTableModel)tablestaff.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            Statement st=conn.createStatement();
            String queSel = "SELECT * FROM lib_staff;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("ID"); 
                String d2=rs.getString("FullName");
                String d3=rs.getString("DOB"); 
                String d4=rs.getString("mobile"); 
                String d5=rs.getString("Email");  
                mod.addRow(new Object[]{d1,d2,d3,d4,d5}); }
            
         }catch(Exception RefErr){
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);
                                 }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtstaffid = new javax.swing.JFormattedTextField();
        txtname = new javax.swing.JFormattedTextField();
        txtdob = new javax.swing.JFormattedTextField();
        txtcontact = new javax.swing.JFormattedTextField();
        txtemail = new javax.swing.JFormattedTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestaff = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Go-back-icon.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Back");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("Staff Panel");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("பச்சிலைப்பள்ளி பொது நூலகம்");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 638, 1100, 46));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("STAFF REGISTER");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 11, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 39, 158, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Staff ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 67, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Full Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 102, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("DOB");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Phone No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 178, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Email");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 216, -1, -1));
        jPanel3.add(txtstaffid, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 64, 208, -1));
        jPanel3.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 102, 208, -1));
        jPanel3.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 140, 208, -1));
        jPanel3.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 178, 208, -1));
        jPanel3.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 216, 208, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 153));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\add.png")); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 286, -1, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 153));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\delete.png")); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 286, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 255, 153));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\Reset.png")); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 286, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\refresh-icon.png")); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 286, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 186, 517, 360));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("STAFF DETAILS TABLE");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 11, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 39, 210, 10));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon (1).png")); // NOI18N
        jButton8.setText("View");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        tablestaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Full Name", "DOB", "Mobile No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablestaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablestaffMouseClicked(evt);
            }
        });
        tablestaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablestaffKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablestaff);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 490, 180));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\search.png")); // NOI18N
        jLabel15.setText("Search");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 20));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel4.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 510, 360));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 510, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 520, 120));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, 110));

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1100, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         setVisible(false);
        new Dasboard().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {

        System.exit(0);
   }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Erase();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
            String queSave="INSERT INTO lib_staff (ID,FullName,DOB,mobile,Email) VALUES(?,?,?,?,?);";
                    PreparedStatement cmd=conn.prepareStatement(queSave); 
                    cmd.setString(1,txtstaffid.getText()); 
                    cmd.setString(2,txtname.getText()); 
                    cmd.setString(3,txtdob.getText()); 
                    cmd.setString(4,txtcontact.getText());
                    cmd.setString(5,txtemail.getText());
                    cmd.execute();
                    
                    JOptionPane.showMessageDialog(this,"StaffID: "+txtstaffid.getText()+", details successfully SAVE to the Database!","SAVE!",JOptionPane.INFORMATION_MESSAGE);
                    Erase(); 
                    Ref4();
           } catch (Exception SaveErr) {
                JOptionPane.showMessageDialog(this, "Error while"+"\n"+SaveErr);
           }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
 String ID = txtstaffid.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            String sql = "DELETE FROM `lib_staff` WHERE ID ='"+ ID +"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"You have SuccessFully DELETED, StaffID"+ ID +" Form The Database!!!","DELETE SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
                                     Erase();
                                     Ref4();        
        }catch(Exception Drr)
        {
        JOptionPane.showConfirmDialog(this,"Error While Delete....."+"\n"+Drr);
        }        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
         try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
    String queUp="UPDATE lib_staff SET FullName=?,DOB=?,mobile=?,Email=?"+"WHERE ID=?;"; 
    PreparedStatement cmd=conn.prepareStatement(queUp);
    
            cmd.setString(5,txtstaffid.getText()); 
            cmd.setString(1,txtname.getText()); 
            cmd.setString(2,txtdob.getText()); 
            cmd.setString(3,txtcontact.getText());
            cmd.setString(4,txtemail.getText()); 
            cmd.executeUpdate();
            
    JOptionPane.showMessageDialog(this,"Staff ID:"+txtstaffid.getText()+", successfully UPDATED!","UPDATED!",JOptionPane.INFORMATION_MESSAGE); 
    Erase(); 
    Ref4();
} catch(Exception Err)
        {
       JOptionPane.showMessageDialog(this, "Error Whlie Update..."+"\n" + Err);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Ref4();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tablestaffKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablestaffKeyReleased
       /////////******
    }//GEN-LAST:event_tablestaffKeyReleased

    private void tablestaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablestaffMouseClicked
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
                int row=tablestaff.getSelectedRow();
                String id=(tablestaff.getModel().getValueAt(row, 0).toString()); 
                String queGetData="SELECT * FROM lib_staff WHERE ID = '" +id +"';";
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(queGetData);
                
                if(rs.next()){
                            
                        txtstaffid.setText(rs.getString("ID")); 
                        txtname.setText(rs.getString("FullName")); 
                        txtdob.setText(rs.getString("DOB"));  
                        txtcontact.setText(rs.getString("mobile")); 
                        txtemail.setText(rs.getString("Email"));                         
                            }
                
                btnsave.setEnabled(true); 
                btndelete.setEnabled(true); 
                btnupdate.setEnabled(true); 
                txtstaffid.setEditable(true);
        } catch(Exception Err)
        {
        JOptionPane.showMessageDialog(this,"Error while Mouse Click on Table..."+"\n"+Err);
        }
    }//GEN-LAST:event_tablestaffMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        DefaultTableModel table = (DefaultTableModel) tablestaff.getModel();
        String Search = txtsearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
       tablestaff.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablestaff;
    private javax.swing.JFormattedTextField txtcontact;
    private javax.swing.JFormattedTextField txtdob;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JFormattedTextField txtname;
    private javax.swing.JFormattedTextField txtsearch;
    private javax.swing.JFormattedTextField txtstaffid;
    // End of variables declaration//GEN-END:variables
}
