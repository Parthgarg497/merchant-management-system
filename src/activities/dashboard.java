/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package activities;

/**
 *
 * @author LENOVO
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        dashboardpanel = new javax.swing.JPanel();
        dashboardlabel = new javax.swing.JLabel();
        saleinvoicepanel = new javax.swing.JPanel();
        saleinvoicelabel = new javax.swing.JLabel();
        purchaseinvoicepanel = new javax.swing.JPanel();
        purchaseinvoicelabel = new javax.swing.JLabel();
        stocklistpanel = new javax.swing.JPanel();
        stocklistlabel = new javax.swing.JLabel();
        agencypanel = new javax.swing.JPanel();
        agencylabel = new javax.swing.JLabel();
        logoutpanel = new javax.swing.JPanel();
        logoutlabel = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new java.awt.BorderLayout());

        toppanel.setBackground(new java.awt.Color(255, 204, 0));
        toppanel.setPreferredSize(new java.awt.Dimension(771, 60));

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        mainpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

        leftpanel.setBackground(new java.awt.Color(255, 204, 0));
        leftpanel.setPreferredSize(new java.awt.Dimension(150, 516));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardpanel.setBackground(new java.awt.Color(255, 204, 0));
        dashboardpanel.setLayout(new java.awt.BorderLayout());

        dashboardlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardlabel.setText("Dashboard");
        dashboardlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardlabelMouseClicked(evt);
            }
        });
        dashboardpanel.add(dashboardlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        saleinvoicepanel.setBackground(new java.awt.Color(255, 204, 0));
        saleinvoicepanel.setPreferredSize(new java.awt.Dimension(150, 50));
        saleinvoicepanel.setLayout(new java.awt.BorderLayout());

        saleinvoicelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleinvoicelabel.setText("sale invoice");
        saleinvoicelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleinvoicelabelMouseClicked(evt);
            }
        });
        saleinvoicepanel.add(saleinvoicelabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(saleinvoicepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        purchaseinvoicepanel.setBackground(new java.awt.Color(255, 204, 0));
        purchaseinvoicepanel.setPreferredSize(new java.awt.Dimension(150, 50));
        purchaseinvoicepanel.setLayout(new java.awt.BorderLayout());

        purchaseinvoicelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseinvoicelabel.setText("purchase invoice");
        purchaseinvoicepanel.add(purchaseinvoicelabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(purchaseinvoicepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, -1));

        stocklistpanel.setBackground(new java.awt.Color(255, 204, 0));
        stocklistpanel.setPreferredSize(new java.awt.Dimension(150, 50));
        stocklistpanel.setLayout(new java.awt.BorderLayout());

        stocklistlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocklistlabel.setText("stock list");
        stocklistpanel.add(stocklistlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(stocklistpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, -1));

        agencypanel.setBackground(new java.awt.Color(255, 204, 0));
        agencypanel.setPreferredSize(new java.awt.Dimension(150, 50));
        agencypanel.setLayout(new java.awt.BorderLayout());

        agencylabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agencylabel.setText("agency");
        agencypanel.add(agencylabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(agencypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, -1));

        logoutpanel.setBackground(new java.awt.Color(255, 204, 0));
        logoutpanel.setPreferredSize(new java.awt.Dimension(150, 50));
        logoutpanel.setLayout(new java.awt.BorderLayout());

        logoutlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutlabel.setText("logout");
        logoutpanel.add(logoutlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, -1));

        mainpanel.add(leftpanel, java.awt.BorderLayout.LINE_START);

        rightpanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        mainpanel.add(rightpanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardlabelMouseClicked
        dashboard d= new dashboard();
        d.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_dashboardlabelMouseClicked

    private void saleinvoicelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleinvoicelabelMouseClicked

    }//GEN-LAST:event_saleinvoicelabelMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new dashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agencylabel;
    private javax.swing.JPanel agencypanel;
    private javax.swing.JLabel dashboardlabel;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel purchaseinvoicelabel;
    private javax.swing.JPanel purchaseinvoicepanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel saleinvoicelabel;
    private javax.swing.JPanel saleinvoicepanel;
    private javax.swing.JLabel stocklistlabel;
    private javax.swing.JPanel stocklistpanel;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}