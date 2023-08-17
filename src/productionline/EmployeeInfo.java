/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Clutz
 */
public class EmployeeInfo {

    private StringBuilder name;
    private String code;
    private String deptId;

    private Pattern p;
    private Scanner in;

    public EmployeeInfo() {
        p = Pattern.compile("[A-Z]{1}[a-z]{3}[0-9]{2}");
        in = new Scanner(System.in);
        setName();
        setDeptId();
    }

    public StringBuilder getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDeptId() {
        return deptId;
    }
    
    private void setName() {
        name = new StringBuilder(inputName());
        createEmployeeCode(name);
    }

    private void createEmployeeCode(StringBuilder name) {
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex > 0) {
            code = name.substring(0, 1) + name.substring(spaceIndex + 1);
        } else {
            code = "guest";
        }
    }
    
    private void setDeptId() {
        deptId = getId();
        if (validId(deptId)) {
            deptId = reverseString(deptId);
        }
    }
        
    private String getId() {
        System.out.println("Please enter your department ID: ");
        String id = in.nextLine();
        return id;
    }

    private boolean validId(String id) {
        return p.matcher(id).matches();
    }
        
    private String reverseString(String id) {
        if (id.isEmpty()) {
            return id;
        } else {
            return reverseString(id.substring(1)) + id.charAt(0);
        }
    }

    private String inputName() {
        System.out.println("Please enter your full name: ");
        String name = System.console().readLine();
        return name;
    }

    private boolean checkName(StringBuilder name) {
        int spaceIndex = name.indexOf(" ");
        return spaceIndex > 0;
    }
        
    @Override
    public String toString() {
        return "Employee info: code=" + code + ", deptId=" + deptId;
    }
}