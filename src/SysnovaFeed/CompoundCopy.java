/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SysnovaFeed;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class CompoundCopy extends javax.swing.JFrame {

    /**
     * Creates new form CompoundCopy
     */
    
    ArrayList CompoundList=new ArrayList();
    ArrayList CompoundIngredient=new ArrayList();
    ArrayList CompoundNutrient=new ArrayList();

    ArrayList previous_list=new ArrayList();

    public CompoundCopy() {
        
        
        initComponents();
    }

    CompoundCopy(String Code,ArrayList p_list){
        //To change body of generated methods, choose Tools | Templates.
            initComponents();
        try {
            
            CompoundList=sqlManager.getCompoundByCode(Code);
                    
            previous_list=p_list;
            


            
        } catch (SQLException ex) {
            Logger.getLogger(CompoundCopy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(CompoundCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
              WindowListener exitListener = new WindowAdapter() {
             public void windowClosing(WindowEvent e) {

                 //this.dispose();

            }
        };

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
        jPanel2 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        saveallbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 470));

        jPanel2.setBackground(new java.awt.Color(57, 63, 63));

        userNameLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(232, 245, 245));
        userNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/profile.png"))); // NOI18N
        userNameLabel.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userNameLabel)
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Compound Copy");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 350));

        codeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Code");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        saveallbtn.setBackground(new java.awt.Color(255, 255, 255));
        saveallbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        saveallbtn.setForeground(new java.awt.Color(255, 255, 255));
        saveallbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/savecolor.png"))); // NOI18N
        saveallbtn.setToolTipText("Save All");
        saveallbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveallbtn.setIconTextGap(5);
        saveallbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveallbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/back.png"))); // NOI18N
        backbtn.setToolTipText("Save All");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.setIconTextGap(5);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel3))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveallbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextFieldActionPerformed

    private void saveallbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveallbtnActionPerformed

        try {
            
            String code=codeTextField.getText();
            //int cmpId=sqlManager.getCompoundIdByCode(code);
            
            if(code.length()<1){
                 JOptionPane.showMessageDialog(null, 
                "Provide Code", "Code Error", JOptionPane.ERROR_MESSAGE);  
                return;
            }
            

                        
            Vector list=(Vector) CompoundList.get(0);
           
            String name=(String) list.get(0);
            String desc=(String) list.get(1);
            int CompoundGroup_ID=(int) list.get(2);
            int CompoundType_ID=(int) list.get(3);
            
            boolean isActiveCheck=(boolean) list.get(4);
            boolean layerCheck=(boolean) list.get(5);
            boolean fishCheck=(boolean) list.get(6);
            boolean otherCheck=(boolean) list.get(7);
            boolean broilerCheck=(boolean) list.get(8);
            int cmpID=(int) list.get(9);
            int priceWeekID=(int) list.get(10);

            
            for(int i=0;i<previous_list.size();i++)
            {
                Vector tableline =(Vector) previous_list.get(i);

//                int Compound_ID=(int) tableline.get(11);
//                if(Compound_ID==Compound_id) continue;

                String cod = (String) tableline.get(0);
                if(code.compareTo(cod)==0){
                    JOptionPane.showMessageDialog(null, 
                     "Code Already Exits", "Code Error", JOptionPane.ERROR_MESSAGE);  
                    return;
                }
//                String name1 = (String) tableline.get(1);
//                if(name1.compareTo(name)==0){
//                    JOptionPane.showMessageDialog(null, 
//                     "Name Already Exits", "Name Error", JOptionPane.ERROR_MESSAGE);  
//                    return;
//                }
            }
            
            
            int Compound_id = sqlManager.copyCompound(0,code,name,desc,CompoundGroup_ID,CompoundType_ID,isActiveCheck,layerCheck,fishCheck,otherCheck,broilerCheck,priceWeekID );
            
            CompoundIngredient=sqlManager.getCompoundingredientdata(cmpID);
            CompoundNutrient=sqlManager.getCompoundnutrientdata(cmpID);
            
            boolean isSuccess1=sqlManager.copyCompoundIngredient(CompoundIngredient,Compound_id);
            boolean isSuccess2=sqlManager.copyCompoundNutrient(CompoundNutrient, Compound_id);


                if(Compound_id>0)
                {
                    JOptionPane.showMessageDialog(null, "Successfully Copied", "Save Successfully", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }  
     
        } catch (SQLException ex) {
            Logger.getLogger(CompoundCopy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(CompoundCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_saveallbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        //        Compound Compound = new Compound();
        //        Compound.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

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
//            java.util.logging.Logger.getLogger(CompoundCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CompoundCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CompoundCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CompoundCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CompoundCopy().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton saveallbtn;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
