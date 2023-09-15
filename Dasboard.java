import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Anojan
 */
public class Dasboard extends javax.swing.JFrame {

    
    public Dasboard() {
        initComponents();
        
        SimpleDateFormat dformaat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        txtdate.setText(dformaat.format(date));
        
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        txttime.setText(time.format(now));     
    }
    
      public void refbook(){
    
    try {
            DefaultTableModel mod=(DefaultTableModel)tablebook.getModel();
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
      
       public void Refstudent(){
    
        try {
            DefaultTableModel mod=(DefaultTableModel)studenttable.getModel();
            mod.setRowCount(0);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pallai_library","root","");
            Statement st=conn.createStatement();
            String queSel = "SELECT * FROM student;";
            ResultSet rs=st.executeQuery(queSel);
            
            while(rs.next()){
                String d1=rs.getString("StudentID"); 
                String d2=rs.getString("FullName");
                String d3=rs.getString("DOB"); 
                String d4=rs.getString("Sex"); 
                String d5=rs.getString("RegDate"); 
                String d6=rs.getString("MobileNO"); 
                String d7=rs.getString("Password");
                String d8=rs.getString("Status"); 
                
                
                mod.addRow(new Object[]{d1,d2,d3,d4,d5,d6,d7,d8}); }
            
            
                    
            }catch(Exception RefErr){
                
                JOptionPane.showMessageDialog(this,"Error while TableLoad...."+"\n"+RefErr);
            
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btndevelop = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();
        btnbook = new javax.swing.JButton();
        btnstaff = new javax.swing.JButton();
        btnstudents = new javax.swing.JButton();
        btniss = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnstu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebook = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        studenttable = new javax.swing.JTable();
        btnbk = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 8, 91, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Go-back-icon.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("பச்சிலைப்பள்ளி பொது நூலகம்");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("DASBOARD");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 6, 218, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 102));
        jButton4.setText("MENU");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        btndevelop.setBackground(new java.awt.Color(204, 255, 204));
        btndevelop.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btndevelop.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\new\\app-x-executable-icon.png")); // NOI18N
        btndevelop.setText("Developer");
        btndevelop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevelopActionPerformed(evt);
            }
        });
        jPanel2.add(btndevelop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 290, 50));

        btnadmin.setBackground(new java.awt.Color(204, 255, 204));
        btnadmin.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btnadmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\admin.png")); // NOI18N
        btnadmin.setText("Admin");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel2.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 50));

        btnbook.setBackground(new java.awt.Color(204, 255, 204));
        btnbook.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btnbook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Book.png")); // NOI18N
        btnbook.setText("Books");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });
        jPanel2.add(btnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 50));

        btnstaff.setBackground(new java.awt.Color(204, 255, 204));
        btnstaff.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btnstaff.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Staff.png")); // NOI18N
        btnstaff.setText("Staffs");
        btnstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 50));

        btnstudents.setBackground(new java.awt.Color(204, 255, 204));
        btnstudents.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btnstudents.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Student.png")); // NOI18N
        btnstudents.setText("Students");
        btnstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentsActionPerformed(evt);
            }
        });
        jPanel2.add(btnstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 290, 50));

        btniss.setBackground(new java.awt.Color(204, 255, 204));
        btniss.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btniss.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\new\\Books-1-icon.png")); // NOI18N
        btniss.setText("Issue Books");
        btniss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissActionPerformed(evt);
            }
        });
        jPanel2.add(btniss, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 290, 50));

        btnreturn.setBackground(new java.awt.Color(204, 255, 204));
        btnreturn.setFont(new java.awt.Font("Jokerman", 3, 18)); // NOI18N
        btnreturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\new\\Ecommerce-Return-Purchase-icon.png")); // NOI18N
        btnreturn.setText("Return Books");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel2.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 290, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\bms\\close Jframe.png")); // NOI18N
        jButton3.setText("Hide menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 401, 720));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\new\\Get-Info-icon.png")); // NOI18N
        jButton11.setText("Info");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 670, 100, -1));

        jPanel6.setBackground(new java.awt.Color(51, 255, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Time:");

        txttime.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txttime.setText("__________");

        txtdate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtdate.setText("__________");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Date:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtdate)
                    .addComponent(jLabel6)
                    .addComponent(txttime))
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        btnstu.setBackground(new java.awt.Color(153, 255, 153));
        btnstu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnstu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon.png")); // NOI18N
        btnstu.setText("Show Student Table");
        btnstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstuActionPerformed(evt);
            }
        });
        jPanel5.add(btnstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        tablebook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "Book Name", "Author", "Status", "Describe", "Update Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablebook);
        if (tablebook.getColumnModel().getColumnCount() > 0) {
            tablebook.getColumnModel().getColumn(0).setResizable(false);
            tablebook.getColumnModel().getColumn(1).setResizable(false);
            tablebook.getColumnModel().getColumn(2).setResizable(false);
            tablebook.getColumnModel().getColumn(3).setResizable(false);
            tablebook.getColumnModel().getColumn(4).setResizable(false);
            tablebook.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 690, 110));

        studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Studen ID", "Full Name", "DOB", "Sex", "Reg date", "Mobile", "Password", "Reg Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studenttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studenttable);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 690, 280));

        btnbk.setBackground(new java.awt.Color(153, 255, 153));
        btnbk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbk.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\Dj-View-icon.png")); // NOI18N
        btnbk.setText("Show Book Table");
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });
        jPanel5.add(btnbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anojan\\Desktop\\pallai\\Pallai_Library\\src\\Icons\\Icons\\LIBRARY\\refresh-icon.png")); // NOI18N
        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 710, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       btnadmin.setVisible(false);
       btnbook.setVisible(false);
       btnstaff.setVisible(false);
       btnstudents.setVisible(false);
       btniss.setVisible(false);
       btnreturn.setVisible(false);
       btndevelop.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstaffActionPerformed
       setVisible(false);
       new Staff().setVisible(true);
    }//GEN-LAST:event_btnstaffActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   new info().setVisible(true);   
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btndevelopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevelopActionPerformed
         setVisible(false);
        new Developer_details().setVisible(true);  
    }//GEN-LAST:event_btndevelopActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=  JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit","Select",JOptionPane.YES_NO_OPTION);
   
   if (a==0)
   {
        System.exit(0);
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
         setVisible(false);
        new admin().setVisible(true);
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
       setVisible(false);
        new Book().setVisible(true);
    }//GEN-LAST:event_btnbookActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        btnadmin.setVisible(true);
       btnbook.setVisible(true);
       btnstaff.setVisible(true);
       btnstudents.setVisible(true);
       btniss.setVisible(true);
       btnreturn.setVisible(true);
       btndevelop.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentsActionPerformed
       setVisible(false);
       new Student().setVisible(true);
    }//GEN-LAST:event_btnstudentsActionPerformed

    private void btnissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissActionPerformed
        setVisible(false);
       new IssueBook().setVisible(true);
    }//GEN-LAST:event_btnissActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        setVisible(false);
       new ReturnBook().setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstuActionPerformed
        Refstudent(); 
        
        
       
    }//GEN-LAST:event_btnstuActionPerformed

    private void studenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studenttableMouseClicked
      
    }//GEN-LAST:event_studenttableMouseClicked

    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed
         refbook();
         
    }//GEN-LAST:event_btnbkActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       setVisible(false);
       new Dasboard().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btndevelop;
    private javax.swing.JButton btniss;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnstaff;
    private javax.swing.JButton btnstu;
    private javax.swing.JButton btnstudents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable studenttable;
    public javax.swing.JTable tablebook;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables
}
