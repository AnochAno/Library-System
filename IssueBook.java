
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Anojan
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }
    
     private void Erase(){
    txtbookid.setText("");
    txtstudentid.setText("");
    txtissuedate.setText("");
    txtreutrndate.setText("");
    txtbookprovidestaff.setText("");
    txtbookid.requestFocus();
   }

    public void Ref5(){
    
        try {
            DefaultTableModel mod=(DefaultTableModel)issuetable.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            Statement st=conn.createStatement();
            String queSel = "SELECT * FROM isssuebook;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("BookID"); 
                String d2=rs.getString("StudentID");
                String d3=rs.getString("IssueDate"); 
                String d4=rs.getString("ReturnDate"); 
                String d5=rs.getString("ProvidestaffID"); 
                
           
                mod.addRow(new Object[]{d1,d2,d3,d4,d5}); }        
            }catch(Exception RefErr){                
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);            
            }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbookprovidestaff = new javax.swing.JFormattedTextField();
        txtbookid = new javax.swing.JFormattedTextField();
        txtstudentid = new javax.swing.JFormattedTextField();
        txtreutrndate = new javax.swing.JFormattedTextField();
        txtissuedate = new javax.swing.JFormattedTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        issuetable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 204, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Go-back-icon.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Back");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setText("பச்சிலைப்பள்ளி பொது நூலகம்");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("ISSUE BOOK PANEL");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 645, 1300, 50));

        jPanel3.setBackground(new java.awt.Color(51, 51, 0));
        jPanel3.setForeground(new java.awt.Color(51, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Borrow Book");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 11, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 39, 119, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Book ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 67, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Student ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 98, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Issue Date");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 136, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Return Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 174, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Book Provide Staff ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 212, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 250, -1, -1));
        jPanel3.add(txtbookprovidestaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 212, 179, -1));
        jPanel3.add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 67, 179, -1));
        jPanel3.add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 98, 179, -1));
        jPanel3.add(txtreutrndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 174, 179, -1));
        jPanel3.add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 136, 179, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 0));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\add.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 283, -1, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\delete.png")); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 283, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 255, 0));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\Reset.png")); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 283, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 255, 0));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\refresh-icon.png")); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel3.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 283, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 153, 578, 410));

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Borrow Book Details");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 11, -1, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 39, 190, 10));

        issuetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Student ID", "Issue Date", "Return Date", "Book Provide Staff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issuetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(issuetable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 580, 260));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon (1).png")); // NOI18N
        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 153, 607, 410));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, 140, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 500, 160, 190));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, 190));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, -1, 190));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setForeground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {
       
        System.exit(0);
   }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        new Dasboard().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
            String queSave="INSERT INTO isssuebook(BookID,StudentID,IssueDate,ReturnDate,ProvidestaffID) VALUES(?,?,?,?,?);";
                    PreparedStatement cmd=conn.prepareStatement(queSave); 
                    cmd.setString(1,txtbookid.getText()); 
                    cmd.setString(2,txtstudentid.getText()); 
                    cmd.setString(3,txtissuedate.getText()); 
                    cmd.setString(4,txtreutrndate.getText());
                    cmd.setString(5,txtbookprovidestaff.getText()); 
                    cmd.execute();
                    
                    JOptionPane.showMessageDialog(this,"BookID: "+txtbookid.getText()+", details successfully SAVE to the Database!","SAVE!",JOptionPane.INFORMATION_MESSAGE);
                    Erase(); 
                    Ref5();
           } catch (Exception SaveErr) {
                JOptionPane.showMessageDialog(this, "Error while"+"\n"+SaveErr);
           }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      Ref5();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void issuetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuetableMouseClicked
          try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
                int row=issuetable.getSelectedRow();
                String id=(issuetable.getModel().getValueAt(row, 0).toString()); 
                String queGetData="SELECT * FROM isssuebook WHERE StudentID = '" +id +"';";
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(queGetData);
                
                if(rs.next()){
                            
                        txtbookid.setText(rs.getString("BookID ")); 
                        txtstudentid.setText(rs.getString("StudentID")); 
                        txtissuedate.setText(rs.getString("IssueDate"));  
                        txtreutrndate.setText(rs.getString("ReturnDate")); 
                        txtbookprovidestaff.setText(rs.getString("ProvidestaffID"));                         
                            }
                
                btnsave.setEnabled(true); 
                btndelete.setEnabled(true); 
                btnupdate.setEnabled(true); 
                txtbookid.setEditable(true);
                
        } catch(Exception Err)
        {
        JOptionPane.showMessageDialog(this,"Error while Mouse Click on Table..."+"\n"+Err);
        }
    }//GEN-LAST:event_issuetableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String ID = txtstudentid.getText();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            String sql = "DELETE FROM `isssuebook` WHERE 	StudentID = '"+ ID +"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"You have SuccessFully DELETED, StudentID "+ ID +" Form The Database!!!",
                    "DELETE SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
                                     Erase();
                                     Ref5(); 
        }catch(Exception Drr)
        {
        JOptionPane.showConfirmDialog(this,"Error While Delete....."+"\n"+Drr);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try{
    Class.forName("com.mysql.cj.jdbc.Driver"); 
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
    String queUp="UPDATE isssuebook SET BookID=?,IssueDate=?,ReturnDate=?,ProvidestaffID=?" +"WHERE StudentID=?;"; 
    PreparedStatement cmd=conn.prepareStatement(queUp);
    
            cmd.setString(5,txtstudentid.getText()); 
            cmd.setString(1,txtbookid.getText()); 
            cmd.setString(2,txtissuedate.getText()); 
            cmd.setString(3,txtreutrndate.getText());
            cmd.setString(4,txtbookprovidestaff.getText()); 
            
            cmd.executeUpdate();
            
    JOptionPane.showMessageDialog(this,"StudentID: "+txtstudentid.getText()+", successfully UPDATED!","UPDATED!",
            JOptionPane.INFORMATION_MESSAGE); 
    Erase(); 
    Ref5();
} catch(Exception Err)
        {
       JOptionPane.showMessageDialog(this, "Error Whlie Update..."+"\n" + Err);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
            Erase();      
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTable issuetable;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JFormattedTextField txtbookid;
    private javax.swing.JFormattedTextField txtbookprovidestaff;
    private javax.swing.JFormattedTextField txtissuedate;
    private javax.swing.JFormattedTextField txtreutrndate;
    private javax.swing.JFormattedTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}
