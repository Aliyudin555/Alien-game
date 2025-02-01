import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Add your action code here.
        // rocket bergerak menggunakan arrow
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }else
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }else
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        //Hero menembakkan peluru
        if(Greenfoot.isKeyDown("space")){
            //menembak
            shoot();
        }
        count++;
        if(count>=60){
            //menembak
            shoot();
            count=0;
            Greenfoot.playSound("sheriffTap.mp3");
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    Ammo ammo = new Ammo();
    getWorld().addObject(ammo, getX(),getY());//memposisikan ammo
    }
}
