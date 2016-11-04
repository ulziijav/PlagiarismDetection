/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import plagiarismdetection.PlagiarismDetection;

/**
 *
 * @author Gamer
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Text Documents", "txt"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jButtonCompare = new javax.swing.JButton();
        jButtonSourceText = new javax.swing.JButton();
        jLabelSourceText = new javax.swing.JLabel();
        jLabelURLSourceText = new javax.swing.JLabel();
        jLabelTestText = new javax.swing.JLabel();
        jButtonTestText = new javax.swing.JButton();
        jLabelURLTestText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setPreferredSize(new java.awt.Dimension(800, 650));

        jPanelMain.setBackground(new java.awt.Color(204, 204, 255));

        jPanelTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCompare.setText("Compare");
        jButtonCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompareActionPerformed(evt);
            }
        });

        jButtonSourceText.setText("...");
        jButtonSourceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSourceTextActionPerformed(evt);
            }
        });

        jLabelSourceText.setText("Source text ");

        jLabelURLSourceText.setText(" ");

        jLabelTestText.setText("Test text");

        jButtonTestText.setText("...");
        jButtonTestText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestTextActionPerformed(evt);
            }
        });

        jLabelURLTestText.setPreferredSize(new java.awt.Dimension(3, 14));

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                        .addContainerGap(515, Short.MAX_VALUE)
                        .addComponent(jButtonCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSourceText)
                            .addComponent(jLabelTestText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSourceText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTestText, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelURLSourceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelURLTestText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSourceText)
                    .addComponent(jLabelSourceText)
                    .addComponent(jLabelURLSourceText))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelURLTestText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTestText)
                        .addComponent(jButtonTestText)))
                .addGap(29, 29, 29)
                .addComponent(jButtonCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events"> 
    private void jButtonCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompareActionPerformed
        FileRead();
        Compare();
    }//GEN-LAST:event_jButtonCompareActionPerformed

    private void jButtonTestTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestTextActionPerformed
        SelectedFile(TextType.TEST);
    }//GEN-LAST:event_jButtonTestTextActionPerformed

    private void jButtonSourceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSourceTextActionPerformed
        SelectedFile(TextType.SOURCE);
    }//GEN-LAST:event_jButtonSourceTextActionPerformed
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Methods">
    private void SelectedFile(TextType type) {
        int result;
        result = fc.showOpenDialog(jPanelTop);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            if (type.equals(TextType.SOURCE)) {
                jLabelURLSourceText.setText(selectedFile.getAbsolutePath());
            } else {
                jLabelURLTestText.setText(selectedFile.getPath());
            }
        }
    }

    private void FileRead(){
        try {
            String sourceStr = new String();
            String testStr = new String();
            
            BufferedReader in;
            String line;

            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(jLabelURLSourceText.getText()), "ISO-8859-1"));

            while ((line = in.readLine()) != null) {
                sourceStr += line;                        
            }
            
            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(jLabelURLTestText.getText()), "ISO-8859-1"));

            while ((line = in.readLine()) != null) {
                testStr += line;
            }
            
            SourceText = sourceStr.trim().split(" ");
            TestText = testStr.trim().split(" ");
            System.out.println(SourceText[0]);
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Compare() {
        String result;
        result = PlagiarismDetection.eachWordLCS(SourceText, TestText);
        jEditorPane1.setText(result);
    }
    // </editor-fold>

    private JFileChooser fc;

    private enum TextType {
        SOURCE, TEST
    }
    private String[] SourceText;
    
    private String[] TestText;
    

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCompare;
    private javax.swing.JButton jButtonSourceText;
    private javax.swing.JButton jButtonTestText;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabelSourceText;
    private javax.swing.JLabel jLabelTestText;
    private javax.swing.JLabel jLabelURLSourceText;
    private javax.swing.JLabel jLabelURLTestText;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
