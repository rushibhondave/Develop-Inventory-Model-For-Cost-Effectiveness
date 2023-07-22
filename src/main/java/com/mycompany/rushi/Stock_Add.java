
package com.mycompany.rushi;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


    //  java.util.Date date;

public class Stock_Add extends javax.swing.JFrame {

      private final String user = "root";
    private final String pass = "Rushikesh@5046";
    private final String sqlcon = "jdbc:mysql://localhost:3306/rushi";    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
 
    public Stock_Add() {
        initComponents();
        showDate();
    }
    
       void showDate() {
        Date d = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("dd-MMM-y");
        Stock_Date1.setText(s1.format(d));
        Purchase_Date5.setText(s1.format(d));
        Delivery_Navi_Date1.setText(s1.format(d));
        Reorder_Navi_Date2.setText(s1.format(d));
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel32 = new javax.swing.JPanel();
        ReoderMainTab = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        PurchaseOrderSearcha = new javax.swing.JToggleButton();
        Purchase_invoiceno5 = new javax.swing.JSpinner();
        Purchase_Date5 = new com.mycompany.main.TextField();
        Stock_Nav_Month6 = new com.toedter.calendar.JMonthChooser();
        Purchase_Order_Text = new com.mycompany.rushi.TextFieldSearchOption();
        Buyer_Purchase_Address = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        Purchaser_Companyname = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        Purchase_City = new javax.swing.JComboBox<>();
        jLabel89 = new javax.swing.JLabel();
        Purchase_Country = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        Purchase_Emailid = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        Purchase_Shipping_Method = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        Purchase_Deliveryterms = new javax.swing.JTextField();
        Purchase_State = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Purchase_Address = new javax.swing.JTextArea();
        jLabel203 = new javax.swing.JLabel();
        Purchase_Date = new com.toedter.calendar.JDateChooser();
        jLabel180 = new javax.swing.JLabel();
        Purchase_phone_no = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        Purchase_Pincode = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        Purchase_Remark = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        Purchase_Month = new javax.swing.JComboBox<>();
        jPanel34 = new javax.swing.JPanel();
        Purchase_Accno = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        Purchase_GST = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Payement_Description = new javax.swing.JTextArea();
        Purchase_Add = new com.mycompany.main.Button();
        Purchase_Clearall = new com.mycompany.main.Button();
        Purchase_Payement_Deleteall = new com.mycompany.main.Button();
        Purchase_Payement_Delete = new com.mycompany.main.Button();
        Purchase_Payement_Recipt = new com.mycompany.main.Button();
        Purchase_Paymentmethod = new javax.swing.JComboBox<>();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        Purchase_Holdername = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        Purchase_SubTotal = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        Purchase_GrandTotal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Purchase_Tabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        Purchase_Quntity1 = new javax.swing.JTextField();
        Purchase_Quntity2 = new javax.swing.JTextField();
        Purchase_Quntity3 = new javax.swing.JTextField();
        Purchase_Quntity4 = new javax.swing.JTextField();
        Purchase_Quntity7 = new javax.swing.JTextField();
        Purchase_Quntity5 = new javax.swing.JTextField();
        Purchase_Quntity6 = new javax.swing.JTextField();
        Purchase_Quntity8 = new javax.swing.JTextField();
        Purchase_Quntity9 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        Purchase_unitpri1 = new javax.swing.JTextField();
        Purchase_unitpri2 = new javax.swing.JTextField();
        Purchase_unitpri3 = new javax.swing.JTextField();
        Purchase_unitpri4 = new javax.swing.JTextField();
        Purchase_unitpri5 = new javax.swing.JTextField();
        Purchase_unitpri6 = new javax.swing.JTextField();
        Purchase_unitpri7 = new javax.swing.JTextField();
        Purchase_unitpri8 = new javax.swing.JTextField();
        Purchase_unitpri9 = new javax.swing.JTextField();
        Purchase_Product_Name1 = new javax.swing.JComboBox<>();
        Purchase_Product_Name3 = new javax.swing.JComboBox<>();
        Purchase_Product_Name2 = new javax.swing.JComboBox<>();
        Purchase_Product_Name4 = new javax.swing.JComboBox<>();
        Purchase_Product_Name5 = new javax.swing.JComboBox<>();
        Purchase_Product_Name6 = new javax.swing.JComboBox<>();
        Purchase_Product_Name7 = new javax.swing.JComboBox<>();
        Purchase_Product_Name8 = new javax.swing.JComboBox<>();
        Purchase_Product_Name9 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Delivery_Tabel1 = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Delivery_Search = new javax.swing.JToggleButton();
        Delivery_Navi_Date1 = new com.mycompany.main.TextField();
        Stock_Nav_Month3 = new com.toedter.calendar.JMonthChooser();
        jSpinner1 = new javax.swing.JSpinner();
        Delivery_Searcha = new com.mycompany.rushi.TextFieldSearchOption();
        jPanel26 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        Delivery_Clientname = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        Delivery_Drivername = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        Delivery_Companyname = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        Delivery_Loadingplace = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        Delivery_ClienID = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        Delivery_Vechial_name = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        Delivery_City = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        Delivery_State = new javax.swing.JComboBox<>();
        Delivery_Country = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        Delivery_date = new com.toedter.calendar.JDateChooser();
        jLabel103 = new javax.swing.JLabel();
        Delivery_Loadingecollection = new javax.swing.JTextField();
        Delivery_VechialNo = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        Delivery_Accountnaame = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        Delivery_paymentmethod = new javax.swing.JComboBox<>();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        Delivery_Holdernmae = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        Delivery_subtotal = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        Delivery_gst = new javax.swing.JTextField();
        Delivery_Grandtotal = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        Delivery_Add = new com.mycompany.main.Button();
        Delivery_update = new com.mycompany.main.Button();
        Delivery_ClearAll = new com.mycompany.main.Button();
        Delivery_delete = new com.mycompany.main.Button();
        Delivery_DeleteAll = new com.mycompany.main.Button();
        Delivery_Print = new com.mycompany.main.Button();
        jLabel199 = new javax.swing.JLabel();
        Delivery_mailid = new javax.swing.JTextField();
        jLabel204 = new javax.swing.JLabel();
        Delivery_Amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Delivery_Description = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        Reorder = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Reorder_Search1 = new javax.swing.JToggleButton();
        Reorder_Navi_Date2 = new com.mycompany.main.TextField();
        Reorder_Nav_Month4 = new com.toedter.calendar.JMonthChooser();
        jSpinner2 = new javax.swing.JSpinner();
        Reorder_Searcha1 = new com.mycompany.rushi.TextFieldSearchOption();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Reorder_Calculate = new com.mycompany.main.Button();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Reorder_Clear = new com.mycompany.main.Button();
        Reorder_Print = new com.mycompany.main.Button();
        Reorder_SaftyStock = new com.mycompany.rushi.TextFieldSearchOption();
        Reordring_Point = new com.mycompany.rushi.TextFieldSearchOption();
        Maxi_Daily_Usage = new javax.swing.JTextField();
        Average_Daily = new javax.swing.JTextField();
        Reorder_LeadTime = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Reorder_Table = new javax.swing.JTable();
        Stock_add = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Stock_table = new javax.swing.JTable();
        jPanel44 = new javax.swing.JPanel();
        STock_Warrning1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        Delivery_serach1 = new javax.swing.JToggleButton();
        Stock_invoiceno1 = new javax.swing.JSpinner();
        Stock_Nav_Month1 = new com.toedter.calendar.JMonthChooser();
        Stock_Date1 = new com.mycompany.main.TextField();
        jButton1 = new javax.swing.JButton();
        Sto_Search_Option1 = new com.mycompany.rushi.TextFieldSearchOption();
        jPanel36 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        Warhouse_Code = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        Warhouse_Rackno = new javax.swing.JTextField();
        Warhouse_name = new javax.swing.JTextField();
        Warhouse_emailid = new javax.swing.JTextField();
        Stock_Add3 = new com.mycompany.main.Button();
        Stock_Delete3 = new com.mycompany.main.Button();
        Stock_update3 = new com.mycompany.main.Button();
        Stock_Print3 = new com.mycompany.main.Button();
        Stock_DeleteAll3 = new com.mycompany.main.Button();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        Warhouse_Phoneno = new javax.swing.JTextField();
        Stock_ClearAll = new com.mycompany.main.Button();
        jScrollPane12 = new javax.swing.JScrollPane();
        Warhouse_Address = new javax.swing.JTextArea();
        Warhouse_DeliveryDate = new com.toedter.calendar.JDateChooser();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        Stock_id = new javax.swing.JTextField();
        Stock_name = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        Stock_Quntity = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Stock_Weight = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Stock_Diameter = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Stock_Length = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Stock_validdate = new com.toedter.calendar.JDateChooser();
        Stock_Width = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        Stock_BarCode = new javax.swing.JTextField();
        Stock_month = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
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
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        Logout_Login = new javax.swing.JMenuItem();
        Logout1_CreatACcount = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        ReoderMainTab.setBackground(new java.awt.Color(255, 255, 255));
        ReoderMainTab.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel60.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-notification-40.png"))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-warning-40.png"))); // NOI18N
        jLabel61.setText("Warning");

        jLabel62.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons9color-calendar-40 (1).png"))); // NOI18N
        jLabel62.setText("Date:");

        jLabel63.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calnder.png"))); // NOI18N
        jLabel63.setText("Month:");

        jLabel64.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invoice-41.png"))); // NOI18N
        jLabel64.setText("Invoice No:");

        PurchaseOrderSearcha.setBackground(new java.awt.Color(255, 255, 255));
        PurchaseOrderSearcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-40.png"))); // NOI18N
        PurchaseOrderSearcha.setBorder(null);
        PurchaseOrderSearcha.setOpaque(false);
        PurchaseOrderSearcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_Order_Searcha(evt);
            }
        });

        Purchase_invoiceno5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Purchase_invoiceno5.setAutoscrolls(true);

        Purchase_Date5.setEditable(false);
        Purchase_Date5.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Date5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Date5.setLabelText("Date");

        Stock_Nav_Month6.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Nav_Month6.setAutoscrolls(true);
        Stock_Nav_Month6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Nav_Month6.setOpaque(false);
        Stock_Nav_Month6.setPreferredSize(new java.awt.Dimension(100, 100));

        Purchase_Order_Text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Purchase_Order_Text.setColorOverlay2(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Purchase_invoiceno5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel62)
                .addGap(1, 1, 1)
                .addComponent(Purchase_Date5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock_Nav_Month6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Purchase_Order_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PurchaseOrderSearcha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_invoiceno5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(Purchase_Date5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Stock_Nav_Month6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PurchaseOrderSearcha, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(Purchase_Order_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Buyer_Purchase_Address.setBackground(new java.awt.Color(255, 255, 255));
        Buyer_Purchase_Address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        Buyer_Purchase_Address.setPreferredSize(new java.awt.Dimension(402, 402));

        jLabel69.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel69.setText("Company Name:");

        Purchaser_Companyname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel88.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel88.setText("City:");

        Purchase_City.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_City.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City", "Akola", "Amravati", "Buldana", "Yavatmal", "Washim", "Aurangabad", "Beed", "Jalna", "Osmanabad", "Nanded", "Latur", "Parbhani", "Hingoli", "Mumbai City", "Mumbai Suburban", "Thane", "Palghar", "Raigad", "Ratnagiri", "Sindhudurg", "Bhandara", "Chandrapur", "Gadchiroli", "Gondia", "Nagpur", "Wardha", "Ahmednagar", "Dhule", "Jalgaon", "Other", "Nandurbar", "Nashik", "Kolhapur", "Pune", "Sangli" }));

        jLabel89.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel89.setText("State:");

        Purchase_Country.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Country.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "India", "Afghanistan", "Albania", "Algeria", "American ", "Andorra", "Angola(UK)", "Antigua ", "Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda (UK)", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil British Virgin Islands (UK)", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon Canada", "Cape Verd", "Cayman ", "Chad", "Chile", "China", "Christmas ", "Cocos ", "Colombia ", "Comoros", "Other" }));

        jLabel90.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel90.setText("Country:");

        Purchase_Emailid.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Emailid.setName("r@gmail.com"); // NOI18N

        jLabel201.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel201.setText("Shipping Method:");

        jLabel202.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel202.setText("Email Id:");

        Purchase_Shipping_Method.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Shipping_Method.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel205.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel205.setText("Delivery terms:");

        Purchase_Deliveryterms.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        Purchase_State.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_State.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State", "Andhra Pradesh\t", "Arunachal Pradesh", "Assam\t", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana\t", "Himachal", "Dharamshala ", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Nagpur", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "Uttarakhand\t", "Dehradun", "West Bengal" }));

        Purchase_Address.setColumns(20);
        Purchase_Address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Address.setRows(5);
        Purchase_Address.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jScrollPane1.setViewportView(Purchase_Address);

        jLabel203.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel203.setText("Delivery Date:");

        Purchase_Date.setDateFormatString("y-MMM-dd");
        Purchase_Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel180.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel180.setText("Phone No:");

        Purchase_phone_no.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel179.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel179.setText("Pin Code:");

        Purchase_Pincode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel181.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel181.setText("Month:");

        Purchase_Remark.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Remark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_RemarkActionPerformed(evt);
            }
        });

        jLabel182.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel182.setText("Remark:");

        Purchase_Month.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Month.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout Buyer_Purchase_AddressLayout = new javax.swing.GroupLayout(Buyer_Purchase_Address);
        Buyer_Purchase_Address.setLayout(Buyer_Purchase_AddressLayout);
        Buyer_Purchase_AddressLayout.setHorizontalGroup(
            Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchaser_Companyname)
                    .addComponent(Purchase_Emailid)
                    .addComponent(Purchase_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchase_Shipping_Method, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(Purchase_Deliveryterms)
                    .addComponent(Purchase_phone_no))
                .addGap(26, 26, 26)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchase_Country, 0, 1, Short.MAX_VALUE)
                    .addComponent(Purchase_City, 0, 1, Short.MAX_VALUE)
                    .addComponent(Purchase_State, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Purchase_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buyer_Purchase_AddressLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buyer_Purchase_AddressLayout.createSequentialGroup()
                                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Purchase_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buyer_Purchase_AddressLayout.createSequentialGroup()
                                .addComponent(jLabel182)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Purchase_Remark, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Buyer_Purchase_AddressLayout.setVerticalGroup(
            Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Purchase_City, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88)
                            .addComponent(jLabel179)
                            .addComponent(Purchase_Pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Purchase_State, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel89))
                            .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel181)
                                .addComponent(Purchase_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Purchase_phone_no, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Purchase_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel90))))
                            .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel182)
                                    .addComponent(Purchase_Remark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel205, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Purchase_Deliveryterms, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel201)
                            .addComponent(Purchase_Shipping_Method, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Buyer_Purchase_AddressLayout.createSequentialGroup()
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(Purchaser_Companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel202)
                            .addComponent(Purchase_Emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Buyer_Purchase_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Purchase_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 5, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Payment Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        Purchase_Accno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Accno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel146.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel146.setText("GST:");

        Purchase_GST.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_GST.setText("0.0");
        Purchase_GST.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Purchase_GST.setOpaque(false);

        jLabel156.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel156.setText("₹.");

        jLabel157.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel157.setText("Grand Total:");

        Payement_Description.setColumns(20);
        Payement_Description.setRows(5);
        Payement_Description.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jScrollPane13.setViewportView(Payement_Description);

        Purchase_Add.setBackground(new java.awt.Color(0, 153, 153));
        Purchase_Add.setText("Order");
        Purchase_Add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_AddActionPerformed(evt);
            }
        });

        Purchase_Clearall.setBackground(new java.awt.Color(0, 153, 153));
        Purchase_Clearall.setText("Clear  All");
        Purchase_Clearall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_ClearallActionPerformed(evt);
            }
        });

        Purchase_Payement_Deleteall.setBackground(new java.awt.Color(0, 153, 153));
        Purchase_Payement_Deleteall.setText("Delete order");
        Purchase_Payement_Deleteall.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Payement_Deleteall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_Payement_DeleteallActionPerformed(evt);
            }
        });

        Purchase_Payement_Delete.setBackground(new java.awt.Color(0, 153, 153));
        Purchase_Payement_Delete.setText("Delete");
        Purchase_Payement_Delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Payement_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_Payement_DeleteActionPerformed(evt);
            }
        });

        Purchase_Payement_Recipt.setBackground(new java.awt.Color(0, 153, 153));
        Purchase_Payement_Recipt.setText("Receipt");
        Purchase_Payement_Recipt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Payement_Recipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_Payement_ReciptActionPerformed(evt);
            }
        });

        Purchase_Paymentmethod.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Paymentmethod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Paymentmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Debit Card", "Credit Card", "Cash On Delivery", "EMI" }));
        Purchase_Paymentmethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_PaymentmethodActionPerformed(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel189.setText("Holder Name:");

        jLabel190.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel190.setText("Payment Method:");

        jLabel191.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel191.setText("Acc No:");

        Purchase_Holdername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Holdername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel150.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel150.setText("%.");

        jLabel148.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel148.setText("₹.");

        Purchase_SubTotal.setEditable(false);
        Purchase_SubTotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_SubTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Purchase_SubTotal.setOpaque(false);
        Purchase_SubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_SubTotalActionPerformed(evt);
            }
        });

        jLabel149.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel149.setText("Sub Total:");

        Purchase_GrandTotal.setEditable(false);
        Purchase_GrandTotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_GrandTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        Purchase_GrandTotal.setOpaque(false);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel191, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel189, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Purchase_Holdername, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(Purchase_Accno)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Purchase_Paymentmethod, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel157, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchase_GST, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(Purchase_SubTotal)
                    .addComponent(Purchase_GrandTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156)
                    .addComponent(jLabel150))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(Purchase_Clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Purchase_Payement_Deleteall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(Purchase_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Purchase_Payement_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Purchase_Payement_Recipt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Purchase_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Purchase_Payement_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Purchase_Payement_Deleteall, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Purchase_Clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Purchase_Payement_Recipt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel34Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel149)
                                .addComponent(jLabel156)
                                .addComponent(Purchase_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel34Layout.createSequentialGroup()
                                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel150))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel148)
                                        .addComponent(Purchase_GrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel34Layout.createSequentialGroup()
                                    .addComponent(Purchase_GST, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Purchase_Holdername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel189)))
                            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel191)
                                .addComponent(Purchase_Accno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Purchase_Paymentmethod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel190))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Purchase_Tabel.setAutoCreateRowSorter(true);
        Purchase_Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Delivery terms", "Description", "Month", "Qty", "GST", "Sub Total", "Grand Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Purchase_Tabel.setOpaque(false);
        Purchase_Tabel.getTableHeader().setReorderingAllowed(false);
        Purchase_Tabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Purchase_TabelMouseMoved(evt);
            }
        });
        jScrollPane4.setViewportView(Purchase_Tabel);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel87.setFont(new java.awt.Font("Dubai", 1, 19)); // NOI18N
        jLabel87.setText("Product Name:");

        jLabel83.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel83.setText("Quantity:");

        Purchase_Quntity1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity1.setText("0.0");
        Purchase_Quntity1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Purchase_Quntity1KeyReleased(evt);
            }
        });

        Purchase_Quntity2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity2.setText("0.0");

        Purchase_Quntity3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity3.setText("0.0");

        Purchase_Quntity4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity4.setText("0.0");

        Purchase_Quntity7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity7.setText("0.0");

        Purchase_Quntity5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity5.setText("0.0");

        Purchase_Quntity6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity6.setText("0.0");

        Purchase_Quntity8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity8.setText("0.0");

        Purchase_Quntity9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_Quntity9.setText("0.0");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setText("Unit Price:");

        Purchase_unitpri1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri1.setText("0.0");
        Purchase_unitpri1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri2.setText("0.0");
        Purchase_unitpri2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri3.setText("0.0");
        Purchase_unitpri3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri4.setText("0.0");
        Purchase_unitpri4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri5.setText("0.0");
        Purchase_unitpri5.setToolTipText("0");
        Purchase_unitpri5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri6.setText("0.0");
        Purchase_unitpri6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri7.setText("0.0");
        Purchase_unitpri7.setToolTipText("0");
        Purchase_unitpri7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri8.setText("0.0");
        Purchase_unitpri8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_unitpri9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Purchase_unitpri9.setText("0.0");
        Purchase_unitpri9.setToolTipText("");
        Purchase_unitpri9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Purchase_Product_Name1.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name1.setEditable(true);
        Purchase_Product_Name1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name3.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name3.setEditable(true);
        Purchase_Product_Name3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name2.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name2.setEditable(true);
        Purchase_Product_Name2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name4.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name4.setEditable(true);
        Purchase_Product_Name4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name5.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name5.setEditable(true);
        Purchase_Product_Name5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name6.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name6.setEditable(true);
        Purchase_Product_Name6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concret", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name7.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name7.setEditable(true);
        Purchase_Product_Name7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name8.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name8.setEditable(true);
        Purchase_Product_Name8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod" }));

        Purchase_Product_Name9.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_Product_Name9.setEditable(true);
        Purchase_Product_Name9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Purchase_Product_Name9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "No Iteam", "Concrete", "Iron", "Wires", "Steel", "Alloy", "Stone", "Brick", "Wood", "Rod", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel87)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Purchase_Quntity1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Purchase_Product_Name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri1))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Purchase_unitpri2)
                    .addComponent(Purchase_Quntity2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(Purchase_Product_Name2, 0, 1, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchase_Product_Name3, 0, 1, Short.MAX_VALUE)
                    .addComponent(Purchase_Quntity3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(Purchase_unitpri3))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Purchase_Quntity4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Purchase_Product_Name4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Purchase_Quntity5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Purchase_Product_Name5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri5))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Purchase_Product_Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Quntity6)
                    .addComponent(Purchase_unitpri6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Purchase_Quntity7)
                        .addComponent(Purchase_Product_Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Purchase_unitpri7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Purchase_unitpri8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Purchase_Quntity8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Purchase_Quntity9, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(Purchase_unitpri9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Purchase_Product_Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Purchase_Product_Name9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_Product_Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Purchase_Quntity2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Purchase_Quntity1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Purchase_Quntity3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_Quntity4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_Quntity5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_Quntity6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_Quntity7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Purchase_Quntity8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_Quntity9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(Purchase_unitpri1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_unitpri9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buyer_Purchase_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buyer_Purchase_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Purchase Send", jPanel30);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 32, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ReoderMainTab.addTab("Purchase Order", jPanel31);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane8.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        Delivery_Tabel1.setAutoCreateRowSorter(true);
        Delivery_Tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Client Name", "Client Id", "Delivery Date", "Delivery Collection", "Delivery  Place", "Driver Name", "Driver Vechical No", "Driver Vechacal name", "City", "State", "Country", "Account Name", "Holder Name", "PayMethod", "Mail", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Delivery_Tabel1.setOpaque(false);
        Delivery_Tabel1.getTableHeader().setReorderingAllowed(false);
        Delivery_Tabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Delivery_Tabel1MouseMoved(evt);
            }
        });
        jScrollPane5.setViewportView(Delivery_Tabel1);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-notification-40.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-warning-40.png"))); // NOI18N
        jLabel20.setText("Warning");

        jLabel35.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons9color-calendar-40 (1).png"))); // NOI18N
        jLabel35.setText("Date:");

        jLabel36.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calnder.png"))); // NOI18N
        jLabel36.setText("Month:");

        jLabel37.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invoice-41.png"))); // NOI18N
        jLabel37.setText("Invoice No:");

        Delivery_Search.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-40.png"))); // NOI18N
        Delivery_Search.setBorder(null);
        Delivery_Search.setOpaque(false);
        Delivery_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_SearchActionPerformed(evt);
            }
        });

        Delivery_Navi_Date1.setEditable(false);
        Delivery_Navi_Date1.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_Navi_Date1.setToolTipText("");
        Delivery_Navi_Date1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Delivery_Navi_Date1.setLabelText("Date");

        Stock_Nav_Month3.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Nav_Month3.setAutoscrolls(true);
        Stock_Nav_Month3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Nav_Month3.setOpaque(false);
        Stock_Nav_Month3.setPreferredSize(new java.awt.Dimension(100, 100));

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Delivery_Searcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Delivery_Searcha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delivery_Navi_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock_Nav_Month3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Delivery_Searcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delivery_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Delivery_Navi_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(Stock_Nav_Month3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delivery_Searcha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delivery_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jSpinner1)
                        .addGap(24, 24, 24))))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), " Venue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel95.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel95.setText("Company Name:");

        Delivery_Clientname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel96.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel96.setText("Client Name:");

        Delivery_Drivername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel97.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel97.setText("Client Id:");

        Delivery_Companyname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel98.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel98.setText("Loading Place:");

        Delivery_Loadingplace.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel99.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel99.setText("Loading collection :");

        Delivery_ClienID.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel101.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel101.setText("Driver name:");

        jLabel102.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel102.setText("Vechical No:");

        Delivery_Vechial_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel104.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel104.setText("Vechical Name:");

        Delivery_City.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_City.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City", "Akola", "Amravati", "Buldana", "Yavatmal", "Washim", "Aurangabad", "Beed", "Jalna", "Osmanabad", "Nanded", "Latur", "Parbhani", "Hingoli", "Mumbai City", "Mumbai Suburban", "Thane", "Palghar", "Raigad", "Ratnagiri", "Sindhudurg", "Bhandara", "Chandrapur", "Gadchiroli", "Gondia", "Nagpur", "Wardha", "Ahmednagar", "Dhule", "Jalgaon", "Nandurbar", "Nashik", "Kolhapur", "Pune", "Sangli", "Other" }));

        jLabel91.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel91.setText("City:");

        jLabel92.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel92.setText("State:");

        Delivery_State.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_State.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State", "Andhra Pradesh\t", "Arunachal Pradesh", "Assam\t", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana\t", "Himachal", "Dharamshala ", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Nagpur", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "Uttarakhand\t", "Dehradun", "West Bengal" }));

        Delivery_Country.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_Country.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "India", "Afghanistan", "Albania", "Algeria", "American ", "Andorra", "Angola(UK)", "Antigua ", "Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda (UK)", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil British Virgin Islands (UK)", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon Canada", "Cape Verd", "Cayman ", "Chad", "Chile", "China", "Christmas ", "Cocos ", "Colombia ", "Comoros", "Other" }));

        jLabel93.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel93.setText("Country:");

        Delivery_date.setDateFormatString("y-MMM-dd");
        Delivery_date.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel103.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel103.setText("Delivery date:");

        Delivery_Loadingecollection.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        Delivery_VechialNo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Delivery_Clientname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(Delivery_Companyname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delivery_ClienID, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel103))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel99)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delivery_Loadingplace, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Delivery_Loadingecollection, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Delivery_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel102)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel101))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delivery_Vechial_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel91))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delivery_City, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delivery_State, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delivery_Country, 0, 1, Short.MAX_VALUE)))
                            .addComponent(jLabel92))
                        .addGap(199, 199, 199))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delivery_VechialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delivery_Drivername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_Companyname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel95)))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Delivery_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel101)
                                .addComponent(Delivery_Drivername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Delivery_Clientname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel102)
                                        .addComponent(Delivery_VechialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Delivery_Loadingecollection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_Vechial_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel104)))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_Loadingplace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel97)
                                    .addComponent(Delivery_ClienID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delivery_City, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delivery_State, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delivery_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel42.setPreferredSize(new java.awt.Dimension(10, 10));

        Delivery_Accountnaame.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel192.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel192.setText("Payment Method:");

        jLabel193.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel193.setText("Acc No:");

        Delivery_paymentmethod.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_paymentmethod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_paymentmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Cash Checks ", "Debit cards", "Credit cards ", "Mobile payments", "Electronic bank transfers" }));

        jLabel194.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N

        jLabel195.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel195.setText("Holder Name:");

        Delivery_Holdernmae.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel196.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel196.setText("Sub Total:");

        Delivery_subtotal.setEditable(false);
        Delivery_subtotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Delivery_subtotal.setOpaque(false);

        jLabel198.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel198.setText("GST:");

        Delivery_gst.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        Delivery_Grandtotal.setEditable(false);
        Delivery_Grandtotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Delivery_Grandtotal.setOpaque(false);

        jLabel200.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel200.setText("Grand Total:");

        Delivery_Add.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_Add.setText("Delivery");
        Delivery_Add.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_AddActionPerformed(evt);
            }
        });

        Delivery_update.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_update.setText("Update");
        Delivery_update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_updateActionPerformed(evt);
            }
        });

        Delivery_ClearAll.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_ClearAll.setText("Clear All");
        Delivery_ClearAll.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_ClearAllActionPerformed(evt);
            }
        });

        Delivery_delete.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_delete.setText("Delete");
        Delivery_delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_deleteActionPerformed(evt);
            }
        });

        Delivery_DeleteAll.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_DeleteAll.setText("Delete All");
        Delivery_DeleteAll.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_DeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_DeleteAllActionPerformed(evt);
            }
        });

        Delivery_Print.setBackground(new java.awt.Color(0, 153, 153));
        Delivery_Print.setText("Receipt");
        Delivery_Print.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delivery_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_PrintActionPerformed(evt);
            }
        });

        jLabel199.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel199.setText("Email Id:");

        Delivery_mailid.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel204.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel204.setText("Amount Spend:");

        Delivery_Amount.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("₹.");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("₹.");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("%.");

        Delivery_Description.setColumns(20);
        Delivery_Description.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Delivery_Description.setRows(5);
        Delivery_Description.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        Delivery_Description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane8.setViewportView(Delivery_Description);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel192)
                            .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Delivery_mailid)
                            .addComponent(Delivery_Accountnaame)
                            .addComponent(Delivery_Holdernmae)
                            .addComponent(Delivery_paymentmethod, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel200)
                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel204)
                    .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(Delivery_Grandtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Delivery_gst, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(Delivery_subtotal)
                            .addComponent(Delivery_Amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delivery_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delivery_ClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Delivery_Accountnaame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel193))
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel204)
                        .addComponent(Delivery_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(Delivery_Holdernmae, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delivery_paymentmethod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel194))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_Grandtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel200)
                                    .addComponent(Delivery_mailid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel199))))
                        .addGap(294, 294, 294))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel196)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel195)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Delivery_gst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel192, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel198))
                        .addGap(382, 382, 382))))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delivery_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_ClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delivery_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delivery_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delivery_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Supplier Send", jPanel23);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        ReoderMainTab.addTab("Delivery order ", jPanel9);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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

        Reorder_Search1.setBackground(new java.awt.Color(255, 255, 255));
        Reorder_Search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-40.png"))); // NOI18N
        Reorder_Search1.setBorder(null);
        Reorder_Search1.setOpaque(false);
        Reorder_Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reorder_Search1ActionPerformed(evt);
            }
        });

        Reorder_Navi_Date2.setEditable(false);
        Reorder_Navi_Date2.setBackground(new java.awt.Color(255, 255, 255));
        Reorder_Navi_Date2.setToolTipText("");
        Reorder_Navi_Date2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Reorder_Navi_Date2.setLabelText("Date");

        Reorder_Nav_Month4.setForeground(new java.awt.Color(255, 255, 255));
        Reorder_Nav_Month4.setAutoscrolls(true);
        Reorder_Nav_Month4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Nav_Month4.setOpaque(false);
        Reorder_Nav_Month4.setPreferredSize(new java.awt.Dimension(100, 100));

        jSpinner2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Reorder_Searcha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Reorder_Searcha1.setColorOverlay2(new java.awt.Color(0, 102, 102));

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
                .addComponent(Reorder_Navi_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reorder_Nav_Month4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reorder_Searcha1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reorder_Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Reorder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Reorder_Navi_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reorder_Searcha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Reorder_Nav_Month4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reorder_Search1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jSpinner2)
                        .addGap(24, 24, 24))))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "REORDER POINT CALCULATOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel7.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("LEAD TIME IN DAYS:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Average Daily Usage:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Your Safety Stock is:");

        Reorder_Calculate.setBackground(new java.awt.Color(0, 153, 153));
        Reorder_Calculate.setText("Calculate");
        Reorder_Calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reorder_CalculateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Your reorder point is:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Maximum Daily Usage:");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Reorder_Clear.setBackground(new java.awt.Color(0, 153, 153));
        Reorder_Clear.setText("Clear");
        Reorder_Clear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reorder_ClearActionPerformed(evt);
            }
        });

        Reorder_Print.setBackground(new java.awt.Color(0, 153, 153));
        Reorder_Print.setText("Recipt");
        Reorder_Print.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reorder_PrintActionPerformed(evt);
            }
        });

        Reorder_SaftyStock.setEditable(false);
        Reorder_SaftyStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Reorder_SaftyStock.setForeground(new java.awt.Color(153, 0, 0));
        Reorder_SaftyStock.setColorOverlay2(new java.awt.Color(0, 102, 102));
        Reorder_SaftyStock.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Reorder_SaftyStock.setHint("Ans..");
        Reorder_SaftyStock.setOpaque(false);

        Reordring_Point.setEditable(false);
        Reordring_Point.setForeground(new java.awt.Color(102, 0, 0));
        Reordring_Point.setColorOverlay2(new java.awt.Color(0, 102, 102));
        Reordring_Point.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Reordring_Point.setHint("Ans...");
        Reordring_Point.setOpaque(false);

        Maxi_Daily_Usage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Maxi_Daily_Usage.setToolTipText("Enter Product ID...");
        Maxi_Daily_Usage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Average_Daily.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Average_Daily.setToolTipText("Enter Product ID...");
        Average_Daily.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Reorder_LeadTime.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Reorder_LeadTime.setToolTipText("Enter Product ID...");
        Reorder_LeadTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Maxi_Daily_Usage, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(Average_Daily, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reorder_SaftyStock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(Reordring_Point, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reorder_LeadTime, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Reorder_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Reorder_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Reorder_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Maxi_Daily_Usage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Average_Daily, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reorder_LeadTime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reordring_Point, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reorder_SaftyStock, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reorder_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reorder_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reorder_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Description ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText(" Reorder point:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Whenever the item count reaches the reorder point, you get automatically notified and you know it is the right time to create a purchase order.");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Safety stock:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Safety stock is an additional quantity of an item held in the inventory to reduce the risk that the item will be out of stock.");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Maximum daily usage:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Maximum daily usage represents the highest sales volume of product you have sold during a period of time");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 0));
        jLabel27.setText("Average Daily Usage:");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 102));
        jLabel30.setText("The Average Daily Usage represents the amount of an item that is used on an average day");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 0, 0));
        jLabel33.setText("Lead time:");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 102));
        jLabel34.setText("The lead time is the amount of time that elapses between placing a purchase order and receiving products.");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Reorder_Table.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reorder_Table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Client Name", "Iteam Description", "Delivery Date ", "Deliver At Site"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Reorder_Table.getTableHeader().setReorderingAllowed(false);
        Reorder_Table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Reorder_TableMouseMoved(evt);
            }
        });
        jScrollPane6.setViewportView(Reorder_Table);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Optimize", jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ReoderMainTab.addTab("Reorder", jPanel4);

        Stock_add.setBackground(new java.awt.Color(255, 255, 255));
        Stock_add.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        Stock_table.setAutoCreateRowSorter(true);
        Stock_table.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        Stock_table.setForeground(new java.awt.Color(0, 0, 0));
        Stock_table.setModel(new javax.swing.table.DefaultTableModel(
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
        Stock_table.getTableHeader().setReorderingAllowed(false);
        Stock_table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Stock_tableMouseMoved(evt);
            }
        });
        jScrollPane3.setViewportView(Stock_table);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        STock_Warrning1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        STock_Warrning1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-warning-40.png"))); // NOI18N
        STock_Warrning1.setText("Warning");
        STock_Warrning1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STock_Warrning1STock_WarrningMouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons9color-calendar-40 (1).png"))); // NOI18N
        jLabel49.setText("Date:");

        jLabel52.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calnder.png"))); // NOI18N
        jLabel52.setText("Month:");

        jLabel72.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invoice-41.png"))); // NOI18N
        jLabel72.setText("Invoice No:");

        Delivery_serach1.setBackground(new java.awt.Color(255, 255, 255));
        Delivery_serach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-40.png"))); // NOI18N
        Delivery_serach1.setBorder(null);
        Delivery_serach1.setOpaque(false);
        Delivery_serach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_serach1Searcha3ActionPerformed(evt);
            }
        });

        Stock_invoiceno1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Stock_invoiceno1.setAutoscrolls(true);

        Stock_Nav_Month1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Nav_Month1.setAutoscrolls(true);
        Stock_Nav_Month1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Nav_Month1.setOpaque(false);
        Stock_Nav_Month1.setPreferredSize(new java.awt.Dimension(100, 100));

        Stock_Date1.setEditable(false);
        Stock_Date1.setBackground(new java.awt.Color(255, 255, 255));
        Stock_Date1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Date1.setLabelText("Date");
        Stock_Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Date1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/color-notification-40.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);

        Sto_Search_Option1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Sto_Search_Option1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock_invoiceno1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(STock_Warrning1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock_Nav_Month1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Sto_Search_Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delivery_serach1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Stock_invoiceno1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STock_Warrning1)))
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stock_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sto_Search_Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stock_Nav_Month1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delivery_serach1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Warehouse Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel160.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel160.setText("Warehouse Code:");

        jLabel161.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N

        jLabel162.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel162.setText("Warehouse Name:");

        Warhouse_Code.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel163.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel163.setText("Delivery Date :");

        jLabel164.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel164.setText(" Emil Id:");

        Warhouse_Rackno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Warhouse_Rackno.setToolTipText("");

        Warhouse_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        Warhouse_emailid.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Warhouse_emailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Warhouse_emailidActionPerformed(evt);
            }
        });

        Stock_Add3.setBackground(new java.awt.Color(12, 131, 144));
        Stock_Add3.setText("Add");
        Stock_Add3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Add3MouseExited(evt);
            }
        });
        Stock_Add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Add3Stock_AddActionPerformed(evt);
            }
        });

        Stock_Delete3.setBackground(new java.awt.Color(12, 131, 144));
        Stock_Delete3.setText("Delete");
        Stock_Delete3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Delete3ActionPerformed(evt);
            }
        });

        Stock_update3.setBackground(new java.awt.Color(12, 131, 144));
        Stock_update3.setText("Update");
        Stock_update3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_update3ActionPerformed(evt);
            }
        });

        Stock_Print3.setBackground(new java.awt.Color(12, 131, 144));
        Stock_Print3.setText("Report");
        Stock_Print3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_Print3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_Print3ActionPerformed(evt);
            }
        });

        Stock_DeleteAll3.setBackground(new java.awt.Color(12, 131, 144));
        Stock_DeleteAll3.setText("Delete All");
        Stock_DeleteAll3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_DeleteAll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_DeleteAll3ActionPerformed(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel165.setText("Sector/Rack No:");

        jLabel166.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel166.setText("Phone No:");

        Warhouse_Phoneno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Warhouse_Phoneno.setToolTipText("Enter Amount in Decimal");

        Stock_ClearAll.setBackground(new java.awt.Color(12, 131, 144));
        Stock_ClearAll.setText("Clear All");
        Stock_ClearAll.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_ClearAllActionPerformed(evt);
            }
        });

        Warhouse_Address.setColumns(20);
        Warhouse_Address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Warhouse_Address.setRows(5);
        Warhouse_Address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jScrollPane12.setViewportView(Warhouse_Address);

        Warhouse_DeliveryDate.setBackground(new java.awt.Color(255, 255, 255));
        Warhouse_DeliveryDate.setDateFormatString("y-MMM-dd");
        Warhouse_DeliveryDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Warhouse_DeliveryDate.setMaxSelectableDate(new java.util.Date(253370748694000L));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel162))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Warhouse_Code, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(Warhouse_name)
                    .addComponent(Warhouse_emailid))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel163)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel165)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Warhouse_Rackno)
                    .addComponent(Warhouse_Phoneno)
                    .addComponent(Warhouse_DeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(Stock_Add3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Stock_update3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                                .addComponent(Stock_ClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Stock_DeleteAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Stock_Print3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stock_Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Warhouse_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Warhouse_Rackno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel166)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel163, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(Warhouse_DeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel162)
                                    .addComponent(Warhouse_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel165))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel160)
                                    .addComponent(Warhouse_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Warhouse_emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Stock_ClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Stock_DeleteAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel36Layout.createSequentialGroup()
                                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Stock_Add3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Stock_update3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Stock_Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addComponent(Stock_Print3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel161)
                .addGap(39, 39, 39))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Stock Add", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel32.setText("Month");

        Stock_id.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_id.setToolTipText("Enter Product ID...");
        Stock_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Stock_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_name.setToolTipText("Enter Product Name...");
        Stock_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setText(" Width:");

        Stock_Quntity.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Quntity.setToolTipText("Enter Quntity in Whole No");
        Stock_Quntity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setText("Quantity:");

        Stock_Weight.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Weight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setText("Length:");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setText("Diameter:");

        Stock_Diameter.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Diameter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel51.setText("Add Date:");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel54.setText("Weight:");

        Stock_Length.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Length.setToolTipText("");
        Stock_Length.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setText("Product ID:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setText("Product Name:");

        Stock_validdate.setBackground(new java.awt.Color(255, 255, 255));
        Stock_validdate.setDateFormatString("y-MMM-dd");
        Stock_validdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Stock_Width.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_Width.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setText("BR Code:");

        Stock_BarCode.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Stock_BarCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        Stock_month.setBackground(new java.awt.Color(255, 255, 255));
        Stock_month.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Stock_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month ", "January ", "February", "March", "April", "May", "June", "July ", "August", "September", "October ", "November ", "December" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stock_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Stock_Length, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stock_Quntity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Stock_BarCode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(Stock_Weight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stock_Width, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(19, 19, 19)
                        .addComponent(Stock_Diameter, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(3, 3, 3)
                        .addComponent(Stock_validdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stock_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Stock_Quntity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stock_Width, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stock_BarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Stock_month, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Stock_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)
                        .addComponent(Stock_Length, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54)
                        .addComponent(Stock_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stock_Diameter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Stock_validdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        Stock_add.addTab("Stock Add", jPanel5);

        ReoderMainTab.addTab("Stock Order", Stock_add);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

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
                    .addComponent(Mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StockAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(zGradient1Layout.createSequentialGroup()
                        .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Stock_Anlysis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(Setting, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Stock_Info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        zGradient1Layout.setVerticalGroup(
            zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zGradient1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Home)
                .addGap(39, 39, 39)
                .addComponent(StockAdd)
                .addGap(40, 40, 40)
                .addComponent(Stock_Anlysis)
                .addGap(43, 43, 43)
                .addComponent(Stock_Info)
                .addGap(41, 41, 41)
                .addComponent(Mail)
                .addGap(38, 38, 38)
                .addComponent(Account)
                .addGap(45, 45, 45)
                .addComponent(Setting)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(zGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addComponent(zGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(ReoderMainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReoderMainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
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

        jMenu9.setBorder(null);
        jMenu9.setText("Customers");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Stock_ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_ClearAllActionPerformed

        Stock_id.setText("");
        Stock_name.setText("");
        Stock_Quntity.setText("");
        Stock_month.setSelectedIndex(0);
        Stock_Width.setText("");
        Stock_BarCode.setText("");
        Stock_Length.setText("");
        Stock_Weight.setText("");
        Stock_Diameter.setText("");
        Stock_BarCode.setText("");
        Stock_validdate.setCalendar(null);
        Warhouse_name.setText("");
        Warhouse_Code.setText("");
        Warhouse_emailid.setText("");
        Warhouse_Rackno.setText("");
        Warhouse_Phoneno.setText("");
        Warhouse_DeliveryDate.setCalendar(null);
        Warhouse_Address.setText("");
        Sto_Search_Option1.setText("");

        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);
    }//GEN-LAST:event_Stock_ClearAllActionPerformed

    private void Stock_DeleteAll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_DeleteAll3ActionPerformed

        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);

        try {
            int r1 = JOptionPane.showConfirmDialog(this, "Do you want Delete all data?", "confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (r1 == JOptionPane.YES_OPTION) {
                Stock_id.setText("");
                Stock_name.setText("");
                Stock_Quntity.setText("");
                Stock_month.setSelectedIndex(0);
                Stock_Width.setText("");
                Stock_Length.setText("");
                Stock_Weight.setText("");
                Stock_Diameter.setText("");
                Stock_BarCode.setText("");
                Warhouse_name.setText("");
                Warhouse_Code.setText("");
                Warhouse_emailid.setText("");
                Warhouse_Rackno.setText("");
                Warhouse_Phoneno.setText("");
                Warhouse_Address.setText("");
                Stock_validdate.setCalendar(null);
                Stock_validdate.setCalendar(null);

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    PreparedStatement ps = con.prepareStatement(" truncate table  Stock_Add ");
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Successfully Delete All Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                    Stock_id.setText("");
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {

                    JOptionPane.showMessageDialog(rootPane, "Already Delete All Data...", "Fail", JOptionPane.ERROR_MESSAGE);
                }

            } else if (r1 == JOptionPane.NO_OPTION) {
                System.exit(0);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Fail to Delete Data...", "Fail", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Stock_DeleteAll3ActionPerformed

    private void Stock_Print3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Print3ActionPerformed
        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);

        setVisible(false);
        new Stock_Info().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Stock_Print3ActionPerformed

    private void Stock_update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_update3ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String sto_id = Stock_id.getText().trim();
        String sto_name = Stock_name.getText().trim();
        String sto_quntity = Stock_Quntity.getText().trim();
        String sto_month = Stock_month.getSelectedItem().toString();
        String sto_width = Stock_Width.getText().trim();
        String sto_length = Stock_Length.getText().trim();
        String sto_wigth = Stock_Weight.getText().trim();
        String sto_dia = Stock_Diameter.getText().trim();
        String sto_brcode = Stock_BarCode.getText().trim();
        String sto_invoiceid1 = Stock_invoiceno1.getValue().toString();
        String war_name = Warhouse_name.getText().trim();
        String war_code = Warhouse_Code.getText().trim();
        String war_mailid = Warhouse_emailid.getText().trim();
        String war_rackno = Warhouse_Rackno.getText().trim();
        String war_phoneno = Warhouse_Phoneno.getText().trim();
        String war_address = Warhouse_Address.getText().trim();

        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);

        //        if (sto_id.isEmpty() || sto_name.isEmpty() || sto_quntity.isEmpty() || sto_size.isEmpty() || sto_width.isEmpty() || sto_length.isEmpty() || sto_wigth.isEmpty() || sto_dia.isEmpty() || sto_brcode.isEmpty()) {
            //            JOptionPane.showMessageDialog(rootPane, "Please Insert The Data...", "failure", JOptionPane.ERROR_MESSAGE);                            // all data insert cheak
            //        }
        //        else if (war_name.isEmpty() || war_code.isEmpty() || war_mailid.isEmpty() || war_rackno.isEmpty() || war_phoneno.isEmpty() || war_address.isEmpty()) {
            //            JOptionPane.showMessageDialog(rootPane, "Please Fill Warhouse Deteils...", "faillure", JOptionPane.ERROR_MESSAGE);                   // all data insert cheak(WARHOUSE DATA)
            //        }
        //
        //       else
        if (sto_id.isBlank()||sto_id.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Product Id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_id.setText("");
            Stock_id.grabFocus();
        }
        else  if (sto_name.isBlank()||sto_name.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert The Product name ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_name.setText("");
            Stock_name.grabFocus();
        }

        else if (sto_quntity.isBlank()||sto_quntity.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Quntity...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Quntity.setText("");
            Stock_Quntity.grabFocus();
        }
        else  if (Stock_month.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert month...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_month.grabFocus();
        }

        else if (sto_width.isBlank()||sto_width.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Width..", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Width.setText("");
            Stock_Width.grabFocus();
        }
        else  if (sto_length.isBlank()||sto_length.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert  Length...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Length.setText("");
            Stock_Length.grabFocus();
        }

        else if (sto_wigth.isBlank()||sto_wigth.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert  weight...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Weight.setText("");
            Stock_Weight.grabFocus();
        }
        else  if (sto_dia.isBlank()||sto_dia.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Diamter...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Diameter.setText("");
            Stock_Diameter.grabFocus();
        }

        else if (sto_brcode.isBlank()||sto_brcode.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Bar Code...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_BarCode.setText("");
            Stock_BarCode.grabFocus();
        }
        else  if (war_name.isBlank()||war_name.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Name...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_name.setText("");
            Warhouse_name.grabFocus();
        }

        else if (war_code.isBlank()||war_code.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse code...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_Code.setText("");
            Warhouse_Code.grabFocus();
        }
        else  if (war_mailid.isBlank()||war_mailid.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse mail id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_emailid.setText("");
            Warhouse_emailid.grabFocus();
        }

        else if (war_rackno.isBlank()||war_rackno.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Rack No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_Rackno.setText("");
            Warhouse_Rackno.grabFocus();
        }
        else  if (war_phoneno.isBlank()||war_phoneno.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Phono No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_Phoneno.setText("");
            Warhouse_Phoneno.grabFocus();
        }

        else if (war_address.isBlank()||war_address.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Address...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_id.setText("");
            Stock_id.grabFocus();
        }

        else if (Stock_invoiceno1.getValue() == null) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert The Invoice No...", "failure", JOptionPane.ERROR_MESSAGE);                                   //  data insert cheak(Invois no)

        } // ******************************************************************Data Validtion********************************************************
        else if (!sto_id.matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert Correct Stock_id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_id.setText("");
            Stock_id.grabFocus();
        } else if (!sto_quntity.matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Quntity...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Quntity.setText("");
            Stock_Quntity.grabFocus();
        } else if (!sto_width.matches("^[0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Width...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Width.setText("");
            Stock_Width.grabFocus();

        } else if (!sto_length.matches("^[0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Length...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Length.setText("");
            Stock_Length.grabFocus();

        } else if (!sto_wigth.matches("^[0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Weight...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Weight.setText("");
            Stock_Weight.grabFocus();

        } else if (!sto_dia.matches("^[0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Stock_Diameter ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Stock_Diameter.setText("");
            Stock_Diameter.grabFocus();

        } else if (!war_mailid.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please  Enter  The Correct Mail ID ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Warhouse_emailid.setText("");
            Warhouse_emailid.grabFocus();

        } else if (!war_phoneno.matches("^[0-9]*$")) {

            JOptionPane.showMessageDialog(rootPane, "Please Insert  Correcte Warehous Phoneno...", "failure", JOptionPane.ERROR_MESSAGE);
            Warhouse_Phoneno.setText("");
            Warhouse_Phoneno.grabFocus();
        } else if (war_phoneno.length() <= 9 || war_phoneno.length() >= 11) {

            JOptionPane.showMessageDialog(rootPane, "Please Enter The 10 Digit Phone No...", "failure", JOptionPane.ERROR_MESSAGE);
            Warhouse_Phoneno.setText("");
            Warhouse_Phoneno.grabFocus();
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);

            String war_deliveryDate = sdf.format(Warhouse_DeliveryDate.getDate());
            String sto_validdate = sdf.format(Stock_validdate.getDate());

            //  PreparedStatement pst1 = con.prepareStatement("update Stock_Add set Stock_Product_Name='" + sto_name + "', Stock_Product_Quntitiy='" + sto_quntity + "',Stock_Product_Size='" + sto_size + "',Stock_Product_widhth='" + sto_width + "', Stock_Product_Length='" + sto_length + "',Stock_Product_Weight='" + sto_wigth + "',Stock_Product_Diameter='" + sto_dia + "',Stock_Product_Valid_Date='" + sto_validdate + "',Stock_Product_BarCode='" + sto_brcode + "',War_Warhousename='" + war_name + "',War_Warhousecode='" + war_code + "',War_WarhouseEmail_Id='" + war_mailid + "',War_Warhouserackno='" + war_rackno + "',War_Warhousephoneno='" + war_phoneno + "',war_Warhouse_DeliveryDate='" + war_deliveryDate + "',War_Address='" + war_address + "',Stock_invoiceno='" + sto_invoiceid1 + "',where Stock_Product_id='" + sto_id + "'");

            PreparedStatement pst1 = con.prepareStatement("update Stock_Add set Stock_Product_Name=?, Stock_Product_Quntitiy=?,Stock_Product_Month=?,Stock_Product_widhth=?, Stock_Product_Length=?,Stock_Product_Weight=?,Stock_Product_Diameter=?,Stock_Product_Valid_Date=?,Stock_Product_BarCode=?,War_Warhousename=?,War_Warhousecode=?,War_WarhouseEmail_Id=?,War_Warhouserackno=?,War_Warhousephoneno=?,war_Warhouse_DeliveryDate=?,War_Address=? where Stock_Product_id=?");

            pst1.setString(1, sto_name);
            pst1.setString(2, sto_quntity);
            pst1.setString(3, sto_month);
            pst1.setString(4, sto_width);
            pst1.setString(5, sto_length);
            pst1.setString(6, sto_wigth);
            pst1.setString(7, sto_dia);
            pst1.setString(8, sto_validdate);
            pst1.setString(9, sto_brcode);
            pst1.setString(10, war_name);
            pst1.setString(11, war_code);
            pst1.setString(12, war_mailid);
            pst1.setString(13, war_rackno);
            pst1.setString(14, war_phoneno);
            pst1.setString(15, war_deliveryDate);
            pst1.setString(16, war_address);
            pst1.setString(17, sto_id);

            int i=pst1.executeUpdate();
            System.out.println("record update= "+i);

            JOptionPane.showMessageDialog(rootPane, "Successfully Update Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

            Stock_id.setText("");
            Stock_name.setText("");
            Stock_Quntity.setText("");
            Stock_month.setSelectedIndex(0);
            Stock_Width.setText("");
            Stock_BarCode.setText("");
            Stock_Length.setText("");
            Stock_Weight.setText("");
            Stock_Diameter.setText("");
            Stock_BarCode.setText("");
            Stock_validdate.setCalendar(null);
            Warhouse_name.setText("");
            Warhouse_Code.setText("");
            Warhouse_emailid.setText("");
            Warhouse_Rackno.setText("");
            Warhouse_Phoneno.setText("");
            Warhouse_DeliveryDate.setCalendar(null);
            Warhouse_Address.setText("");

        } catch (Exception e1)
        {

            e1.printStackTrace();
            //            int NullPointerException = 2;
            //
            //            if (NullPointerException  == 2)
            //            {
                //                JOptionPane.showMessageDialog(rootPane, "Error...", "faillure", JOptionPane.ERROR_MESSAGE);
                //
                //                Stock_id.setEditable(true);
                //                Stock_name.setEditable(true);
                //                Stock_Quntity.setEditable(true);
                //                Stock_month.setEditable(true);
                //                Stock_Width.setEditable(true);
                //                Stock_Length.setEditable(true);
                //                Stock_Weight.setEditable(true);
                //                Stock_Diameter.setEditable(true);
                //                Stock_BarCode.setEditable(true);
                //                Warhouse_name.setEditable(true);
                //                Warhouse_Code.setEditable(true);
                //                Warhouse_emailid.setEditable(true);
                //                Warhouse_Rackno.setEditable(true);
                //                Warhouse_Phoneno.setEditable(true);
                //                Warhouse_Address.setEditable(true);
                //            }

        }
    }//GEN-LAST:event_Stock_update3ActionPerformed

    private void Stock_Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Delete3ActionPerformed

        String sto_id = Stock_id.getText().trim();
        String sto_name = Stock_name.getText().trim();
        String sto_quntity = Stock_Quntity.getText().trim();
        String sto_month = Stock_month.getSelectedItem().toString();
        String sto_width = Stock_Width.getText().trim();
        String sto_length = Stock_Length.getText().trim();
        String sto_wigth = Stock_Weight.getText().trim();
        String sto_dia = Stock_Diameter.getText().trim();
        String sto_brcode = Stock_BarCode.getText().trim();
        String war_name = Warhouse_name.getText().trim();
        String war_code = Warhouse_Code.getText().trim();
        String war_mailid = Warhouse_emailid.getText().trim();
        String war_rackno = Warhouse_Rackno.getText().trim();
        String war_phoneno = Warhouse_Phoneno.getText().trim();
        String war_address = Warhouse_Address.getText().trim();

        int r1 = JOptionPane.showConfirmDialog(this, "Do you want Delete data?", "confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try {

            if (r1 == JOptionPane.YES_OPTION)
            {

                if (sto_id.isEmpty() || sto_id.isBlank()) {

                    JOptionPane.showMessageDialog(rootPane, "Only Insert A Stock Id And Try Again...", "failure", JOptionPane.ERROR_MESSAGE);                                               //  data valdition cheak
                    Stock_id.setText("");
                    Stock_id.grabFocus();

                    Stock_name.setText("");
                    Stock_Quntity.setText("");
                    Stock_month.setSelectedIndex(0);
                    Stock_Width.setText("");
                    Stock_Length.setText("");
                    Stock_Weight.setText("");
                    Stock_Diameter.setText("");
                    Stock_BarCode.setText("");
                    Warhouse_name.setText("");
                    Warhouse_Code.setText("");
                    Warhouse_emailid.setText("");
                    Warhouse_Rackno.setText("");
                    Warhouse_Phoneno.setText("");
                    Warhouse_Address.setText("");
                    Stock_validdate.setCalendar(null);
                    Warhouse_DeliveryDate.setCalendar(null);

                    Stock_name.setEditable(false);
                    Stock_Quntity.setEditable(false);
                    Stock_month.setEditable(false);
                    Stock_Width.setEditable(false);
                    Stock_Length.setEditable(false);
                    Stock_Weight.setEditable(false);
                    Stock_Diameter.setEditable(false);
                    Stock_BarCode.setEditable(false);
                    Warhouse_name.setEditable(false);
                    Warhouse_Code.setEditable(false);
                    Warhouse_emailid.setEditable(false);
                    Warhouse_Rackno.setEditable(false);
                    Warhouse_Phoneno.setEditable(false);
                    Warhouse_Address.setEditable(false);

                } else if (sto_name.length() >= 1 || sto_quntity.length() >= 1 ||  sto_width.length() >= 1 || sto_length.length() >= 1 || sto_wigth.length() >= 1 || sto_dia.length() >= 1 || sto_brcode.length() >= 1 || war_name.length() >= 1 || war_code.length() >= 1 || war_mailid.length() >= 1 || war_rackno.length() >= 1 || war_phoneno.length() >= 1 || war_address.length() >= 1) {

                    JOptionPane.showMessageDialog(rootPane, "Click For Clear Textfield And Try Again....", "failure", JOptionPane.ERROR_MESSAGE);

                    Stock_name.setText("");
                    Stock_Quntity.setText("");
                    Stock_month.setSelectedIndex(0);
                    Stock_Width.setText("");
                    Stock_Length.setText("");
                    Stock_Weight.setText("");
                    Stock_Diameter.setText("");
                    Stock_BarCode.setText("");
                    Warhouse_name.setText("");
                    Warhouse_Code.setText("");
                    Warhouse_emailid.setText("");
                    Warhouse_Rackno.setText("");
                    Warhouse_Phoneno.setText("");
                    Warhouse_Address.setText("");
                    Stock_validdate.setCalendar(null);
                    Warhouse_DeliveryDate.setCalendar(null);

                    Stock_name.setEditable(false);
                    Stock_Quntity.setEditable(false);
                    Stock_month.setEditable(false);
                    Stock_Width.setEditable(false);
                    Stock_Length.setEditable(false);
                    Stock_Weight.setEditable(false);
                    Stock_Diameter.setEditable(false);
                    Stock_BarCode.setEditable(false);
                    Warhouse_name.setEditable(false);
                    Warhouse_Code.setEditable(false);
                    Warhouse_emailid.setEditable(false);
                    Warhouse_Rackno.setEditable(false);
                    Warhouse_Phoneno.setEditable(false);
                    Warhouse_Address.setEditable(false);

                } else {

                    try {

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection(sqlcon, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM Stock_Add  WHERE Stock_Product_id='" + sto_id + "' ");
                        ps.executeUpdate();

                        JOptionPane.showMessageDialog(rootPane, "Successfully Delete Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                        Stock_id.setText("");

                        Stock_id.setEditable(true);
                        Stock_name.setEditable(true);
                        Stock_Quntity.setEditable(true);
                        Stock_month.setEditable(true);
                        Stock_Width.setEditable(true);
                        Stock_Length.setEditable(true);
                        Stock_Weight.setEditable(true);
                        Stock_Diameter.setEditable(true);
                        Stock_BarCode.setEditable(true);
                        Warhouse_name.setEditable(true);
                        Warhouse_Code.setEditable(true);
                        Warhouse_emailid.setEditable(true);
                        Warhouse_Rackno.setEditable(true);
                        Warhouse_Phoneno.setEditable(true);
                        Warhouse_Address.setEditable(true);
                    }
                    catch (Exception e)
                    {
                        int SQLIntegrityConstraintViolationException = 1;
                        int NullPointerException = 2;

                        if (SQLIntegrityConstraintViolationException == 1) {
                            JOptionPane.showMessageDialog(rootPane, "Product Id Not Exist...", "faillure", JOptionPane.ERROR_MESSAGE);

                            Stock_id.setEditable(true);
                            Stock_name.setEditable(true);
                            Stock_Quntity.setEditable(true);
                            Stock_month.setEditable(true);
                            Stock_Width.setEditable(true);
                            Stock_Length.setEditable(true);
                            Stock_Weight.setEditable(true);
                            Stock_Diameter.setEditable(true);
                            Stock_BarCode.setEditable(true);
                            Warhouse_name.setEditable(true);
                            Warhouse_Code.setEditable(true);
                            Warhouse_emailid.setEditable(true);
                            Warhouse_Rackno.setEditable(true);
                            Warhouse_Phoneno.setEditable(true);
                            Warhouse_Address.setEditable(true);
                        } else if (NullPointerException == 2) {
                            JOptionPane.showMessageDialog(rootPane, "Please Fill  Dates...", "faillure", JOptionPane.ERROR_MESSAGE);

                            Stock_id.setEditable(true);
                            Stock_name.setEditable(true);
                            Stock_Quntity.setEditable(true);
                            Stock_month.setEditable(true);
                            Stock_Width.setEditable(true);
                            Stock_Length.setEditable(true);
                            Stock_Weight.setEditable(true);
                            Stock_Diameter.setEditable(true);
                            Stock_BarCode.setEditable(true);
                            Warhouse_name.setEditable(true);
                            Warhouse_Code.setEditable(true);
                            Warhouse_emailid.setEditable(true);
                            Warhouse_Rackno.setEditable(true);
                            Warhouse_Phoneno.setEditable(true);
                            Warhouse_Address.setEditable(true);
                        }

                    }

                }

            } else if (r1 == JOptionPane.NO_OPTION) {

                System.exit(0);

                Stock_id.setEditable(true);
                Stock_name.setEditable(true);
                Stock_Quntity.setEditable(true);
                Stock_month.setEditable(true);
                Stock_Width.setEditable(true);
                Stock_Length.setEditable(true);
                Stock_Weight.setEditable(true);
                Stock_Diameter.setEditable(true);
                Stock_BarCode.setEditable(true);
                Warhouse_name.setEditable(true);
                Warhouse_Code.setEditable(true);
                Warhouse_emailid.setEditable(true);
                Warhouse_Rackno.setEditable(true);
                Warhouse_Phoneno.setEditable(true);
                Warhouse_Address.setEditable(true);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Try Again...", "faillure", JOptionPane.ERROR_MESSAGE);
            Stock_id.setEditable(true);
            Stock_name.setEditable(true);
            Stock_Quntity.setEditable(true);
            Stock_month.setEditable(true);
            Stock_Width.setEditable(true);
            Stock_Length.setEditable(true);
            Stock_Weight.setEditable(true);
            Stock_Diameter.setEditable(true);
            Stock_BarCode.setEditable(true);
            Warhouse_name.setEditable(true);
            Warhouse_Code.setEditable(true);
            Warhouse_emailid.setEditable(true);
            Warhouse_Rackno.setEditable(true);
            Warhouse_Phoneno.setEditable(true);
            Warhouse_Address.setEditable(true);
        }
    }//GEN-LAST:event_Stock_Delete3ActionPerformed

    private void Stock_Add3Stock_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Add3Stock_AddActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel t1 = (DefaultTableModel) Stock_table.getModel();
        // char c=evt.getkeychar();

        String sto_id = Stock_id.getText().trim();
        String sto_name = Stock_name.getText().trim();
        int sto_quntity=Integer.parseInt(Stock_Quntity.getText().trim());
        String sto_month = Stock_month.getSelectedItem().toString();
        String sto_width = Stock_Width.getText().trim();
        String sto_length = Stock_Length.getText().trim();
        String sto_wigth = Stock_Weight.getText().trim();
        String sto_dia = Stock_Diameter.getText().trim();
        //Component sto_month=Stock_month.getComboBox();
        String sto_brcode = Stock_BarCode.getText().trim();
        String sto_invoiceid1 = Stock_invoiceno1.getValue().toString();
        String war_name = Warhouse_name.getText().trim();
        String war_code = Warhouse_Code.getText().trim();
        String war_mailid = Warhouse_emailid.getText().trim();
        String war_rackno = Warhouse_Rackno.getText().trim();
        String war_phoneno = Warhouse_Phoneno.getText().trim();
        String war_address = Warhouse_Address.getText().trim();
        String b2 =Stock_Add3.getActionCommand();

        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);

        // ******************************************************************Data Cheak emty********************************************************
        //        if (sto_id.isEmpty() || sto_quntity.isEmpty() || sto_size.isEmpty() || sto_width.isEmpty() || sto_length.isEmpty() || sto_wigth.isEmpty() || sto_dia.isEmpty() || sto_brcode.isEmpty()) {
            //            JOptionPane.showMessageDialog(rootPane, "Please Insert The Data...", "failure", JOptionPane.ERROR_MESSAGE);                            // all data insert cheak
            //
            //        } else if (war_name.isEmpty() || war_code.isEmpty() || war_mailid.isEmpty() || war_rackno.isEmpty() || war_phoneno.isEmpty() || war_address.isEmpty()) {
            //            JOptionPane.showMessageDialog(rootPane, "Please Fill Warhouse Deteils...", "faillure", JOptionPane.ERROR_MESSAGE);                   // all data insert cheak(WARHOUSE DATA)
            //        }
        //

        try{
            if (sto_id.isBlank()||sto_id.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Product Id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_id.setText("");
                Stock_id.grabFocus();
            }
            else  if (sto_name.isBlank()||sto_name.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Product name ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_name.setText("");
                Stock_name.grabFocus();
            }

            else if (Stock_Quntity.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Quntity...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Quntity.setText("");
                Stock_Quntity.grabFocus();
            }
            else  if (Stock_month.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert month...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_month.grabFocus();
            }

            else if (sto_width.isBlank()||sto_width.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Width..", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Width.setText("");
                Stock_Width.grabFocus();
            }
            else  if (sto_length.isBlank()||sto_length.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert  Length...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Length.setText("");
                Stock_Length.grabFocus();
            }

            else if (sto_wigth.isBlank()||sto_wigth.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert  weight...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Weight.setText("");
                Stock_Weight.grabFocus();
            }
            else  if (sto_dia.isBlank()||sto_dia.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Diamter...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Diameter.setText("");
                Stock_Diameter.grabFocus();
            }

            else if (sto_brcode.isBlank()||sto_brcode.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Bar Code...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_BarCode.setText("");
                Stock_BarCode.grabFocus();
            }
            else  if (war_name.isBlank()||war_name.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Name...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_name.setText("");
                Warhouse_name.grabFocus();
            }

            else if (war_code.isBlank()||war_code.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse code...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_Code.setText("");
                Warhouse_Code.grabFocus();
            }
            else  if (war_mailid.isBlank()||war_mailid.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse mail id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_emailid.setText("");
                Warhouse_emailid.grabFocus();
            }

            else if (war_rackno.isBlank()||war_rackno.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Rack No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_Rackno.setText("");
                Warhouse_Rackno.grabFocus();
            }
            else  if (war_phoneno.isBlank()||war_phoneno.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Phono No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_Phoneno.setText("");
                Warhouse_Phoneno.grabFocus();
            }

            else if (war_address.isBlank()||war_address.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Warehouse Address...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_id.setText("");
                Stock_id.grabFocus();
            }

            // ******************************************************************Data Validtion********************************************************
            else if (!sto_id.matches("[a-zA-Z0-9]*")) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Correct Stock_id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_id.setText("");
                Stock_id.grabFocus();
            } else if (!sto_name.matches("[a-zA-Z0-9]*")) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Quntity...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_name.setText("");
                Stock_name.grabFocus();
            } else if (!sto_width.matches("^[0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Width...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Width.setText("");
                Stock_Width.grabFocus();

            } else if (!sto_length.matches("^[0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Length...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Length.setText("");
                Stock_Length.grabFocus();

            } else if (!sto_wigth.matches("^[0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Weight...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Weight.setText("");
                Stock_Weight.grabFocus();

            } else if (!sto_dia.matches("^[0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Number in Stock_Diameter ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Stock_Diameter.setText("");
                Stock_Diameter.grabFocus();

            } else if (!war_mailid.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please  Enter  The Correct Mail ID ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Warhouse_emailid.setText("");
                Warhouse_emailid.grabFocus();

            } else if (!war_phoneno.matches("^[0-9]*$")) {

                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Warhous Phoneno...", "failure", JOptionPane.ERROR_MESSAGE);
                Warhouse_Phoneno.setText("");
                Warhouse_Phoneno.grabFocus();
            } else if (war_phoneno.length() <= 9 || war_phoneno.length() >= 11) {

                JOptionPane.showMessageDialog(rootPane, "Please Enter The 10 Digit Phone No...", "failure", JOptionPane.ERROR_MESSAGE);
                Warhouse_Phoneno.setText("");
                Warhouse_Phoneno.grabFocus();
            } // ******************************************************************Data Validtion end *********************************************************************
            else {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    String war_deliveryDate = sdf.format(Warhouse_DeliveryDate.getDate());
                    String sto_validdate = sdf.format(Stock_validdate.getDate());
                    

                    //                for (int i = 0; i <t1.getRowCount(); i++)
                    //                {
                        //                    sto_id=t1.getValueAt(i,0).toString();
                        //                    sto_name=t1.getValueAt(i,1).toString();
                        //                    sto_quntity=t1.getValueAt(i,2).toString();
                        //                    sto_size=t1.getValueAt(i,3).toString();
                        //                    sto_width=t1.getValueAt(i,4).toString();
                        //                    sto_length=t1.getValueAt(i,5).toString();
                        //                    sto_wigth=t1.getValueAt(i,6).toString();
                        //                    sto_dia=t1.getValueAt(i,7).toString();
                        //                    sto_vali=t1.getValueAt(i,8).toString();
                        //                    sto_month=t1.getValueAt(i,9).toString();
                        //                    pay_total=t1.getValueAt(i, 10).toString();
                        //                }
                    pst = con.prepareStatement("INSERT INTO Stock_Add values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                    pst.setString(1, sto_id);
                    pst.setString(2, sto_name);
                    pst.setInt(3, sto_quntity);
                    pst.setString(4, sto_month);
                    pst.setString(5, sto_width);
                    pst.setString(6, sto_length);
                    pst.setString(7, sto_wigth);
                    pst.setString(8, sto_dia);
                    pst.setString(9, sto_validdate);
                    pst.setString(10, sto_brcode);
                    pst.setString(11, war_name);
                    pst.setString(12, war_code);
                    pst.setString(13, war_mailid);
                    pst.setString(14, war_rackno);
                    pst.setString(15, war_phoneno);
                    pst.setString(16, war_deliveryDate);
                    pst.setString(17, war_address);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Successfully Add Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

                    Stock_id.setText("");
                    Stock_name.setText("");
                    Stock_Quntity.setText("");
                    Stock_month.setSelectedIndex(0);
                    Stock_Width.setText("");
                    Stock_BarCode.setText("");
                    Stock_Length.setText("");
                    Stock_Weight.setText("");
                    Stock_Diameter.setText("");
                    Stock_BarCode.setText("");
                    Stock_validdate.setCalendar(null);
                    Warhouse_Rackno.setText("");
                    Warhouse_DeliveryDate.setCalendar(null);

                } catch (ClassNotFoundException | SQLException ex)
                {
                    int SQLIntegrityConstraintViolationException = 1;
                    int NullPointerException = 2;

                    if (SQLIntegrityConstraintViolationException == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Product Id alredy Exist...", "faillure", JOptionPane.ERROR_MESSAGE);
                    } else if (NullPointerException == 2) {
                        JOptionPane.showMessageDialog(rootPane, "Please Fill  Dates...", "faillure", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Issue Found in Server...", "faillure", JOptionPane.ERROR_MESSAGE);
                    }
                    ex.printStackTrace();

                } finally {
                    try {
                        con.close();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Fail to close Connection...", "faillure", JOptionPane.ERROR_MESSAGE);

                    }

                }

            }}
            catch( Exception e)
            {
                int NumberFormatException=1;

                if(NumberFormatException==1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Pleas Insert Quntity...", "faillure", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_Stock_Add3Stock_AddActionPerformed

    private void Stock_Add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Add3MouseExited
        Stock_Add3.setBackground(new Color(12, 131, 144));
    }//GEN-LAST:event_Stock_Add3MouseExited

    private void Warhouse_emailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Warhouse_emailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Warhouse_emailidActionPerformed

    private void Stock_Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_Date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Date1ActionPerformed

    private void Delivery_serach1Searcha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_serach1Searcha3ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String sto_Search = Sto_Search_Option1.getText().trim();
        String sto_month=Stock_month.getSelectedItem().toString();
        Stock_id.setEditable(true);
        Stock_name.setEditable(true);
        Stock_Quntity.setEditable(true);
        Stock_month.setEditable(true);
        Stock_Width.setEditable(true);
        Stock_Length.setEditable(true);
        Stock_Weight.setEditable(true);
        Stock_Diameter.setEditable(true);
        Stock_BarCode.setEditable(true);
        Warhouse_name.setEditable(true);
        Warhouse_Code.setEditable(true);
        Warhouse_emailid.setEditable(true);
        Warhouse_Rackno.setEditable(true);
        Warhouse_Phoneno.setEditable(true);
        Warhouse_Address.setEditable(true);

        try {

            if (sto_Search.isEmpty() || sto_Search.isBlank())
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Correct Stock Id ...", "failure", JOptionPane.ERROR_MESSAGE);
                Sto_Search_Option1.grabFocus();

            }
            else if (!sto_Search.matches("^[0-9]*$"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Correct Stock Id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Sto_Search_Option1.setText("");
                Sto_Search_Option1.grabFocus();
            }
            else
            {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();

                    rs = pss.executeQuery(" select *from stock_add  where Stock_Product_id='" + sto_Search + "' ");    // select* from rushi where name regexp '[jks]'

                    if (rs.next()==false)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Product Id not found...", "failure", JOptionPane.ERROR_MESSAGE);

                    }
                    else
                    {
                        Stock_id.setText(rs.getString(1));
                        Stock_name.setText(rs.getString(2));
                        Stock_Quntity.setText(rs.getString(3));
                        Stock_month.setSelectedItem(rs.getString(4));
                        Stock_Width.setText(rs.getString(5));
                        Stock_Length.setText(rs.getString(6));
                        Stock_Weight.setText(rs.getString(7));
                        Stock_Diameter.setText(rs.getString(8));
                        Stock_validdate.setDate(rs.getDate(9));
                        Stock_BarCode.setText(rs.getString(10));
                        Warhouse_name.setText(rs.getString(11));
                        Warhouse_Code.setText(rs.getString(12));
                        Warhouse_emailid.setText(rs.getString(13));
                        Warhouse_Rackno.setText(rs.getString(14));
                        Warhouse_Phoneno.setText(rs.getString(15));
                        Warhouse_DeliveryDate.setDate(rs.getDate(16));
                        Warhouse_Address.setText(rs.getString(17));

                        JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (Exception ex) {
                    int IllegalArgumentException = 1;

                    if (IllegalArgumentException == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Product Alreday Not Exist...", "Fail", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_serach1Searcha3ActionPerformed

    private void STock_Warrning1STock_WarrningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STock_Warrning1STock_WarrningMouseClicked

    }//GEN-LAST:event_STock_Warrning1STock_WarrningMouseClicked

    private void Stock_tableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_tableMouseMoved
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select * from rushi.stock_add ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Stock_table.getModel();
            D1.setRowCount(0);
            if (rs.next()==true)
            {
                Vector v=new Vector();
                for (int i = 0; i <=n; i++)
                {

                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getDouble(3));
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

                    i++;
                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Stock_tableMouseMoved

    private void Reorder_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reorder_PrintActionPerformed

    }//GEN-LAST:event_Reorder_PrintActionPerformed

    private void Reorder_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reorder_ClearActionPerformed
        Maxi_Daily_Usage.setText("");
        Average_Daily.setText("");
        Reorder_LeadTime.setText("");
        Reorder_SaftyStock.setText("");
        Reordring_Point.setText("");
    }//GEN-LAST:event_Reorder_ClearActionPerformed

    private void Reorder_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reorder_CalculateActionPerformed
        double Max=Double.parseDouble(Maxi_Daily_Usage.getText());
        double Avg=Double.parseDouble(Average_Daily.getText());
        double lead_Time=Double.parseDouble(Reorder_LeadTime.getText());

        double Safty_Stock=(Max-Avg)*20;;
        double Reordering_Point=Safty_Stock+(Avg*Max);

        Reorder_SaftyStock.setText(String.valueOf(Safty_Stock));
        Reordring_Point.setText(String.valueOf(Reordering_Point));
    }//GEN-LAST:event_Reorder_CalculateActionPerformed

    private void Reorder_Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reorder_Search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reorder_Search1ActionPerformed

    private void Delivery_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_PrintActionPerformed

    }//GEN-LAST:event_Delivery_PrintActionPerformed

    private void Delivery_DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_DeleteAllActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            PreparedStatement ps = con.prepareStatement(" truncate table  Delivery_order ");
            ps.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Successfully Delete All Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Already Delete All Data...", "Fail", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Delivery_DeleteAllActionPerformed

    private void Delivery_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_deleteActionPerformed
        String delivery_clientname=Delivery_Clientname.getText().trim();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            PreparedStatement ps = con.prepareStatement("DELETE FROM Delivery_order  WHERE delivery_clientname='" + delivery_clientname + "' ");
            ps.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Successfully Delete Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_deleteActionPerformed

    private void Delivery_ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_ClearAllActionPerformed
 

    }//GEN-LAST:event_Delivery_ClearAllActionPerformed

    private void Delivery_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_updateActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String delivery_compnyname=Delivery_Companyname.getText().trim();
        String delivery_clientname=Delivery_Clientname.getText().trim();
        String delivery_clientid=Delivery_ClienID.getText().trim();
        String delivery_date = sdf.format(Delivery_date.getDate());
        String delivery_collection=Delivery_Loadingecollection.getText().trim();
        String delivery_loadingplace=Delivery_Loadingplace.getText().trim();
        String delivery_divername=Delivery_Drivername.getText().trim();
        String delivery_vechicalno=Delivery_VechialNo.getText().trim();
        String delivery_vechialname=Delivery_Vechial_name.getText().trim();
        String delivery_city=Delivery_City.getSelectedItem().toString();
        String delivery_state=Delivery_State.getSelectedItem().toString();
        String delivery_country=Delivery_Country.getSelectedItem().toString();

        //***************************************paymeent****************
        String delivery_accountname=Delivery_Accountnaame.getText().trim();
        String delivery_holdname=Delivery_Holdernmae.getText().trim();
        String delivery_paymethod=Delivery_paymentmethod.getSelectedItem().toString();
        String delivery_mailid=Delivery_mailid.getText().trim();
        String delivery_description=Delivery_Description.getText().trim();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            PreparedStatement pst11= con.prepareStatement("update Delivery_order  set delivery_compnyname=?, delivery_clientid=?,delivery_date=?,delivery_collection=?, delivery_loadingplace=?,delivery_divername=?,delivery_vechicalno=?,delivery_vechialname=?,delivery_city=?,delivery_state=?,delivery_country=?,delivery_accountname=?,delivery_holdname=?,delivery_paymethod=?,delivery_mailid=?,delivery_description=? where delivery_clientname=?");

            pst11.setString(1, delivery_compnyname);
            pst11.setString(2, delivery_clientid);
            pst11.setString(3, delivery_date);
            pst11.setString(4, delivery_collection);
            pst11.setString(5, delivery_loadingplace);
            pst11.setString(6, delivery_divername);
            pst11.setString(7, delivery_vechicalno);
            pst11.setString(8, delivery_vechialname);
            pst11.setString(9, delivery_city);
            pst11.setString(10, delivery_state);
            pst11.setString(11, delivery_country);
            pst11.setString(12, delivery_accountname);
            pst11.setString(13, delivery_holdname);
            pst11.setString(14, delivery_paymethod);
            pst11.setString(15, delivery_mailid);
            pst11.setString(16, delivery_description);
            pst11.setString(17, delivery_clientname);

            pst11.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Successfully Update Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

            DISPOSE();

        } catch (ClassNotFoundException | SQLException ex)
        {

            int SQLIntegrityConstraintViolationException = 1;
            int NullPointerException = 2;

            if (SQLIntegrityConstraintViolationException == 1) {
                JOptionPane.showMessageDialog(rootPane, "Product Id alredy Exist...", "faillure", JOptionPane.ERROR_MESSAGE);
            } else if (NullPointerException == 2) {
                JOptionPane.showMessageDialog(rootPane, "Please Fill  Dates...", "faillure", JOptionPane.ERROR_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(rootPane, "Issue Found in Server...", "faillure", JOptionPane.ERROR_MESSAGE);
            }

            ex.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_updateActionPerformed

    private void Delivery_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_AddActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String delivery_compnyname=Delivery_Companyname.getText().trim();
        String delivery_clientname=Delivery_Clientname.getText().trim();
        String delivery_clientid=Delivery_ClienID.getText().trim();
        String delivery_date = sdf.format(Delivery_date.getDate());
        int delivery_collection=Integer.parseInt(Delivery_Loadingecollection.getText().trim());
        String delivery_loadingplace=Delivery_Loadingplace.getText().trim();
        String delivery_divername=Delivery_Drivername.getText().trim();
        String delivery_vechicalno=Delivery_VechialNo.getText().trim();
        String delivery_vechialname=Delivery_Vechial_name.getText().trim();
        String delivery_city=Delivery_City.getSelectedItem().toString();
        String delivery_state=Delivery_State.getSelectedItem().toString();
        String delivery_country=Delivery_Country.getSelectedItem().toString();

        //***************************************paymeent****************
        String delivery_accountname=Delivery_Accountnaame.getText().trim();
        String delivery_holdname=Delivery_Holdernmae.getText().trim();
        String delivery_paymethod=Delivery_paymentmethod.getSelectedItem().toString();
        String delivery_mailid=Delivery_mailid.getText().trim();
        String delivery_description=Delivery_Description.getText().trim();
        
             double Amount=Double.parseDouble(Delivery_Amount.getText().trim());  
             double Gst=Double.parseDouble(Delivery_gst.getText().trim()); 
          
               double  grandtotal=((Gst/100)+1)*Amount;
                Delivery_subtotal.setText(String.valueOf(Amount));
                Delivery_Grandtotal.setText(String.valueOf(grandtotal));

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            pst = con.prepareStatement("INSERT INTO    Delivery_order   values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, delivery_compnyname);
            pst.setString(2, delivery_clientname);
            pst.setString(3, delivery_clientid);
            pst.setString(4, delivery_date);
            pst.setInt(5, delivery_collection);
            pst.setString(6, delivery_loadingplace);
            pst.setString(7, delivery_divername);
            pst.setString(8, delivery_vechicalno);
            pst.setString(9, delivery_vechialname);
            pst.setString(10, delivery_city);
            pst.setString(11, delivery_state);
            pst.setString(12, delivery_country);
            pst.setString(13, delivery_accountname);
            pst.setString(14, delivery_holdname);
            pst.setString(15, delivery_paymethod);
            pst.setString(16, delivery_mailid);
            pst.setString(17, delivery_description);
            pst.setDouble(18, Amount);
            pst.setDouble(19, grandtotal);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Successfully Add Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

            DISPOSE();

        } catch (ClassNotFoundException | SQLException ex)
        {

            int SQLIntegrityConstraintViolationException = 1;
            int NullPointerException = 2;

            if (SQLIntegrityConstraintViolationException == 1) {
                JOptionPane.showMessageDialog(rootPane, "Product Id alredy Exist...", "faillure", JOptionPane.ERROR_MESSAGE);
            } else if (NullPointerException == 2) {
                JOptionPane.showMessageDialog(rootPane, "Please Fill  Dates...", "faillure", JOptionPane.ERROR_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(rootPane, "Issue Found in Server...", "faillure", JOptionPane.ERROR_MESSAGE);
            }

            ex.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_AddActionPerformed

    private void Delivery_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_SearchActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String div_Search = Delivery_Searcha.getText().trim();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select *from rushi.Delivery_order where delivery_clientname='" + div_Search + "' ");
            if (rs.next()==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Delivery Client Name Enter ...", "failure", JOptionPane.ERROR_MESSAGE);
                Delivery_Searcha.setText("");
            }
            else
            {
                Delivery_Companyname.setText(rs.getString(1));
                Delivery_Clientname.setText(rs.getString(2));
                Delivery_ClienID.setText(rs.getString(3));
                Delivery_date.setDate(rs.getDate(4));
                Delivery_Loadingecollection.setText(rs.getString(5));
                Delivery_Loadingplace.setText(rs.getString(6));
                Delivery_Drivername.setText(rs.getString(7));
                Delivery_VechialNo.setText(rs.getString(8));
                Delivery_Vechial_name.setText(rs.getString(9));
                Delivery_City.setSelectedItem(rs.getString(10));
                Delivery_State.setSelectedItem(rs.getString(11));
                Delivery_Country.setSelectedItem(rs.getString(12));
                Delivery_Accountnaame.setText(rs.getString(13));
                Delivery_Holdernmae.setText(rs.getString(14));
                Delivery_paymentmethod.setSelectedItem(rs.getString(15));
                Delivery_mailid.setText(rs.getString(14));
                Delivery_Description.setText(rs.getString(17));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_SearchActionPerformed

    private void Delivery_Tabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delivery_Tabel1MouseMoved
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select * from rushi. Delivery_order ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Delivery_Tabel1.getModel();
            D1.setRowCount(0);
            if (rs.next()==true)
            {
                Vector v=new Vector();
                for (int i = 0; i <=n; i++)
                {

                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getDouble(3));
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

                    i++;
                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Delivery_Tabel1MouseMoved

    private void Purchase_TabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purchase_TabelMouseMoved
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery("select Purchase_Buyer_companyname,Purchase_Buyer_Delivery_terms,Purchase_Description,Purchase_Month,Purchase_TotalQuntiy,Purchase_GST,Purchase_SubTotal,Purchase_GrandTotal from rushi.Purchase_order ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Purchase_Tabel.getModel();
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
                    v.add(rs.getDouble(5));
                    v.add(rs.getDouble(6));
                    v.add(rs.getDouble(7));
                    v.add(rs.getDouble(8));

                    i++;
                }
                D1.addRow(v);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Purchase_TabelMouseMoved

    private void Purchase_SubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_SubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_SubTotalActionPerformed

    private void Purchase_PaymentmethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_PaymentmethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_PaymentmethodActionPerformed

    private void Purchase_Payement_ReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_Payement_ReciptActionPerformed
//                 try {
//                                    area1.print();
//                                } catch (PrinterException ex) {
//                                    Logger.getLogger(ZFrame.class.getName()).log(Level.SEVERE, null, ex);
//                                }
    }//GEN-LAST:event_Purchase_Payement_ReciptActionPerformed

    private void Purchase_Payement_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_Payement_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_Payement_DeleteActionPerformed

    private void Purchase_Payement_DeleteallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_Payement_DeleteallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_Payement_DeleteallActionPerformed

    private void Purchase_ClearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_ClearallActionPerformed

    }//GEN-LAST:event_Purchase_ClearallActionPerformed

    private void Purchase_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_AddActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String buy_compnyname=Purchaser_Companyname.getText().trim();
        String buy_mailid=Purchase_Emailid.getText().trim();
        String buy_date = sdf.format(Purchase_Date.getDate());
        String buy_deliterm=Purchase_Deliveryterms.getText().trim();
        String buy_shipping=Purchase_Shipping_Method.getText().trim();
        String buy_Phoneno=Purchase_phone_no.getText().trim();
        String buy_city=Purchase_City.getSelectedItem().toString();
        String buy_country=Purchase_Country.getSelectedItem().toString();
        String buy_state1=Purchase_State.getSelectedItem().toString();
        String buy_pincode=Purchase_Pincode.getText().trim();
        String buy_month=Purchase_Month.getSelectedItem().toString();
        String buy_Remark=Purchase_Remark.getText().trim();
        String buy_Address=Purchase_Address.getText().trim();

        String buy_pro1=Purchase_Product_Name1.getSelectedItem().toString();
        String buy_pro2=Purchase_Product_Name2.getSelectedItem().toString();
        String buy_pro3=Purchase_Product_Name3.getSelectedItem().toString();
        String buy_pro4=Purchase_Product_Name4.getSelectedItem().toString();
        String buy_pro5=Purchase_Product_Name5.getSelectedItem().toString();
        String buy_pro6=Purchase_Product_Name6.getSelectedItem().toString();
        String buy_pro7=Purchase_Product_Name7.getSelectedItem().toString();
        String buy_pro8=Purchase_Product_Name8.getSelectedItem().toString();
        String buy_pro9=Purchase_Product_Name9.getSelectedItem().toString();

        String buy_accno=Purchase_Accno.getText().trim();
        String buy_holdename=Purchase_Holdername.getText().trim();
        String buy_paymethod=Purchase_Paymentmethod.getSelectedItem().toString();
        String buy_Description=Payement_Description.getText().trim();

        double pro_qunti1=Double.parseDouble(Purchase_Quntity1.getText());
        double pro_unitprice1=Double.parseDouble(Purchase_unitpri1.getText());

        double pro_qunti2=Double.parseDouble(Purchase_Quntity2.getText());
        double pro_unitprice2=Double.parseDouble(Purchase_unitpri2.getText());

        double pro_qunti3=Double.parseDouble(Purchase_Quntity3.getText());
        double pro_unitprice3=Double.parseDouble(Purchase_unitpri3.getText());

        double pro_qunti4=Double.parseDouble(Purchase_Quntity4.getText());
        double pro_unitprice4=Double.parseDouble(Purchase_unitpri4.getText());

        double pro_qunti5=Double.parseDouble(Purchase_Quntity5.getText());
        double pro_unitprice5=Double.parseDouble(Purchase_unitpri5.getText());

        double pro_qunti6=Double.parseDouble(Purchase_Quntity6.getText());
        double pro_unitprice6=Double.parseDouble(Purchase_unitpri6.getText());

        double pro_qunti7=Double.parseDouble(Purchase_Quntity7.getText());
        double pro_unitprice7=Double.parseDouble(Purchase_unitpri7.getText());

        double pro_qunti8=Double.parseDouble(Purchase_Quntity8.getText());
        double pro_unitprice8=Double.parseDouble(Purchase_unitpri8.getText());

        double pro_qunti9=Double.parseDouble(Purchase_Quntity9.getText());
        double pro_unitprice9=Double.parseDouble(Purchase_unitpri9.getText());

        double buy_GST=Double.parseDouble(Purchase_GST.getText());

        try
        {

            //*******************Company name****************
            if (buy_compnyname.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The  Company Name...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchaser_Companyname.grabFocus();
            }

            //*******************Mail id****************
            else if (buy_mailid.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Mail Id...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Emailid.grabFocus();
            }
            else  if (!buy_mailid.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]*$"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Correct Mail Id ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Emailid.setText("");
                Purchase_Emailid.grabFocus();
            }

            //*******************Delivery Terms****************

            else if (buy_deliterm.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Delivery Terms...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Deliveryterms.grabFocus();
            }
            else  if (buy_deliterm.matches("^[0-9]*$"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Correct Delivery Terms...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Deliveryterms.setText("");
                Purchase_Deliveryterms.grabFocus();
            }

            //*******************Shipping Method****************

            else if (buy_shipping.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Shipping Method ...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Shipping_Method.grabFocus();
            }
            else  if (buy_shipping.matches("^[0-9]*$"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert  Correct Shipping Method...", "failure", JOptionPane.ERROR_MESSAGE);       //Special Charter?                                                                                                                                                           //  data valdition cheak
                Purchase_Shipping_Method.setText("");
                Purchase_Shipping_Method.grabFocus();
            }
            //*******************Phone No****************
            else if (buy_Phoneno.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert  Phone No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_phone_no.grabFocus();
            }
            else  if (buy_Phoneno.length() <= 9||buy_Phoneno.length() >= 11)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert Correct Phone No...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_phone_no.setText("");
                Purchase_phone_no.grabFocus();
            }

            //*******************City****************

            else if (Purchase_City.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert City..", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_City.grabFocus();
            }

            //*******************State****************
            else if(Purchase_State.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The State...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_State.grabFocus();
            }

            //*******************Country****************
            else  if (Purchase_Country.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Country...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Country.grabFocus();
            }

            //*******************pin Code****************

            else if (buy_pincode.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Pincode...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Pincode.grabFocus();
            }
            else  if (!buy_pincode.matches("^[0-9]*$"))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Correct Pincode...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Pincode.setText("");
                Purchase_Pincode.grabFocus();
            }
            //*******************Months****************

            else  if (Purchase_Month.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Correct Month...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Month.grabFocus();
            }
            //*******************Address****************

            else if (buy_Address.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Address...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Address.grabFocus();
            }

            //*************************************************1st Product***************************************

            else if (Purchase_Product_Name1.getSelectedIndex()==0) // Purchase_Quntity1 pro_qunti1
            {
                Purchase_Product_Name1.grabFocus();
                JOptionPane.showMessageDialog(rootPane, "Please Insert The Product No in 1...", "failure", JOptionPane.ERROR_MESSAGE);
                if (pro_qunti1 == Math.floor(pro_qunti1))
                {
                    JOptionPane.showMessageDialog(this , "Please Insert  Production quntity in 1","Fail",JOptionPane.ERROR_MESSAGE);
                }

            }

            else
            {

                double t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0, t10;

                t1=pro_qunti1*pro_unitprice1;
                t2=pro_qunti2*pro_unitprice2;
                t3=pro_qunti3*pro_unitprice3;
                t4=pro_qunti4*pro_unitprice4;
                t5=pro_qunti5*pro_unitprice5;
                t6=pro_qunti6*pro_unitprice6;
                t7=pro_qunti7*pro_unitprice7;
                t8=pro_qunti8*pro_unitprice8;
                t9=pro_qunti9*pro_unitprice9;
                t10=pro_qunti1+pro_qunti2+pro_qunti3+pro_qunti4+pro_qunti5+pro_qunti6+pro_qunti7+pro_qunti8+pro_qunti9;

                double  subtotal=t1+t2+t3+t4+t5+t6+t7+t8+t9;
                double  grandtotal=((buy_GST/100)+1)*subtotal;
                Purchase_SubTotal.setText(String.valueOf(subtotal));
                Purchase_GrandTotal.setText(String.valueOf(grandtotal));

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    pst = con.prepareStatement("INSERT INTO    Purchase_order  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                    pst.setString(1, buy_compnyname);
                    pst.setString(2, buy_mailid);
                    pst.setString(3, buy_date);
                    pst.setString(4, buy_deliterm);
                    pst.setString(5, buy_shipping);
                    pst.setString(6, buy_Phoneno);
                    pst.setString(7, buy_city);
                    pst.setString(8, buy_country);
                    pst.setString(9, buy_state1);
                    pst.setString(10, buy_pincode);
                    pst.setString(11, buy_month);
                    pst.setString(12, buy_Remark);
                    pst.setString(13, buy_Address);

                    pst.setString(14, buy_pro1);
                    pst.setDouble(15, pro_qunti1);
                    pst.setDouble(16, pro_unitprice1);

                    pst.setString(17, buy_pro2);
                    pst.setDouble(18, pro_qunti2);
                    pst.setDouble(19, pro_unitprice2);

                    pst.setString(20, buy_pro3);
                    pst.setDouble(21, pro_qunti3);
                    pst.setDouble(22, pro_unitprice3);

                    pst.setString(23, buy_pro4);
                    pst.setDouble(24, pro_qunti4);
                    pst.setDouble(25, pro_unitprice4);

                    pst.setString(26, buy_pro5);
                    pst.setDouble(27, pro_qunti5);
                    pst.setDouble(28, pro_unitprice5);
                    pst.setString(29, buy_pro6);
                    pst.setDouble(30, pro_qunti6);
                    pst.setDouble(31, pro_unitprice6);

                    pst.setString(32, buy_pro7);
                    pst.setDouble(33, pro_qunti7);
                    pst.setDouble(34, pro_unitprice7);
                    pst.setString(35, buy_pro8);
                    pst.setDouble(36, pro_qunti8);
                    pst.setDouble(37, pro_unitprice8);

                    pst.setString(38, buy_pro9);
                    pst.setDouble(39, pro_qunti9);
                    pst.setDouble(40, pro_unitprice9);

                    pst.setString(41, buy_accno);
                    pst.setString(42, buy_holdename);
                    pst.setString(43, buy_paymethod);
                    pst.setDouble(44, subtotal);
                    pst.setDouble(45, buy_GST);
                    pst.setDouble(46, grandtotal);
                    pst.setString(47, buy_Description);
                    pst.setDouble(48, t10);

                    pst.executeUpdate();

//                    Purchaser_Companyname.setText("");
//                    Purchase_Emailid.setText("");
//                    Purchase_Date.setCalendar(null);
//                    Purchase_Deliveryterms.setText("");
//                    Purchase_Shipping_Method.setText("");
//                    Purchase_phone_no.setText("");
//                    Purchase_City.setSelectedIndex(0);
//                    Purchase_Country.setSelectedIndex(0);
//                    Purchase_State.setSelectedIndex(0);
//                    Purchase_Pincode.setText("");
//                    Purchase_Month.setSelectedIndex(0);
//                    Purchase_Remark.setText("");
//                    Purchase_Address.setText("");

                    JOptionPane.showMessageDialog(rootPane, "Successfully Add Data...", "Successfully", JOptionPane.INFORMATION_MESSAGE);

                } catch (ClassNotFoundException | SQLException ex)
                {
                

                                        int SQLIntegrityConstraintViolationException = 1;
                                        int NullPointerException = 2;
                    
                                        if (SQLIntegrityConstraintViolationException == 1) {
                                                JOptionPane.showMessageDialog(rootPane, "Product Id alredy Exist...", "faillure", JOptionPane.ERROR_MESSAGE);
                                            } else if (NullPointerException == 2) {
                                                JOptionPane.showMessageDialog(rootPane, "Please Fill  Dates...", "faillure", JOptionPane.ERROR_MESSAGE);
                                            } else
                                        {
                                                JOptionPane.showMessageDialog(rootPane, "Issue Found in Server...", "faillure", JOptionPane.ERROR_MESSAGE);
                                            }

                }

            }

        }
        catch(Exception ec)
        {
            ec.printStackTrace();
        }
    }//GEN-LAST:event_Purchase_AddActionPerformed

    private void Purchase_Quntity1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Purchase_Quntity1KeyReleased

    }//GEN-LAST:event_Purchase_Quntity1KeyReleased

    private void Purchase_RemarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_RemarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_RemarkActionPerformed

    private void Purchase_Order_Searcha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_Order_Searcha

    

        double pro_qunti1=Double.parseDouble(Purchase_Quntity1.getText());
        double pro_unitprice1=Double.parseDouble(Purchase_unitpri1.getText());

        double pro_qunti2=Double.parseDouble(Purchase_Quntity2.getText());
        double pro_unitprice2=Double.parseDouble(Purchase_unitpri2.getText());

        double pro_qunti3=Double.parseDouble(Purchase_Quntity3.getText());
        double pro_unitprice3=Double.parseDouble(Purchase_unitpri3.getText());

        double pro_qunti4=Double.parseDouble(Purchase_Quntity4.getText());
        double pro_unitprice4=Double.parseDouble(Purchase_unitpri4.getText());

        double pro_qunti5=Double.parseDouble(Purchase_Quntity5.getText());
        double pro_unitprice5=Double.parseDouble(Purchase_unitpri5.getText());

        double pro_qunti6=Double.parseDouble(Purchase_Quntity6.getText());
        double pro_unitprice6=Double.parseDouble(Purchase_unitpri6.getText());

        double pro_qunti7=Double.parseDouble(Purchase_Quntity7.getText());
        double pro_unitprice7=Double.parseDouble(Purchase_unitpri7.getText());

        double pro_qunti8=Double.parseDouble(Purchase_Quntity8.getText());
        double pro_unitprice8=Double.parseDouble(Purchase_unitpri8.getText());

        double pro_qunti9=Double.parseDouble(Purchase_Quntity9.getText());
        double pro_unitprice9=Double.parseDouble(Purchase_unitpri9.getText());

        double buy_GST=Double.parseDouble(Purchase_GST.getText());
        
            String Text=Purchase_Order_Text.getText().trim();

        
              if (Text.isBlank()||Text.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Enter the Company name...", "failure", JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
                Purchase_Order_Text.grabFocus();
            }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();

            rs = pss.executeQuery(" select *from Purchase_order  where Purchase_Buyer_companyname='" + Text + "' ");

            if (rs.next()==false)
            {
                JOptionPane.showMessageDialog(rootPane, "Company name not found...", "failure", JOptionPane.ERROR_MESSAGE);

            }else
            {
                Purchaser_Companyname.setText(rs.getString(1));
                Purchase_Emailid.setText(rs.getString(2));
                Purchase_Date.setDate(rs.getDate(3));
                Purchase_Deliveryterms.setText(rs.getString(2));
                Purchase_Shipping_Method.setText(rs.getString(5));
                Purchase_phone_no.setText(rs.getString(6));
                Purchase_City.setSelectedItem(rs.getString(7));
                Purchase_State.setSelectedItem(rs.getString(8));
                Purchase_Country.setSelectedItem(rs.getString(9));
                Purchase_Pincode.setText(rs.getString(10));
                Purchase_Month.setSelectedItem(rs.getString(11));
                Purchase_Remark.setText(rs.getString(12));
                Purchase_Address.setText(rs.getString(13));

                Purchase_Product_Name1.setSelectedItem(rs.getString(10));
                Purchase_Product_Name2.setSelectedItem(rs.getString(12));
                Purchase_Product_Name3.setSelectedItem(rs.getString(13));
                Purchase_Product_Name4.setSelectedItem(rs.getString(14));
                Purchase_Product_Name5.setSelectedItem(rs.getString(15));
                Purchase_Product_Name6.setSelectedItem(rs.getString(16));
                Purchase_Product_Name7.setSelectedItem(rs.getString(17));
                Purchase_Product_Name8.setSelectedItem(rs.getString(18));
                Purchase_Product_Name9.setSelectedItem(rs.getString(19));

               

                Purchase_Accno.setText(rs.getString(15));
                Purchase_Paymentmethod.setSelectedItem(rs.getString(10));
                Payement_Description.setText(rs.getString(17));
                Payement_Description.setText(rs.getString(17));

                JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            int IllegalArgumentException = 1;

            if (IllegalArgumentException == 1) {
                JOptionPane.showMessageDialog(rootPane, "Successfully...", "Message", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Product Alreday Not Exist...", "Fail", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_Purchase_Order_Searcha

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

    private void Reorder_TableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reorder_TableMouseMoved
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select delivery_clientname, delivery_description,delivery_date,delivery_collection from rushi.Delivery_order ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Reorder_Table.getModel();
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
    }//GEN-LAST:event_Reorder_TableMouseMoved

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
            java.util.logging.Logger.getLogger(Stock_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JTextField Average_Daily;
    private javax.swing.JPanel Buyer_Purchase_Address;
    private javax.swing.JTextField Delivery_Accountnaame;
    private com.mycompany.main.Button Delivery_Add;
    private javax.swing.JTextField Delivery_Amount;
    private javax.swing.JComboBox<String> Delivery_City;
    private com.mycompany.main.Button Delivery_ClearAll;
    private javax.swing.JTextField Delivery_ClienID;
    private javax.swing.JTextField Delivery_Clientname;
    private javax.swing.JTextField Delivery_Companyname;
    private javax.swing.JComboBox<String> Delivery_Country;
    private com.mycompany.main.Button Delivery_DeleteAll;
    private javax.swing.JTextArea Delivery_Description;
    private javax.swing.JTextField Delivery_Drivername;
    private javax.swing.JTextField Delivery_Grandtotal;
    private javax.swing.JTextField Delivery_Holdernmae;
    private javax.swing.JTextField Delivery_Loadingecollection;
    private javax.swing.JTextField Delivery_Loadingplace;
    private com.mycompany.main.TextField Delivery_Navi_Date1;
    private com.mycompany.main.Button Delivery_Print;
    private javax.swing.JToggleButton Delivery_Search;
    private com.mycompany.rushi.TextFieldSearchOption Delivery_Searcha;
    private javax.swing.JComboBox<String> Delivery_State;
    private javax.swing.JTable Delivery_Tabel1;
    private javax.swing.JTextField Delivery_VechialNo;
    private javax.swing.JTextField Delivery_Vechial_name;
    private com.toedter.calendar.JDateChooser Delivery_date;
    private com.mycompany.main.Button Delivery_delete;
    private javax.swing.JTextField Delivery_gst;
    private javax.swing.JTextField Delivery_mailid;
    private javax.swing.JComboBox<String> Delivery_paymentmethod;
    private javax.swing.JToggleButton Delivery_serach1;
    private javax.swing.JTextField Delivery_subtotal;
    private com.mycompany.main.Button Delivery_update;
    private javax.swing.JLabel Home;
    private javax.swing.JMenuItem Logout1_CreatACcount;
    private javax.swing.JMenuItem Logout_Login;
    private javax.swing.JLabel Mail;
    private javax.swing.JTextField Maxi_Daily_Usage;
    private javax.swing.JTextArea Payement_Description;
    private javax.swing.JToggleButton PurchaseOrderSearcha;
    private javax.swing.JTextField Purchase_Accno;
    private com.mycompany.main.Button Purchase_Add;
    private javax.swing.JTextArea Purchase_Address;
    private javax.swing.JComboBox<String> Purchase_City;
    private com.mycompany.main.Button Purchase_Clearall;
    private javax.swing.JComboBox<String> Purchase_Country;
    private com.toedter.calendar.JDateChooser Purchase_Date;
    private com.mycompany.main.TextField Purchase_Date5;
    private javax.swing.JTextField Purchase_Deliveryterms;
    private javax.swing.JTextField Purchase_Emailid;
    private javax.swing.JTextField Purchase_GST;
    private javax.swing.JTextField Purchase_GrandTotal;
    private javax.swing.JTextField Purchase_Holdername;
    private javax.swing.JComboBox<String> Purchase_Month;
    private com.mycompany.rushi.TextFieldSearchOption Purchase_Order_Text;
    private com.mycompany.main.Button Purchase_Payement_Delete;
    private com.mycompany.main.Button Purchase_Payement_Deleteall;
    private com.mycompany.main.Button Purchase_Payement_Recipt;
    private javax.swing.JComboBox<String> Purchase_Paymentmethod;
    private javax.swing.JTextField Purchase_Pincode;
    private javax.swing.JComboBox<String> Purchase_Product_Name1;
    private javax.swing.JComboBox<String> Purchase_Product_Name2;
    private javax.swing.JComboBox<String> Purchase_Product_Name3;
    private javax.swing.JComboBox<String> Purchase_Product_Name4;
    private javax.swing.JComboBox<String> Purchase_Product_Name5;
    private javax.swing.JComboBox<String> Purchase_Product_Name6;
    private javax.swing.JComboBox<String> Purchase_Product_Name7;
    private javax.swing.JComboBox<String> Purchase_Product_Name8;
    private javax.swing.JComboBox<String> Purchase_Product_Name9;
    private javax.swing.JTextField Purchase_Quntity1;
    private javax.swing.JTextField Purchase_Quntity2;
    private javax.swing.JTextField Purchase_Quntity3;
    private javax.swing.JTextField Purchase_Quntity4;
    private javax.swing.JTextField Purchase_Quntity5;
    private javax.swing.JTextField Purchase_Quntity6;
    private javax.swing.JTextField Purchase_Quntity7;
    private javax.swing.JTextField Purchase_Quntity8;
    private javax.swing.JTextField Purchase_Quntity9;
    private javax.swing.JTextField Purchase_Remark;
    private javax.swing.JTextField Purchase_Shipping_Method;
    private javax.swing.JComboBox<String> Purchase_State;
    private javax.swing.JTextField Purchase_SubTotal;
    private javax.swing.JTable Purchase_Tabel;
    private javax.swing.JSpinner Purchase_invoiceno5;
    private javax.swing.JTextField Purchase_phone_no;
    private javax.swing.JTextField Purchase_unitpri1;
    private javax.swing.JTextField Purchase_unitpri2;
    private javax.swing.JTextField Purchase_unitpri3;
    private javax.swing.JTextField Purchase_unitpri4;
    private javax.swing.JTextField Purchase_unitpri5;
    private javax.swing.JTextField Purchase_unitpri6;
    private javax.swing.JTextField Purchase_unitpri7;
    private javax.swing.JTextField Purchase_unitpri8;
    private javax.swing.JTextField Purchase_unitpri9;
    private javax.swing.JTextField Purchaser_Companyname;
    private javax.swing.JTabbedPane ReoderMainTab;
    private javax.swing.JLabel Reorder;
    private com.mycompany.main.Button Reorder_Calculate;
    private com.mycompany.main.Button Reorder_Clear;
    private javax.swing.JTextField Reorder_LeadTime;
    private com.toedter.calendar.JMonthChooser Reorder_Nav_Month4;
    private com.mycompany.main.TextField Reorder_Navi_Date2;
    private com.mycompany.main.Button Reorder_Print;
    private com.mycompany.rushi.TextFieldSearchOption Reorder_SaftyStock;
    private javax.swing.JToggleButton Reorder_Search1;
    private com.mycompany.rushi.TextFieldSearchOption Reorder_Searcha1;
    private javax.swing.JTable Reorder_Table;
    private com.mycompany.rushi.TextFieldSearchOption Reordring_Point;
    private javax.swing.JLabel STock_Warrning1;
    private javax.swing.JLabel Setting;
    private com.mycompany.rushi.TextFieldSearchOption Sto_Search_Option1;
    private javax.swing.JLabel StockAdd;
    private com.mycompany.main.Button Stock_Add3;
    private javax.swing.JLabel Stock_Anlysis;
    private javax.swing.JTextField Stock_BarCode;
    private com.mycompany.main.Button Stock_ClearAll;
    private com.mycompany.main.TextField Stock_Date1;
    private com.mycompany.main.Button Stock_Delete3;
    private com.mycompany.main.Button Stock_DeleteAll3;
    private javax.swing.JTextField Stock_Diameter;
    private javax.swing.JLabel Stock_Info;
    private javax.swing.JTextField Stock_Length;
    private com.toedter.calendar.JMonthChooser Stock_Nav_Month1;
    private com.toedter.calendar.JMonthChooser Stock_Nav_Month3;
    private com.toedter.calendar.JMonthChooser Stock_Nav_Month6;
    private com.mycompany.main.Button Stock_Print3;
    private javax.swing.JTextField Stock_Quntity;
    private javax.swing.JTextField Stock_Weight;
    private javax.swing.JTextField Stock_Width;
    private javax.swing.JTabbedPane Stock_add;
    private javax.swing.JTextField Stock_id;
    private javax.swing.JSpinner Stock_invoiceno1;
    private javax.swing.JComboBox<String> Stock_month;
    private javax.swing.JTextField Stock_name;
    private javax.swing.JTable Stock_table;
    private com.mycompany.main.Button Stock_update3;
    private com.toedter.calendar.JDateChooser Stock_validdate;
    private javax.swing.JTextArea Warhouse_Address;
    private javax.swing.JTextField Warhouse_Code;
    private com.toedter.calendar.JDateChooser Warhouse_DeliveryDate;
    private javax.swing.JTextField Warhouse_Phoneno;
    private javax.swing.JTextField Warhouse_Rackno;
    private javax.swing.JTextField Warhouse_emailid;
    private javax.swing.JTextField Warhouse_name;
    private com.mycompany.rushi.ImageAvatar imageAvatar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane8;
    private com.mycompany.rushi.ZGradient zGradient1;
    // End of variables declaration//GEN-END:variables

    private void DISPOSE() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
