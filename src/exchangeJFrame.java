/*
 * Dylan Moore
 * Nov 26 2019
 * Currency exchange algorithm
 */

/**
 *
 * @author dymoo6791
 */
public class exchangeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form exchangeJFrame
     */
    public exchangeJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vrobitInputTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gazoonLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bloinLbl = new javax.swing.JLabel();
        clickwickLbl = new javax.swing.JLabel();
        drobitLbl = new javax.swing.JLabel();
        frazLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        remainingVroLbl = new javax.swing.JLabel();
        exchangeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Currency Exchange");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 20, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Remaining Vrobits");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, 30));

        vrobitInputTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrobitInputTFActionPerformed(evt);
            }
        });
        jPanel1.add(vrobitInputTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter total Vrobits");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 30));

        gazoonLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(gazoonLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total clickwick");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total gazoontight");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total frazoint");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total drobzit");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        bloinLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(bloinLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 150, 30));

        clickwickLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(clickwickLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 30));

        drobitLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(drobitLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, 30));

        frazLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(frazLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total blointoint");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, 30));

        remainingVroLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(remainingVroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 30));

        exchangeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exchangeBtn.setText("Exchange");
        exchangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exchangeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vrobitInputTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vrobitInputTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vrobitInputTFActionPerformed

    private void exchangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangeBtnActionPerformed
        int input = Integer.parseInt(vrobitInputTF.getText());
        int remaining, drob, click, gaz, fraz, bloin;

        drob = input / 100000; //determine how many drobzit are received
        remaining = input % 100000; //declare remaining total

        click = remaining / 50000; //determine how many drobzit are received
        remaining = input % 50000; //update total remaining Vrobits

        gaz = remaining / 10000; //determine how many drobzit are received
        remaining = input % 10000; //update total remaining Vrobits

        fraz = remaining / 1000; //determine how many drobzit are received
        remaining = input % 1000; //update total remaining Vrobits

        bloin = remaining / 500; //determine how many drobzit are received
        remaining = input % 500; //update total remaining Vrobits

        String fOut = String.valueOf(fraz);
        String bOut = String.valueOf(bloin);
        String gOut = String.valueOf(gaz); // set totals to text
        String dOut = String.valueOf(drob);
        String cOut = String.valueOf(click);
        String vOut = String.valueOf(remaining);

        drobitLbl.setText(dOut);
        clickwickLbl.setText(cOut);
        gazoonLbl.setText(gOut); //output totals
        frazLbl.setText(fOut);
        bloinLbl.setText(bOut);
        remainingVroLbl.setText(vOut);


    }//GEN-LAST:event_exchangeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(exchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exchangeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloinLbl;
    private javax.swing.JLabel clickwickLbl;
    private javax.swing.JLabel drobitLbl;
    private javax.swing.JButton exchangeBtn;
    private javax.swing.JLabel frazLbl;
    private javax.swing.JLabel gazoonLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel remainingVroLbl;
    private javax.swing.JTextField vrobitInputTF;
    // End of variables declaration//GEN-END:variables
}
