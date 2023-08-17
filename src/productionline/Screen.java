/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class Screen implements ScreenSpec {

    private String resolution;
    private int refreshRate;
    private int responseTime;

    public Screen(String resolution, int refreshRate, int responseTime) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    @Override
    public String toString() {
        return String.format(
            super.toString(),
            "Resolution : %s\nRefresh Rate : %d\nResponse Time : %d",
            resolution, refreshRate, responseTime
        );
    }
}