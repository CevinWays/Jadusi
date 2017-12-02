package form;

import Class.Mahasiswa;
import Interface.iMahasiswa;
import config.Koneksi;
import java.sql.Connection;
import javax.swing.JOptionPane;
import query.QueryMhs;
import TableModel.tablesMhs;
import java.util.List;

public class FormMahasiswa extends javax.swing.JFrame {

    private iMahasiswa mahasis = new QueryMhs();
    private tablesMhs tablemhs = new tablesMhs();
    private FormMahasiswa mhs;

    public FormMahasiswa() {
        initComponents();
        setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        ButtonTambah = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonHapus = new javax.swing.JButton();
        ButtonAmbil = new javax.swing.JButton();
        ButtonUbah = new javax.swing.JButton();
        ButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pendaftaran Judul", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jurusan");

        jLabel4.setText("Judul");

        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Sipil", "Sistem Informasi" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nim)
                            .addComponent(txt_nama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_judul)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonTambah)
                                .addGap(0, 181, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonTambah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        ButtonAmbil.setText("Ambil Data");
        ButtonAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAmbilActionPerformed(evt);
            }
        });

        ButtonUbah.setText("Ubah");
        ButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUbahActionPerformed(evt);
            }
        });

        ButtonRefresh.setText("Refresh");
        ButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAmbil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUbah)
                    .addComponent(ButtonHapus)
                    .addComponent(ButtonAmbil)
                    .addComponent(ButtonRefresh))
                .addGap(117, 117, 117))
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
            
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);
            mhs.setJurusan(jurusan);
            mhs.setJudul(judul);
            mhs.setStatus("Unapproved");
            mahasis.insertMhs(mhs);
            tablemhs.insertMhs(mhs);
            loadtable();
            resetForm();
        }

    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbahActionPerformed
        // TODO add your handling code here:
        //Edit data tabel mhs
        int index = jTable1.getSelectedRow();
        if (index != -1) {
            Mahasiswa mhs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            if (validasiInput() == true) {
                String nim = txt_nim.getText();
                String nama = txt_nama.getText();
                String jurusan = jComboBox1.getSelectedItem().toString();
                String judul = txt_judul.getText();
                String status = mhs.getStatus();

                mhs.setNim(nim);
                mhs.setNama(nama);
                mhs.setJurusan(jurusan);
                mhs.setJudul(judul);
                mhs.setStatus(status);

                mahasis.updateMhs(mhs);
                tablemhs.updateMhs(index, mhs);
                resetForm();
                loadtable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tekan Button Ambil Data Dahulu");
        }
    }//GEN-LAST:event_ButtonUbahActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        //hapus data pada tabel di java dan mysql
        int index = jTable1.getSelectedRow();
        if (index!=-1) {
            Mahasiswa mhs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Apakah Yakin Di Hapus?","konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                mahasis.deleteMhs(mhs);
                tablemhs.deleteMhs(index);
                loadtable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleksi Salah satu baris!!");
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAmbilActionPerformed
        // TODO add your handling code here:
        //ambil data
        int index=jTable1.getSelectedRow();
        if(index!=-1){
            Mahasiswa mhs = tablemhs.getMhs(jTable1.convertRowIndexToModel(index));
            txt_nim.setText(mhs.getNim());
            txt_nama.setText(mhs.getNama());
            jComboBox1.setSelectedItem(this);
            txt_judul.setText(mhs.getJudul());
        }else{
            JOptionPane.showMessageDialog(null, "seleksi salah satu baris!");
        }
    }//GEN-LAST:event_ButtonAmbilActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void ButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRefreshActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_ButtonRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAmbil;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonRefresh;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JButton ButtonUbah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    // End of variables declaration//GEN-END:variables
}
