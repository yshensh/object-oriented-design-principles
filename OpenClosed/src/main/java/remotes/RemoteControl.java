package remotes;

import devices.Device;

public class RemoteControl {

    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();
    private RemoteControl(){}

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void connectToDevice(Device device) {
        this.device = device;
        System.out.println("---- connected to: "+ device + " ----");
    }

    public void clickOffButon(){
        device.turnOn();
    }

    public void clickOnButon(){
        device.turnOn();
    }
}
