/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.lights;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 * @author Ghomez
 */
public class Roulette {
    
    /**Attributes*/
    
    /**Roulette light width variable of Features object */
    public int RouletteLightWidth = 66;
    
    /**Roulette light height variable of Features object */
    public int RouletteLightHeight = 62;
    
    /**roul1 button/light variables of Features object */ 
    public JButton roul1;
    private final int roul1LgtX = 382, roul1LgtY = 104;
    private BufferedImage roul1Onlight, roul1Offlight;
    private boolean roul1On;
    
    /**roul2 button/light variables of Features object */ 
    public JButton roul2;
    private final int roul2LgtX = 404, roul2LgtY = 112;
    private BufferedImage roul2OnLight, roul2OffLight;
    private boolean roul2On;
    
    /**roul3 button/light variables of Features object */ 
    public JButton roul3;
    private final int roul3LgtX = 427, roul3LgtY = 134;
    private BufferedImage roul3Onlight, roul3Offlight;
    private boolean roul3On;
    
    /**roul4 button/light variables of Features object */ 
    public JButton roul4;
    private final int roul4LgtX = 438, roul4LgtY = 163;
    private BufferedImage roul4OnLight, roul4OffLight;
    private boolean roul4On;
    
    /**roul5 button/light variables of Features object */ 
    public JButton roul5;
    private final int roul5LgtX = 440, roul5LgtY = 195;
    private BufferedImage roul5Onlight, roul5Offlight;
    private boolean roul5On;
    
    /**roul6 button/light variables of Features object */ 
    public JButton roul6;
    private final int roul6LgtX = 424, roul6LgtY = 223;
    private BufferedImage roul6OnLight, roul6OffLight;
    private boolean roul6On;
    
    /**roul7 button/light variables of Features object */ 
    public JButton roul7;
    private final int roul7LgtX = 403, roul7LgtY = 244;
    private BufferedImage roul7Onlight, roul7Offlight;
    private boolean roul7On;
    
    /**roul8 button/light variables of Features object */ 
    public JButton roul8;
    private final int roul8LgtX = 384, roul8LgtY = 269;
    private BufferedImage roul8Onlight, roul8Offlight;
    private boolean roul8On;
    
    /**roul9 button/light variables of Features object */ 
    public JButton roul9;
    private final int roul9LgtX = 356, roul9LgtY = 284;
    private BufferedImage roul9OnLight, roul9OffLight;
    private boolean roul9On;
    
    /**roul10 button/light variables of Features object */ 
    public JButton roul10;
    private final int roul10LgtX = 310, roul10LgtY = 268;
    private BufferedImage roul10Onlight, roul10Offlight;
    private boolean roul10On;
    
    /**roul11 button/light variables of Features object */ 
    public JButton roul11;
    private final int roul11LgtX = 268, roul11LgtY = 242;
    private BufferedImage roul11OnLight, roul11OffLight;
    private boolean roul11On;
    
    /**roul12 button/light variables of Features object */ 
    public JButton roul12;
    private final int roul12LgtX = 243, roul12LgtY = 219;
    private BufferedImage roul12Onlight, roul12Offlight;
    private boolean roul12On;
    
    /**roul13 button/light variables of Features object */ 
    public JButton roul13;
    private final int roul13LgtX = 232, roul13LgtY = 191;
    private BufferedImage roul13OnLight, roul13OffLight;
    private boolean roul13On;
    
    /**roul14 button/light variables of Features object */ 
    public JButton roul14;
    private final int roul14LgtX = 233, roul14LgtY = 161;
    private BufferedImage roul14Onlight, roul14Offlight;
    private boolean roul14On;
    
    /**roul15 button/light variables of Features object */ 
    public JButton roul15;
    private final int roul15LgtX = 246, roul15LgtY = 133;
    private BufferedImage roul15Onlight, roul15Offlight;
    private boolean roul15On;
    
    /**roul16 button/light variables of Features object */ 
    public JButton roul16;
    private final int roul16LgtX = 272, roul16LgtY = 110;
    private BufferedImage roul16OnLight, roul16OffLight;
    private boolean roul16On;
    
    /**roul17 button/light variables of Features object */ 
    public JButton roul17;
    private final int roul17LgtX = 310, roul17LgtY = 104;
    private BufferedImage roul17Onlight, roul17Offlight;
    private boolean roul17On;
    
    /**roul18 button/light variables of Features object */ 
    public JButton roul18;
    private final int roul18LgtX = 357, roul18LgtY = 111;
    private BufferedImage roul18OnLight, roul18OffLight;
    private boolean roul18On;
    
    /**allRoulette List variable of Roulette object */
    public List<JButton> allRoulette;
    
    /**allRouletteReverse List variable of Roulette object */
    public List<JButton> allRouletteReverse;
    
    /**roulettePanel JPanel variable of Roulette object */
    public JPanel roulettePanel;
    
    /**excecutorService_SkillRouletteCW ScheduledExecutorService variable of Roulette object */
    private ScheduledExecutorService excecutorService_SkillRouletteCW = Executors.newSingleThreadScheduledExecutor();
    
    /**excecutorService_SkillRouletteACW ScheduledExecutorService variable of Roulette object */
    private ScheduledExecutorService excecutorService_SkillRouletteACW = Executors.newSingleThreadScheduledExecutor();
    
    /**excecutorService_RandomRouletteOn ScheduledExecutorService variable of Roulette object */
    private ScheduledExecutorService excecutorService_RandomRouletteOn = Executors.newScheduledThreadPool(1);
    
    /**excecutorService_SkillShotRoulette ScheduledExecutorService variable of Roulette object */
    private ScheduledExecutorService excecutorService_SkillShotRoulette = Executors.newSingleThreadScheduledExecutor();
    
    /**currentSkillRoulette JButton variable of Roulette object */
    private JButton currentSkillRoulette;
    
    /**skillRouletteACW Runnable variable of Roulette object */
    private final Runnable skillRouletteACW;
    
    /**skillRouletteACWPool ExecutorService variable of Roulette object */
    private final ExecutorService skillRouletteACWPool = Executors.newFixedThreadPool(1);
    
    /**skillRouletteCW Runnable variable of Roulette object */
    private final Runnable skillRouletteCW;
    
    /**skillRouletteCWPool ExecutorService variable of Roulette object */
    private final ExecutorService skillRouletteCWPool = Executors.newFixedThreadPool(1);
    
    /**spinReelRoulette Runnable variable of Roulette object */
    private final Runnable spinReelRoulette;
    
    /**currentPOS variable of Roulette object */
    private int currentPOS;
    
    /**spinReelRouletteACW Runnable variable of Roulette object */
    private final Runnable spinReelRouletteACW;
    
    
    
    /**Constructor*/
    
    /**
     * Roulette Constructor
     * 
     */
    public Roulette(){
        allRoulette = new ArrayList<>();
        allRouletteReverse = new ArrayList<>();
        init();
        
        spinReelRoulette = new Runnable(){
            @Override
            public void run(){
                int newPOS = 0;
        
                for(int c = 0; c < allRoulette.size(); c++){
                    if(getOn(allRoulette.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 18){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allRoulette.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allRoulette.get(c).getText(), false);

                        break;
                    } 
                }
            }
        };
        
        spinReelRouletteACW = new Runnable(){
            @Override
            public void run(){
                int newPOS = 0;
        
                for(int c = 0; c < allRouletteReverse.size(); c++){
                    if(getOn(allRouletteReverse.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 18){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allRouletteReverse.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allRouletteReverse.get(c).getText(), false);

                        break;
                    } 
                }
            }
        };
        
        skillRouletteCW = new Runnable(){
            
            @Override
            public void run(){
                for(JButton roulette : allRoulette){
                    if(excecutorService_SkillRouletteCW.isShutdown() || 
                            excecutorService_RandomRouletteOn.isShutdown() || 
                            Thread.currentThread().isInterrupted()){
//                        try {
//                            Thread.currentThread().join();
//                        } catch (InterruptedException ex) {
//                        }
                        break;
                    } else {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        setOn(roulette.getText(), true);
                        currentSkillRoulette = roulette;
                    }
                }
        
            }
        };
        
        skillRouletteACW = new Runnable(){
            @Override
            public void run(){
                for(JButton roulette : allRouletteReverse){
                    currentSkillRoulette = roulette;
                    
                    if(excecutorService_SkillRouletteACW.isShutdown() || 
                            excecutorService_RandomRouletteOn.isShutdown() || 
                            Thread.currentThread().isInterrupted()){
//                        try {
//                            Thread.currentThread().join();
//                        } catch (InterruptedException ex) {
//                        }
                        break;
                    } else {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    setOn(roulette.getText(), false);
                    
                }
               
            }
        };
        
    }
    
    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     * Initiates all the Features light images
     * and fires the drawFeatures method
     */
    public final void init(){
            
            roul1Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette1-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette1-A2.png"));
            roul1Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette1-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette1-A1.png"));
            
            roul2OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette2-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette2-A2.png"));
            roul2OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette2-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette2-A1.png"));
            
            roul3Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette3-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette3-A2.png"));
            roul3Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette3-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette3-A1.png"));
            
            roul4OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette4-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette4-A2.png"));
            roul4OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette4-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette4-A1.png"));
            
            roul5Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette5-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette5-A2.png"));
            roul5Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette5-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette5-A1.png"));
            
            roul6OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette6-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette6-A2.png"));
            roul6OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette6-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette6-A1.png"));
            
            roul7Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette7-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette7-A2.png"));
            roul7Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette7-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette7-A1.png"));
            
            roul8Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette8-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette8-A2.png"));
            roul8Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette8-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette8-A1.png"));
            
            roul9OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette9-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette9-A2.png"));
            roul9OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette9-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette9-A1.png"));
            
            roul10Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette10-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette10-A2.png"));
            roul10Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette10-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette10-A1.png"));
            
            roul11OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette11-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette11-A2.png"));
            roul11OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette11-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette11-A1.png"));
            
            roul12Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette12-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette12-A2.png"));
            roul12Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette12-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette12-A1.png"));
            
            roul13OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette13-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette13-A2.png"));
            roul13OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette13-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette13-A1.png"));
            
            roul14Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette14-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette14-A2.png"));
            roul14Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette14-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette14-A1.png"));
            
            roul15Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette15-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette15-A2.png"));
            roul15Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette15-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette15-A1.png"));
            
            roul16OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette16-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette16-A2.png"));
            roul16OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette16-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette16-A1.png"));
            
            roul17Onlight = new Texture("/Roulette/fruit-machine-sprite-roulette17-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette17-A2.png"));
            roul17Offlight = new Texture("/Roulette/fruit-machine-sprite-roulette17-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette17-A1.png"));
            
            roul18OnLight = new Texture("/Roulette/fruit-machine-sprite-roulette18-A2").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette18-A2.png"));
            roul18OffLight = new Texture("/Roulette/fruit-machine-sprite-roulette18-A1").getImage();//ImageIO.read(getClass().getResource("/Roulette/fruit-machine-sprite-roulette18-A1.png"));
            
        drawRoulette();
         
        roulettePanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            roulettePanel.setSize(1280, 720);
            roulettePanel.setOpaque(false);
            roulettePanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
        
    }
    
    
    /**
     * drawRoulette()
     * 
     * Draws all the Roulette images/JButtons
     */
    private void drawRoulette() {
        //0 : +2 Features
        roul1 = new JButton("roul1");
        allRoulette.add(roul1);

        //1 : +3 Nudges
        roul2 = new JButton("roul2");
        allRoulette.add(roul2);

        //2 : +1 Cash
        roul3 = new JButton("roul3");
        allRoulette.add(roul3);

        //3 : +2 Nudges
        roul4 = new JButton("roul4");
        allRoulette.add(roul4);
        
        //4 : +3 Features
        roul5 = new JButton("roul5");
        allRoulette.add(roul5);
        
        //5 : +2 Nudges
        roul6 = new JButton("roul6");
        allRoulette.add(roul6);
        
        //6 : +3 Cash
        roul7 = new JButton("roul7");
        allRoulette.add(roul7);
        
        //7 : +Win Spin
        roul8 = new JButton("roul8");
        allRoulette.add(roul8);

        //8 : Game Over
        roul9 = new JButton("roul9");
        allRoulette.add(roul9);

        //9 : +2 Cash
        roul10 = new JButton("roul10");
        allRoulette.add(roul10);

        //10 : +1 Nudges
        roul11 = new JButton("roul11");
        allRoulette.add(roul11);
        
        //11 : +1 Features
        roul12 = new JButton("roul12");
        allRoulette.add(roul12);
        
        //12 : +2 Nudges
        roul13 = new JButton("roul13");
        allRoulette.add(roul13);
        
        //13 : +1 Features
        roul14 = new JButton("roul14");
        allRoulette.add(roul14);
        
        //14 : +1 Nudges
        roul15 = new JButton("roul15");
        allRoulette.add(roul15);

        //15 : +1 Cash
        roul16 = new JButton("roul16");
        allRoulette.add(roul16);

        //16 : +1 Features
        roul17 = new JButton("roul17");
        allRoulette.add(roul17);

        //17 : +3 Cash
        roul18 = new JButton("roul18");
        allRoulette.add(roul18);
        
        allRouletteReverse.addAll(allRoulette);
        Collections.reverse(allRouletteReverse);
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        if (roul1On){
            g.drawImage(roul1Onlight, roul1LgtX, roul1LgtY, RouletteLightWidth, RouletteLightHeight-4, null);
        } else {
            g.drawImage(roul1Offlight, roul1LgtX, roul1LgtY, RouletteLightWidth, RouletteLightHeight-4, null);
        }

        if (roul2On){
            g.drawImage(roul2OnLight, roul2LgtX, roul2LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul2OffLight, roul2LgtX, roul2LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        }

        if (roul3On){
            g.drawImage(roul3Onlight, roul3LgtX, roul3LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul3Offlight, roul3LgtX, roul3LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        }

        if (roul4On){
            g.drawImage(roul4OnLight, roul4LgtX, roul4LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul4OffLight, roul4LgtX, roul4LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        }

        if (roul5On){
            g.drawImage(roul5Onlight, roul5LgtX, roul5LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul5Offlight, roul5LgtX, roul5LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        }

        if (roul8On){
            g.drawImage(roul8Onlight, roul8LgtX, roul8LgtY, RouletteLightWidth-2, RouletteLightHeight-8, null);
        } else {
            g.drawImage(roul8Offlight, roul8LgtX, roul8LgtY, RouletteLightWidth-2, RouletteLightHeight-8, null);
        }

        if (roul7On){
            g.drawImage(roul7Onlight, roul7LgtX, roul7LgtY, RouletteLightWidth+20, RouletteLightHeight+14, null);
        } else {
            g.drawImage(roul7Offlight, roul7LgtX, roul7LgtY, RouletteLightWidth+20, RouletteLightHeight+14, null);
        }

        if (roul6On){
            g.drawImage(roul6OnLight, roul6LgtX, roul6LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul6OffLight, roul6LgtX, roul6LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        }

        if (roul9On){
            g.drawImage(roul9OnLight, roul9LgtX, roul9LgtY, 44, 34, null);
        } else {
            g.drawImage(roul9OffLight, roul9LgtX, roul9LgtY, 44, 34, null);
        }

        if (roul10On){
            g.drawImage(roul10Onlight, roul10LgtX, roul10LgtY, RouletteLightWidth-2, RouletteLightHeight-6, null);
        } else {
            g.drawImage(roul10Offlight, roul10LgtX, roul10LgtY, RouletteLightWidth-2, RouletteLightHeight-6, null);
        }

        if (roul11On){
            g.drawImage(roul11OnLight, roul11LgtX, roul11LgtY, RouletteLightWidth+22, RouletteLightHeight+14, null);
        } else {
            g.drawImage(roul11OffLight, roul11LgtX, roul11LgtY, RouletteLightWidth+22, RouletteLightHeight+14, null);
        }

        if (roul12On){
            g.drawImage(roul12Onlight, roul12LgtX, roul12LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul12Offlight, roul12LgtX, roul12LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        }

        if (roul13On){
            g.drawImage(roul13OnLight, roul13LgtX, roul13LgtY, RouletteLightWidth+22, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul13OffLight, roul13LgtX, roul13LgtY, RouletteLightWidth+22, RouletteLightHeight+12, null);
        }

        if (roul14On){
            g.drawImage(roul14Onlight, roul14LgtX, roul14LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul14Offlight, roul14LgtX, roul14LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        }

        if (roul15On){
            g.drawImage(roul15Onlight, roul15LgtX, roul15LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul15Offlight, roul15LgtX, roul15LgtY, RouletteLightWidth+24, RouletteLightHeight+12, null);
        }

        if (roul16On){
            g.drawImage(roul16OnLight, roul16LgtX, roul16LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        } else {
            g.drawImage(roul16OffLight, roul16LgtX, roul16LgtY, RouletteLightWidth+20, RouletteLightHeight+12, null);
        }

        if (roul17On){
            g.drawImage(roul17Onlight, roul17LgtX, roul17LgtY, RouletteLightWidth, RouletteLightHeight-4, null);
        } else {
            g.drawImage(roul17Offlight, roul17LgtX, roul17LgtY, RouletteLightWidth, RouletteLightHeight-4, null);
        }

        if (roul18On){
            g.drawImage(roul18OnLight, roul18LgtX, roul18LgtY, 42, 34, null);
        } else {
            g.drawImage(roul18OffLight, roul18LgtX, roul18LgtY, 42, 34, null);
        }

            
        g.dispose();
    }   

    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "roul1":
                roul1On = result;
                break;
            case "roul2":
                roul2On = result;
                break;
            case "roul3":
                roul3On = result;
                break;
            case "roul4":
                roul4On = result;
                break;
            case "roul5":
                roul5On = result;
                break;
            case "roul6":
                roul6On = result;
                break;
            case "roul7":
                roul7On = result;
                break;
            case "roul8":
                roul8On = result;
                break;
            case "roul9":
                roul9On = result;
                break;
            case "roul10":
                roul10On = result;
                break;
            case "roul11":
                roul11On = result;
                break;
            case "roul12":
                roul12On = result;
                break;
            case "roul13":
                roul13On = result;
                break;
            case "roul14":
                roul14On = result;
                break;
            case "roul15":
                roul15On = result;
                break;
            case "roul16":
                roul16On = result;
                break;
            case "roul17":
                roul17On = result;
                break;
            case "roul18":
                roul18On = result;
                break;
        }
        
        
    }

    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Roulette images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "roul1":
                result = roul1On;
                break;
            case "roul2":
                result = roul2On;
                break;
            case "roul3":
                result = roul3On;
                break;
            case "roul4":
                result = roul4On;
                break;
            case "roul5":
                result = roul5On;
                break;
            case "roul6":
                result = roul6On;
                break;
            case "roul7":
                result = roul7On;
                break;
            case "roul8":
                result = roul8On;
                break;
            case "roul9":
                result = roul9On;
                break;
            case "roul10":
                result = roul10On;
                break;
            case "roul11":
                result = roul11On;
                break;
            case "roul12":
                result = roul12On;
                break;
            case "roul13":
                result = roul13On;
                break;
            case "roul14":
                result = roul14On;
                break;
            case "roul15":
                result = roul15On;
                break;
            case "roul16":
                result = roul16On;
                break;
            case "roul17":
                result = roul17On;
                break;
            case "roul18":
                result = roul18On;
                break;
        }
        
        return result;
    }

    
    /**
     * getAllRoulette()
     * 
     * @return allRoulette - returns Roulette images/JButtons
     */
    public List<JButton> getAllRoulette() {
        return allRoulette;
    }
    
    
    /**
     * clearRoulette()
     * 
     * sets allRoulette to off
     */
    public void clearRoulette(){
        for(int i = 0; i < allRoulette.size(); i++){
            setOn(allRoulette.get(i).getText(), false);
        }
    }

    
    /**
     * spinRoulette()
     * 
     */
    public void spinRoulette(){
        spinReelRoulette.run();
    }
    
    
    /**
     * spinRouletteReverse()
     * 
     */
    public void spinRouletteReverse(){
        spinReelRouletteACW.run();
    }
    
    
    /**
     * spinRoulette(int roulette)
     * 
     * @param roulette
     */
    public void spinRoulette(int roulette) {
        for(int c = 0; c < roulette; c++){
            spinRoulette();
        }
    }
    
    
    /**
     * spinRouletteReverse(int roulette)
     * 
     * @param roulette
     */
    public void spinRouletteReverse(int roulette) {
        for(int c = 0; c < roulette; c++){
            spinRouletteReverse();
        }
    }
    

    /**
     * tick()
     * 
     */
    public void tick() {
    }

    
    /**
     * getSymbol(int roulette)
     * 
     * @param roulette
     * @return iconRHL
     */
    public String getSymbol(int roulette) {
        
        String iconRoulette = "";
        
        switch(roulette){
            case 0:
                iconRoulette = "+2 Features";
                break;
            case 1:
                iconRoulette = "+3 Nudges";
                break;
            case 2:
                iconRoulette = "+1 Cash";
                break;
            case 3:
                iconRoulette = "+2 Nudges";
                break;
            case 4:
                iconRoulette = "+1 Features";
                break;
            case 5:
                iconRoulette = "+2 Nudges";
                break;
            case 6:
                iconRoulette = "+3 Cash";
                break;
            case 7:
                iconRoulette = "+1 WinSpin";
                break;
            case 8:
                iconRoulette = "Game Over";
                break;
            case 9:
                iconRoulette = "+2 Cash";
                break;
            case 10:
                iconRoulette = "+1 Nudges";
                break;
            case 11:
                iconRoulette = "+1 Features";
                break;
            case 12:
                iconRoulette = "+2 Nudges";
                break;
            case 13:
                iconRoulette = "+1 Features";
                break;
            case 14:
                iconRoulette = "+1 Nudges";
                break;
            case 15:
                iconRoulette = "+1 Cash";
                break;
            case 16:
                iconRoulette = "+1 Features";
                break;
            case 17:
                iconRoulette = "+3 Cash";
                break;
        }
        
        return iconRoulette;
    }
    
    
    /**
     * getIndex(String letEmSpinIcon)
     * 
     * @param letEmSpinIcon
     * @return index
     */
    public int getIndex(String letEmSpinIcon) {
        int index = 0;
        
        switch(letEmSpinIcon){
            case "+2 Features":
                index = 0;
                break;
            case "+3 Nudges":
                index = 1;
                break;
            case "+1 Cash":
                index = 2;
                break;
            case "+2 Nudges":
                index = 3;
                break;
            case "+1 Features":
                index = 4;
                break;
            case "+3 Cash":
                index = 6;
                break;
            case "+1 WinSpin":
                index = 7;
                break;
            case "Game Over":
                index = 8;
                break;
            case "+2 Cash":
                index = 9;
                break;
            case "+1 Nudges":
                index = 10;
                break;
            
        }
        
        return index;
    }
    
    
    /**
     * getCurrentPOS()
     * 
     * @return current
     */
    public int getCurrentPOS(){
        return currentPOS;
    }
    
    
    /**
     * setCurrentPOS()
     * 
     * @param current
     */
    public void setCurrentPOS(int current){
        currentPOS = current;
    }
    
    
    /**
     * on()
     * 
     */
    void on() {
        for(JButton roulette : allRoulette){
            setOn(roulette.getText(), true);
        }
    }

    
    /**
     * off()
     * 
     */
    void off() {
        for(JButton roulette : allRoulette){
            setOn(roulette.getText(), false);
        }
    }

    
    /**
     * getName()
     * 
     */
    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * skillCW()
     * 
     */
    void skillCW() {
        skillRouletteCWPool.execute(skillRouletteCW);
    }

    
    /**
     * skillACW()
     * 
     */
    void skillACW() {
        skillRouletteACWPool.execute(skillRouletteACW);
    }
    
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Turning Skill Roulette On");
        excecutorService_SkillShotRoulette = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotRoulette.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillCW();
                } else {
                    skillACW();
                }
                excecutorService_SkillShotRoulette.shutdown();
                
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Turning Random Roulette On");
        excecutorService_RandomRouletteOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomRouletteOn.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 450) % 2 == 0){
                    if((System.currentTimeMillis() / 150) % 2 == 0){
                        skillCW();
                    } else {
                        skillACW();
                    }
                } else {
                    if((System.currentTimeMillis() / 500) % 2 == 0){
                        on();
                    } else {
                        off();
                    }
                    
                }
            }
        }, 14, 1, TimeUnit.SECONDS);
    }
    
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Turning Random Roulette Off");
        //System.out.println("Current Skill Roulette: "+currentSkillRoulette.getText());
        excecutorService_RandomRouletteOn.shutdown();
        
        try {
            if (!excecutorService_RandomRouletteOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomRouletteOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomRouletteOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TangoDownLogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        off();
        
    }
    
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        System.out.println("Current Skill cash: "+currentSkillRoulette.getText());
        excecutorService_SkillRouletteCW.shutdown();
        excecutorService_SkillRouletteACW.shutdown();
        
        try {
            if (!excecutorService_SkillRouletteCW.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillRouletteCW.shutdownNow();
            }
            if (!excecutorService_SkillRouletteACW.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillRouletteACW.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillRouletteCW.shutdownNow();
            excecutorService_SkillRouletteACW.shutdownNow();
        }
        
    }

    
    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        off();
        setOn(allRoulette.get(17).getText(), true);
    }
    
}
