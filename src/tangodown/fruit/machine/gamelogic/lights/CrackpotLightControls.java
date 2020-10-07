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
public class CrackpotLightControls implements CommandController {
    
    Crackpot crackpotLights;
    
    public static final String CRACKPOT_LIGHT_DEFAULT = "CRACKPOT_LIGHT_DEFAULT";
    public static final String CRACKPOT_LIGHT_ON = "CRACKPOT_LIGHT_ON";
    public static final String CRACKPOT_LIGHT_OFF = "CRACKPOT_LIGHT_OFF";
    public static final String CRACKPOT_SKILL_FORWARD = "CRACKPOT_SKILL_FORWARD";
    public static final String CRACKPOT_SKILL_REVERSE = "CRACKPOT_SKILL_REVERSE";
    public static final String CRACKPOT_SKILLSHOT = "CRACKPOT_SKILLSHOT";
    public static final String CRACKPOT_SKILLSHOT_STOP = "CRACKPOT_SKILLSHOT_STOP";
    public static final String CRACKPOT_RANDOM_ON = "CRACKPOT_RANDOM_ON";
    public static final String CRACKPOT_RANDOM_OFF = "CRACKPOT_RANDOM_OFF";

    public CrackpotLightControls(Crackpot crack) {
        this.crackpotLights = crack;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case CRACKPOT_LIGHT_DEFAULT:
                crackpotLights.defaultLights();
                break;
            case CRACKPOT_LIGHT_ON:
                crackpotLights.on();
                break;
            case CRACKPOT_LIGHT_OFF:
                crackpotLights.off();
                break;
            case CRACKPOT_SKILL_FORWARD:
                crackpotLights.skillForward();
                break;
            case CRACKPOT_SKILL_REVERSE:
                crackpotLights.skillReverse();
                break;
            case CRACKPOT_SKILLSHOT:
                crackpotLights.skillShot();
                break;
            case CRACKPOT_SKILLSHOT_STOP:
                crackpotLights.skillShotStop();
                break;
            case CRACKPOT_RANDOM_ON:
                crackpotLights.randomOn();
                break;
            case CRACKPOT_RANDOM_OFF:
                crackpotLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Crackpot Light operation - vor comma du fro!!!");
        }
    }

    @Override 
    public boolean canHandle(String command) {
        if(command.equals(CRACKPOT_LIGHT_DEFAULT) || 
                command.equals(CRACKPOT_LIGHT_ON) || 
                command.equals(CRACKPOT_LIGHT_OFF) || 
                command.equals(CRACKPOT_SKILL_FORWARD) || 
                command.equals(CRACKPOT_SKILL_REVERSE) || 
                command.equals(CRACKPOT_SKILLSHOT) || 
                command.equals(CRACKPOT_SKILLSHOT_STOP) || 
                command.equals(CRACKPOT_RANDOM_ON) || 
                command.equals(CRACKPOT_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
