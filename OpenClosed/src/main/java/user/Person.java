package user;

import devices.Device;
import devices.Projector;
import remotes.RemoteControl;

/**
 * Created by yshen on 8/15/16.
 */
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
