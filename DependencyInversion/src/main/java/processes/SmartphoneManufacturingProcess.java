package processes;

/**
 * Created by yshen on 8/17/16.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice(){
        System.out.println("assembled smartphone");
    }

    protected void testDevice(){
        System.out.println("tested smartphone");
    }

    protected void packageDevice(){
        System.out.println("packaged smartphone");
    }

    protected void storeDevice(){
        System.out.println("stored smartphone");
    }
}
