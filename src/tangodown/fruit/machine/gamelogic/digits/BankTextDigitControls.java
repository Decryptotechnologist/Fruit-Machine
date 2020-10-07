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
public class BankTextDigitControls implements CommandController {
    
    BankText banktext;
    
    public static final String BANKTEXT_DIGIT_DEFAULT = "BANKTEXT_DIGIT_DEFAULT";
    public static final String BANKTEXT_DIGIT_ON = "BANKTEXT_DIGIT_ON";
    public static final String BANKTEXT_DIGIT_OFF = "BANKTEXT_DIGIT_OFF";
    public static final String BANKTEXT_SKILL_UP = "BANKTEXT_SKILL_UP";
    public static final String BANKTEXT_SKILL_DOWN = "BANKTEXT_SKILL_DOWN";
    public static final String BANKTEXT_SKILLSHOT = "BANKTEXT_SKILLSHOT";
    public static final String BANKTEXT_SKILLSHOT_STOP = "BANKTEXT_SKILLSHOT_STOP";
    public static final String BANKTEXT_RANDOM_ON = "BANKTEXT_RANDOM_ON";
    public static final String BANKTEXT_RANDOM_OFF = "BANKTEXT_RANDOM_OFF";
    
    public static final String BANKTEXT_JACKPOT_ON = "BANKTEXT_JACKPOT_ON";
    public static final String BANKTEXT_LOSE_ON = "BANKTEXT_LOSE_ON";
    public static final String BANKTEXT_GAMBLE_ON = "BANKTEXT_GAMBLE_ON";
    public static final String BANKTEXT_GAME_OVER_ON = "BANKTEXT_GAME_OVER_ON";
    public static final String BANKTEXT_NUDGE_NOW_ON = "BANKTEXT_NUDGE_NOW_ON";
    public static final String BANKTEXT_YOU_WON_ON = "BANKTEXT_YOU_WON_ON";
    public static final String BANKTEXT_SUPER_HOLD_ON = "BANKTEXT_SUPER_HOLD_ON";
    public static final String BANKTEXT_LET_EM_SPIN_ON = "BANKTEXT_LET_EM_SPIN_ON";
    public static final String BANKTEXT_COLLECT_CASH_ON = "BANKTEXT_COLLECT_CASH_ON";
    public static final String BANKTEXT_COLLECT_NUDGES_ON = "BANKTEXT_COLLECT_NUDGES_ON";
    public static final String BANKTEXT_COLLECT_FEATURES_ON = "BANKTEXT_COLLECT_FEATURES_ON";
    
    public BankTextDigitControls(BankText banktext){
        this.banktext = banktext;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case BANKTEXT_DIGIT_DEFAULT:
                banktext.defaultDigits();
                break;
            case BANKTEXT_DIGIT_ON:
                banktext.on();
                break;
            case BANKTEXT_DIGIT_OFF:
                banktext.off();
                break;
            case BANKTEXT_SKILL_UP:
                banktext.skillUp();
                break;
            case BANKTEXT_SKILL_DOWN:
                banktext.skillDown();
                break;
            case BANKTEXT_SKILLSHOT:
                banktext.skillShot();
                break;
            case BANKTEXT_SKILLSHOT_STOP:
                banktext.skillShotStop();
                break;
            case BANKTEXT_RANDOM_ON:
                banktext.randomOn();
                break;
            case BANKTEXT_RANDOM_OFF:
                banktext.randomOff();
                break;
            case BANKTEXT_JACKPOT_ON:
                banktext.setText(3);
                break;
            case BANKTEXT_LOSE_ON:
                banktext.setText(15);
                break;
            case BANKTEXT_GAMBLE_ON:
                banktext.setText(16);
                break;
            case BANKTEXT_GAME_OVER_ON:
                banktext.setText(17);
                break;
            case BANKTEXT_NUDGE_NOW_ON:
                banktext.setText(11);
                break;
            case BANKTEXT_YOU_WON_ON:
                banktext.setText(10);
                break;
            case BANKTEXT_SUPER_HOLD_ON:
                banktext.setText(9);
                break;
            case BANKTEXT_LET_EM_SPIN_ON:
                banktext.setText(8);
                break;
            case BANKTEXT_COLLECT_CASH_ON:
                banktext.setText(7);
                break;
            case BANKTEXT_COLLECT_NUDGES_ON:
                banktext.setText(6);
                break;
            case BANKTEXT_COLLECT_FEATURES_ON:
                banktext.setText(5);
                break;
            default:
                System.out.println("Sorry no abla - Digit operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(BANKTEXT_DIGIT_DEFAULT) || 
                command.equals(BANKTEXT_DIGIT_ON) || 
                command.equals(BANKTEXT_DIGIT_OFF) || 
                command.equals(BANKTEXT_SKILL_UP) || 
                command.equals(BANKTEXT_SKILL_DOWN) || 
                command.equals(BANKTEXT_SKILLSHOT) || 
                command.equals(BANKTEXT_SKILLSHOT_STOP) || 
                command.equals(BANKTEXT_RANDOM_ON) || 
                command.equals(BANKTEXT_RANDOM_OFF) || 
                command.equals(BANKTEXT_JACKPOT_ON) || 
                command.equals(BANKTEXT_LOSE_ON) || 
                command.equals(BANKTEXT_GAMBLE_ON) || 
                command.equals(BANKTEXT_GAME_OVER_ON) || 
                command.equals(BANKTEXT_NUDGE_NOW_ON) || 
                command.equals(BANKTEXT_YOU_WON_ON) || 
                command.equals(BANKTEXT_SUPER_HOLD_ON) || 
                command.equals(BANKTEXT_LET_EM_SPIN_ON) || 
                command.equals(BANKTEXT_COLLECT_CASH_ON) || 
                command.equals(BANKTEXT_COLLECT_NUDGES_ON) || 
                command.equals(BANKTEXT_COLLECT_FEATURES_ON)){
            return true;
        }
        return false;
    }
    
}
