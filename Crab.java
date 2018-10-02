import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private Counter contador;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Crab()
    {
        contador = new Counter("Vidas: ");
        contador.setValue(5); 
    }
     protected void addedToWorld(World world)
    {
        world.addObject(contador, 200, 20);
    }
    public void act() 
    {
        super.move(4);
        if(Greenfoot.isKeyDown("right")){
            super.turn(3);
        }
        if(Greenfoot.isKeyDown("left")){
            super.turn(-3);
        }
        if(isTouching(Worm.class)){
            removeTouching(Worm.class); 
            Greenfoot.playSound("eating.wav");
        }
        if(isTouching(Lobster.class)){
            contador.setValue(contador.getValue()-1);
            setLocation(280,400);
            getWorldOfType(CrabWorld.class).accedeLangosta().setLocation(280, 200);//mundo del cangrejo
            if(contador.getValue()==0){
                Greenfoot.stop();
            }
        }
    }
}
