
package mathematicgame;

/*
@author SuedaSen
 */
public class MathematicGame extends javax.swing.JFrame {
    public MathematicGame() {
        initComponents(); //Proje başlar başlamaz çalışacak olan ilk işlemler
        panel_gamearea.setVisible(false);//İlk açıldığı zaman ekranda görünmesin
    }

    @SuppressWarnings("unchecked")
    String name="";
    int process,a,b,fls=0,tru=0;
    
    public void newQuestion(){
        process=(int)(Math.random()*3+1);//1 ile 3 arasında
        a=(int)(Math.random()*10);//0 ile 9 arasında sayı döndürecel
        b=(int)(Math.random()*10);
        button1_number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/"+String.valueOf(a)+".png")));//0,1,2...9 png var bunların png lerini yazmak yerine bu rastgele değerlerinin sonuna png gelerek al onu butona at
        button2_number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/"+String.valueOf(b)+".png")));
        button_process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i"+String.valueOf(process)+".png")));//i1,i2,,3
    }
    String[] listdata = new String[20];
    int i = 0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_point = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_true = new javax.swing.JLabel();
        jlabel_false = new javax.swing.JLabel();
        jlabel_playername = new javax.swing.JLabel();
        panel_score = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_score = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        panel_gamearea = new javax.swing.JPanel();
        button1_number = new javax.swing.JButton();
        button2_number = new javax.swing.JButton();
        button_process = new javax.swing.JButton();
        textfield_result = new javax.swing.JTextField();
        button_controll = new javax.swing.JButton();
        button_process1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel_playerinformation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        start_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_point.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Point Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setText("True:");

        jLabel3.setText("False:");

        jlabel_true.setText("0");

        jlabel_false.setText("0");

        jlabel_playername.setText("Player");

        javax.swing.GroupLayout panel_pointLayout = new javax.swing.GroupLayout(panel_point);
        panel_point.setLayout(panel_pointLayout);
        panel_pointLayout.setHorizontalGroup(
            panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pointLayout.createSequentialGroup()
                .addGroup(panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_pointLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jlabel_false))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pointLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlabel_true)))
                    .addGroup(panel_pointLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pointLayout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addComponent(jlabel_playername, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        panel_pointLayout.setVerticalGroup(
            panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pointLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jlabel_playername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlabel_true))
                .addGap(18, 18, 18)
                .addGroup(panel_pointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel_false)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_score.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score Situation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jlist_score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jlist_score);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("New Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_scoreLayout = new javax.swing.GroupLayout(panel_score);
        panel_score.setLayout(panel_scoreLayout);
        panel_scoreLayout.setHorizontalGroup(
            panel_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(panel_scoreLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panel_scoreLayout.setVerticalGroup(
            panel_scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_gamearea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 51))); // NOI18N
        panel_gamearea.setForeground(new java.awt.Color(0, 204, 204));

        button1_number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/0.png"))); // NOI18N
        button1_number.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button1_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_numberActionPerformed(evt);
            }
        });

        button2_number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/0.png"))); // NOI18N
        button2_number.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button_process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i1.png"))); // NOI18N
        button_process.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textfield_result.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textfield_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_resultActionPerformed(evt);
            }
        });

        button_controll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/questionmark.png"))); // NOI18N
        button_controll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_controll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_controllActionPerformed(evt);
            }
        });

        button_process1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/equal.png"))); // NOI18N
        button_process1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Result:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("New Question");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_gameareaLayout = new javax.swing.GroupLayout(panel_gamearea);
        panel_gamearea.setLayout(panel_gameareaLayout);
        panel_gameareaLayout.setHorizontalGroup(
            panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_gameareaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addComponent(button1_number, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_process, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2_number, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_process1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addComponent(textfield_result, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_controll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_gameareaLayout.setVerticalGroup(
            panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_gameareaLayout.createSequentialGroup()
                .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(button_process1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_controll, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(button2_number, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1_number, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textfield_result, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(button_process, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel_gameareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_gameareaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_playerinformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter your name");

        text_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        start_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        start_button.setText("Start");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_playerinformationLayout = new javax.swing.GroupLayout(panel_playerinformation);
        panel_playerinformation.setLayout(panel_playerinformationLayout);
        panel_playerinformationLayout.setHorizontalGroup(
            panel_playerinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_playerinformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_playerinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(start_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_playerinformationLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_playerinformationLayout.setVerticalGroup(
            panel_playerinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_playerinformationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_playerinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(start_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_gamearea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_playerinformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_point, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_playerinformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_gamearea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_point.getAccessibleContext().setAccessibleName("Point IInformation");
        panel_score.getAccessibleContext().setAccessibleName("Score");
        panel_playerinformation.getAccessibleContext().setAccessibleName("Player Name");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        text_name.setEnabled(true);
        start_button.setEnabled(true);
        listdata[i] = name + "-" + String.valueOf(tru) + "True- " +"/"+ String.valueOf(fls) + "False- ";
        name = "";
        jlist_score.setListData(listdata);
        panel_gamearea.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button1_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1_numberActionPerformed

    private void button_controllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_controllActionPerformed
        int result=0;
        switch(process){
            case 1:{result=a+b; break;} //toplama işlemi
            case 2:{result=a-b; break;} //çıkarma işlemi
            case 3:{result=a*b; break;} //çarpma işlemi
            case 4:{result=a/b; break;} //bölme işlemi
        }
        int entered_value=Integer.valueOf(textfield_result.getText());
        if (entered_value==result) {
            jLabel6.setText("Congrats, true prediction");
            tru++;
        }
        else{
            jLabel6.setText("Sorry, wrong prediction");
            textfield_result.setText("");
            fls++;

        }
        jlabel_true.setText(String.valueOf(tru));
        jlabel_false.setText(String.valueOf(fls));
    }//GEN-LAST:event_button_controllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newQuestion();
        textfield_result.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        name=text_name.getText();
        text_name.setEnabled(false);
        start_button.setEnabled(false);
        jlabel_playername.setText(name);
        panel_gamearea.setVisible(true);
        newQuestion();
        tru=0;
        fls=0;
        jlabel_true.setText(String.valueOf(tru));
        jlabel_false.setText(String.valueOf(fls));
    }//GEN-LAST:event_start_buttonActionPerformed

    private void textfield_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_resultActionPerformed

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
            java.util.logging.Logger.getLogger(MathematicGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathematicGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathematicGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathematicGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathematicGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1_number;
    private javax.swing.JButton button2_number;
    private javax.swing.JButton button_controll;
    private javax.swing.JButton button_process;
    private javax.swing.JButton button_process1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_false;
    private javax.swing.JLabel jlabel_playername;
    private javax.swing.JLabel jlabel_true;
    private javax.swing.JList<String> jlist_score;
    private javax.swing.JPanel panel_gamearea;
    private javax.swing.JPanel panel_playerinformation;
    private javax.swing.JPanel panel_point;
    private javax.swing.JPanel panel_score;
    private javax.swing.JButton start_button;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField textfield_result;
    // End of variables declaration//GEN-END:variables
}


