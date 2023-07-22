
package com.mycompany.rushi;




public class Intro12 extends javax.swing.JFrame {

    public Intro12() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel11 = new com.mycompany.rushi.CurvesPanel1();
        Loadingvalue = new javax.swing.JLabel();
        Loading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Loadingbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Loadingvalue.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        Loadingvalue.setForeground(new java.awt.Color(255, 255, 255));
        Loadingvalue.setText("0%");

        Loading.setFont(new java.awt.Font("Heebo", 1, 18)); // NOI18N
        Loading.setForeground(new java.awt.Color(16, 100, 142));
        Loading.setText("  Loading...");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grap.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout curvesPanel11Layout = new javax.swing.GroupLayout(curvesPanel11);
        curvesPanel11.setLayout(curvesPanel11Layout);
        curvesPanel11Layout.setHorizontalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel11Layout.createSequentialGroup()
                .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Loadingvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        curvesPanel11Layout.setVerticalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel11Layout.createSequentialGroup()
                        .addComponent(Loadingvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvesPanel11Layout.createSequentialGroup()
                        .addComponent(Loading)
                        .addGap(50, 50, 50))))
        );

        Loadingbar.setBackground(new java.awt.Color(255, 255, 255));
        Loadingbar.setForeground(new java.awt.Color(184, 234, 100));
        Loadingbar.setToolTipText("");
        Loadingbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Loadingbar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvesPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Loadingbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(curvesPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Loadingbar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {
    
      Intro12 mysplash =new  Intro12();
       mysplash.setVisible(true);
     //CurvesPanel.start();

               
     
       try
       {
           for(int i=0;i<=100;i++)
           {
               Thread.sleep(70);

                  mysplash.Loadingvalue.setText(i+"%");
                  
                  if(i==10)
                  {
                      mysplash.Loading.setText("Turining on Application..........");
                  }
                   if(i==30)
                  {
                      mysplash.Loading.setText("Loading Module..........");
                  }
                    if(i==50)
                  {
                      mysplash.Loading.setText("Connecting Application..........");
                  }
                     if(i==70)
                  {
                      mysplash.Loading.setText("Connected to Application..........");
                  }
                      if(i==90)
                  {
                      mysplash.Loading.setText("Launching Application..........");
                  }
                  
                      mysplash.Loadingbar.setValue(i);          
           
       }     
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
           
       }
       new KCreate_Page().setVisible(true);
       mysplash.dispose();
    }

 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading;
    private javax.swing.JProgressBar Loadingbar;
    private javax.swing.JLabel Loadingvalue;
    private com.mycompany.rushi.CurvesPanel1 curvesPanel11;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
