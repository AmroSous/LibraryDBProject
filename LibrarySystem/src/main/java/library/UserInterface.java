/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import javax.swing.JLabel;
import javax.swing.JPanel;
import static library.AdminInterface.chosen;

/**
 *
 * @author google
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    
    public static JPanel displayedPanel;
    public static String username;
    public static int user_id;
    public static JLabel chosen;
    
    public UserInterface(String username, int user_id) {
        this.username = username;
        this.user_id = user_id;
        initComponents();
        displayedPanel = welcomePanel;
        display(welcomePanel);
        this.usernameLabel.setText(username);
        chosenLabel(welcomeLabel);
        chosen = welcomeLabel;
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
        jPanel3 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        issueBookLabel = new javax.swing.JLabel();
        returnBookLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        issueBook1 = new library.IssueBook();
        returnBook1 = new library.ReturnBook();
        account1 = new library.Account();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(857, 592));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Library Management System");

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        welcomeLabel.setBackground(new java.awt.Color(204, 255, 204));
        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome");
        welcomeLabel.setOpaque(true);
        welcomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcomeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcomeLabelMouseExited(evt);
            }
        });

        issueBookLabel.setBackground(new java.awt.Color(204, 255, 204));
        issueBookLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        issueBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issueBookLabel.setText("Issue Book");
        issueBookLabel.setOpaque(true);
        issueBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueBookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issueBookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issueBookLabelMouseExited(evt);
            }
        });

        returnBookLabel.setBackground(new java.awt.Color(204, 255, 204));
        returnBookLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        returnBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnBookLabel.setText("Return Book");
        returnBookLabel.setOpaque(true);
        returnBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBookLabelMouseExited(evt);
            }
        });

        accountLabel.setBackground(new java.awt.Color(204, 255, 204));
        accountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account");
        accountLabel.setOpaque(true);
        accountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountLabelMouseExited(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(204, 255, 204));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Log out");
        jLabel42.setOpaque(true);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(issueBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        welcomePanel.setBackground(new java.awt.Color(255, 255, 255));
        welcomePanel.setMaximumSize(new java.awt.Dimension(736, 388));
        welcomePanel.setMinimumSize(new java.awt.Dimension(736, 388));

        usernameLabel.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(153, 0, 153));
        usernameLabel.setText("Username");

        jLabel34.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Welcome");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\Ahmad\\LibrarySystem\\src\\main\\java\\images\\user.png")); // NOI18N

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(welcomePanel);
        jPanel2.add(issueBook1);
        jPanel2.add(returnBook1);
        jPanel2.add(account1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeLabelMouseClicked
        display(welcomePanel);
        chosenLabel(welcomeLabel);
    }//GEN-LAST:event_welcomeLabelMouseClicked

    private void welcomeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeLabelMouseEntered
        welcomeLabel.setBackground(new java.awt.Color(0, 204, 0));
    }//GEN-LAST:event_welcomeLabelMouseEntered

    private void welcomeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeLabelMouseExited
        if(welcomeLabel != chosen)
            welcomeLabel.setBackground(new java.awt.Color(204,255,204));
    }//GEN-LAST:event_welcomeLabelMouseExited

    private void issueBookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookLabelMouseClicked
        display(issueBook1);   
        chosenLabel(issueBookLabel);
    }//GEN-LAST:event_issueBookLabelMouseClicked

    private void issueBookLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookLabelMouseEntered
        issueBookLabel.setBackground(new java.awt.Color(0, 204, 0));
    }//GEN-LAST:event_issueBookLabelMouseEntered

    private void issueBookLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookLabelMouseExited
        if(issueBookLabel != chosen)
            issueBookLabel.setBackground(new java.awt.Color(204,255,204));
    }//GEN-LAST:event_issueBookLabelMouseExited

    private void returnBookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookLabelMouseClicked
        display(returnBook1);
        chosenLabel(returnBookLabel);
    }//GEN-LAST:event_returnBookLabelMouseClicked

    private void returnBookLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookLabelMouseEntered
        returnBookLabel.setBackground(new java.awt.Color(0, 204, 0));
    }//GEN-LAST:event_returnBookLabelMouseEntered

    private void returnBookLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookLabelMouseExited
        if(returnBookLabel != chosen)
            returnBookLabel.setBackground(new java.awt.Color(204,255,204));
    }//GEN-LAST:event_returnBookLabelMouseExited

    private void accountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountLabelMouseClicked
        display(account1);
        chosenLabel(accountLabel);
    }//GEN-LAST:event_accountLabelMouseClicked

    private void accountLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountLabelMouseEntered
        accountLabel.setBackground(new java.awt.Color(0, 204, 0));
    }//GEN-LAST:event_accountLabelMouseEntered

    private void accountLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountLabelMouseExited
        if(accountLabel != chosen)
            accountLabel.setBackground(new java.awt.Color(204,255,204));
    }//GEN-LAST:event_accountLabelMouseExited

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
        jLabel42.setBackground(new java.awt.Color(0, 204, 0));
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        if(jLabel42 != chosen)
            jLabel42.setBackground(new java.awt.Color(204,255,204));
    }//GEN-LAST:event_jLabel42MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private library.Account account1;
    private javax.swing.JLabel accountLabel;
    private library.IssueBook issueBook1;
    private javax.swing.JLabel issueBookLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private library.ReturnBook returnBook1;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    private void display(JPanel panel) {
        welcomePanel.setVisible(false);
        issueBook1.setVisible(false);
        returnBook1.setVisible(false);
        account1.setVisible(false);
        panel.setVisible(true);
    }
    
    private void chosenLabel(JLabel label){
        welcomeLabel.setBackground(new java.awt.Color(204,255,204));
        issueBookLabel.setBackground(new java.awt.Color(204,255,204));
        returnBookLabel.setBackground(new java.awt.Color(204,255,204));
        accountLabel.setBackground(new java.awt.Color(204,255,204));
        label.setBackground(new java.awt.Color(0, 204, 0));
        chosen = label;
    }
    
    public String getUsername() {return username;}
}
