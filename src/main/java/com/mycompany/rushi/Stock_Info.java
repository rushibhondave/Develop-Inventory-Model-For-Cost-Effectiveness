/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rushi;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.util.Units;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Stock_Info extends javax.swing.JFrame {

   private final String user = "root";
    private final String pass = "Rushikesh@5046";
    private final String sqlcon = "jdbc:mysql://localhost:3306/rushi";    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Stock_Info() {
        initComponents();
        showDate();
    }

     void showDate() {
        Date d = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-y");
        Report_Date.setText(s1.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Report_Date = new com.mycompany.main.TextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jSpinner1 = new javax.swing.JSpinner();
        Send = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        button14 = new com.mycompany.main.Button();
        jLabel31 = new javax.swing.JLabel();
        Report_Month = new javax.swing.JComboBox<>();
        Show_Date = new com.mycompany.main.Button();
        Report_ProductId = new javax.swing.JTextField();
        jTextField115 = new javax.swing.JTextField();
        barcode = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Report_Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryAtSite = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        zGradient1 = new com.mycompany.rushi.ZGradient();
        imageAvatar1 = new com.mycompany.rushi.ImageAvatar();
        Home = new javax.swing.JLabel();
        Stock_Anlysis = new javax.swing.JLabel();
        Stock_Info = new javax.swing.JLabel();
        StockAdd = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Setting = new javax.swing.JLabel();
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
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        Logout_Login = new javax.swing.JMenuItem();
        Logout1_CreatACcount = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        Report_Date.setEditable(false);
        Report_Date.setBackground(new java.awt.Color(255, 255, 255));
        Report_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Report_Date.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Report_Date.setLabelText("Date");

        jMonthChooser1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Report_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(35, 35, 35))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(Report_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Send.setBackground(new java.awt.Color(255, 255, 255));
        Send.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel30.setText("Product ID:");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setText("Product Name:");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setText("Bar Code:");

        button14.setBackground(new java.awt.Color(0, 153, 153));
        button14.setText("Export");
        button14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setText("Month:");

        Report_Month.setBackground(new java.awt.Color(255, 255, 255));
        Report_Month.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Report_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Report_Month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Report_MonthMouseClicked(evt);
            }
        });
        Report_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Report_MonthActionPerformed(evt);
            }
        });

        Show_Date.setBackground(new java.awt.Color(0, 153, 153));
        Show_Date.setText("Show Date");
        Show_Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Show_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_DateActionPerformed(evt);
            }
        });

        Report_ProductId.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jTextField115.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        barcode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout SendLayout = new javax.swing.GroupLayout(Send);
        Send.setLayout(SendLayout);
        SendLayout.setHorizontalGroup(
            SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendLayout.createSequentialGroup()
                .addComponent(jLabel30)
                .addGap(4, 4, 4)
                .addComponent(Report_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Report_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Show_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        SendLayout.setVerticalGroup(
            SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendLayout.createSequentialGroup()
                .addGroup(SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SendLayout.createSequentialGroup()
                        .addGroup(SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Report_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Report_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Show_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        Report_Table.setAutoCreateRowSorter(true);
        Report_Table.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        Report_Table.setForeground(new java.awt.Color(0, 0, 0));
        Report_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "product Id", "Product Name", "Quntity", "Month", "Width", "Length", "Weight", "Diamter", "Valid Date", "Barcode", "WarhouseName", "Warehouse Code", "Email Id", "Rack No", "Phone No", "Delivery  Date", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Report_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Report_Table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delivery Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        DeliveryAtSite.setAutoCreateRowSorter(true);
        DeliveryAtSite.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DeliveryAtSite.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Item Description", "Site Name", "Date", "Totol Available at site "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DeliveryAtSite.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DeliveryAtSite);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Annual Order Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Item Description", "Annual Total Quantity ", "Large Order Month", "Last Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1269, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(zGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(zGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Send, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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

        jMenu10.setBorder(null);
        jMenu10.setText("Report");
        jMenu10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu10);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        try {
            String filename = "D:/data.xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("new Sheet");
            float usernamecolumnwidth = 20f;
            float passwordcolumnwidth = 25f;
            float emailcolumnwidth = 28f;
            float accountcolumnwidth = 25f;

            int  usernam = (int) Math.floor((usernamecolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int password = (int) Math.floor((passwordcolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int  email = (int) Math.floor((emailcolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            int account = (int) Math.floor((accountcolumnwidth * Units.DEFAULT_CHARACTER_WIDTH + 5) / Units.DEFAULT_CHARACTER_WIDTH * 256);
            sheet.setColumnWidth(0, usernam);
            sheet.setColumnWidth(1, password);
            sheet.setColumnWidth(2, email);
            sheet.setColumnWidth(3, account);

            XSSFCellStyle style = workbook.createCellStyle();//cell style for header
            XSSFCellStyle style2 = workbook.createCellStyle();//cell style for result
            style.setAlignment(HorizontalAlignment.CENTER);//center align
            style.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THICK);//border bottom
            style.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THICK);//border top
            style.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THICK);//border left
            style.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THICK);//border right
            style2.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THIN);//border bottom
            style2.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THIN);//border top
            style2.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);//border left
            style2.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THIN);//border right
            style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
            XSSFFont font = workbook.createFont();
            XSSFFont font2 = workbook.createFont();
            font.setBold(true);
            font.setFontName("Tahoma");
            font.setFontHeightInPoints((short)14);
            font2.setFontName("Cambria");
            font2.setFontHeightInPoints((short)12);
            style.setFont(font);
            style2.setFont(font2);

            XSSFRow header = sheet.createRow((short) 0);
            header.createCell((short) 0).setCellValue("create_Username");
            header.createCell((short) 1).setCellValue("create_Passworrd");
            header.createCell((short) 2).setCellValue("create_email_id");
            header.createCell((short) 3).setCellValue("create_Account_Type");

            header.getCell(0).setCellStyle(style);
            header.getCell(1).setCellStyle(style);
            header.getCell(2).setCellStyle(style);
            header.getCell(3).setCellStyle(style);

            Class.forName("com.mysql.cj.jdbc.Driver");                                                           //Export data from Mysql to Excel
            con = DriverManager.getConnection(sqlcon, user, pass);

            String query = "SELECT * FROM rushi.create_account1";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet result = pst.executeQuery();
            int i = 1;
            while (result.next()) {
                XSSFRow resultrow = sheet.createRow((short) i);
                resultrow.createCell((short) 0).setCellValue(result.getInt(1));
                resultrow.createCell((short) 1).setCellValue(result.getString(2));
                resultrow.createCell((short) 2).setCellValue(result.getString(3));
                resultrow.createCell((short) 3).setCellValue(result.getString(4));

                resultrow.getCell(0).setCellStyle(style2);
                resultrow.getCell(1).setCellStyle(style2);
                resultrow.getCell(2).setCellStyle(style2);
                resultrow.getCell(3).setCellStyle(style2);

                i++;

            }

            try {
                FileOutputStream fileout = new FileOutputStream(filename);
                workbook.write(fileout);
                JOptionPane.showMessageDialog(null, "Excel File has been exported");

                Desktop.getDesktop().open(new File((filename)));
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_button14ActionPerformed

    private void Report_MonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Report_MonthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Report_MonthMouseClicked

    private void Report_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Report_MonthActionPerformed
        //
        String month=Report_Month.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();

            rs = pss.executeQuery("SELECT Stock_Product_id,Stock_Product_Name, Stock_Product_Quntitiy  WHERE Stock_Product_Month="+month+" FROM rushi.stock_add " );

            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Report_Table.getModel();
            D1.setRowCount(0);
            if (rs.next())
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

                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Report_MonthActionPerformed

    private void Show_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_DateActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();

            rs = pss.executeQuery(" select * from rushi.stock_add" ); //

            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Report_Table.getModel();
            D1.setRowCount(0);
            if (rs.next())
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

                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select delivery_description,delivery_loadingplace,delivery_date,delivery_collection from rushi.Delivery_order ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)DeliveryAtSite.getModel();
            D1.setRowCount(0);
            if (rs.next()==true)
            {
                Vector v=new Vector();
                for (int i = 0; i <=n; i++)
                {

                    v.add(rs.getString((1)));
                    v.add(rs.getString(2));
                    v.add(rs.getDate(3));
                    v.add(rs.getString(4));
                    //                             v.add(rs.getString(5));
                    //                             v.add(rs.getString(6));
                    //                             v.add(rs.getString(7));
                    //                             v.add(rs.getString(8));
                    //                             v.add(rs.getString(9));
                    //                             v.add(rs.getString(10));
                    //                             v.add(rs.getString(11));
                    //                             v.add(rs.getString(12));
                    //                             v.add(rs.getString(13));
                    //
                    i++;
                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Show_DateActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void Logout_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_LoginActionPerformed
          setVisible(false);
        new Login_Page().setVisible(rootPaneCheckingEnabled);
          
    }//GEN-LAST:event_Logout_LoginActionPerformed

    private void Logout1_CreatACcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1_CreatACcountActionPerformed
 setVisible(false);
        new KCreate_Page().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Logout1_CreatACcountActionPerformed

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
            java.util.logging.Logger.getLogger(Stock_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JTable DeliveryAtSite;
    private javax.swing.JLabel Home;
    private javax.swing.JMenuItem Logout1_CreatACcount;
    private javax.swing.JMenuItem Logout_Login;
    private javax.swing.JLabel Mail;
    private com.mycompany.main.TextField Report_Date;
    private javax.swing.JComboBox<String> Report_Month;
    private javax.swing.JTextField Report_ProductId;
    private javax.swing.JTable Report_Table;
    private javax.swing.JPanel Send;
    private javax.swing.JLabel Setting;
    private com.mycompany.main.Button Show_Date;
    private javax.swing.JLabel StockAdd;
    private javax.swing.JLabel Stock_Anlysis;
    private javax.swing.JLabel Stock_Info;
    private javax.swing.JTextField barcode;
    private com.mycompany.main.Button button14;
    private com.mycompany.rushi.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField115;
    private com.mycompany.rushi.ZGradient zGradient1;
    // End of variables declaration//GEN-END:variables
}
