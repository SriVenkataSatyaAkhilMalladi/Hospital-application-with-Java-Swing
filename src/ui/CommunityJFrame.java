/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import model.CommunityList;
import model.PersonList;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class CommunityJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CommunityJFrame
     */
    
    CommunityList communitylist;
    PersonList Personlist;    
    public CommunityJFrame() {
        initComponents();
        CommunityList communitylist = new CommunityList();
        Personlist = new PersonList();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        CommRightPanel = new javax.swing.JPanel();
        CommWelcomeLabel = new javax.swing.JLabel();
        CommLeftPanel = new javax.swing.JPanel();
        AddCommButton = new javax.swing.JButton();
        ViewCommButton = new javax.swing.JButton();
        CHomeButton = new javax.swing.JButton();
        CAddPersonButton = new javax.swing.JButton();
        CviewPersonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CommWelcomeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        CommWelcomeLabel.setForeground(new java.awt.Color(0, 51, 204));
        CommWelcomeLabel.setText("Welcome to the Community!!!");

        javax.swing.GroupLayout CommRightPanelLayout = new javax.swing.GroupLayout(CommRightPanel);
        CommRightPanel.setLayout(CommRightPanelLayout);
        CommRightPanelLayout.setHorizontalGroup(
            CommRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CommRightPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(CommWelcomeLabel)
                .addGap(17, 17, 17))
        );
        CommRightPanelLayout.setVerticalGroup(
            CommRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommRightPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CommWelcomeLabel)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(CommRightPanel);

        AddCommButton.setText("Add Community");
        AddCommButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCommButtonActionPerformed(evt);
            }
        });

        ViewCommButton.setText("View Community");
        ViewCommButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCommButtonActionPerformed(evt);
            }
        });

        CHomeButton.setText("Home");
        CHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHomeButtonActionPerformed(evt);
            }
        });

        CAddPersonButton.setText("Add Person");
        CAddPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAddPersonButtonActionPerformed(evt);
            }
        });

        CviewPersonButton.setText("View Person");
        CviewPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CviewPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CommLeftPanelLayout = new javax.swing.GroupLayout(CommLeftPanel);
        CommLeftPanel.setLayout(CommLeftPanelLayout);
        CommLeftPanelLayout.setHorizontalGroup(
            CommLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CommLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CAddPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHomeButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCommButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewCommButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CviewPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CommLeftPanelLayout.setVerticalGroup(
            CommLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CommLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CHomeButton)
                .addGap(39, 39, 39)
                .addComponent(AddCommButton)
                .addGap(12, 12, 12)
                .addComponent(ViewCommButton)
                .addGap(12, 12, 12)
                .addComponent(CAddPersonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CviewPersonButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(CommLeftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddCommButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCommButtonActionPerformed
        // TODO add your handling code here:
        AddCommunityJPanel addPanel = new AddCommunityJPanel(communitylist);
        jSplitPane1.setRightComponent(addPanel);
    }//GEN-LAST:event_AddCommButtonActionPerformed

    private void ViewCommButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCommButtonActionPerformed
        // TODO add your handling code here:
        ViewCommunityJPanel viewPanel = new ViewCommunityJPanel(communitylist);
        jSplitPane1.setRightComponent(viewPanel);
    }//GEN-LAST:event_ViewCommButtonActionPerformed

    private void CHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHomeButtonActionPerformed
        // TODO add your handling code here:
        PrimaryFrame mainframe = new PrimaryFrame();
        mainframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CHomeButtonActionPerformed

    private void CAddPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAddPersonButtonActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel addPanel = new AddPersonJPanel(Personlist);
        jSplitPane1.setRightComponent(addPanel);
    }//GEN-LAST:event_CAddPersonButtonActionPerformed

    private void CviewPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CviewPersonButtonActionPerformed
        // TODO add your handling code here:
        ViewPersonJPanel viewPanel = new ViewPersonJPanel(Personlist);
        jSplitPane1.setRightComponent(viewPanel);
    }//GEN-LAST:event_CviewPersonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCommButton;
    private javax.swing.JButton CAddPersonButton;
    private javax.swing.JButton CHomeButton;
    private javax.swing.JPanel CommLeftPanel;
    private javax.swing.JPanel CommRightPanel;
    private javax.swing.JLabel CommWelcomeLabel;
    private javax.swing.JButton CviewPersonButton;
    private javax.swing.JButton ViewCommButton;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}

