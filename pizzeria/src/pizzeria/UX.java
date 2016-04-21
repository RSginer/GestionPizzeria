/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw1
 */
public class UX extends javax.swing.JFrame {

    Pizza p;

    /**
     * Creates new form UX
     */
    public UX() {
        initComponents();
        String t = (String) this.tipoPizza.getSelectedItem();
        String tm = (String) this.tamaño.getValue();
        p = new Pizza(0, t, tm, this.listaDeIngredientesExtra.getSelectedValuesList());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoMasa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MasaNormal = new javax.swing.JRadioButton();
        MasaIntegral = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        tamaño = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        tipoPizza = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        ingredientesExtra = new javax.swing.JScrollPane();
        listaDeIngredientesExtra = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        etiquetaMasa = new javax.swing.JLabel();
        masa = new javax.swing.JLabel();
        etiquetaTipoPizza = new javax.swing.JLabel();
        numTipoPizza = new javax.swing.JLabel();
        etiquetaIngredientesExtra = new javax.swing.JLabel();
        numIngredientesExtra = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        eur = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticket = new javax.swing.JTextArea();
        nombre = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        cambiarCarta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        MasaNormal.setBackground(new java.awt.Color(255, 0, 0));
        GrupoMasa.add(MasaNormal);
        MasaNormal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MasaNormal.setForeground(new java.awt.Color(255, 255, 255));
        MasaNormal.setSelected(true);
        MasaNormal.setText("Normal");
        MasaNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MasaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasaNormalActionPerformed(evt);
            }
        });

        MasaIntegral.setBackground(new java.awt.Color(255, 0, 0));
        GrupoMasa.add(MasaIntegral);
        MasaIntegral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MasaIntegral.setForeground(new java.awt.Color(255, 255, 255));
        MasaIntegral.setText("Integral");
        MasaIntegral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MasaIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasaIntegralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MasaNormal)
                    .addComponent(MasaIntegral))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MasaNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MasaIntegral)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tamaño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tamaño.setModel(new javax.swing.SpinnerListModel(new String[] {"Pequeña", "Mediana", "Familiar"}));
        tamaño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tamaño.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamañoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tipoPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoPizza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basica", "Cuatro Quesos", "Barbacoa", "Mexicana" }));
        tipoPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPizza, 0, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingredientes Extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        listaDeIngredientesExtra.setBackground(new java.awt.Color(255, 51, 51));
        listaDeIngredientesExtra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaDeIngredientesExtra.setForeground(new java.awt.Color(255, 255, 255));
        listaDeIngredientesExtra.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sin ingrediente extra", "Jamon", "Queso", "Tomate", "Cebolla", "Olivas", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaDeIngredientesExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaDeIngredientesExtra.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDeIngredientesExtraValueChanged(evt);
            }
        });
        ingredientesExtra.setViewportView(listaDeIngredientesExtra);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingredientesExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingredientesExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Javapizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaMasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaMasa.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaMasa.setText("Masa");

        masa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        masa.setForeground(new java.awt.Color(255, 255, 255));
        masa.setText("0");

        etiquetaTipoPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaTipoPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTipoPizza.setText("Tipo pizza");

        numTipoPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numTipoPizza.setForeground(new java.awt.Color(255, 255, 255));
        numTipoPizza.setText("0");

        etiquetaIngredientesExtra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaIngredientesExtra.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaIngredientesExtra.setText("Ingredientes extra");

        numIngredientesExtra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numIngredientesExtra.setForeground(new java.awt.Color(255, 255, 255));
        numIngredientesExtra.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(etiquetaMasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(masa))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(etiquetaTipoPizza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numTipoPizza))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(etiquetaIngredientesExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numIngredientesExtra)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMasa)
                    .addComponent(masa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTipoPizza)
                    .addComponent(numTipoPizza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaIngredientesExtra)
                    .addComponent(numIngredientesExtra))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        etiquetaTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTotal.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTotal.setText("TOTAL");

        total.setBackground(new java.awt.Color(255, 204, 204));
        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setText("0");
        total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        total.setEnabled(false);

        eur.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eur.setForeground(new java.awt.Color(255, 255, 255));
        eur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eur.setText("€");

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        ticket.setEditable(false);
        ticket.setColumns(20);
        ticket.setRows(5);
        jScrollPane1.setViewportView(ticket);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeria/logolavera-400x100.png"))); // NOI18N
        nombre.setToolTipText("");

        Imprimir.setBackground(new java.awt.Color(153, 153, 153));
        Imprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(51, 51, 51));
        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeria/imprimir.png"))); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(etiquetaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaTotal))
                    .addComponent(eur))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        cambiarCarta.setBackground(new java.awt.Color(255, 0, 0));
        cambiarCarta.setText("Cambiar carta");
        cambiarCarta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarCartaMouseClicked(evt);
            }
        });
        jMenuBar1.add(cambiarCarta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MasaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasaNormalActionPerformed
        this.masa.setText("9");
        p.setMasa(9);
        p.calcularPrecio();
        this.total.setText(p.totalFormat);
         this.ticket.setText(p.pedido());
    }//GEN-LAST:event_MasaNormalActionPerformed

    private void MasaIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasaIntegralActionPerformed
        this.masa.setText("9.5");
        p.setMasa(9.5);
        p.calcularPrecio();
        this.total.setText(p.totalFormat);
         this.ticket.setText(p.pedido());
    }//GEN-LAST:event_MasaIntegralActionPerformed

    private void tipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPizzaActionPerformed
        String pizza = (String) this.tipoPizza.getSelectedItem();
        p.setTipo(pizza);
        this.precioTipoPizza = p.calculaTipo();
        this.numTipoPizza.setText(precioTipoPizza + "");
        p.calcularPrecio();
        this.total.setText(p.totalFormat);
         this.ticket.setText(p.pedido());
    }//GEN-LAST:event_tipoPizzaActionPerformed

    private void listaDeIngredientesExtraValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDeIngredientesExtraValueChanged
        List<String> listaIngredientes = this.listaDeIngredientesExtra.getSelectedValuesList();
        p.setListaIngredientes(listaIngredientes);
        this.precioIngredientes = p.calculaIngredientes();
        this.numIngredientesExtra.setText(this.precioIngredientes + "");
        p.calcularPrecio();
        this.total.setText(p.totalFormat);
        this.ticket.setText(p.pedido());
    }//GEN-LAST:event_listaDeIngredientesExtraValueChanged

    private void tamañoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamañoStateChanged
        String tamañoPizza = (String) this.tamaño.getValue();
        p.setTamaño(tamañoPizza);
        p.calcularPrecio();
        this.total.setText(p.totalFormat);
         this.ticket.setText(p.pedido());
    }//GEN-LAST:event_tamañoStateChanged

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
      
            
        try {
            p.imprimirTicket(contador);
            contador++;
        } catch (IOException ex) {
            Logger.getLogger(UX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ImprimirActionPerformed

    private void cambiarCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarCartaMouseClicked
        
    }//GEN-LAST:event_cambiarCartaMouseClicked

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
            java.util.logging.Logger.getLogger(UX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UX().setVisible(true);
            }
        });
    }
    int contador=0;
    double precioTipoPizza = 0;
    double precioIngredientes = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoMasa;
    private javax.swing.JButton Imprimir;
    private javax.swing.JRadioButton MasaIntegral;
    private javax.swing.JRadioButton MasaNormal;
    private javax.swing.JMenu cambiarCarta;
    private javax.swing.JLabel etiquetaIngredientesExtra;
    private javax.swing.JLabel etiquetaMasa;
    private javax.swing.JLabel etiquetaTipoPizza;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel eur;
    private javax.swing.JScrollPane ingredientesExtra;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaDeIngredientesExtra;
    private javax.swing.JLabel masa;
    private javax.swing.JButton nombre;
    private javax.swing.JLabel numIngredientesExtra;
    private javax.swing.JLabel numTipoPizza;
    private javax.swing.JSpinner tamaño;
    private javax.swing.JTextArea ticket;
    private javax.swing.JComboBox tipoPizza;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
