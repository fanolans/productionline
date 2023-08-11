/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package productionline;

import java.util.Date;

/**
 *
 * @author Nolan
 */
public interface Item {
    public static final String MANUFACTURER = "OracleProduction";

    public void setProductionNumber(int productionNumber);

    public void setName(String name);

    public String getName();

    public Date getManufactureDate();

    public int getSerialNumber();
}
