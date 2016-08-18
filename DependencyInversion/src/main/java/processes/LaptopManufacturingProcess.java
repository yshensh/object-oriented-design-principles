package processes;

/**
 * Created by yshen on 8/17/16.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice(){
        System.out.println("assembled laptop");
    }

    protected void testDevice(){
        System.out.println("tested laptop");
    }

    protected void packageDevice(){
        System.out.println("packaged laptop");
    }

    protected void storeDevice(){
        System.out.println("stored laptop");
    }
}
