/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.state;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ghomez
 */
public class StateManager extends Canvas {

    
    /**Attributes*/
    
    /**map variable of StateManager object*/
    private final Map<String, State> map;
    
    
    /**Links*/
    
    /**currentState State of StateManager object*/
    private State currentState = null;

    
    /**Constructor*/
    
    public StateManager() {
        map = new HashMap<String, State>();
    }
    
    /**Public Protocol*/
    
    /**
     * addState()
     * 
     * @param state
     */
    public void addState(State state){
        map.put(state.getName().toUpperCase(), state);
        state.init();
        if(currentState == null){
            state.enter();
            currentState = state;
        }
    }
    
    /**
     * setState()
     * 
     * @param name
     */
    public void setState(String name){
        State state = map.get(name.toUpperCase());
        if(currentState == null){
            System.err.println("State <" + name + "> does not exist!");
            return;
        }
        currentState.exit();
        state.enter();
        currentState = state;
    }
    
    public void tick(){
        currentState.tick(this);
    }
    
    public void render(Graphics2D g){
        currentState.render(g);
    }
    
    public State getCurrentState(){
        return currentState;
    }
    
}
