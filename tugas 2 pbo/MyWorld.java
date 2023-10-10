import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 400, 1); 
        GreenfootImage img = new GreenfootImage("sky2.png");

        this.addObject(new rembo(),200,200);

        Random rnd = new Random();
        setPaintOrder(rembo.class);
        for(int i = 0; i < 5; i++){
            this.addObject(new cloud(), rnd.nextInt(this.getWidth()-1), rnd.nextInt(this.getHeight()-1));
        }
    }
}
