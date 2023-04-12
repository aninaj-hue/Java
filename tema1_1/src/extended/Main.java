package extended;

public class Main {
    public static void main(String[] args) {
        C objC = new C(5);
        objC.displayXYS();
        System.out.println("Introduceti de la tastatura int, float, string");
        objC.readX();
        objC.readY();
        objC.readS();
        objC.displayXYS();
        objC.displayX();
        System.out.println(objC.getX());

    }
}