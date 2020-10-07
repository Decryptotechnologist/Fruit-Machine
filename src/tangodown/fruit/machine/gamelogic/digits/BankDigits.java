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
import javax.swing.*;

/**
 * @author Ghomez
 */
public class BankDigits {//extends Digits {
    
   /**Attributes*/
    
    /**BankDigitWidth variable of BankDigits object */
    public int BankDigitWidth = 36;
    
    /**BankDigitHeight variable of BankDigits object */
    public int BankDigitHeight = 36;
    
    /**BankDigitA0 button/light variables of BankDigits object */
    private final int BankDigitALgtX = 225;
    
    /**BankDigitA0 button/light variables of BankDigits object */
    private final int BankDigitALgtY = 376;
    
    /**BankDigitA0 button/light variables of BankDigits object */ 
    public JButton BankDigitA0;
    private BufferedImage BankDigitA0OnImg;
    private static boolean BankDigitA0On;
    
    /**BankDigitA1 button/light variables of BankDigits object */ 
    public JButton BankDigitA1;
    private BufferedImage BankDigitA1OnImg;
    private static boolean BankDigitA1On;
    
    /**BankDigitA2 button/light variables of BankDigits object */ 
    public JButton BankDigitA2;
    private BufferedImage BankDigitA2OnImg;
    private static boolean BankDigitA2On;
    
    /**BankDigitA3 button/light variables of BankDigits object */ 
    public JButton BankDigitA3;
    private BufferedImage BankDigitA3OnImg;
    private static boolean BankDigitA3On;
    
    /**BankDigitA4 button/light variables of BankDigits object */ 
    public JButton BankDigitA4;
    private BufferedImage BankDigitA4OnImg;
    private static boolean BankDigitA4On;
    
    /**BankDigitA5 button/light variables of BankDigits object */ 
    public JButton BankDigitA5;
    private BufferedImage BankDigitA5OnImg;
    private static boolean BankDigitA5On;
    
    /**BankDigitA6 button/light variables of BankDigits object */ 
    public JButton BankDigitA6;
    private BufferedImage BankDigitA6OnImg;
    private static boolean BankDigitA6On;
    
    /**BankDigitA7 button/light variables of BankDigits object */ 
    public JButton BankDigitA7;
    private BufferedImage BankDigitA7OnImg;
    private static boolean BankDigitA7On;
    
    /**BankDigitA8 button/light variables of BankDigits object */ 
    public JButton BankDigitA8;
    private BufferedImage BankDigitA8OnImg;
    private static boolean BankDigitA8On;
    
    /**BankDigitA9 button/light variables of BankDigits object */ 
    public JButton BankDigitA9;
    private BufferedImage BankDigitA9OnImg;
    private static boolean BankDigitA9On;
        
    
    /**SECOND BANK DIGIT*/
    
    /**BankDigitB0 button/light variables of BankDigits object */ 
    private final int BankDigitBLgtX = 235;
    
    /**BankDigitB0 button/light variables of BankDigits object */ 
    private final int BankDigitBLgtY = 376;
    
    /**BankDigitB0 button/light variables of BankDigits object */ 
    public JButton BankDigitB0;
    private BufferedImage BankDigitB0OnImg;
    private static boolean BankDigitB0On;
    
    /**BankDigitB1 button/light variables of BankDigits object */ 
    public JButton BankDigitB1;
    private BufferedImage BankDigitB1OnImg;
    private static boolean BankDigitB1On;
    
    /**BankDigitB2 button/light variables of BankDigits object */ 
    public JButton BankDigitB2;
    private BufferedImage BankDigitB2OnImg;
    private static boolean BankDigitB2On;
    
    /**BankDigitB3 button/light variables of BankDigits object */ 
    public JButton BankDigitB3;
    private BufferedImage BankDigitB3OnImg;
    private static boolean BankDigitB3On;
    
    /**BankDigitB4 button/light variables of BankDigits object */ 
    public JButton BankDigitB4;
    private BufferedImage BankDigitB4OnImg;
    private static boolean BankDigitB4On;
    
    /**BankDigitB5 button/light variables of BankDigits object */ 
    public JButton BankDigitB5;
    private BufferedImage BankDigitB5OnImg;
    private static boolean BankDigitB5On;
    
    /**BankDigitB6 button/light variables of BankDigits object */ 
    public JButton BankDigitB6;
    private BufferedImage BankDigitB6OnImg;
    private static boolean BankDigitB6On;
        
    /**BankDigitB7 button/light variables of BankDigits object */ 
    public JButton BankDigitB7;
    private BufferedImage BankDigitB7OnImg;
    private static boolean BankDigitB7On;
    
    /**BankDigitB8 button/light variables of BankDigits object */ 
    public JButton BankDigitB8;
    private BufferedImage BankDigitB8OnImg;
    private static boolean BankDigitB8On;
        
    /**BankDigitB9 button/light variables of BankDigits object */ 
    public JButton BankDigitB9;
    private BufferedImage BankDigitB9OnImg;
    private static boolean BankDigitB9On;
       
    
    /**THIRD BANK DIGIT*/
    
    /**BankDigitC0 button/light variables of BankDigits object */ 
    private final int BankDigitCLgtX = 249;
    
    /**BankDigitC0 button/light variables of BankDigits object */ 
    private final int BankDigitCLgtY = 376;
    
    /**BankDigitC0 button/light variables of BankDigits object */ 
    public JButton BankDigitC0;
    private BufferedImage BankDigitC0OnImg;
    private static boolean BankDigitC0On;
    
    /**BankDigitC1 button/light variables of BankDigits object */ 
    public JButton BankDigitC1;
    private BufferedImage BankDigitC1OnImg;
    private static boolean BankDigitC1On;
    
    /**BankDigitC2 button/light variables of BankDigits object */ 
    public JButton BankDigitC2;
    private BufferedImage BankDigitC2OnImg;
    private static boolean BankDigitC2On;
    
    /**BankDigitC3 button/light variables of BankDigits object */ 
    public JButton BankDigitC3;
    private BufferedImage BankDigitC3OnImg;
    private static boolean BankDigitC3On;
    
    /**BankDigitC4 button/light variables of BankDigits object */ 
    public JButton BankDigitC4;
    private BufferedImage BankDigitC4OnImg;
    private static boolean BankDigitC4On;
    
    /**BankDigitC5 button/light variables of BankDigits object */ 
    public JButton BankDigitC5;
    private BufferedImage BankDigitC5OnImg;
    private static boolean BankDigitC5On;
    
    /**BankDigitC6 button/light variables of BankDigits object */ 
    public JButton BankDigitC6;
    private BufferedImage BankDigitC6OnImg;
    private static boolean BankDigitC6On;
    
    /**BankDigitC7 button/light variables of BankDigits object */ 
    public JButton BankDigitC7;
    private BufferedImage BankDigitC7OnImg;
    private static boolean BankDigitC7On;
    
    /**BankDigitC8 button/light variables of BankDigits object */ 
    public JButton BankDigitC8;
    private BufferedImage BankDigitC8OnImg;
    private static boolean BankDigitC8On;
    
    /**BankDigitC button/light variables of BankDigits object */ 
    public JButton BankDigitC9;
    private BufferedImage BankDigitC9OnImg;
    private static boolean BankDigitC9On;
        
    
    /**FOURTH BANK DIGIT*/
    
    /**BankDigitD0 button/light variables of BankDigits object */ 
    private final int BankDigitDLgtX = 260;
    
    /**BankDigitD0 button/light variables of BankDigits object */ 
    private final int BankDigitDLgtY = 376;
    
    /**BankDigitD0 button/light variables of BankDigits object */ 
    public JButton BankDigitD0;
    private BufferedImage BankDigitD0OnImg;
    private static boolean BankDigitD0On;
    
    /**BankDigitD1 button/light variables of BankDigits object */ 
    public JButton BankDigitD1;
    private BufferedImage BankDigitD1OnImg;
    private static boolean BankDigitD1On;
    
    /**BankDigitD2 button/light variables of BankDigits object */ 
    public JButton BankDigitD2;
    private BufferedImage BankDigitD2OnImg;
    private static boolean BankDigitD2On;
    
    /**BankDigitD3 button/light variables of BankDigits object */ 
    public JButton BankDigitD3;
    private BufferedImage BankDigitD3OnImg;
    private static boolean BankDigitD3On;
    
    /**BankDigitD4 button/light variables of BankDigits object */ 
    public JButton BankDigitD4;
    private BufferedImage BankDigitD4OnImg;
    private static boolean BankDigitD4On;
    
    /**BankDigitD5 button/light variables of BankDigits object */ 
    public JButton BankDigitD5;
    private BufferedImage BankDigitD5OnImg;
    private static boolean BankDigitD5On;
    
    /**BankDigitD6 button/light variables of BankDigits object */ 
    public JButton BankDigitD6;
    private BufferedImage BankDigitD6OnImg;
    private static boolean BankDigitD6On;
        
    /**BankDigitD7 button/light variables of BankDigits object */ 
    public JButton BankDigitD7;
    private BufferedImage BankDigitD7OnImg;
    private static boolean BankDigitD7On;
    
    /**BankDigitD8 button/light variables of BankDigits object */ 
    public JButton BankDigitD8;
    private BufferedImage BankDigitD8OnImg;
    private static boolean BankDigitD8On;
    
    
    /**BankDigitD9 button/light variables of BankDigits object */ 
    public JButton BankDigitD9;
    private BufferedImage BankDigitD9OnImg;
    private static boolean BankDigitD9On;
        
    
    /**POUND & DECIMAL BANK DIGIT*/
    
     /**BankDigitPound button/light variables of BankDigits object */ 
    public JButton BankDigitPound;
    private final int BankDigitPoundLgtX = 215, BankDigitPoundLgtY = 376;
    private BufferedImage BankDigitPoundOnImg;
    private static boolean BankDigitPoundOn;
        
    /**BankDigitDecimal button/light variables of BankDigits object */ 
    public JButton BankDigitDecimal;
    private final int BankDigitDecimalLgtX = 256, BankDigitDecimalLgtY = 393;
    private BufferedImage BankDigitDecimalOnImg;
    private static boolean BankDigitDecimalOn;
    
    /**allbanks List variable of BankDigits object */
    public List<JButton> allbanks;
    
    /**Bankz JPanel variable of BankDigits object */ 
    public JPanel Bankz;
    
    
    
    /**Constructor*/
    
    /**
     * BankDigits Constructor
     * 
     * @param bnk
     */
    public BankDigits(){//int bnk){
        allbanks = new ArrayList<>();
        init();
        //setBank(bnk);
        setBank(0);
    }
    
    
    /**Public Protocol*/ 
    
    
    /**
     * init()
     * 
     * Initiates all the BankDigits light images
     * and fires the drawBankDigits method
     */
    private void init(){
        
            BankDigitA0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            BankDigitA1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            BankDigitA2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            BankDigitA3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            BankDigitA4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            BankDigitA5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            BankDigitA6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            BankDigitA7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            BankDigitA8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            BankDigitA9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
            
            /**SECOND BANK DIGIT*/
            
            BankDigitB0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            BankDigitB1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            BankDigitB2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            BankDigitB3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            BankDigitB4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            BankDigitB5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            BankDigitB6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            BankDigitB7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            BankDigitB8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            BankDigitB9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
            
            /**THIRD BANK DIGIT*/
            
            
            BankDigitC0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            BankDigitC1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            BankDigitC2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            BankDigitC3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            BankDigitC4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            BankDigitC5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            BankDigitC6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            BankDigitC7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            BankDigitC8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            BankDigitC9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
            
            /**FOURTH BANK DIGIT*/
            
            BankDigitD0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            BankDigitD1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            BankDigitD2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            BankDigitD3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            BankDigitD4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            BankDigitD5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            BankDigitD6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            BankDigitD7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            BankDigitD8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            BankDigitD9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
            
            /**POUND & DECIMAL BANK DIGIT*/
            
            BankDigitPoundOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-POUNDSYM").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-POUNDSYM.png"));
            
            BankDigitDecimalOnImg = new Texture("/BankDigits/fruit-machine-DIGIT-DECIMALSYM").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-DECIMALSYM.png"));
            
        drawBankDigits();
         
        Bankz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            Bankz.setSize(1280, 720);
            Bankz.setOpaque(false);
            Bankz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        }};
    }
    
    
    /**
     * drawBankDigits()
     * 
     * Draws all the BankDigit images/JButtons
     */
    private void drawBankDigits() {
        
        BankDigitA0 = new JButton("BankDigitA0");
        allbanks.add(BankDigitA0);

        BankDigitA1 = new JButton("BankDigitA1");
        allbanks.add(BankDigitA1);

        BankDigitA2 = new JButton("BankDigitA2");
        allbanks.add(BankDigitA2);

        BankDigitA3 = new JButton("BankDigitA3");
        allbanks.add(BankDigitA3);
        
        BankDigitA4 = new JButton("BankDigitA4");
        allbanks.add(BankDigitA4);
        
        BankDigitA5 = new JButton("BankDigitA5");
        allbanks.add(BankDigitA5);
        
        BankDigitA6 = new JButton("BankDigitA6");
        allbanks.add(BankDigitA6);
        
        BankDigitA7 = new JButton("BankDigitA7");
        allbanks.add(BankDigitA7);
        
        BankDigitA8 = new JButton("BankDigitA8");
        allbanks.add(BankDigitA8);
        
        BankDigitA9 = new JButton("BankDigitA9");
        allbanks.add(BankDigitA9);
        
        
        
        /**SECOND BANK DIGIT*/
        
        BankDigitB0 = new JButton("BankDigitB0");
        allbanks.add(BankDigitB0);

        BankDigitB1 = new JButton("BankDigitB1");
        allbanks.add(BankDigitB1);

        BankDigitB2 = new JButton("BankDigitB2");
        allbanks.add(BankDigitB2);

        BankDigitB3 = new JButton("BankDigitB3");
        allbanks.add(BankDigitB3);
        
        BankDigitB4 = new JButton("BankDigitB4");
        allbanks.add(BankDigitB4);
        
        BankDigitB5 = new JButton("BankDigitB5");
        allbanks.add(BankDigitB5);
        
        BankDigitB6 = new JButton("BankDigitB6");
        allbanks.add(BankDigitB6);
        
        BankDigitB7 = new JButton("BankDigitB7");
        allbanks.add(BankDigitB7);
        
        BankDigitB8 = new JButton("BankDigitB8");
        allbanks.add(BankDigitB8);
        
        BankDigitB9 = new JButton("BankDigitB9");
        allbanks.add(BankDigitB9);
        
        
        /**THIRD BANK DIGIT*/
        
        BankDigitC0 = new JButton("BankDigitC0");
        allbanks.add(BankDigitC0);

        BankDigitC1 = new JButton("BankDigitC1");
        allbanks.add(BankDigitC1);

        BankDigitC2 = new JButton("BankDigitC2");
        allbanks.add(BankDigitC2);

        BankDigitC3 = new JButton("BankDigitC3");
        allbanks.add(BankDigitC3);
        
        BankDigitC4 = new JButton("BankDigitC4");
        allbanks.add(BankDigitC4);
        
        BankDigitC5 = new JButton("BankDigitC5");
        allbanks.add(BankDigitC5);
        
        BankDigitC6 = new JButton("BankDigitC6");
        allbanks.add(BankDigitC6);
        
        BankDigitC7 = new JButton("BankDigitC7");
        allbanks.add(BankDigitC7);
        
        BankDigitC8 = new JButton("BankDigitC8");
        allbanks.add(BankDigitC8);
        
        BankDigitC9 = new JButton("BankDigitC9");
        allbanks.add(BankDigitC9);
        
        
        /**FOURTH BANK DIGIT*/
        
        BankDigitD0 = new JButton("BankDigitD0");
        allbanks.add(BankDigitD0);

        BankDigitD1 = new JButton("BankDigitD1");
        allbanks.add(BankDigitD1);

        BankDigitD2 = new JButton("BankDigitD2");
        allbanks.add(BankDigitD2);

        BankDigitD3 = new JButton("BankDigitD3");
        allbanks.add(BankDigitD3);
        
        BankDigitD4 = new JButton("BankDigitD4");
        allbanks.add(BankDigitD4);
        
        BankDigitD5 = new JButton("BankDigitD5");
        allbanks.add(BankDigitD5);
        
        BankDigitD6 = new JButton("BankDigitD6");
        allbanks.add(BankDigitD6);
        
        BankDigitD7 = new JButton("BankDigitD7");
        allbanks.add(BankDigitD7);
        
        BankDigitD8 = new JButton("BankDigitD8");
        allbanks.add(BankDigitD8);
        
        BankDigitD9 = new JButton("BankDigitD9");
        allbanks.add(BankDigitD9);
        
        
        
        /**POUND & DECIMAL BANK DIGIT*/
        
        BankDigitPound = new JButton("BankDigitPound");
        allbanks.add(BankDigitPound);
        
        BankDigitDecimal = new JButton("BankDigitDecimal");
        allbanks.add(BankDigitDecimal);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * Renders all the BankDigit images/JButtons
     * @param g
     */
    public void render(Graphics2D g){
        
        if (BankDigitA0On){
            g.drawImage(BankDigitA0OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA1On){
            g.drawImage(BankDigitA1OnImg, BankDigitALgtX+4, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA2On){
            g.drawImage(BankDigitA2OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA3On){
            g.drawImage(BankDigitA3OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        } 

        if (BankDigitA4On){
            g.drawImage(BankDigitA4OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA5On){
            g.drawImage(BankDigitA5OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA6On){
            g.drawImage(BankDigitA6OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA7On){
            g.drawImage(BankDigitA7OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA8On){
            g.drawImage(BankDigitA8OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitA9On){
            g.drawImage(BankDigitA9OnImg, BankDigitALgtX, BankDigitALgtY, BankDigitWidth, BankDigitHeight, null);
        }


        /**SECOND BANK DIGIT*/

        if (BankDigitB0On){
            g.drawImage(BankDigitB0OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB1On){
            g.drawImage(BankDigitB1OnImg, BankDigitBLgtX+4, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB2On){
            g.drawImage(BankDigitB2OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB3On){
            g.drawImage(BankDigitB3OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        } 

        if (BankDigitB4On){
            g.drawImage(BankDigitB4OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB5On){
            g.drawImage(BankDigitB5OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB6On){
            g.drawImage(BankDigitB6OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB7On){
            g.drawImage(BankDigitB7OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB8On){
            g.drawImage(BankDigitB8OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitB9On){
            g.drawImage(BankDigitB9OnImg, BankDigitBLgtX, BankDigitBLgtY, BankDigitWidth, BankDigitHeight, null);
        }



        /**THIRD BANK DIGIT*/

        if (BankDigitC0On){
            g.drawImage(BankDigitC0OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC1On){
            g.drawImage(BankDigitC1OnImg, BankDigitCLgtX+4, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC2On){
            g.drawImage(BankDigitC2OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC3On){
            g.drawImage(BankDigitC3OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        } 

        if (BankDigitC4On){
            g.drawImage(BankDigitC4OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC5On){
            g.drawImage(BankDigitC5OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC6On){
            g.drawImage(BankDigitC6OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC7On){
            g.drawImage(BankDigitC7OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC8On){
            g.drawImage(BankDigitC8OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitC9On){
            g.drawImage(BankDigitC9OnImg, BankDigitCLgtX, BankDigitCLgtY, BankDigitWidth, BankDigitHeight, null);
        }


        /**FOURTH BANK DIGIT*/

        if (BankDigitD0On){
            g.drawImage(BankDigitD0OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD1On){
            g.drawImage(BankDigitD1OnImg, BankDigitDLgtX+4, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD2On){
            g.drawImage(BankDigitD2OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD3On){
            g.drawImage(BankDigitD3OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        } 

        if (BankDigitD4On){
            g.drawImage(BankDigitD4OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD5On){
            g.drawImage(BankDigitD5OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD6On){
            g.drawImage(BankDigitD6OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD7On){
            g.drawImage(BankDigitD7OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD8On){
            g.drawImage(BankDigitD8OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitD9On){
            g.drawImage(BankDigitD9OnImg, BankDigitDLgtX, BankDigitDLgtY, BankDigitWidth, BankDigitHeight, null);
        }



        /**POUND & DECIMAL BANK DIGIT*/

        if (BankDigitPoundOn){
            g.drawImage(BankDigitPoundOnImg, BankDigitPoundLgtX, BankDigitPoundLgtY, BankDigitWidth, BankDigitHeight, null);
        }

        if (BankDigitDecimalOn){
            g.drawImage(BankDigitDecimalOnImg, BankDigitDecimalLgtX, BankDigitDecimalLgtY, BankDigitWidth/4, BankDigitHeight/4, null);
        }                        
            
        g.dispose();
    }
    
    
    /**
     * getAllBankDigits()
     * 
     * @return allbanks - returns allbanks images/JButtons
     */
    public List<JButton> getAllBankDigits() {
        return allbanks;
    }

    
    /**
     * getOn()
     * 
     * @param name
     * @return result - returns result of bankDigits images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "BankDigitA0":
                result = BankDigitA0On;
                break;
            case "BankDigitA1":
                result = BankDigitA1On;
                break;
            case "BankDigitA2":
                result = BankDigitA2On;
                break;
            case "BankDigitA3":
                result = BankDigitA3On;
                break;
            case "BankDigitA4":
                result = BankDigitA4On;
                break;
            case "BankDigitA5":
                result = BankDigitA5On;
                break;
            case "BankDigitA6":
                result = BankDigitA6On;
                break;
            case "BankDigitA7":
                result = BankDigitA7On;
                break;
            case "BankDigitA8":
                result = BankDigitA8On;
                break;
            case "BankDigitA9":
                result = BankDigitA9On;
                break;
            case "BankDigitB0":
                result = BankDigitB0On;
                break;
            case "BankDigitB1":
                result = BankDigitB1On;
                break;
            case "BankDigitB2":
                result = BankDigitB2On;
                break;
            case "BankDigitB3":
                result = BankDigitB3On;
                break;
            case "BankDigitB4":
                result = BankDigitB4On;
                break;
            case "BankDigitB5":
                result = BankDigitB5On;
                break;
            case "BankDigitB6":
                result = BankDigitB6On;
                break;
            case "BankDigitB7":
                result = BankDigitB7On;
                break;
            case "BankDigitB8":
                result = BankDigitB8On;
                break;
            case "BankDigitB9":
                result = BankDigitB9On;
                break;
            case "BankDigitC0":
                result = BankDigitC0On;
                break;
            case "BankDigitC1":
                result = BankDigitC1On;
                break;
            case "BankDigitC2":
                result = BankDigitC2On;
                break;
            case "BankDigitC3":
                result = BankDigitC3On;
                break;
            case "BankDigitC4":
                result = BankDigitC4On;
                break;
            case "BankDigitC5":
                result = BankDigitC5On;
                break;
            case "BankDigitC6":
                result = BankDigitC6On;
                break;
            case "BankDigitC7":
                result = BankDigitC7On;
                break;
            case "BankDigitC8":
                result = BankDigitC8On;
                break;
            case "BankDigitC9":
                result = BankDigitC9On;
                break;
            case "BankDigitD0":
                result = BankDigitD0On;
                break;
            case "BankDigitD1":
                result = BankDigitD1On;
                break;
            case "BankDigitD2":
                result = BankDigitD2On;
                break;
            case "BankDigitD3":
                result = BankDigitD3On;
                break;
            case "BankDigitD4":
                result = BankDigitD4On;
                break;
            case "BankDigitD5":
                result = BankDigitD5On;
                break;
            case "BankDigitD6":
                result = BankDigitD6On;
                break;
            case "BankDigitD7":
                result = BankDigitD7On;
                break;
            case "BankDigitD8":
                result = BankDigitD8On;
                break;
            case "BankDigitD9":
                result = BankDigitD9On;
                break;
            case "BankDigitPound":
                result = BankDigitPoundOn;
                break;
            case "BankDigitDecimal":
                result = BankDigitDecimalOn;
                break;
        }
        
//        if(name.equals("BankDigitA0")){
//             result = BankDigitA0On;
//        }
//        if(name.equals("BankDigitA1")){
//            result = BankDigitA1On;
//        }
//        if(name.equals("BankDigitA2")){
//            result = BankDigitA2On;
//        }
//        if(name.equals("BankDigitA3")){
//            result = BankDigitA3On;
//        }
//        if(name.equals("BankDigitA4")){
//            result = BankDigitA4On;
//        }
//        if(name.equals("BankDigitA5")){
//            result = BankDigitA5On;
//        }
//        if(name.equals("BankDigitA6")){
//            result = BankDigitA6On;
//        }
//        if(name.equals("BankDigitA7")){
//            result = BankDigitA7On;
//        }
//        if(name.equals("BankDigitA8")){
//            result = BankDigitA8On;
//        }
//        if(name.equals("BankDigitA9")){
//            result = BankDigitA9On;
//        }
//        
//        /**2nd CENTRE-LEFT BANK DIGIT*/
//        
//        if(name.equals("BankDigitB0")){
//            result = BankDigitB0On;
//        }
//        if(name.equals("BankDigitB1")){
//            result = BankDigitB1On;
//        }
//        if(name.equals("BankDigitB2")){
//            result = BankDigitB2On;
//        }
//        if(name.equals("BankDigitB3")){
//            result = BankDigitB3On;
//        }
//        if(name.equals("BankDigitB4")){
//            result = BankDigitB4On;
//        }
//        if(name.equals("BankDigitB5")){
//            result = BankDigitB5On;
//        }
//        if(name.equals("BankDigitB6")){
//            result = BankDigitB6On;
//        }
//        if(name.equals("BankDigitB7")){
//            result = BankDigitB7On;
//        }
//        if(name.equals("BankDigitB8")){
//            result = BankDigitB8On;
//        }
//        if(name.equals("BankDigitB9")){
//            result = BankDigitB9On;
//        }

        /**3rd CENTRE-RIGHT BANK DIGIT*/
        
//        if(name.equals("BankDigitC0")){
//            result = BankDigitC0On;
//        }
//        if(name.equals("BankDigitC1")){
//            result = BankDigitC1On;
//        }
//        if(name.equals("BankDigitC2")){
//            result = BankDigitC2On;
//        }
//        if(name.equals("BankDigitC3")){
//            result = BankDigitC3On;
//        }
//        if(name.equals("BankDigitC4")){
//            result = BankDigitC4On;
//        }
//        if(name.equals("BankDigitC5")){
//            result = BankDigitC5On;
//        }
//        if(name.equals("BankDigitC6")){
//            result = BankDigitC6On;
//        }
//        if(name.equals("BankDigitC7")){
//            result = BankDigitC7On;
//        }
//        if(name.equals("BankDigitC8")){
//            result = BankDigitC8On;
//        }
//        if(name.equals("BankDigitC9")){
//            result = BankDigitC9On;
//        }
//        
//        /**4th RIGHT BANK DIGIT*/
//        
//        if(name.equals("BankDigitD0")){
//            result = BankDigitD0On;
//        }
//        if(name.equals("BankDigitD1")){
//            result = BankDigitD1On;
//        }
//        if(name.equals("BankDigitD2")){
//            result = BankDigitD2On;
//        }
//        if(name.equals("BankDigitD3")){
//            result = BankDigitD3On;
//        }
//        if(name.equals("BankDigitD4")){
//            result = BankDigitD4On;
//        }
//        if(name.equals("BankDigitD5")){
//            result = BankDigitD5On;
//        }
//        if(name.equals("BankDigitD6")){
//            result = BankDigitD6On;
//        }
//        if(name.equals("BankDigitD7")){
//            result = BankDigitD7On;
//        }
//        if(name.equals("BankDigitD8")){
//            result = BankDigitD8On;
//        }
//        if(name.equals("BankDigitD9")){
//            result = BankDigitD9On;
//        }
        
        
        /**POUND & DECIMAL BANK DIGIT*/
        
//        if(name.equals("BankDigitPound")){
//            result = BankDigitPoundOn;
//        }
//        if(name.equals("BankDigitDecimal")){
//            result = BankDigitDecimalOn;
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
            case "BankDigitA0":
                BankDigitA0On = result;
                break;
            case "BankDigitA1":
                BankDigitA1On = result;
                break;
            case "BankDigitA2":
                BankDigitA2On = result;
                break;
            case "BankDigitA3":
                BankDigitA3On = result;
                break;
            case "BankDigitA4":
                BankDigitA4On = result;
                break;
            case "BankDigitA5":
                BankDigitA5On = result;
                break;
            case "BankDigitA6":
                BankDigitA6On = result;
                break;
            case "BankDigitA7":
                BankDigitA7On = result;
                break;
            case "BankDigitA8":
                BankDigitA8On = result;
                break;
            case "BankDigitA9":
                BankDigitA9On = result;
                break;
            case "BankDigitB0":
                BankDigitB0On = result;
                break;
            case "BankDigitB1":
                BankDigitB1On = result;
                break;
            case "BankDigitB2":
                BankDigitB2On = result;
                break;
            case "BankDigitB3":
                BankDigitB3On = result;
                break;
            case "BankDigitB4":
                BankDigitB4On = result;
                break;
            case "BankDigitB5":
                BankDigitB5On = result;
                break;
            case "BankDigitB6":
                BankDigitB6On = result;
                break;
            case "BankDigitB7":
                BankDigitB7On = result;
                break;
            case "BankDigitB8":
                BankDigitB8On = result;
                break;
            case "BankDigitB9":
                BankDigitB9On = result;
                break;
            case "BankDigitC0":
                BankDigitC0On = result;
                break;
            case "BankDigitC1":
                BankDigitC1On = result;
                break;
            case "BankDigitC2":
                BankDigitC2On = result;
                break;
            case "BankDigitC3":
                BankDigitC3On = result;
                break;
            case "BankDigitC4":
                BankDigitC4On = result;
                break;
            case "BankDigitC5":
                BankDigitC5On = result;
                break;
            case "BankDigitC6":
                BankDigitC6On = result;
                break;
            case "BankDigitC7":
                BankDigitC7On = result;
                break;
            case "BankDigitC8":
                BankDigitC8On = result;
                break;
            case "BankDigitC9":
                BankDigitC9On = result;
                break;
            case "BankDigitD0":
                BankDigitD0On = result;
                break;
            case "BankDigitD1":
                BankDigitD1On = result;
                break;
            case "BankDigitD2":
                BankDigitD2On = result;
                break;
            case "BankDigitD3":
                BankDigitD3On = result;
                break;
            case "BankDigitD4":
                BankDigitD4On = result;
                break;
            case "BankDigitD5":
                BankDigitD5On = result;
                break;
            case "BankDigitD6":
                BankDigitD6On = result;
                break;
            case "BankDigitD7":
                BankDigitD7On = result;
                break;
            case "BankDigitD8":
                BankDigitD8On = result;
                break;
            case "BankDigitD9":
                BankDigitD9On = result;
                break;
            case "BankDigitPound":
                BankDigitPoundOn = result;
                break;
            case "BankDigitDecimal":
                BankDigitDecimalOn = result;
                break;
        }
        
        
//        if(name.equals("BankDigitA0")){
//            BankDigitA0On = result;
//        }
//        if(name.equals("BankDigitA1")){
//            BankDigitA1On = result;
//        }
//        if(name.equals("BankDigitA2")){
//            BankDigitA2On = result;
//        }
//        if(name.equals("BankDigitA3")){
//            BankDigitA3On = result;
//        }
//        if(name.equals("BankDigitA4")){
//            BankDigitA4On = result;
//        }
//        if(name.equals("BankDigitA5")){
//            BankDigitA5On = result;
//        }
//        if(name.equals("BankDigitA6")){
//            BankDigitA6On = result;
//        }
//        if(name.equals("BankDigitA7")){
//            BankDigitA7On = result;
//        }
//        if(name.equals("BankDigitA8")){
//            BankDigitA8On = result;
//        }
//        if(name.equals("BankDigitA9")){
//            BankDigitA9On = result;
//        }
//        
//        /**2nd CENTRE-LEFT BANK DIGIT*/
//        
//        if(name.equals("BankDigitB0")){
//            BankDigitB0On = result;
//        }
//        if(name.equals("BankDigitB1")){
//            BankDigitB1On = result;
//        }
//        if(name.equals("BankDigitB2")){
//            BankDigitB2On = result;
//        }
//        if(name.equals("BankDigitB3")){
//            BankDigitB3On = result;
//        }
//        if(name.equals("BankDigitB4")){
//            BankDigitB4On = result;
//        }
//        if(name.equals("BankDigitB5")){
//            BankDigitB5On = result;
//        }
//        if(name.equals("BankDigitB6")){
//            BankDigitB6On = result;
//        }
//        if(name.equals("BankDigitB7")){
//            BankDigitB7On = result;
//        }
//        if(name.equals("BankDigitB8")){
//            BankDigitB8On = result;
//        }
//        if(name.equals("BankDigitB9")){
//            BankDigitB9On = result;
//        }
//
//        /**3rd CENTRE-RIGHT BANK DIGIT*/
//        
//        if(name.equals("BankDigitC0")){
//            BankDigitC0On = result;
//        }
//        if(name.equals("BankDigitC1")){
//            BankDigitC1On = result;
//        }
//        if(name.equals("BankDigitC2")){
//            BankDigitC2On = result;
//        }
//        if(name.equals("BankDigitC3")){
//            BankDigitC3On = result;
//        }
//        if(name.equals("BankDigitC4")){
//            BankDigitC4On = result;
//        }
//        if(name.equals("BankDigitC5")){
//            BankDigitC5On = result;
//        }
//        if(name.equals("BankDigitC6")){
//            BankDigitC6On = result;
//        }
//        if(name.equals("BankDigitC7")){
//            BankDigitC7On = result;
//        }
//        if(name.equals("BankDigitC8")){
//            BankDigitC8On = result;
//        }
//        if(name.equals("BankDigitC9")){
//            BankDigitC9On = result;
//        }
//        
//        /**4th RIGHT BANK DIGIT*/
//        
//        if(name.equals("BankDigitD0")){
//            BankDigitD0On = result;
//        }
//        if(name.equals("BankDigitD1")){
//            BankDigitD1On = result;
//        }
//        if(name.equals("BankDigitD2")){
//            BankDigitD2On = result;
//        }
//        if(name.equals("BankDigitD3")){
//            BankDigitD3On = result;
//        }
//        if(name.equals("BankDigitD4")){
//            BankDigitD4On = result;
//        }
//        if(name.equals("BankDigitD5")){
//            BankDigitD5On = result;
//        }
//        if(name.equals("BankDigitD6")){
//            BankDigitD6On = result;
//        }
//        if(name.equals("BankDigitD7")){
//            BankDigitD7On = result;
//        }
//        if(name.equals("BankDigitD8")){
//            BankDigitD8On = result;
//        }
//        if(name.equals("BankDigitD9")){
//            BankDigitD9On = result;
//        }
//        
//        
//        /**POUND & DECIMAL BANK DIGIT*/
//        
//        if(name.equals("BankDigitPound")){
//            BankDigitPoundOn = result;
//        }
//        if(name.equals("BankDigitDecimal")){
//            BankDigitDecimalOn = result;
//        }
        
    }
    
    
    /**
     * setBank()
     * 
     * @param bankBalance
     * 
     * sets bank to bankBalance
     */
    public void setBank(int bankBalance){
        clearBankDigits();
        setOn(allbanks.get(10).getText(), true);
        setOn(allbanks.get(20).getText(), true);
        setOn(allbanks.get(30).getText(), true);
        setOn(allbanks.get(40).getText(), true);
        setOn(allbanks.get(41).getText(), true);
        
        if(bankBalance < 0){
            bankBalance = 0;
        }
        if(bankBalance > 99){
            bankBalance = 99;
        }
        
            
            if(bankBalance == 0 || bankBalance == 10 || bankBalance == 20 || bankBalance == 30 || bankBalance == 40 || bankBalance == 50 || bankBalance == 60 || bankBalance == 70 || bankBalance == 80 || bankBalance == 90 || bankBalance == 100){
                BankDigitB0On = true;
            }
            if(bankBalance == 1 || bankBalance == 11 || bankBalance == 21 || bankBalance == 31 || bankBalance == 41 || bankBalance == 51 || bankBalance == 61 || bankBalance == 71 || bankBalance == 81 || bankBalance == 91){
                BankDigitB0On = false;
                BankDigitB1On = true;
            }
            if(bankBalance == 2 || bankBalance == 12 || bankBalance == 22 || bankBalance == 32 || bankBalance == 42 || bankBalance == 52 || bankBalance == 62 || bankBalance == 72 || bankBalance == 82 || bankBalance == 92){
                BankDigitB0On = false;
                BankDigitB2On = true;
            }
            if(bankBalance == 3 || bankBalance == 13 || bankBalance == 23 || bankBalance == 33 || bankBalance == 43 || bankBalance == 53 || bankBalance == 63 || bankBalance == 73 || bankBalance == 83 || bankBalance == 93){
                BankDigitB0On = false;
                BankDigitB3On = true;
            }
            if(bankBalance == 4 || bankBalance == 14 || bankBalance == 24 || bankBalance == 34 || bankBalance == 44 || bankBalance == 54 || bankBalance == 64 || bankBalance == 74 || bankBalance == 84 || bankBalance == 94){
                BankDigitB0On = false;
                BankDigitB4On = true;
            }
            if(bankBalance == 5 || bankBalance == 15 || bankBalance == 25 || bankBalance == 35 || bankBalance == 45 || bankBalance == 55 || bankBalance == 65 || bankBalance == 75 || bankBalance == 85 || bankBalance == 95){
                BankDigitB0On = false;
                BankDigitB5On = true;
            }
            if(bankBalance == 6 || bankBalance == 16 || bankBalance == 26 || bankBalance == 36 || bankBalance == 46 || bankBalance == 56 || bankBalance == 66 || bankBalance == 76 || bankBalance == 86 || bankBalance == 96){
                BankDigitB0On = false;
                BankDigitB6On = true;
            }
            if(bankBalance == 7 || bankBalance == 17 || bankBalance == 27 || bankBalance == 37 || bankBalance == 47 || bankBalance == 57 || bankBalance == 67 || bankBalance == 77 || bankBalance == 87 || bankBalance == 97){
                BankDigitB0On = false;
                BankDigitB7On = true;
            }
            if(bankBalance == 8 || bankBalance == 18 || bankBalance == 28 || bankBalance == 38 || bankBalance == 48 || bankBalance == 58 || bankBalance == 68 || bankBalance == 78 || bankBalance == 88 || bankBalance == 98){
                BankDigitB0On = false;
                BankDigitB8On = true;
            }
            if(bankBalance == 9 || bankBalance == 19 || bankBalance == 29 || bankBalance == 39 || bankBalance == 49 || bankBalance == 59 || bankBalance == 69 || bankBalance == 79 || bankBalance == 89 || bankBalance == 99){
                BankDigitB0On = false;
                BankDigitB9On = true;
            }
            
            if(bankBalance < 9 && bankBalance > 0){
                BankDigitB0On = false;
            }
            
            //Tens
            if(bankBalance > 9 && bankBalance < 20){
                BankDigitA1On = true;
            }
            if(bankBalance > 19 && bankBalance < 30){
                BankDigitA2On = true;
            }
            if(bankBalance > 29 && bankBalance < 40){
                BankDigitA3On = true;
            }
            if(bankBalance > 39 && bankBalance < 50){
                BankDigitA4On = true;
            }
            if(bankBalance > 49 && bankBalance < 60){
                BankDigitA5On = true;
            }
            if(bankBalance > 59 && bankBalance < 70){
                BankDigitA6On = true;
            }
            if(bankBalance > 69 && bankBalance < 80){
                BankDigitA7On = true;
            }
            if(bankBalance > 79 && bankBalance < 90){
                BankDigitA8On = true;
            }
            if(bankBalance > 89 && bankBalance < 100){
                BankDigitA9On = true;
            }
            
            System.out.println("BankDigits: Setting BankDigits to: "+bankBalance);
    }
    
    
    /**
     * clearBankDigits()
     * 
     * sets allbanks to off
     */
    public void clearBankDigits(){
        for(int i = 0; i < allbanks.size(); i++){
            setOn(allbanks.get(i).getText(), false);
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
        System.out.println("Turning All Bank Digits On");
        for(JButton bank : allbanks){//int i = 0; i < allbanks.size(); i++){
            setOn(bank.getText(), true);
        }
    }

    //@Override
    void off() {
        System.out.println("Turning All Bank Digits Off");
        clearBankDigits();
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void defaultDigits() {
        setOn(allbanks.get(10).getText(), true);
        setOn(allbanks.get(20).getText(), true);
        setOn(allbanks.get(30).getText(), true);
        setOn(allbanks.get(40).getText(), true);
        setOn(allbanks.get(41).getText(), true);
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
