package Payment;

import Show.*;

public class Plan {
    private double cost;
    private int screen_num;
    private int download_devices;
    private Quality quality;

    public Plan(double cost, int screen_num, int download_devices, Quality quality) {
        this.cost = cost;
        this.screen_num = screen_num;
        this.download_devices = download_devices;
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getScreen_num() {
        return screen_num;
    }

    public void setScreen_num(int screen_num) {
        this.screen_num = screen_num;
    }

    public int getDownload_devices() {
        return download_devices;
    }

    public void setDownload_devices(int download_devices) {
        this.download_devices = download_devices;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Plan{" + "cost=" + cost + ", screen_num=" + screen_num + ", download_devices=" + download_devices + ", quality=" + quality + '}';
    }
    
    
}
