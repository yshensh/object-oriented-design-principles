package devices;

public class SurroundSoundSystem implements Device {

    public void turnOn() {
        System.out.println("SurroundSoundSystem has been turned on");
    }

    public void turnOff() {
        System.out.println("SurroundSoundSystem has been turned off");
    }

    // additional SurroundSoundSystem specific operation
    private void turnUpVolume(){

        System.out.println("Increase volume");
    }

    private void turnDownVolume(){

        System.out.println("Lower volume");
    }

    public String toString(){
        return "SurroundSoundSystem";
    }

}
