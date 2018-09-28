import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,253,199);
        Crab crab = new Crab();
        addObject(crab,244,441);
        Worm worm = new Worm();
        addObject(worm,497,99);
        Worm worm2 = new Worm();
        addObject(worm2,130,43);
        Worm worm3 = new Worm();
        addObject(worm3,483,460);
        Worm worm4 = new Worm();
        addObject(worm4,87,402);
        Worm worm5 = new Worm();
        addObject(worm5,59,212);
        Worm worm6 = new Worm();
        addObject(worm6,443,222);
        Worm worm7 = new Worm();
        addObject(worm7,72,513);
        Worm worm8 = new Worm();
        addObject(worm8,254,306);
        Worm worm9 = new Worm();
        addObject(worm9,178,110);
        Worm worm10 = new Worm();
        addObject(worm10,352,62);
    }
}
