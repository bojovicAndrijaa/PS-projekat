/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tables;

import domain.Voz;
import domain.VrstaVoza;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VozTableModel  extends AbstractTableModel{
    
      List<Voz> vozovi;
    String [] columns=new String[]{"VozID", "Naziv voza", "Broj sedista", "Godina proizvodnje", "Vrsta voza"};
    Class[]classes= new Class[]{Object.class,Object.class,Object.class,Object.class,Object.class};
    
     @Override
    public int getRowCount() {
        return vozovi.size();
        

    }

    public VozTableModel(List<Voz> vozovi) {
        this.vozovi = vozovi;
    }

    @Override
    public int getColumnCount() {
            return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            
        Voz voz=vozovi.get(rowIndex);
        switch (columnIndex) {
            case 0: return voz.getVozID();
            case 1: return voz.getNazivVoza();
            case 2: return voz.getBrojSedista();
            case 3: return voz.getGodinaProizvodnje();
            case 4: return voz.getVrstaVozaID();
            default:
                return "n/a";
        }


    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    Voz voz=vozovi.get(rowIndex);
        switch (columnIndex) {
            case 0: voz.setVozID((Long)(aValue)); break;
            case 1: voz.setNazivVoza(String.valueOf(aValue)); break;
            case 2: voz.setBrojSedista((int)aValue); break;
            case 3: voz.setGodinaProizvodnje((Date)(aValue)); break;
            case 4: voz.setVrstaVozaID((VrstaVoza)(aValue)); break;   // obrati
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
 
    
    
    public void addVoz(Voz voz){
        vozovi.add(voz);
        fireTableDataChanged();
    }
    public void removeVoz(int index){
        vozovi.remove(index);
        fireTableCellUpdated(index, index);
    }
    public List<Voz> getVozovi(){
        return vozovi;
    }
    
}
