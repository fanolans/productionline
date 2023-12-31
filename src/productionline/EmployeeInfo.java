/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;
import java.util.*;

/**
 *
 * @author Hubby
 */
public class EmployeeInfo {
    StringBuilder name;
    String code;
    
    public StringBuilder getName(){
        setName();
        return name;
    }
    public String getCode(){
        createEmployeeCode(name);
        return code;
    }
    private void setName(){
        StringBuilder sb = new StringBuilder();
        sb.append(inputName());
        this.name = sb ;
    }
    private void createEmployeeCode(StringBuilder name){
        if (checkName(name) == true){
            String fullName = name.toString();
            String[] arrfullName = fullName.split("\s");
            this.code = arrfullName[0].charAt(0) + arrfullName[1];
        }  
    }
    private String inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fullname : ");
        String fullName = sc.nextLine();
        return fullName;
    }
    private boolean checkName(StringBuilder name){
        for(int i = 0; i < name.length();i++){
            if(name.charAt(0)==' ' || name.charAt(i)== ' ' && name.charAt(i+1)!=' '){
                return true;
            }
        }
        return false;
    }
}
