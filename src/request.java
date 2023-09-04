

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class request extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Teacher
     */
    public request() {
        initComponents();
        con = databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        seats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subid = new javax.swing.JTextField();
        cap = new javax.swing.JTextField();
        ava = new javax.swing.JTextField();
        mar = new javax.swing.JTextField();
        wht = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        newTeacher = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        mainmenu = new javax.swing.JButton();
        mainmenu1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        proj = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seats.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REQUEST CLASSROOM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subject Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Availability");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Markerks");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("White Boards");

        subid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subidActionPerformed(evt);
            }
        });

        cap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });

        ava.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaActionPerformed(evt);
            }
        });

        mar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marActionPerformed(evt);
            }
        });

        wht.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        newTeacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newTeacher.setForeground(new java.awt.Color(255, 255, 255));
        newTeacher.setText("NEW");
        newTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeacherActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        mainmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        mainmenu.setText(" BACK");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        mainmenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainmenu1.setForeground(new java.awt.Color(255, 255, 255));
        mainmenu1.setText("MAIN MENU");
        mainmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenu1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Day");

        day.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Projectors");

        proj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Intake");

        inta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Time");

        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.30-11.15", "11.30-14.15" }));

        javax.swing.GroupLayout seatsLayout = new javax.swing.GroupLayout(seats);
        seats.setLayout(seatsLayout);
        seatsLayout.setHorizontalGroup(
            seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proj, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wht, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ava, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seatsLayout.createSequentialGroup()
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(133, 133, 133)
                            .addComponent(subid, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsLayout.createSequentialGroup()
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(seatsLayout.createSequentialGroup()
                                    .addComponent(submit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update))
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(delete)))
                .addGap(33, 33, 33))
            .addGroup(seatsLayout.createSequentialGroup()
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(mainmenu1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        seatsLayout.setVerticalGroup(
            seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatsLayout.createSequentialGroup()
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(newTeacher))
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(subid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsLayout.createSequentialGroup()
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seatsLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addGroup(seatsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ava, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(wht, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(proj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(inta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(submit))
                .addGap(28, 28, 28)
                .addGroup(seatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainmenu)
                    .addComponent(mainmenu1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:  
        try {
            stmt = con.createStatement();

            String sSubId = subid.getText();
            int sCap = Integer.parseInt(cap.getText());
            String sAva = ava.getText();
            int sMar = Integer.parseInt(mar.getText());
            int sWht = Integer.parseInt(wht.getText());
            int sPro = Integer.parseInt(proj.getText());
            int sInta = Integer.parseInt(inta.getText());
            String sDay = day.getText();
            String sTime = time.getSelectedItem().toString();



            String query = "INSERT INTO classrooms (Subject_id,Capacity,availability,markers,white_boards,projectors,Intake,Day,time) VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, sSubId);
            preparedStmt.setInt(2, sCap);
            preparedStmt.setString(3, sAva);
            preparedStmt.setInt(4, sMar);
            preparedStmt.setInt(5, sWht);
            preparedStmt.setInt(6, sPro);
            preparedStmt.setInt(7, sInta);
            preparedStmt.setString(8, sDay);
            preparedStmt.setString(9, sTime);

            preparedStmt.execute();
            JOptionPane.showMessageDialog(null, "ADDED");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:   
        try {
            stmt = con.createStatement();

            String sSubId = subid.getText();

            String query = "SELECT * FROM classrooms";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                if (sSubId == rs.getString("Sucbject_id")) {
                    cap.setText(rs.getString("Capacity"));
                    ava.setText(rs.getString("availability"));
                    mar.setText(rs.getString("markers"));
                    wht.setText(rs.getString("white_boards"));
                    proj.setText(rs.getString("projectors"));
                    inta.setText(rs.getString("Intake"));
                    day.setText(rs.getString("Day"));
                    time.addItem(rs.getString("time"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    public void Reset() {
        subid.setText("");
        ava.setText("");
        mar.setText("");
        wht.setText("");
        cap.setText("");

    }

    private void newTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeacherActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_newTeacherActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            stmt = con.createStatement();

            String sSubId = subid.getText();
            int sCap = Integer.parseInt(cap.getText());
            String sAva = ava.getText();
            int sMar = Integer.parseInt(mar.getText());
            int sWht = Integer.parseInt(wht.getText());
            int sPro = Integer.parseInt(proj.getText());
            int sInta = Integer.parseInt(inta.getText());
            String sDay = day.getText();
            String sTime = time.getSelectedItem().toString();
            String query = "UPDATE classrooms SET Sucbject_id = ?, Capacity = ?, availability = ?, markers = ?, white_boards = ?,projectors = ?, Intake = ?,Day = ?, time = ?  WHERE ClassNumber = ?";

            PreparedStatement preparedStmt = con.prepareStatement(query);

            preparedStmt.setString(1, sSubId);
            preparedStmt.setInt(2, sCap);
            preparedStmt.setString(3, sAva);
            preparedStmt.setInt(4, sMar);
            preparedStmt.setInt(5, sWht);
            preparedStmt.setInt(6, sPro);
            preparedStmt.setInt(7, sInta);
            preparedStmt.setString(8, sDay);
            preparedStmt.setString(9, sTime);

            preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATED");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
     try {
        String sSubId = subid.getText(); // Assuming subid is a string representing the Subject_id

        // Use prepared statement to safely delete the record
        String query = "DELETE FROM classrooms WHERE `classrooms`.`Subject_id` = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, sSubId);
        preparedStatement.executeUpdate();

        Reset();
        JOptionPane.showMessageDialog(null, "DELETED");

    } catch (Exception e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        RequestedList view = new RequestedList();
        view.setVisible(true);
    }//GEN-LAST:event_mainmenuActionPerformed

    private void avaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avaActionPerformed

    private void marActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marActionPerformed

    private void mainmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenu1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home view = new Home();
        view.setVisible(true);
    }//GEN-LAST:event_mainmenu1ActionPerformed

    private void subidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subidActionPerformed

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capActionPerformed

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
            java.util.logging.Logger.getLogger(addClaasroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addClaasroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addClaasroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addClaasroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ava;
    private javax.swing.JTextField cap;
    private javax.swing.JTextField day;
    private javax.swing.JButton delete;
    private javax.swing.JTextField inta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mainmenu;
    private javax.swing.JButton mainmenu1;
    private javax.swing.JTextField mar;
    private javax.swing.JButton newTeacher;
    private javax.swing.JTextField proj;
    private javax.swing.JButton search;
    private javax.swing.JPanel seats;
    private javax.swing.JTextField subid;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JButton update;
    private javax.swing.JTextField wht;
    // End of variables declaration//GEN-END:variables
byte[] photo = null;
    String filename = null;

}
