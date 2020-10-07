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
public class FeaturesLightControls implements CommandController {
    
    Features featureLights;
    
    public static final String FEATURE_LIGHT_DEFAULT = "FEATURE_LIGHT_DEFAULT";
    public static final String FEATURE_LIGHT_ON = "FEATURE_LIGHT_ON";
    public static final String FEATURE_LIGHT_OFF = "FEATURE_LIGHT_OFF";
    public static final String FEATURE_SKILL_UP = "FEATURE_SKILL_UP";
    public static final String FEATURE_SKILL_DOWN = "FEATURE_SKILL_DOWN";
    public static final String FEATURE_SKILLSHOT = "FEATURE_SKILLSHOT";
    public static final String FEATURE_SKILLSHOT_STOP = "FEATURE_SKILLSHOT_STOP";
    public static final String FEATURE_RANDOM_ON = "FEATURE_RANDOM_ON";
    public static final String FEATURE_RANDOM_OFF = "FEATURE_RANDOM_OFF";

    public FeaturesLightControls(Features features) {
        this.featureLights = features;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case FEATURE_LIGHT_DEFAULT:
                featureLights.defaultLights();
                break;
            case FEATURE_LIGHT_ON:
                featureLights.on();
                break;
            case FEATURE_LIGHT_OFF:
                featureLights.off();
                break;
            case FEATURE_SKILL_UP:
                featureLights.skillUp();
                break;
            case FEATURE_SKILL_DOWN:
                featureLights.skillDown();
                break;
            case FEATURE_SKILLSHOT:
                featureLights.skillShot();
                break;
            case FEATURE_SKILLSHOT_STOP:
                featureLights.skillShotStop();
                break;
            case FEATURE_RANDOM_ON:
                featureLights.randomOn();
                break;
            case FEATURE_RANDOM_OFF:
                featureLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Features Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(FEATURE_LIGHT_DEFAULT) ||
                command.equals(FEATURE_LIGHT_ON) || 
                command.equals(FEATURE_LIGHT_OFF) || 
                command.equals(FEATURE_SKILL_UP) || 
                command.equals(FEATURE_SKILL_DOWN) || 
                command.equals(FEATURE_SKILLSHOT) || 
                command.equals(FEATURE_SKILLSHOT_STOP) || 
                command.equals(FEATURE_RANDOM_ON) || 
                command.equals(FEATURE_RANDOM_OFF)){
            return true;
        }
        return false;
    }
}
