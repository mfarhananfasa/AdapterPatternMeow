
/**
 * Write a description of class MeongAdapter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeongAdapter implements Bebek 
{
    private Kucing kucing;
    public MeongAdapter(Kucing kucing) 
    {
        this.kucing = kucing;
    }
  
    @Override
    public void kwek() 
    {
        kucing.meong();
    }
}
