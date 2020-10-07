/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.menu;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.Texture;

/**
 * Menu objects represent one Enemy4 object 
 (above the first top-most row of enemies), 
 there are 1 of them at any one time randomly 
 through-out the game each with their own 
 collision Rectangle
 * 
 * @author(s) Ghomez
 */
public class Menu {
    
    /**Attributes*/
    
    /**copyRight variable of Menu object*/ 
    public static final String copyRight = "(C) Tango Down 2018";
    
    /**startTxtScale variable of Menu object*/ 
    public static double startTxtScale;// = 2;
    
    /**pauseTxtScale variable of Menu object*/ 
    public static double pauseTxtScale;// = 2;
    
    /**logoScale variable of Menu object*/ 
    public static double logoScale;// = 1.15;
    
    /**scoreSheetScale variable of Menu object*/ 
    public static double scoreSheetScale;// = 1.0;
    
    /**startTxtX coordinate of Menu object*/ 
    public static int startTxtX;
    
    /**startTxtY coordinate of Menu object*/ 
    public static int startTxtY;
    
    /**pauseTxtX coordinate of Menu object*/ 
    public static int pauseTxtX;
    
    /**pauseTxtY coordinate of Menu object*/ 
    public static int pauseTxtY;
    
    /**logoX coordinate of Menu object*/ 
    public static int logoX;
    
    /**logoY coordinate of Menu object*/ 
    public static int logoY;
    
    /**scoreSheetX coordinate of Menu object*/ 
    public static int scoreSheetX;
    
    /**scoreSheetY coordinate of Menu object*/ 
    public static int scoreSheetY;
    
    /**copyRightX coordinate of Menu object*/ 
    public static int copyRightX;
    
    /**copyRightY coordinate of Menu object*/ 
    public static int copyRightY;
    
    /**gameOverTxtScale variable of Menu object*/ 
    public static double gameOverTxtScale;
    
    /**gameOverTxtX coordinate of Menu object*/ 
    public static int gameOverTxtX;
    
    /**gameOverTxtY coordinate of Menu object*/ 
    public static int gameOverTxtY;
    
    /**options variable of Menu object*/ 
    public static String[] options = { "Resume", "Restart", "Quit" };
    
    /**msg variable of Menu object*/ 
    public static String msg;
    
    /**optionsTxtX0 coordinate of Menu object*/ 
    public static int optionsTxtX0;
    
    /**optionsTxtY0 coordinate of Menu object*/ 
    public static int optionsTxtY0;
    
    /**optionsTxtX1 coordinate of Menu object*/ 
    public static int optionsTxtX1;
    
    /**optionsTxtY1 coordinate of Menu object*/ 
    public static int optionsTxtY1;

    /**menuImage BufferedImage of Menu object*/
    public static BufferedImage menuImage;
    
    /**menuImage0 BufferedImage of Menu object*/
    public static BufferedImage menuImage0;
    
    /**menuImage1 BufferedImage of Menu object*/
    public static BufferedImage menuImage1;
    
    /**menuImage2 BufferedImage of Menu object*/
    public static BufferedImage menuImage2;
    
    /**menuImage3 BufferedImage of Menu object*/
    public static BufferedImage menuImage3;
    
    /**startMenuImage BufferedImage of Menu object*/
    public static BufferedImage startMenuImage;
    
    /**startMenuImage0 BufferedImage of Menu object*/
    public static BufferedImage startMenuImage0;
    
    /**startMenuImage1 BufferedImage of Menu object*/
    public static BufferedImage startMenuImage1;
    
    /**playOffBtn BufferedImage of Menu object*/
    public static BufferedImage resumeOffBtn;
    
    /**playOnBtn BufferedImage of Menu object*/
    public static BufferedImage resumeOnBtn;
    
    /**optionsOffBtn BufferedImage of Menu object*/
    public static BufferedImage restartOffBtn;
    
    /**optionsOnBtn BufferedImage of Menu object*/
    public static BufferedImage restartOnBtn;
    
    /**quitOffBtn BufferedImage of Menu object*/
    public static BufferedImage quitOffBtn;
    
    /**quitOnBtn BufferedImage of Menu object*/
    public static BufferedImage quitOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage backOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage backOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage OKOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage OKOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage cancelOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage cancelOnBtn;
    
    /**skipOffBtn BufferedImage of Menu object*/
    public static BufferedImage skipOffBtn;
    
    /**skipOnBtn BufferedImage of Menu object*/
    public static BufferedImage skipOnBtn;   
    
    /**leftArrowIcon BufferedImage of Launcher object*/
    public static BufferedImage leftArrowIcon;
    
    /**rightArrowIcon BufferedImage of Launcher object*/
    public static BufferedImage rightArrowIcon;
    
    
    public static BufferedImage instructionsMenuImage;
    public static BufferedImage instructionsMenuImage0;
    public static BufferedImage instructionsMenuImage1;
    public static BufferedImage aboutMenuImage;
    public static BufferedImage aboutMenuImage0;
    public static BufferedImage aboutMenuImage1;
    public static BufferedImage optionsMenuImage;
    public static BufferedImage optionsMenuImage0;
    public static BufferedImage optionsMenuImage1;
    
    
    public static Border redLine;
    public static Border raisedbevel;
    public static Border loweredbevel;
    public static CompoundBorder compound;
    
    /**creditsX coordinate of CreditsMenu object */
    public static int creditsX;
    
    /**creditsY coordinate of CreditsMenu object */
    public static int creditsY;
    
    /**CreditsRectHeight variable of CreditsMenu Rectangle Object */
    public static int CreditsRectHeight;// = 135 / 12;
    
    /**CreditsRectWidth variable of CreditsMenu Rectangle Object */
    public static int CreditsRectWidth;// = 100 / 18;
    
    /**xSpace0 variable of CreditsMenu object */
    public static int xSpace0;// = 45;
    
    /**xSpace1 variable of CreditsMenu object */
    public static int xSpace1;// = 65;
    
    /**creditsr_w variable of CreditsMenu object */
    public static int creditsr_w;// = 18;
    
    /**creditsr_h variable of CreditsMenu object */
    public static int creditsr_h;// = 12;
    
    /**creditsWidth variable of CreditsMenu object */
    public static int creditsWidth = 340;
    
    /**creditsHeight variable of CreditsMenu object */
    public static int creditsHeight = 180;
    
    
    /**Links*/
    
    /**game a linked Game object*/ 
    public Game game;
    
    
    /**Public protocol*/

    
    /**
     * setUp()
     * 
     */
    public static void setUp(){
        
        resumeOffBtn = new Texture("/menu/resume_off1").getImage();
        resumeOnBtn = new Texture("/menu/resume_on1").getImage();
        restartOffBtn = new Texture("/menu/restart_off1").getImage();
        restartOnBtn = new Texture("/menu/restart_on1").getImage();
        quitOffBtn = new Texture("/menu/quit_off1").getImage();
        quitOnBtn = new Texture("/menu/quit_on1").getImage();
        
        backOffBtn = new Texture("/menu/back_off1").getImage();
        backOnBtn = new Texture("/menu/back_on1").getImage();
        OKOffBtn = new Texture("/menu/OK_off1").getImage();
        OKOnBtn = new Texture("/menu/OK_on1").getImage();
        cancelOffBtn = new Texture("/menu/cancel_off1").getImage();
        cancelOnBtn = new Texture("/menu/cancel_on1").getImage();
        
//        skipOffBtn = new Texture("/menu/credits/skip_off1").getImage();
//        skipOnBtn = new Texture("/menu/credits/skip_on1").getImage();

        leftArrowIcon = new Texture("/menu/arrow1").getImage();
        rightArrowIcon = new Texture("/menu/arrow1R").getImage();
        
        try {
            menuImage = ImageIO.read(Menu.class.getResource("/menu0.png"));
            menuImage0 = ImageIO.read(Menu.class.getResource("/menu1.png"));
            menuImage2 = ImageIO.read(Menu.class.getResource("/menu2.png"));
            menuImage1 = ImageIO.read(Menu.class.getResource("/menu3.png"));
            menuImage3 = ImageIO.read(Menu.class.getResource("/menu4.png"));
            startMenuImage = ImageIO.read(Menu.class.getResource("/menu5.png"));
            startMenuImage0 = ImageIO.read(Menu.class.getResource("/menu6.png"));
            startMenuImage1 = ImageIO.read(Menu.class.getResource("/menu7.png"));
            instructionsMenuImage = ImageIO.read(Menu.class.getResource("/menu8.png"));
            instructionsMenuImage0 = ImageIO.read(Menu.class.getResource("/menu9.png"));
            instructionsMenuImage1 = ImageIO.read(Menu.class.getResource("/menu0.png"));
            aboutMenuImage = ImageIO.read(Menu.class.getResource("/menu1.png"));
            aboutMenuImage0 = ImageIO.read(Menu.class.getResource("/menu2.png"));
            aboutMenuImage1 = ImageIO.read(Menu.class.getResource("/menu3.png"));
            optionsMenuImage = ImageIO.read(Menu.class.getResource("/menu4.png"));
            optionsMenuImage0 = ImageIO.read(Menu.class.getResource("/menu5.png"));
            optionsMenuImage1 = ImageIO.read(Menu.class.getResource("/menu6.png"));
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        redLine = BorderFactory.createLineBorder(Color.cyan, 2);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
        compound = BorderFactory.createCompoundBorder(redLine, compound);
        
        int width = Game.getGameWidth();
        switch(width){
            case 300:
                creditsr_w = 9;
                creditsr_h = 6;

                xSpace0 = 25;
                xSpace1 = 35;
                creditsX = width/2 - creditsWidth/2;
                creditsY = Game.getGameHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 480:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = Game.getGameHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 604:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = Game.getGameHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 180 / creditsr_w;
                CreditsRectHeight = 115 / creditsr_h;
                
                break;
                
            default:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = Game.getGameHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 180 / creditsr_w;
                CreditsRectHeight = 115 / creditsr_h;
                
                break;
                
        }
    }
    
    
    /**
    * render(Graphics2D g)
    * 
    * Renders/Repaints Menu Objects(Overridden)
    * 
    * @param g
    */     
    public void render(Graphics2D g) {
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates Menu Object(Overridden)
    * 
    * @param game - the Game of Menu
    * @param up - the up variable of Menu
    * @param down - the down variable of Menu
    * @param left - the left variable of Menu
    * @param right - the right variable of Menu
    * @param fire - the fire variable of Menu
    */
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
    }
    
}
