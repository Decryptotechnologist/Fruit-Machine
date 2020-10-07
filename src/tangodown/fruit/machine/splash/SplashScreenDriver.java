/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.splash;

import tangodown.fruit.machine.audio.Sound;


/**
 *
 * @author Ghomez
 */
public class SplashScreenDriver {

    private SplashScreen screen;

    public SplashScreenDriver() {
        screen = new SplashScreen();
        screen.setLocationRelativeTo(null);
        screen.setMaxProgress(1000);
        //screen.setSize(640, 480);
        screen.setVisible(true);
        
        for(int i = 0; i <= 1000; i++){
            for(int j = 0; j <= 50000; j++){
                String t = "ewf" + (i + j); 
            }
            screen.setProgress(i);
        }
        Sound.diagnostic.play();
        screen.setVisible(false);
    }
    
}
