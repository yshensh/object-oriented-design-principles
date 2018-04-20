package devices;

public class Television implements Device {

    public void turnOn() {

        System.out.println("Television has been turned on");
    }

    public void turnOff() {

        System.out.println("Television has been turned off");
    }

    // additional Television specific operation
    private void switchChannel(){

        System.out.println("Switch to a different channel");
    }

    public String toString(){
        return "Television";
    }

}
