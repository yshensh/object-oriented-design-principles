public class SingletonPerformanceStage {

    private static SingletonPerformanceStage INSTANCE = null;
    private static int counter;

    // private constructor for singleton
    private SingletonPerformanceStage(){
        counter++;
    }

    public synchronized static SingletonPerformanceStage getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SingletonPerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("turn on lights...");
    }

    public int getCounter(){
        return counter;
    }
}
