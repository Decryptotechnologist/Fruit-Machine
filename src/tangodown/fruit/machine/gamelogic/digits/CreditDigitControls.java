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
public class CreditDigitControls implements CommandController {
    
    CreditDigits creditDigits;
    
    public static final String CREDIT_DIGIT_DEFAULT = "CREDIT_DIGIT_DEFAULT";
    public static final String CREDIT_DIGIT_ON = "CREDIT_DIGIT_ON";
    public static final String CREDIT_DIGIT_OFF = "CREDIT_DIGIT_OFF";
    public static final String CREDIT_DIGIT_SKILL_UP = "CREDIT_DIGIT_SKILL_UP";
    public static final String CREDIT_DIGIT_SKILL_DOWN = "CREDIT_DIGIT_SKILL_DOWN";
    public static final String CREDIT_DIGIT_SKILLSHOT = "CREDIT_DIGIT_SKILLSHOT";
    public static final String CREDIT_DIGIT_SKILLSHOT_STOP = "CREDIT_DIGIT_SKILLSHOT_STOP";
    public static final String CREDIT_DIGIT_RANDOM_ON = "CREDIT_DIGIT_RANDOM_ON";
    public static final String CREDIT_DIGIT_RANDOM_OFF = "CREDIT_DIGIT_RANDOM_OFF";
    
    public CreditDigitControls(CreditDigits creditdigits){
        this.creditDigits = creditdigits;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case CREDIT_DIGIT_DEFAULT:
                creditDigits.defaultDigits();
                break;
            case CREDIT_DIGIT_ON:
                creditDigits.on();
                break;
            case CREDIT_DIGIT_OFF:
                creditDigits.off();
                break;
            case CREDIT_DIGIT_SKILL_UP:
                creditDigits.skillUp();
                break;
            case CREDIT_DIGIT_SKILL_DOWN:
                creditDigits.skillDown();
                break;
            case CREDIT_DIGIT_SKILLSHOT:
                creditDigits.skillShot();
                break;
            case CREDIT_DIGIT_SKILLSHOT_STOP:
                creditDigits.skillShotStop();
                break;
            case CREDIT_DIGIT_RANDOM_ON:
                creditDigits.randomOn();
                break;
            case CREDIT_DIGIT_RANDOM_OFF:
                creditDigits.randomOff();
                break;
            default:
                System.out.println("Sorry no abla - Digit operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(CREDIT_DIGIT_DEFAULT) || 
                command.equals(CREDIT_DIGIT_ON) || 
                command.equals(CREDIT_DIGIT_OFF) || 
                command.equals(CREDIT_DIGIT_SKILL_UP) || 
                command.equals(CREDIT_DIGIT_SKILL_DOWN) || 
                command.equals(CREDIT_DIGIT_SKILLSHOT) || 
                command.equals(CREDIT_DIGIT_SKILLSHOT_STOP) || 
                command.equals(CREDIT_DIGIT_RANDOM_ON) || 
                command.equals(CREDIT_DIGIT_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
