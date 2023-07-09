/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tables;

import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VoznjaTableModel extends AbstractTableModel  {
    List<Voznja> voznje;
    String [] columns=new String[]{ "Datum", "Trajanje u satima", "Masinovodja", "Voz", "Mesto polaska", "Mesto dolaska"};
    Class[]classes= new Class[]{Object.class,Object.class,Object.class,Object.class,Object.class,Object.class};
     List<Mesto> mesta;
    
     public VoznjaTableModel(List<Voznja> voznje, List<Mesto> mesta) {
        this.voznje = voznje;
        this.mesta = mesta;
    }
    @Override
    public int getRowCount() {
        return voznje.size();
    }

    @Override
    public int getColumnCount() {
            return columns.length;
    }

     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            
        Voznja voznja = voznje.get(rowIndex);
        Mesto mesto = mesta.get(rowIndex);
        switch (columnIndex) {
            case 1: 
                return voznja.getTrajanje();
            case 0:
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDateTime = voznja.getDatum().format(formatter);
                
                return formattedDateTime;
            case 2: return voznja.getMasinovodja();
            case 3: return voznja.getVoz();
            case 4: return "Beograd";
            case 5 : return mesto.getNaziv();
            default:
                return "n/a";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    Voznja voznja = voznje.get(rowIndex);
        switch (columnIndex) {
            case 1: voznja.setDatum((LocalDateTime)(aValue)); break;
            case 2: voznja.setTrajanje((Integer)(aValue)); break;
            case 3: voznja.setMasinovodja((Masinovodja)(aValue)); break;
            case 4: voznja.setVoz((Voz)(aValue)); break;
            default:
                
        }

    }
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    return true;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
            return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
            return columns[column];
    }

    public void addVoznja(Voznja voznja){
        voznje.add(voznja);
        fireTableDataChanged();
    }
    public void removeVoznja(int index){
        voznje.remove(index);
        fireTableCellUpdated(index, index);
    }
    public List<Voznja> getVoznja(){
        return voznje;
    }
    
}
