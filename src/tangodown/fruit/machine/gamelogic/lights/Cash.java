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
 *
 * @author Ghomez
 */
public class Cash {//extends Lights {
    
    /**Attributes*/
    
    /**Cash lower light width variable of Cash object */
    public int cashLowerLightWidth = 72;
    
    /**Cash lower light height variable of Cash object */
    public int cashLowerLightHeight = 66;
    
    /**Cash light width variable of Cash object */
    public int cashLightWidth = 68;
    
    /**Cash light height variable of Cash object */
    public int cashLightHeight = 50;
    
    /**Cash light width variable of Cash object */
    public int cashSymbolWidth = 92;
    
    /**Cash light height variable of Cash object */
    public int cashSymbolHeight = 96;
    
    
    /**cash1Pound button/light variables of Cash object */ 
    public JButton cash1Pound;
    private final int cash1PoundLgtX = 664, cash1PoundLgtY = 289;
    private BufferedImage cash1PoundOnlight, cash1PoundOfflight;
    private static boolean cash1PoundOn;
    
    /**cash2Pound button/light variables of Cash object */ 
    public JButton cash2Pound;
    private final int cash2PoundLgtX = 666, cash2PoundLgtY = 267;
    private BufferedImage cash2PoundOnLight, cash2PoundOffLight;
    private static boolean cash2PoundOn;
    
    /**cash3Pound button/light variables of Cash object */ 
    public JButton cash3Pound;
    private final int cash3PoundLgtX = 664, cash3PoundLgtY = 245;
    private BufferedImage cash3PoundOnlight, cash3PoundOfflight;
    private static boolean cash3PoundOn;
    
    /**cash4Pound button/light variables of Cash object */ 
    public JButton cash4Pound;
    private final int cash4PoundLgtX = 668, cash4PoundLgtY = 223;
    private BufferedImage cash4PoundOnLight, cash4PoundOffLight;
    private static boolean cash4PoundOn;
    
    /**cash5Pound button/light variables of Cash object */ 
    public JButton cash5Pound;
    private final int cash5PoundLgtX = 664, cash5PoundLgtY = 200;
    private BufferedImage cash5PoundOnlight, cash5PoundOfflight;
    private static boolean cash5PoundOn;
    
    /**cash6Pound button/light variables of Cash object */ 
    public JButton cash6Pound;
    private final int cash6PoundLgtX = 670, cash6PoundLgtY = 176;
    private BufferedImage cash6PoundOnLight, cash6PoundOffLight;
    private static boolean cash6PoundOn;
    
    /**cash7Pound button/light variables of Cash object */ 
    public JButton cash7Pound;
    private final int cash7PoundLgtX = 668, cash7PoundLgtY = 153;
    private BufferedImage cash7PoundOnlight, cash7PoundOfflight;
    private static boolean cash7PoundOn;
    
    /**cash8Pound button/light variables of Cash object */ 
    public JButton cash8Pound;
    private final int cash8PoundLgtX = 674, cash8PoundLgtY = 129;
    private BufferedImage cash8PoundOnLight, cash8PoundOffLight;
    private static boolean cash8PoundOn;
    
    /**cash9Pound button/light variables of Cash object */ 
    public JButton cash9Pound;
    private final int cash9PoundLgtX = 668, cash9PoundLgtY = 106;
    private BufferedImage cash9PoundOnlight, cash9PoundOfflight;
    private static boolean cash9PoundOn;
    
    /**cash10Pound button/light variables of Cash object */ 
    public JButton cash10Pound;
    private final int cash10PoundLgtX = 674, cash10PoundLgtY = 82;
    private BufferedImage cash10PoundOnLight, cash10PoundOffLight;
    private static boolean cash10PoundOn;
    
    /**cash12Pound button/light variables of Cash object */ 
    public JButton cash12Pound;
    private final int cash12PoundLgtX = 674, cash12PoundLgtY = 59;
    private BufferedImage cash12PoundOnLight, cash12PoundOffLight;
    private static boolean cash12PoundOn;
    
    /**cash15Pound button/light variables of Cash object */ 
    public JButton cash15Pound;
    private final int cash15PoundLgtX = 642, cash15PoundLgtY = 37;
    private BufferedImage cash15PoundOnLight, cash15PoundOffLight;
    private static boolean cash15PoundOn;
    
    
    /**LOWER CASH LIGHTS*/
    
    /**cash1LPound button/light variables of Cash object */ 
    public JButton cash1LPound;
    private final int cash1LPoundLgtX = 52, cash1LPoundLgtY = 548;
    private BufferedImage cash1LPoundOnlight, cash1LPoundOfflight;
    private static boolean cash1LPoundOn;
    
    /**cash2LPound button/light variables of Cash object */ 
    public JButton cash2LPound;
    private final int cash2LPoundLgtX = 146, cash2LPoundLgtY = 548;
    private BufferedImage cash2LPoundOnLight, cash2LPoundOffLight;
    private static boolean cash2LPoundOn;
    
    /**cash3LPound button/light variables of Cash object */ 
    public JButton cash3LPound;
    private final int cash3LPoundLgtX = 223, cash3LPoundLgtY = 548;
    private BufferedImage cash3LPoundOnlight, cash3LPoundOfflight;
    private static boolean cash3LPoundOn;
    
    /**cash4LPound button/light variables of Cash object */ 
    public JButton cash4LPound;
    private final int cash4LPoundLgtX = 319, cash4LPoundLgtY = 548;
    private BufferedImage cash4LPoundOnLight, cash4LPoundOffLight;
    private static boolean cash4LPoundOn;
    
    /**cash5LPound button/light variables of Cash object */ 
    public JButton cash5LPound;
    private final int cash5LPoundLgtX = 448, cash5LPoundLgtY = 548;
    private BufferedImage cash5LPoundOnlight, cash5LPoundOfflight;
    private static boolean cash5LPoundOn;
    
    /**cash7LPound button/light variables of Cash object */ 
    public JButton cash7LPound;
    private final int cash7LPoundLgtX = 548, cash7LPoundLgtY = 548;
    private BufferedImage cash7LPoundOnlight, cash7LPoundOfflight;
    private static boolean cash7LPoundOn;
    
    /**cash10LPound button/light variables of Cash object */ 
    public JButton cash10LPound;
    private final int cash10LPoundLgtX = 623, cash10LPoundLgtY = 548;
    private BufferedImage cash10LPoundOnLight, cash10LPoundOffLight;
    private static boolean cash10LPoundOn;
    
    /**cash12LPound button/light variables of Cash object */ 
    public JButton cash12LPound;
    private final int cash12LPoundLgtX = 698, cash12LPoundLgtY = 548;
    private BufferedImage cash12LPoundOnLight, cash12LPoundOffLight;
    private static boolean cash12LPoundOn;
    
    /**cash15LPound button/light variables of Cash object */ 
    public JButton cash15LPound;
    private final int cash15LPoundLgtX = 596, cash15LPoundLgtY = 388;
    private BufferedImage cash15LPoundOnLight, cash15LPoundOffLight;
    private static boolean cash15LPoundOn;
    
        
    /**loseCash button/light variables of Nudges object */ 
    public JButton loseCash;
    private final int loseCashLgtX = 664, loseCashLgtY = 313;
    private BufferedImage loseCashOnlight, loseCashOfflight;
    private static boolean loseCashOn;
    
    /**turboGambleCash button/light variables of Nudges object */ 
    public JButton turboGambleCash;
    private final int turboGambleCashLgtX = 644, turboGambleCashLgtY = -48;
    private BufferedImage turboGambleCashOnlight, turboGambleCashOfflight;
    private static boolean turboGambleCashOn;
    
    
    /**CASH SYMBOLS LIGHTS*/
    
    //red cherries
    /**cashSymCherries button/light variables of Cash object */ 
    public JButton cashSymCherries;
    private final int cashSymCherriesX = 10, cashSymCherriesY = 554;
    private BufferedImage cashSymCherriesOnlight, cashSymCherriesOfflight;
    private static boolean cashSymCherriesOn;
    
    /**cashSymCherries1 button/light variables of Cash object */ 
    public JButton cashSymCherries1;
    private final int cashSymCherries1X = 42, cashSymCherries1Y = 554;
    private BufferedImage cashSymCherries1Onlight, cashSymCherries1Offlight;
    private static boolean cashSymCherries1On;
    
    /**cashSymCherries2 button/light variables of Cash object */ 
    public JButton cashSymCherries2;
    private final int cashSymCherries2X = 75, cashSymCherries2Y = 554;
    private BufferedImage cashSymCherries2Onlight, cashSymCherries2Offlight;
    private static boolean cashSymCherries2On;
    
    //Mix 7s
    /**cashSymMix7Blue button/light variables of Cash object */ 
    public JButton cashSymMix7Blue;
    private final int cashSymMix7BlueX = 135, cashSymMix7BlueY = 576;
    private BufferedImage cashSymMix7BlueOnlight, cashSymMix7BlueOfflight;
    private static boolean cashSymMix7BlueOn;
    
    /**cashSymMix7Red button/light variables of Cash object */ 
    public JButton cashSymMix7Red;
    private final int cashSymMix7RedX = 157, cashSymMix7RedY = 576;
    private BufferedImage cashSymMix7RedOnlight, cashSymMix7RedOfflight;
    private static boolean cashSymMix7RedOn;
    
    /**cashSymMix7Gold button/light variables of Cash object */ 
    public JButton cashSymMix7Gold;
    private final int cashSymMix7GoldX = 179, cashSymMix7GoldY = 576;
    private BufferedImage cashSymMix7GoldOnlight, cashSymMix7GoldOfflight;
    private static boolean cashSymMix7GoldOn;
    
    //green bars
    /**cashSymGreenBar button/light variables of Cash object */ 
    public JButton cashSymGreenBar;
    private final int cashSymGreenBarX = 208, cashSymGreenBarY = 590;
    private BufferedImage cashSymGreenBarOnlight, cashSymGreenBarOfflight;
    private static boolean cashSymGreenBarOn;
    
    /**cashSymGreenBar1 button/light variables of Cash object */ 
    public JButton cashSymGreenBar1;
    private final int cashSymGreenBar1X = 233, cashSymGreenBar1Y = 590;
    private BufferedImage cashSymGreenBar1Onlight, cashSymGreenBar1Offlight;
    private static boolean cashSymGreenBar1On;
    
    /**cashSymGreenBar2 button/light variables of Cash object */ 
    public JButton cashSymGreenBar2;
    private final int cashSymGreenBar2X = 258, cashSymGreenBar2Y = 590;
    private BufferedImage cashSymGreenBar2Onlight, cashSymGreenBar2Offlight;
    private static boolean cashSymGreenBar2On;
    
    
    //purple bars
    /**cashSymPurpleBar button/light variables of Cash object */ 
    public JButton cashSymPurpleBar;
    private final int cashSymPurpleBarX = 276, cashSymPurpleBarY = 575;
    private BufferedImage cashSymPurpleBarOnLight, cashSymPurpleBarOffLight;
    private static boolean cashSymPurpleBarOn;
    
    /**cashSymPurpleBar1 button/light variables of Cash object */ 
    public JButton cashSymPurpleBar1;
    private final int cashSymPurpleBar1X = 316, cashSymPurpleBar1Y = 575;
    private BufferedImage cashSymPurpleBar1OnLight, cashSymPurpleBar1OffLight;
    private static boolean cashSymPurpleBar1On;
    
    /**cashSymPurpleBar2 button/light variables of Cash object */ 
    public JButton cashSymPurpleBar2;
    private final int cashSymPurpleBar2X = 356, cashSymPurpleBar2Y = 575;
    private BufferedImage cashSymPurpleBar2OnLight, cashSymPurpleBar2OffLight;
    private static boolean cashSymPurpleBar2On;
    
    //gold bars
    /**cashSymGoldBar button/light variables of Cash object */ 
    public JButton cashSymGoldBar;
    private final int cashSymGoldBarX = 400, cashSymGoldBarY = 569;
    private BufferedImage cashSymGoldBarOnLight, cashSymGoldBarOffLight;
    private static boolean cashSymGoldBarOn;
    
    /**cashSymGoldBar1 button/light variables of Cash object */ 
    public JButton cashSymGoldBar1;
    private final int cashSymGoldBar1X = 440, cashSymGoldBar1Y = 569;
    private BufferedImage cashSymGoldBar1OnLight, cashSymGoldBar1OffLight;
    private static boolean cashSymGoldBar1On;
    
    /**cashSymGoldBar2 button/light variables of Cash object */ 
    public JButton cashSymGoldBar2;
    private final int cashSymGoldBar2X = 480, cashSymGoldBar2Y = 569;
    private BufferedImage cashSymGoldBar2OnLight, cashSymGoldBar2OffLight;
    private static boolean cashSymGoldBar2On;
    
    //blue sevens
    /**cashSymBlueSeven button/light variables of Cash object */ 
    public JButton cashSymBlueSeven;
    private final int cashSymBlueSevenX = 537, cashSymBlueSevenY = 576;
    private BufferedImage cashSymBlueSevenOnlight, cashSymBlueSevenOfflight;
    private static boolean cashSymBlueSevenOn;
    
    /**cashSymBlueSeven1 button/light variables of Cash object */ 
    public JButton cashSymBlueSeven1;
    private final int cashSymBlueSeven1X = 559, cashSymBlueSeven1Y = 576;
    private BufferedImage cashSymBlueSeven1Onlight, cashSymBlueSeven1Offlight;
    private static boolean cashSymBlueSeven1On;
    
    /**cashSymBlueSeven2 button/light variables of Cash object */ 
    public JButton cashSymBlueSeven2;
    private final int cashSymBlueSeven2X = 581, cashSymBlueSeven2Y = 576;
    private BufferedImage cashSymBlueSeven2Onlight, cashSymBlueSeven2Offlight;
    private static boolean cashSymBlueSeven2On;
    
    //red sevens
    /**cashSymRedSeven button/light variables of Cash object */ 
    public JButton cashSymRedSeven;
    private final int cashSymRedSevenX = 612, cashSymRedSevenY = 576;
    private BufferedImage cashSymRedSevenOnLight, cashSymRedSevenOffLight;
    private static boolean cashSymRedSevenOn;
    
    /**cashSymRedSeven1 button/light variables of Cash object */ 
    public JButton cashSymRedSeven1;
    private final int cashSymRedSeven1X = 634, cashSymRedSeven1Y = 576;
    private BufferedImage cashSymRedSeven1OnLight, cashSymRedSeven1OffLight;
    private static boolean cashSymRedSeven1On;
    
    /**cashSymRedSeven2 button/light variables of Cash object */ 
    public JButton cashSymRedSeven2;
    private final int cashSymRedSeven2X = 656, cashSymRedSeven2Y = 576;
    private BufferedImage cashSymRedSeven2OnLight, cashSymRedSeven2OffLight;
    private static boolean cashSymRedSeven2On;
    
    
    //gold sevens
    /**cashSymGoldSeven button/light variables of Cash object */ 
    public JButton cashSymGoldSeven;
    private final int cashSymGoldSevenX = 687, cashSymGoldSevenY = 576;
    private BufferedImage cashSymGoldSevenOnLight, cashSymGoldSevenOffLight;
    private static boolean cashSymGoldSevenOn;
    
    /**cashSymGoldSeven1 button/light variables of Cash object */ 
    public JButton cashSymGoldSeven1;
    private final int cashSymGoldSeven1X = 709, cashSymGoldSeven1Y = 576;
    private BufferedImage cashSymGoldSeven1OnLight, cashSymGoldSeven1OffLight;
    private static boolean cashSymGoldSeven1On;
    
    /**cashSymGoldSeven2 button/light variables of Cash object */ 
    public JButton cashSymGoldSeven2;
    private final int cashSymGoldSeven2X = 731, cashSymGoldSeven2Y = 576;
    private BufferedImage cashSymGoldSeven2OnLight, cashSymGoldSeven2OffLight;
    private static boolean cashSymGoldSeven2On;
    
    //gold bells
    /**cashSymGoldBell button/light variables of Cash object */ 
    public JButton cashSymGoldBell;
    private final int cashSymGoldBellX = 605, cashSymGoldBellY = 470;
    private BufferedImage cashSymGoldBellOnLight, cashSymGoldBellOffLight;
    private static boolean cashSymGoldBellOn;
    
    /**cashSymGoldBell1 button/light variables of Cash object */ 
    public JButton cashSymGoldBell1;
    private final int cashSymGoldBell1X = 650, cashSymGoldBell1Y = 470;
    private BufferedImage cashSymGoldBell1OnLight, cashSymGoldBell1OffLight;
    private static boolean cashSymGoldBell1On;
    
    /**cashSymGoldBell2 button/light variables of Cash object */ 
    public JButton cashSymGoldBell2;
    private final int cashSymGoldBell2X = 695, cashSymGoldBell2Y = 470;
    private BufferedImage cashSymGoldBell2OnLight, cashSymGoldBell2OffLight;
    private static boolean cashSymGoldBell2On;
    
    /**allCash List variable of Cash object */
    public List<JButton> allCash;
    
    /**allCash List variable of Cash object */
    public List<JButton> upperCash;
    
    /**allCash List variable of Cash object */
    public List<JButton> lowerCash;
    
    private List<JButton> lowerCashReverse;
    
    /**Cashs JPanel variable of Cash object */
    public JPanel Cashs;
    
    private List<JButton> upperCashReverse;
    private List<JButton> lowerCashSYM;
    private List<JButton> lowerCashSYMReverse;
    
    private ScheduledExecutorService excecutorService_SkillCashUP = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillCashDown = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillShotCash = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomCashOn = Executors.newScheduledThreadPool(1);
    private ScheduledExecutorService excecutorService_SkillLowerCashUp = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillLowerCashDown = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillLowerCashSYMUp = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillLowerCashSYMDown = Executors.newSingleThreadScheduledExecutor();
    
    private JButton currentSkillCash;
    private Runnable skillCashUp;
    private ExecutorService skillCashUpPool = Executors.newFixedThreadPool(1);
    private Runnable skillCashDown;
    private ExecutorService skillCashDownPool = Executors.newFixedThreadPool(1);
    
    private Runnable skillLowerCashUp;
    private ExecutorService skillLowerCashUpPool;
    private Runnable skillLowerCashSYMUp;
    private ExecutorService skillLowerCashSYMUpPool;
    private Runnable skillLowerCashDown;
    private ExecutorService skillLowerCashDownPool;
    private Runnable skillLowerCashSYMDown;
    private ExecutorService skillLowerCashSYMDownPool;
    
    /**Constructor*/
    
    /**
     * Cash Constructor
     * 
     */
    public Cash(){
        allCash = new ArrayList<>();
        upperCash = new ArrayList<>();
        lowerCash = new ArrayList<>();
        lowerCashSYM = new ArrayList<>();
        init();
        
        skillCashUp = new Runnable(){
            @Override
            public void run(){
                for(JButton cash : upperCash){
                    if(excecutorService_SkillCashUP.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                        setOn(cash.getText(), true);
                        currentSkillCash = cash;
                    }
                }
          
            }
        };
        
        skillCashDown = new Runnable(){
            @Override
            public void run(){
                for(JButton cash : upperCashReverse){
                    currentSkillCash = cash;
                    
                    if(excecutorService_SkillCashDown.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                    setOn(cash.getText(), false);
                }

            }
        };
        
        skillLowerCashUp = new Runnable(){
            @Override
            public void run(){
                for(JButton cash : lowerCash){
                    if(excecutorService_SkillLowerCashUp.isShutdown() || 
                            excecutorService_SkillLowerCashSYMUp.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                        setOn(cash.getText(), true);
                    }

                }

            }
        };
        
        skillLowerCashSYMUp = new Runnable(){
            @Override
            public void run(){
                for(JButton cash : lowerCashSYM){
                    if(excecutorService_SkillLowerCashSYMUp.isShutdown() || 
                            excecutorService_SkillLowerCashUp.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                        setOn(cash.getText(), true);
                    }

                }

            }
        };
        
        skillLowerCashDown = new Runnable(){
                        
            @Override
            public void run(){
                for(JButton cash : lowerCashReverse){

                    if(excecutorService_SkillLowerCashDown.isShutdown() || 
                            excecutorService_SkillLowerCashSYMDown.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                    setOn(cash.getText(), false);

                }

            }
        };
        
        skillLowerCashSYMDown = new Runnable(){
                        
            @Override
            public void run(){
                for(JButton cash : lowerCashSYMReverse){

                    if(excecutorService_SkillLowerCashSYMDown.isShutdown() || 
                            excecutorService_SkillLowerCashDown.isShutdown() || 
                            excecutorService_RandomCashOn.isShutdown() || 
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
                    setOn(cash.getText(), false);

                }

            }
        };
        
        
    }
    
    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     * Initiates all the Cash light images
     * and fires the drawCash method
     */
    private void init(){
            
            cash1PoundOnlight = new Texture("/Cash/fruit-machine-sprite-1PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-1PoundA2.png"));
            cash1PoundOfflight = new Texture("/Cash/fruit-machine-sprite-1PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-1PoundA1.png"));
            
            cash2PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash2PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash2PoundA2.png"));
            cash2PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash2PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash2PoundA1.png"));
            
            cash3PoundOnlight = new Texture("/Cash/fruit-machine-sprite-cash3PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash3PoundA2.png"));
            cash3PoundOfflight = new Texture("/Cash/fruit-machine-sprite-cash3PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash3PoundA1.png"));
            
            cash4PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash4PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash4PoundA2.png"));
            cash4PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash4PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash4PoundA1.png"));
            
            cash5PoundOnlight = new Texture("/Cash/fruit-machine-sprite-cash5PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash5PoundA2.png"));
            cash5PoundOfflight = new Texture("/Cash/fruit-machine-sprite-cash5PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash5PoundA1.png"));
            
            cash6PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash6PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash6PoundA2.png"));
            cash6PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash6PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash6PoundA1.png"));
            
            cash7PoundOnlight = new Texture("/Cash/fruit-machine-sprite-cash7PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash7PoundA2.png"));
            cash7PoundOfflight = new Texture("/Cash/fruit-machine-sprite-cash7PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash7PoundA1.png"));
            
            cash8PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash8PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash8PoundA2.png"));
            cash8PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash8PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash8PoundA1.png"));
            
            cash9PoundOnlight = new Texture("/Cash/fruit-machine-sprite-cash9PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash9PoundA2.png"));
            cash9PoundOfflight = new Texture("/Cash/fruit-machine-sprite-cash9PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash9PoundA1.png"));
            
            cash10PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash10PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash10PoundA2.png"));
            cash10PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash10PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash10PoundA1.png"));

            cash12PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash12PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash12PoundA2.png"));
            cash12PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash12PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash12PoundA1.png"));
            
            cash15PoundOnLight = new Texture("/Cash/fruit-machine-sprite-cash15PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash15PoundA2.png"));
            cash15PoundOffLight = new Texture("/Cash/fruit-machine-sprite-cash15PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cash15PoundA1.png"));
            
            
            loseCashOnlight = new Texture("/Cash/fruit-machine-sprite-loseLgtA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-loseLgtA2.png"));
            loseCashOfflight = new Texture("/Cash/fruit-machine-sprite-loseLgtA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-loseLgtA1.png"));
            
            turboGambleCashOnlight = new Texture("/Cash/fruit-machine-sprite-turboGambleLgtA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-turboGambleLgtA2.png"));
            turboGambleCashOfflight = new Texture("/Cash/fruit-machine-sprite-turboGambleLgtA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-turboGambleLgtA1.png"));
            
            
            
            /**LOWER CASH LIGHT IMAGES*/
            
            cash1LPoundOnlight = new Texture("/Cash/fruit-machine-sprite-1LPoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-1LPoundA2.png"));
            cash1LPoundOfflight = new Texture("/Cash/fruit-machine-sprite-1LPoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-1LPoundA1.png"));
            
            cash2LPoundOnLight = new Texture("/Cash/fruit-machine-sprite-cashL2PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL2PoundA2.png"));
            cash2LPoundOffLight = new Texture("/Cash/fruit-machine-sprite-cashL2PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL2PoundA1.png"));
            
            cash3LPoundOnlight = new Texture("/Cash/fruit-machine-sprite-cashL3PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL3PoundA2.png"));
            cash3LPoundOfflight = new Texture("/Cash/fruit-machine-sprite-cashL3PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL3PoundA1.png"));
            
            cash4LPoundOnLight = new Texture("/Cash/fruit-machine-sprite-cashL4PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL4PoundA2.png"));
            cash4LPoundOffLight = new Texture("/Cash/fruit-machine-sprite-cashL4PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL4PoundA1.png"));
            
            cash5LPoundOnlight = new Texture("/Cash/fruit-machine-sprite-cashL5PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL5PoundA2.png"));
            cash5LPoundOfflight = new Texture("/Cash/fruit-machine-sprite-cashL5PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL5PoundA1.png"));
            
            cash7LPoundOnlight = new Texture("/Cash/fruit-machine-sprite-cashL7PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL7PoundA2.png"));
            cash7LPoundOfflight = new Texture("/Cash/fruit-machine-sprite-cashL7PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL7PoundA1.png"));
            
            cash10LPoundOnLight = new Texture("/Cash/fruit-machine-sprite-cashL10PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL10PoundA2.png"));
            cash10LPoundOffLight = new Texture("/Cash/fruit-machine-sprite-cashL10PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL10PoundA1.png"));

            cash12LPoundOnLight = new Texture("/Cash/fruit-machine-sprite-cashL12PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL12PoundA2.png"));
            cash12LPoundOffLight = new Texture("/Cash/fruit-machine-sprite-cashL12PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL12PoundA1.png"));
            
            cash15LPoundOnLight = new Texture("/Cash/fruit-machine-sprite-cashL15PoundA2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL15PoundA2.png"));
            cash15LPoundOffLight = new Texture("/Cash/fruit-machine-sprite-cashL15PoundA1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-cashL15PoundA1.png"));
            
            
            
            /**Cash Symbols*/
            
            //Cherries
            cashSymCherriesOnlight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            cashSymCherriesOfflight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            
            cashSymCherries1Onlight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            cashSymCherries1Offlight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            
            cashSymCherries2Onlight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            cashSymCherries2Offlight = new Texture("/FruitSymbols/fruit-machine-RED_CHERRIES").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_CHERRIES.png"));
            
            
            //Gold Bells
            cashSymGoldBellOnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            cashSymGoldBellOffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            
            cashSymGoldBell1OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            cashSymGoldBell1OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            
            cashSymGoldBell2OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            cashSymGoldBell2OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BELLA").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BELLA.png"));
            
            
            //7's
            //Mixed7s
            cashSymMix7BlueOnlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            cashSymMix7BlueOfflight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            
            cashSymMix7RedOnlight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            cashSymMix7RedOfflight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            
            cashSymMix7GoldOnlight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            cashSymMix7GoldOfflight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            
            //Gold 7s
            cashSymGoldSevenOnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            cashSymGoldSevenOffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            
            cashSymGoldSeven1OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            cashSymGoldSeven1OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            
            cashSymGoldSeven2OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            cashSymGoldSeven2OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_SEVEN.png"));
            
            
            //Blue 7s
            cashSymBlueSevenOnlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            cashSymBlueSevenOfflight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            
            cashSymBlueSeven1Onlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            cashSymBlueSeven1Offlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            
            cashSymBlueSeven2Onlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            cashSymBlueSeven2Offlight = new Texture("/FruitSymbols/fruit-machine-BLUE_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-BLUE_SEVEN.png"));
            
            
            //Red 7s
            cashSymRedSevenOnLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            cashSymRedSevenOffLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            
            cashSymRedSeven1OnLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            cashSymRedSeven1OffLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            
            cashSymRedSeven2OnLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            cashSymRedSeven2OffLight = new Texture("/FruitSymbols/fruit-machine-RED_SEVEN").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-RED_SEVEN.png"));
            
            
            //Bars
            //Green Bars
            cashSymGreenBarOnlight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            cashSymGreenBarOfflight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            
            cashSymGreenBar1Onlight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            cashSymGreenBar1Offlight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            
            cashSymGreenBar2Onlight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            cashSymGreenBar2Offlight = new Texture("/FruitSymbols/fruit-machine-GREEN_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GREEN_BAR.png"));
            
            
            //Purple Bars
            cashSymPurpleBarOnLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            cashSymPurpleBarOffLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            
            cashSymPurpleBar1OnLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            cashSymPurpleBar1OffLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            
            cashSymPurpleBar2OnLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            cashSymPurpleBar2OffLight = new Texture("/FruitSymbols/fruit-machine-PURPLE_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-PURPLE_BAR.png"));
            
            
            //Gold Bars
            cashSymGoldBarOnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
            cashSymGoldBarOffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
            
            cashSymGoldBar1OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
            cashSymGoldBar1OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
            
            cashSymGoldBar2OnLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
            cashSymGoldBar2OffLight = new Texture("/FruitSymbols/fruit-machine-GOLD_BAR").getImage();//ImageIO.read(getClass().getResource("/FruitSymbols/fruit-machine-GOLD_BAR.png"));
        
        drawCash();
         
        Cashs = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
        
            Cashs.setSize(1280, 720);
            Cashs.setOpaque(false);
            Cashs.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
            }
        };
        
        
    }
    
    
    /**
     * drawCash()
     * 
     * Draws all the Cash images/JButtons
     */
    private void drawCash() {
        
        //0
        cash1Pound = new JButton("cash1Pound");
        allCash.add(cash1Pound);

        //1
        cash2Pound = new JButton("cash2Pound");
        allCash.add(cash2Pound);

        //2
        cash3Pound = new JButton("cash3Pound");
        allCash.add(cash3Pound);

        //3
        cash4Pound = new JButton("cash4Pound");
        allCash.add(cash4Pound);
        
        //4
        cash5Pound = new JButton("cash5Pound");
        allCash.add(cash5Pound);
        
        //5
        cash6Pound = new JButton("cash6Pound");
        allCash.add(cash6Pound);
        
        //6
        cash7Pound = new JButton("cash7Pound");
        allCash.add(cash7Pound);
        
        //7
        cash8Pound = new JButton("cash8Pound");
        allCash.add(cash8Pound);

        //8
        cash9Pound = new JButton("cash9Pound");
        allCash.add(cash9Pound);

        //9
        cash10Pound = new JButton("cash10Pound");
        allCash.add(cash10Pound);

        //10
        cash12Pound = new JButton("cash12Pound");
        allCash.add(cash12Pound);

        //11
        cash15Pound = new JButton("cash15Pound");
        allCash.add(cash15Pound);
     
        
        
        /**LOWER CASH LIGHTS*/
        //12
        cash1LPound = new JButton("cash1LPound");
        allCash.add(cash1LPound);

        //13
        cash2LPound = new JButton("cash2LPound");
        allCash.add(cash2LPound);

        //14
        cash3LPound = new JButton("cash3LPound");
        allCash.add(cash3LPound);

        //15
        cash4LPound = new JButton("cash4LPound");
        allCash.add(cash4LPound);
        
        //16
        cash5LPound = new JButton("cash5LPound");
        allCash.add(cash5LPound);
        
        //17
        cash7LPound = new JButton("cash7LPound");
        allCash.add(cash7LPound);

        //18
        cash10LPound = new JButton("cash10LPound");
        allCash.add(cash10LPound);

        //19
        cash12LPound = new JButton("cash12LPound");
        allCash.add(cash12LPound);

        //20
        cash15LPound = new JButton("cash15LPound");
        allCash.add(cash15LPound);
        
        lowerCash.add(cash1LPound);
        lowerCash.add(cash2LPound);
        lowerCash.add(cash3LPound);
        lowerCash.add(cash4LPound);
        lowerCash.add(cash5LPound);
        lowerCash.add(cash7LPound);
        lowerCash.add(cash10LPound);
        lowerCash.add(cash12LPound);
        lowerCash.add(cash15LPound);
        
        lowerCashReverse = new ArrayList<>(lowerCash);
        Collections.reverse(lowerCashReverse);
        
        //21: LoseCash
        loseCash = new JButton("loseCash");
        allCash.add(loseCash);
        
        //22: TurboGambleCash
        turboGambleCash = new JButton("turboGambleCash");
        allCash.add(turboGambleCash);
        
        
        upperCash.add(loseCash);
        upperCash.add(cash1Pound);
        upperCash.add(cash2Pound);
        upperCash.add(cash3Pound);
        upperCash.add(cash4Pound);
        upperCash.add(cash5Pound);
        upperCash.add(cash6Pound);
        upperCash.add(cash7Pound);
        upperCash.add(cash8Pound);
        upperCash.add(cash9Pound);
        upperCash.add(cash10Pound);
        upperCash.add(cash12Pound);
        upperCash.add(cash15Pound);
        
        upperCashReverse = new ArrayList<>(upperCash);
        Collections.reverse(upperCashReverse);
        
        
        /**Cash Symbols*/
        //23: red cherries
        cashSymCherries = new JButton("cashSymCherries");
        allCash.add(cashSymCherries);
        
        //24
        cashSymCherries1 = new JButton("cashSymCherries");
        allCash.add(cashSymCherries1);
        
        //25
        cashSymCherries2 = new JButton("cashSymCherries2");
        allCash.add(cashSymCherries2);
        
        
        //26: Gold bells
        cashSymGoldBell = new JButton("cashSymGoldBell");
        allCash.add(cashSymGoldBell);
        
        //27
        cashSymGoldBell1 = new JButton("cashSymGoldBell1");
        allCash.add(cashSymGoldBell1);
        
        //28
        cashSymGoldBell2 = new JButton("cashSymGoldBell2");
        allCash.add(cashSymGoldBell2);
        
        
        //29: Mixed 7s
        cashSymMix7Gold = new JButton("cashSymMix7Gold");
        allCash.add(cashSymMix7Gold);
        
        //30
        cashSymMix7Blue = new JButton("cashSymMix7Blue");
        allCash.add(cashSymMix7Blue);
        
        //31
        cashSymMix7Red = new JButton("cashSymMix7Red");
        allCash.add(cashSymMix7Red);
        
        
        //32: Gold 7s
        cashSymGoldSeven = new JButton("cashSymGoldSeven");
        allCash.add(cashSymGoldSeven);
        
        //33
        cashSymGoldSeven1 = new JButton("cashSymGoldSeven1");
        allCash.add(cashSymGoldSeven1);
        
        //34
        cashSymGoldSeven2 = new JButton("cashSymGoldSeven2");
        allCash.add(cashSymGoldSeven2);
        
        
        //35: Blue 7s
        cashSymBlueSeven = new JButton("cashSymBlueSeven");
        allCash.add(cashSymBlueSeven);
        
        //36
        cashSymBlueSeven1 = new JButton("cashSymBlueSeven1");
        allCash.add(cashSymBlueSeven1);
        
        //37
        cashSymBlueSeven2 = new JButton("cashSymBlueSeven2");
        allCash.add(cashSymBlueSeven2);        
        
        
        //38: Red 7s
        cashSymRedSeven = new JButton("cashSymRedSeven");
        allCash.add(cashSymRedSeven);
        
        //39
        cashSymRedSeven1 = new JButton("cashSymRedSeven1");
        allCash.add(cashSymRedSeven1);
        
        //40
        cashSymRedSeven2 = new JButton("cashSymRedSeven2");
        allCash.add(cashSymRedSeven2);        
        
        
        //41: Green bars
        cashSymGreenBar = new JButton("cashSymGreenBar");
        allCash.add(cashSymGreenBar);
        
        //42
        cashSymGreenBar1 = new JButton("cashSymGreenBar1");
        allCash.add(cashSymGreenBar1);
        
        //43
        cashSymGreenBar2 = new JButton("cashSymGreenBar2");
        allCash.add(cashSymGreenBar2);        
        
        
        //44: Purple bars
        cashSymPurpleBar = new JButton("cashSymPurpleBar");
        allCash.add(cashSymPurpleBar);
        
        //45
        cashSymPurpleBar1 = new JButton("cashSymPurpleBar1");
        allCash.add(cashSymPurpleBar1);
        
        //46
        cashSymPurpleBar2 = new JButton("cashSymPurpleBar2");
        allCash.add(cashSymPurpleBar2);
        
        
        //47: Gold bars
        cashSymGoldBar = new JButton("cashSymGoldBar");
        allCash.add(cashSymGoldBar);
        
        //48
        cashSymGoldBar1 = new JButton("cashSymGoldBar1");
        allCash.add(cashSymGoldBar1);
        
        //49
        cashSymGoldBar2 = new JButton("cashSymGoldBar2");
        allCash.add(cashSymGoldBar2);

        
        lowerCashSYM.add(cashSymCherries);
        lowerCashSYM.add(cashSymCherries1);
        lowerCashSYM.add(cashSymCherries2);
        lowerCashSYM.add(cashSymGoldBell);
        lowerCashSYM.add(cashSymGoldBell1);
        lowerCashSYM.add(cashSymGoldBell2);
        lowerCashSYM.add(cashSymMix7Gold);
        lowerCashSYM.add(cashSymMix7Blue);
        lowerCashSYM.add(cashSymMix7Red);
        lowerCashSYM.add(cashSymGoldSeven);
        lowerCashSYM.add(cashSymGoldSeven1);
        lowerCashSYM.add(cashSymGoldSeven2);
        lowerCashSYM.add(cashSymBlueSeven);
        lowerCashSYM.add(cashSymBlueSeven1);
        lowerCashSYM.add(cashSymBlueSeven2);
        lowerCashSYM.add(cashSymRedSeven);
        lowerCashSYM.add(cashSymRedSeven1);
        lowerCashSYM.add(cashSymRedSeven2);
        lowerCashSYM.add(cashSymGreenBar);
        lowerCashSYM.add(cashSymGreenBar1);
        lowerCashSYM.add(cashSymGreenBar2);
        lowerCashSYM.add(cashSymPurpleBar);
        lowerCashSYM.add(cashSymPurpleBar1);
        lowerCashSYM.add(cashSymPurpleBar2);
        lowerCashSYM.add(cashSymGoldBar);
        lowerCashSYM.add(cashSymGoldBar1);
        lowerCashSYM.add(cashSymGoldBar2);
        
        lowerCashSYMReverse = new ArrayList<>(lowerCashSYM);
        Collections.reverse(lowerCashSYMReverse);
    }
    
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        if (cash1PoundOn){
            g.drawImage(cash1PoundOnlight, cash1PoundLgtX, cash1PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash1PoundOfflight, cash1PoundLgtX, cash1PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash2PoundOn){
            g.drawImage(cash2PoundOnLight, cash2PoundLgtX, cash2PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash2PoundOffLight, cash2PoundLgtX, cash2PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash3PoundOn){
            g.drawImage(cash3PoundOnlight, cash3PoundLgtX, cash3PoundLgtY, cashLightWidth+6, cashLightHeight, null);
        } else {
            g.drawImage(cash3PoundOfflight, cash3PoundLgtX, cash3PoundLgtY, cashLightWidth+6, cashLightHeight, null);
        }

        if (cash4PoundOn){
            g.drawImage(cash4PoundOnLight, cash4PoundLgtX, cash4PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash4PoundOffLight, cash4PoundLgtX, cash4PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash5PoundOn){
            g.drawImage(cash5PoundOnlight, cash5PoundLgtX, cash5PoundLgtY, cashLightWidth+10, cashLightHeight, null);
        } else {
            g.drawImage(cash5PoundOfflight, cash5PoundLgtX, cash5PoundLgtY, cashLightWidth+10, cashLightHeight, null);
        }

        if (cash6PoundOn){
            g.drawImage(cash6PoundOnLight, cash6PoundLgtX, cash6PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash6PoundOffLight, cash6PoundLgtX, cash6PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash7PoundOn){
            g.drawImage(cash7PoundOnlight, cash7PoundLgtX, cash7PoundLgtY, cashLightWidth+10, cashLightHeight, null);
        } else {
            g.drawImage(cash7PoundOfflight, cash7PoundLgtX, cash7PoundLgtY, cashLightWidth+10, cashLightHeight, null);
        }

        if (cash8PoundOn){
            g.drawImage(cash8PoundOnLight, cash8PoundLgtX, cash8PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash8PoundOffLight, cash8PoundLgtX, cash8PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash9PoundOn){
            g.drawImage(cash9PoundOnlight, cash9PoundLgtX, cash9PoundLgtY, cashLightWidth+16, cashLightHeight, null);
        } else {
            g.drawImage(cash9PoundOfflight, cash9PoundLgtX, cash9PoundLgtY, cashLightWidth+16, cashLightHeight, null);
        }

        if (cash10PoundOn){
            g.drawImage(cash10PoundOnLight, cash10PoundLgtX, cash10PoundLgtY, cashLightWidth, cashLightHeight, null);
        } else {
            g.drawImage(cash10PoundOffLight, cash10PoundLgtX, cash10PoundLgtY, cashLightWidth, cashLightHeight, null);
        }

        if (cash12PoundOn){
            g.drawImage(cash12PoundOnLight, cash12PoundLgtX, cash12PoundLgtY, cashLightWidth+6, cashLightHeight, null);
        } else {
            g.drawImage(cash12PoundOffLight, cash12PoundLgtX, cash12PoundLgtY, cashLightWidth+6, cashLightHeight, null);
        }

        if (cash15PoundOn){
            g.drawImage(cash15PoundOnLight, cash15PoundLgtX, cash15PoundLgtY, cashLightWidth*2, cashLightHeight, null);
        } else {
            g.drawImage(cash15PoundOffLight, cash15PoundLgtX, cash15PoundLgtY, cashLightWidth*2, cashLightHeight, null);
        }


        if (loseCashOn){
            g.drawImage(loseCashOnlight, loseCashLgtX, loseCashLgtY, cashLightWidth, cashLightHeight+2, null);
        } else {
            g.drawImage(loseCashOfflight, loseCashLgtX, loseCashLgtY, cashLightWidth, cashLightHeight+2, null);
        }

        if (turboGambleCashOn){
            g.drawImage(turboGambleCashOnlight, turboGambleCashLgtX, turboGambleCashLgtY, cashLightWidth*2+4, cashLightHeight*3+5, null);
        } else {
            g.drawImage(turboGambleCashOfflight, turboGambleCashLgtX, turboGambleCashLgtY, cashLightWidth*2+6, cashLightHeight*3+4, null);
        }

        /**CASH SYMBOLS LIGHTS*/

        //Cherries
        if (cashSymCherriesOn){
            g.drawImage(cashSymCherriesOnlight, cashSymCherriesX, cashSymCherriesY, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymCherriesOfflight, cashSymCherriesX, cashSymCherriesY, cashSymbolWidth, cashSymbolHeight, null);
        }

        if (cashSymCherriesOn){
            g.drawImage(cashSymCherries1Onlight, cashSymCherries1X, cashSymCherries1Y, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymCherries1Offlight, cashSymCherries1X, cashSymCherries1Y, cashSymbolWidth, cashSymbolHeight, null);
        }

        if (cashSymCherries2On){
            g.drawImage(cashSymCherries2Onlight, cashSymCherries2X, cashSymCherries2Y, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymCherries2Offlight, cashSymCherries2X, cashSymCherries2Y, cashSymbolWidth, cashSymbolHeight, null);
        }

        //Gold bells
        if (cashSymGoldBellOn){
            g.drawImage(cashSymGoldBellOnLight, cashSymGoldBellX, cashSymGoldBellY, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymGoldBellOffLight, cashSymGoldBellX, cashSymGoldBellY, cashSymbolWidth, cashSymbolHeight, null);
        }

        if (cashSymGoldBellOn){
            g.drawImage(cashSymGoldBell1OnLight, cashSymGoldBell1X, cashSymGoldBell1Y, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymGoldBell1OffLight, cashSymGoldBell1X, cashSymGoldBell1Y, cashSymbolWidth, cashSymbolHeight, null);
        }

        if (cashSymGoldBellOn){
            g.drawImage(cashSymGoldBell2OnLight, cashSymGoldBell2X, cashSymGoldBell2Y, cashSymbolWidth, cashSymbolHeight, null);
        } else {
            g.drawImage(cashSymGoldBell2OffLight, cashSymGoldBell2X, cashSymGoldBell2Y, cashSymbolWidth, cashSymbolHeight, null);
        }

        //7's
        //Mix 7s
        if (cashSymMix7BlueOn){
            g.drawImage(cashSymMix7BlueOnlight, cashSymMix7BlueX, cashSymMix7BlueY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymMix7BlueOfflight, cashSymMix7BlueX, cashSymMix7BlueY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymMix7RedOn){
            g.drawImage(cashSymMix7RedOnlight, cashSymMix7RedX, cashSymMix7RedY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymMix7RedOfflight, cashSymMix7RedX, cashSymMix7RedY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymMix7GoldOn){
            g.drawImage(cashSymMix7GoldOnlight, cashSymMix7GoldX, cashSymMix7GoldY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymMix7GoldOfflight, cashSymMix7GoldX, cashSymMix7GoldY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        //Gold 7s
        if (cashSymGoldSevenOn){
            g.drawImage(cashSymGoldSevenOnLight, cashSymGoldSevenX, cashSymGoldSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymGoldSevenOffLight, cashSymGoldSevenX, cashSymGoldSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymGoldSeven1On){
            g.drawImage(cashSymGoldSeven1OnLight, cashSymGoldSeven1X, cashSymGoldSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymGoldSeven1OffLight, cashSymGoldSeven1X, cashSymGoldSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymGoldSeven2On){
            g.drawImage(cashSymGoldSeven2OnLight, cashSymGoldSeven2X, cashSymGoldSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymGoldSeven2OffLight, cashSymGoldSeven2X, cashSymGoldSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }


        //Blue 7s
        if (cashSymBlueSevenOn){
            g.drawImage(cashSymBlueSevenOnlight, cashSymBlueSevenX, cashSymBlueSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymBlueSevenOfflight, cashSymBlueSevenX, cashSymBlueSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymBlueSeven1On){
            g.drawImage(cashSymBlueSeven1Onlight, cashSymBlueSeven1X, cashSymBlueSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymBlueSeven1Offlight, cashSymBlueSeven1X, cashSymBlueSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymBlueSeven2On){
            g.drawImage(cashSymBlueSeven2Onlight, cashSymBlueSeven2X, cashSymBlueSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymBlueSeven2Offlight, cashSymBlueSeven2X, cashSymBlueSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }


        //Red 7s
        if (cashSymRedSevenOn){
            g.drawImage(cashSymRedSevenOnLight, cashSymRedSevenX, cashSymRedSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymRedSevenOffLight, cashSymRedSevenX, cashSymRedSevenY, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymRedSeven1On){
            g.drawImage(cashSymRedSeven1OnLight, cashSymRedSeven1X, cashSymRedSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymRedSeven1OffLight, cashSymRedSeven1X, cashSymRedSeven1Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        if (cashSymRedSeven2On){
            g.drawImage(cashSymRedSeven2OnLight, cashSymRedSeven2X, cashSymRedSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        } else {
            g.drawImage(cashSymRedSeven2OffLight, cashSymRedSeven2X, cashSymRedSeven2Y, cashSymbolWidth/2, (cashSymbolHeight/2)+10, null);
        }

        //Bars
        //Green Bars
        if (cashSymGreenBarOn){
            g.drawImage(cashSymGreenBarOnlight, cashSymGreenBarX, cashSymGreenBarY, cashSymbolWidth/2, cashSymbolHeight/3, null);
        } else {
            g.drawImage(cashSymGreenBarOfflight, cashSymGreenBarX, cashSymGreenBarY, cashSymbolWidth/2, cashSymbolHeight/3, null);
        }

        if (cashSymGreenBar1On){
            g.drawImage(cashSymGreenBar1Onlight, cashSymGreenBar1X, cashSymGreenBar1Y, cashSymbolWidth/2, cashSymbolHeight/3, null);
        } else {
            g.drawImage(cashSymGreenBar1Offlight, cashSymGreenBar1X, cashSymGreenBar1Y, cashSymbolWidth/2, cashSymbolHeight/3, null);
        }

        if (cashSymGreenBar2On){
            g.drawImage(cashSymGreenBar2Onlight, cashSymGreenBar2X, cashSymGreenBar2Y, cashSymbolWidth/2, cashSymbolHeight/3, null);
        } else {
            g.drawImage(cashSymGreenBar2Offlight, cashSymGreenBar2X, cashSymGreenBar2Y, cashSymbolWidth/2, cashSymbolHeight/3, null);
        }

        //Purple Bars
        if (cashSymPurpleBarOn){
            g.drawImage(cashSymPurpleBarOnLight, cashSymPurpleBarX, cashSymPurpleBarY, cashSymbolWidth-6, (cashSymbolHeight/2) + 15, null);
        } else {
            g.drawImage(cashSymPurpleBarOffLight, cashSymPurpleBarX, cashSymPurpleBarY, cashSymbolWidth-6, (cashSymbolHeight/2) + 15, null);
        }

        if (cashSymPurpleBar1On){
            g.drawImage(cashSymPurpleBar1OnLight, cashSymPurpleBar1X, cashSymPurpleBar1Y, cashSymbolWidth-6, (cashSymbolHeight/2)+15, null);
        } else {
            g.drawImage(cashSymPurpleBar1OffLight, cashSymPurpleBar1X, cashSymPurpleBar1Y, cashSymbolWidth-6, (cashSymbolHeight/2)+15, null);
        }

        if (cashSymPurpleBar2On){
            g.drawImage(cashSymPurpleBar2OnLight, cashSymPurpleBar2X, cashSymPurpleBar2Y, cashSymbolWidth-6, (cashSymbolHeight/2)+15, null);
        } else {
            g.drawImage(cashSymPurpleBar2OffLight, cashSymPurpleBar2X, cashSymPurpleBar2Y, cashSymbolWidth-6, (cashSymbolHeight/2)+15, null);
        }

        //Gold Bars
        if (cashSymGoldBarOn){
            g.drawImage(cashSymGoldBarOnLight, cashSymGoldBarX, cashSymGoldBarY, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        } else {
            g.drawImage(cashSymGoldBarOffLight, cashSymGoldBarX, cashSymGoldBarY, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        }

        if (cashSymGoldBar1On){
            g.drawImage(cashSymGoldBar1OnLight, cashSymGoldBar1X, cashSymGoldBar1Y, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        } else {
            g.drawImage(cashSymGoldBar1OffLight, cashSymGoldBar1X, cashSymGoldBar1Y, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        }

        if (cashSymGoldBar2On){
            g.drawImage(cashSymGoldBar2OnLight, cashSymGoldBar2X, cashSymGoldBar2Y, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        } else {
            g.drawImage(cashSymGoldBar2OffLight, cashSymGoldBar2X, cashSymGoldBar2Y, cashSymbolWidth-6, (cashSymbolHeight/2) + 25, null);
        }


        /**LOWER CASH LIGHTS*/

        if (cash1LPoundOn){
            g.drawImage(cash1LPoundOnlight, cash1LPoundLgtX, cash1LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash1LPoundOfflight, cash1LPoundLgtX, cash1LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash2LPoundOn){
            g.drawImage(cash2LPoundOnLight, cash2LPoundLgtX, cash2LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash2LPoundOffLight, cash2LPoundLgtX, cash2LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash3LPoundOn){
            g.drawImage(cash3LPoundOnlight, cash3LPoundLgtX, cash3LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash3LPoundOfflight, cash3LPoundLgtX, cash3LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash4LPoundOn){
            g.drawImage(cash4LPoundOnLight, cash4LPoundLgtX, cash4LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash4LPoundOffLight, cash4LPoundLgtX, cash4LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash5LPoundOn){
            g.drawImage(cash5LPoundOnlight, cash5LPoundLgtX, cash5LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash5LPoundOfflight, cash5LPoundLgtX, cash5LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash7LPoundOn){
            g.drawImage(cash7LPoundOnlight, cash7LPoundLgtX, cash7LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash7LPoundOfflight, cash7LPoundLgtX, cash7LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash10LPoundOn){
            g.drawImage(cash10LPoundOnLight, cash10LPoundLgtX, cash10LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash10LPoundOffLight, cash10LPoundLgtX, cash10LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash12LPoundOn){
            g.drawImage(cash12LPoundOnLight, cash12LPoundLgtX, cash12LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        } else {
            g.drawImage(cash12LPoundOffLight, cash12LPoundLgtX, cash12LPoundLgtY, cashLowerLightWidth, cashLowerLightHeight, null);
        }

        if (cash15LPoundOn){
            g.drawImage(cash15LPoundOnLight, cash15LPoundLgtX, cash15LPoundLgtY, 64*3, 44*3, null);
        } else {
            g.drawImage(cash15LPoundOffLight, cash15LPoundLgtX, cash15LPoundLgtY, 64*3, 44*3, null);
        }
            
        g.dispose();
    }
      
    
    /**
     * getAllCash()
     * 
     * @return allCash - returns allCash images/JButtons
     */
    public List<JButton> getAllCash() {
        return allCash;
    }
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Cash images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "cash1Pound":
                result = cash1PoundOn;
                break;
            case "cash2Pound":
                result = cash2PoundOn;
                break;
            case "cash3Pound":
                result = cash3PoundOn;
                break;
            case "cash4Pound":
                result = cash4PoundOn;
                break;
            case "cash5Pound":
                result = cash5PoundOn;
                break;
            case "cash6Pound":
                result = cash6PoundOn;
                break;
            case "cash7Pound":
                result = cash7PoundOn;
                break;
            case "cash8Pound":
                result = cash8PoundOn;
                break;
            case "cash9Pound":
                result = cash9PoundOn;
                break;
            case "cash10Pound":
                result = cash10PoundOn;
                break;
            case "cash12Pound":
                result = cash12PoundOn;
                break;
            case "cash15Pound":
                result = cash15PoundOn;
                break;
            case "cash1LPound":
                result = cash1LPoundOn;
                break;
            case "cash2LPound":
                result = cash2LPoundOn;
                break;
            case "cash3LPound":
                result = cash3LPoundOn;
                break;
            case "cash4LPound":
                result = cash4LPoundOn;
                break;
            case "cash5LPound":
                result = cash5LPoundOn;
                break;
            case "cash7LPound":
                result = cash7LPoundOn;
                break;
            case "cash10LPound":
                result = cash10LPoundOn;
                break;
            case "cash12LPound":
                result = cash12LPoundOn;
                break;
            case "cash15LPound":
                result = cash15LPoundOn;
                break;
            case "turboGambleCash":
                result = turboGambleCashOn;
                break;
            case "loseCash":
                result = loseCashOn;
                break;
            case "cashSymCherries":
                result = cashSymCherriesOn;
                break;
            case "cashSymCherries1":
                result = cashSymCherries1On;
                break;
            case "cashSymCherries2":
                result = cashSymCherries2On;
                break;
            case "cashSymGoldBell":
                result = cashSymGoldBellOn;
                break;
            case "cashSymGoldBell1":
                result = cashSymGoldBell1On;
                break;
            case "cashSymGoldBell2":
                result = cashSymGoldBell2On;
                break;
            case "cashSymMix7Blue":
                result = cashSymMix7BlueOn;
                break;
            case "cashSymMix7Red":
                result = cashSymMix7RedOn;
                break;
            case "cashSymMix7Gold":
                result = cashSymMix7GoldOn;
                break;
            case "cashSymGoldSeven":
                result = cashSymGoldSevenOn;
                break;
            case "cashSymGoldSeven1":
                result = cashSymGoldSeven1On;
                break;
            case "cashSymGoldSeven2":
                result = cashSymGoldSeven2On;
                break;
            case "cashSymBlueSeven":
                result = cashSymBlueSevenOn;
                break;
            case "cashSymBlueSeven1":
                result = cashSymBlueSeven1On;
                break;
            case "cashSymBlueSeven2":
                result = cashSymBlueSeven2On;
                break;
            case "cashSymRedSeven":
                result = cashSymRedSevenOn;
                break;
            case "cashSymRedSeven1":
                result = cashSymRedSeven1On;
                break;
            case "cashSymRedSeven2":
                result = cashSymRedSeven2On;
                break;
            case "cashSymGreenBar":
                result = cashSymGreenBarOn;
                break;
            case "cashSymGreenBar1":
                result = cashSymGreenBar1On;
                break;
            case "cashSymGreenBar2":
                result = cashSymGreenBar2On;
                break;
            case "cashSymPurpleBar":
                result = cashSymPurpleBarOn;
                break;
            case "cashSymPurpleBar1":
                result = cashSymPurpleBar1On;
                break;
            case "cashSymPurpleBar2":
                result = cashSymPurpleBar2On;
                break;
            case "cashSymGoldBar":
                result = cashSymGoldBarOn;
                break;
            case "cashSymGoldBar1":
                result = cashSymGoldBar1On;
                break;
            case "cashSymGoldBar2":
                result = cashSymGoldBar2On;
                break;
        }
        
        return result;
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "cash1Pound":
                cash1PoundOn = result;
                break;
            case "cash2Pound":
                cash2PoundOn = result;
                break;
            case "cash3Pound":
                cash3PoundOn = result;
                break;
            case "cash4Pound":
                cash4PoundOn = result;
                break;
            case "cash5Pound":
                cash5PoundOn = result;
                break;
            case "cash6Pound":
                cash6PoundOn = result;
                break;
            case "cash7Pound":
                cash7PoundOn = result;
                break;
            case "cash8Pound":
                cash8PoundOn = result;
                break;
            case "cash9Pound":
                cash9PoundOn = result;
                break;
            case "cash10Pound":
                cash10PoundOn = result;
                break;
            case "cash12Pound":
                cash12PoundOn = result;
                break;
            case "cash15Pound":
                cash15PoundOn = result;
                break;
            case "cash1LPound":
                cash1LPoundOn = result;
                break;
            case "cash2LPound":
                cash2LPoundOn = result;
                break;
            case "cash3LPound":
                cash3LPoundOn = result;
                break;
            case "cash4LPound":
                cash4LPoundOn = result;
                break;
            case "cash5LPound":
                cash5LPoundOn = result;
                break;
            case "cash7LPound":
                cash7LPoundOn = result;
                break;
            case "cash10LPound":
                cash10LPoundOn = result;
                break;
            case "cash12LPound":
                cash12LPoundOn = result;
                break;
            case "cash15LPound":
                cash15LPoundOn = result;
                break;
            case "turboGambleCash":
                turboGambleCashOn = result;
                break;
            case "loseCash":
                loseCashOn = result;
                break;
            case "cashSymCherries":
                cashSymCherriesOn = result;
                break;
            case "cashSymCherries1":
                cashSymCherries1On = result;
                break;
            case "cashSymCherries2":
                cashSymCherries2On = result;
                break;
            case "cashSymGoldBell":
                cashSymGoldBellOn = result;
                break;
            case "cashSymGoldBell1":
                cashSymGoldBell1On = result;
                break;
            case "cashSymGoldBell2":
                cashSymGoldBell2On = result;
                break;
            case "cashSymMix7Blue":
                cashSymMix7BlueOn = result;
                break;
            case "cashSymMix7Red":
                cashSymMix7RedOn = result;
                break;
            case "cashSymMix7Gold":
                cashSymMix7GoldOn = result;
                break;
            case "cashSymGoldSeven":
                cashSymGoldSevenOn = result;
                break;
            case "cashSymGoldSeven1":
                cashSymGoldSeven1On = result;
                break;
            case "cashSymGoldSeven2":
                cashSymGoldSeven2On = result;
                break;
            case "cashSymBlueSeven":
                cashSymBlueSevenOn = result;
                break;
            case "cashSymBlueSeven1":
                cashSymBlueSeven1On = result;
                break;
            case "cashSymBlueSeven2":
                cashSymBlueSeven2On = result;
                break;
            case "cashSymRedSeven":
                cashSymRedSevenOn = result;
                break;
            case "cashSymRedSeven1":
                cashSymRedSeven1On = result;
                break;
            case "cashSymRedSeven2":
                cashSymRedSeven2On = result;
                break;
            case "cashSymGreenBar":
                cashSymGreenBarOn = result;
                break;
            case "cashSymGreenBar1":
                cashSymGreenBar1On = result;
                break;
            case "cashSymGreenBar2":
                cashSymGreenBar2On = result;
                break;
            case "cashSymPurpleBar":
                cashSymPurpleBarOn = result;
                break;
            case "cashSymPurpleBar1":
                cashSymPurpleBar1On = result;
                break;
            case "cashSymPurpleBar2":
                cashSymPurpleBar2On = result;
                break;
            case "cashSymGoldBar":
                cashSymGoldBarOn = result;
                break;
            case "cashSymGoldBar1":
                cashSymGoldBar1On = result;
                break;
            case "cashSymGoldBar2":
                cashSymGoldBar2On = result;
                break;
        }
        
        
    }

    
    /**
     * clearCash()
     * 
     * sets allCash to off
     */
    public void clearCash(){
        for(int i = 0; i < allCash.size(); i++){
            setOn(allCash.get(i).getText(), false);
        }
        for(int i = 0; i < upperCash.size(); i++){
            setOn(upperCash.get(i).getText(), false);
        }
        for(int i = 0; i < lowerCash.size(); i++){
            setOn(lowerCash.get(i).getText(), false);
        }
        for(int i = 0; i < lowerCashSYM.size(); i++){
            setOn(lowerCashSYM.get(i).getText(), false);
        }
    }

    
    /**
     * tick()
     * 
     */
    public void tick() {
    }
    
    void on() {
        //System.out.println("Cash: Turning all cash lights On.");
        for(JButton cash : allCash){
            setOn(cash.getText(), true);
        }        
    }

    void off() {
        //System.out.println("Cash: Turning all cash lights Off.");
        for(JButton cash : allCash){
            setOn(cash.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillUp() {
        //System.out.println("Turning Skill Cash Lights Up On.");
        
        //skillCashUpPool = Executors.newFixedThreadPool(1);
        
        skillCashUpPool.execute(skillCashUp);
        
        //skillCashUpPool.shutdown();
        //skillCashUpPool = null;
        
    }

    void skillDown() {
        //System.out.println("Turning Skill Cash Lights Down Off.");
        
        //skillCashDownPool = Executors.newFixedThreadPool(1);
        
        skillCashDownPool.execute(skillCashDown);
        
        //skillCashDownPool.shutdown();
        //skillCashDownPool = null;
        
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Turning Skill Cash On");
        excecutorService_SkillShotCash = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotCash.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillUp();
                } else {
                    skillDown();
                }
                excecutorService_SkillShotCash.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Cash: Turning Random Cash On");
        excecutorService_RandomCashOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomCashOn.scheduleAtFixedRate(new Runnable(){
            
            @Override
            public void run(){
                
                if((System.currentTimeMillis() / 450) % 2 == 0){
                    skillUp();
                    
                    skillLowerCashUpPool = Executors.newFixedThreadPool(1);
        
                    skillLowerCashUpPool.execute(skillLowerCashUp);

                    skillLowerCashUpPool.shutdown();
                    skillLowerCashUpPool = null;
                    
                    
                    skillLowerCashSYMUpPool = Executors.newFixedThreadPool(1);
        
                    skillLowerCashSYMUpPool.execute(skillLowerCashSYMUp);

                    skillLowerCashSYMUpPool.shutdown();
                    skillLowerCashSYMUpPool = null;
                    
                } else {
                    skillDown();
                    
                    skillLowerCashDownPool = Executors.newFixedThreadPool(1);
        
                    skillLowerCashDownPool.execute(skillLowerCashDown);

                    skillLowerCashDownPool.shutdown();
                    skillLowerCashDownPool = null;
                    
                    
                    skillLowerCashSYMDownPool = Executors.newFixedThreadPool(1);
        
                    skillLowerCashSYMDownPool.execute(skillLowerCashSYMDown);

                    skillLowerCashSYMDownPool.shutdown();
                    skillLowerCashSYMDownPool = null;
                }
                
            }
        }, 14, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Cash: Turning Random Cash Off");
        excecutorService_RandomCashOn.shutdown();
        
        try {
            if (!excecutorService_RandomCashOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomCashOn.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_RandomCashOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
        }
        off();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        System.out.println("Cash: Current Skill cash: "+currentSkillCash.getText());
        excecutorService_SkillCashUP.shutdown();
        excecutorService_SkillCashDown.shutdown();
        excecutorService_SkillLowerCashUp.shutdown();
        excecutorService_SkillLowerCashSYMUp.shutdown();
        excecutorService_SkillLowerCashDown.shutdown();
        excecutorService_SkillLowerCashSYMDown.shutdown();
        
        try {
            if (!excecutorService_SkillCashUP.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillCashUP.shutdownNow();
            }
            if (!excecutorService_SkillCashDown.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillCashDown.shutdownNow();
            }
            if (!excecutorService_SkillLowerCashUp.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerCashUp.shutdownNow();
            }
            if (!excecutorService_SkillLowerCashSYMUp.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerCashSYMUp.shutdownNow();
            }
            if (!excecutorService_SkillLowerCashDown.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerCashDown.shutdownNow();
            }
            if (!excecutorService_SkillLowerCashSYMDown.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerCashSYMDown.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillCashUP.shutdownNow();
            excecutorService_SkillCashDown.shutdownNow();
            excecutorService_SkillLowerCashUp.shutdownNow();
            excecutorService_SkillLowerCashSYMUp.shutdownNow();
            excecutorService_SkillLowerCashDown.shutdownNow();
            excecutorService_SkillLowerCashSYMDown.shutdownNow();
        }
    }

    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        System.out.println("Cash: Turning Default Cash On");
        off();
    }
    
}
