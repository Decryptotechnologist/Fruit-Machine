/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * @author Ghomez
 */
public class Input extends KeyAdapter {
    
    /**Attributes*/
    
    private static final int NUM_KEYS = 256;
    
    /**key attribute of InputHandler object */    
    public static boolean[] key = new boolean[NUM_KEYS];
    
    private static final boolean[] lastKeys = new boolean[NUM_KEYS];

    /**Up value of InputHandler object */
    public boolean up;
    
    /**Down value of InputHandler object */
    public boolean down;
    
    /**Left value of InputHandler object */
    public boolean left;
    
    /**Right value of InputHandler object */
    public boolean right;
    
    /**Fire value of InputHandler object */
    public boolean fire;

    /**Public Protocol*/
    
    /**
     * tick()
     * 
     */
    public void tick() {

        up = key[KeyEvent.VK_W] || key[KeyEvent.VK_UP];
        down = key[KeyEvent.VK_S] || key[KeyEvent.VK_DOWN];
        left = key[KeyEvent.VK_A] || key[KeyEvent.VK_LEFT];
        right = key[KeyEvent.VK_D] || key[KeyEvent.VK_RIGHT];
        fire = key[KeyEvent.VK_SPACE];

        if (fire) {
            key[KeyEvent.VK_SPACE] = false;
        }

        if (key[KeyEvent.VK_ESCAPE]) {
            key[KeyEvent.VK_ESCAPE] = false;

        }
        for(int i = 0; i < NUM_KEYS; i++){
            lastKeys[i] = key[i];
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode > 0 && keyCode < key.length) {
            key[keyCode] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode > 0 && keyCode < key.length) {
            key[keyCode] = false;
        }
    }

    public static boolean isKeyDown(int k){
        return key[k];
    }
    
    public static boolean wasPressed(int k){
        return isKeyDown(k) && !lastKeys[k];
    }
    
    public static boolean wasReleased(int k){
        return !isKeyDown(k) && lastKeys[k];
    }
    
}
