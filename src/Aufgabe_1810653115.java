public class Aufgabe_1810653115
{
    private String a;

    public static void main(String[] args)
    {
        partialString("hans");
        partialString("j");

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
            //Substring = starten ab best. Position
            // hier hans = 4 Zeichen / 2 = 2 Zeichen -> Start 2 Zeichen
            // zweite Hälfte vom String
            System.out.println(a.substring(l/2));
        }
    }
}