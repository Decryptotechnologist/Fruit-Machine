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
public class NudgeLightControls implements CommandController {
    
    Nudges nudgeLights;
    
    public static final String NUDGE_LIGHT_DEFAULT = "NUDGE_LIGHT_DEFAULT";
    public static final String NUDGE_LIGHT_ON = "NUDGE_LIGHT_ON";
    public static final String NUDGE_LIGHT_OFF = "NUDGE_LIGHT_OFF";
    public static final String NUDGE_SKILL_UP = "NUDGE_SKILL_UP";
    public static final String NUDGE_SKILL_DOWN = "NUDGE_SKILL_DOWN";
    public static final String NUDGE_SKILLSHOT = "NUDGE_SKILLSHOT";
    public static final String NUDGE_SKILLSHOT_STOP = "NUDGE_SKILLSHOT_STOP";
    public static final String NUDGE_RANDOM_ON = "NUDGE_RANDOM_ON";
    public static final String NUDGE_RANDOM_OFF = "NUDGE_RANDOM_OFF";

    public NudgeLightControls(Nudges nudges) {
        this.nudgeLights = nudges;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case NUDGE_LIGHT_DEFAULT:
                nudgeLights.defaultLights();
                break;
            case NUDGE_LIGHT_ON:
                nudgeLights.on();
                break;
            case NUDGE_LIGHT_OFF:
                nudgeLights.off();
                break;
            case NUDGE_SKILL_UP:
                nudgeLights.skillUp();
                break;
            case NUDGE_SKILL_DOWN:
                nudgeLights.skillDown();
                break;
            case NUDGE_SKILLSHOT:
                nudgeLights.skillShot();
                break;
            case NUDGE_SKILLSHOT_STOP:
                nudgeLights.skillShotStop();
                break;
            case NUDGE_RANDOM_ON:
                nudgeLights.randomOn();
                break;
            case NUDGE_RANDOM_OFF:
                nudgeLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Nudge Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(NUDGE_LIGHT_DEFAULT) || 
                command.equals(NUDGE_LIGHT_ON) || 
                command.equals(NUDGE_LIGHT_OFF) || 
                command.equals(NUDGE_SKILL_UP) || 
                command.equals(NUDGE_SKILL_DOWN) || 
                command.equals(NUDGE_SKILLSHOT) || 
                command.equals(NUDGE_SKILLSHOT_STOP) || 
                command.equals(NUDGE_RANDOM_ON) || 
                command.equals(NUDGE_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
