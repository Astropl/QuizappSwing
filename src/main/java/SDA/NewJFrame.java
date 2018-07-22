package SDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Astro
 */
public class NewJFrame extends javax.swing.JFrame {


    public NewJFrame() {
        initComponents();
    }

    /**
     *
     */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTxtFieldLogin = new javax.swing.JTextField();
        jTxtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        setjButton3(new javax.swing.JButton());
        setjButton4(new javax.swing.JButton());
        setjButton5(new javax.swing.JButton());
        setjButton6(new javax.swing.JButton());
        setjButton7(new javax.swing.JButton());
        Font font = new Font("Calibri", 1, 18);
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LblDate = new javax.swing.JLabel();
        LblTime = new javax.swing.JLabel();
        jLblMakeTest = new javax.swing.JLabel("Arkusz podawania pytań do testu");
        jTxtPyt1 = new javax.swing.JTextField();
        jTxtPyt2 = new javax.swing.JTextField();
        jTxtPyt3 = new javax.swing.JTextField();
        jTxtPyt4 = new javax.swing.JTextField();
        jTxtPyt5 = new javax.swing.JTextField();
        jBtnAkcpetPytania = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quizapp");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(this.getWidth() / 2, this.getHeight() / 2));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        jButton1.setText("OK");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTxtFieldLogin.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtFieldLogin.setToolTipText("Login");
        jTxtFieldLogin.setAutoscrolls(false);

        jTxtPass.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPass.setToolTipText("Password");
        jTxtPass.setAutoscrolls(false);
        jTxtPass.setName("jTxtPass");

        jTxtPyt1.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPyt1.setToolTipText("Podaj pytanie");


        jTxtPyt2.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPyt2.setToolTipText("Podaj odpowiedz 1");
        jTxtPyt3.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPyt3.setToolTipText("Podaj odpowiedz 2");
        jTxtPyt4.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPyt4.setToolTipText("Podaj odpowiedz 3");
        jTxtPyt5.setFont(new java.awt.Font("Calibri", 1, 18));
        jTxtPyt5.setToolTipText("Podaj odpowiedz 4");


        jButton2.setText("Cancel");
        jButton2.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));
        jPanel2.setFont(new java.awt.Font("Calibri", 1, 18));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quizapp");

        getjButton3().setFont(new java.awt.Font("Calibri", 1, 18));
        getjButton3().setForeground(new java.awt.Color(0, 204, 0));
        getjButton3().setText("Stwórz Test");
        getjButton3().setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        getjButton4().setFont(new java.awt.Font("Calibri", 1, 18));
        getjButton4().setForeground(new java.awt.Color(0, 204, 0));
        getjButton4().setText("Wyslij Test Uczniom");
        getjButton4().setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        getjButton5().setFont(new java.awt.Font("Calibri", 1, 18));
        getjButton5().setForeground(new java.awt.Color(0, 204, 0));
        getjButton5().setText("Wykonaj Test");
        getjButton5().setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        getjButton6().setFont(new java.awt.Font("Calibri", 1, 18));
        getjButton6().setForeground(new java.awt.Color(0, 204, 0));
        getjButton6().setText("Zobacz wyniki");
        getjButton6().setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        getjButton7().setFont(new java.awt.Font("Calibri", 1, 18));
        getjButton7().setText("Koniec");
        getjButton7().setMaximumSize(new java.awt.Dimension(99, 31));
        getjButton7().setMinimumSize(new java.awt.Dimension(99, 31));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        LblDate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDate.setText("ZEGAR");
        LblDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblDate.setName("LblDate");

        LblTime.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTime.setText("ZEGAR");
        LblTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblTime.setName("LblTime");

        jLblMakeTest.setFont(new java.awt.Font("Calibri", 1, 18));
        LblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        //jPanel4.setBackground(Color.WHITE);
        jPanel4.setVisible(false);
        jBtnAkcpetPytania.setText("Dodaj pytanie do bazy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(119, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jTxtFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(57, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                //.addContainerGap())

                        ));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 494, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(jLblMakeTest, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jTxtPyt1, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jTxtPyt2, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jTxtPyt3, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jTxtPyt4, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jTxtPyt5, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)
                        .addComponent(jBtnAkcpetPytania, GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 50, Short.MAX_VALUE)

        );

        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
//                                .addComponent(LblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        //.addComponent(jLblMakeTest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLblMakeTest, GroupLayout.DEFAULT_SIZE, 10, 10)
                                        .addGap(10, 10, Short.SIZE)
                                        .addComponent(jTxtPyt1, GroupLayout.DEFAULT_SIZE, 10, 30)
                                        .addGap(10, 10, Short.SIZE)
                                        .addComponent(jTxtPyt2, GroupLayout.DEFAULT_SIZE, 10, 30)
                                        //.addGap(10, 10, Short.SIZE)
                                        .addComponent(jTxtPyt3, GroupLayout.DEFAULT_SIZE, 10, 30)
                                        //.addGap(80, 80, Short.MAX_VALUE)
                                        .addComponent(jTxtPyt4, GroupLayout.DEFAULT_SIZE, 10, 30)
                                        //.addGap(100, 100, Short.MAX_VALUE)
                                        .addComponent(jTxtPyt5, GroupLayout.DEFAULT_SIZE, 10, 30)
                                        .addGap(10, 10, Short.SIZE)
                                        .addComponent(jBtnAkcpetPytania, GroupLayout.DEFAULT_SIZE, 10, 30)
                        ));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 739, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(145, 245, 245)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(245, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 145, 245)
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.TRAILING)

                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 145, 245)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 145, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 15, 15)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addContainerGap(175, Short.MAX_VALUE)
                                                .addContainerGap(10, Short.MAX_VALUE)

                                )));


        //.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING));
//                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
//                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
//                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
//                        .addGroup(jPanel4Layout.createSequentialGroup()
//                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)


        //**************************

        //*************************
        //jLblMakeTest.setBounds(100,100,50,50);


        setSize(new java.awt.Dimension(1280, 720)); //Ustawienie głownej Formy
        setLocationRelativeTo(null);
    }

    /**
     * @param evt
     */

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        //NewJFrame.setLayout(null);


//        this.setBounds(100, 100, 800, 800);
//        jPanel1.setSize(this.getWidth()/2, this.getHeight()/2);
//
        //this.setExtendedState(this.getExtendedState()|NewJFrame.MAXIMIZED_BOTH);
        //jPanel1.setHorizontalAlignment(jLabel1.CENTER);
        //jPanel1.setHorizontalAlignment(jPanel1.CENTER);
        //this.set

        checkDate();


    }

    public void checkDate() {


        final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//SimpleDateFormat("yyyy/MM/dd HH:mm:ss")


        ActionListener timerListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();

                LblDate.setText(dateFormat.format(date));
                LblTime.setText(timeFormat.format(date));
            }
        };
        Timer timer = new Timer(1000, timerListener);

        timer.setInitialDelay(0);
        timer.start();


    }

    /**
     * @param evt
     */

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        //Stwórz test
        JOptionPane.showMessageDialog(null, "Stwórz test");
        jPanel4.setVisible(true);
        // Label: numer pytania
        // TextField : pytanie
        // Text Filed x3 : Bledne odpowiedzi
        //Text Field : Dobra odpowiedz
        // Button Dodaj pytanie do testu


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        //Wyslij Test Uczniom
        JOptionPane.showMessageDialog(null, "Wyslij Test Uczniom");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        //Wykonaj Test
        JOptionPane.showMessageDialog(null, "Wykonaj Test");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        //Zobacz wyniki
        JOptionPane.showMessageDialog(null, "Zobacz wyniki");
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    /**
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String tempLogNauczyciel = "nauczyciel";
        String tempPassNauczyciel = "123";
        String tempLogUczen = "uczen";
        String tempPassUczen = "123";
        if (jTxtFieldLogin.getText().equals(tempLogNauczyciel) && (jTxtPass.getText().equals(tempPassNauczyciel))) {
            System.out.println("Wejscie jako nauczyciel");
            JOptionPane.showMessageDialog(null, "Zalogowany jako Nauczyciel");

            setButtonsNauczyciel();

        } else if (jTxtFieldLogin.getText().equals(tempLogUczen) && (jTxtPass.getText().equals(tempPassUczen))) {
            System.out.println("wejscie jako Uczen");
            JOptionPane.showMessageDialog(null, "Zalogowany jako Uczen");
            setButtonsUczen();
        }
    }


    public void setButtonsNauczyciel() {
        getjButton3().setEnabled(true);
        getjButton4().setEnabled(true);
        getjButton5().setEnabled(true);
        getjButton6().setEnabled(true);
        jPanel1.setVisible(false);

    }

    /**
     *
     */

    public void setButtonsUczen() {
//        getjButton3().setEnabled(true);
//        getjButton4().setEnabled(true);
        getjButton5().setEnabled(true);
        getjButton6().setEnabled(true);
        jPanel1.setVisible(false);
        //jPanel4.setVisible(true);
    }

    /**
     * @param args
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtFieldLogin;
    private javax.swing.JPasswordField jTxtPass;
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LblTime;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jLblMakeTest;

    private javax.swing.JTextField jTxtPyt1;
    private javax.swing.JTextField jTxtPyt2;
    private javax.swing.JTextField jTxtPyt3;
    private javax.swing.JTextField jTxtPyt4;
    private javax.swing.JTextField jTxtPyt5;
    private javax.swing.JButton jBtnAkcpetPytania;


    //End Variables declaration
    public javax.swing.JButton getjButton3() {

        return jButton3;
    }

    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public javax.swing.JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(javax.swing.JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public javax.swing.JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(javax.swing.JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public javax.swing.JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(javax.swing.JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public javax.swing.JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(javax.swing.JButton jButton7) {
        this.jButton7 = jButton7;
    }


}
