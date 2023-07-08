/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class DateTimeThread extends Thread{

    JLabel dateTimeLabel;
    public DateTimeThread(JLabel dateTimeaLabel) {
        this.dateTimeLabel=dateTimeaLabel;
    }

    @Override
    public void run() {
         DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
          while(true){
            Date date=new Date();
            dateTimeLabel.setText(dateFormat.format(date));
          }
    }
    
}
