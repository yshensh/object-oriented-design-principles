package devices;

/**
 * Created by yshen on 8/15/16.
 */
public class Projector implements Device {

    public void turnOn() {
        turnUpBrightness();
        System.out.println("Projector has been turned on");
    }

    public void turnOff() {
        turnDownBrightness();
        System.out.println("Project has been turned off");
    }

    // additional Project specific operation
    private void turnUpBrightness(){
        System.out.println("Brightness has been turned up");
    }

    private void turnDownBrightness(){
        System.out.println("Brightness has been turned down");
    }

    public String toString(){
        return "Projector";
    }
}
