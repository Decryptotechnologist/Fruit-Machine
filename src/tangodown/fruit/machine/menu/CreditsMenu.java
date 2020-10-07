/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.menu;

import tangodown.fruit.machine.input.MouseInput;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.audio.Sound;
//import tangodown.fruit.machine.config.Configuration;
import tangodown.fruit.machine.graphics.Display;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ghomez
 */
public class CreditsMenu extends Menu {

    private static int creditsColor;
    
    /**Attributes*/
        
    /**CMfirstTick variable of CreditsMenu object */ 
    private boolean CMfirstTick = true;
    
    /**CMTimer variable of CreditsMenu object */ 
    private int CMTimer = 550;
    
    /**CMTimer variable of CreditsMenu object */ 
    private int tickDelay = 60;
    
    /**animCredits variable of CreditsMenu object */
//    public static final Animation animCredits = new Animation(280, 
//        Texture.credits0, 
//        Texture.credits1, 
//        Texture.credits2, 
//        Texture.credits3,
//        Texture.credits4, 
//        Texture.credits5, 
//        Texture.credits6, 
//        Texture.credits7,
//        Texture.credits8, 
//        Texture.credits9,
//        Texture.credits10    
//    );
    
    /**animCreditsA variable of CreditsMenu object */
//    public static final Animation animCreditsA = new Animation(280, 
//        Texture.creditsA0, 
//        Texture.creditsA1, 
//        Texture.creditsA2, 
//        Texture.creditsA3,
//        Texture.creditsA4, 
//        Texture.creditsA5, 
//        Texture.creditsA6, 
//        Texture.creditsA7,
//        Texture.creditsA8, 
//        Texture.creditsA9,
//        Texture.creditsA10    
//    );
    
    /**animCreditsB variable of CreditsMenu object */
//    public static final Animation animCreditsB = new Animation(280, 
//        Texture.creditsB0, 
//        Texture.creditsB1, 
//        Texture.creditsB2, 
//        Texture.creditsB3,
//        Texture.creditsB4, 
//        Texture.creditsB5, 
//        Texture.creditsB6, 
//        Texture.creditsB7,
//        Texture.creditsB8, 
//        Texture.creditsB9,
//        Texture.creditsB10    
//    );
    
    /**Creditz1A List of Barricade object */
    private static List<Rectangle> Creditz1A;
    
    /**noBRC variable of Barricade object*/ 
    public static int noBRC;// = 3;
    
    /**id variable of CreditsMenu object */
    public int id;
	
    /**isDead (true/false) value of CreditsMenu object*/
    public boolean isDead;
        
    /**visible (true/false) value of CreditsMenu object*/
    public boolean visible;
        
    /**Barz1 List of CreditsMenu objects*/
    public static List<Rectangle> Creditz1 = new ArrayList<>();
    
    /**BarricadeRect List of CreditsMenu Rectangle objects*/
    public static List<Rectangle> CreditsRect = new ArrayList<>();
    
    /**BRCscale variable of CreditsMenu object */
    public static double BRCscale;
    
    /**random Random of CreditsMenu object */
    private Random random = new Random();
    
    /**count variable for CreditsMenu object*/
    private static int count = 0;
    
    
    /**Constructor*/
    
    
    /**
    * CreditsMenu(Game game)
    * 
    * Creates a new CreditsMenu object
    * 
    * @param game
    */
    public CreditsMenu(Game game) {
        System.out.println("CreditsMenu: New Credits Menu Created");
        this.game = game;
        Menu.setUp();
        init();
    }

    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    private void init(){
        creditsColor = 0xff0000;
        
        //INIT : WIDTH : 604
        for(int t = 0; t < 10; t++) {
            Rectangle c1 = new Rectangle(creditsX, creditsY, creditsWidth, creditsHeight);
            Creditz1.add(c1);

            //Split each BRC into 18 * 12 rectangles
            for(int t1 = 15; t1 < creditsr_w+25; t1++) {
                for(int t2 = 0; t2 < creditsr_h+1; t2++) {
                    //Rectangle r1 = new Rectangle(t1 * 6 + xSpace0 + (t * xSpace1) * 3, creditsY + (t2 * 8), CreditsRectWidth, CreditsRectHeight);
                    Rectangle r1 = new Rectangle(t1 * 6 + xSpace0 + (t * 6) * 3, creditsY + (t2 * 8), CreditsRectWidth, CreditsRectHeight);
                    
                    if(r1.x > 132 && r1.x < 207 && r1.y < 324 && r1.y > 264 || 
                    r1.x > 132 && r1.x < 472 && r1.y < 284 && r1.y > 264 || 
                    r1.x > 397 && r1.x < 472 && r1.y < 324 && r1.y > 264 ||
                    r1.x > 132 && r1.x < 472 && r1.y < 324 && r1.y > 304){

                    } else {
                        CreditsRect.add(r1);
                    }
                }
            }
        }
    }
    
    
    /**
    * CreditsMenu Rectangle objects (referenced by id) 
    * is removed and a CreditsXDetonate(CreditsRect)
    * message. 
    * 
    * @param id - the id reference of an CreditsMenu Rectangle object
    */
    public void CreditsHit(int id){
	//CreditsExplode.CreditsXDetonate(CreditsRect.get(id));
	CreditsRect.remove(id);
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints InstructionsMenu Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
        
        //Renders Credits Animation: animCredits, animCreditsA, animCreditsB
        //animCredits.render(target, Game.getGameWidth()/2 - 168+count, Game.getGameHeight()/2 - 108-count, 1, 340, 180, creditsColor);
        //animCredits.render(target, Game.getGameWidth()/2 - 170+count, Game.getGameHeight()/2 - 110-count, 1, 340, 180, 0xffffff);
        
        //animCreditsA.render(target, Game.getGameWidth()/2 - 168-count, Game.getGameHeight()/2 - 108+count, 1, 340, 180, creditsColor);
        //animCreditsA.render(target, Game.getGameWidth()/2 - 170-count, Game.getGameHeight()/2 - 110+count, 1, 340, 180, 0xffffff);
        
        //animCreditsB.render(target, Game.getGameWidth()/2 - 168, Game.getGameHeight()/2 - 108, 1, 340, 180, creditsColor);
        //animCreditsB.render(target, Game.getGameWidth()/2 - 170, Game.getGameHeight()/2 - 110, 1, 340, 180, 0xffffff);
        
        for(int i = 0; i < Creditz1.size(); i++){
            if(Display.showBounds){
                g.setColor(Color.green);
                g.drawRect(Creditz1.get(i).x, Creditz1.get(i).y, Creditz1.get(i).width, Creditz1.get(i).height);
                g.drawString("Credits: X:" + Creditz1.get(i).x + " Credits: Y:"+Creditz1.get(i).y, Creditz1.get(i).x, Creditz1.get(i).y-4);
            }
        }
        
        for(int i = 0; i < CreditsRect.size(); i++){
            if(Display.showBounds){
                g.setColor(Color.white);
                g.drawRect(CreditsRect.get(i).x, CreditsRect.get(i).y, CreditsRect.get(i).width, CreditsRect.get(i).height);
            }
        }
        
        //Set Button Logic: Skip Button
        if(MouseInput.MouseX > 500 && MouseInput.MouseX < 500 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
            
            //Draws Back Button Image: skipOffBtn
            g.drawImage(skipOffBtn, 500, 630, 80, 30, null);
            
            //Draws Back (Flashing) Button Arrow Images: leftArrowIcon, rightArrowIcon
            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 500 + 80, 634, 22, 20, null);
                g.drawImage(rightArrowIcon, 500 - 25, 635, 22, 20, null);
            }
            
            //Set Status Bar: Skip
            Display.setStatusBar("Skip");
            
            //Set Mouse Button Logic: MouseButton 1 || RMB
            if(MouseInput.MouseButton == 1) {
                Sound.sound5.play();
                
                game.setMenu(null);
                game.stateManager.setState("menu");
                
                //Set Status Bar: Ready
                Display.setStatusBar("Ready");
            }
            
        } else {
            
            //Draws Skip Button Image: skipOnBtn
            g.drawImage(skipOnBtn, 500, 630, 80, 30, null);
            
            //Set Status Bar: Credits Menu
            Display.setStatusBar("Credits Menu");
        }


        g.dispose();
        
        if(count < 488){
            count++;
            creditsColor++;
        } else {
            count = 0;
            creditsColor = 0xff0000;
        }
        
    }
    
    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates CreditsMenu Object
    * 
    * @param game - the Game of CreditsMenu
    * @param up - the up variable of CreditsMenu
    * @param down - the down variable of CreditsMenu
    * @param left - the left variable of CreditsMenu
    * @param right - the right variable of CreditsMenu
    * @param fire - the fire variable of CreditsMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        CreditsRect = CreditsMenu.getAllRect();
        //animCredits.runRen();
        //animCreditsA.runRen();
        //animCreditsB.runRen();
        
        if(CMTimer > 0) {
            CMTimer--;
        }
        if(CMfirstTick) {
            CMfirstTick = false;
            System.out.println("Cue Credits Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getSnd()){
                Sound.Soundtrack.loop();
            }
            //Set Status Bar: Credits Menu
            Display.setStatusBar("Credits Menu");
        }
        if(CMTimer == 0) {
        }

    }
    
    
    /**
    * Returns the List of the Barricade 
    * objects referenced by Barz1
    * 
    * @return Barz1
    */
    public static List<Rectangle> getAll() {
        Creditz1A = new ArrayList<>();
        int j = 0;
        
        for (int i = 0; i < Creditz1.size(); i++) {
            //if (Creditz1.get(i).isDead == false) {
                Creditz1A.add(j, Creditz1.get(i));
                
                j++;
            //}
        }
        
        return Creditz1A;
    }

    
    /**
    * Returns the List of the Rectangles 
    * referenced by BarricadeRect 
    * 
    * @return BarricadeRect
    */	
    public static List<Rectangle> getAllRect() {        
	return CreditsRect;
    }

    
    /**
    * dead(int k)
    * 
    * @param k
    */
    public void dead(int k) {
        CreditsRect.remove(k);
    }
    
    
    /**
    * clearAll()
    * 
    */
    public static void clearAll() {
        Creditz1.clear();
        CreditsRect.clear();
    }
    
    
    /**
    * setBarricadeCol(int col)
    * 
    * @param col
    */
    public static void setCreditsCol(int col) {
        creditsColor = col;
    }
    
}
