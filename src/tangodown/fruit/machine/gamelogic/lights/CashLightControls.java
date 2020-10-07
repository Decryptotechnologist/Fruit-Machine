/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.lights;

import tangodown.fruit.machine.gamelogic.CommandController;

/**
 *
 * @author Ghomez
 */
public class CashLightControls implements CommandController {
    
    Cash cashLights;
    
    public static final String CASH_LIGHT_DEFAULT = "CASH_LIGHT_DEFAULT";
    public static final String CASH_LIGHT_ON = "CASH_LIGHT_ON";
    public static final String CASH_LIGHT_OFF = "CASH_LIGHT_OFF";
    public static final String CASH_SKILL_UP = "CASH_SKILL_UP";
    public static final String CASH_SKILL_DOWN = "CASH_SKILL_DOWN";
    public static final String CASH_SKILLSHOT = "CASH_SKILLSHOT";
    public static final String CASH_SKILLSHOT_STOP = "CASH_SKILLSHOT_STOP";
    public static final String CASH_RANDOM_ON = "CASH_RANDOM_ON";
    public static final String CASH_RANDOM_OFF = "CASH_RANDOM_OFF";

    public CashLightControls(Cash cash) {
        this.cashLights = cash;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case CASH_LIGHT_DEFAULT:
                cashLights.defaultLights();
                break;
            case CASH_LIGHT_ON:
                cashLights.on();
                break;
            case CASH_LIGHT_OFF:
                cashLights.off();
                break;
            case CASH_SKILL_UP:
                cashLights.skillUp();
                break;
            case CASH_SKILL_DOWN:
                cashLights.skillDown();
                break;
            case CASH_SKILLSHOT:
                cashLights.skillShot();
                break;
            case CASH_SKILLSHOT_STOP:
                cashLights.skillShotStop();
                break;
            case CASH_RANDOM_ON:
                cashLights.randomOn();
                break;
            case CASH_RANDOM_OFF:
                cashLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Cash Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(CASH_LIGHT_DEFAULT) || 
                command.equals(CASH_LIGHT_ON) || 
                command.equals(CASH_LIGHT_OFF) || 
                command.equals(CASH_SKILL_UP) || 
                command.equals(CASH_SKILL_DOWN) || 
                command.equals(CASH_SKILLSHOT) || 
                command.equals(CASH_SKILLSHOT_STOP) || 
                command.equals(CASH_RANDOM_ON) || 
                command.equals(CASH_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
