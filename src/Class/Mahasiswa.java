
package Class;

public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    private String jurusan;
    private String judul;
    private String status;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
