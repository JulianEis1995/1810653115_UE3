public class Aufgabe2_1810653115
{
    private String a;

    public static void main(String[] args)
    {
        //Ausgabe von 3 Buchstaben
        partialString("alfre");
        //Ausgabe eines Fehlers
        partialString("ja");

    }

    public static void partialString(String a)
    {
        if(a.length() < 3)
        {
            System.err.println("ungültige Zeichenkette");
        }
        else
        {
            //Länger herausfinden bspw. hans = 4 Zeichen
            int l = a.length();

            //Nebenrechnung -> Ergebnis 2 -> fängt bei Char 2 an
            int ausgabe = 5/2;
            System.out.println(ausgabe);

            //Substring = starten ab best. Position
            // hier hans = 4 Zeichen / 2 = 2 Zeichen -> Start 2 Zeichen
            // zweite Hälfte vom String
            System.out.println(a.substring(l/2));

            //RETURN VALUE!!!
        }
    }
}