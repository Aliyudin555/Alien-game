import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends Actor
{
    /**
     * Act - do whatever the Ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-4);
        //jika nyangkut, maka peluru harus hilang
        //jika Y mendekati 0,maka peluru hilang
        if(getY()<=5){
            getWorld().removeObject(this); //bunuh diri
        }
    }
}
