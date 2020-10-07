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
public class SkillshotLightControls implements CommandController {
    
    Skillshot skillshotLights;
    
    public static final String SKILLSHOT_LIGHT_DEFAULT = "SKILLSHOT_LIGHT_DEFAULT";
    public static final String SKILLSHOT_LIGHT_ON = "SKILLSHOT_LIGHT_ON";
    public static final String SKILLSHOT_LIGHT_OFF = "SKILLSHOT_LIGHT_OFF";
    public static final String SKILLSHOT_SKILL_FORWARD = "SKILLSHOT_SKILL_FORWARD";
    public static final String SKILLSHOT_SKILL_REVERSE = "SKILLSHOT_SKILL_REVERSE";
    public static final String SKILLSHOT_SKILLSHOT = "SKILLSHOT_SKILLSHOT";
    public static final String SKILLSHOT_SKILLSHOT_STOP = "SKILLSHOT_SKILLSHOT_STOP";
    public static final String SKILLSHOT_RANDOM_ON = "SKILLSHOT_RANDOM_ON";
    public static final String SKILLSHOT_RANDOM_OFF = "SKILLSHOT_RANDOM_OFF";
    
    public SkillshotLightControls(Skillshot skill){
        this.skillshotLights = skill;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case SKILLSHOT_LIGHT_DEFAULT:
                skillshotLights.defaultLights();
                break;
            case SKILLSHOT_LIGHT_ON:
                skillshotLights.on();
                break;
            case SKILLSHOT_LIGHT_OFF:
                skillshotLights.off();
                break;
            case SKILLSHOT_SKILL_FORWARD:
                skillshotLights.skillForward();
                break;
            case SKILLSHOT_SKILL_REVERSE:
                skillshotLights.skillReverse();
                break;
            case SKILLSHOT_SKILLSHOT:
                skillshotLights.skillShot();
                break;
            case SKILLSHOT_SKILLSHOT_STOP:
                skillshotLights.skillShotStop();
                break;
            case SKILLSHOT_RANDOM_ON:
                skillshotLights.randomOn();
                break;
            case SKILLSHOT_RANDOM_OFF:
                skillshotLights.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Skillshot Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(SKILLSHOT_LIGHT_DEFAULT) || 
                command.equals(SKILLSHOT_LIGHT_ON) || 
                command.equals(SKILLSHOT_LIGHT_OFF) || 
                command.equals(SKILLSHOT_SKILL_FORWARD) || 
                command.equals(SKILLSHOT_SKILL_REVERSE) || 
                command.equals(SKILLSHOT_SKILLSHOT) || 
                command.equals(SKILLSHOT_SKILLSHOT_STOP) || 
                command.equals(SKILLSHOT_RANDOM_ON) || 
                command.equals(SKILLSHOT_RANDOM_OFF)){
            return true;
        }
        return false;
    }
}
