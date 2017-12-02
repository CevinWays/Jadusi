package Interface;

import Class.Mahasiswa;
import java.util.List;

public interface iMahasiswa {
    void insertMhs(Mahasiswa mhs);
    void updateMhs(Mahasiswa mhs);
    void deleteMhs(Mahasiswa mhs);
    Mahasiswa getByid(String id);
    List<Mahasiswa> getmhsMahasiswa();
}
