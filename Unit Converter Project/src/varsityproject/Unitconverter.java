package varsityproject;
import javax.swing.JFrame;
public class Unitconverter extends JFrame {
    double Meter=1.00;
    double Kilometer=0.001;
    double Centimeter=100;
    double Millimeter=1000;
    double Micrometer=1000000;
    double Nanometer=1000000000;
    double Mile=0.0006213689;
    double Yard=1.0936132983;
    double Foot=3.280839895;
    double Inch=39.37007874;

    public Unitconverter() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb1 = new javax.swing.JButton();
        jcmb1 = new javax.swing.JComboBox<>();
        jcmb2 = new javax.swing.JComboBox<>();
        box1 = new javax.swing.JTextField();
        box2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jb2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));

        jb1.setBackground(new java.awt.Color(0, 102, 153));
        jb1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("Convert");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jcmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose one...","Meter","Kilometer","Centimeter","Millimeter","Micrometer","Nanometer","Mile","Yard","Foot","Inch" }));
        jcmb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb1ItemStateChanged(evt);
            }
        });
        jcmb1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jcmb1ComponentShown(evt);
            }
        });
        jcmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb1ActionPerformed(evt);
            }
        });

        jcmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose one...","Meter","Kilometer","Centimeter","Millimeter","Micrometer","Nanometer","Mile","Yard","Foot","Inch" }));
        jcmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb2ActionPerformed(evt);
            }
        });

        box1.setBackground(new java.awt.Color(204, 204, 204));
        box1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setBackground(new java.awt.Color(204, 204, 204));
        box2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Unit Converter");

        jb2.setBackground(new java.awt.Color(0, 102, 153));
        jb2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("Reset");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("To");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("From");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jcmb2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(309, 309, 309))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb2)
                                .addGap(127, 127, 127)))
                        .addComponent(jLabel2)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
      double value = Double.parseDouble(box1.getText());
      if (jcmb1.getSelectedItem().equals("Meter")){
          if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value * Meter);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value * Kilometer);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * Centimeter);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * Millimeter);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * Micrometer);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * Nanometer);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value * Mile);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value * Yard);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value * Foot);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * Inch);
                  box2.setText(cConvert);
              }
          
      }
      else if (jcmb1.getSelectedItem().equals("Kilometer"))
           {
          if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value * 1000.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 100000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 1e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 1e+9);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1e+12);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 1.609);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value * 1093.613);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value * 3280.84);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * 39370.079);
                  box2.setText(cConvert);
              }
      
      }
     else if (jcmb1.getSelectedItem().equals("Centimeter"))
              {
                 if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 100);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 100000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 10);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 10000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1e+7);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 160934.4);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 91.44);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value / 30.48);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value / 2.54);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Milimeter"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 1000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 1e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value / 10);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 1000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 1.609e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 914.4);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value / 304.8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value / 25.4);
                  box2.setText(cConvert);
              }
              }
    else if (jcmb1.getSelectedItem().equals("Micrometer"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 1e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 1e+9);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value / 10000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value / 1000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 1.609e+9);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 914400);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value / 304800);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value / 25400);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Nanometer"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 1e+9);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 1e+12);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value / 1e+7);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value / 1e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value / 1000);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 1.609e+12);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 9.144e+8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value / 3.048e+8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value / 2.54e+7);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Mile"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value * 1609.344);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.609);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 160934.4);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 1.609e+6);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.609e+9);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 1.609e+12);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value * 1760);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value * 5280);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * 63360);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Yard"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 1.094);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 1093.613);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 91.44);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 914.4);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 914400);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 9.144e+8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 1760);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value * 3);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * 36);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Foot"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 3.281);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 3280.84);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 30.48);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 304.8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 304800);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 3.048e+8);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 5280);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 3);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * 12);
                  box2.setText(cConvert);
              }
              }
    else  if (jcmb1.getSelectedItem().equals("Inch"))
              {
                  if(jcmb2.getSelectedItem().equals("Meter"))
              {
                  String cConvert = String.format("%.3f",value / 39.37);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Kilometer"))
              {
                  String cConvert = String.format("%.3f",value / 39370.079);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Centimeter"))
              {
                  String cConvert = String.format("%.3f",value * 2.54);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Millimeter"))
              {
                  String cConvert = String.format("%.3f",value * 25.4);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Micrometer"))
              {
                  String cConvert = String.format("%.3f",value * 25400);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Nanometer"))
              {
                  String cConvert = String.format("%.3f",value * 2.54e+7);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Mile"))
              {
                  String cConvert = String.format("%.3f",value / 63360);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Yard"))
              {
                  String cConvert = String.format("%.3f",value / 36);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Foot"))
              {
                  String cConvert = String.format("%.3f",value / 12);
                  box2.setText(cConvert);
              }
          else if(jcmb2.getSelectedItem().equals("Inch"))
              {
                  String cConvert = String.format("%.3f",value * 1.00);
                  box2.setText(cConvert);
              }
              }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jcmb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb1ItemStateChanged
      
    }//GEN-LAST:event_jcmb1ItemStateChanged

    private void jcmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb1ActionPerformed
        
    }//GEN-LAST:event_jcmb1ActionPerformed

    private void jcmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb2ActionPerformed
        
    }//GEN-LAST:event_jcmb2ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
    
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        
    }//GEN-LAST:event_box2ActionPerformed

    private void jcmb1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jcmb1ComponentShown
        
    }//GEN-LAST:event_jcmb1ComponentShown

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        box1.setText(null);
        box2.setText(null);
        jcmb1.setSelectedIndex(0);
        jcmb2.setSelectedIndex(0);
    }//GEN-LAST:event_jb2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unitconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Unitconverter().setVisible(true);
            new Unitconverter().setTitle("Unit Converter");
            new Unitconverter().setResizable(false);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JComboBox<String> jcmb1;
    private javax.swing.JComboBox<String> jcmb2;
    // End of variables declaration//GEN-END:variables
}
