/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rushi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class SIteam_Adding_Anlysis extends javax.swing.JFrame {
    private final String user = "root";
    private final String pass = "Rushikesh@5046";
    private final String sqlcon = "jdbc:mysql://localhost:3306/rushi";    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public SIteam_Adding_Anlysis() {
        initComponents();
        showDate();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-y");
        Anlysis_Date.setText(s1.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        zGradient1 = new com.mycompany.rushi.ZGradient();
        imageAvatar1 = new com.mycompany.rushi.ImageAvatar();
        Home = new javax.swing.JLabel();
        Stock_Anlysis = new javax.swing.JLabel();
        Stock_Info = new javax.swing.JLabel();
        StockAdd = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Setting = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Anlysis_Date = new com.mycompany.main.TextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jSpinner1 = new javax.swing.JSpinner();
        Anlysis_Searcha = new com.mycompany.rushi.TextFieldSearchOption();
        Anlysis_Searcha1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Anlysis_Jan = new javax.swing.JSpinner();
        Anlysis_May = new javax.swing.JSpinner();
        Anlysis_Feb = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        Anlysis_March = new javax.swing.JSpinner();
        Anlysis_April = new javax.swing.JSpinner();
        Anlysis_June = new javax.swing.JSpinner();
        Anlysis_Aug = new javax.swing.JSpinner();
        Anlysis_July = new javax.swing.JSpinner();
        Anlysis_sept = new javax.swing.JSpinner();
        Anlysis_oct = new javax.swing.JSpinner();
        Anlysis_Nov = new javax.swing.JSpinner();
        Anlysis_Dec = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        Anlysis_productno = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        Anlysis_ProductName = new javax.swing.JTextField();
        Anlysis_Barcode = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Anlysis_Datestart = new com.toedter.calendar.JDateChooser();
        Anlysis_Date_End = new com.toedter.calendar.JDateChooser();
        Anlysis_Add = new com.mycompany.main.Button();
        Anlysis_Delete = new com.mycompany.main.Button();
        Anlysis_Clear = new com.mycompany.main.Button();
        Anlysis_Update = new com.mycompany.main.Button();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Predict_Table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Annual_Table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        Logout_Login = new javax.swing.JMenuItem();
        Logout1_CreatACcount = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imageAvatar1.setBorderSize(4);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/dog.png"))); // NOI18N

        Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-page-40.png"))); // NOI18N
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        Stock_Anlysis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Stock_Anlysis.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Anlysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-order3-40 (1).png"))); // NOI18N
        Stock_Anlysis.setText("Stock Anlysis");
        Stock_Anlysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_AnlysisMouseClicked(evt);
            }
        });

        Stock_Info.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Stock_Info.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-order-40.png"))); // NOI18N
        Stock_Info.setText("Stock Info");
        Stock_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_InfoMouseClicked(evt);
            }
        });

        StockAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        StockAdd.setForeground(new java.awt.Color(255, 255, 255));
        StockAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ordering-40.png"))); // NOI18N
        StockAdd.setText("Stock Add");
        StockAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockAddMouseClicked(evt);
            }
        });

        Mail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-send-to-printer-40.png"))); // NOI18N
        Mail.setText("Mail");
        Mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MailMouseClicked(evt);
            }
        });

        Account.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Account.setForeground(new java.awt.Color(255, 255, 255));
        Account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-accounting-40.png"))); // NOI18N
        Account.setText("Account");

        Setting.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Setting.setForeground(new java.awt.Color(255, 255, 255));
        Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-gear-40.png"))); // NOI18N
        Setting.setText("Setting");

        javax.swing.GroupLayout zGradient1Layout = new javax.swing.GroupLayout(zGradient1);
        zGradient1.setLayout(zGradient1Layout);
        zGradient1Layout.setHorizontalGroup(
            zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zGradient1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(zGradient1Layout.createSequentialGroup()
                        .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stock_Info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stock_Anlysis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(StockAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        zGradient1Layout.setVerticalGroup(
            zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Home)
                .addGap(39, 39, 39)
                .addComponent(StockAdd)
                .addGap(41, 41, 41)
                .addComponent(Stock_Anlysis)
                .addGap(41, 41, 41)
                .addComponent(Stock_Info)
                .addGap(42, 42, 42)
                .addComponent(Mail)
                .addGap(38, 38, 38)
                .addComponent(Account)
                .addGap(45, 45, 45)
                .addComponent(Setting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel21.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-notification-40.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-warning-40.png"))); // NOI18N
        jLabel22.setText("Warning");

        jLabel23.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons9color-calendar-40 (1).png"))); // NOI18N
        jLabel23.setText("Date:");

        jLabel24.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calnder.png"))); // NOI18N
        jLabel24.setText("Month:");

        jLabel73.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invoice-41.png"))); // NOI18N
        jLabel73.setText("Invoice No:");

        Anlysis_Date.setEditable(false);
        Anlysis_Date.setBackground(new java.awt.Color(255, 255, 255));
        Anlysis_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Anlysis_Date.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Anlysis_Date.setLabelText("Date");

        jMonthChooser1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Searcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_SearchaActionPerformed(evt);
            }
        });

        Anlysis_Searcha1.setBackground(new java.awt.Color(255, 255, 255));
        Anlysis_Searcha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-40.png"))); // NOI18N
        Anlysis_Searcha1.setBorder(null);
        Anlysis_Searcha1.setOpaque(false);
        Anlysis_Searcha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_Searcha1Searcha3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addGap(21, 21, 21)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Anlysis_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Anlysis_Searcha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anlysis_Searcha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(29, 29, 29))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Anlysis_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel24))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Anlysis_Searcha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Anlysis_Searcha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Predict Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setText("January ");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setText("Month:");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setText("August");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setText("February");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setText("March");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setText("April");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setText("May");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel42.setText("June");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setText("July");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setText("September");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel46.setText("December");

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel47.setText("October");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel45.setText(" November ");

        Anlysis_Jan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_May.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Feb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_March.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_April.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_June.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Aug.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_July.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_sept.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_oct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Nov.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Dec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel48.setText("Predict Value:");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel49.setText("Product No:");

        Anlysis_productno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setText("Product Name:");

        Anlysis_ProductName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        Anlysis_Barcode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel51.setText("Bar Code:");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel52.setText("-To-");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel53.setText("Date:");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel54.setText("Date:");

        Anlysis_Datestart.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Date_End.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Anlysis_Add.setBackground(new java.awt.Color(0, 153, 153));
        Anlysis_Add.setText("Add");
        Anlysis_Add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Anlysis_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_AddActionPerformed(evt);
            }
        });

        Anlysis_Delete.setBackground(new java.awt.Color(0, 153, 153));
        Anlysis_Delete.setText("Delete");
        Anlysis_Delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Anlysis_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_DeleteActionPerformed(evt);
            }
        });

        Anlysis_Clear.setBackground(new java.awt.Color(0, 153, 153));
        Anlysis_Clear.setText("Clear");
        Anlysis_Clear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Anlysis_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_ClearActionPerformed(evt);
            }
        });

        Anlysis_Update.setBackground(new java.awt.Color(0, 153, 153));
        Anlysis_Update.setText("Update");
        Anlysis_Update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Anlysis_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anlysis_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anlysis_Jan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_Feb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_March, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Anlysis_April, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel35)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel39)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel40)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel41)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel42)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel43)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel37)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_May, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_June, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_July, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Anlysis_Aug, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Anlysis_sept, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_oct, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Anlysis_Nov, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Anlysis_Dec, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anlysis_productno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anlysis_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Anlysis_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anlysis_Datestart, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addGap(12, 12, 12)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Anlysis_Date_End, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(Anlysis_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Anlysis_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Anlysis_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anlysis_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Anlysis_Datestart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Anlysis_productno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Anlysis_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Anlysis_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Anlysis_Date_End, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anlysis_Jan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Feb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_March, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_May, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_April, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_June, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Aug, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_July, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_sept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_oct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Nov, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Dec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anlysis_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anlysis_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Predict Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        Predict_Table.setAutoCreateRowSorter(true);
        Predict_Table.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Predict_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product No", "Bar code", "Date Start", "Date End", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Predict_Table.setColumnSelectionAllowed(true);
        Predict_Table.getTableHeader().setReorderingAllowed(false);
        Predict_Table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Predict_TableMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(Predict_Table);
        Predict_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Annual Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        Annual_Table.setAutoCreateRowSorter(true);
        Annual_Table.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Annual_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Product No", "Year", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Annual_Table.getTableHeader().setReorderingAllowed(false);
        Annual_Table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Annual_TableMouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(Annual_Table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(zGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1325, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(zGradient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu13.setBorder(null);
        jMenu13.setText("File  ");
        jMenu13.setAlignmentX(0.7F);
        jMenu13.setAutoscrolls(true);
        jMenu13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenu13.setIconTextGap(10);
        jMenu13.setMinimumSize(new java.awt.Dimension(70, 23));

        jMenu14.setText("New Model");
        jMenu14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem7.setText("Stock Add");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem7);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Purchase order");
        jMenu14.add(jMenuItem2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Delivery Order");
        jMenu14.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("Purchase Order");
        jMenu14.add(jMenuItem9);

        jMenu13.add(jMenu14);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Open File");
        jMenu13.add(jMenuItem3);
        jMenu13.add(jSeparator2);

        jMenuItem4.setText("jMenuItem4");
        jMenu13.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu13.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu13.add(jMenuItem6);

        jMenuBar1.add(jMenu13);

        jMenu4.setBorder(null);
        jMenu4.setText("Edit  ");
        jMenu4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu3.setBorder(null);
        jMenu3.setText("View");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu9.setBorder(null);
        jMenu9.setText("Customers");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu9);

        jMenu5.setBorder(null);
        jMenu5.setText("Category");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(null);
        jMenu6.setText("Locations");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(null);
        jMenu7.setText("Suppliers");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu7);

        jMenu11.setBorder(null);
        jMenu11.setText("Tools");
        jMenu11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu11.setIconTextGap(15);

        Logout_Login.setText("Login page");
        Logout_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_LoginActionPerformed(evt);
            }
        });
        jMenu11.add(Logout_Login);

        Logout1_CreatACcount.setText("Create Account");
        Logout1_CreatACcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1_CreatACcountActionPerformed(evt);
            }
        });
        jMenu11.add(Logout1_CreatACcount);

        jMenuBar1.add(jMenu11);

        jMenu10.setBorder(null);
        jMenu10.setText("Report");
        jMenu10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu10);

        jMenu12.setBorder(null);
        jMenu12.setText("Web Access");
        jMenu12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu12);

        jMenu8.setBorder(null);
        jMenu8.setText("Help");
        jMenu8.setFocusPainted(true);
        jMenu8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        setVisible(false);
        new Main_Page().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_HomeMouseClicked

    private void Stock_AnlysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_AnlysisMouseClicked
        setVisible(false);
        new SIteam_Adding_Anlysis().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Stock_AnlysisMouseClicked

    private void Stock_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_InfoMouseClicked
        setVisible(false);
        new Stock_Info().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Stock_InfoMouseClicked

    private void StockAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockAddMouseClicked
       setVisible(false);
        new Stock_Add().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_StockAddMouseClicked

    private void MailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailMouseClicked
        setVisible(false);
        new Mail().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MailMouseClicked

    private void Logout_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_LoginActionPerformed
        setVisible(false);
        new Login_Page().setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_Logout_LoginActionPerformed

    private void Logout1_CreatACcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1_CreatACcountActionPerformed
        setVisible(false);
        new KCreate_Page().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Logout1_CreatACcountActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void Anlysis_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_AddActionPerformed
     
        String proNo=Anlysis_productno.getText().trim(); 
        String proName=Anlysis_ProductName.getText().trim();   
        String Barcode=Anlysis_Barcode.getText().trim(); 
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       
         int jan=(int)Anlysis_Jan.getValue();
         int feb=(int)Anlysis_Feb.getValue();
         int March=(int)Anlysis_March.getValue();   
         int Apri=(int)Anlysis_April.getValue();
         int May=(int)Anlysis_May.getValue();
         int June=(int)Anlysis_June.getValue();
         int July=(int)Anlysis_July.getValue();
         int Aug=(int)Anlysis_Aug.getValue();
         int sept=(int)Anlysis_sept.getValue();
         int oct=(int)Anlysis_oct.getValue();
         int Nov=(int)Anlysis_Nov.getValue();
         int Dec=(int)Anlysis_Dec.getValue();  
         
         int Total=jan+feb+March+Apri+May+June+July+Aug+sept+oct+Nov+Dec;
        try {
            String Predict_Start = sdf.format(Anlysis_Datestart.getDate()); 
           String Predict_End= sdf.format(Anlysis_Date_End.getDate());
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection(sqlcon, user, pass);
            pst = con.prepareStatement("INSERT INTO  rushi.anlysis values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, proNo);
            pst.setString(2, proName);
            pst.setString(3, Barcode);
            pst.setString(4, Predict_Start);
            pst.setString(5, Predict_End);
            pst.setInt(6, jan);
            pst.setInt(7, feb);       
            pst.setInt(8, March);
            pst.setInt(9, Apri );                            
            pst.setInt(10, May);
            pst.setInt(11, June);
            pst.setInt(12, July);
            pst.setInt(13, Aug);
            pst.setInt(14, sept);
            pst.setInt(15, oct);
            pst.setInt(16, Nov);
            pst.setInt(17, Dec);
            pst.setInt(18, Total);
         
            pst.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Successfully Add Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            
            
         Anlysis_productno.setText(" ");
         Anlysis_ProductName.setText(" ");
        Anlysis_Barcode.setText(" ");     
        Anlysis_Datestart.setDate(null);
       Anlysis_Date_End.setDate(null);
        Anlysis_Jan.setValue(0);
        Anlysis_Feb.setValue(0);
        Anlysis_March.setValue(0);   
        Anlysis_April.setValue(0);
        Anlysis_May.setValue(0);
        Anlysis_June.setValue(0);
        Anlysis_July.setValue(0);
        Anlysis_Aug.setValue(0);
        Anlysis_sept.setValue(0);
        Anlysis_oct.setValue(0);
        Anlysis_Nov.setValue(0);
       Anlysis_Dec.setValue(0);  

        }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         
                  
                  
         
    }//GEN-LAST:event_Anlysis_AddActionPerformed

    private void Anlysis_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_DeleteActionPerformed

    String proName=Anlysis_ProductName.getText().trim();   
        
        try {

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = java.sql.DriverManager.getConnection(sqlcon, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM  rushi.anlysis  WHERE Anlysis_proName='" + proName + "' ");
                        ps.executeUpdate();

                        JOptionPane.showMessageDialog(rootPane, "Successfully Delete Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                      

        }
catch(Exception e)
{
    e.printStackTrace();
}


    }//GEN-LAST:event_Anlysis_DeleteActionPerformed

    private void Anlysis_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_ClearActionPerformed
         Anlysis_Jan.setValue(0);
        Anlysis_Feb.setValue(0);
        Anlysis_March.setValue(0);   
        Anlysis_April.setValue(0);
        Anlysis_May.setValue(0);
        Anlysis_June.setValue(0);
        Anlysis_July.setValue(0);
        Anlysis_Aug.setValue(0);
        Anlysis_sept.setValue(0);
        Anlysis_oct.setValue(0);
        Anlysis_Nov.setValue(0);
       Anlysis_Dec.setValue(0);  
    }//GEN-LAST:event_Anlysis_ClearActionPerformed

    private void Anlysis_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_UpdateActionPerformed
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       
       String proNo=Anlysis_productno.getText().trim();  
        String proName=Anlysis_ProductName.getText().trim();     
        String Barcode=Anlysis_Barcode.getText().trim(); 
         int jan=(int)Anlysis_Jan.getValue();
         int feb=(int)Anlysis_Feb.getValue();
         int March=(int)Anlysis_March.getValue();   
         int Apri=(int)Anlysis_April.getValue();
         int May=(int)Anlysis_May.getValue();
         int June=(int)Anlysis_June.getValue();
         int July=(int)Anlysis_July.getValue();
         int Aug=(int)Anlysis_Aug.getValue();
         int sept=(int)Anlysis_sept.getValue();
         int oct=(int)Anlysis_oct.getValue();
         int Nov=(int)Anlysis_Nov.getValue();
         int Dec=(int)Anlysis_Dec.getValue();  
         
        
           int Total=jan+feb+March+Apri+May+June+July+Aug+sept+oct+Nov+Dec;
        
        
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection(sqlcon, user, pass);

            String prdicstart= sdf.format(Anlysis_Datestart.getDate());   
            String prdicend = sdf.format(Anlysis_Date_End.getDate());

            PreparedStatement pst1 = con.prepareStatement("update   rushi.anlysis set Anlysis_proName=?, Anlysis_barcode=?,Anlysis_prodate=?,Anlysis_prodateend=?, Anlysis_Jan=?,Anlysis_Feb=?,Anlysis_March=?,Anlysis_April=?,Anlysis_May=?,Anlysis_June=?,Anlysis_July=?,Anlysis_Aug=?,Anlysis_Sept=?,Anlysis_Oct=?,Anlysis_Nov=?,Anlysis_Dec=?,Anlysis_Total=? where Anlysis_proNo=?");

             pst1.setString(1, proNo);
            pst1.setString(2, proName);
            pst1.setString(3, Barcode);
            pst1.setString(4, prdicstart);
            pst1.setString(5, prdicend);
            pst1.setInt(6, jan);                      
            pst1.setInt(7, feb);       
            pst1.setInt(8, March);
            pst1.setInt(9, Apri );                            
            pst1.setInt(10, May);
            pst1.setInt(11, June);
            pst1.setInt(12, July);
            pst1.setInt(13, Aug);
            pst1.setInt(14, sept);
            pst1.setInt(15, oct);
            pst1.setInt(16, Nov);
            pst1.setInt(17, Dec);
            pst1.setInt(18, Total);
         

            int i=pst1.executeUpdate();
            System.out.println("record update= "+i);

            JOptionPane.showMessageDialog(rootPane, "Successfully Update Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

       
        } 
          catch(Exception e)
          { 
              e.printStackTrace();
              
          }
    }//GEN-LAST:event_Anlysis_UpdateActionPerformed

    private void Predict_TableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Predict_TableMouseMoved
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select * from  rushi.anlysis  ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Predict_Table.getModel();
            D1.setRowCount(0);
            if (rs.next()==true)
            {
                Vector v=new Vector();
                for (int i = 0; i <=n; i++)
                {

                                                 v.add(rs.getString(1));
                                                 v.add(rs.getString(2));
                                                 v.add(rs.getString(3));
                                                 v.add(rs.getString(4));
                                                 v.add(rs.getString(5));
                                                 v.add(rs.getString(6));
                                                 v.add(rs.getString(7));
                                                 v.add(rs.getString(8));
                                                 v.add(rs.getString(9));
                                                 v.add(rs.getString(10));
                                                 v.add(rs.getString(11));
                                                 v.add(rs.getString(12));
                                                 v.add(rs.getString(13));
                                                 v.add(rs.getString(14));
                                                 v.add(rs.getString(15));
                                                 v.add(rs.getString(16));
                                                 v.add(rs.getString(17)); 
                                                 v.add(rs.getString(18));
                                              
                    
                    i++;
                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Predict_TableMouseMoved


    private void Anlysis_Searcha1Searcha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_Searcha1Searcha3ActionPerformed

            String Anlysis_Searcha11=Anlysis_Searcha.getText().trim();     


         
                try {


                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();

                    rs = pss.executeQuery(" select *from rushi.anlysis where Anlysis_proName='" + Anlysis_Searcha11 + "' ");    // select* from rushi where name regexp '[jks]'

                    if (rs.next()==false)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Product Name not found...", "failure", JOptionPane.ERROR_MESSAGE);

                    }else
                    {
                        Anlysis_productno.setText(rs.getString(1));
                        Anlysis_ProductName.setText(rs.getString(2));
                        Anlysis_Barcode.setText(rs.getString(3));
                        Anlysis_Datestart.setDate(rs.getDate(4));
                        Anlysis_Date_End.setDate(rs.getDate(5));
                        Anlysis_Jan.setValue(Integer.toString(6));
                        Anlysis_Feb.setValue(Integer.toString(7));
                        Anlysis_March.setValue(Integer.toString(8));
                        Anlysis_April.setValue(Integer.toString(9));
                        Anlysis_May.setValue(Integer.toString(10));
                        Anlysis_June.setValue(Integer.toString(11));
                        Anlysis_July.setValue(Integer.toString(12));       
                        Anlysis_Aug.setValue(Integer.toString(13));
                        Anlysis_sept.setValue(Integer.toString(14));
                        Anlysis_oct.setValue(Integer.toString(15));
                        Anlysis_Nov.setValue(Integer.toString(16));
                        Anlysis_Dec.setValue(Integer.toString(17));
                     
                          
                        

                        JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }

                } 
                
                catch (Exception ex) 
                {
//                    int IllegalArgumentException = 1;
//
//                    if (IllegalArgumentException == 1) {
//                        JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);
//
//                    } else {
//                        JOptionPane.showMessageDialog(rootPane, "Product Name Not Exist...", "Fail", JOptionPane.ERROR_MESSAGE);
//                    }

                    ex.printStackTrace();
                }
            

       
    }//GEN-LAST:event_Anlysis_Searcha1Searcha3ActionPerformed

    private void Anlysis_SearchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anlysis_SearchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anlysis_SearchaActionPerformed

    private void Annual_TableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Annual_TableMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Annual_TableMouseMoved

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIteam_Adding_Anlysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private com.mycompany.main.Button Anlysis_Add;
    private javax.swing.JSpinner Anlysis_April;
    private javax.swing.JSpinner Anlysis_Aug;
    private javax.swing.JTextField Anlysis_Barcode;
    private com.mycompany.main.Button Anlysis_Clear;
    private com.mycompany.main.TextField Anlysis_Date;
    private com.toedter.calendar.JDateChooser Anlysis_Date_End;
    private com.toedter.calendar.JDateChooser Anlysis_Datestart;
    private javax.swing.JSpinner Anlysis_Dec;
    private com.mycompany.main.Button Anlysis_Delete;
    private javax.swing.JSpinner Anlysis_Feb;
    private javax.swing.JSpinner Anlysis_Jan;
    private javax.swing.JSpinner Anlysis_July;
    private javax.swing.JSpinner Anlysis_June;
    private javax.swing.JSpinner Anlysis_March;
    private javax.swing.JSpinner Anlysis_May;
    private javax.swing.JSpinner Anlysis_Nov;
    private javax.swing.JTextField Anlysis_ProductName;
    private com.mycompany.rushi.TextFieldSearchOption Anlysis_Searcha;
    private javax.swing.JToggleButton Anlysis_Searcha1;
    private com.mycompany.main.Button Anlysis_Update;
    private javax.swing.JSpinner Anlysis_oct;
    private javax.swing.JTextField Anlysis_productno;
    private javax.swing.JSpinner Anlysis_sept;
    private javax.swing.JTable Annual_Table;
    private javax.swing.JLabel Home;
    private javax.swing.JMenuItem Logout1_CreatACcount;
    private javax.swing.JMenuItem Logout_Login;
    private javax.swing.JLabel Mail;
    private javax.swing.JTable Predict_Table;
    private javax.swing.JLabel Setting;
    private javax.swing.JLabel StockAdd;
    private javax.swing.JLabel Stock_Anlysis;
    private javax.swing.JLabel Stock_Info;
    private javax.swing.Box.Filler filler1;
    private com.mycompany.rushi.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private com.mycompany.rushi.ZGradient zGradient1;
    // End of variables declaration//GEN-END:variables
}
