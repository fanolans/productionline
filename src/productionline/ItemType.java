/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productionline;

/**
 *
 * @author Nolan
 */
public enum ItemType {
    Audio("AU"),
    Visual("VI"),
    AudioMobile("AM"),
    VisualMobile("VM");

    private final String code;

    ItemType(String code) {
      this.code = code;
    }

    public String getCode() {
      return code;
    }
}
