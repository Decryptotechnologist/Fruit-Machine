/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.digits;

import tangodown.fruit.machine.gamelogic.CommandController;

/**
 *
 * @author Ghomez
 */
public class DigitControls implements CommandController {
    
    Digits digits;
    
    public static final String DIGIT_ON = "DIGIT_ON";
    public static final String DIGIT_OFF = "DIGIT_OFF";
    
    public DigitControls(){
        this.digits = new Digits();
    }

    @Override
    public void execute(String command) {
        switch(command){
            case DIGIT_ON:
                digits.on();
                break;
            case DIGIT_OFF:
                digits.off();
                break;
            default:
                System.out.println("Sorry no abla - Digit operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(DIGIT_ON) || command.equals(DIGIT_OFF)){
            return true;
        }
        return false;
    }
    
}
