    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingGUI;

import java.util.ArrayList;
/**
 *
 * @author joeycheng
 */
public class VideoStoreGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form VideoStoreGUI
     */
     private int videoNumber = 0;
     private int totalNumber = 0;
     private ArrayList <VideoTape> videoTapes;
     

       
    public VideoStoreGUI() {
        initComponents();
        videoTapes = new ArrayList<VideoTape>(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsPanel = new javax.swing.JPanel();
        titleLable = new javax.swing.JLabel();
        lengthLable = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        lengthField = new javax.swing.JTextField();
        isOnLoan = new javax.swing.JCheckBox();
        furthestLeft = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        furthestRight = new javax.swing.JButton();
        videoNumberLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Store System");

        detailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(" Tape Details "));

        titleLable.setText("Title");

        lengthLable.setText("Length");

        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        lengthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthFieldActionPerformed(evt);
            }
        });

        isOnLoan.setText("On Loan");
        isOnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isOnLoanActionPerformed(evt);
            }
        });

        furthestLeft.setText("|<");
        furthestLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furthestLeftActionPerformed(evt);
            }
        });

        leftButton.setText("Left");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        rightButton.setText("Right");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        furthestRight.setText(">|");
        furthestRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furthestRightActionPerformed(evt);
            }
        });

        videoNumberLabel.setText("0 of 0");

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(lengthLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthField))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleField)))
                .addGap(18, 18, 18)
                .addComponent(isOnLoan)
                .addGap(29, 29, 29))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addComponent(furthestLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(furthestRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(videoNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLable)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isOnLoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthLable)
                    .addComponent(lengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(furthestLeft)
                    .addComponent(leftButton)
                    .addComponent(rightButton)
                    .addComponent(furthestRight)
                    .addComponent(videoNumberLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        fileHelp.setText("Help");
        menuBar.add(fileHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(deleteButton)
                    .addComponent(applyButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(0, 125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    
    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
       // TODO add your.handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void lengthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthFieldActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        if (videoNumber < totalNumber)
        {
            videoNumber++;
            videoNumberLabel.setText( videoNumber + " " + "of" + " " + totalNumber );
            int videoIndex = videoNumber -1;
            titleField.setText(videoTapes.get(videoIndex).getTitle());
            lengthField.setText("" + videoTapes.get(videoIndex).getLength());
            isOnLoan.setSelected(videoTapes.get(videoIndex).isLent());
        }
        
        
        
    }//GEN-LAST:event_rightButtonActionPerformed

    private void furthestRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furthestRightActionPerformed
        videoNumberLabel.setText(totalNumber + " " + "of" + " " + totalNumber);
        videoNumber = totalNumber;
        int videoIndex = videoNumber - 1;
        titleField.setText(videoTapes.get(videoIndex).getTitle());
        lengthField.setText("" + videoTapes.get(videoIndex).getLength());
        isOnLoan.setSelected(videoTapes.get(videoIndex).isLent());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_furthestRightActionPerformed

    private void furthestLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furthestLeftActionPerformed
        videoNumber = 1;
        videoNumberLabel.setText(videoNumber + " " + "of" + " " + totalNumber);
        int videoIndex = videoNumber - 1;
        titleField.setText(videoTapes.get(videoIndex).getTitle());
        lengthField.setText(" " + videoTapes.get(videoIndex).getLength());
        isOnLoan.setSelected(videoTapes.get(videoIndex).isLent());
        // TODO add your handling code here:
    }//GEN-LAST:event_furthestLeftActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        if (videoNumber < totalNumber )
        {
            videoNumber++;
            videoNumberLabel.setText(videoNumber  + " " + "of" + " " + totalNumber);  
        }// TODO a
        
        else 
        {
            videoNumber++;
            totalNumber++;
            videoNumberLabel.setText(videoNumber + " " + "of" + " " + totalNumber);
            
        }
        
         VideoTape t = new VideoTape((titleField.getText()),Integer.parseInt(lengthField.getText()),isOnLoan.isSelected());   
         videoTapes.add(t);
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed

   
// TODO add your handling code here:
    }//GEN-LAST:event_applyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (videoNumber > 0)
        {
            videoNumber--;
            totalNumber--;
            videoNumberLabel.setText((videoNumber) + "of" + totalNumber);
        }
        
        int videoIndex = videoNumber - 1;
        titleField.setText(videoTapes.get(videoIndex).getTitle());
        lengthField.setText("" + videoTapes.get(videoIndex).getLength());
        isOnLoan.setSelected(videoTapes.get(videoIndex).isLent());
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        if (videoNumber > 1)
        {
            videoNumber--;
            videoNumberLabel.setText((videoNumber) + "of" + totalNumber);
        }// TODO add your handling code here:
        
        int videoIndex = videoNumber - 1;
        titleField.setText(videoTapes.get(videoIndex).getTitle());
        lengthField.setText("" + videoTapes.get(videoIndex).getLength());
        isOnLoan.setSelected(videoTapes.get(videoIndex).isLent());
        
    }//GEN-LAST:event_leftButtonActionPerformed

    private void isOnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isOnLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isOnLoanActionPerformed

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
            java.util.logging.Logger.getLogger(VideoStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoStoreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton applyButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JMenu fileHelp;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton furthestLeft;
    private javax.swing.JButton furthestRight;
    private javax.swing.JCheckBox isOnLoan;
    private javax.swing.JButton leftButton;
    private javax.swing.JTextField lengthField;
    private javax.swing.JLabel lengthLable;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton rightButton;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLable;
    private javax.swing.JLabel videoNumberLabel;
    // End of variables declaration//GEN-END:variables
}
