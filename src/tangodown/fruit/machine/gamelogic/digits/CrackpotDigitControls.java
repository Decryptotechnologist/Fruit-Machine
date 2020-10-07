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
public class CrackpotDigitControls implements CommandController {
    
    CrackpotDigits crackpotDigits;
    
    public static final String CRACKPOT_DIGIT_DEFAULT = "CRACKPOT_DIGIT_DEFAULT";
    public static final String CRACKPOT_DIGIT_ON = "CRACKPOT_DIGIT_ON";
    public static final String CRACKPOT_DIGIT_OFF = "CRACKPOT_DIGIT_OFF";
    public static final String CRACKPOT_DIGIT_SKILL_UP = "CRACKPOT_DIGIT_SKILL_UP";
    public static final String CRACKPOT_DIGIT_SKILL_DOWN = "CRACKPOT_DIGIT_SKILL_DOWN";
    public static final String CRACKPOT_DIGIT_SKILLSHOT = "CRACKPOT_DIGIT_SKILLSHOT";
    public static final String CRACKPOT_DIGIT_SKILLSHOT_STOP = "CRACKPOT_DIGIT_SKILLSHOT_STOP";
    public static final String CRACKPOT_DIGIT_RANDOM_ON = "CRACKPOT_DIGIT_RANDOM_ON";
    public static final String CRACKPOT_DIGIT_RANDOM_OFF = "CRACKPOT_DIGIT_RANDOM_OFF";
    
    public CrackpotDigitControls(CrackpotDigits crackpotdigits){
        this.crackpotDigits = crackpotdigits;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case CRACKPOT_DIGIT_DEFAULT:
                crackpotDigits.defaultDigits();
                break;
            case CRACKPOT_DIGIT_ON:
                crackpotDigits.on();
                break;
            case CRACKPOT_DIGIT_OFF:
                crackpotDigits.off();
                break;
            case CRACKPOT_DIGIT_SKILL_UP:
                crackpotDigits.skillUp();
                break;
            case CRACKPOT_DIGIT_SKILL_DOWN:
                crackpotDigits.skillDown();
                break;
            case CRACKPOT_DIGIT_SKILLSHOT:
                crackpotDigits.skillShot();
                break;
            case CRACKPOT_DIGIT_SKILLSHOT_STOP:
                crackpotDigits.skillShotStop();
                break;
            case CRACKPOT_DIGIT_RANDOM_ON:
                crackpotDigits.randomOn();
                break;
            case CRACKPOT_DIGIT_RANDOM_OFF:
                crackpotDigits.randomOff();
                break;
            default:
                System.out.println("Sorry no abla - Digit operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(CRACKPOT_DIGIT_DEFAULT) || 
                command.equals(CRACKPOT_DIGIT_ON) || 
                command.equals(CRACKPOT_DIGIT_OFF) || 
                command.equals(CRACKPOT_DIGIT_SKILL_UP) || 
                command.equals(CRACKPOT_DIGIT_SKILL_DOWN) || 
                command.equals(CRACKPOT_DIGIT_SKILLSHOT) || 
                command.equals(CRACKPOT_DIGIT_SKILLSHOT_STOP) || 
                command.equals(CRACKPOT_DIGIT_RANDOM_ON) || 
                command.equals(CRACKPOT_DIGIT_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
