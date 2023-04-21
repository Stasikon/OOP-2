public class Car extends EngineOperation implements ServiceTransport  {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void service() {
        super.service();
        checkEngine();
    }
}
