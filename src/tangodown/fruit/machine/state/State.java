/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.state;

import java.awt.Graphics2D;

/**
 * @author Ghomez
 */
public interface State {
    

    /**Public Protocol*/
    
    /**
     * init()
     * 
     */
    public void init(); 

    /**
     * enter()
     * 
     */
    public void enter();
    
    /**
     * exit()
     * 
     */
    public void exit();
    
    /**
     * getName()
     * 
     * @return stateName
     */
    public String getName();
    
    /**
     * tick()
     * 
     * @param sManager
     */
    public void tick(StateManager sManager);

    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g);
    
}
