
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucar
 */
public class SecondaPagina extends javax.swing.JFrame {

    /**
     * Creates new form SecondaPagina
     */
    public SecondaPagina() {
        initComponents();

        this.setSize(890,645);
    }
    
    ArrayList <Player> giocatori = new ArrayList();

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
        txtNome = new javax.swing.JTextField();
        lblScelta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnIta = new javax.swing.JButton();
        BtnSpagna = new javax.swing.JButton();
        BtnBelgio = new javax.swing.JButton();
        BtnGermania = new javax.swing.JButton();
        BtnSvizzera = new javax.swing.JButton();
        BtnArgentina = new javax.swing.JButton();
        BtnFrancia = new javax.swing.JButton();
        BtnPortogallo = new javax.swing.JButton();
        BtnBrasile = new javax.swing.JButton();
        BtnGranBretagna = new javax.swing.JButton();
        BtnUsa = new javax.swing.JButton();
        BtnGiappone = new javax.swing.JButton();
        BtnPeru = new javax.swing.JButton();
        BtnOlanda = new javax.swing.JButton();
        BtnCroazia = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        lblNazione = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATI");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSERT NAME:");

        lblScelta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblScelta.setForeground(new java.awt.Color(255, 255, 255));
        lblScelta.setText("CHOOSE A NATION: ");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 10, 10));

        BtnIta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flag_of_Italy.svg.png"))); // NOI18N
        BtnIta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnItaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnIta);

        BtnSpagna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spagna.png"))); // NOI18N
        BtnSpagna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSpagnaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSpagna);

        BtnBelgio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flag_of_Belgium.svg.png"))); // NOI18N
        BtnBelgio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBelgioActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBelgio);

        BtnGermania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/germania.png"))); // NOI18N
        BtnGermania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGermaniaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGermania);

        BtnSvizzera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/svizzera.png"))); // NOI18N
        BtnSvizzera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSvizzeraActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSvizzera);

        BtnArgentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/argentina.png"))); // NOI18N
        BtnArgentina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnArgentinaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnArgentina);

        BtnFrancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/francia.png"))); // NOI18N
        BtnFrancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFranciaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnFrancia);

        BtnPortogallo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portogallo.png"))); // NOI18N
        BtnPortogallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPortogalloActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPortogallo);

        BtnBrasile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flag_of_Brazil.svg.png"))); // NOI18N
        BtnBrasile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrasileActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBrasile);

        BtnGranBretagna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grand bret.png"))); // NOI18N
        BtnGranBretagna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGranBretagnaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGranBretagna);

        BtnUsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/america.png"))); // NOI18N
        BtnUsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnUsa);

        BtnGiappone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/giappone.png"))); // NOI18N
        BtnGiappone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGiapponeActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGiappone);

        BtnPeru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/peru.png"))); // NOI18N
        BtnPeru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPeruActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPeru);

        BtnOlanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/olanda.png"))); // NOI18N
        BtnOlanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOlandaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnOlanda);

        BtnCroazia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/croazia.png"))); // NOI18N
        BtnCroazia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCroaziaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCroazia);

        BtnStart.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        BtnStart.setText("START GAME");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        lblNazione.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        lblNazione.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblScelta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNazione, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnStart)
                .addGap(370, 370, 370))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNazione, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScelta))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BtnStart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        
            if(txtNome.getText().equals("") || lblNazione.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "COMPILE ALL THE FIELDS!", "ERROR", 2);
            }
            else
            {
                Player p= new Player(txtNome.getText(), lblNazione.getText());
                 giocatori.add(p);
            
                TerzaPagina tre = new TerzaPagina();
                tre.setVisible(true);
            }
            
        
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnOlandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOlandaActionPerformed
        lblNazione.setText("NETHERLANDS");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnOlandaActionPerformed

    private void BtnPeruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPeruActionPerformed
        lblNazione.setText("PERU");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnPeruActionPerformed

    private void BtnGiapponeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGiapponeActionPerformed
        lblNazione.setText("JAPAN");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnGiapponeActionPerformed

    private void BtnUsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsaActionPerformed
        lblNazione.setText("USA");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnUsaActionPerformed

    private void BtnGranBretagnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGranBretagnaActionPerformed
        lblNazione.setText("GREAT BRITAIN");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnGranBretagnaActionPerformed

    private void BtnBrasileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrasileActionPerformed
        lblNazione.setText("BRAZIL");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnBrasileActionPerformed

    private void BtnPortogalloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPortogalloActionPerformed
        lblNazione.setText("PORTUGAL");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnPortogalloActionPerformed

    private void BtnFranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFranciaActionPerformed
        lblNazione.setText("FRANCE");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnFranciaActionPerformed

    private void BtnArgentinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnArgentinaActionPerformed
        lblNazione.setText("ARGENTINA");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnArgentinaActionPerformed

    private void BtnSvizzeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSvizzeraActionPerformed
        lblNazione.setText("SWITZERLAND");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnSvizzeraActionPerformed

    private void BtnGermaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGermaniaActionPerformed
        lblNazione.setText("GERMANY");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnGermaniaActionPerformed

    private void BtnBelgioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBelgioActionPerformed
        lblNazione.setText("BELGIUM");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnBelgioActionPerformed

    private void BtnSpagnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSpagnaActionPerformed
        lblNazione.setText("SPAIN");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnSpagnaActionPerformed

    private void BtnItaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnItaActionPerformed
        lblNazione.setText("ITALY");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnItaActionPerformed

    private void BtnCroaziaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCroaziaActionPerformed
        lblNazione.setText("CROATIA");
        lblScelta.setText("NATION SELECTED: ");
    }//GEN-LAST:event_BtnCroaziaActionPerformed

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
            java.util.logging.Logger.getLogger(SecondaPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondaPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondaPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondaPagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondaPagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnArgentina;
    private javax.swing.JButton BtnBelgio;
    private javax.swing.JButton BtnBrasile;
    private javax.swing.JButton BtnCroazia;
    private javax.swing.JButton BtnFrancia;
    private javax.swing.JButton BtnGermania;
    private javax.swing.JButton BtnGiappone;
    private javax.swing.JButton BtnGranBretagna;
    private javax.swing.JButton BtnIta;
    private javax.swing.JButton BtnOlanda;
    private javax.swing.JButton BtnPeru;
    private javax.swing.JButton BtnPortogallo;
    private javax.swing.JButton BtnSpagna;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnSvizzera;
    private javax.swing.JButton BtnUsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNazione;
    private javax.swing.JLabel lblScelta;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
