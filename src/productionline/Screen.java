/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
class Screen implements ScreenSpec {
    String resolution;
    int refreshrate;
    int responsetime;
    
    Screen(String resolution, int refreshrate, int responsetime){  
        this.resolution=resolution;  
        this.refreshrate=refreshrate;  
        this.responsetime=responsetime;  
    }  
    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }
    
    @Override
    public String toString(){
        return "Resolution : "+resolution+"\nRefresh Rate : "+refreshrate+"\nResponse Time: "+responsetime;
    }
   
}
