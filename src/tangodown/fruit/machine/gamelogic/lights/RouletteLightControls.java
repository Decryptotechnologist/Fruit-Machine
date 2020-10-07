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
public class RouletteLightControls implements CommandController {
    
    Roulette rouletteLights;
    
    public static final String ROULETTE_LIGHT_DEFAULT = "ROULETTE_LIGHT_DEFAULT";
    public static final String ROULETTE_LIGHT_ON = "ROULETTE_LIGHT_ON";
    public static final String ROULETTE_LIGHT_OFF = "ROULETTE_LIGHT_OFF";
    public static final String ROULETTE_SKILL_CW = "ROULETTE_SKILL_CW";
    public static final String ROULETTE_SKILL_ACW = "ROULETTE_SKILL_ACW";
    public static final String ROULETTE_SKILLSHOT = "ROULETTE_SKILLSHOT";
    public static final String ROULETTE_SKILLSHOT_STOP = "ROULETTE_SKILLSHOT_STOP";
    public static final String ROULETTE_RANDOM_ON = "ROULETTE_RANDOM_ON";
    public static final String ROULETTE_RANDOM_OFF = "ROULETTE_RANDOM_OFF";
    
    public RouletteLightControls(Roulette roulette){
        this.rouletteLights = roulette;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case ROULETTE_LIGHT_DEFAULT:
                rouletteLights.defaultLights();
                break;
            case ROULETTE_LIGHT_ON:
                rouletteLights.on();
                break;
            case ROULETTE_LIGHT_OFF:
                rouletteLights.off();
                break;
            case ROULETTE_SKILL_CW:
                rouletteLights.skillCW();
                break;
            case ROULETTE_SKILL_ACW:
                rouletteLights.skillACW();
                break;
            case ROULETTE_SKILLSHOT:
                rouletteLights.skillShot();
                break;
            case ROULETTE_SKILLSHOT_STOP:
                rouletteLights.skillShotStop();
                break;
            case ROULETTE_RANDOM_ON:
                rouletteLights.randomOn();
                break;
            case ROULETTE_RANDOM_OFF:
                rouletteLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Roulette Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(ROULETTE_LIGHT_DEFAULT) || 
                command.equals(ROULETTE_LIGHT_ON) || 
                command.equals(ROULETTE_LIGHT_OFF) || 
                command.equals(ROULETTE_SKILL_CW) || 
                command.equals(ROULETTE_SKILL_ACW) || 
                command.equals(ROULETTE_SKILLSHOT) || 
                command.equals(ROULETTE_SKILLSHOT_STOP) || 
                command.equals(ROULETTE_RANDOM_ON) || 
                command.equals(ROULETTE_RANDOM_OFF)){
            return true;
        }
        return false;
    }
}
