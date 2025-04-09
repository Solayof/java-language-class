package Composition;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    public Car(Engine engine, Wheel[] wheel) {
        this.engine = engine;
        this.wheels = wheel;
    }
}
