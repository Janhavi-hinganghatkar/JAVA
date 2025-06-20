// First interface
interface Engine {
    void startEngine();
}

// Second interface
interface MusicSystem {
    void playMusic();
}

// Class implementing both interfaces
class Car1 implements Engine, MusicSystem {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.playMusic();
    }
}
