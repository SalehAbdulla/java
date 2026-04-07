import javax.management.monitor.Monitor;

public class Computer extends Device {
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    Camera camera;

    public Computer(String name, String make, String model, String modelDate, Monitor monitor, Keyboard keyboard, Mouse mouse, Camera camera) {
        super(name, make, model, modelDate);
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.camera = camera;
    }
}
