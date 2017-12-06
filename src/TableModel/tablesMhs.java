package TableModel;

import Class.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tablesMhs extends AbstractTableModel {

    private List<Mahasiswa> list = new ArrayList<>();

    public tablesMhs() {

    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNim();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getJurusan();
            case 3:
                return list.get(rowIndex).getJudul();
            case 4:
                return list.get(rowIndex).getStatus();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "Jurusan";
            case 3:
                return "Judul";
            case 4:
                return "Status";
            default:
                return null;
        }
    }

    public void insertMhs(Mahasiswa mhs) {
        this.list.add(mhs);
        fireTableDataChanged();
    }

    public void updateMhs(int index, Mahasiswa mhs) {
        this.list.set(index, mhs);
        fireTableDataChanged();
    }

    public void deleteMhs(int index) {
        this.list.remove(index);
        fireTableDataChanged();
    }

    public void setData(List<Mahasiswa> list) {
        this.list = list;
        fireTableDataChanged();
    }

    public Mahasiswa getMhs(int index) {
        return list.get(index);
    }

    public void clear() {
        list.clear();
    }

}
