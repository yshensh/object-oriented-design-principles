package clients;

import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

/**
 * Created by yshen on 8/17/16.
 */
public class DeviceFactory {
    public static void main(String args[]) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("nexus5x");
        manufacturer.launchProcess();
    }
}
