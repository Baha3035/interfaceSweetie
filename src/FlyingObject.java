public abstract class FlyingObject {
    public String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract void fly();
}
