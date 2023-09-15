
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
public class Book extends javax.swing.JFrame {

    /**
     * Creates new form Book
     */
    public Book() {
        initComponents();
    }

   public void ref(){
    
    try {
            DefaultTableModel mod=(DefaultTableModel)jTable1.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            Statement st=con.createStatement();
            String queSel = "SELECT * FROM book;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("ID"); 
                String d2=rs.getString("BookName");
                String d3=rs.getString("Author"); 
                String d4=rs.getString("Status"); 
                                                                                                                     
                mod.addRow(new Object[]{d1,d2,d3,d4}); }
                        
    }catch(Exception RefErr){
                
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);
            
            }
    
    }
   
   private void rease(){
            txtbookid.setText("");
            txtbname.setText("");
            txtauthor.setText("");
            txtstatus.setText("");
   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JFormattedTextField();
        txtbname = new javax.swing.JFormattedTextField();
        txtauthor = new javax.swing.JFormattedTextField();
        txtstatus = new javax.swing.JFormattedTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jPanel9.setBackground(new java.awt.Color(51, 0, 102));

        jSeparator3.setForeground(new java.awt.Color(255, 204, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Book Panel");

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("பச்சிலைப்பள்ளி பொது நூலகம்");

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Go-back-icon.png")); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1264, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(45, 45, 45))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel15))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jLabel14)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel14)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1497, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1459, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1459, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 507, 1459, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, -1, 430));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 91, -1, 420));

        jPanel5.setBackground(new java.awt.Color(102, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Book Registration");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 6, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 578, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Book ID");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 59, 102, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Book Name");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 93, 102, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Author");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 127, 102, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Status");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 161, 102, -1));
        jPanel6.add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 59, 226, -1));
        jPanel6.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 93, 226, -1));
        jPanel6.add(txtauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 127, 226, -1));

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        jPanel6.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 161, 226, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 270));

        btnsave.setBackground(new java.awt.Color(255, 255, 102));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\add.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 102));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\delete.png")); // NOI18N
        btndelete.setText("Delete");
        btndelete.setActionCommand("De");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 255, 102));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\Reset.png")); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel5.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 106, 593, 395));

        jPanel7.setBackground(new java.awt.Color(102, 102, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 0, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "BookName", "Author", " Status", "Describe", "Update Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 200));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Book Details Table");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 13, 170, 0));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 51));
        jPanel8.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 770, 10));

        jFormattedTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField7KeyPressed(evt);
            }
        });
        jPanel8.add(jFormattedTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 140, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\search.png")); // NOI18N
        jLabel17.setText("Search");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 330));

        jButton7.setBackground(new java.awt.Color(255, 204, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon (1).png")); // NOI18N
        jButton7.setText("View Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 106, 800, 395));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 430));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 430));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 430));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 430));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 430));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, 270, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       setVisible(false);
        new Dasboard().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {
        System.exit(0);
   }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       try{
       Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
            
            String queSave = "INSERT INTO book(ID,BookName,Author,Status) VALUES(?,?,?,?);";
            PreparedStatement cmd=con.prepareStatement(queSave); 
            
            cmd.setString(1, txtbookid.getText());
            cmd.setString(2, txtbname.getText());
            cmd.setString(3, txtauthor.getText());
            cmd.setString(4, txtstatus.getText());
            cmd.execute();
            
            
            
             JOptionPane.showMessageDialog(this, "Book ID: " + txtbookid.getText() + ",Details Successfully Save in The Database", "SAVE!!",JOptionPane.INFORMATION_MESSAGE);
             rease();
              ref();
            
       }catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error while"+"\n"+ex );
       }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         String ID = txtbookid.getText();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            String sql = "DELETE FROM `book` WHERE ID = '"+ ID +"'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"You have SuccessFully DELETED, Book ID "+ ID +" Form The Database!!!",
                    "DELETE SUCCESS!",JOptionPane.INFORMATION_MESSAGE);
            
            rease();
             ref();
                                     
        }catch(Exception Drr)
        {
        JOptionPane.showConfirmDialog(this,"Error While Delete....."+"\n"+Drr);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            
                int row=jTable1.getSelectedRow();
                String id=(jTable1.getModel().getValueAt(row, 0).toString()); 
                String queGetData="SELECT * FROM book WHERE ID  = '" +id +"';";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(queGetData);
                
                if(rs.next()){
                            
                        txtbookid.setText(rs.getString("ID"));  
                        txtbname.setText(rs.getString("BookName"));                          
                        txtauthor.setText(rs.getString("Author"));  
                        txtstatus.setText(rs.getString("Status")); 
                    
                        
                        
                            }
                
              
                btnsave.setEnabled(true); 
                btndelete.setEnabled(true); 
                txtbookid.setEditable(true);
        } catch(Exception Err)
        {
        JOptionPane.showMessageDialog(this,"Error while Mouse Click on Table..."+"\n"+Err);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         ref();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       rease();
    }//GEN-LAST:event_btnclearActionPerformed

    private void jFormattedTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField7KeyPressed
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String Search = jFormattedTextField7.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_jFormattedTextField7KeyPressed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtauthor;
    private javax.swing.JFormattedTextField txtbname;
    private javax.swing.JFormattedTextField txtbookid;
    private javax.swing.JFormattedTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
