import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiempo extends Actor
{
    private SimpleTimer timer;
    private Counter contador;
    /**
     * Act - do whatever the Tiempo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Tiempo()
    {
        timer = new SimpleTimer();
        contador = new Counter("Tiempo: ");
        contador.setValue(30);
        
    }
    //Se ejecuta al agregar un nonjeto al mundo
    protected void addedToWorld(World world)
    {
        world.addObject(contador, 60, 20);
    }
    public void act() 
    {
        if (timer.millisElapsed()>1000){
            contador.setValue(contador.getValue() - 1);//setValue modifica, get permite ver su valor
            if(contador.getValue() == 0)
            {
                Greenfoot.stop();
            }
            timer.mark();//Reinicia el contador cada periodo de 1000
            
        }
    }    
}
