
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }
    
    private void ref(){
    
    try {
            DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            Statement st=con.createStatement();
            String queSel = "SELECT * FROM admin;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("Username"); 
                String d2=rs.getString("Name");
                String d3=rs.getString("Password"); 
                String d4=rs.getString("PhoneNo"); 
                String d5=rs.getString("Email"); 
                
                                                                                                                            //(Username,Name,Password,PhoneNo,Email)
                mod.addRow(new Object[]{d1,d2,d3,d4,d5}); }
            
            
                    
            }catch(Exception RefErr){
                
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);
            
            }
    
    }
    private void rease(){
            
        txtusername.setText("");
        txtname.setText("");
        txtpass.setText("");
        txtphoneno.setText("");
        txtemail.setText("");
        txtusername.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusername = new javax.swing.JFormattedTextField();
        txtname = new javax.swing.JFormattedTextField();
        txtpass = new javax.swing.JFormattedTextField();
        txtphoneno = new javax.swing.JFormattedTextField();
        txtemail = new javax.swing.JFormattedTextField();
        btnsave = new javax.swing.JButton();
        btndeltete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1369, 11, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Go-back-icon.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 53, 39));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("பச்சிலைப்பள்ளி பொது நூலகம்");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Admin Panel");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 204, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 690, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1460, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1460, -1));

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Admin Register");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 21, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 530, 10));

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("UserName:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Phone No:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Email:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 518, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 153));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\save.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 301, -1, -1));

        btndeltete.setBackground(new java.awt.Color(255, 255, 153));
        btndeltete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndeltete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        btndeltete.setText("Delete");
        btndeltete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelteteActionPerformed(evt);
            }
        });
        jPanel3.add(btndeltete, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 301, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 255, 153));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\Reset.png")); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel3.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 301, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\refresh-icon.png")); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 21, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 530, 410));

        jPanel5.setBackground(new java.awt.Color(153, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "name", "Password", "Phone No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 856, 207));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Admin Details Table");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 21, 180, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 878, 10));

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon (1).png")); // NOI18N
        jButton5.setText("View Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\search.png")); // NOI18N
        jLabel14.setText("Search");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 70, -1));

        jFormattedTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyPressed(evt);
            }
        });
        jPanel5.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 120, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 890, 410));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, 290, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
            String queSave = "INSERT INTO admin(Username,Name,Password,PhoneNo,Email) VALUES(?,?,?,?,?);";
            PreparedStatement cmd=con.prepareStatement(queSave); 
            
            cmd.setString(1, txtusername.getText());
            cmd.setString(2, txtname.getText());
            cmd.setString(3, txtpass.getText());
            cmd.setString(4, txtphoneno.getText());
            cmd.setString(5, txtemail.getText());
            cmd.execute();
            
            
            
             JOptionPane.showMessageDialog(this, "User Name: " + txtusername.getText() + ",Details Successfully Save in The Database", "SAVE!!",JOptionPane.INFORMATION_MESSAGE);
             rease();
             ref();
             
       
       }catch(Exception SaveErr)
       {
       JOptionPane.showMessageDialog(this, "Error while"+"\n"+SaveErr);
       }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       setVisible(false);
        new Dasboard().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {
        System.exit(0);
   }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        rease();
    }//GEN-LAST:event_btnclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new admin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndelteteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelteteActionPerformed
        String ID = txtusername.getText();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            String sql = "DELETE FROM `admin` WHERE 	Username = '"+ ID +"'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"You have SuccessFully DELETED, Username "+ ID +" Form The Database!!!",
                    "DELETE SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
            
            rease();
            ref();
                                     
        }catch(Exception Drr)
        {
        JOptionPane.showConfirmDialog(this,"Error While Delete....."+"\n"+Drr);
        }
    }//GEN-LAST:event_btndelteteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ref();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
                int row=jTable1.getSelectedRow();
                String id=(jTable1.getModel().getValueAt(row, 0).toString()); 
                String queGetData="SELECT * FROM admin WHERE Username  = '" +id +"';";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(queGetData);
                
                if(rs.next()){
                            
                        txtusername.setText(rs.getString("Username")); 
                        txtname.setText(rs.getString("Name"));                          
                        txtpass.setText(rs.getString("Password"));  
                        txtphoneno.setText(rs.getString("PhoneNo")); 
                        txtemail.setText(rs.getString("Email")); 
                        
                        
                            }
                
                
                btnsave.setEnabled(true); 
                btndeltete.setEnabled(true); 
                txtusername.setEditable(true);
        } catch(Exception Err)
        {
        JOptionPane.showMessageDialog(this,"Error while Mouse Click on Table..."+"\n"+Err);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jFormattedTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyPressed
       DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String Search = jFormattedTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_jFormattedTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndeltete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JFormattedTextField txtname;
    private javax.swing.JFormattedTextField txtpass;
    private javax.swing.JFormattedTextField txtphoneno;
    private javax.swing.JFormattedTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
