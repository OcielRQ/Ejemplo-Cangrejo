import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiempo extends Actor
{
    private SimpleTimer timer;//con esto se accede al temporizador de la pc
    private Counter contador;//esta es la pantalla donde se cuenta todo
    /**
     * Act - do whatever the Tiempo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Tiempo()
    {
        timer = new SimpleTimer();//se crea el temporizador
        contador = new Counter("Tiempo: ");//esta pantalla es la que se va mostrar como en este caso necesitamos tiempo asi la llamamos
        contador.setValue(30);//establece el valor del contador en este caso 30 segundos (depende de como tengas acomodada la barra de velocidad)
        
    }
    //Se ejecuta al agregar un objeto al mundo
    protected void addedToWorld(World world)
    {
        world.addObject(contador, 60, 20);
    }
    public void act() 
    {
        if (timer.millisElapsed()>1000){//se establece en greenfoot por default los milisegundos sino se mueve la barra de velocidad
            //por lo cual 1000 representa un segundo
            contador.setValue(contador.getValue() - 1);//setValue modifica, get permite ver su valor
            if(contador.getValue() == 0)//cuando nuestro contador sea cero se detiene la ejecuccion
            {
                Greenfoot.stop();
            }
            timer.mark();//Reinicia el contador cada periodo de 1000
            
        }
    }    
}
