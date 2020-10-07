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
public class BankDigitControls implements CommandController {
    
    BankDigits bankDigits;
    
    public static final String BANK_DIGIT_DEFAULT = "BANK_DIGIT_DEFAULT";
    public static final String BANK_DIGIT_ON = "BANK_DIGIT_ON";
    public static final String BANK_DIGIT_OFF = "BANK_DIGIT_OFF";
    public static final String BANK_DIGIT_SKILL_UP = "BANK_DIGIT_SKILL_UP";
    public static final String BANK_DIGIT_SKILL_DOWN = "BANK_DIGIT_SKILL_DOWN";
    public static final String BANK_DIGIT_SKILLSHOT = "BANK_DIGIT_SKILLSHOT";
    public static final String BANK_DIGIT_SKILLSHOT_STOP = "BANK_DIGIT_SKILLSHOT_STOP";
    public static final String BANK_DIGIT_RANDOM_ON = "BANK_DIGIT_RANDOM_ON";
    public static final String BANK_DIGIT_RANDOM_OFF = "BANK_DIGIT_RANDOM_OFF";
    
    public BankDigitControls(BankDigits bankdigits){
        this.bankDigits = bankdigits;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case BANK_DIGIT_DEFAULT:
                bankDigits.defaultDigits();
                break;
            case BANK_DIGIT_ON:
                bankDigits.on();
                break;
            case BANK_DIGIT_OFF:
                bankDigits.off();
                break;
            case BANK_DIGIT_SKILL_UP:
                bankDigits.skillUp();
                break;
            case BANK_DIGIT_SKILL_DOWN:
                bankDigits.skillDown();
                break;
            case BANK_DIGIT_SKILLSHOT:
                bankDigits.skillShot();
                break;
            case BANK_DIGIT_SKILLSHOT_STOP:
                bankDigits.skillShotStop();
                break;
            case BANK_DIGIT_RANDOM_ON:
                bankDigits.randomOn();
                break;
            case BANK_DIGIT_RANDOM_OFF:
                bankDigits.randomOff();
                break;
            default:
                System.out.println("Sorry no abla - Digit operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(BANK_DIGIT_DEFAULT) || 
                command.equals(BANK_DIGIT_ON) || 
                command.equals(BANK_DIGIT_OFF) || 
                command.equals(BANK_DIGIT_SKILL_UP) || 
                command.equals(BANK_DIGIT_SKILL_DOWN) || 
                command.equals(BANK_DIGIT_SKILLSHOT) || 
                command.equals(BANK_DIGIT_SKILLSHOT_STOP) || 
                command.equals(BANK_DIGIT_RANDOM_ON) || 
                command.equals(BANK_DIGIT_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
