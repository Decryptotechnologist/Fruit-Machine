/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Ghomez
 */
public class MouseInput extends MouseAdapter {

    /**Mouse x attribute of InputHandler object */
    public static int MouseX;
    
    /**Mouse y coordinate of InputHandler object */
    public static int MouseY;
    
    /**Mouse dx coordinate of InputHandler object */
    public static int MouseDX;
    
    /**Mouse dy coordinate of InputHandler object */
    public static int MouseDY;
    
    /**Mouse px coordinate of InputHandler object */
    public static int MousePX;
    
    /**Mouse py coordinate of InputHandler object */
    public static int MousePY;
    
    /**Mouse button attribute of InputHandler object */
    public static int MouseButton;
    
    /**Mouse dragged attribute of InputHandler object */
    public static boolean dragged = false;
    
    private static final int NUM_BUTTONS = 256;
    
    //private static int dragX = -1, dragY = -1;
    
    private static int lastX, lastY;
    
    //private static int x = -1, y = -1;
            
    public static final boolean[] buttons = new boolean[NUM_BUTTONS];
    
    private static final boolean[] lastButtons = new boolean[NUM_BUTTONS];
    private static boolean moving;
    
    @Override
    public void mouseMoved(MouseEvent m) {
        MouseX = m.getX();
        MouseY = m.getY();
        moving = true;
    }

    @Override
    public void mouseDragged(MouseEvent m) {
        MouseDX = m.getX();
        MouseDY = m.getY();
        dragged = true;
    }

    @Override
    public void mouseReleased(MouseEvent m) {
        MouseButton = m.getButton();
        buttons[MouseButton] = false;
        dragged = false;
    }

    @Override
    public void mousePressed(MouseEvent m) {
        MouseButton = m.getButton();
        buttons[MouseButton] = true;
        MousePX = m.getX();
        MousePY = m.getY();
    }
    
    public static void tick(){
        for(int i = 0; i < NUM_BUTTONS; i++){
            lastButtons[i] = buttons[i];
        }
        if(MouseX == lastX && MouseY == lastY){
            moving = false;
        }
        lastX = MouseX;
        lastY = MouseY;
        //dragged = false;
    }
    
    public static boolean isButtonDown(int btn){
        return buttons[btn];
    }
    
    public static boolean wasPressed(int btn){
        return isButtonDown(btn) && !lastButtons[btn];
    }
    
    public static boolean wasReleased(int btn){
        return !isButtonDown(btn) && lastButtons[btn];
    }

    public static int getX() {
        return MouseX;
    }

    public static int getY() {
        return MouseY;
    }
    
    public static boolean isMoving(){
        return moving;
    }
    
}
