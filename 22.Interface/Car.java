public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
    public static void main(String[] args) {
        Car omni=new Car();
        omni.start();
        omni.stop();
        omni.honk();
        Vehicle.service();
    }
}
