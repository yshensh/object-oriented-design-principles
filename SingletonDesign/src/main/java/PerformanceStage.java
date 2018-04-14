public class PerformanceStage {

    private static PerformanceStage INSTANCE = null;
    private static int counter;

    // public constructor
    public PerformanceStage(){
        counter++;
    }

    public void turnOnLights(){
        System.out.println("turn on lights...");
    }

    public int getCounter(){
        return counter;
    }
}

