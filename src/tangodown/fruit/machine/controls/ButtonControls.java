/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.controls;

import tangodown.fruit.machine.gamelogic.CommandController;

/**
 *
 * @author Ghomez
 */
public class ButtonControls implements CommandController {

    Buttons buttons;
    
    public static final String BUTTONS_DEFAULT = "BUTTONS_DEFAULT";
    public static final String BUTTONS_ON = "BUTTONS_ON";
    public static final String BUTTONS_OFF = "BUTTONS_OFF";
    public static final String BUTTONS_FLASH_ON = "BUTTONS_FLASH_ON";
    public static final String BUTTONS_FLASH_OFF = "BUTTONS_FLASH_OFF";
    public static final String BUTTONS_SKILL_FORWARD = "BUTTONS_SKILL_FORWARD";
    public static final String BUTTONS_SKILL_REVERSE = "BUTTONS_SKILL_REVERSE";
    public static final String BUTTONS_SKILLSHOT = "BUTTONS_SKILLSHOT";
    public static final String BUTTONS_SKILLSHOT_STOP = "BUTTONS_SKILLSHOT_STOP";
    public static final String BUTTONS_RANDOM_ON = "BUTTONS_RANDOM_ON";
    public static final String BUTTONS_RANDOM_OFF = "BUTTONS_RANDOM_OFF";
    
    
    public ButtonControls(Buttons buttons) {
        this.buttons = buttons;
    }
    
    @Override
    public void execute(String command) {
        switch(command){
            case BUTTONS_DEFAULT:
                buttons.defaultButtons();
                break;
            case BUTTONS_ON:
                buttons.on();
                break;
            case BUTTONS_OFF:
                buttons.off();
                break;
            case BUTTONS_FLASH_ON:
                buttons.flashOn();
                break;
            case BUTTONS_FLASH_OFF:
                buttons.flashOff();
                break;
            case BUTTONS_SKILL_FORWARD:
                buttons.skillForward();
                break;
            case BUTTONS_SKILL_REVERSE:
                buttons.skillReverse();
                break;
            case BUTTONS_SKILLSHOT:
                buttons.skillShot();
                break;
            case BUTTONS_SKILLSHOT_STOP:
                buttons.skillShotStop();
                break;
            case BUTTONS_RANDOM_ON:
                buttons.randomOn();
                break;
            case BUTTONS_RANDOM_OFF:
                buttons.randomOff();
                break;
//            default:
//                System.out.println("Sorry no abla - Cash Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(BUTTONS_DEFAULT) || 
                command.equals(BUTTONS_ON) || 
                command.equals(BUTTONS_OFF) || 
                command.equals(BUTTONS_SKILL_FORWARD) || 
                command.equals(BUTTONS_SKILL_REVERSE) || 
                command.equals(BUTTONS_SKILLSHOT) || 
                command.equals(BUTTONS_SKILLSHOT_STOP) || 
                command.equals(BUTTONS_RANDOM_ON) || 
                command.equals(BUTTONS_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
