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
public class LightControls implements CommandController {
    
    Lights lights;
    Cash cashLights;
    Nudges nudgeLights;
    Crackpot crackpotLights;
    Features featureLights;
    HiLo hiloLights;
    Roulette rouletteLights;
    Skillshot skillshotLights;
    TangoDownLogo tangodownLights;
    WinningSpins winspinLights;
    //Static1 staticLights;
    
    public static final String LIGHT_ON = "LIGHT_ON";
    public static final String LIGHT_OFF = "LIGHT_OFF";
    
    public LightControls(){
        //this.lights = new Lights();
        this.cashLights = new Cash();
        this.nudgeLights = new Nudges();
        this.crackpotLights = new Crackpot();
        this.featureLights = new Features();
        this.hiloLights = new HiLo();
        this.rouletteLights = new Roulette();
        this.skillshotLights = new Skillshot();
        this.tangodownLights = new TangoDownLogo();
        this.winspinLights = new WinningSpins();
    }

    @Override
    public void execute(String command) {
        switch(command){
            case LIGHT_ON:
                lights.on();
                cashLights.on();
                nudgeLights.on();
                crackpotLights.on();
                lights.on();
                lights.on();
                lights.on();
                lights.on();
                lights.on();
                break;
            case LIGHT_OFF:
                lights.off();
                break;
            default:
                System.out.println("Sorry no abla - Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(LIGHT_ON) || command.equals(LIGHT_OFF)){
            return true;
        }
        return false;
    }
    
}
