/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.state;

import tangodown.fruit.machine.input.MouseInput;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.graphics.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Ghomez
 */
public class MenuState implements State {


    /**Attributes*/
    
    /**menuImage BufferedImage of MenuState object*/
    private BufferedImage menuImage;
    
    /**menuImage BufferedImage of MenuState object*/
    private BufferedImage menuImage0;
    
    /**menuImage BufferedImage of MenuState object*/
    private BufferedImage menuImage1;
    
    /**menuImage BufferedImage of MenuState object*/
    private BufferedImage menuImage2;
    
    /**menuImage BufferedImage of MenuState object*/
    private BufferedImage menuImage3;
    
    /**playOffBtn BufferedImage of MenuState object*/
    private final BufferedImage playOffBtn;
    
    /**playOnBtn BufferedImage of MenuState object*/
    private final BufferedImage playOnBtn;
    
    /**optionsOffBtn BufferedImage of MenuState object*/
    private final BufferedImage optionsOffBtn;
    
    /**optionsOnBtn BufferedImage of MenuState object*/
    private final BufferedImage optionsOnBtn;
    
    /**helpOffBtn BufferedImage of MenuState object*/
    private final BufferedImage helpOffBtn;
    
    /**helpOnBtn BufferedImage of MenuState object*/
    private final BufferedImage helpOnBtn;
    
    /**quitOffBtn BufferedImage of MenuState object*/
    private final BufferedImage quitOffBtn;
    
    /**quitOnBtn BufferedImage of MenuState object*/
    private final BufferedImage quitOnBtn;
    
    /**aboutOffBtn BufferedImage of MenuState object*/
    private final BufferedImage aboutOffBtn;
    
    /**aboutOnBtn BufferedImage of MenuState object*/
    private final BufferedImage aboutOnBtn;
    
    /**leftArrowIcon BufferedImage of MenuState object*/
    private final BufferedImage leftArrowIcon;
    
    /**rightArrowIcon BufferedImage of MenuState object*/
    private final BufferedImage rightArrowIcon;
    
    /**button_width variable of MenuState object*/ 
    protected int button_width = 160;
    
    /**button_height variable of MenuState object*/ 
    protected int button_height = 80;
    
    /**hlpCol variable of MenuState object*/
    public Color hlpCol = Color.orange;
    
    /**versionCol variable of MenuState object*/
    public Color versionCol = Color.DARK_GRAY;
    
    

    /**Constructor*/
    
    
    /**
    * MenuState(StateManager statemanager)
    * 
    * Creates a new MenuState object
    * 
    */
    public MenuState() {
        System.out.println("MenuState: New Menu State Created");
        
        //Setup MenuState: Button Images
        playOffBtn = new Texture("/Menu/play_off1").getImage();
        playOnBtn = new Texture("/Menu/play_on1").getImage();
        optionsOffBtn = new Texture("/Menu/options_off1").getImage();
        optionsOnBtn = new Texture("/Menu/options_on1").getImage();
        helpOffBtn = new Texture("/Menu/help_off1").getImage();
        helpOnBtn = new Texture("/Menu/help_on1").getImage();
        quitOffBtn = new Texture("/Menu/quit_off1").getImage();
        quitOnBtn = new Texture("/Menu/quit_on1").getImage();
        aboutOffBtn = new Texture("/Menu/about_off1").getImage();
        aboutOnBtn = new Texture("/Menu/about_on1").getImage();

        //Setup MenuState: Arrow Images
        leftArrowIcon = new Texture("/Menu/arrow1").getImage();
        rightArrowIcon = new Texture("/Menu/arrow1R").getImage();
        
        try {
            //Setup MenuState: Background Images
            menuImage = ImageIO.read(MenuState.class.getResource("/menu3A.png"));
            menuImage0 = ImageIO.read(MenuState.class.getResource("/menu4A.png"));
            menuImage2 = ImageIO.read(MenuState.class.getResource("/menu0A.png"));
            menuImage1 = ImageIO.read(MenuState.class.getResource("/menu2A.png"));
            menuImage3 = ImageIO.read(MenuState.class.getResource("/menu1A.png"));
        } catch (IOException ex) {
            Logger.getLogger(MenuState.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * tick(StateManager statemanager, Game game)
    * 
    * Updates MenuState Object
    * 
    * @param statemanager
    */
    @Override
    public void tick(StateManager statemanager){
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints MenuState Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g){
        if(Game.stateManager.getCurrentState().getName().equals("menu")){
            MouseInput.MouseButton = 0;

            //Draw Background
            g.drawImage(menuImage, 0, -20, Game.getGameWidth(), Game.getGameHeight(), null);

            //Render Game Title
            Fonts.drawString(g, new Font("Times New Roman", Font.BOLD, 16), Color.yellow, Game.TITLE, (Game.getGameWidth()/4) - 16, Game.getGameHeight() -76);

            //Render help text
            Fonts.drawString(g, new Font("Times New Roman", Font.BOLD, 16), Color.white, "Use Key(s) W / UP Arrow & S / Down Arrow, or the mouse.", 220, Game.getGameHeight() - 127);
            Fonts.drawString(g, new Font("Times New Roman", Font.BOLD, 16), Color.white, "Enter key / Left Mouse button to select.", 290, Game.getGameHeight() - 107);

            //Draw Play Button
            if (MouseInput.MouseX > 106 && MouseInput.MouseX < 106 + 160 && MouseInput.MouseY > 308 && MouseInput.MouseY < 308 + 60) {
                    g.drawImage(playOffBtn, 106, 308, 160, 60, null);
                    menuImage = menuImage0;
                    hlpCol = Color.orange;
                    versionCol = Color.DARK_GRAY;

                    //Draw Play Button Arrows
                    if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                        g.drawImage(leftArrowIcon, 106 + 164, 334, 22, 20, null);
                        g.drawImage(rightArrowIcon, 106 - 25, 334, 22, 20, null);
                    }
                    Display.setStatusBar("Play3Reels");

                    //Set Play Button Click Logic
                    if (MouseInput.MouseButton == 1) {
                        Sound.sound5.play();

                        System.out.println("MenuState: Play Selected");
                        Game.stateManager.setState("Play3Reels");    
                        Game.getGame().setMenu(null);
                        Game.getMachine().execute("RANDOM_LIGHTS_ALL_ON");
                    }
                    
                } else {
                    g.drawImage(playOnBtn, 106, 308, 160, 60, null);
                }

                //Draw Options Button
                if (MouseInput.MouseX > 106 && MouseInput.MouseX < 106 + 260 && MouseInput.MouseY > 370 && MouseInput.MouseY < 370 + 60) {
                    g.drawImage(optionsOffBtn, 106, 370, 260, 60, null);
                    menuImage = menuImage1;
                    hlpCol = Color.red;
                    versionCol = Color.white;

                    //Draw Options Button Arrows
                    if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                        g.drawImage(leftArrowIcon, 106 + 264, 390, 22, 20, null);
                        g.drawImage(rightArrowIcon, 106 - 24, 392, 22, 20, null);
                    }
                    Display.setStatusBar("Options Menu");

                    //Set Options Button Click Logic
                    if (MouseInput.MouseButton == 1) {
                        Sound.sound5.play();

                        System.out.println("MenuState: Options Selected");
                        Game.getGame().setOptions();
                    }
                    
                } else {
                    g.drawImage(optionsOnBtn, 106, 370, 260, 60, null);
                }

                //Draw Help Button
                if (MouseInput.MouseX > 106 && MouseInput.MouseX < 106 + 160 && MouseInput.MouseY > 432 && MouseInput.MouseY < 432 + 60) {
                    g.drawImage(helpOffBtn, 106, 432, 160, 60, null);
                    menuImage = menuImage2;
                    hlpCol = Color.green;
                    versionCol = Color.red;

                    //Draw Help Button Arrows
                    if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                        g.drawImage(leftArrowIcon, 106 + 164, 458, 22, 20, null);
                        g.drawImage(rightArrowIcon, 106 - 25, 458, 22, 20, null);
                    }
                    Display.setStatusBar("Help Menu");
                    
                    //Set Help Button Click Logic
                    if (MouseInput.MouseButton == 1) {
                        Sound.sound5.play();

                        System.out.println("MenuState: Help Selected");
                        Game.getGame().setInstructions();
                    }
                    
                } else {
                    g.drawImage(helpOnBtn, 106, 432, 160, 60, null);
                }

                //Draw Quit Button
                if (MouseInput.MouseX > 106 && MouseInput.MouseX < 106 + 160 && MouseInput.MouseY > 494 && MouseInput.MouseY < 494 + 60) {
                    g.drawImage(quitOffBtn, 106, 494, 160, 60, null);
                    menuImage = menuImage3;
                    hlpCol = Color.blue;
                    versionCol = Color.CYAN;

                    //Draw Quit Button Arrows
                    if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                        g.drawImage(leftArrowIcon, 106 + 164, 520, 22, 20, null);
                        g.drawImage(rightArrowIcon, 106 - 28, 520, 22, 20, null);
                    }
                    Display.setStatusBar("Quit?");

                    //Set Quit Button Click Logic
                    if (MouseInput.MouseButton == 1) {
                        Display.setStatusBar("Quit Game?");
                        
                        System.out.println("MenuState: Quit Selected");
                        Game.quitGame();
                    }
                    
                } else {
                    g.drawImage(quitOnBtn, 106, 494, 160, 60, null);
                }

                //Draw About Button
                if (MouseInput.MouseX > 720 && MouseInput.MouseX < 720 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
                    g.drawImage(aboutOffBtn, 720, 630, 80, 30, null);

                    //Draw About Button Arrows
                    if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                        g.drawImage(leftArrowIcon, 720 + 80, 634, 22, 20, null);
                        g.drawImage(rightArrowIcon, 720 - 28, 634, 22, 20, null);
                    }

                    //Set About Button Click Logic
                    if (MouseInput.MouseButton == 1) {
                        Sound.sound5.play();

                        System.out.println("MenuState: About Selected");
                        Display.setStatusBar("About Menu");

                        Game.getGame().setAbout();

                    }
                } else {
                    g.drawImage(aboutOnBtn, 720, 630, 80, 30, null);
                }
                
                //Draw Version
                Fonts.drawString(g, new Font("Times New Roman", Font.PLAIN, 12), versionCol, Game.version, 350, 310);

                //Dispose Draw/Clear Screen
                g.dispose();
        }
    }
    
    
    /**
    * init()
    * 
    */
    @Override
    public void init() {
        System.out.println("Initiating Menu State . . .");
    }

    
    /**
    * enter()
    * 
    */
    @Override
    public void enter() {
        System.out.println("Entering Menu State . . .");
    }

    
    /**
    * exit()
    * 
    */
    @Override
    public void exit() {
        System.out.println("Exiting Menu State . . .");
    }

    
    /**
    * getName()
    * 
    * @return "menu" - name of State
    */
    @Override
    public String getName() {
        return "menu";
    }
    
}
