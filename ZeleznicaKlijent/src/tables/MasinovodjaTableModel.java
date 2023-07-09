/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tables;

import domain.Masinovodja;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class MasinovodjaTableModel extends AbstractTableModel{

    private final String[] columnNames= {"MasinovodjaID","Ime", "Prezime","Datum rodjenja", "Radni staz"};
    private final List<Masinovodja> masinovodje;
    
   public MasinovodjaTableModel(List<Masinovodja> masinovodje) {
        this.masinovodje = masinovodje;
    }

    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) return "n/a";
        return columnNames[column]; 
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
       
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Masinovodja masinovodja = masinovodje.get(rowIndex);
        switch(columnIndex){
            case 0:
                masinovodja.setMasinovodjaID((Long)value);
                break;
            case 1:
                masinovodja.setIme(String.valueOf(value));
                break;
            case 2:
                masinovodja.setPrezime(String.valueOf(value));
                break;
            case 3:
                masinovodja.setDatumRodjenja((Date)(value));
                break;
            case 4:
                masinovodja.setRadniStaz((int) value);
                break;
        }
    }
    
    @Override
    public int getRowCount() {
        if (masinovodje==null) return 0;
        return masinovodje.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Masinovodja masinovodja = masinovodje.get(rowIndex);
        switch(columnIndex){
            case 0: return masinovodja.getMasinovodjaID();
            case 1: return masinovodja.getIme();
            case 2: return masinovodja.getPrezime();
            case 3:
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                String datum = format.format(masinovodja.getDatumRodjenja());
                return datum;
            case 4: return masinovodja.getRadniStaz();
            default:
                return "n/a";
        }
    }

    public void addProduct(Masinovodja masinovodja) {
        masinovodje.add(masinovodja);
        //fireTableDataChanged();
        fireTableRowsInserted(masinovodje.size()-1, masinovodje.size()-1);
    }

    public Masinovodja getProductAt(int row) {
        return masinovodje.get(row);
    }
    
}
