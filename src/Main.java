public class Main {
    public static void main(String[] args) {
        Aircraft boeing737 = new Aircraft();
        Helicopter mi8 = new Helicopter();
        boeing737.setModel("Boeing-737");
        mi8.setModel("MI-8");

        Foo.Flight(mi8);
        Foo.FlightVertical(mi8);
        Foo.Flight(boeing737);
    }
}
