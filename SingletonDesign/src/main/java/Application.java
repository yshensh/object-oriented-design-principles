public class Application {

    public static void main(String args[]) {
        // singleton case
        SingletonPerformanceStage ss = SingletonPerformanceStage.getInstance();
        ss.turnOnLights();
        // should return 1
        System.out.println(ss.getCounter());

        SingletonPerformanceStage ss2 = SingletonPerformanceStage.getInstance();
        // should return 1 as well - no change in counter
        System.out.println(ss.getCounter());

        // non-singleton case
        PerformanceStage stage = new PerformanceStage();
        PerformanceStage stage2 = new PerformanceStage();
        PerformanceStage stage3 = new PerformanceStage();
        PerformanceStage stage4 = new PerformanceStage();
        PerformanceStage stage5 = new PerformanceStage();
        // should return 5
        System.out.println(stage.getCounter());
    }
}
