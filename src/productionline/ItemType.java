/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public enum ItemType {
    AU("Audio"),
    VI("Visual"),
    AM("AudioMobile"),
    VM("VisualMobile");

    private final String code;

    ItemType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}

