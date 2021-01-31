public class Aircraft extends FlyingObject{

    @Override
    void fly() {
        System.out.println("Flying aircraft " + getModel());
    }
}
