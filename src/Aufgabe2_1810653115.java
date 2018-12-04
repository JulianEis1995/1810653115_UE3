public class Aufgabe2_1810653115
{
    private String a;

    public static void main(String[] args)
    {
        //Ausgabe von 3 Buchstaben
        partialString("alfre");
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        //Ausgabe eines Fehlers
        partialString("ja");

    }

    public static String partialString(String a)
    {
        if (a.length() > 3)
        {
            //Länger herausfinden bspw. hans = 4 Zeichen
            int l = a.length();

            //Substring = starten ab best. Position
            // hier hans = 4 Zeichen / 2 = 2 Zeichen -> Start 2 Zeichen
            // zweite Hälfte vom String

            System.out.println("Volle Ausgabe: " + a);
            System.out.println("Ausgabe lt. Aufgabe: " + a.substring(l / 2));

            return a;
        }
        else
        {
            System.out.println("ungültige Zeichenkette");
            return "ungültige Zeichenkette";
        }
    }
}