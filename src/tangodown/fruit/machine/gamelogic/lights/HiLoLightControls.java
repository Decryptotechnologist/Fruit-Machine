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
public class HiLoLightControls implements CommandController {
    
    HiLo hiloLights;
    
    public static final String HILO_LIGHT_DEFAULT = "HILO_LIGHT_DEFAULT";
    public static final String HILO_LIGHT_ON = "HILO_LIGHT_ON";
    public static final String HILO_LIGHT_OFF = "HILO_LIGHT_OFF";
    
    public HiLoLightControls(HiLo hilo){
        this.hiloLights = hilo;
    }

    @Override
    public void execute(String command) {
        switch(command){
            case HILO_LIGHT_DEFAULT:
                hiloLights.defaultLights();
                break;
            case HILO_LIGHT_ON:
                hiloLights.on();
                break;
            case HILO_LIGHT_OFF:
                hiloLights.off();
                break;
//            default:
//                System.out.println("Sorry no abla - Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(HILO_LIGHT_DEFAULT) || 
                command.equals(HILO_LIGHT_ON) || 
                command.equals(HILO_LIGHT_OFF)){
            return true;
        }
        return false;
    }
}
