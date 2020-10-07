/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.audio;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.sound.sampled.Clip;

/**
 * Sound objects represent the sounds & sfx in the game
 * 
 * @author(s) Ghomez
 */
public class Sound {

    public static Sound Soundtrack;

    /**Attributes*/
        
    /**Audioclip object */
    private AudioClip clip;

    /**Clip object */
    private static Clip clip1;
    
    public static final Sound diagnostic = new Sound("/sfx/Diagnostic complete.wav");
    
    public static final Sound insertCoin = new Sound("/sfx/insertCoin.wav");
    
    public static final Sound start = new Sound("/sfx/Start.wav");
    
    public static final Sound cancel = new Sound("/sfx/Cancel.wav");
    
    public static final Sound hold = new Sound("/sfx/Powerup2.wav");
    
    public static final Sound nudge = new Sound("/sfx/Pickup_Coin2.wav");
    
    public static final Sound winSpin = new Sound("/sfx/WinSpin.wav");
    
    public static final Sound winSpinWin = new Sound("/sfx/Clarinet music.wav");
    
    public static final Sound win1 = new Sound("/sfx/YIPPEE.wav");
    
    public static final Sound win2 = new Sound("/sfx/Impressive.wav");
    
    public static final Sound win3 = new Sound("/sfx/Halleluia.wav");
    
    public static final Sound win4 = new Sound("/sfx/Alright.wav");
    
    public static final Sound win5 = new Sound("/sfx/burns.wav");
    
    public static final Sound winGambleCash = new Sound("/sfx/WinGambleCash.wav");
    
    public static final Sound loseGambleCash = new Sound("/sfx/Unbeleivable.wav");
    
    public static final Sound rollHILO = new Sound("/sfx/RollHiLo.wav");
    
    public static final Sound winHILO = new Sound("/sfx/Classical.wav");
    
    public static final Sound lose = new Sound("/sfx/Lose.wav");
    
    public static final Sound lose1 = new Sound("/sfx/Simpsons ah-crap.wav");
    
    public static final Sound lose2 = new Sound("/sfx/Self destruct.wav");
    
    public static final Sound lose3 = new Sound("/sfx/Cackling laugh.wav");
    
    public static final Sound lose4 = new Sound("/sfx/Exploding.wav");
    
    public static final Sound lose5 = new Sound("/sfx/Laugh.wav");
    
    public static final Sound lose6 = new Sound("/sfx/Unbeleivable.wav");
    
    public static final Sound lose7 = new Sound("/sfx/hell[1].wav");
    
    public static final Sound lose8 = new Sound("/sfx/simp102b[1].wav");
    
    public static final Sound roulette = new Sound("/sfx/Roulette_sfx32.wav");
    
    public static final Sound gambleNudges = new Sound("/sfx/GambleNudges.wav");
    
    public static final Sound nudgeNow = new Sound("/sfx/nudgeNow.wav");
    
    public static final Sound slot = new Sound("/sfx/slot.wav");
    
    public static final Sound reelSpin = new Sound("/sfx/reelSpin.wav");
    
    public static final Sound reelStop = new Sound("/sfx/reelStop.wav");
    
    public static final Sound skillShot = new Sound("/sfx/Medieval.wav");
    
    public static final Sound jackpot = new Sound("/sfx/apjpot[1].wav");
    
    public static final Sound jackpot1 = new Sound("/sfx/Scottish.solo.wav");
    
    public static final Sound quit = new Sound("/sfx/Quitting.wav");
    
    public static final Sound quit1 = new Sound("/sfx/Final Warning. Primary power off-line in 10 seconds.wav");
    
    public static final Sound quit2 = new Sound("/sfx/Self destruct.wav");
    
    //Menu sfx
    /**menu ok wav sound objects */
    public static final Sound sound5 = new Sound("/Pickup_Coin2.wav");
    
    /**Paused wav sound objects */
    public static final Sound Paused = new Sound("/SI2015 Paused.wav");
    
    /**Focus wav sound objects */
    public static final Sound Focus = new Sound("/SI2015 LostFocus.wav");
        
    
    /**Constructor*/
        
    /**
    * Initialises a new Sound object with 
    * (Sound file) filename as the argument
    * 
    * @param filename
    */    
    public Sound(String filename){
	try{
            clip = Applet.newAudioClip(Sound.class.getResource(filename));
	} catch(Exception e){
	}
    }
	
    /**Public Protocol*/
           
    /**
    * Plays reciever Sound object.
    * 
    */
    public void play(){
	try{
            if (clip != null) {
		new Thread(){
                    public void run(){
			synchronized (clip) {
				clip.stop();
				clip.play();
			}					
                    }
		}.start();
            }
	}catch(Exception ex){
	}		
    }

    /**
    * Stops reciever Sound object.
    * 
    */
    public void stop() {
	try{
            clip.stop();
	} catch(Exception exc){
	}
    }

    /**
    * Loops reciever Sound object.
    * 
    */
    public void loop(){
    	try{
            if (clip != null) {
		new Thread(){
                    public void run(){
			synchronized (clip) {
				clip.stop();
				clip.loop();
			}
                    }
		}.start();
            }
	}catch(Exception ex2){
	}
    }
    
}
