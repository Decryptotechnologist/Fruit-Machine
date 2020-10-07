/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.digits;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ghomez
 */
public class BankText {//extends Digits {
    
    /**Attributes*/
    
    /**BankText width variable of BankText object */
    public int BankTextWidth = 120;
    
    /**BankText height variable of BankText object */
    public int BankTextHeight = 46;  
    
    
    /**BANK TEXT*/
    
    /**BankTextGameOver button/light variables of BankText object */ 
    public JButton BankTextGameOver;
    private final int BankTextGameOverLgtX = 335, BankTextGameOverLgtY = 365;
    private BufferedImage BankTextGameOverOnImg;
    private static boolean BankTextGameOverOn;
    
    /**BankTextYouWon button/light variables of BankText object */ 
    public JButton BankTextYouWon;
    private final int BankTextYouWonLgtX = 330, BankTextYouWonLgtY = 350;
    private BufferedImage BankTextYouWonOnImg;
    private static boolean BankTextYouWonOn;

    /**BankTextRepeat button/light variables of BankText object */ 
    public JButton BankTextRepeat;
    private final int BankTextRepeatLgtX = 348, BankTextRepeatLgtY = 375;
    private BufferedImage BankTextRepeatOnImg;
    private static boolean BankTextRepeatOn;
    
    /**BankTextRepeatY button/light variables of BankText object */ 
    public JButton BankTextRepeatY;
    private final int BankTextRepeatYLgtX = 318, BankTextRepeatYLgtY = 380;
    private BufferedImage BankTextRepeatYOnImg;
    private static boolean BankTextRepeatYOn;
    
    /**BankTextRepeatN button/light variables of BankText object */ 
    public JButton BankTextRepeatN;
    private final int BankTextRepeatNLgtX = 424, BankTextRepeatNLgtY = 380;
    private BufferedImage BankTextRepeatNOnImg;
    private static boolean BankTextRepeatNOn;
    
    /**BankTextLose button/light variables of BankText object */ 
    public JButton BankTextLose;
    private final int BankTextLoseLgtX = 345, BankTextLoseLgtY = 377;
    private BufferedImage BankTextLoseOnImg;
    private static boolean BankTextLoseOn;
    
    /**BankTextNudgeNow button/light variables of BankText object */ 
    public JButton BankTextNudgeNow;
    private final int BankTextNudgeNowLgtX = 337, BankTextNudgeNowLgtY = 359;
    private BufferedImage BankTextNudgeNowOnImg;
    private static boolean BankTextNudgeNowOn;
    
    /**BankTextInsertCoin button/light variables of BankText object */ 
    public JButton BankTextInsertCoin;
    private final int BankTextInsertCoinLgtX = 337, BankTextInsertCoinLgtY = 365;
    private BufferedImage BankTextInsertCoinOnImg;
    private static boolean BankTextInsertCoinOn;
    
    /**BankTextGamble button/light variables of BankText object */ 
    public JButton BankTextGamble;
    private final int BankTextGambleLgtX = 335, BankTextGambleLgtY = 370;
    private BufferedImage BankTextGambleOnImg;
    private static boolean BankTextGambleOn;
    
    /**BankTextSuperHold button/light variables of BankText object */ 
    public JButton BankTextSuperHold;
    private final int BankTextSuperHoldLgtX = 317, BankTextSuperHoldLgtY = 343;
    private BufferedImage BankTextSuperHoldOnImg;
    private static boolean BankTextSuperHoldOn;
    
    
    
    /**BankTextCollectCash button/light variables of BankText object */ 
    public JButton BankTextCollectCash;
    private final int BankTextCollectCashLgtX = 288, BankTextCollectCashLgtY = 334;
    private BufferedImage BankTextCollectCashOnImg;
    private static boolean BankTextCollectCashOn;
    
    /**BankTextCollectNudges button/light variables of BankText object */ 
    public JButton BankTextCollectNudges;
    private final int BankTextCollectNudgesLgtX = 289, BankTextCollectNudgesLgtY = 333;
    private BufferedImage BankTextCollectNudgesOnImg;
    private static boolean BankTextCollectNudgesOn;
    
    /**BankTextCollectFeature button/light variables of BankText object */ 
    public JButton BankTextCollectFeature;
    private final int BankTextCollectFeatureLgtX = 291, BankTextCollectFeatureLgtY = 333;
    private BufferedImage BankTextCollectFeatureOnImg;
    private static boolean BankTextCollectFeatureOn;
    
    /**BankTextSkillshot button/light variables of BankText object */ 
    public JButton BankTextSkillshot;
    private final int BankTextSkillshotLgtX = 333, BankTextSkillshotLgtY = 353;
    private BufferedImage BankTextSkillshotOnImg;
    private static boolean BankTextSkillshotOn;
    
    /**BankTextJackpot button/light variables of BankText object */ 
    public JButton BankTextJackpot;
    private final int BankTextJackpotLgtX = 329, BankTextJackpotLgtY = 348;
    private BufferedImage BankTextJackpotOnImg;
    private static boolean BankTextJackpotOn;
    
    /**BankTextLetEmSpin button/light variables of BankText object */ 
    public JButton BankTextLetEmSpin;
    private final int BankTextLetEmSpinLgtX = 330, BankTextLetEmSpinLgtY = 350;
    private BufferedImage BankTextLetEmSpinOnImg;
    private static boolean BankTextLetEmSpinOn;
    
    /**BankTextPlus button/light variables of BankText object */ 
    public JButton BankTextPlus;
    private final int BankTextPlusLgtX = 345, BankTextPlusLgtY = 357;
    private BufferedImage BankTextPlusOnImg;
    private static boolean BankTextPlusOn;
    
    /**allbanktxts List variable of BankText object */ 
    public List<JButton> allbanktxts;
    
    /**Banktxtz JPanel variable of BankText object */ 
    public JPanel Banktxtz;
    
    
    
    /**Constructor*/
    
    /**
     * BankText Constructor
     * 
     */
    public BankText(){
        allbanktxts = new ArrayList<>();
        init();
    }
    
    
    /**Public Protocol*/ 
    
    
    /**
     * init()
     * 
     * Initiates all the BankText images
     * and fires the drawBankText method
     *
     */
    private void init(){
        
            /**BANK TEXT*/
            
            BankTextInsertCoinOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-INSERTCOIN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-INSERTCOIN.png"));
            
            BankTextGameOverOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-GAMEOVER").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-GAMEOVER.png"));
            
            BankTextRepeatOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-REPEAT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-REPEAT.png"));
            
            BankTextRepeatYOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-REPEAT-Y").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-REPEAT-Y.png"));
            
            BankTextRepeatNOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-REPEAT-N").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-REPEAT-N.png"));
            
            BankTextNudgeNowOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NUDGENOW").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NUDGENOW.png"));
            
            BankTextLoseOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-LOSE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-LOSE.png"));
            
            BankTextGambleOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-GAMBLE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-GAMBLE.png"));
            
            BankTextYouWonOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-YOUWIN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-YOUWIN.png"));
            
            
            BankTextSuperHoldOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SUPER-HOLDS").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SUPER-HOLDS.png"));
            
            BankTextCollectCashOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-COLLECT-CASH").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-COLLECT-CASH.png"));
            
            BankTextCollectNudgesOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-COLLECT-NUDGES").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-COLLECT-NUDGES.png"));
            
            BankTextCollectFeatureOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-COLLECT-FEATURE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-COLLECT-FEATURE.png"));
            
            BankTextSkillshotOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SKILLSHOT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SKILLSHOT.png"));
            
            BankTextJackpotOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-JACKPOT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-JACKPOT.png"));
            
            BankTextLetEmSpinOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-YOUWIN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-YOUWIN.png"));
            
            BankTextPlusOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-YOUWIN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-YOUWIN.png"));
            
        drawBankText();
         
         
        Banktxtz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            Banktxtz.setSize(1280, 720);
            Banktxtz.setOpaque(false);
            Banktxtz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        }};
        
    }
    

    /**
     * drawBankText()
     * 
     * Draws all the BankText images/JButtons
     */    
    private void drawBankText() {
        
        /**BANK TEXT*/
        //0 : Game Over
        BankTextGameOver = new JButton("BankTextGameOver");
        allbanktxts.add(BankTextGameOver);
        
        //1 : You Won!
        BankTextYouWon = new JButton("BankTextYouWon");
        allbanktxts.add(BankTextYouWon);
        
        //2 : Repeat
        BankTextRepeat = new JButton("BankTextRepeat");
        allbanktxts.add(BankTextRepeat);
        
        //3 : RepeatY
        BankTextRepeatY = new JButton("BankTextRepeatY");
        allbanktxts.add(BankTextRepeatY);
        
        //4 : RepeatN
        BankTextRepeatN = new JButton("BankTextRepeatN");
        allbanktxts.add(BankTextRepeatN);
        
        //5 : Lose
        BankTextLose = new JButton("BankTextLose");
        allbanktxts.add(BankTextLose);
        
        //6 : NudgeNow
        BankTextNudgeNow = new JButton("BankTextNudgeNow");
        allbanktxts.add(BankTextNudgeNow);
        
        //7 : Insert Coin
        BankTextInsertCoin = new JButton("BankTextInsertCoin");
        allbanktxts.add(BankTextInsertCoin);
        
        //8 : Gamble
        BankTextGamble = new JButton("BankTextGamble");
        allbanktxts.add(BankTextGamble);
        
        //9 : Super Hold
        BankTextSuperHold = new JButton("BankTextSuperHold");
        allbanktxts.add(BankTextSuperHold);      
        
        //10 : Collect Cash
        BankTextCollectCash = new JButton("BankTextCollectCash");
        allbanktxts.add(BankTextCollectCash);
        
        //11 : Collect Nudges
        BankTextCollectNudges = new JButton("BankTextCollectNudges");
        allbanktxts.add(BankTextCollectNudges);
        
        //12 : Collect Feature
        BankTextCollectFeature = new JButton("BankTextCollectFeature");
        allbanktxts.add(BankTextCollectFeature);
        
        //13 : Jackpot
        BankTextJackpot = new JButton("BankTextJackpot");
        allbanktxts.add(BankTextJackpot);
        
        //14 : Skillshot
        BankTextSkillshot = new JButton("BankTextSkillshot");
        allbanktxts.add(BankTextSkillshot);
        
        //15 : Let Em Spin
        BankTextLetEmSpin = new JButton("BankTextLetEmSpin");
        allbanktxts.add(BankTextLetEmSpin);
        
        //16 : Plus
        BankTextPlus = new JButton("BankTextPlus");
        allbanktxts.add(BankTextPlus);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     * 
     * repaints all the BankTxtz images/JButtons
     */
    public void render(Graphics2D g){
        
        /**BANK TEXT*/
        if (BankTextInsertCoinOn){
            g.drawImage(BankTextInsertCoinOnImg, BankTextInsertCoinLgtX, BankTextInsertCoinLgtY, BankTextWidth+10, BankTextHeight+12, null);
        }

        if (BankTextGameOverOn){
            g.drawImage(BankTextGameOverOnImg, BankTextGameOverLgtX, BankTextGameOverLgtY, BankTextWidth, BankTextHeight+12, null);
        }

        if (BankTextYouWonOn){
            g.drawImage(BankTextYouWonOnImg, BankTextYouWonLgtX, BankTextYouWonLgtY, BankTextWidth+10, BankTextHeight+40, null);
        }

        if (BankTextRepeatOn){
            g.drawImage(BankTextRepeatOnImg, BankTextRepeatLgtX, BankTextRepeatLgtY, BankTextWidth-24, BankTextHeight-8, null);
        }

        if (BankTextRepeatYOn){
            g.drawImage(BankTextRepeatYOnImg, BankTextRepeatYLgtX, BankTextRepeatYLgtY, BankTextWidth-72, BankTextHeight-18, null);
        }

        if (BankTextRepeatNOn){
            g.drawImage(BankTextRepeatNOnImg, BankTextRepeatNLgtX, BankTextRepeatNLgtY, BankTextWidth-72, BankTextHeight-18, null);
        }

        if (BankTextLoseOn){
            g.drawImage(BankTextLoseOnImg, BankTextLoseLgtX, BankTextLoseLgtY, BankTextWidth-22, BankTextHeight-12, null);
        }

        if (BankTextNudgeNowOn){
            g.drawImage(BankTextNudgeNowOnImg, BankTextNudgeNowLgtX, BankTextNudgeNowLgtY, BankTextWidth+6, BankTextHeight+24, null);
        }

        if (BankTextGambleOn){
            g.drawImage(BankTextGambleOnImg, BankTextGambleLgtX, BankTextGambleLgtY, BankTextWidth, BankTextHeight+2, null);
        }

        if (BankTextSuperHoldOn){
            g.drawImage(BankTextSuperHoldOnImg, BankTextSuperHoldLgtX, BankTextSuperHoldLgtY, BankTextWidth+40, BankTextHeight+56, null);
        }

        if (BankTextCollectCashOn){
            g.drawImage(BankTextCollectCashOnImg, BankTextCollectCashLgtX, BankTextCollectCashLgtY, BankTextWidth+100, BankTextHeight+72, null);
        }

        if (BankTextCollectNudgesOn){
            g.drawImage(BankTextCollectNudgesOnImg, BankTextCollectNudgesLgtX, BankTextCollectNudgesLgtY, BankTextWidth+96, BankTextHeight+74, null);
        }

        if (BankTextCollectFeatureOn){
            g.drawImage(BankTextCollectFeatureOnImg, BankTextCollectFeatureLgtX, BankTextCollectFeatureLgtY, BankTextWidth+96, BankTextHeight+74, null);
        }

        if (BankTextLetEmSpinOn){
            g.drawImage(BankTextLetEmSpinOnImg, BankTextLetEmSpinLgtX, BankTextLetEmSpinLgtY, BankTextWidth+10, BankTextHeight+40, null);
        }

        if (BankTextSkillshotOn){
            g.drawImage(BankTextSkillshotOnImg, BankTextSkillshotLgtX, BankTextSkillshotLgtY, BankTextWidth+12, BankTextHeight+36, null);
        }

        if (BankTextJackpotOn){
            g.drawImage(BankTextJackpotOnImg, BankTextJackpotLgtX, BankTextJackpotLgtY, BankTextWidth+18, BankTextHeight+46, null);
        }

        if (BankTextPlusOn){
            g.drawImage(BankTextPlusOnImg, BankTextPlusLgtX, BankTextPlusLgtY, BankTextWidth, BankTextHeight, null);
        }
            
        g.dispose();
        
    }
    
    
    /**
     * getAllBankText()
     * 
     * @return allbanktxts - returns allbanktxts images/JButtons
     */
    public List<JButton> getAllBankText() {
        return allbanktxts;
    }

    
    /**
     * getOn()
     * 
     * @param name
     * @return result - returns result of bank text images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "BankTextInsertCoin":
                result = BankTextInsertCoinOn;
                break;
            case "BankTextGameOver":
                result = BankTextGameOverOn;
                break;
            case "BankTextGamble":
                result = BankTextGambleOn;
                break;
            case "BankTextLose":
                result = BankTextLoseOn;
                break;
            case "BankTextRepeat":
                result = BankTextRepeatOn;
                break;
            case "BankTextRepeatY":
                result = BankTextRepeatYOn;
                break;
            case "BankTextRepeatN":
                result = BankTextRepeatNOn;
                break;
            case "BankTextNudgeNow":
                result = BankTextNudgeNowOn;
                break;
            case "BankTextYouWon":
                result = BankTextYouWonOn;
                break;
            case "BankTextSuperHold":
                result = BankTextSuperHoldOn;
                break;
            case "BankTextLetEmSpin":
                result = BankTextLetEmSpinOn;
                break;
            case "BankTextCollectCash":
                result = BankTextCollectCashOn;
                break;
            case "BankTextCollectNudges":
                result = BankTextCollectNudgesOn;
                break;
            case "BankTextCollectFeature":
                result = BankTextCollectFeatureOn;
                break;
            case "BankTextSkillshot":
                result = BankTextSkillshotOn;
                break;
            case "BankTextJackpot":
                result = BankTextJackpotOn;
                break;
            case "BankTextPlus":
                result = BankTextPlusOn;
                break;
        }
        
        /**BANK TEXT DIGITS*/
        
        //insert coin
//        if(name.equals("BankTextInsertCoin")){
//            result = BankTextInsertCoinOn;
//        }
//        
//        //game over
//        if(name.equals("BankTextGameOver")){
//            result = BankTextGameOverOn;
//        }
//        
//        //gamble
//        if(name.equals("BankTextGamble")){
//            result = BankTextGambleOn;
//        }
//        
//        //lose
//        if(name.equals("BankTextLose")){
//            result = BankTextLoseOn;
//        }
//        
//        //repeat
//        if(name.equals("BankTextRepeat")){
//            result = BankTextRepeatOn;
//        }
//        
//        //repeatY
//        if(name.equals("BankTextRepeatY")){
//           result = BankTextRepeatYOn;
//        }
//        
//        //repeatN
//        if(name.equals("BankTextRepeatN")){
//            result = BankTextRepeatNOn;
//        }
//        
//        //nudge now
//        if(name.equals("BankTextNudgeNow")){
//            result = BankTextNudgeNowOn;
//        }
//        
//        //you won
//        if(name.equals("BankTextYouWon")){
//            result = BankTextYouWonOn;
//        }
//        
//        //super hold
//        if(name.equals("BankTextSuperHold")){
//            result = BankTextSuperHoldOn;
//        }
//        
//        
//        //letEmSpin
//        if(name.equals("BankTextLetEmSpin")){
//            result = BankTextLetEmSpinOn;
//        }
//        
//        //CollectCash
//        if(name.equals("BankTextCollectCash")){
//            result = BankTextCollectCashOn;
//        }
//        
//        //CollectNudges
//        if(name.equals("BankTextCollectNudges")){
//            result = BankTextCollectNudgesOn;
//        }
//        
//        //CollectFeature
//        if(name.equals("BankTextCollectFeature")){
//            result = BankTextCollectFeatureOn;
//        }
//        
//        //skillshot
//        if(name.equals("BankTextSkillshot")){
//            result = BankTextSkillshotOn;
//        }
//        
//        //Jackpot
//        if(name.equals("BankTextJackpot")){
//            result = BankTextJackpotOn;
//        }
//        
//        //plus
//        if(name.equals("BankTextPlus")){
//            result = BankTextPlusOn;
//        }
        
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
            case "BankTextInsertCoin":
                BankTextInsertCoinOn = result;
                break;
            case "BankTextGameOver":
                BankTextGameOverOn = result;
                break;
            case "BankTextGamble":
                BankTextGambleOn = result;
                break;
            case "BankTextLose":
                BankTextLoseOn = result;
                break;
            case "BankTextRepeat":
                BankTextRepeatOn = result;
                break;
            case "BankTextRepeatY":
                BankTextRepeatYOn = result;
                break;
            case "BankTextRepeatN":
                BankTextRepeatNOn = result;
                break;
            case "BankTextNudgeNow":
                BankTextNudgeNowOn = result;
                break;
            case "BankTextYouWon":
                BankTextYouWonOn = result;
                break;
            case "BankTextSuperHold":
                BankTextSuperHoldOn = result;
                break;
            case "BankTextLetEmSpin":
                BankTextLetEmSpinOn = result;
                break;
            case "BankTextCollectCash":
                BankTextCollectCashOn = result;
                break;
            case "BankTextCollectNudges":
                BankTextCollectNudgesOn = result;
                break;
            case "BankTextCollectFeature":
                BankTextCollectFeatureOn = result;
                break;
            case "BankTextSkillshot":
                BankTextSkillshotOn = result;
                break;
            case "BankTextJackpot":
                BankTextJackpotOn = result;
                break;
            case "BankTextPlus":
                BankTextPlusOn = result;
                break;
        }
        
        
        /**BANK TEXT DIGITS*/
        
        //insert coin
//        if(name.equals("BankTextInsertCoin")){
//            BankTextInsertCoinOn = result;
//        }
//        
//        //game over
//        if(name.equals("BankTextGameOver")){
//            BankTextGameOverOn = result;
//        }
//        
//        //gamble
//        if(name.equals("BankTextGamble")){
//            BankTextGambleOn = result;
//        }
//        
//        //lose
//        if(name.equals("BankTextLose")){
//            BankTextLoseOn = result;
//        }
//        
//        //repeat
//        if(name.equals("BankTextRepeat")){
//            BankTextRepeatOn = result;
//        }
//        
//        //repeatY
//        if(name.equals("BankTextRepeatY")){
//           BankTextRepeatYOn = result;
//        }
//        
//        //repeatN
//        if(name.equals("BankTextRepeatN")){
//            BankTextRepeatNOn = result;
//        }
//        
//        //nudge now
//        if(name.equals("BankTextNudgeNow")){
//            BankTextNudgeNowOn = result;
//        }
//        
//        //you won
//        if(name.equals("BankTextYouWon")){
//            BankTextYouWonOn = result;
//        }
//        
//        //super hold
//        if(name.equals("BankTextSuperHold")){
//            BankTextSuperHoldOn = result;
//        }
//        
//        
//        
//        //letEmSpin
//        if(name.equals("BankTextLetEmSpin")){
//            BankTextLetEmSpinOn = result;
//        }
//        
//        //CollectCash
//        if(name.equals("BankTextCollectCash")){
//            BankTextCollectCashOn = result;
//        }
//        
//        //CollectNudges
//        if(name.equals("BankTextCollectNudges")){
//            BankTextCollectNudgesOn = result;
//        }
//        
//        //CollectFeature
//        if(name.equals("BankTextCollectFeature")){
//            BankTextCollectFeatureOn = result;
//        }
//        
//        //skillshot
//        if(name.equals("BankTextSkillshot")){
//            BankTextSkillshotOn = result;
//        }
//        
//        //Jackpot
//        if(name.equals("BankTextJackpot")){
//            BankTextJackpotOn = result;
//        }
//        
//        //plus
//        if(name.equals("BankTextPlus")){
//            BankTextPlusOn = result;
//        }
    }

    
    /**
     * setText()
     * 
     * @param index
     */
    public void setText(int index) {
        String name = "";
        boolean result = false;
        
        clearBankText();
        
        switch(index){
            case 0:
                name = "BankTextInsertCoin";
                result = true;
                break;
            case 1:
                name = "BankTextInsertCoin";
                result = false;
                break;
            case 2:
                name = "BankTextPlus";
                result = true;
                break;
            case 3:
                name = "BankTextJackpot";
                result = true;
                break;
            case 4:
                name = "BankTextSkillshot";
                result = true;
                break;
            case 5:
                name = "BankTextCollectFeature";
                result = true;
                break;
            case 6:
                name = "BankTextCollectNudges";
                result = false;
                break;
            case 7:
                name = "BankTextCollectCash";
                result = true;
                break;
            case 8:
                name = "BankTextLetEmSpin";
                result = true;
                break;
            case 9:
                name = "BankTextSuperHold";
                result = true;
                break;
            case 10:
                name = "BankTextYouWon";
                result = true;
                break;
            case 11:
                name = "BankTextNudgeNow";
                result = false;
                break;
            case 12:
                name = "BankTextRepeatY";
                result = true;
                break;
            case 13:
                name = "BankTextRepeatN";
                result = true;
                break;
            case 14:
                name = "BankTextRepeat";
                result = true;
                break;
            case 15:
                name = "BankTextLose";
                result = true;
                break;
            case 16:
                name = "BankTextGamble";
                result = true;
                break;
            case 17:
                name = "BankTextGameOver";
                result = true;
                break;
        }
        
        setOn(name, result);
    }
    
    
    /**
     * getX()
     * 
     * @param name
     * @return result - returns result X of bank text images/JButtons
     */
//    public int getX(String name){
//        
//        int result = 0;
//    
//        /**BANK TEXT DIGITS*/
//        
//        //insert coin
//        if(name.equals("BankTextInsertCoin")){
//            result = BankTextInsertCoinLgtX;
//        }
//        
//        //game over
//        if(name.equals("BankTextGameOver")){
//            result = BankTextGameOverLgtX;
//        }
//        
//        //gamble
//        if(name.equals("BankTextGamble")){
//            result = BankTextGambleLgtX;
//        }
//        
//        //lose
//        if(name.equals("BankTextLose")){
//            result = BankTextLoseLgtX;
//        }
//        
//        //repeat
//        if(name.equals("BankTextRepeat")){
//            result = BankTextRepeatLgtX;
//        }
//        
//        //repeatY
//        if(name.equals("BankTextRepeatY")){
//           result = BankTextRepeatYLgtX;
//        }
//        
//        //repeatN
//        if(name.equals("BankTextRepeatN")){
//            result = BankTextRepeatNLgtX;
//        }
//        
//        //nudge now
//        if(name.equals("BankTextNudgeNow")){
//            result = BankTextNudgeNowLgtX;
//        }
//        
//        //you won
//        if(name.equals("BankTextYouWon")){
//            result = BankTextYouWonLgtX;
//        }
//        
//        //super hold
//        if(name.equals("BankTextSuperHold")){
//            result = BankTextSuperHoldLgtX;
//        }
//        
//        
//        //letEmSpin
//        if(name.equals("BankTextLetEmSpin")){
//            result = BankTextLetEmSpinLgtX;
//        }
//        
//        //CollectCash
//        if(name.equals("BankTextCollectCash")){
//            result = BankTextCollectCashLgtX;
//        }
//        
//        //CollectNudges
//        if(name.equals("BankTextCollectNudges")){
//            result = BankTextCollectNudgesLgtX;
//        }
//        
//        //CollectFeature
//        if(name.equals("BankTextCollectFeature")){
//            result = BankTextCollectFeatureLgtX;
//        }
//        
//        //skillshot
//        if(name.equals("BankTextSkillshot")){
//            result = BankTextSkillshotLgtX;
//        }
//        
//        //Jackpot
//        if(name.equals("BankTextJackpot")){
//            result = BankTextJackpotLgtX;
//        }
//        
//        //plus
//        if(name.equals("BankTextPlus")){
//            result = BankTextPlusLgtX;
//        }
//        
//        return result;
//    }
    
    
    /**
     * getY()
     * 
     * @param name
     * @return result - returns result Y of bank text images/JButtons
     */
//    public int getY(String name){
//    
//        int result = 0;
//        
//        /**BANK TEXT DIGITS*/
//        
//        //insert coin
//        if(name.equals("BankTextInsertCoin")){
//            result = BankTextInsertCoinLgtY;
//        }
//        
//        //game over
//        if(name.equals("BankTextGameOver")){
//            result = BankTextGameOverLgtY;
//        }
//        
//        //gamble
//        if(name.equals("BankTextGamble")){
//            result = BankTextGambleLgtY;
//        }
//        
//        //lose
//        if(name.equals("BankTextLose")){
//            result = BankTextLoseLgtY;
//        }
//        
//        //repeat
//        if(name.equals("BankTextRepeat")){
//            result = BankTextRepeatLgtY;
//        }
//        
//        //repeatY
//        if(name.equals("BankTextRepeatY")){
//           result = BankTextRepeatYLgtY;
//        }
//        
//        //repeatN
//        if(name.equals("BankTextRepeatN")){
//            result = BankTextRepeatNLgtY;
//        }
//        
//        //nudge now
//        if(name.equals("BankTextNudgeNow")){
//            result = BankTextNudgeNowLgtY;
//        }
//        
//        //you won
//        if(name.equals("BankTextYouWon")){
//            result = BankTextYouWonLgtY;
//        }
//        
//        //super hold
//        if(name.equals("BankTextSuperHold")){
//            result = BankTextSuperHoldLgtY;
//        }
//        
//        
//        //letEmSpin
//        if(name.equals("BankTextLetEmSpin")){
//            result = BankTextLetEmSpinLgtY;
//        }
//        
//        //CollectCash
//        if(name.equals("BankTextCollectCash")){
//            result = BankTextCollectCashLgtY;
//        }
//        
//        //CollectNudges
//        if(name.equals("BankTextCollectNudges")){
//            result = BankTextCollectNudgesLgtY;
//        }
//        
//        //CollectFeature
//        if(name.equals("BankTextCollectFeature")){
//            result = BankTextCollectFeatureLgtY;
//        }
//        
//        //skillshot
//        if(name.equals("BankTextSkillshot")){
//            result = BankTextSkillshotLgtY;
//        }
//        
//        //Jackpot
//        if(name.equals("BankTextJackpot")){
//            result = BankTextJackpotLgtY;
//        }
//        
//        //plus
//        if(name.equals("BankTextPlus")){
//            result = BankTextPlusLgtY;
//        }
//        
//        return result;
//    }
 
    
    /**
     * clearBankText()
     * 
     * sets allbanktxts to off
     */
    public void clearBankText(){
        for(int i = 0; i < allbanktxts.size(); i++){
            setOn(allbanktxts.get(i).getText(), false);
        }
    }

    
    /**
     * tick()
     * 
     */
//    public void tick() {
//    }
    
    //@Override
    void on() {
        System.out.println("Turning All Banktext Digits On");
        for(JButton banktxt : allbanktxts){//int i = 0; i < allbanktxts.size(); i++){
            setOn(banktxt.getText(), true);
        }
    }

    //@Override
    void off() {
        System.out.println("Turning All Banktext Digits Off");
        clearBankText();
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void defaultDigits() {
        setText(0);
        //setOn(allbanktxts.get(7).getText(), true);
    }

    void skillUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void skillDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void skillShot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void skillShotStop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void randomOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void randomOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 

