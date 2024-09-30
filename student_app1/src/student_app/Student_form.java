/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_app;


import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public final class Student_form extends javax.swing.JFrame  {

    /**
     * Creates new form Student_form
     */
    public Student_form() {
        initComponents();
        fillTable();
    }
    
 /*   public Connection MySqlConnection(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433"
                    + databaseName = java_pro_st;user ="+instance+";password="+Pin;
            JOptionPane.showMessageDialog(null,"Mysql Connection Successful...");
            return null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Mysql Connection Failed...");
            return null;
        }
    }*/

  // GetConnectionClass con = new GetConnectionClass();
   /*public Connection databaseConnection(String Instance,String Pin) throws SQLException, ClassNotFoundException{
       Connection conn=null;
     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String ConnectionURL ="jdbc:sqlserver://localhost:1433;databaseName=Blood_Bank;user="+Instance+";password="+Pin;
         
         
         conn = DriverManager.getConnection(ConnectionURL);
         JOptionPane.showMessageDialog(null,"Mysql Connection Successful...");
         return null;
     }
     catch (ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Mysql Connection Failed...");  
       return null;
    }
  }*/
    String photopath = "";
    public ImageIcon resetImagesize(String photopath,byte[] photo){
       ImageIcon myphoto = null;
       if(photopath != null){
        myphoto = new ImageIcon(photopath);
       }
       else{
           myphoto = new ImageIcon(photo); 
       }
       Image img = myphoto.getImage();
       Image img1 = img.getScaledInstance(label_photo.getWidth(),label_photo.getHeight(),
                     Image.SCALE_SMOOTH);
       ImageIcon ph = new ImageIcon(img1);
       return ph;    
    }
    
    //show or add the data to the JTable
    public ArrayList<StudentBin> retrieveData(){
        ArrayList<StudentBin> al = null;
        try{
            Connection conn = (Connection) con;
            String q = "select * from students";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            StudentBin Student;
            while(rs.next()){
                Student = new StudentBin(rs.getInt(1),rs.getString("name"),Float.parseFloat(rs.getString(3)),rs.getString(4),rs.getBytes("photo"));
                al.add(Student);
            }
        }catch(NumberFormatException | SQLException e){
            System.out.println("Error in retrieveData method: "+e);
        }
    return al;
    }
    
    //fill the table or show all data to Jtable
    public void fillTable(){
        ArrayList<StudentBin> al = retrieveData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for(int i=0; i< al.size();i++){
            row[0] = al.get(i).getId();
            row[1] = al.get(i).getName();
            row[2] = al.get(i).getCgpa();
            row[3] = al.get(i).getDob();
            model.addRow(row);
        }
    }
    
    
    
    //show data to fields:
    public void showItemToFields(int index){
        jTextField1_id.setText(Integer.toString(retrieveData().get(index).getId()));
        jTextField2_name.setText(retrieveData().get(index).getName());
        jTextField3_cgpa.setText(Float.toString(retrieveData().get(index).getCgpa()));
        
        try{
            java.util.Date dob = null;
            dob = new SimpleDateFormat("yyyy-mm-dd").parse((String)retrieveData().get(index).getDob());
            jCalendar1_dob.setDate(dob);
        }catch(ParseException e){
            System.out.println("Error at showItemToFields method "+e);
        }
        
        label_photo.setIcon(resetImagesize(null, retrieveData().get(index).getPhoto())); 
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_name = new javax.swing.JTextField();
        jTextField3_cgpa = new javax.swing.JTextField();
        jCalendar1_dob = new com.toedter.calendar.JCalendar();
        label_photo = new javax.swing.JLabel();
        new_butt = new javax.swing.JButton();
        save_butt = new javax.swing.JButton();
        update_butt = new javax.swing.JButton();
        delete_butt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4_srch = new javax.swing.JTextField();
        pic_butt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Student Information");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CGPA:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DOB:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Photo:");

        jTextField2_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_nameActionPerformed(evt);
            }
        });

        jTextField3_cgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_cgpaActionPerformed(evt);
            }
        });

        jCalendar1_dob.setDate(new java.util.Date(1576105745000L));
        jCalendar1_dob.setDoubleBuffered(false);

        label_photo.setBackground(new java.awt.Color(255, 255, 255));
        label_photo.setOpaque(true);

        new_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        new_butt.setForeground(new java.awt.Color(0, 204, 204));
        new_butt.setText("New");

        save_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save_butt.setForeground(new java.awt.Color(0, 204, 204));
        save_butt.setText("Insert/Save");
        save_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttActionPerformed(evt);
            }
        });

        update_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update_butt.setForeground(new java.awt.Color(0, 204, 204));
        update_butt.setText("Update");
        update_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttActionPerformed(evt);
            }
        });

        delete_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete_butt.setForeground(new java.awt.Color(0, 204, 204));
        delete_butt.setText("Delete");
        delete_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Search Students By ID:");

        jTextField4_srch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_srchKeyReleased(evt);
            }
        });

        pic_butt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pic_butt.setForeground(new java.awt.Color(102, 204, 255));
        pic_butt.setText("Select Photo");
        pic_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pic_buttActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Name", "CGPA", "Date of Birth"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4_srch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCalendar1_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pic_butt)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField3_cgpa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jTextField2_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1_id, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(delete_butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save_butt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(new_butt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(new_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField3_cgpa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pic_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jCalendar1_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4_srch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\DIU.jpg")); // NOI18N
        jLabel2.setText(" ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Daffodil International University");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Dhanmondi,Dhaka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //for deleting
    private void delete_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttActionPerformed
       if(jTextField1_id.getText().equals("")){
           JOptionPane.showMessageDialog(null, "ID is compulsory..."); 
       }else{
                   
          try{
             String qry = "delete from students where id=?";
             Connection conn = (Connection) con;
             PreparedStatement ps = conn.prepareStatement(qry);
             ps.setInt(1, Integer.parseInt(jTextField1_id.getText()));
             int res = ps.executeUpdate();
             fillTable();
             if(res>=1){
               JOptionPane.showMessageDialog(null, "Student Deleted Successfully.....");  
             }
             else{
               JOptionPane.showMessageDialog(null, "Student Deletion Failed.....");   
             }
             
           }catch(HeadlessException | NumberFormatException | SQLException e){
              JOptionPane.showMessageDialog(null, e);
           }          
       }
    }//GEN-LAST:event_delete_buttActionPerformed
    
    //for selecting the photo
    private void pic_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pic_buttActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
       FileNameExtensionFilter fnef = new FileNameExtensionFilter("*.images","jpg","png");
       chooser.addChoosableFileFilter(fnef);
       int ans = chooser.showSaveDialog(null);
       if(ans==JFileChooser.APPROVE_OPTION){
           File selectedPhoto = chooser.getSelectedFile();
           String path = selectedPhoto.getAbsolutePath();
           label_photo.setIcon(resetImagesize(path,null));
           this.photopath = path;
           
       }

    }//GEN-LAST:event_pic_buttActionPerformed

    private void jTextField2_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_nameActionPerformed

    private void jTextField3_cgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_cgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_cgpaActionPerformed
    
    //for saving/insert;
    private void save_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttActionPerformed
     
        if((jTextField1_id==null || jTextField2_name==null || jTextField3_cgpa==null || jCalendar1_dob==null) && null==photopath){
      try{
          Connection conn = (Connection) con;
         // String qry = "insert into students values(id,name,cgpa,dob,photo) values (?,?,?,?,?)";
          PreparedStatement ps = conn.prepareStatement("insert into students (id,name,cgpa,dob,photo) values (?,?,?,?,?)");
          ps.setInt(1, Integer.parseInt(jTextField1_id.getText()));
          ps.setString(2,jTextField2_name.getText());
          ps.setFloat(3,Float.parseFloat(jTextField3_cgpa.getText()));
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
          String dob1 = sdf.format(jCalendar1_dob.getDate());
          ps.setString(4,dob1);
          
          InputStream is = new FileInputStream(new File(photopath));
          ps.setBlob(5, is);
          int res = ps.executeUpdate();
          fillTable();
          if(res>=1){
              JOptionPane.showMessageDialog(null, res+"Number of Student"
                   + " inserted into database.....");
          }
          else{
              JOptionPane.showMessageDialog(null, "Student Insertion Failed ....");
          }          
      }catch(HeadlessException | FileNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
        jTextField1_id.setText("");
        jTextField2_name.setText("");
        jTextField3_cgpa.setText("");
      }
      else{
          JOptionPane.showMessageDialog(null, "All fields are compulsory.....");  
      } 
    }//GEN-LAST:event_save_buttActionPerformed
    
    //for updating info
    private void update_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttActionPerformed
        if(jTextField1_id!=null || jTextField2_name!=null || jTextField3_cgpa!=null || jCalendar1_dob!=null){
      
          String qry = null;
          PreparedStatement ps = null;
          Connection conn = (Connection) con;
          
          if(photopath==null){
        try{
          
          qry = "update students set name = ?, fees=?,dob=? where id=?";
          ps = conn.prepareStatement(qry);
          
          ps.setString(1,jTextField2_name.getText());
          ps.setFloat(2,Float.parseFloat(jTextField3_cgpa.getText()));
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
          String dob1 = sdf.format(jCalendar1_dob.getDate());
          ps.setString(3,dob1);
          
          ps.setInt(4, Integer.parseInt(jTextField1_id.getText()));
     
          int res = ps.executeUpdate();
          fillTable();
          if(res>=1){
              JOptionPane.showMessageDialog(null, res+"Number of Student"
                   + " updated Successfully.....");
          } 
          else{
              JOptionPane.showMessageDialog(null, "Student updataion Failed ....");
          }          
      }catch(HeadlessException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
        jTextField1_id.setText("");
        jTextField2_name.setText("");
        jTextField3_cgpa.setText("");
      }
         else{ //update with photo
                      try{
          
          InputStream is = new FileInputStream(new File(photopath));
          
          
          qry = "update students set name = ?, fees=?,dob=? where id=?";
          ps = conn.prepareStatement(qry);
          
          ps.setString(1,jTextField2_name.getText());
          ps.setFloat(2,Float.parseFloat(jTextField3_cgpa.getText()));
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
          String dob1 = sdf.format(jCalendar1_dob.getDate());
          ps.setString(3,dob1);
          ps.setBlob(4, is);
          ps.setInt(5, Integer.parseInt(jTextField1_id.getText()));
          
          int res = ps.executeUpdate();
          fillTable();
          if(res>=1){
              JOptionPane.showMessageDialog(null, res+"Student"
                   + " updated Successfully.....");
          } 
          else{
              JOptionPane.showMessageDialog(null, "Student updation Failed ....");
          }          
      }catch(         HeadlessException | FileNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(null, e);
        }
        jTextField1_id.setText("");
        jTextField2_name.setText("");
        jTextField3_cgpa.setText("");
              
          }
    }else{
          JOptionPane.showMessageDialog(null, "All fields are compulsory.....");  
      }
      
    }//GEN-LAST:event_update_buttActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ind  = jTable1.getSelectedRow();
        showItemToFields(ind);
    }//GEN-LAST:event_jTable1MouseClicked

    //to search the students by name
    private void jTextField4_srchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_srchKeyReleased
       
       ArrayList<StudentBin> al = null;
       al = new ArrayList<StudentBin>();
       String val = jTextField4_srch.getText().toString();
       
       try{
           Connection conn = (Connection) con;
           String qry = "select * from student where name like '%"+val+"%";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(qry);
           StudentBin Student;
           while(rs.next()){
               Student = new StudentBin(rs.getInt(1),rs.getString("name"),Float.parseFloat(rs.getString(3)),rs.getString(4),rs.getBytes("photo"));
               al.add(Student);
           }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for(int i=0; i< al.size();i++){
            row[0] = al.get(i).getId();
            row[1] = al.get(i).getName();
            row[2] = al.get(i).getCgpa();
            row[3] = al.get(i).getDob();
            model.addRow(row);
        }
       }catch(NumberFormatException | SQLException e){
           System.out.println(e);
       } 
    }//GEN-LAST:event_jTextField4_srchKeyReleased

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
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Student_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_butt;
    private com.toedter.calendar.JCalendar jCalendar1_dob;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_name;
    private javax.swing.JTextField jTextField3_cgpa;
    private javax.swing.JTextField jTextField4_srch;
    private javax.swing.JLabel label_photo;
    private javax.swing.JButton new_butt;
    private javax.swing.JButton pic_butt;
    private javax.swing.JButton save_butt;
    private javax.swing.JButton update_butt;
    // End of variables declaration//GEN-END:variables
}
