public class Aufgabe5_1810653115_Main
{
    public static void main(String[] args)
    {
        //neue Instanz
        Vehicle audi = new Vehicle();
        //Werte zuweisen
        audi.setName("audi");
        audi.setPower(150);

        //Ausgabe
        System.out.println("Name: " + audi.printName());
        System.out.println("PS: " + audi.getPower());
        audi.calculatePower();

        System.out.println("--------------------");
        Vehicle bmw = new Vehicle();
        bmw.setName("bmw");
        bmw.setPower(179);

        System.out.println("Name: " + bmw.printName());
        System.out.println("PS: " + bmw.getPower());
        bmw.calculatePower();

    }
}
