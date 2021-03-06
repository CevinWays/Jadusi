package form;

import Class.Mahasiswa;
import Interface.iMahasiswa;
import javax.swing.JOptionPane;
import query.QueryMhs;
import TableModel.tablesMhs;
import java.util.List;

public class FormMahasiswa extends javax.swing.JFrame {

    private iMahasiswa mahasis = new QueryMhs();
    private tablesMhs tablemhs = new tablesMhs();

    public FormMahasiswa() {
        initComponents();
        setLocationRelativeTo(null); //lokasi window saat dibuka
        loadtable();
        jTable1.setModel(tablemhs);

    }

    private void loadtable() {
        List<Mahasiswa> mahasiswa = mahasis.getmhsMahasiswa();
        tablemhs.setData(mahasiswa);
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (txt_nim.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nis tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }

    private void resetForm() {
        txt_nim.setText(null);
        txt_nama.setText(null);
        jComboBox1.setSelectedItem(this);
        txt_judul.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_judul = new javax.swing.JTextArea();
        ButtonTambah = new javax.swing.JButton();
        ButtonKeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ButtonHapus = new javax.swing.JButton();
        ButtonAmbil = new javax.swing.JButton();
        ButtonRefresh = new javax.swing.JButton();
        ButtonUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIM");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jurusan");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Judul");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Sipil", "Sistem Informasi" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_judul.setColumns(20);
        txt_judul.setRows(5);
        jScrollPane2.setViewportView(txt_judul);

        ButtonTambah.setBackground(new java.awt.Color(51, 51, 51));
        ButtonTambah.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTambah.setText("Tambah");
        ButtonTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nama)
                    .addComponent(txt_nim)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonTambah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonKeluar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
        ButtonKeluar.setBorderPainted(false);
        ButtonKeluar.setContentAreaFilled(false);
        ButtonKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Form Pengisian Judul");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ButtonKeluar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ButtonKeluar)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        ButtonHapus.setBackground(new java.awt.Color(255, 102, 51));
        ButtonHapus.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonHapus.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHapus.setText("Hapus");
        ButtonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        ButtonAmbil.setBackground(new java.awt.Color(255, 102, 51));
        ButtonAmbil.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonAmbil.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAmbil.setText("Ambil Data");
        ButtonAmbil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAmbilActionPerformed(evt);
            }
        });

        ButtonRefresh.setBackground(new java.awt.Color(255, 102, 51));
        ButtonRefresh.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonRefresh.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRefresh.setText("Refresh");
        ButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRefreshActionPerformed(evt);
            }
        });

        ButtonUbah.setBackground(new java.awt.Color(255, 102, 51));
        ButtonUbah.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ButtonUbah.setForeground(new java.awt.Color(255, 255, 255));
        ButtonUbah.setText("Ubah");
        ButtonUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUbahActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setBackground(new java.awt.Color(255, 102, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Daftar Judul Mahasiswa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAmbil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonRefresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUbah)
                    .addComponent(ButtonHapus)
                    .addComponent(ButtonAmbil)
                    .addComponent(ButtonRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
        //Menambahkan data ke database db_judul
        if (validasiInput() == true) {
            String nim = txt_nim.getText();
            String nama = txt_nama.getText();
            String jurusan = jComboBox1.getSelectedItem().toString();
            String judul = txt_judul.getText();

            Mahasiswa mahs = new Mahasiswa();
            mahs.setNim(nim);
            mahs.setNama(nama);
            mahs.setJurusan(jurusan);
            mahs.setJudul(judul);
            mahs.setStatus("Unapproved");
            mahasis.insertMhs(mahs);
            tablemhs.insertMhs(mahs);
            loadtable();
            resetForm();
        }

    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbahActionPerformed
        // TODO add your handling code here:
        //Edit data tabel mhs
        int index = jTable1.getSelectedRow();
        if (index != -1) {
            Mahasiswa mahs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            if (validasiInput() == true) {
                String nim = txt_nim.getText();
                String nama = txt_nama.getText();
                String jurusan = jComboBox1.getSelectedItem().toString();
                String judul = txt_judul.getText();
                String status = mahs.getStatus(); //ambil status yang telah dimanipulasi

                mahs.setNim(nim);
                mahs.setNama(nama);
                mahs.setJurusan(jurusan);
                mahs.setJudul(judul);
                mahs.setStatus(status);

                mahasis.updateMhs(mahs);
                tablemhs.updateMhs(index, mahs);
                resetForm();
                loadtable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ambil Data Dahulu");
        }
    }//GEN-LAST:event_ButtonUbahActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        //hapus data pada tabel di java dan mysql
        int index = jTable1.getSelectedRow();
        if (index != -1) {
            Mahasiswa mahs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Apakah Yakin ingin menghapus?", "konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                mahasis.deleteMhs(mahs);
                tablemhs.deleteMhs(index);
                loadtable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleksi Salah satu baris terlebih dahulu!!");
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAmbilActionPerformed
        // TODO add your handling code here:
        //ambil data
        int index = jTable1.getSelectedRow();
        if (index != -1) {
            Mahasiswa mahs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            txt_nim.setText(mahs.getNim());
            txt_nama.setText(mahs.getNama());
            jComboBox1.setSelectedItem(this);
            txt_judul.setText(mahs.getJudul());
        } else {
            JOptionPane.showMessageDialog(null, "Seleksi Salah satu baris terlebih dahulu!!");
        }
    }//GEN-LAST:event_ButtonAmbilActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void ButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRefreshActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_ButtonRefreshActionPerformed

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
        FormMain main = new FormMain();
        main.setVisible(true);
    }//GEN-LAST:event_ButtonKeluarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMahasiswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAmbil;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JButton ButtonRefresh;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JButton ButtonUbah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txt_judul;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    // End of variables declaration//GEN-END:variables
}
