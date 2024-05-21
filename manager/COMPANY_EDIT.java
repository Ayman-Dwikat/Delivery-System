/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class COMPANY_EDIT extends javax.swing.JFrame {

    /**
     * Creates new form COMPANY_EDIT
     */
    public COMPANY_EDIT() {
       initComponents();
        fillText2();
        //place main frame in center
         super.pack();
        super.setLocationRelativeTo(null);
    }

    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/delivery", "root", "");
                    return con;
        }catch (SQLException e){
          return null;  
        } 
    }
    public void executeSQlQuery(String query, String msg){
        Connection con = getConnection();
        Statement st;
        try{
            st=con.createStatement();
            if((st.executeUpdate(query))==1){
                //DefaultTableModel model = (DefaultTableModel)adminTable.getModel();
                
                JOptionPane.showMessageDialog(null, "Data "+msg+" Succefully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data NOT "+msg);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }
    public static String[] Arr1=new String[6];
 
     private void fillText2(){
        COMPANY COMPANY=new COMPANY();
        Arr1=COMPANY.getTable();
        ID.setText(Arr1[0]);
        EMAIL.setText(Arr1[2]);
        NAME.setText(Arr1[1]);
        ADDRESS.setText(Arr1[3]);
        PHONE.setText(Arr1[4]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CLOSE = new javax.swing.JButton();
        SAVE = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();
        sidepane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DASHBOAR_PANEL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MANAGER_PANEL = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ADMIN_PANEL = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        company = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\cancel.png")); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 12, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Edit Company Information");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        CLOSE.setBackground(new java.awt.Color(102, 102, 102));
        CLOSE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setText("CLOSE");
        CLOSE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CLOSEMousePressed(evt);
            }
        });
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel3.add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 70, 40));

        SAVE.setBackground(new java.awt.Color(218, 98, 9));
        SAVE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SAVE.setForeground(new java.awt.Color(255, 255, 255));
        SAVE.setText("SAVE");
        SAVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SAVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SAVEMousePressed(evt);
            }
        });
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        jPanel3.add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 70, 40));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(218, 98, 9));
        jLabel21.setText("_______________________");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("ID: ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Name: ");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Phone: ");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Address: ");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(218, 98, 9));
        id.setText("____________________________________");
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 390, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(218, 98, 9));
        name.setText("________________________________");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 340, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(218, 98, 9));
        jLabel25.setText("________________________________");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 320, -1));

        address.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        address.setForeground(new java.awt.Color(218, 98, 9));
        address.setText("______________________________");
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 310, -1));

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 360, 30));

        NAME.setBackground(new java.awt.Color(255, 255, 255));
        NAME.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        NAME.setForeground(new java.awt.Color(0, 0, 0));
        NAME.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        jPanel3.add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 320, 30));

        PHONE.setBackground(new java.awt.Color(255, 255, 255));
        PHONE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PHONE.setForeground(new java.awt.Color(0, 0, 0));
        PHONE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PHONEActionPerformed(evt);
            }
        });
        jPanel3.add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 320, 30));

        ADDRESS.setBackground(new java.awt.Color(255, 255, 255));
        ADDRESS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ADDRESS.setForeground(new java.awt.Color(0, 0, 0));
        ADDRESS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSActionPerformed(evt);
            }
        });
        jPanel3.add(ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 300, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("E-mail: ");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(218, 98, 9));
        email.setText("________________________________");
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 340, -1));

        EMAIL.setBackground(new java.awt.Color(255, 255, 255));
        EMAIL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        EMAIL.setForeground(new java.awt.Color(0, 0, 0));
        EMAIL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });
        jPanel3.add(EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, 30));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Password: ");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(218, 98, 9));
        password.setText("_____________________________");
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 320, -1));

        PASSWORD.setBackground(new java.awt.Color(255, 255, 255));
        PASSWORD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PASSWORD.setForeground(new java.awt.Color(0, 0, 0));
        PASSWORD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });
        jPanel3.add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 320, 30));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 630, 540));

        sidepane.setBackground(new java.awt.Color(218, 98, 9));

        jPanel2.setBackground(new java.awt.Color(218, 98, 9));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\LOGO.png")); // NOI18N

        DASHBOAR_PANEL.setBackground(new java.awt.Color(218, 98, 9));
        DASHBOAR_PANEL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANELMouseMoved(evt);
            }
        });
        DASHBOAR_PANEL.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                DASHBOAR_PANELMouseWheelMoved(evt);
            }
        });
        DASHBOAR_PANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANELMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DASHBOAR_PANELMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\menu.png")); // NOI18N
        DASHBOAR_PANEL.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DASHBOARD");
        DASHBOAR_PANEL.add(jLabel3);

        MANAGER_PANEL.setBackground(new java.awt.Color(218, 98, 9));
        MANAGER_PANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MANAGER_PANELMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\manager.png")); // NOI18N
        MANAGER_PANEL.add(jLabel11);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANAGER   ");
        MANAGER_PANEL.add(jLabel4);

        jPanel4.setBackground(new java.awt.Color(218, 98, 9));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\parcel.png")); // NOI18N
        jPanel4.add(jLabel5);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PARCEL       ");
        jPanel4.add(jLabel12);

        jPanel7.setBackground(new java.awt.Color(218, 98, 9));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\motorbike.png")); // NOI18N
        jPanel7.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DRIVER         ");
        jPanel7.add(jLabel10);

        ADMIN_PANEL.setBackground(new java.awt.Color(218, 98, 9));
        ADMIN_PANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ADMIN_PANELMousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\admin.png")); // NOI18N
        ADMIN_PANEL.add(jLabel13);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN         ");
        ADMIN_PANEL.add(jLabel6);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(218, 98, 9));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\logout.png")); // NOI18N
        jPanel5.add(jLabel8);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOGOUT       ");
        jPanel5.add(jLabel7);

        company.setBackground(new java.awt.Color(218, 98, 9));
        company.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                companyMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\DASHBOARD\\src\\main\\java\\com\\mycompany\\dashboard\\imgs\\company.png")); // NOI18N
        company.add(jLabel14);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("COMPANY");
        company.add(jLabel18);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(DASHBOAR_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MANAGER_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADMIN_PANEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DASHBOAR_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADMIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MANAGER_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel16MousePressed

    private void CLOSEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMousePressed
        this.dispose();
        COMPANY COMPANY = new COMPANY();
        COMPANY.setVisible(true);
    }//GEN-LAST:event_CLOSEMousePressed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        this.dispose();
        COMPANY COMPANY = new COMPANY();
        COMPANY.setVisible(true);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void SAVEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAVEMousePressed
        //this.dispose();
        //MANAGER MANAGER = new MANAGER();
        //MANAGER.setVisible(true);
    }//GEN-LAST:event_SAVEMousePressed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        String sqll = "UPDATE `company` SET `email`='"+EMAIL.getText()+"',`name`='"+NAME.getText()+"',`password`='"+PASSWORD.getText()+"',`Adress`='"+ADDRESS.getText()+"',`phone`='"+PHONE.getText()+"' WHERE `id`='"+Arr1[0]+"'";
        executeSQlQuery(sqll,"Edited");
    }//GEN-LAST:event_SAVEActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PHONEActionPerformed

    private void ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMAILActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void DASHBOAR_PANELMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANELMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANELMouseMoved

    private void DASHBOAR_PANELMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_DASHBOAR_PANELMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANELMouseWheelMoved

    private void DASHBOAR_PANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANELMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DASHBOAR_PANELMouseClicked

    private void DASHBOAR_PANELMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DASHBOAR_PANELMousePressed
        this.dispose();
        MAIN MAIN = new MAIN();
        MAIN.setVisible(true);
    }//GEN-LAST:event_DASHBOAR_PANELMousePressed

    private void MANAGER_PANELMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGER_PANELMousePressed
        this.dispose();
        MANAGER MANAGER = new MANAGER();
        MANAGER.setVisible(true);
    }//GEN-LAST:event_MANAGER_PANELMousePressed

    private void ADMIN_PANELMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMIN_PANELMousePressed
        this.dispose();
        ADMIN ADMIN = new ADMIN();
        ADMIN.setVisible(true);
    }//GEN-LAST:event_ADMIN_PANELMousePressed

    private void companyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyMousePressed
        this.dispose();
        COMPANY COMPANY = new COMPANY();
        COMPANY.setVisible(true);
    }//GEN-LAST:event_companyMousePressed

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
            java.util.logging.Logger.getLogger(COMPANY_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMPANY_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMPANY_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMPANY_EDIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPANY_EDIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JPanel ADMIN_PANEL;
    private javax.swing.JButton CLOSE;
    private javax.swing.JPanel DASHBOAR_PANEL;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel MANAGER_PANEL;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField PHONE;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel address;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel company;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
