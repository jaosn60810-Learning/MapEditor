/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapGen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import mapGen.utils.Input;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author goust
 */
public class MapGenGUI extends JFrame {

    private class MapPairButton extends JButton {

        public Color color() {
            return color;
        }

        public String path() {
            return path;
        }

        public int iconW() {
            return iconW;
        }

        public int iconH() {
            return iconH;
        }

        public BufferedImage Image() {
            return bi;
        }

        public String name() {
            return name;
        }

        private String name;
        private Color color;
        private String path;
        private int iconW;
        private int iconH;
        private BufferedImage bi;

        public MapPairButton(String name, Color color, String path, int iconW, int iconH) {
            this.name = name;
            this.color = color;
            this.path = path;
            this.iconW = iconW;
            this.iconH = iconH;
            setBufferedImage();
        }

        private void setBufferedImage() {
            try {
                bi = ImageIO.read(new File(path)); // 讀檔案
            } catch (Exception e) {
            }
        }
    }

    private void jScrollPane3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public MapGenGUI() {
        initComponents();
        jScrollPane3.getViewport().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (bitmap != null) {
                    editAreaRepaint();
                }
            }
        });
        //設定初始按鈕顏色
        jButton8.setBackground(color);
        paintHeight = itemUnit;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - jason
    private void initComponents() {
        panel1 = new JPanel();
        jButton1 = new JButton();
        jButton7 = new JButton();
        jTextField3 = new JTextField();
        jButton8 = new JButton();
        jLabel3 = new JLabel();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jScrollPane1 = new JScrollPane();
        jPanel3 = new JPanel();
        panel2 = new JPanel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jButton9 = new JButton();
        jTextField6 = new JTextField();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        panel3 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jScrollPane3 = new JScrollPane();
        jPanel1 = new JPanel();
        panel4 = new JPanel();
        jButton4 = new JButton();
        jButton3 = new JButton();
        panel5 = new JPanel();
        jButton2 = new JButton();
        jColorChooser1 = new JColorChooser();
        jToolBar1 = new JToolBar();
        jPopupMenu1 = new JPopupMenu();
        jFileChooser1 = new JFileChooser();
        jPopupMenu2 = new JPopupMenu();
        jFileChooser2 = new JFileChooser();
        jPopupMenu3 = new JPopupMenu();
        jMenu1 = new JMenu();
        jPopupMenu4 = new JPopupMenu();
        jPopupMenu5 = new JPopupMenu();
        popupMenu1 = new PopupMenu();
        jFileChooser3 = new JFileChooser();
        jFileChooser4 = new JFileChooser();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(14, 37));
        setMaximizedBounds(new Rectangle(0, 0, 0, 0));
        setResizable(false);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );

            //---- jButton1 ----
            jButton1.setText("\u65b0\u589e");
            jButton1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
            jButton1.addActionListener(e -> jButton1ActionPerformed(e));

            //---- jButton7 ----
            jButton7.setText("\u9078\u64c7\u7d20\u6750");
            jButton7.setHorizontalTextPosition(SwingConstants.CENTER);
            jButton7.addActionListener(e -> jButton7ActionPerformed(e));

            //---- jTextField3 ----
            jTextField3.setText("Name");
            jTextField3.addActionListener(e -> jTextField3ActionPerformed(e));

            //---- jButton8 ----
            jButton8.setText("\u984f\u8272");
            jButton8.addActionListener(e -> jButton8ActionPerformed(e));

            //---- jLabel3 ----
            jLabel3.setText("x");

            //---- jTextField4 ----
            jTextField4.setText("1");
            jTextField4.addActionListener(e -> jTextField4ActionPerformed(e));

            //---- jTextField5 ----
            jTextField5.setText("1");
            jTextField5.addActionListener(e -> jTextField5ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5))
                                    .addComponent(jTextField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8)
                                    .addComponent(jButton1)))
                            .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== jScrollPane1 ========
        {
            jScrollPane1.setAutoscrolls(true);
            jScrollPane1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jScrollPane1MouseClicked(e);
                }
            });

            //======== jPanel3 ========
            {

                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGap(0, 319, Short.MAX_VALUE)
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup()
                        .addGap(0, 1081, Short.MAX_VALUE)
                );
            }
            jScrollPane1.setViewportView(jPanel3);
        }

        //======== panel2 ========
        {

            //---- jTextField1 ----
            jTextField1.setText("30");
            jTextField1.addActionListener(e -> jTextField1ActionPerformed(e));

            //---- jTextField2 ----
            jTextField2.setText("30");
            jTextField2.addActionListener(e -> jTextField2ActionPerformed(e));

            //---- jButton9 ----
            jButton9.setText("\u8a2d\u7f6e");
            jButton9.addActionListener(e -> jButton9ActionPerformed(e));

            //---- jTextField6 ----
            jTextField6.setText("32");
            jTextField6.addActionListener(e -> jTextField6ActionPerformed(e));

            //---- jLabel4 ----
            jLabel4.setText("\u55ae\u4f4d: ");

            //---- jLabel5 ----
            jLabel5.setText("\u683c\u5b50\u9577\u5bec");

            //---- jLabel1 ----
            jLabel1.setText("x");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton9))
                        .addContainerGap(95, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addContainerGap())
            );
        }

        //======== panel3 ========
        {

            //---- jButton5 ----
            jButton5.setIcon(new ImageIcon(getClass().getResource("/zoom_out.png")));
            jButton5.setToolTipText("\u653e\u5927");
            jButton5.addActionListener(e -> jButton5ActionPerformed(e));

            //---- jButton6 ----
            jButton6.setIcon(new ImageIcon(getClass().getResource("/zoom_in.png")));
            jButton6.setToolTipText("\u7e2e\u5c0f");
            jButton6.addActionListener(e -> jButton6ActionPerformed(e));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(jButton6)
                            .addComponent(jButton5))
                        .addGap(0, 6, Short.MAX_VALUE))
            );
        }

        //======== jScrollPane3 ========
        {
            jScrollPane3.setAutoscrolls(true);
            jScrollPane3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jScrollPane3MouseClicked(e);
                }
            });

            //======== jPanel1 ========
            {
                jPanel1.addMouseMotionListener(new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        jPanel1MouseDragged(e);
                    }
                });
                jPanel1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jPanel1MouseClicked(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        jPanel1MousePressed(e);
                    }
                });

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup()
                        .addGap(0, 991, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup()
                        .addGap(0, 653, Short.MAX_VALUE)
                );
            }
            jScrollPane3.setViewportView(jPanel1);
        }

        //======== panel4 ========
        {

            //---- jButton4 ----
            jButton4.setToolTipText("\u8f38\u51fa\u6a94\u6848");
            jButton4.setIcon(new ImageIcon(getClass().getResource("/export.png")));
            jButton4.addActionListener(e -> jButton4ActionPerformed(e));

            //---- jButton3 ----
            jButton3.setToolTipText("\u8f38\u5165\u6a94\u6848");
            jButton3.setIcon(new ImageIcon(getClass().getResource("/import.png")));
            jButton3.addActionListener(e -> jButton3ActionPerformed(e));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel4Layout.createParallelGroup()
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel5 ========
        {

            //---- jButton2 ----
            jButton2.setToolTipText("\u6e05\u9664\u683c\u5b50\u7d20\u6750");
            jButton2.setIcon(new ImageIcon(getClass().getResource("/eraser.png")));
            jButton2.addActionListener(e -> jButton2ActionPerformed(e));

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jButton2))
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(82, 82, 82)
                            .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
                    .addGap(0, 0, 0))
        );
        setSize(1175, 670);
        setLocationRelativeTo(getOwner());

        //======== jToolBar1 ========
        {
            jToolBar1.setRollover(true);
        }

        //======== jMenu1 ========
        {
            jMenu1.setText("jMenu1");
        }

        //======== popupMenu1 ========
        {
            popupMenu1.setLabel("popupMenu1");
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //地圖寬度
        String tmpStr = Input.filterNumber(jTextField1.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapW = (tmpi > 0) ? tmpi : mapW;
        jTextField1.setText(String.format("%d", mapW));
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        paintHeight++;
        //修正列印寬度
        mapParaCaculate();
        
        //修正畫布尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, (int)(mapH*1.5) * paintHeight));
        
        editAreaRepaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//補充取得資訊 避免遺漏
        name = this.jTextField3.getText();

        String str = Input.filterNumber(jTextField4.getText());
        int tmpW = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconW = (tmpW > 0) ? tmpW : iconW;
        jTextField4.setText(String.format("%d", iconW));

        str = Input.filterNumber(jTextField5.getText());
        int tmpH = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconH = (tmpH > 0) ? tmpH : iconH;
        jTextField5.setText(String.format("%d", iconH));

        //檢查資訊 黑色為預設位置為空 
        if ((name.length() > 0) && (path.length() > 1) && (iconW >= 1) && iconH >= 1 && color != Color.black) {
            //檢查items是否有重複(名稱、色號、路徑)
            ArrayList<MapPairButton> tmp = items.stream()
                    .filter(mapPair -> mapPair.name().equals(name)
                    || mapPair.path().equals(path)
                    || mapPair.color().equals(color))
                    .collect(Collectors.toCollection(ArrayList::new));
            if (tmp.isEmpty()) { //都沒查找到物件
                //若無則新增到Items內
                MapPairButton jb = new MapPairButton(name, color, path, iconW, iconH);
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editJB = jb;
                        System.out.println("Path = " + editJB.path());
                        System.out.println("Color = " + editJB.color());
                        System.out.println("(W,H) = (" + editJB.iconW() + "," + editJB.iconH() + ")");
                        System.out.println("name = " + editJB.name());
                    }
                });
                items.add(jb);
                paintItems(jb);

                //完成新增 重置編輯區
                initMapPairEditor();
                jTextField3.setText(name);
                jButton8.setBackground(color);
                setIcon(null, jButton7);
                jTextField4.setText(String.format("%d", iconW));
                jTextField5.setText(String.format("%d", iconH));

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void paintItems(MapPairButton jb) {
        int buttonSize = 80;
        int gap = (jScrollPane1.getWidth() - 18 - buttonSize * 3) / 4;
        int tmpi = items.size() - 1;
        int locationX = gap + (gap + buttonSize) * (tmpi % 3);
        int locationY = gap + (gap + buttonSize) * (tmpi / 3);
        jb.setBounds(locationX, locationY, buttonSize, buttonSize);  //自行決定元件位置與大小
        jb.setBackground(jb.color());
        setIcon(jb.path(), jb);
        if (locationY + (gap + buttonSize) > jPanel3.getHeight()) {
            jPanel3.setPreferredSize(new Dimension(jPanel3.getWidth(), locationY + (gap + buttonSize)));//修正panel高度
        }
        jPanel3.add(jb);
        jPanel3.repaint();
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("BMP,PNG and GIF images", "bmp", "png", "gif", "jpg");
        chooser.addChoosableFileFilter(filter);
        int flag = chooser.showOpenDialog(null);
        if (flag == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getPath();
            setIcon(path, jButton7);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        String str = Input.filterNumber(jTextField4.getText());
        int tmpW = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconW = (tmpW > 0) ? tmpW : iconW;
        jTextField4.setText(String.format("%d", iconW));
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        String str = Input.filterNumber(jTextField5.getText());
        int tmpH = (str.length() > 0) ? Integer.parseInt(str) : 0;
        iconH = (tmpH > 0) ? tmpH : iconH;
        jTextField5.setText(String.format("%d", iconH));
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        color = JColorChooser.showDialog(null, "color", Color.black);
        jButton8.setBackground(color);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //再次取得資訊
        //uint更新
        String tmpStr = Input.filterNumber(jTextField6.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        itemUnit = (tmpi > 0) ? tmpi : itemUnit;
        jTextField6.setText(String.format("%d", itemUnit));

        //地圖寬度
        tmpStr = Input.filterNumber(jTextField1.getText());
        tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapW = (tmpi > 0) ? tmpi : mapW;
        jTextField1.setText(String.format("%d", mapW));
        // BMP 地圖高度
        tmpStr = Input.filterNumber(jTextField2.getText());
        tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapH = (tmpi > 0) ? tmpi : mapH;
        jTextField2.setText(String.format("%d", mapH));

        bitmap = map(mapW, mapH, Color.black);//若無 則新建(目前點set就全新)
        System.out.println("build bitmap");

        //調整jpanel1的尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, mapH * paintHeight));

        //繪製地圖區
        editAreaRepaint();

    }//GEN-LAST:event_jButton9ActionPerformed
    private void mapParaCaculate() {
        //繪製寬度 上下限
        paintHeight = (paintHeight > (int) (itemUnit * 1.5)) ? (int) (itemUnit * 1.5) : paintHeight;//最多放大到1.5倍
        paintHeight = (paintHeight < 10) ? 10 : paintHeight;

    }

    private void editAreaRepaint() {

        //修正列印寬度
        mapParaCaculate();

        Graphics g = jPanel1.getGraphics();
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());//清除畫面

        for (int i = 0; i < bitmap.getWidth(); i++) {
            for (int j = 0; j < bitmap.getHeight(); j++) {
                int tmpi = bitmap.getRGB(i, j);
                ArrayList<MapPairButton> tmp = items.stream()
                        .filter(mapPair -> mapPair.color().getRGB() == tmpi)
                        .collect(Collectors.toCollection(ArrayList::new));
                if (!tmp.isEmpty()) {
                    //取得配對圖案
                    if (paintHeight < 20) {
                        //畫色塊
                        Color color = new Color(bitmap.getRGB(i, j));
                        BufferedImage c = map(paintHeight, paintHeight, color);
                        g.drawImage(c, i * paintHeight, j * paintHeight, paintHeight, paintHeight, null);
                    } else {
                        g.drawImage(tmp.get(0).Image(), i * paintHeight, j * paintHeight, tmp.get(0).iconW * paintHeight, tmp.get(0).iconH * paintHeight, null);
                    }
                }
            }
        }

        //畫框線
        g.setColor(Color.RED);

        for (int i = 0; i <= bitmap.getWidth(); i++) {
            g.drawLine(i * paintHeight, 0, i * paintHeight, bitmap.getHeight() * paintHeight);
        }
        for (int i = 0; i <= bitmap.getHeight(); i++) {
            g.drawLine(0, i * paintHeight, bitmap.getWidth() * paintHeight, i * paintHeight);
        }
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        name = this.jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // BMP 地圖高度
        String tmpStr = Input.filterNumber(jTextField2.getText());
        int tmpi = (tmpStr.length() > 0) ? Integer.parseInt(tmpStr) : 0;
        mapH = (tmpi > 0) ? tmpi : mapH;
        jTextField2.setText(String.format("%d", mapH));
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //選擇資料夾
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String savePath = file.getAbsolutePath();

            //儲存BMP圖檔
            System.out.println(savePath + "/genMap.bmp");
            savePNG(bitmap, savePath + "/genMap.bmp");

            //儲存txt檔
            File writename = new File(savePath + "/genMap.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
            try {
                writename.createNewFile(); // 建立新檔案
                BufferedWriter out = new BufferedWriter(new FileWriter(writename));
                String str = "";
                for (int i = 0; i < items.size(); i++) {
                    MapPairButton mpb = items.get(i);
                    str += mpb.name() + ","
                            + mpb.color().getRGB() + ","
                            + mpb.path() + ","
                            + mpb.iconW() + ","
                            + mpb.iconH + "\r\n";
                }
                out.write(str); // \r\n即為換行
                out.flush(); // 把快取區內容壓入檔案
                out.close(); // 最後記得關閉檔案

            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int x = evt.getX() / paintHeight;
        int y = evt.getY() / paintHeight;

        if (x > bitmap.getWidth()
                || y > bitmap.getHeight()
                || editJB == null) {//畫面外 或尚未選取左側圖案
            return;
        }
        //如果是同一個區塊 不再更新
        if (bitmap.getRGB(x, y) == editJB.color().getRGB()) {
            return;
        }

        for (int i = 0; i < editJB.iconH(); i++) {
            for (int j = 0; j < editJB.iconW(); j++) {
                if (i == 0 && j == 0) {
                    bitmap.setRGB(x + j, y + i, editJB.color().getRGB());
                } else {
                    bitmap.setRGB(x + j, y + i, Color.black.getRGB());
                }
            }
        }

        editAreaRepaint();

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        paintHeight--;
        //修正列印寬度
        mapParaCaculate();
        //修正畫布尺寸
        jPanel1.setPreferredSize(new Dimension((int) (mapW * 1.5) * paintHeight, (int)(mapH*1.5) * paintHeight));
        
        editAreaRepaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        String str = Input.filterNumber(jTextField6.getText()); //正則表示式 過濾文字 只留數字
        int tmpi = (str.length() > 0) ? Integer.parseInt(str) : 0;
        itemUnit = (tmpi > 0) ? tmpi : itemUnit;
        jTextField6.setText(String.format("%d", itemUnit));
        
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getX() / paintHeight;
        int y = evt.getY() / paintHeight;

        if (x > bitmap.getWidth()
                || y > bitmap.getHeight()
                || editJB == null) {//畫面外 或尚未選取左側圖案
            return;
        }
        //如果是同一個區塊 不再更新
        if (bitmap.getRGB(x, y) == editJB.color().getRGB()) {
            return;
        }

        for (int i = 0; i < editJB.iconH(); i++) {
            for (int j = 0; j < editJB.iconW(); j++) {
                if (i == 0 && j == 0) {
                    bitmap.setRGB(x + j, y + i, editJB.color().getRGB());
                } else {
                    bitmap.setRGB(x + j, y + i, Color.black.getRGB());
                }
            }
        }
        editAreaRepaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //擦布
        editJB = new MapPairButton("eraser", Color.black, null, 1, 1);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //import txt & bmp (需在同一區塊，且固定檔名，暫不更改成 檔案可選)    
        //讀取資料夾 取得資訊
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(null);
        if (option != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        String loadPath = file.getAbsolutePath();

        //讀取檔案
        //bmp
        BufferedImage tmpBmp = null;
        try {
            tmpBmp = ImageIO.read(new File(loadPath + "/genMap.bmp")); // 讀檔案
        } catch (Exception e) {
        }
        if (tmpBmp == null) {
            return;
        }
        System.out.println("BMP:(" + tmpBmp.getWidth() + "x" + tmpBmp.getHeight() + ")");
        //txt
        Scanner s = null;

        ArrayList<String> biItems = new ArrayList<>();
        try {
            s = new Scanner(new BufferedReader(new FileReader(loadPath + "/genMap.txt")));
            // 使用字串換行作為分隔
            s.useDelimiter("\r\n");
            while (s.hasNext()) {
                String tmpS = s.next();
                System.out.print(tmpS);
                biItems.add(tmpS);
            }
        } catch (FileNotFoundException ex) {
        }
        if (biItems.isEmpty()) {//空的文字檔案 則停止載入
            return;
        }

        //清除items  清除畫布
        //左方按鈕
        items.clear();
        jPanel3.removeAll();
        jPanel3.repaint();

        //bmp存入 並重新設定畫布尺寸 並更新
        bitmap = tmpBmp;
        mapW=bitmap.getWidth();
        mapH=bitmap.getHeight();
//        editAreaRepaint();

        //重建items(目前僅一顆按鈕 需再確認)
        biItems.forEach((tmpStr) -> {
            String[] para = tmpStr.split(",");
            String tname = para[0];
            Color c = new Color(Integer.parseInt(para[1]));
            String tpath = para[2];
            int tw = Integer.parseInt(Input.filterNumber(para[3]));
            int th = Integer.parseInt(Input.filterNumber(para[4]));
            MapPairButton jb = new MapPairButton(tname, c, tpath, tw, th);//建按鈕
            jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editJB = jb;
                        System.out.println("Path = " + editJB.path());
                        System.out.println("Color = " + editJB.color());
                        System.out.println("(W,H) = (" + editJB.iconW() + "," + editJB.iconH() + ")");
                        System.out.println("name = " + editJB.name());
                    }
                });
            
            items.add(jb);
            paintItems(jb);//重畫最後一筆
        });
        editAreaRepaint();
        System.out.println("資料重建完成!");

    }//GEN-LAST:event_jButton3ActionPerformed

    //iconButton add image
    public void setIcon(String path, JButton iconButton) {
        ImageIcon icon = new ImageIcon(path);

        icon = new ImageIcon(icon.getImage().getScaledInstance(iconButton.getWidth() - 10,
                iconButton.getHeight() - 10, icon.getImage().SCALE_DEFAULT));//露出邊框塗色用
        iconButton.setHorizontalAlignment(SwingConstants.CENTER);//icon水平置中
        iconButton.setVerticalAlignment(SwingConstants.CENTER);//icon垂直置中
        iconButton.setIcon(icon);//加入圖示
        iconButton.setBorderPainted(false);//不畫出邊界
        iconButton.setBorder(null);
    }

    //區塊塗色用
    private static BufferedImage map(int sizeX, int sizeY, Color c) {
        final BufferedImage res = new BufferedImage(sizeX, sizeY, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                res.setRGB(x, y, c.getRGB());
            }
        }
        return res;
    }

    //存檔
    private static void savePNG(final BufferedImage bi, final String path) {
        try {
            RenderedImage rendImage = bi;
            ImageIO.write(rendImage, "bmp", new File(path));
        } catch (IOException e) {
        }
    }

    //選定編輯區按鈕
    private static MapPairButton editJB;
    //編輯區變數
    private static String name;
    private static Color color;
    private static String path;
    private static int iconW;
    private static int iconH;

    //地圖種類 及 地圖檔 儲存位置 
    private static ArrayList<MapPairButton> items;
    BufferedImage bitmap;

    //items 繪製一格方形的大小
    private static int itemUnit;

    //地圖繪製區 根據格子數量 計算高度用
    private int paintHeight;

    //bitMap尺寸
    private static int mapW;
    private static int mapH;

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
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapGenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //default setting
        initMapPairEditor();

        items = new ArrayList<>();

        //預設值
        itemUnit = 32;
        mapW = 30;
        mapH = 30;


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapGenGUI().setVisible(true);
            }
        });

    }

    //重置編輯區參數
    public static void initMapPairEditor() {
        name = "";
        color = Color.black;
        path = "";
        iconW = 1;
        iconH = 1;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - jason
    private JPanel panel1;
    private JButton jButton1;
    private JButton jButton7;
    private JTextField jTextField3;
    private JButton jButton8;
    private JLabel jLabel3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JScrollPane jScrollPane1;
    private JPanel jPanel3;
    private JPanel panel2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JButton jButton9;
    private JTextField jTextField6;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel1;
    private JPanel panel3;
    private JButton jButton5;
    private JButton jButton6;
    private JScrollPane jScrollPane3;
    private JPanel jPanel1;
    private JPanel panel4;
    private JButton jButton4;
    private JButton jButton3;
    private JPanel panel5;
    private JButton jButton2;
    private JColorChooser jColorChooser1;
    private JToolBar jToolBar1;
    private JPopupMenu jPopupMenu1;
    private JFileChooser jFileChooser1;
    private JPopupMenu jPopupMenu2;
    private JFileChooser jFileChooser2;
    private JPopupMenu jPopupMenu3;
    private JMenu jMenu1;
    private JPopupMenu jPopupMenu4;
    private JPopupMenu jPopupMenu5;
    private PopupMenu popupMenu1;
    private JFileChooser jFileChooser3;
    private JFileChooser jFileChooser4;
    // End of variables declaration//GEN-END:variables

}
