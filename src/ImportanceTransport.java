public abstract class ImportanceTransport {
    private String modelName;
    private int wheelsCount;

    public ImportanceTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
    }

