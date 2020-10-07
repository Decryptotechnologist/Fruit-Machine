/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.lights;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import tangodown.fruit.machine.controls.Buttons;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.gamelogic.Machine;
import tangodown.fruit.machine.gamelogic.reels.Reelhilo;

/**
 *
 * @author Ghomez
 */
public class Lights {
   
    /**Attributes*/
    
    /**cash List variable of lights object */
    private List<JButton> cash = new ArrayList<>();
    
    /**crackpot List variable of lights object */
    private List<JButton> crackpot = new ArrayList<>();
    
    /**features List variable of lights object */
    private List<JButton> features = new ArrayList<>();
    
    /**roulette List variable of lights object */
    private List<JButton> roulette = new ArrayList<>();
    
    /**nudges List variable of lights object */
    private List<JButton> nudges = new ArrayList<>();
    
    /**skillshot List variable of lights object */
    private List<JButton> skillshot = new ArrayList<>();
    
    /**statics List variable of lights object */
    public List<JButton> statics = new ArrayList<>();
    
    /**tangoDownLogo List variable of lights object */
    private List<JButton> tangoDownLogo = new ArrayList<>();
    
    /**winningSpinsLGT List variable of lights object */
    public List<JButton> winningSpinsLGT = new ArrayList<>();
    
    /**buttonz List variable of lights object */
    private List<JButton> buttonz = new ArrayList<>();
    
    /**reelhiloz List variable of lights object */
    private List<JButton> reelhiloz = new ArrayList<>();
    
    /**hiloz List variable of lights object */
    private List<JButton> hiloz = new ArrayList<>();
    
    //initializers
    /**theCash Cash variable of lights object */
    public Cash theCash;
    
    /**theNudges Nudges variable of lights object */
    public Nudges theNudges;
    
    /**theButtonz Buttons variable of lights object */
    public Buttons theButtonz;
    
    /**theCrackpot Crackpot variable of lights object */
    public Crackpot theCrackpot;
    
    /**theFeatures Features variable of lights object */
    public Features theFeatures;
    
    /**theRoulette Roulette variable of lights object */
    public static Roulette theRoulette;
    
    /**theSkillshot Skillshot variable of lights object */
    public Skillshot theSkillshot;
    
    /**theStatic Static1 variable of lights object */
    public Static1 theStatic;
    
    /**theTangoDown TangoDownLogo variable of lights object */
    public TangoDownLogo theTangoDown;
    
    /**theWinSpins WinningSpins variable of lights object */
    public WinningSpins theWinSpins;
    
    /**thehiloReel Reelhilo variable of lights object */
    public static Reelhilo thehiloReel;
    
    /**thehilo HiLo variable of lights object */
    public HiLo thehilo;
    
    /**lightsPanel JPanel variable of lights object */
    public JPanel lightsPanel;

    /**bgReferenceAX variable of lights object */
    private int bgReferenceAX = -415;
    
    /**bgReferenceAY variable of lights object */
    private int bgReferenceAY = -5;    
    
    /**bgReferenceA BufferedImage variable of lights object */
    public BufferedImage bgReferenceA;

    /**newCashWin variable of lights object */
    public int newCashWin;

    /**newNudgeWin variable of lights object */
    public int newNudgeWin;
    
    
    /**Constructor*/
    
    /**
     * lights Constructor
     * 
     */
    public Lights(){
        
        //initialize all light classes
        thehiloReel = new Reelhilo();
        
        theCrackpot = new Crackpot();
        
        theNudges = new Nudges();
        
        theSkillshot = new Skillshot();
        
        theTangoDown = new TangoDownLogo();
        
        theWinSpins = new WinningSpins();
        
        theStatic = new Static1();
        
        theButtonz = new Buttons();
        
        theCash = new Cash();
        
        theFeatures = new Features();
        
        thehilo = new HiLo();
        
        theRoulette = new Roulette();
        
        lightsPanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            //super.paint(g);
            
            // turn on anti-alias mode
            Graphics2D antiAlias = (Graphics2D)g;
            antiAlias.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 1280, 720);
            
            //Draw bg
            //g.drawImage(bgReference, bgReferenceX, bgReferenceY, 1780, 684, null);
            //g.drawImage(bgReferenceA, bgReferenceAX, bgReferenceAY, 1510, 745, null);
            g.drawImage(bgReferenceA, bgReferenceAX, bgReferenceAY, 1645, 700, null);

            //Draw Bank bg
            GradientPaint gp = new GradientPaint (15, 0, Color.BLACK, 0, getHeight (), Color.DARK_GRAY);
            antiAlias.setPaint (gp);
            g.fillRect(227, 383, 330, 20);
                
            //Draw Reels bg
            gp = new GradientPaint (15, 0, Color.WHITE, 0, getHeight (), Color.DARK_GRAY);
            antiAlias.setPaint (gp);
            g.fillRect(177, 415, 428, 150);
                    
        }};
        
        lightsPanel.setSize(1280, 720);
        lightsPanel.setOpaque(false);
        lightsPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        //initialize Default Lights
        initDefaultLights();
    }
    
    
    /**
     * initDefaultLights()
     * 
     * Initiates all the Default light images
     *
     */
    private void initDefaultLights(){

        bgReferenceA = Machine.getBG(0);
        
        //populate all light lists
        //Features
        features = theFeatures.getAllFeatures();
        
        theFeatures.defaultLights();
        
        //features.get(0).on();//turnFeatOn(features.get(0).getText());
        
        
        //Statics
        statics = theStatic.getAllStatix();
        
        //turnStaticLightOn(statics.get(0).getText());
        theStatic.defaultLights();
        
        //ReelHilo
        reelhiloz = thehiloReel.getAllReelhilo();
        
        turnRhiloOn(reelhiloz.get(21).getText());
        //No.: POS
        //12: 0
        //11: 2
        //10: 4
        //9: 6
        //8: 8
        //7: 9
        //6: 11
        //5: 13
        //4: 15
        //3: 17
        //2: 19
        //1: 21
        
        //Winspins
        winningSpinsLGT = theWinSpins.getAllWinSpins();
        
        theWinSpins.defaultLights();
        
        //Roulette
        roulette = theRoulette.getAllRoulette();
        
        //turnRouletteOn(roulette.get(17).getText());
        theRoulette.defaultLights();
        
        //Cash
        cash = theCash.getAllCash();
        
        theCash.defaultLights();
        
        //Nudges
        nudges = theNudges.getAllNudges();
        
        //turnNudgeLightOn(nudges.get(11).getText());
        //turnNudgeLightOn(nudges.get(12).getText());
        theNudges.defaultLights();
        
        //Buttons
        buttonz = theButtonz.getAllButtons();
        
        
        //TangoDown
        tangoDownLogo = theTangoDown.getAllTangoDown();
        
//        for(JButton tdl: tangoDownLogo){
//            //turn each light on using getText
//            turnTangoDownLightOn(tdl.getText());
//        }
        theTangoDown.defaultLights();

        
        //Skillshot
        skillshot = theSkillshot.getAllSkillshots();

//        for(JButton ss: skillshot){
//            //turn each light on using getText
//            turnSkillshotLightOn(ss.getText());
//        }
        theSkillshot.defaultLights();

        
        //Crackpot
        crackpot = theCrackpot.getAllCrackpots();
        
//        for(JButton cp: crackpot){
//            //turn each light on using getText
//            turnCrackpotLightOn(cp.getText());
//        }
        theCrackpot.defaultLights();

        
        hiloz = thehilo.getAllHiLos();
        
//        turnhiloOn(hiloz.get(0).getText());
//        turnhiloOn(hiloz.get(1).getText());
        thehilo.defaultLights();
        
        //Add All Light to lightsPanel
        lightsPanel.add(theNudges.Nudges, BorderLayout.CENTER);
        lightsPanel.add(theButtonz.Buttonz, BorderLayout.CENTER);
        lightsPanel.add(theTangoDown.Tangoz, BorderLayout.CENTER);
        lightsPanel.add(theSkillshot.skillpanel, BorderLayout.CENTER);
        lightsPanel.add(theCrackpot.crackpotpanel, BorderLayout.CENTER);
        lightsPanel.add(theCash.Cashs, BorderLayout.CENTER);
        lightsPanel.add(thehilo.HiLoPanel, BorderLayout.CENTER);
        lightsPanel.add(theRoulette.roulettePanel, BorderLayout.CENTER);
        lightsPanel.add(theWinSpins.winspinsPanel, BorderLayout.CENTER);
        lightsPanel.add(theFeatures.featuresPanel, BorderLayout.CENTER);
         
        lightsPanel.add(thehiloReel.reelhiloPanel, BorderLayout.CENTER);
        lightsPanel.add(theStatic.staticPanel, BorderLayout.CENTER);

    }
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g) {
        //lightsPanel.repaint();
        //theNudges.render(g);
        //theButtonz.render(g);
        //theTangoDown.render(g);
        //theSkillshot.render(g);
        //theCrackpot.render(g);
        //theCash.render(g);
        //thehilo.render(g);
        //theRoulette.render(g);
        //theWinSpins.render(g);
        //theFeatures.render(g);
        //thehiloReel.render(g);
        //theStatic.render(g);
    }
    
    
    //Cash lights functions
    /**
     * increseCashLights()
     * 
     * @param increase
     */
    public void increaseCashLights(int increase){
    }
    
    
    /**
     * decreseCashLights()
     * 
     * @param decrease
     */
    public void decreaseCashLights(int decrease){
    }
    
    
    /**
     * gambleCashLightsAB()
     * 
     * @param currentWin
     */
    public void gambleCashLightsAB(int currentWin){
        long currentTime = System.currentTimeMillis();
        newCashWin = 0;
        if(currentWin == 1){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(1).getText());
                turnCashLightOff(theCash.allCash.get(21).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 2;
            } else {
                turnCashLightOn(theCash.allCash.get(21).getText());
                turnCashLightOff(theCash.allCash.get(1).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = -1;
            }
        }
        if(currentWin == 2){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(2).getText());
                turnCashLightOff(theCash.allCash.get(0).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 3;
            } else {
                turnCashLightOn(theCash.allCash.get(0).getText());
                turnCashLightOff(theCash.allCash.get(2).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 1;
            }
        }
        if(currentWin == 3){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(3).getText());
                turnCashLightOff(theCash.allCash.get(1).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 4;
            } else {
                turnCashLightOn(theCash.allCash.get(1).getText());
                turnCashLightOff(theCash.allCash.get(3).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 2;
            }
        }
        if(currentWin == 4){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(4).getText());
                turnCashLightOff(theCash.allCash.get(2).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 5;
            } else {
                turnCashLightOn(theCash.allCash.get(2).getText());
                turnCashLightOff(theCash.allCash.get(4).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 3;
            }
        }
        if(currentWin == 5){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(5).getText());
                turnCashLightOff(theCash.allCash.get(3).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 6;
            } else {
                turnCashLightOn(theCash.allCash.get(3).getText());
                turnCashLightOff(theCash.allCash.get(5).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 4;
            }
        }
        if(currentWin == 6){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(6).getText());
                turnCashLightOff(theCash.allCash.get(4).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 7;
            } else {
                turnCashLightOn(theCash.allCash.get(4).getText());
                turnCashLightOff(theCash.allCash.get(6).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 5;
            }
        }
        if(currentWin == 7){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(6).getText());
                turnCashLightOff(theCash.allCash.get(4).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 8;
            } else {
                turnCashLightOn(theCash.allCash.get(4).getText());
                turnCashLightOff(theCash.allCash.get(6).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 6;
            }
        }
        if(currentWin == 8){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(7).getText());
                turnCashLightOff(theCash.allCash.get(5).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 9;
            } else {
                turnCashLightOn(theCash.allCash.get(5).getText());
                turnCashLightOff(theCash.allCash.get(7).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 7;
            }
        }
        if(currentWin == 9){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(8).getText());
                turnCashLightOff(theCash.allCash.get(6).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 10;
            } else {
                turnCashLightOn(theCash.allCash.get(6).getText());
                turnCashLightOff(theCash.allCash.get(8).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 8;
            }
        }
        if(currentWin == 10){
            if((currentTime / 10) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(9).getText());
                turnCashLightOff(theCash.allCash.get(7).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 12;
            } else {
                turnCashLightOn(theCash.allCash.get(7).getText());
                turnCashLightOff(theCash.allCash.get(9).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 9;
            }
        }
        if(currentWin == 12){
            if((currentTime / 20) % 2 == 0){
                turnCashLightOn(theCash.allCash.get(11).getText());
                turnCashLightOff(theCash.allCash.get(9).getText());
                turnWinSpinOn(theWinSpins.winspns.get(4).getText());
                newCashWin = 15;
            } else {
                turnCashLightOn(theCash.allCash.get(9).getText());
                turnCashLightOff(theCash.allCash.get(11).getText());
                turnWinSpinOff(theWinSpins.winspns.get(4).getText());
                newCashWin = 10;
            }
        }
        
    }
    
    
    public void gambleCashNudgeLightsAB(int currentCashWin, int currentNudgeWin) {
        
        long currentTime = System.currentTimeMillis();
        if((currentTime / 150) % 2 == 0){
            gambleCashLightsAB(currentCashWin);
            theNudges.clearNudges();
        } else {
            gambleNudgeLightsAB(currentNudgeWin);
            theCash.clearCash();
        }
    }
    
    
    //Nudges lights functions
    /**
     * increaseNudgesLights()
     * 
     * @param increase
     */
    public void increaseNudgesLights(int increase){
        theNudges.increaseNudges(increase);
    }
    
    
    /**
     * decreaseNudgesLights()
     * 
     * @param decrease
     */
    public void decreaseNudgesLights(int decrease){
        theNudges.decreaseNudges(decrease);
    }
    
    
    /**
     * gambleNudgeLightsAB()
     * 
     * @param currentNudgeWin
     */
    public void gambleNudgeLightsAB(int currentNudgeWin){
        long currentTime = System.currentTimeMillis();
        newNudgeWin = 0;
        
        turnNudgeLightOn(theNudges.allNudges.get(10).getText());
        turnNudgeLightOn(theNudges.allNudges.get(11).getText());
        turnNudgeLightOn(theNudges.allNudges.get(12).getText());
        
        if(currentNudgeWin == 1){
            if((currentTime / 10) % 2 == 0){
                //Turn Lower 1 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(13).getText());
                
                //Turn Higher 1 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(0).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                //Turn Lose light Off 21
                turnCashLightOff(theCash.allCash.get(21).getText());
                
                newNudgeWin = 1;
            } else {
                //Turn Lose light On 21
                turnCashLightOn(theCash.allCash.get(21).getText());
                
                //Turn Lower 1 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(13).getText());
                
                //Turn Higher 1 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(0).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = -1;
            }
        }
        if(currentNudgeWin == 2){
            if((currentTime / 10) % 2 == 0){
                //Turn Lower 2 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(14).getText());
                
                //Turn Higher 2 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(1).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                //Turn Lower 1 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(13).getText());
                
                //Turn Higher 1 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(0).getText());
                
                newNudgeWin = 2;
            } else {
                //Turn Lower 1 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(13).getText());
                
                //Turn Higher 1 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(0).getText());
                
                //Turn Lower 2 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(14).getText());
                
                //Turn Higher 2 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(1).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 1;
            }
        }
        if(currentNudgeWin == 3){
            if((currentTime / 10) % 2 == 0){
                //Turn Lower 3 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(15).getText());
                
                //Turn Higher 3 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(3).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                //Turn Lower 2 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(14).getText());
                
                //Turn Higher 2 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(2).getText());
                
                newNudgeWin = 3;
            } else {
                //Turn Lower 2 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(14).getText());
                
                //Turn Higher 2 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(2).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                //Turn Lower 3 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(15).getText());
                
                //Turn Higher 3 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(3).getText());
                
                newNudgeWin = 2;
            }
        }
        if(currentNudgeWin == 4){
            if((currentTime / 10) % 2 == 0){
                //Turn Lower 4 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(16).getText());
                
                //Turn Higher 4 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(4).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                //Turn Higher 3 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(3).getText());
                
                //Turn Lower 3 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(15).getText());
                
                newNudgeWin = 4;
            } else {
                //Turn Lower 3 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(15).getText());
                
                //Turn Higher 3 Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(3).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                //Turn Higher 4 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(4).getText());
                
                //Turn Lower 4 Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(16).getText());
                
                newNudgeWin = 3;
            }
        }
        if(currentNudgeWin == 5){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(5).getText());
                turnNudgeLightOff(theNudges.allNudges.get(4).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 5;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(4).getText());
                turnNudgeLightOff(theNudges.allNudges.get(5).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 4;
            }
        }
        if(currentNudgeWin == 6){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(6).getText());
                turnNudgeLightOff(theNudges.allNudges.get(5).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 6;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(5).getText());
                turnNudgeLightOff(theNudges.allNudges.get(6).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 5;
            }
        }
        if(currentNudgeWin == 7){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(7).getText());
                turnNudgeLightOff(theNudges.allNudges.get(6).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 7;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(6).getText());
                turnNudgeLightOff(theNudges.allNudges.get(7).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 6;
            }
        }
        if(currentNudgeWin == 8){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(8).getText());
                turnNudgeLightOff(theNudges.allNudges.get(7).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 8;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(7).getText());
                turnNudgeLightOff(theNudges.allNudges.get(8).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 7;
            }
        }
        if(currentNudgeWin == 9){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(9).getText());
                turnNudgeLightOff(theNudges.allNudges.get(8).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 9;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(8).getText());
                turnNudgeLightOff(theNudges.allNudges.get(9).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 8;
            }
        }
        if(currentNudgeWin == 10){
            if((currentTime / 10) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                turnNudgeLightOff(theNudges.allNudges.get(9).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 10;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(9).getText());
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 9;
            }
        }
        
        
        if(currentNudgeWin == 12){
            if((currentTime / 20) % 2 == 0){
                turnNudgeLightOn(theNudges.allNudges.get(11).getText());
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                //Turn Take Nudge light On
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 11;
            } else {
                turnNudgeLightOn(theNudges.allNudges.get(10).getText());
                turnNudgeLightOff(theNudges.allNudges.get(11).getText());
                
                //Turn Take Nudge light Off
                turnNudgeLightOff(theNudges.allNudges.get(10).getText());
                
                newNudgeWin = 10;
            }
        }
        
    }
    
    
    /**
     * skillshotNudgesLightsUP()
     * 
     * @param speed
     */
    private void skillshotNudgesLightsUP(int speed){
    }
    
    
    /**
     * skillshotNudgesLightsDown()
     * 
     * @param speed
     */
    private void skillshotNudgesLightsDown(int speed){
    }
    
    
    //skillshot lights functions
    /**
     * skillshotLightsUP()
     * 
     * @param speed
     */
    private void skillshotLightsUP(int speed){
    }
    
    
    /**
     * skillshotLightsDown()
     * 
     * @param speed
     */
    private void skillshotLightsDown(int speed){
    }
    
    
    //tangoDownLogo lights functions
    /**
     * tangoDownLightsUP()
     * 
     * @param speed
     */
    private void tangoDownLightsUP(int speed){
    }
    
    
    /**
     * tangoDownLightsDown()
     * 
     * @param speed
     */
    private void tangoDownLightsDown(int speed){
    }
    
    
    
    //all lights functions
    /**
     * skillshotALLLightsUP()
     * 
     * @param speed
     */
    private void skillshotALLLightsUP(int speed){
    }
    
    
    /**
     * skillshotALLLightsDown()
     * 
     * @param speed
     */
    private void skillshotALLLightsDown(int speed){
    }
    
    
    /**
     * randomALLLightsUP()
     * 
     * @param seed
     */
    private void randomALLLightsUP(int seed){
    }
    
    
    /**
     * randomALLLightsDown()
     * 
     * @param seed
     */
    private void randomALLLightsDown(int seed){
    }
    
    
    //abstract functions
    /**
     * turnTangoDownLightOn()
     * 
     * @param name
     */
    private void turnTangoDownLightOn(String name){
        theTangoDown.setOn(name, true);
    }
    
    
    /**
     * turnTangoDownLightOff()
     * 
     * @param name
     */
    private void turnTangoDownLightOff(String name){
        theTangoDown.setOn(name, false);
    }
    
    
    /**
     * turnSkillshotLightOn()
     * 
     * @param name
     */
    private void turnSkillshotLightOn(String name){
        theSkillshot.setOn(name, true);
    }
    
    
    /**
     * turnSkillshotLightOff()
     * 
     * @param name
     */
    private void turnSkillshotLightOff(String name){
        theSkillshot.setOn(name, false);
    }
    
    
    /**
     * turnCrackpotLightOn()
     * 
     * @param name
     */
    private void turnCrackpotLightOn(String name){
        theCrackpot.setOn(name, true);
    }
    
    
    /**
     * turnCrackpotLightOff()
     * 
     * @param name
     */
    private void turnCrackpotLightOff(String name){
        theCrackpot.setOn(name, false);
    }
    
    
    /**
     * turnStaticLightOn()
     * 
     * @param name
     */
    private void turnStaticLightOn(String name){
        theStatic.setOn(name, true);
    }
    
    
    /**
     * turnWinSpinOff()
     * 
     * @param name
     */
    private void turnWinSpinOff(String name){
        theWinSpins.setOn(name, false);
    }
    
    
    /**
     * turnWinSpinOn()
     * 
     * @param name
     */
    private void turnWinSpinOn(String name){
        theWinSpins.setOn(name, true);
    }
    
    
    /**
     * turnCashLightOn()
     * 
     * @param name
     */
    public void turnCashLightOn(String name){
        theCash.setOn(name, true);
    }
    
    
    /**
     * turnCashLightOff()
     * 
     * @param name
     */
    public void turnCashLightOff(String name){
        theCash.setOn(name, false);
    }
    
    
    /**
     * turnNudgeLightOn()
     * 
     * @param name
     */
    public void turnNudgeLightOn(String name){
        theNudges.setOn(name, true);
    }
    
    
    /**
     * turnNudgeLightOff()
     * 
     * @param name
     */
    public void turnNudgeLightOff(String name){
        theNudges.setOn(name, false);
    }
    
    
    /**
     * turnRhiloOn()
     * 
     * @param name
     */
    private void turnRhiloOn(String name) {
        thehiloReel.setOn(name, true);
    }
    
    
    /**
     * turnRhiloOff()
     * 
     * @param name
     */
    private void turnRhiloOff(String name) {
        thehiloReel.setOn(name, false);
    }

    
    /**
     * getAllReelhilo()
     * 
     * @return thehiloReel - returns Reelhilo images/JButtons
     */
    public List<JButton> getAllReelhilo() {
        return thehiloReel.getAllReelhilo();
    } 
    
    
    /**
     * getReelhiloOn()
     * 
     * @param name
     * 
     * @return result - returns result of reelhiloz images/JButtons on
     */
//    private boolean getReelhiloOn(String name) {
//        
//        boolean result = false;
//        for(JButton rHL : reelhiloz){
//            if(name.equals(rHL.getText())){
//                result = thehiloReel.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * turnFeatOn()
     * 
     * @param name
     */
    private void turnFeatOn(String name) {
        theFeatures.setOn(name, true);
    }
    
    
    /**
     * turnFeatOff()
     * 
     * @param name
     */
    private void turnFeatOff(String name) {
        theFeatures.setOn(name, false);
    }

    
    /**
     * getAllFeatures()
     * 
     * @return theFeatures - returns Features images/JButtons
     */
    public List<JButton> getAllFeatures() {
        return theFeatures.getAllFeatures();
    } 
    
    
    /**
     * getFeaturesOn()
     * 
     * @param name
     * 
     * @return result - returns result of features images/JButtons on
     */
//    private boolean getFeaturesOn(String name) {
//        
//        boolean result = false;
//        for(JButton fet : features){
//            if(name.equals(fet.getText())){
//                result = theFeatures.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * turnRouletteOn()
     * 
     * @param name
     */
    private void turnRouletteOn(String name) {
        theRoulette.setOn(name, true);
    }
    
    
    /**
     * turnRouletteOff()
     * 
     * @param name
     */
    private void turnRouletteOff(String name) {
        theRoulette.setOn(name, false);
    }

    
    /**
     * getAllRoulette()
     * 
     * @return theRoulette - returns Roulette images/JButtons
     */
    public List<JButton> getAllRoulette() {
        return theRoulette.getAllRoulette();
    } 
    
    
    /**
     * getRouletteOn()
     * 
     * @param name
     * 
     * @return result - returns result of roulette images/JButtons on
     */
//    private boolean getRouletteOn(String name) {
//        
//        boolean result = false;
//        for(JButton roul : roulette){
//            if(name.equals(roul.getText())){
//                result = theRoulette.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * getStaticLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of statics images/JButtons on
     */
//    private boolean getStaticLightOn(String name){
//        
//        boolean result = false;
//        for(JButton st : statics){
//            if(name.equals(st.getText())){
//                result = theStatic.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * getWinningSpinOn()
     * 
     * @param name
     * 
     * @return result - returns result of winningSpinsLGT images/JButtons on
     */
//    private boolean getWinningSpinOn(String name){
//        
//        boolean result = false;
//        for(JButton ws : winningSpinsLGT){
//            if(name.equals(ws.getText())){
//                result = theWinSpins.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * getCrackpotLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of crackpot images/JButtons on
     */
//    private boolean getCrackpotLightOn(String name){
//        
//        boolean result = false;
//        for(JButton cp : crackpot){
//            if(name.equals(cp.getText())){
//                result = theCrackpot.getOn(name);
//            }   
//        }
//        
//        return result;
//    }
    
    
    /**
     * getSkillshotLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of skillshot images/JButtons on
     */
//    private boolean getSkillshotLightOn(String name){
//        
//        boolean result = false;
//        for(JButton sk : skillshot){
//            if(name.equals(sk.getText())){
//                result = theSkillshot.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * getTangoDownLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of tangoDownLogo images/JButtons on
     */
//    private boolean getTangoDownLightOn(String name){
//        
//        boolean result = false;
//        for(JButton td : tangoDownLogo){
//            if(name.equals(td.getText())){
//                result = theTangoDown.getOn(name);
//            }   
//        }
//        return result;
//    }
    
    
    /**
     * getCashLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of cash images/JButtons on
     */
//    private boolean getCashLightOn(String name){
//        
//        boolean result = false;
//        for(JButton c : cash){
//         if(name.equals(c.getText())){
//             result = theCash.getOn(name);
//         }   
//        }
//        return result;
//    }
    
    
    /**
     * getNudgeLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of nudges images/JButtons on
     */
//    private boolean getNudgeLightOn(String name){
//        
//        boolean result = false;
//        for(JButton n : nudges){
//         if(name.equals(n.getText())){
//             result = theNudges.getOn(name);
//         }   
//        }
//        return result;
//    }

    
    /**
     * getBTNLightOn()
     * 
     * @param name
     * 
     * @return result - returns result of buttonz images/JButtons on
     */
//    private boolean getBTNLightOn(String name) {
//        
//        boolean result = false;
//        for(JButton b : buttonz){
//         if(name.equals(b.getText())){
//             result = theButtonz.getOn(name);
//         }   
//        }
//        return result;
//    }
    
    
    /**
     * turnhiloOn()
     * 
     * @param name
     */
    private void turnhiloOn(String name) {
        thehilo.setOn(name, true);
    }
    
    
    /**
     * turnhiloOff()
     * 
     * @param name
     */
    private void turnhiloOff(String name) {
        thehilo.setOn(name, false);
    }

    
    /**
     * getAllhilo()
     * 
     * @return thehilo - returns HiLo images/JButtons
     */
    public List<JButton> getAllhilo() {
        return thehilo.getAllHiLos();
    } 
    
    
    /**
     * gethiloOn()
     * 
     * @param name
     * 
     * @return result - returns result of hiloz images/JButtons on
     */
//    private boolean gethiloOn(String name) {
//        
//        boolean result = false;
//        for(JButton HL : hiloz){
//            if(name.equals(HL.getText())){
//                result = thehilo.getOn(name);
//            }   
//        }
//        return result;
//    }

    
    /**
     * tick()
     * 
     */
//    public void tick() {
//    }

    public void clearCash() {
        theCash.clearCash();
    }

    
    
    public void clearFeatures() {
        theFeatures.clearFeatures();
    }

    public void clearCrackpot() {
        theCrackpot.clearCrackpot();
    }
    
    public void clearWinningSpins() {
        theWinSpins.clearWinSpins();
    }

    public void clearTangoDown() {
        theTangoDown.clearTangoDown();
    }
    
    public void clearHiLo() {
        thehilo.clearHiLo();
    }

    public void clearSkillshot() {
        theSkillshot.clearSkillshot();
    }
    
    public void clearRoulette() {
        theRoulette.clearRoulette();
    }

    public void calculateWinSpins(boolean r1, boolean r2, boolean r3) {
        theWinSpins.calculateWinSpins(r1, r2, r3);
    }

    public void increaseWinSpins() {
        theWinSpins.increaseWinSpins();
    }

    public void decreaseWinSpins() {
        theWinSpins.decreaseWinSpins();
    }

    public void setNudges(int nudges) {
        theNudges.setNudges(nudges);
    }
    
    public void clearNudges() {
        theNudges.clearNudges();
    }

    public Roulette getRoulette() {
        return theRoulette;
    }
    
    
    void on() {
        System.out.println("Turning light On: "+this.getName());
    }

    void off() {
        System.out.println("Turning light Off: "+this.getName());
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
