
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Main 
{
    public static void main (String[] args) 
    {
        Kucing kucing = new Meong();
        Bebek meongAdapter = new MeongAdapter(kucing);
        System.out.println("Kwek!");
        meongAdapter.kwek();
    }
}