package query;

import Class.Mahasiswa;
import Interface.iMahasiswa;
import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryMhs implements iMahasiswa {

    private Connection conn;

    public QueryMhs() {
        conn = Koneksi.getConnection();
    }

    //insert data
    @Override
    public void insertMhs(Mahasiswa mhs) {
        PreparedStatement st = null;
        String sql = "INSERT INTO tb_daftar VALUE (?, ?, ?, ?, ?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mhs.getNim());
            st.setString(2, mhs.getNama());
            st.setString(3, mhs.getJurusan());
            st.setString(4, mhs.getJudul());
            st.setString(5, mhs.getStatus());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //update data
    @Override
    public void updateMhs(Mahasiswa mhs) {
        PreparedStatement st = null;
        String sql = "UPDATE tb_daftar SET nama=?, jurusan=?, judul=?, status=? WHERE nim=?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mhs.getNama());
            st.setString(2, mhs.getJurusan());
            st.setString(3, mhs.getJudul());
            st.setString(4, mhs.getStatus());
            st.setString(5, mhs.getNim());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //Delete data
    @Override
    public void deleteMhs(Mahasiswa mhs) {
        PreparedStatement st = null;
        String sql = "DELETE FROM tb_daftar WHERE nim=?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, mhs.getNim());
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
    
    //tampilkan data berdasarkan nim
    @Override
    public Mahasiswa getByid(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM tb_daftar WHERE nim=?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJurusan(rs.getString("jurusan"));
                mhs.setJudul(rs.getString("judul"));
            }
            return mhs;
        } catch (SQLException ex) {
            Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    //tampilkan data dari database ke dalam list tabel
    @Override
    public List<Mahasiswa> getmhsMahasiswa() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM tb_daftar";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJurusan(rs.getString("jurusan"));
                mhs.setJudul(rs.getString("judul"));
                mhs.setStatus(rs.getString("status"));
                list.add(mhs);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QueryMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
