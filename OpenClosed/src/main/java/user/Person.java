package user;

import devices.Device;
import devices.Projector;
import remotes.RemoteControl;

public class Person {
    public static void main(String args[]) {

        // Device
        Projector myProjector = new Projector();

        // The user's control
        RemoteControl remoteControl = RemoteControl.getInstance();
        remoteControl.connectToDevice(myProjector);
        remoteControl.clickOnButon();
    }
}
