/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;
import static Modelo.conexion.getConection;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author java
 */
public class tablaClientes extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int id;
    
    private void limpiarCajas() {
        cname.setText(null);
        csurname.setText(null);
        cnameact.setText(null);
        csurnameact.setText(null);
        cidact.setText(null);
        ciddel.setText(null);
        ctelefono.setText(null);
        cdni.setText(null);
        acttelefono.setText(null);
        actdni.setText(null);
    }
   

    /**
     * Creates new form CRUD
     */
    public tablaClientes() {
        initComponents();
        this.modelo = (DefaultTableModel) TablaDatos.getModel();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelActualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cnameact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        csurnameact = new javax.swing.JTextField();
        botonGuardarActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonVolverActualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cidact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        acttelefono = new javax.swing.JTextField();
        actdni = new javax.swing.JTextField();
        panelBorrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonBorrarBorrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        botonVolverBorrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ciddel = new javax.swing.JTextField();
        panelCrear = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        csurname = new javax.swing.JTextField();
        botonGuardarCrear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonVolverCrear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ctelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cdni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD MySQL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(731, 475));
        getContentPane().setLayout(null);

        jLabel1.setText("¿Qué quieres hacer?");
        Menu.add(jLabel1);

        botonCrear.setText("Crear");
        botonCrear.setMaximumSize(new java.awt.Dimension(83, 22));
        botonCrear.setMinimumSize(new java.awt.Dimension(83, 22));
        botonCrear.setPreferredSize(new java.awt.Dimension(83, 22));
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        Menu.add(botonCrear);

        botonActualizar.setText("Actualizar");
        botonActualizar.setMaximumSize(new java.awt.Dimension(83, 22));
        botonActualizar.setMinimumSize(new java.awt.Dimension(83, 22));
        botonActualizar.setPreferredSize(new java.awt.Dimension(83, 22));
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        Menu.add(botonActualizar);

        botonBorrar.setText("Borrar");
        botonBorrar.setMaximumSize(new java.awt.Dimension(83, 22));
        botonBorrar.setMinimumSize(new java.awt.Dimension(83, 22));
        botonBorrar.setPreferredSize(new java.awt.Dimension(83, 22));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        Menu.add(botonBorrar);

        getContentPane().add(Menu);
        Menu.setBounds(6, 6, 110, 120);

        panelActualizar.setVisible(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        cnameact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameactActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido:");

        csurnameact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csurnameactActionPerformed(evt);
            }
        });

        botonGuardarActualizar.setText("Guardar");
        botonGuardarActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Actualizar Cliente");

        botonVolverActualizar.setText("Cancelar");
        botonVolverActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolverActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActualizarActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ID:");

        cidact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidactActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Telefono");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("DNI");

        acttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acttelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cidact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cnameact, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonGuardarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(botonVolverActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(csurnameact, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(acttelefono)
                    .addComponent(actdni)))
        );

        panelActualizarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel15, jLabel16, jLabel2, jLabel3});

        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnameact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csurnameact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(acttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGuardarActualizar)
                    .addComponent(botonVolverActualizar)))
        );

        jLayeredPane1.add(panelActualizar);
        panelActualizar.setBounds(6, 6, 250, 390);

        panelBorrar.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        botonBorrarBorrar.setText("Borrar");
        botonBorrarBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBorrarBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarBorrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Borrar Cliente");

        botonVolverBorrar.setText("Cancelar");
        botonVolverBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolverBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverBorrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ID:");

        ciddel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciddelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarLayout = new javax.swing.GroupLayout(panelBorrar);
        panelBorrar.setLayout(panelBorrarLayout);
        panelBorrarLayout.setHorizontalGroup(
            panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel11))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ciddel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonBorrarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolverBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelBorrarLayout.setVerticalGroup(
            panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(ciddel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(141, 141, 141)
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrarBorrar)
                    .addComponent(botonVolverBorrar))
                .addContainerGap())
        );

        jLayeredPane1.add(panelBorrar);
        panelBorrar.setBounds(6, 6, 250, 390);

        panelCrear.setVisible(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");

        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido:");

        csurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csurnameActionPerformed(evt);
            }
        });

        botonGuardarCrear.setText("Guardar");
        botonGuardarCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCrearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuevo Cliente");

        botonVolverCrear.setText("Cancelar");
        botonVolverCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolverCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverCrearActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Teléfono:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("DNI:");

        cdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botonGuardarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(botonVolverCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cname)
                            .addComponent(csurname)
                            .addComponent(ctelefono)
                            .addComponent(cdni, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );

        panelCrearLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel14, jLabel5, jLabel6});

        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(csurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(ctelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(65, 65, 65)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGuardarCrear)
                    .addComponent(botonVolverCrear)))
        );

        jLayeredPane1.add(panelCrear);
        panelCrear.setBounds(6, 6, 250, 390);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Telefono", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.setPreferredSize(new java.awt.Dimension(450, 300));
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 0, 320, 400);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(124, 6, 600, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
        panelCrear.setVisible(false);
        panelActualizar.setVisible(true);
        panelBorrar.setVisible(false);
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // Botón Crear
        
        panelCrear.setVisible(true);
        panelActualizar.setVisible(false);
        panelBorrar.setVisible(false);
        
        
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // Botón Borrar
        panelCrear.setVisible(false);
        panelActualizar.setVisible(false);
        panelBorrar.setVisible(true);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void cnameactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameactActionPerformed

    private void csurnameactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csurnameactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csurnameactActionPerformed

    private void botonGuardarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActualizarActionPerformed
        //Botón Crear en Actualizar
        int actid = Integer.parseInt(cidact.getText());
        String actname = cnameact.getText();
        String actsurname = csurnameact.getText();
        
        try {
            con = getConection();
            ps = con.prepareStatement("UPDATE Clientes SET nombre='" +actname+"', apellidos='" +actsurname+ "', telefono='" +ctelefono+ "', dni='" + actdni+ "' WHERE idClientes='" +actid+"'");

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar Cliente");
            }
            //TablaDatos.setModel(modelo);

            limpiarCajas();
            actutabla();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_botonGuardarActualizarActionPerformed

    private void botonVolverActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActualizarActionPerformed
        // Botón Volver
        limpiarCajas();
        actutabla();
        panelCrear.setVisible(false);
        panelActualizar.setVisible(false);
        panelBorrar.setVisible(false);
    }//GEN-LAST:event_botonVolverActualizarActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void csurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csurnameActionPerformed

    private void botonGuardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCrearActionPerformed

        // Botón Guardar en Crear

        try {
            con = getConection();
            ps = con.prepareStatement("INSERT INTO Clientes (nombre, apellidos, telefono, dni) VALUES(?,?,?,?) ");
            ps.setString(1, cname.getText());
            ps.setString(2, csurname.getText());
            ps.setString(3, ctelefono.getText());
            ps.setString(4, cdni.getText());
            

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Crear Cliente");
            }
            //TablaDatos.setModel(modelo);

            limpiarCajas();
            actutabla();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_botonGuardarCrearActionPerformed

    private void botonVolverCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverCrearActionPerformed
        // Botón Volver
        limpiarCajas();
        actutabla();
        panelCrear.setVisible(false);
        panelActualizar.setVisible(false);
        panelBorrar.setVisible(false);
    }//GEN-LAST:event_botonVolverCrearActionPerformed

    private void cidactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidactActionPerformed

    private void botonBorrarBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarBorrarActionPerformed
        //Botón Borrar en Borrar
        
        int actid = Integer.parseInt(ciddel.getText());
        
        try {
            con = getConection();
            ps = con.prepareStatement("DELETE FROM Clientes WHERE idClientes='" +actid+"'");

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente borrado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Borrar Cliente");
            }
            //TablaDatos.setModel(modelo);

            limpiarCajas();
            actutabla();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_botonBorrarBorrarActionPerformed

    private void botonVolverBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverBorrarActionPerformed
        // Botón Volver
        limpiarCajas();
        actutabla();
        panelCrear.setVisible(false);
        panelActualizar.setVisible(false);
        panelBorrar.setVisible(false);
    }//GEN-LAST:event_botonVolverBorrarActionPerformed

    private void ciddelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciddelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciddelActionPerformed

    private void cdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdniActionPerformed

    private void acttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acttelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(tablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaClientes().setVisible(true);
            }
            
        });
    }
    
        private void listar() {

        String sql = "SELECT * FROM Clientes";
        try {
            con = getConection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] clientes = new Object[5];
            modelo = (DefaultTableModel) TablaDatos.getModel();

            while (rs.next()) {
                clientes[0] = rs.getInt("idClientes");
                clientes[1] = rs.getString("nombre");
                clientes[2] = rs.getString("apellidos");
                clientes[3] = rs.getInt("telefono");
                clientes[4] = rs.getInt("dni");
                modelo.addRow(clientes);
            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
        }
    }
        
        public void actutabla() {
        ((DefaultTableModel) TablaDatos.getModel()).setNumRows(0);
        listar();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField actdni;
    private javax.swing.JTextField acttelefono;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBorrarBorrar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonGuardarActualizar;
    private javax.swing.JButton botonGuardarCrear;
    private javax.swing.JButton botonVolverActualizar;
    private javax.swing.JButton botonVolverBorrar;
    private javax.swing.JButton botonVolverCrear;
    private javax.swing.JTextField cdni;
    private javax.swing.JTextField cidact;
    private javax.swing.JTextField ciddel;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cnameact;
    private javax.swing.JTextField csurname;
    private javax.swing.JTextField csurnameact;
    private javax.swing.JTextField ctelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JPanel panelBorrar;
    private javax.swing.JPanel panelCrear;
    // End of variables declaration//GEN-END:variables
}
