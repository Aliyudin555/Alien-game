import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bacground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bacground extends World
{
    static Counter skor = new Counter("skor: ");
    static Counter hp = new Counter("hp: ");
    /**
     * Constructor for objects of class bacground.
     * 
     */
    public bacground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,41,53);
        Alien alien2 = new Alien();
        addObject(alien2,136,99);
        Alien alien3 = new Alien();
        addObject(alien3,234,159);
        rocket rocket = new rocket();
        addObject(rocket,144,446);
        //Counter skor = new Counter("skor:");
        addObject(skor,247,19);
        skor.setLocation(60,11);
        skor.setValue(0);
        //Counter hp = new Counter();
        addObject(hp,251,16);
        hp.setLocation(257,8);
        hp.setValue(5);
        Alien2 alien22 = new Alien2();
        addObject(alien22,231,93);
        Alien3 alien32 = new Alien3();
        addObject(alien32,45,99);
        Alien4 alien4 = new Alien4();
        addObject(alien4,106,44);
        Alien5 alien5 = new Alien5();
        addObject(alien5,202,54);
        alien22.setLocation(263,104);
        alien4.setLocation(93,80);
    }

    public void act(){
    if(Greenfoot.getRandomNumber(500)<3){
        addObject(new Alien(),Greenfoot.getRandomNumber(5),1);
    }
    }
}