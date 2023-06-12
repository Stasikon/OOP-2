public class Truck extends EngineOperation implements ServiceTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }

}
