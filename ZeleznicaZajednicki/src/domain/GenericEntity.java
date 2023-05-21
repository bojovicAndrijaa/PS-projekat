/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author User
 */
public interface GenericEntity  extends Serializable{
    
    String getTableName();

    String getColumnNamesForInsert();

    String getInsertValues();

    void setId(Long id);
}
