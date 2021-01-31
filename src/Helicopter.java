public class Helicopter extends FlyingObject implements VerticalTakeOff{

    @Override
    void fly() {
        System.out.println("Flying helicopter " + getModel());
    }


    @Override
    public void verticalTakeOff() {
        System.out.println("Moving vertically");
    }
}
