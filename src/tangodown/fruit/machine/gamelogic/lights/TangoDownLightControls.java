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
public class TangoDownLightControls implements CommandController {
    
    TangoDownLogo tangodownLights;
    
    public static final String TANGODOWN_LIGHT_DEFAULT = "TANGODOWN_LIGHT_DEFAULT";
    public static final String TANGODOWN_LIGHT_ON = "TANGODOWN_LIGHT_ON";
    public static final String TANGODOWN_LIGHT_OFF = "TANGODOWN_LIGHT_OFF";
    public static final String TANGODOWN_SKILL_FORWARD = "TANGODOWN_SKILL_FORWARD";
    public static final String TANGODOWN_SKILL_REVERSE = "TANGODOWN_SKILL_REVERSE";
    public static final String TANGODOWN_SKILLSHOT = "TANGODOWN_SKILLSHOT";
    public static final String TANGODOWN_SKILLSHOT_STOP = "TANGODOWN_SKILLSHOT_STOP";
    public static final String TANGODOWN_RANDOM_ON = "TANGODOWN_RANDOM_ON";
    public static final String TANGODOWN_RANDOM_OFF = "TANGODOWN_RANDOM_OFF";
    
    public TangoDownLightControls(TangoDownLogo tango) {
        this.tangodownLights = tango;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case TANGODOWN_LIGHT_DEFAULT:
                tangodownLights.defaultLights();
                break;
            case TANGODOWN_LIGHT_ON:
                tangodownLights.on();
                break;
            case TANGODOWN_LIGHT_OFF:
                tangodownLights.off();
                break;
            case TANGODOWN_SKILL_FORWARD:
                tangodownLights.skillForward();
                break;
            case TANGODOWN_SKILL_REVERSE:
                tangodownLights.skillReverse();
                break;
            case TANGODOWN_SKILLSHOT:
                tangodownLights.skillShot();
                break;
            case TANGODOWN_SKILLSHOT_STOP:
                tangodownLights.skillShotStop();
                break;
            case TANGODOWN_RANDOM_ON:
                tangodownLights.randomOn();
                break;
            case TANGODOWN_RANDOM_OFF:
                tangodownLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - TangoDown Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(TANGODOWN_LIGHT_DEFAULT) || 
                command.equals(TANGODOWN_LIGHT_ON) || 
                command.equals(TANGODOWN_LIGHT_OFF) || 
                command.equals(TANGODOWN_SKILL_FORWARD) || 
                command.equals(TANGODOWN_SKILL_REVERSE) || 
                command.equals(TANGODOWN_SKILLSHOT) || 
                command.equals(TANGODOWN_SKILLSHOT_STOP) || 
                command.equals(TANGODOWN_RANDOM_ON) || 
                command.equals(TANGODOWN_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
