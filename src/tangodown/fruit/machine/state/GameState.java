/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.state;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.gamelogic.Machine;
import tangodown.fruit.machine.graphics.Display;
import java.awt.Graphics2D;

/**
 *
 * @author Ghomez
 */
public class GameState implements State {

    private Machine machine;
    
    @Override
    public void init() {        
        machine = Game.aMachine;//new Machine("play3Reels", this);
    }

    @Override
    public void enter() {
        System.out.println("GameState: Entering Game State . . .");
        
        machine.init();
        Display.panel.add(machine.machinePanel, 0, 0);
    }

    @Override
    public void exit() {
        System.out.println("GameState: Exiting Game State . . .");
    }

    @Override
    public void tick(StateManager statemanager) {
        machine.tick(); 
    }

    @Override
    public void render(Graphics2D g) {
        machine.render(g);
        //Machine.machinePanel.repaint();
    }

    @Override
    public String getName() {
        return "play3Reels";
    }
    
}
