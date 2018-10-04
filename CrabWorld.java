import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private int nGus;
    private Lobster lobster;
    private Crab crab;
    private GreenfootSound musica;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        nGus=10;
        lobster = new Lobster();
        addObject(lobster,253,199);
        crab = new Crab();
        addObject(crab,244,440);
        GreenfootSound musica = new GreenfootSound("ufo-t-balt.mp3");
        prepare();
    }
    public void started()
    {
        musica.playLoop();
    }
    public void stopped()
    {
        musica.pause();
    }
    public Lobster accedeLangosta()
    {
        return lobster;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
        for(int i = 0; i < nGus; i++)
        {
            Worm worm = new Worm();
            addObject(worm, Greenfoot.getRandomNumber(530)+20, Greenfoot.getRandomNumber(530)+20);
        }
        Tiempo time = new Tiempo();
        addObject(time, 60, 20);
    }
}
