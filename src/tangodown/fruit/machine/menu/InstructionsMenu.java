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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ghomez
 */
public class InstructionsMenu extends Menu {

    /**Attributes*/
        
    /**IMfirstTick variable of InstructionsMenu object */ 
    private boolean IMfirstTick = true;
    
    /**IMTimer variable of InstructionsMenu object */ 
    private int IMTimer = 550;
    
    /**IMTimer variable of InstructionsMenu object */ 
    private int tickDelay = 60;
    
    private final JLabel linstructions;
    
    
    /**Constructor*/
    
    
    /**
    * InstructionsMenu(Game game)
    * 
    * Creates a new InstructionsMenu object
    * 
    * @param game
    */
    public InstructionsMenu(Game game) {
        this.game = game;
        Menu.setUp();
        
        Display.instructionsWindow = new JPanel(new FlowLayout());
        Display.instructionsWindow.setBounds(5, 235, 810, 250);
        Display.instructionsWindow.setBorder(compound);
        Display.instructionsWindow.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.90f));
        Display.instructionsWindow.setOpaque(true);
        
        String instructionsTxt = "<html><H1><b><u>Help Menu</b></u></H1><br/>This is the Instructions Menu screen for Tango Down Fruit Machine. A Game by Nick Wright 2018.<br/>This is the Instructions Menu screen for Tango Down Fruit Machine. A Game by Nick Wright 2018. Line 2</html>";
        
        linstructions = new JLabel(instructionsTxt, SwingConstants.CENTER);
        linstructions.setBounds(5, 5, 810, 250);
        linstructions.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.90f));
        linstructions.setOpaque(true);
        
        linstructions.setForeground(Color.red);
        linstructions.setFont(new Font("Digital-7", Font.PLAIN, 18));
        linstructions.setVisible(true);
        
        Display.instructionsWindow.add(linstructions);
        
        Display.addInstructions();
        
        Display.panel.add(Display.instructionsWindow, 0, 0);
    }

    
    /**Public Protocol*/
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints InstructionsMenu Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
        MouseInput.MouseButton = 0;
        
        g.drawImage(instructionsMenuImage, 0, -15, Game.getGameWidth(), Game.getGameHeight()-20, null);

        if(MouseInput.MouseX > 500 && MouseInput.MouseX < 500 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
            g.drawImage(backOffBtn, 500, 630, 80, 30, null);
            instructionsMenuImage = instructionsMenuImage1;

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 500 + 80, 634, 22, 20, null);
                g.drawImage(rightArrowIcon, 500 - 25, 635, 22, 20, null);
            }

            if(MouseInput.MouseButton == 1) {
                Sound.sound5.play();
                
                Display.removeInstructions();
                game.setMenu(null);
                game.stateManager.setState("menu");
                Display.setStatusBar("Ready");
            }
            
        } else {
            instructionsMenuImage = instructionsMenuImage0;
            g.drawImage(backOnBtn, 500, 630, 80, 30, null);
        }


    g.dispose();
        
    }
    
    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates InstructionsMenu Object
    * 
    * @param game - the Game of InstructionsMenu
    * @param up - the up variable of InstructionsMenu
    * @param down - the down variable of InstructionsMenu
    * @param left - the left variable of InstructionsMenu
    * @param right - the right variable of InstructionsMenu
    * @param fire - the fire variable of InstructionsMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(IMTimer > 0) {
            IMTimer--;
        }
        if(IMfirstTick) {
            IMfirstTick = false;
            System.out.println("Cue Instructions Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getSnd()){
                Sound.Soundtrack.loop();
            }
            Display.setStatusBar("Help Menu");
        }
        if(IMTimer == 0) {
        }

    }

}
