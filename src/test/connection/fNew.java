package test.connection;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TAEDA
 */
public class fNew extends javax.swing.JFrame {

    public fNew() throws SQLException {
        initComponents();
        //showData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtMean = new javax.swing.JTextField();
        txtNewVo = new javax.swing.JTextField();
        rbtnNoun = new javax.swing.JRadioButton();
        rbtnAdj = new javax.swing.JRadioButton();
        rbtnVerb = new javax.swing.JRadioButton();
        rbtnAdv = new javax.swing.JRadioButton();
        rbtnConj = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/logo.png"))); // NOI18N

        btnExit.setBackground(new java.awt.Color(0, 102, 102));
        btnExit.setToolTipText("");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/exit.png"))); // NOI18N
        jLabel3.setText("  Back");

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Vocabulary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        txtMean.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMean.setText("Meaning");
        txtMean.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNewVo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNewVo.setText("New Vocabulary");

        buttonGroup1.add(rbtnNoun);
        rbtnNoun.setForeground(new java.awt.Color(255, 255, 255));
        rbtnNoun.setText("noun");

        buttonGroup1.add(rbtnAdj);
        rbtnAdj.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdj.setText("adj");

        buttonGroup1.add(rbtnVerb);
        rbtnVerb.setForeground(new java.awt.Color(255, 255, 255));
        rbtnVerb.setText("verb");

        buttonGroup1.add(rbtnAdv);
        rbtnAdv.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdv.setText("adv");

        buttonGroup1.add(rbtnConj);
        rbtnConj.setForeground(new java.awt.Color(255, 255, 255));
        rbtnConj.setText("conj");

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtnNoun, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbtnVerb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbtnAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbtnConj))
                                .addComponent(rbtnAdj, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtMean)
                        .addComponent(txtNewVo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNewVo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMean, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAdj)
                    .addComponent(rbtnNoun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAdv)
                    .addComponent(rbtnVerb)
                    .addComponent(rbtnConj))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            Connection con = DAO.getConnection();
            if (txtNewVo.getText().equals("") || txtMean.getText().equals("")) {
                showMessageDialog(this, "Empty!");
            } else {
                String check = "SELECT vo FROM dbo.[Favorite] WHERE vo like '" + txtNewVo.getText() + "'";
                var ps = con.prepareStatement(check);
                var rs = ps.executeQuery();
                if (rs.next()) {
                    showMessageDialog(this, "Exists!");
                }
                else{
                    String stt = "";
                    if (rbtnNoun.isSelected()) {
                        stt = "(n)";
                    }
                    if (rbtnVerb.isSelected()) {
                        stt = "(v)";
                    }
                    if (rbtnAdj.isSelected()) {
                        stt = "(adj)";
                    }
                    if (rbtnAdv.isSelected()) {
                        stt = "(adv)";
                    }
                    if(rbtnConj.isSelected()){
                        stt= "(conj)";
                    }
                    String sql = "Insert into Favorite(vo,stt,pro,mean,fav) values (?,?,?,?,?)";
                    try {
                        var ps1 = con.prepareStatement(sql);
                        ps1.setString(1, txtNewVo.getText());
                        ps1.setString(2, stt);
                        ps1.setString(3, "");
                        ps1.setString(4, txtMean.getText());
                        ps1.setString(5, "T");
                        var rs1 = ps1.executeUpdate();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    showMessageDialog(this, "Add successful!");
                    }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(fNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        setColor(btnExit);
        JFrame f = new JFrame("EXIT");
        this.hide();
        new fMyList().setVisible(true);
    }//GEN-LAST:event_btnExitMousePressed
    void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 153, 153));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 102, 102));
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new fNew().setVisible(true);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(fNew.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JPanel btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbtnAdj;
    private javax.swing.JRadioButton rbtnAdv;
    private javax.swing.JRadioButton rbtnConj;
    private javax.swing.JRadioButton rbtnNoun;
    private javax.swing.JRadioButton rbtnVerb;
    private javax.swing.JTextField txtMean;
    private javax.swing.JTextField txtNewVo;
    // End of variables declaration//GEN-END:variables
}
