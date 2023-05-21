/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rushi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rushikesh Bhondave
 */
public class Mail extends javax.swing.JFrame {

    /**
     * Creates new form Mail
     */
    public Mail() {
        initComponents();
        showDate() ;
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-y");
        mail1.setText(s1.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        zGradient1 = new com.mycompany.rushi.ZGradient();
        imageAvatar1 = new com.mycompany.rushi.ImageAvatar();
        Home = new javax.swing.JLabel();
        Stock_Anlysis = new javax.swing.JLabel();
        Stock_Info = new javax.swing.JLabel();
        StockAdd = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Setting = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Print_type = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Format_Type = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        Mail_Address = new javax.swing.JTextArea();
        textFieldSearchOption1 = new com.mycompany.rushi.TextFieldSearchOption();
        textFieldSearchOption2 = new com.mycompany.rushi.TextFieldSearchOption();
        jPanel36 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        textFieldSearchOption3 = new com.mycompany.rushi.TextFieldSearchOption();
        textFieldSearchOption4 = new com.mycompany.rushi.TextFieldSearchOption();
        Show_Date = new com.mycompany.main.Button();
        Show_Date1 = new com.mycompany.main.Button();
        Show_Date2 = new com.mycompany.main.Button();
        jPanel37 = new javax.swing.JPanel();
        jTextField104 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jTextField105 = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        jTextField106 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        jTextField107 = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        jTextField108 = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        Show_Date3 = new com.mycompany.main.Button();
        Show_Date4 = new com.mycompany.main.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        Reorder = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        mail1 = new com.mycompany.main.TextField();
        Reorder_Nav_Month4 = new com.toedter.calendar.JMonthChooser();
        jSpinner2 = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        Logout_Login = new javax.swing.JMenuItem();
        Logout1_CreatACcount = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                    .addComponent(Stock_Anlysis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
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
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(zGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(zGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setText("Reciver Name:");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setText("Sender Name:");

        Print_type.setBackground(new java.awt.Color(255, 255, 255));
        Print_type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Print_type.setForeground(new java.awt.Color(204, 204, 204));
        Print_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "PieChart", "Table(Month Info)", "Stock Add", "Purchase Add", "Deleivery Send", "Reorder ", "Purchase Info", "Stock Info", " ", " ", " " }));
        Print_type.setToolTipText("Account Typee");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel30.setText("choose Print:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setText("choose Format:");

        Format_Type.setBackground(new java.awt.Color(255, 255, 255));
        Format_Type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Format_Type.setForeground(new java.awt.Color(204, 204, 204));
        Format_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Ms Word ", "Pdf", "MS Excel", " ", " ", " " }));
        Format_Type.setToolTipText("Account Typee");

        Mail_Address.setColumns(20);
        Mail_Address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Mail_Address.setRows(5);
        Mail_Address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jScrollPane12.setViewportView(Mail_Address);

        textFieldSearchOption1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        textFieldSearchOption1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldSearchOption1.setHint("Sender Mail.....");

        textFieldSearchOption2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        textFieldSearchOption2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldSearchOption2.setHint("Reciver Mail....");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldSearchOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldSearchOption2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Print_type, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Format_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Print_type, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldSearchOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Format_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldSearchOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedule Send", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel159.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel159.setText("Reciver Name:");

        jLabel160.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel160.setText("Sender Name:");

        jLabel161.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N

        jLabel162.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel162.setText("Schedule Time:");

        textFieldSearchOption3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        textFieldSearchOption3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldSearchOption3.setHint("Sender Mail.....");

        textFieldSearchOption4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        textFieldSearchOption4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldSearchOption4.setHint("Reciver Mail....");

        Show_Date.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date.setText("Clear All");
        Show_Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Show_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DateActionPerformed(evt);
            }
        });

        Show_Date1.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date1.setText("Send");
        Show_Date1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Show_Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Date1ActionPerformed(evt);
            }
        });

        Show_Date2.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date2.setText("Schedule Send");
        Show_Date2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Show_Date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Date2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldSearchOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(jLabel159)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldSearchOption4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Show_Date1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(Show_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Show_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel160)
                    .addComponent(textFieldSearchOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSearchOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel161))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Request Send", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jTextField104.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel168.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel168.setText("Payment Method:");

        jLabel169.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel169.setText("Acc No:");

        jComboBox14.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel170.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N

        jLabel171.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel171.setText("Phone NO:");

        jTextField105.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel172.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel172.setText("Amount:");

        jTextField106.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel173.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel173.setText("Emil Id:");

        jTextField107.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel174.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel174.setText("GST:");

        jTextField108.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel175.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel175.setText("CGST:");

        jTextField109.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jTextField110.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel176.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel176.setText("Total:");

        Show_Date3.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date3.setText("Print");
        Show_Date3.setFocusCycleRoot(true);
        Show_Date3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Show_Date4.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date4.setText("Clear All");
        Show_Date4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField105)
                            .addComponent(jTextField106)
                            .addComponent(jTextField104))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Show_Date3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Show_Date4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel169)
                        .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel172)
                        .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel174))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel175)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel171)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel173)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel176)
                        .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Show_Date3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Show_Date4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel170))
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender Mail", "Receiver mail", "Choose File", "Choose Format"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Reorder.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Reorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-notification-40.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-warning-40.png"))); // NOI18N
        jLabel26.setText("Warning");

        jLabel42.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons9color-calendar-40 (1).png"))); // NOI18N
        jLabel42.setText("Date:");

        jLabel43.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calnder.png"))); // NOI18N
        jLabel43.setText("Month:");

        jLabel44.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invoice-41.png"))); // NOI18N
        jLabel44.setText("Invoice No:");

        mail1.setEditable(false);
        mail1.setBackground(new java.awt.Color(255, 255, 255));
        mail1.setToolTipText("");
        mail1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        mail1.setLabelText("Date");

        Reorder_Nav_Month4.setForeground(new java.awt.Color(255, 255, 255));
        Reorder_Nav_Month4.setAutoscrolls(true);
        Reorder_Nav_Month4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Nav_Month4.setOpaque(false);
        Reorder_Nav_Month4.setPreferredSize(new java.awt.Dimension(100, 100));

        jSpinner2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reorder_Nav_Month4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Reorder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                                .addComponent(Reorder_Nav_Month4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Reorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jSpinner2)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jMenu13.add(jSeparator1);

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

        jMenu8.setBorder(null);
        jMenu8.setText("Help");
        jMenu8.setFocusPainted(true);
        jMenu8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu8);

        jMenu12.setBorder(null);
        jMenu12.setText("Web Access");
        jMenu12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu12);

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

        jMenu7.setBorder(null);
        jMenu7.setText("Suppliers");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu7);

        jMenu6.setBorder(null);
        jMenu6.setText("Locations");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu5.setBorder(null);
        jMenu5.setText("Category");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void Show_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_DateActionPerformed
   
    }//GEN-LAST:event_Show_DateActionPerformed

    private void Show_Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Show_Date1ActionPerformed

    private void Show_Date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Date2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Show_Date2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JComboBox<String> Format_Type;
    private javax.swing.JLabel Home;
    private javax.swing.JMenuItem Logout1_CreatACcount;
    private javax.swing.JMenuItem Logout_Login;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextArea Mail_Address;
    private javax.swing.JComboBox<String> Print_type;
    private javax.swing.JLabel Reorder;
    private com.toedter.calendar.JMonthChooser Reorder_Nav_Month4;
    private javax.swing.JLabel Setting;
    private com.mycompany.main.Button Show_Date;
    private com.mycompany.main.Button Show_Date1;
    private com.mycompany.main.Button Show_Date2;
    private com.mycompany.main.Button Show_Date3;
    private com.mycompany.main.Button Show_Date4;
    private javax.swing.JLabel StockAdd;
    private javax.swing.JLabel Stock_Anlysis;
    private javax.swing.JLabel Stock_Info;
    private com.mycompany.rushi.ImageAvatar imageAvatar1;
    private javax.swing.JComboBox<String> jComboBox14;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField110;
    private com.mycompany.main.TextField mail1;
    private com.mycompany.rushi.TextFieldSearchOption textFieldSearchOption1;
    private com.mycompany.rushi.TextFieldSearchOption textFieldSearchOption2;
    private com.mycompany.rushi.TextFieldSearchOption textFieldSearchOption3;
    private com.mycompany.rushi.TextFieldSearchOption textFieldSearchOption4;
    private com.mycompany.rushi.ZGradient zGradient1;
    // End of variables declaration//GEN-END:variables
}
