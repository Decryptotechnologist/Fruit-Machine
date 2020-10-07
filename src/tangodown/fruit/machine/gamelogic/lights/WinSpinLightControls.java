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
public class WinSpinLightControls implements CommandController {
    
    WinningSpins winspinLights;
    
    public static final String WINSPIN_LIGHT_DEFAULT = "WINSPIN_LIGHT_DEFAULT";
    public static final String WINSPIN_LIGHT_ON = "WINSPIN_LIGHT_ON";
    public static final String WINSPIN_LIGHT_OFF = "WINSPIN_LIGHT_OFF";
    public static final String WINSPIN_SKILL_FORWARD = "WINSPIN_SKILL_FORWARD";
    public static final String WINSPIN_SKILL_REVERSE = "WINSPIN_SKILL_REVERSE";
    public static final String WINSPIN_SKILLSHOT = "WINSPIN_SKILLSHOT";
    public static final String WINSPIN_SKILLSHOT_STOP = "WINSPIN_SKILLSHOT_STOP";
    public static final String WINSPIN_RANDOM_ON = "WINSPIN_RANDOM_ON";
    public static final String WINSPIN_RANDOM_OFF = "WINSPIN_RANDOM_OFF";
    
    public WinSpinLightControls(WinningSpins winSpin) {
        this.winspinLights = winSpin;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case WINSPIN_LIGHT_DEFAULT:
                winspinLights.defaultLights();
                break;
            case WINSPIN_LIGHT_ON:
                winspinLights.on();
                break;
            case WINSPIN_LIGHT_OFF:
                winspinLights.off();
                break;
            case WINSPIN_SKILL_FORWARD:
                winspinLights.skillForward();
                break;
            case WINSPIN_SKILL_REVERSE:
                winspinLights.skillReverse();
                break;
            case WINSPIN_SKILLSHOT:
                winspinLights.skillShot();
                break;
            case WINSPIN_SKILLSHOT_STOP:
                winspinLights.skillShotStop();
                break;
            case WINSPIN_RANDOM_ON:
                winspinLights.randomOn();
                break;
            case WINSPIN_RANDOM_OFF:
                winspinLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - WinSpin Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(WINSPIN_LIGHT_DEFAULT) || 
                command.equals(WINSPIN_LIGHT_ON) || 
                command.equals(WINSPIN_LIGHT_OFF) ||
                command.equals(WINSPIN_SKILL_FORWARD) || 
                command.equals(WINSPIN_SKILL_REVERSE) ||
                command.equals(WINSPIN_SKILLSHOT) ||
                command.equals(WINSPIN_SKILLSHOT_STOP) ||
                command.equals(WINSPIN_RANDOM_ON) ||
                command.equals(WINSPIN_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
