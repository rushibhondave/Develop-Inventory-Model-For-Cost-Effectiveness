/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rushi;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javaswingdev.GradientDropdownMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.xmlbeans.XmlBase64Binary.Factory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.data.general.DefaultPieDataset;
public final class Main_Page extends javax.swing.JFrame {

   private final String user = "root";
    private final String pass = "Rushikesh@5046";
    private final String sqlcon = "jdbc:mysql://localhost:3306/rushi";    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Main_Page()
    {
        initComponents();
         low1();
         Purchasecount();
         Stock_Delivery();
         Total();
       //   chart1 ();

   
    }

   void low1()
    {
         try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();
                  
                    rs = pss.executeQuery(" SELECT MIN(Stock_Product_Quntitiy)  FROM stock_add;" ); 

                    if (rs.next()==false)
                    {
                           JOptionPane.showMessageDialog(rootPane, "Low Product quntity not found...", "failure", JOptionPane.ERROR_MESSAGE);
                      
                    }else 
                    {
                       Low_Product.setText(Integer.toString(rs.getInt(1))); 
                    }
                    
              }
                    catch(Exception e)
                            {
                                e.printStackTrace();
                            }
    }
    
   
  
    
    void Purchasecount()
    {
         try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();
                  
                    rs = pss.executeQuery(" SELECT SUM(Purchase_TotalQuntiy) as sum_score FROM rushi.Purchase_order;" ); 

                    if (rs.next()==false)
                    {
                           JOptionPane.showMessageDialog(rootPane, "Purchase quntity  is zero...", "failure", JOptionPane.ERROR_MESSAGE);
                      
                    }else 
                    {
                       Purchasecount.setText(Integer.toString(rs.getInt(1))); 
                    }
                    
              }
                    catch(Exception e)
                            {
                                e.printStackTrace();
                            }
    }
  
        void Stock_Delivery()
    {
         try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();
                  
                    rs = pss.executeQuery("SELECT SUM(delivery_collection) as sum_score FROM rushi.Delivery_order" ); 

                    if (rs.next()==false)
                    {
                           JOptionPane.showMessageDialog(rootPane, "Out of Stock quntity not found...", "failure", JOptionPane.ERROR_MESSAGE);
                      
                    }else 
                    {
                       StockDeliver.setText(Integer.toString(rs.getInt(1))); 
                    }
                    
              }
                    catch(Exception e)
                            {
                                e.printStackTrace();
                            }
    
    }
        
            void Total()
    {
        
        try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(sqlcon, user, pass);
                    Statement pss = con.createStatement();
                  
                    rs = pss.executeQuery("SELECT SUM(Stock_Product_Quntitiy) as sum_score FROM rushi.stock_add;" );   

                    if (rs.next()==true)
                    {    
                               Total_Product.setText(Integer.toString(rs.getInt(1))); 
                      
                    }
                    
              }
                    catch(Exception e)
                            {
                                e.printStackTrace();
                            }


    }
            

//    public void chart1 () {
//
//DefaultPieDataset dataset = new DefaultPieDataset();
//
//dataset.setValue ("Pantalones", 50);
//
//dataset.setValue ("Camisas", 30);
//
//dataset.setValue ("Zapatillas", 15);
//
//dataset.setValue ("Zapatos", 15);
//
//dataset.setValue ("otros", 5);
//  
//JFreeChart chart1=Chart Factory.createPieChart ("Ventas del Mes", dataset, true, true, false);
//
//JPanel panelChart1=new ChartPanel(chart1);
//Bar_Chart. add (panelChart1);
//    } 
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
        Low_Product1 = new com.mycompany.rushi.Card22();
        Low_Product = new javax.swing.JTextField();
        Total_Product1 = new com.mycompany.rushi.Card22();
        Total_Product = new javax.swing.JTextField();
        MostStock1 = new com.mycompany.rushi.Card22();
        StockDeliver = new javax.swing.JTextField();
        StockDelivery1 = new com.mycompany.rushi.Card22();
        Purchasecount = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        Chart = new com.mycompany.rushi.BlankPlotChart();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Main_Page_Table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        Gauge_Chart_Refresh = new javax.swing.JButton();
        gaugeChart1 = new com.mycompany.rushi.GaugeChart();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        Logout_Login = new javax.swing.JMenuItem();
        Intro = new javax.swing.JMenuItem();
        Logout1_CreatACcount = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1564, 853));

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
                .addGap(38, 38, 38)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(zGradient1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(zGradient1Layout.createSequentialGroup()
                        .addGroup(zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StockAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stock_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stock_Anlysis, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        zGradient1Layout.setVerticalGroup(
            zGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zGradient1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Home)
                .addGap(32, 32, 32)
                .addComponent(StockAdd)
                .addGap(32, 32, 32)
                .addComponent(Stock_Anlysis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Stock_Info)
                .addGap(30, 30, 30)
                .addComponent(Mail)
                .addGap(40, 40, 40)
                .addComponent(Account)
                .addGap(41, 41, 41)
                .addComponent(Setting)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(zGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(zGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "order activity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(1370, 281));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Low_Product1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Low Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Low_Product1.setColor1(new java.awt.Color(204, 0, 153));
        Low_Product1.setColor2(new java.awt.Color(167, 94, 226));
        Low_Product1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Low_Product.setEditable(false);
        Low_Product.setBackground(new java.awt.Color(167, 94, 226));
        Low_Product.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Low_Product.setForeground(new java.awt.Color(255, 255, 255));
        Low_Product.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Low_Product.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Low_Product.setOpaque(false);

        javax.swing.GroupLayout Low_Product1Layout = new javax.swing.GroupLayout(Low_Product1);
        Low_Product1.setLayout(Low_Product1Layout);
        Low_Product1Layout.setHorizontalGroup(
            Low_Product1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Low_Product1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(Low_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        Low_Product1Layout.setVerticalGroup(
            Low_Product1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Low_Product1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Low_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.add(Low_Product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 240, 160));

        Total_Product1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Total_Product1.setColor1(new java.awt.Color(102, 0, 255));
        Total_Product1.setColor2(new java.awt.Color(123, 123, 245));
        Total_Product1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Total_Product.setEditable(false);
        Total_Product.setBackground(new java.awt.Color(123, 123, 245));
        Total_Product.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Total_Product.setForeground(new java.awt.Color(255, 255, 255));
        Total_Product.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total_Product.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Total_Product.setOpaque(false);

        javax.swing.GroupLayout Total_Product1Layout = new javax.swing.GroupLayout(Total_Product1);
        Total_Product1.setLayout(Total_Product1Layout);
        Total_Product1Layout.setHorizontalGroup(
            Total_Product1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Product1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Total_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        Total_Product1Layout.setVerticalGroup(
            Total_Product1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Total_Product1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Total_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.add(Total_Product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 160));

        MostStock1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Deliver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        MostStock1.setColor1(new java.awt.Color(241, 208, 62));
        MostStock1.setColor2(new java.awt.Color(255, 153, 0));
        MostStock1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        StockDeliver.setEditable(false);
        StockDeliver.setBackground(new java.awt.Color(255, 153, 0));
        StockDeliver.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        StockDeliver.setForeground(new java.awt.Color(255, 255, 255));
        StockDeliver.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StockDeliver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StockDeliver.setOpaque(false);

        javax.swing.GroupLayout MostStock1Layout = new javax.swing.GroupLayout(MostStock1);
        MostStock1.setLayout(MostStock1Layout);
        MostStock1Layout.setHorizontalGroup(
            MostStock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostStock1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StockDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        MostStock1Layout.setVerticalGroup(
            MostStock1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostStock1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(StockDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel3.add(MostStock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 240, 160));

        StockDelivery1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase Count", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        StockDelivery1.setColor1(new java.awt.Color(153, 0, 153));
        StockDelivery1.setColor2(new java.awt.Color(204, 49, 0));
        StockDelivery1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Purchasecount.setEditable(false);
        Purchasecount.setBackground(new java.awt.Color(204, 49, 0));
        Purchasecount.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Purchasecount.setForeground(new java.awt.Color(255, 255, 255));
        Purchasecount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Purchasecount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Purchasecount.setOpaque(false);

        javax.swing.GroupLayout StockDelivery1Layout = new javax.swing.GroupLayout(StockDelivery1);
        StockDelivery1.setLayout(StockDelivery1Layout);
        StockDelivery1Layout.setHorizontalGroup(
            StockDelivery1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockDelivery1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(Purchasecount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        StockDelivery1Layout.setVerticalGroup(
            StockDelivery1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockDelivery1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Purchasecount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3.add(StockDelivery1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 240, 160));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Chart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel12.setOpaque(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chart, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chart, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 51)), "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel10.setOpaque(false);

        Main_Page_Table.setAutoCreateRowSorter(true);
        Main_Page_Table.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        Main_Page_Table.setForeground(new java.awt.Color(0, 0, 0));
        Main_Page_Table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Product Id:                                ", "Product Name", "Quntity", "Month"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Main_Page_Table.setOpaque(false);
        Main_Page_Table.getTableHeader().setReorderingAllowed(false);
        Main_Page_Table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Main_Page_TableMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(Main_Page_Table);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "Gauge Chart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel9.setOpaque(false);

        Gauge_Chart_Refresh.setBackground(new java.awt.Color(0, 102, 102));
        Gauge_Chart_Refresh.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Gauge_Chart_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Gauge_Chart_Refresh.setText("Show");
        Gauge_Chart_Refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        Gauge_Chart_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Gauge_Chart_RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Gauge_Chart_RefreshMouseExited(evt);
            }
        });
        Gauge_Chart_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gauge_Chart_RefreshActionPerformed(evt);
            }
        });

        gaugeChart1.setColorTrackStop(new java.awt.Color(0, 204, 51));
        gaugeChart1.setFont(new java.awt.Font("Sitka Text", 0, 15)); // NOI18N
        gaugeChart1.setFontValue(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        gaugeChart1.setMaxValue(70.0F);
        gaugeChart1.setMinValue(0.0F);
        gaugeChart1.setName("Stock"); // NOI18N
        gaugeChart1.setThresholdIndicator(50.0F);
        gaugeChart1.setTitle("Stock");
        gaugeChart1.setTrackStart(70.0F);
        gaugeChart1.setTrackStop(100.0F);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(Gauge_Chart_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Gauge_Chart_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jMenu15.setBorder(null);
        jMenu15.setText("File  ");
        jMenu15.setAlignmentX(0.7F);
        jMenu15.setAutoscrolls(true);
        jMenu15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenu15.setIconTextGap(10);
        jMenu15.setMinimumSize(new java.awt.Dimension(70, 23));

        jMenu16.setText("New Model");
        jMenu16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem7.setText("Stock Add");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem7);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Purchase order");
        jMenu16.add(jMenuItem2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Delivery Order");
        jMenu16.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("Purchase Order");
        jMenu16.add(jMenuItem9);

        jMenu15.add(jMenu16);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Open File");
        jMenu15.add(jMenuItem3);
        jMenu15.add(jSeparator2);

        jMenuItem4.setText("jMenuItem4");
        jMenu15.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu15.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu15.add(jMenuItem6);

        jMenuBar2.add(jMenu15);

        jMenu14.setBorder(null);
        jMenu14.setText("Edit  ");
        jMenu14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu14);

        jMenu13.setBorder(null);
        jMenu13.setText("View");
        jMenu13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        jMenu13.add(jMenuItem1);

        jMenuBar2.add(jMenu13);

        jMenu9.setBorder(null);
        jMenu9.setText("Customers");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu9);

        jMenu8.setBorder(null);
        jMenu8.setText("Help");
        jMenu8.setFocusPainted(true);
        jMenu8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu8);

        jMenu12.setBorder(null);
        jMenu12.setText("Web Access");
        jMenu12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu12);

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

        Intro.setText("Into");
        Intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntroActionPerformed(evt);
            }
        });
        jMenu11.add(Intro);

        Logout1_CreatACcount.setText("Create Account");
        Logout1_CreatACcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1_CreatACcountActionPerformed(evt);
            }
        });
        jMenu11.add(Logout1_CreatACcount);

        jMenuBar2.add(jMenu11);

        jMenu10.setBorder(null);
        jMenu10.setText("Report");
        jMenu10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu10);

        jMenu7.setBorder(null);
        jMenu7.setText("Suppliers");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu7);

        jMenu6.setBorder(null);
        jMenu6.setText("Locations");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu6);

        jMenu5.setBorder(null);
        jMenu5.setText("Category");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Main_Page_TableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_Page_TableMouseMoved
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlcon, user, pass);
            Statement pss = con.createStatement();
            rs = pss.executeQuery(" select Stock_Product_id,Stock_Product_Name,Stock_Product_Quntitiy,Stock_Product_Month from rushi.stock_add ");
            ResultSetMetaData r1=rs.getMetaData();
            int n=r1.getColumnCount();
            DefaultTableModel D1=(DefaultTableModel)Main_Page_Table.getModel();
            D1.setRowCount(0);
            if (rs.next()==true)
            {
                Vector v=new Vector();
                for (int i = 0; i <=n; i++)
                {

                    v.add(rs.getString((1)));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
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
    }//GEN-LAST:event_Main_Page_TableMouseMoved

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

    private void IntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntroActionPerformed
      setVisible(false);
        new Intro12().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_IntroActionPerformed

    private void Gauge_Chart_RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gauge_Chart_RefreshMouseEntered
        Gauge_Chart_Refresh.setBackground(new Color(80, 66, 112));
    }//GEN-LAST:event_Gauge_Chart_RefreshMouseEntered

    private void Gauge_Chart_RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gauge_Chart_RefreshMouseExited
        Gauge_Chart_Refresh.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Gauge_Chart_RefreshMouseExited

    private void Gauge_Chart_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gauge_Chart_RefreshActionPerformed
   gaugeChart1.setValueAnimate(9.5f);
  
    }//GEN-LAST:event_Gauge_Chart_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private com.mycompany.rushi.BlankPlotChart Chart;
    private javax.swing.JButton Gauge_Chart_Refresh;
    private javax.swing.JLabel Home;
    private javax.swing.JMenuItem Intro;
    private javax.swing.JMenuItem Logout1_CreatACcount;
    private javax.swing.JMenuItem Logout_Login;
    private javax.swing.JTextField Low_Product;
    private com.mycompany.rushi.Card22 Low_Product1;
    private javax.swing.JLabel Mail;
    private javax.swing.JTable Main_Page_Table;
    private com.mycompany.rushi.Card22 MostStock1;
    private javax.swing.JTextField Purchasecount;
    private javax.swing.JLabel Setting;
    private javax.swing.JLabel StockAdd;
    private javax.swing.JTextField StockDeliver;
    private com.mycompany.rushi.Card22 StockDelivery1;
    private javax.swing.JLabel Stock_Anlysis;
    private javax.swing.JLabel Stock_Info;
    private javax.swing.JTextField Total_Product;
    private com.mycompany.rushi.Card22 Total_Product1;
    private com.mycompany.rushi.GaugeChart gaugeChart1;
    private com.mycompany.rushi.ImageAvatar imageAvatar1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private com.mycompany.rushi.ZGradient zGradient1;
    // End of variables declaration//GEN-END:variables
}
