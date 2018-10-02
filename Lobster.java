import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pasos;
    private Counter contador;
    public Lobster(){
        pasos = 0;
      
        contador = new Counter("Vidas: ");
        contador.setValue(5); 
    }
     protected void addedToWorld(World world)
    {
        world.addObject(contador, 200, 20);
    }
    public void act() 
    {
        move(5);
        pasos ++;
        if(pasos == 5){
            turn(Greenfoot.getRandomNumber(180)-90);
            pasos = 0; 
        }
        if(isTouching(Crab.class)){
            contador.setValue(contador.getValue()-1);
            setLocation(280,200);
            if(contador.getValue()==0){
                Greenfoot.stop();
            }
        }
    }    
}
