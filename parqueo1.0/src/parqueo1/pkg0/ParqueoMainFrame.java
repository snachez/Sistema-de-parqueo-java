package parqueo1.pkg0;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ParqueoMainFrame extends javax.swing.JFrame {

    Parqueo parqueo = new Parqueo();
    JButton[] nButtons = new JButton[18];
    JButton[] rButtons = new JButton[7];

    public ParqueoMainFrame() {
        initComponents();
        initView();
        updateView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jCalendarCombo1 = new org.freixas.jcalendar.JCalendarCombo();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jCalendarCombo2 = new org.freixas.jcalendar.JCalendarCombo();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel2PropertyChange(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(1, 1, 9));
        jButton1.setForeground(new java.awt.Color(191, 80, 80));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton1.setEnabled(false);
        jButton1.setName(""); // NOI18N
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 85, 74));

        jButton2.setBackground(new java.awt.Color(37, 37, 213));
        jButton2.setForeground(new java.awt.Color(170, 89, 89));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 85, 74));

        jButton3.setBackground(new java.awt.Color(37, 37, 213));
        jButton3.setForeground(new java.awt.Color(170, 89, 89));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 85, 74));

        jButton4.setBackground(new java.awt.Color(37, 37, 213));
        jButton4.setForeground(new java.awt.Color(170, 89, 89));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton4.setEnabled(false);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 85, 74));

        jButton5.setBackground(new java.awt.Color(37, 37, 213));
        jButton5.setForeground(new java.awt.Color(170, 89, 89));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 85, 74));

        jButton6.setBackground(new java.awt.Color(37, 37, 213));
        jButton6.setForeground(new java.awt.Color(170, 89, 89));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton6.setEnabled(false);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 85, 74));

        jButton7.setBackground(new java.awt.Color(37, 37, 213));
        jButton7.setForeground(new java.awt.Color(170, 89, 89));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton7.setEnabled(false);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 85, 74));

        jButton8.setBackground(new java.awt.Color(37, 37, 213));
        jButton8.setForeground(new java.awt.Color(170, 89, 89));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton8.setEnabled(false);
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 85, 74));

        jButton9.setBackground(new java.awt.Color(37, 37, 213));
        jButton9.setForeground(new java.awt.Color(170, 89, 89));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton9.setEnabled(false);
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 85, 74));

        jButton10.setBackground(new java.awt.Color(37, 37, 213));
        jButton10.setForeground(new java.awt.Color(170, 89, 89));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton10.setEnabled(false);
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 85, 74));

        jButton11.setBackground(new java.awt.Color(37, 37, 213));
        jButton11.setForeground(new java.awt.Color(170, 89, 89));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton11.setEnabled(false);
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 85, 74));

        jButton12.setBackground(new java.awt.Color(37, 37, 213));
        jButton12.setForeground(new java.awt.Color(170, 89, 89));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton12.setEnabled(false);
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 85, 74));

        jButton13.setBackground(new java.awt.Color(37, 37, 213));
        jButton13.setForeground(new java.awt.Color(170, 89, 89));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton13.setEnabled(false);
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 85, 74));

        jButton14.setBackground(new java.awt.Color(37, 37, 213));
        jButton14.setForeground(new java.awt.Color(170, 89, 89));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton14.setEnabled(false);
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 85, 74));

        jButton15.setBackground(new java.awt.Color(37, 37, 213));
        jButton15.setForeground(new java.awt.Color(170, 89, 89));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton15.setEnabled(false);
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 85, 74));

        jButton16.setBackground(new java.awt.Color(37, 37, 213));
        jButton16.setForeground(new java.awt.Color(170, 89, 89));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton16.setEnabled(false);
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 85, 74));

        jButton17.setBackground(new java.awt.Color(37, 37, 213));
        jButton17.setForeground(new java.awt.Color(170, 89, 89));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton17.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton17.setEnabled(false);
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 85, 74));

        jButton18.setBackground(new java.awt.Color(37, 37, 213));
        jButton18.setForeground(new java.awt.Color(170, 89, 89));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton18.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton18.setEnabled(false);
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 85, 74));

        jButton19.setBackground(new java.awt.Color(37, 37, 213));
        jButton19.setForeground(new java.awt.Color(170, 89, 89));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton19.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 85, 74));

        jButton20.setBackground(new java.awt.Color(37, 37, 213));
        jButton20.setForeground(new java.awt.Color(170, 89, 89));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton20.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_right.png"))); // NOI18N
        jButton20.setEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 85, 74));

        jButton21.setBackground(new java.awt.Color(37, 37, 213));
        jButton21.setForeground(new java.awt.Color(170, 89, 89));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton21.setEnabled(false);
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 85, 74));

        jButton22.setBackground(new java.awt.Color(37, 37, 213));
        jButton22.setForeground(new java.awt.Color(170, 89, 89));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton22.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton22.setEnabled(false);
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 85, 74));

        jButton23.setBackground(new java.awt.Color(37, 37, 213));
        jButton23.setForeground(new java.awt.Color(170, 89, 89));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton23.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton23.setEnabled(false);
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 85, 74));

        jButton24.setBackground(new java.awt.Color(37, 37, 213));
        jButton24.setForeground(new java.awt.Color(170, 89, 89));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton24.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton24.setEnabled(false);
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 85, 74));

        jButton25.setBackground(new java.awt.Color(37, 37, 213));
        jButton25.setForeground(new java.awt.Color(170, 89, 89));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton25.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/car_left.png"))); // NOI18N
        jButton25.setEnabled(false);
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 85, 74));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Espacios Disponibles");
        jLabel4.setAutoscrolls(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 270, 140));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Arial", 1, 48));
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 60, 60));

        jLabel6.setBackground(new java.awt.Color(1, 1, 1));
        jLabel6.setForeground(new java.awt.Color(8, 1, 1));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueo1/pkg0/resources/asfalto_parqueo.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 550));

        jTabbedPane1.addTab("Vista Grafica de espacios", jPanel2);

        jLabel3.setText("Placa");

        jFormattedTextField3.setToolTipText("");
        jFormattedTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField3.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        jFormattedTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField3KeyTyped(evt);
            }
        });
        jFormattedTextField3.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                if (jFormattedTextField3.getText().length() == 6)
                e.consume();
            }

            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }

        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entrada", "Salida" }));

        jLabel5.setText("Entrada/salida");

        jButton26.setText("Procesar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Registro de entradas y salidas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton26)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton26)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Control de Vehículos", jPanel4);

        jLabel1.setText("Nombre Completo:");

        jFormattedTextField1.setVisible(false);
        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField1.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Teléfono:");

        jFormattedTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField2.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyTyped(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                if (jFormattedTextField2.getText().length() == 8)
                e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });

        jFormattedTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField4.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });
        jFormattedTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField4KeyTyped(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                if (jFormattedTextField1.getText().length() == 8)
                e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });

        jFormattedTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField5.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField5ActionPerformed(evt);
            }
        });
        jFormattedTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField5KeyTyped(evt);
            }
        });
        jFormattedTextField5.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0'|| c>'9' || jFormattedTextField5.getText().length() == 8) e.consume();

            }

            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });

        jFormattedTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField6.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField6ActionPerformed(evt);
            }
        });
        jFormattedTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField6KeyTyped(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                if (jFormattedTextField1.getText().length() == 8)
                e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });

        jLabel8.setText("Placa del Vehículo:");

        jLabel9.setText("Identificación:");

        jLabel10.setText("Correo electrónico:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Automovil", "Motocicleta", " " }));
        jComboBox2.setSelectedItem("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Reservaciones");

        jButton28.setText("Procesar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jFormattedTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField7.setMinimumSize(new java.awt.Dimension(27, 27));
        jFormattedTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField7ActionPerformed(evt);
            }
        });
        jFormattedTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField7KeyTyped(evt);
            }
        });
        jFormattedTextField7.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<'0'|| c>'9' || jFormattedTextField7.getText().length() == 9) e.consume();

            }

            public void keyPressed(KeyEvent arg0) {
            }

            public void keyReleased(KeyEvent arg0) {
            }
        });

        jCalendarCombo2.addDateListener(new org.freixas.jcalendar.DateListener() {
            public void dateChanged(org.freixas.jcalendar.DateEvent evt) {
                jCalendarCombo2DateChanged(evt);
            }
        });
        jCalendarCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarCombo2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha Inicio:");

        jLabel15.setText("Fecha Final:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jCalendarCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendarCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, 0, 200, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(79, 79, 79)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCalendarCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalendarCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reservaciones", jPanel1);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initView() {
        nButtons[0] = jButton1;
        nButtons[1] = jButton2;
        nButtons[2] = jButton3;
        nButtons[3] = jButton4;
        nButtons[4] = jButton5;
        nButtons[5] = jButton6;
        nButtons[6] = jButton7;
        nButtons[7] = jButton8;
        nButtons[8] = jButton9;
        nButtons[9] = jButton10;
        nButtons[10] = jButton11;
        nButtons[11] = jButton12;
        nButtons[12] = jButton13;
        nButtons[13] = jButton14;
        nButtons[14] = jButton15;
        nButtons[15] = jButton16;
        nButtons[16] = jButton17;
        nButtons[17] = jButton18;
        rButtons[0] = jButton19;
        rButtons[1] = jButton20;
        rButtons[2] = jButton21;
        rButtons[3] = jButton22;
        rButtons[4] = jButton23;
        rButtons[5] = jButton24;
        rButtons[6] = jButton25;
        for (int i = 0; i < this.nButtons.length; i++) {
            nButtons[i].setVisible(false);
            nButtons[i].setOpaque(false);
            nButtons[i].setContentAreaFilled(false);
            nButtons[i].setBorderPainted(false);
        }
        for (int i = 0; i < this.rButtons.length; i++) {
            rButtons[i].setVisible(false);
            rButtons[i].setOpaque(false);
            rButtons[i].setContentAreaFilled(false);
            rButtons[i].setBorderPainted(false);
        }
        Date fechaInicio = jCalendarCombo1.getDate();
        Date fecha = fechaInicio;
            fecha.setMonth(fechaInicio.getMonth()+1);
            jCalendarCombo2.setDate(fecha);

    }

    private void updateView() {
        for (int i = 0; i < parqueo.espaciosN.length; i++) {
            if (parqueo.espaciosN[i].isOcupado()) {
                nButtons[i].setVisible(true);
            } else {
                nButtons[i].setVisible(false);
            }
        }
        for (int i = 0; i < parqueo.espaciosR.length; i++) {
            if (parqueo.espaciosR[i].isReservado()) {
                rButtons[i].setVisible(true);
            } else {
                rButtons[i].setVisible(false);
            }
        }
        jLabel7.setText("" + parqueo.espNorDisp);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ParqueoAboutFrame about = new ParqueoAboutFrame();
        about.setVisible(true);
        about.setResizable(false);
        about.setLocationRelativeTo(null);
        about.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if (jPanel2.isVisible()) {
            this.updateView();
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained

    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jFormattedTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2KeyTyped

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        String resultString, placa = (String) jFormattedTextField3.getText(), action = (String) jComboBox1.getSelectedItem();
        java.util.Date date = new java.util.Date();

        if (action.equals("Entrada")) {
            String result = this.parqueo.ingresoVehiculo(placa, date);
            switch (result) {
                case "true":
                    resultString = "\n!!! Vehiculo ingresado correctamente !!!";
                    break;
                case "false":
                    resultString = "\n      XXX El vehículo ya se encuentra registrado XXX";
                    break;
                default:
                    resultString = "\n      XXX No quedan espacios disponiles XXX";
                    break;
            }
        } else {
            String result = this.parqueo.salidaVehiculo(placa, date);
            if (result.equals("false")) {
                resultString = "\n       XXX No se encontraron registros XXX";
            } else {
                resultString = "\n Parqueo L.A.\n"
                        + " Tel: 2570-3574\n"
                        + " Abierto 24/7\n\n"
                        + "   =========== Factura =========== \n"
                        + "\n"
                        + result;
            }
        }
        jTextArea1.setText(resultString);
        JOptionPane.showMessageDialog(null,resultString);
        jFormattedTextField3.setText("");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jFormattedTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3KeyTyped

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jPanel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel2PropertyChange

    }//GEN-LAST:event_jPanel2PropertyChange

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained

    }//GEN-LAST:event_jPanel2FocusGained

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jFormattedTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4KeyTyped

    private void jFormattedTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5ActionPerformed

    private void jFormattedTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5KeyTyped

    private void jFormattedTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField6ActionPerformed

    private void jFormattedTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField6KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        
        String tipoVehiculo = (String) jComboBox2.getSelectedItem(), placaVehiculo = jFormattedTextField2.getText(), nombre = jFormattedTextField4.getText(), email = jFormattedTextField6.getText();
        int id = Integer.parseInt(jFormattedTextField7.getText()), telef = Integer.parseInt(jFormattedTextField5.getText());
        Date fechaInicioReserva = jCalendarCombo1.getDate();
        Date fechaFinalReserva = jCalendarCombo2.getDate();
        String factura = parqueo.realizarReservacion(tipoVehiculo, placaVehiculo, nombre, id, telef, email, fechaInicioReserva, fechaFinalReserva);
        jTextArea2.setText(factura);
        parqueo.test();

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jFormattedTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1KeyTyped

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField7ActionPerformed

    private void jFormattedTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField7KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCalendarCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarCombo2ActionPerformed
        Date fechaInicio = jCalendarCombo1.getDate();
    }//GEN-LAST:event_jCalendarCombo2ActionPerformed

    private void jCalendarCombo2DateChanged(org.freixas.jcalendar.DateEvent evt) {//GEN-FIRST:event_jCalendarCombo2DateChanged
        Date fechaInicio = jCalendarCombo1.getDate();
        Date fechaSeleccionada = evt.getSelectedDate().getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
        Integer fec_inicio = Integer.parseInt(format.format(fechaInicio));
        Integer fec_final = Integer.parseInt(format.format(fechaSeleccionada));
        if(fec_final <  fec_inicio)
        {
            Date fecha = fechaInicio;
            fecha.setMonth(fechaInicio.getMonth()+1);
            jCalendarCombo2.setDate(fecha);
        }
        
    }//GEN-LAST:event_jCalendarCombo2DateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParqueoMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
