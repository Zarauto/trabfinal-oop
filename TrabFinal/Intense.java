
/**
 * Write a description of class Intense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intense extends Device
{
    private int intensity;
    /**
     * Constructor for objects of class Intense
     */
    public Intense(String name)
    {
        super(name);
        this.intensity = 0;
    }

    public int getIntensity(){
        return this.intensity;
    }
    
    public void setIntensity(int intens){
        this.intensity = intens;    
    }
    
    public String toString() {
        return super.toString() + " - I:" + this.intensity;
    }
}
