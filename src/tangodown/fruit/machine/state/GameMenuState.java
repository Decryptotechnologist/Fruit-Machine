/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.state;

import java.awt.Graphics2D;

/**
 *
 * @author Ghomez
 */
public class GameMenuState implements State {
    
    /**Constructor*/
    
    
    /**
    * GameState()
    * 
    * Creates a new GameState object
    */
    public GameMenuState() {
        
    }

    
    
    /**Public Protocol*/
    
    
    /**
    * init()
    */
    @Override
    public void init() {
        System.out.println("Initiating GameMenu State . . .");
    }

    
    /**
    * enter()
    */
    @Override
    public void enter() {
        System.out.println("Entering GameMenu State . . .");        
    }

    
    /**
    * exit()
    */
    @Override
    public void exit() {
        System.out.println("Exiting GameMenu State . . .");
        //Sound.Menu.stop();
    }

    
    /**
    * tick(StateManager statemanager, Game game)
    * 
    * Updates GameState Object
    * 
    * @param statemanager
    * @param game
    */
    @Override
    public void tick(StateManager statemanager) {
    }

    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints GameState Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
    }

    
    /**
    * getName()
    * 
    * @return "Level 1" - name of State
    */
    @Override
    public String getName() {
        return "GameMenu";
    }
    
}
