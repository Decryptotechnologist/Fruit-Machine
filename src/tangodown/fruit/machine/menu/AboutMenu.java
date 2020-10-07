/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.menu;

import tangodown.fruit.machine.input.MouseInput;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.graphics.Display;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ghomez
 */
public class AboutMenu extends Menu {
    
    /**Attributes*/
    
    /**AMfirstTick variable of AboutMenu object */ 
    private boolean AMfirstTick = true;
    
    /**AMTimer variable of AboutMenu object */ 
    private int AMTimer = 550;
    
    /**tickDelay variable of AboutMenu object */ 
    private int tickDelay = 60;

    private JLabel labout;
    
    /**Constructor*/
    
    
    /**
    * AboutMenu(Game game)
    * 
    * Creates a new AboutMenu object
    * 
    * @param game
    */
    public AboutMenu(Game game) {
        this.game = game;
        Menu.setUp();
        
        Display.aboutWindow = new JPanel(new FlowLayout());
        Display.aboutWindow.setBounds(5, 235, 810, 250);
        Display.aboutWindow.setBorder(compound);
        Display.aboutWindow.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.96f));
        Display.aboutWindow.setOpaque(true);
        
        String aboutTxt = "<html><H1><b><u>About Menu</u></b></H1><br/>This is the About Menu screen for Tango Down Fruit Machine. A Game by Nick Wright 2018<br/>This is the About Menu screen for Tango Down Fruit Machine. A Game by Nick Wright 2018 Line 2</html>";
        labout = new JLabel(aboutTxt, SwingConstants.CENTER);
        labout.setBounds(5, 5, 810, 250);
        labout.setForeground(Color.cyan);
        
        labout.setFont(new Font("Digital-7", Font.PLAIN, 18));
        labout.setVisible(true);
        
        Display.aboutWindow.add(labout);
        
        Display.addAbout();
        
        Display.panel.add(Display.aboutWindow, 0, 0);
    }

    
    /**Public Protocol*/
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints AboutMenu Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
        MouseInput.MouseButton = 0;
        
        g.drawImage(aboutMenuImage, 0, -15, Game.getGameWidth(), Game.getGameHeight()-20, null);

        if(MouseInput.MouseX > 500 && MouseInput.MouseX < 500 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
            g.drawImage(backOffBtn, 500, 630, 80, 30, null);
            aboutMenuImage = aboutMenuImage1;

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 500 + 80, 634, 22, 20, null);
                g.drawImage(rightArrowIcon, 500 - 25, 635, 22, 20, null);
            }
            Display.setStatusBar("Back");
            if(MouseInput.MouseButton == 1) {
                Sound.sound5.play();
                
                Display.removeAbout();
                game.setMenu(null);
                game.stateManager.setState("menu");
                Display.setStatusBar("Ready");
            }
            
        } else {
            aboutMenuImage = aboutMenuImage0;
            g.drawImage(backOnBtn, 500, 630, 80, 30, null);
            Display.setStatusBar("About Menu");
        }


        g.dispose();
    
    }

    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates AboutMenu Object
    * 
    * @param game - the Game of AboutMenu
    * @param up - the up variable of AboutMenu
    * @param down - the down variable of AboutMenu
    * @param left - the left variable of AboutMenu
    * @param right - the right variable of AboutMenu
    * @param fire - the fire variable of AboutMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(AMTimer > 0) {
           AMTimer--;
        }
        if(AMfirstTick) {
            AMfirstTick = false;
            System.out.println("Cue About Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getSnd()){
                Sound.Soundtrack.loop();
            }
            Display.setStatusBar("About Menu");
        }
        if(AMTimer == 0) {
        }
    }
    
}
