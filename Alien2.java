import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Actor
{
    /**
     * Act - do whatever the Alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+1);
        //jika y lebih dari tingi layar,lokasi kembalikan ke atas
        if(getY()>=495){
            setLocation(getX(),0);
        }
        //if (getX()>260){
          //  setLocation(50,getY()+1);
       // }
        if(isTouching(Ammo.class)){
        removeTouching(Ammo.class);
        Blast b = new Blast();
        Greenfoot.playSound("2ndKill.mp3");
        Blast d = new Blast();
        Alien2 c = new Alien2();
        getWorld().addObject(b, getX(), getY());
        getWorld().addObject(c, Greenfoot.getRandomNumber(380), 0);
        getWorld().removeObject(this);
        Counter skor = new Counter();
        skor.add(5);
        bacground.skor.add(5);
        }
        else if(isTouching(rocket.class)){
        bacground.hp.add(-1);
        if(bacground.hp.getValue()==0){
                gameover go = new gameover();
                getWorld().addObject(go,getWorld().getWidth()/2,getWorld().getHeight()/2);
                Greenfoot.stop();
        }
        getWorld().addObject(new Blast(), getX(), getY());
        getWorld().addObject(new Alien2(), Greenfoot.getRandomNumber(300), 0);
        getWorld().removeObject(this);
        }
    }
}
