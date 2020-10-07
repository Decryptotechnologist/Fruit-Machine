/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.digits;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.gamelogic.Machine;
import tangodown.fruit.machine.graphics.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author Ghomez
 */
public class CrackpotDigits {//extends Digits {

    /**Attributes*/
    
    /**CreditDigit width variable of CrackpotDigits object */
    public int CrackpotDigitWidth = 64;
    
    /**CreditDigit height variable of CrackpotDigits object */
    public int CrackpotDigitHeight = 64;
    
    /**CrackpotDigitBLgtX variables of CrackpotDigits object */ 
    private final int CrackpotDigitALgtX = 340;
    
    /**CrackpotDigitBLgtY variables of CrackpotDigits object */ 
    private final int CrackpotDigitALgtY = 135;
    
    /**CrackpotDigitA0 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA0;
    private BufferedImage CrackpotDigitA0OnImg;
    private static boolean CrackpotDigitA0On;
    
    /**CrackpotDigitA1 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA1;
    private BufferedImage CrackpotDigitA1OnImg;
    private static boolean CrackpotDigitA1On;
    
    /**CrackpotDigitA2 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA2;
    private BufferedImage CrackpotDigitA2OnImg;
    private static boolean CrackpotDigitA2On;
    
    /**CrackpotDigitA3 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA3;
    private BufferedImage CrackpotDigitA3OnImg;
    private static boolean CrackpotDigitA3On;
    
    /**CrackpotDigitA4 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA4;
    private BufferedImage CrackpotDigitA4OnImg;
    private static boolean CrackpotDigitA4On;
    
    /**CrackpotDigitA5 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA5;
    private BufferedImage CrackpotDigitA5OnImg;
    private static boolean CrackpotDigitA5On;
    
    /**CreditDigit6 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA6;
    private BufferedImage CrackpotDigitA6OnImg;
    private static boolean CrackpotDigitA6On;
    
    /**CrackpotDigitA7 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA7;
    private BufferedImage CrackpotDigitA7OnImg;
    private static boolean CrackpotDigitA7On;
    
    /**CrackpotDigitA8 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA8;
    private BufferedImage CrackpotDigitA8OnImg;
    private static boolean CrackpotDigitA8On;
    
    /**CrackpotDigitA9 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitA9;
    private BufferedImage CrackpotDigitA9OnImg;
    private static boolean CrackpotDigitA9On;
    
    
    
    /**RIGHT CRACKPOT DIGIT*/
    
    /**CrackpotDigitBLgtX variables of CrackpotDigits object */ 
    private final int CrackpotDigitBLgtX = 355;
    
    /**CrackpotDigitBLgtY variables of CrackpotDigits object */ 
    private final int CrackpotDigitBLgtY = 135;
    
    /**CrackpotDigitB0 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB0;
    private BufferedImage CrackpotDigitB0OnImg;
    private static boolean CrackpotDigitB0On;
    
    /**CrackpotDigitB1 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB1;
    private BufferedImage CrackpotDigitB1OnImg;
    private static boolean CrackpotDigitB1On;
    
    /**CrackpotDigitB2 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB2;
    private BufferedImage CrackpotDigitB2OnImg;
    private static boolean CrackpotDigitB2On;
    
    /**CrackpotDigitB3 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB3;
    private BufferedImage CrackpotDigitB3OnImg;
    private static boolean CrackpotDigitB3On;
    
    /**CrackpotDigitB4 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB4;
    private BufferedImage CrackpotDigitB4OnImg;
    private static boolean CrackpotDigitB4On;
    
    /**CrackpotDigitB5 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB5;
    private BufferedImage CrackpotDigitB5OnImg;
    private static boolean CrackpotDigitB5On;
    
    /**CrackpotDigitB6 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB6;
    private BufferedImage CrackpotDigitB6OnImg;
    private static boolean CrackpotDigitB6On;
    
    /**CrackpotDigitB7 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB7;
    private BufferedImage CrackpotDigitB7OnImg;
    private static boolean CrackpotDigitB7On;
    
    /**CrackpotDigitB8 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB8;
    private BufferedImage CrackpotDigitB8OnImg;
    private static boolean CrackpotDigitB8On;
    
    /**CrackpotDigitB9 button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitB9;
    private BufferedImage CrackpotDigitB9OnImg;
    private static boolean CrackpotDigitB9On;
    
    /**CrackpotDigitBG button/light variables of CrackpotDigits object */ 
    public JButton CrackpotDigitBG;
    private final int CrackpotDigitBGLgtX = 340, CrackpotDigitBGLgtY = 135;
    private BufferedImage CrackpotDigitBGImg;
    
    /**allcrackpots List variable of CrackpotDigits object */
    public List<JButton> allcrackpots;
    
    /**Crackpotz JPanel variable of CrackpotDigits object */
    public JPanel Crackpotz;
    //private final Machine machine;

    /**crackpotBalance variable of Nudges object */
    //private int crackpotBalance;
    
    
    /**Constructor*/
    
    /**
     * CrackpotDigits Constructor
     * 
     * @param crack
     */
    public CrackpotDigits(){//int crack, Machine machine){
        allcrackpots = new ArrayList<>();
        init();
        
        //this.machine = machine;
        //setCrackpot(crack);
        setCrackpot(0);
    }
    
    
    /**Public Protocol*/ 
    
    
    /**
     * init()
     * 
     * Initiates all the CrackpotDigit light images
     * and fires the drawCrackpotDigits method
     */
    private void init(){
        
            CrackpotDigitA0OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ZERO.png"));
            
            CrackpotDigitA1OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ONE.png"));
            
            CrackpotDigitA2OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-THREE.png"));
            
            CrackpotDigitA3OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-THREE.png"));
            
            CrackpotDigitA4OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FOUR.png"));
            
            CrackpotDigitA5OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FIVE.png"));
            
            CrackpotDigitA6OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SIX.png"));
            
            CrackpotDigitA7OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SEVEN.png"));
            
            CrackpotDigitA8OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-EIGHT.png"));
            
            CrackpotDigitA9OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-NINE.png"));
            
            
            /**RIGHT CRACKPOT DIGIT*/
            
            CrackpotDigitB0OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ZERO.png"));
            
            CrackpotDigitB1OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-ONE.png"));
            
            CrackpotDigitB2OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-TWO.png"));
            
            CrackpotDigitB3OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-THREE.png"));
            
            CrackpotDigitB4OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FOUR.png"));
            
            CrackpotDigitB5OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-FIVE.png"));
            
            CrackpotDigitB6OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SIX.png"));
            
            CrackpotDigitB7OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-SEVEN.png"));
            
            CrackpotDigitB8OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-EIGHT.png"));
            
            CrackpotDigitB9OnImg = new Texture("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/CrackpotDigits/fruit-machine-CRACKPOT-DIGIT-NINE.png"));

            
            CrackpotDigitBGImg = new Texture("/Background/fruit-machine-BACKGROUND-ROULETTE-CRACKPOT").getImage();//ImageIO.read(getClass().getResource("/Background/fruit-machine-BACKGROUND-ROULETTE-CRACKPOT.png"));
            
         drawCrackpotDigits();
         
         Crackpotz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            Crackpotz.setSize(1280, 720);
            Crackpotz.setOpaque(false);
            Crackpotz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        }};
         
    }
    
    
    /**
     * drawCrackpotDigits()
     * 
     * Draws all the CrackpotDigit images/JButtons
     */
    private void drawCrackpotDigits() {
        
        CrackpotDigitA0 = new JButton("CrackpotDigitA0");
        allcrackpots.add(CrackpotDigitA0);

        CrackpotDigitA1 = new JButton("CrackpotDigitA1");
        allcrackpots.add(CrackpotDigitA1);

        CrackpotDigitA2 = new JButton("CrackpotDigitA2");
        allcrackpots.add(CrackpotDigitA2);

        CrackpotDigitA3 = new JButton("CrackpotDigitA3");
        allcrackpots.add(CrackpotDigitA3);
        
        CrackpotDigitA4 = new JButton("CrackpotDigitA4");
        allcrackpots.add(CrackpotDigitA4);
        
        CrackpotDigitA5 = new JButton("CrackpotDigitA5");
        allcrackpots.add(CrackpotDigitA5);
        
        CrackpotDigitA6 = new JButton("CrackpotDigitA6");
        allcrackpots.add(CrackpotDigitA6);
        
        CrackpotDigitA7 = new JButton("CrackpotDigitA7");
        allcrackpots.add(CrackpotDigitA7);
        
        CrackpotDigitA8 = new JButton("CrackpotDigitA8");
        allcrackpots.add(CrackpotDigitA8);
        
        CrackpotDigitA9 = new JButton("CrackpotDigitA9");
        allcrackpots.add(CrackpotDigitA9);
        
        
        /**RIGHT CRACKPOT DIGIT*/
        
        CrackpotDigitB0 = new JButton("CrackpotDigitB0");
        allcrackpots.add(CrackpotDigitB0);

        CrackpotDigitB1 = new JButton("CrackpotDigitB1");
        allcrackpots.add(CrackpotDigitB1);

        CrackpotDigitB2 = new JButton("CrackpotDigitB2");
        allcrackpots.add(CrackpotDigitB2);

        CrackpotDigitB3 = new JButton("CrackpotDigitB3");
        allcrackpots.add(CrackpotDigitB3);
        
        CrackpotDigitB4 = new JButton("CrackpotDigitB4");
        allcrackpots.add(CrackpotDigitB4);
        
        CrackpotDigitB5 = new JButton("CrackpotDigitB5");
        allcrackpots.add(CrackpotDigitB5);
        
        CrackpotDigitB6 = new JButton("CrackpotDigitB6");
        allcrackpots.add(CrackpotDigitB6);
        
        CrackpotDigitB7 = new JButton("CrackpotDigitB7");
        allcrackpots.add(CrackpotDigitB7);
        
        CrackpotDigitB8 = new JButton("CrackpotDigitB8");
        allcrackpots.add(CrackpotDigitB8);
        
        CrackpotDigitB9 = new JButton("CrackpotDigitB9");
        allcrackpots.add(CrackpotDigitB9);
        
        CrackpotDigitBG = new JButton("CrackpotDigitBG");
        //allcrackpots.add(CrackpotDigitBG);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     * 
     * repaints all the CrackpotDigit images/JButtons
     */
    public void render(Graphics2D g){
        
        g.drawImage(CrackpotDigitBGImg, CrackpotDigitBGLgtX, CrackpotDigitBGLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);

        if (CrackpotDigitA0On){
            g.drawImage(CrackpotDigitA0OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA1On){
            g.drawImage(CrackpotDigitA1OnImg, CrackpotDigitALgtX+4, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA2On){
            g.drawImage(CrackpotDigitA2OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA3On){
            g.drawImage(CrackpotDigitA3OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        } 

        if (CrackpotDigitA4On){
            g.drawImage(CrackpotDigitA4OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA5On){
            g.drawImage(CrackpotDigitA5OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA6On){
            g.drawImage(CrackpotDigitA6OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA7On){
            g.drawImage(CrackpotDigitA7OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA8On){
            g.drawImage(CrackpotDigitA8OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitA9On){
            g.drawImage(CrackpotDigitA9OnImg, CrackpotDigitALgtX, CrackpotDigitALgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }


        /**RIGHT CRACKPOT DIGIT*/

        if (CrackpotDigitB0On){
            g.drawImage(CrackpotDigitB0OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB1On){
            g.drawImage(CrackpotDigitB1OnImg, CrackpotDigitBLgtX+4, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB2On){
            g.drawImage(CrackpotDigitB2OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB3On){
            g.drawImage(CrackpotDigitB3OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        } 

        if (CrackpotDigitB4On){
            g.drawImage(CrackpotDigitB4OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB5On){
            g.drawImage(CrackpotDigitB5OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB6On){
            g.drawImage(CrackpotDigitB6OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB7On){
            g.drawImage(CrackpotDigitB7OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB8On){
            g.drawImage(CrackpotDigitB8OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }

        if (CrackpotDigitB9On){
            g.drawImage(CrackpotDigitB9OnImg, CrackpotDigitBLgtX, CrackpotDigitBLgtY, CrackpotDigitWidth, CrackpotDigitHeight, null);
        }
            
            
        g.dispose();
    }
    
    
    /**
     * getAllCrackpotDigits()
     * 
     * @return allcrackpots - returns allcrackpots images/JButtons
     */
    public List<JButton> getAllCrackpotDigits() {
        return allcrackpots;
    }

    
    /**
     * getOn()
     * 
     * @param name
     * @return result - returns result of crackpotDigits images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "CrackpotDigitA0":
                result = CrackpotDigitA0On;
                break;
            case "CrackpotDigitA1":
                result = CrackpotDigitA1On;
                break;
            case "CrackpotDigitA2":
                result = CrackpotDigitA2On;
                break;
            case "CrackpotDigitA3":
                result = CrackpotDigitA3On;
                break;
            case "CrackpotDigitA4":
                result = CrackpotDigitA4On;
                break;
            case "CrackpotDigitA5":
                result = CrackpotDigitA5On;
                break;
            case "CrackpotDigitA6":
                result = CrackpotDigitA6On;
                break;
            case "CrackpotDigitA7":
                result = CrackpotDigitA7On;
                break;
            case "CrackpotDigitA8":
                result = CrackpotDigitA8On;
                break;
            case "CrackpotDigitA9":
                result = CrackpotDigitA9On;
                break;
            case "CrackpotDigitB0":
                result = CrackpotDigitB0On;
                break;
            case "CrackpotDigitB1":
                result = CrackpotDigitB1On;
                break;
            case "CrackpotDigitB2":
                result = CrackpotDigitB2On;
                break;
            case "CrackpotDigitB3":
                result = CrackpotDigitB3On;
                break;
            case "CrackpotDigitB4":
                result = CrackpotDigitB4On;
                break;
            case "CrackpotDigitB5":
                result = CrackpotDigitB5On;
                break;
            case "CrackpotDigitB6":
                result = CrackpotDigitB6On;
                break;
            case "CrackpotDigitB7":
                result = CrackpotDigitB7On;
                break;
            case "CrackpotDigitB8":
                result = CrackpotDigitB8On;
                break;
            case "CrackpotDigitB9":
                result = CrackpotDigitB9On;
                break;
        }
        
//        if(name.equals("CrackpotDigitA0")){
//            result = CrackpotDigitA0On;
//        }
//        if(name.equals("CrackpotDigitA1")){
//            result = CrackpotDigitA1On;
//        }
//        if(name.equals("CrackpotDigitA2")){
//            result = CrackpotDigitA2On;
//        }
//        if(name.equals("CrackpotDigitA3")){
//            result = CrackpotDigitA3On;
//        }
//        if(name.equals("CrackpotDigitA4")){
//            result = CrackpotDigitA4On;
//        }
//        if(name.equals("CrackpotDigitA5")){
//            result = CrackpotDigitA5On;
//        }
//        if(name.equals("CrackpotDigitA6")){
//            result = CrackpotDigitA6On;
//        }
//        if(name.equals("CrackpotDigitA7")){
//            result = CrackpotDigitA7On;
//        }
//        if(name.equals("CrackpotDigitA8")){
//            result = CrackpotDigitA8On;
//        }
//        if(name.equals("CrackpotDigitA9")){
//            result = CrackpotDigitA9On;
//        }
//                
//        
//        /**RIGHT CRACKPOT DIGIT*/
//        
//        if(name.equals("CrackpotDigitB0")){
//            result = CrackpotDigitB0On;
//        }
//        if(name.equals("CrackpotDigitB1")){
//            result = CrackpotDigitB1On;
//        }
//        if(name.equals("CrackpotDigitB2")){
//            result = CrackpotDigitB2On;
//        }
//        if(name.equals("CrackpotDigitB3")){
//            result = CrackpotDigitB3On;
//        }
//        if(name.equals("CrackpotDigitB4")){
//            result = CrackpotDigitB4On;
//        }
//        if(name.equals("CrackpotDigitB5")){
//            result = CrackpotDigitB5On;
//        }
//        if(name.equals("CrackpotDigitB6")){
//            result = CrackpotDigitB6On;
//        }
//        if(name.equals("CrackpotDigitB7")){
//            result = CrackpotDigitB7On;
//        }
//        if(name.equals("CrackpotDigitB8")){
//            result = CrackpotDigitB8On;
//        }
//        if(name.equals("CrackpotDigitB9")){
//            result = CrackpotDigitB9On;
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
            case "CrackpotDigitA0":
                CrackpotDigitA0On = result;
                break;
            case "CrackpotDigitA1":
                CrackpotDigitA1On = result;
                break;
            case "CrackpotDigitA2":
                CrackpotDigitA2On = result;
                break;
            case "CrackpotDigitA3":
                CrackpotDigitA3On = result;
                break;
            case "CrackpotDigitA4":
                CrackpotDigitA4On = result;
                break;
            case "CrackpotDigitA5":
                CrackpotDigitA5On = result;
                break;
            case "CrackpotDigitA6":
                CrackpotDigitA6On = result;
                break;
            case "CrackpotDigitA7":
                CrackpotDigitA7On = result;
                break;
            case "CrackpotDigitA8":
                CrackpotDigitA8On = result;
                break;
            case "CrackpotDigitA9":
                CrackpotDigitA9On = result;
                break;
            case "CrackpotDigitB0":
                CrackpotDigitB0On = result;
                break;
            case "CrackpotDigitB1":
                CrackpotDigitB1On = result;
                break;
            case "CrackpotDigitB2":
                CrackpotDigitB2On = result;
                break;
            case "CrackpotDigitB3":
                CrackpotDigitB3On = result;
                break;
            case "CrackpotDigitB4":
                CrackpotDigitB4On = result;
                break;
            case "CrackpotDigitB5":
                CrackpotDigitB5On = result;
                break;
            case "CrackpotDigitB6":
                CrackpotDigitB6On = result;
                break;
            case "CrackpotDigitB7":
                CrackpotDigitB7On = result;
                break;
            case "CrackpotDigitB8":
                CrackpotDigitB8On = result;
                break;
            case "CrackpotDigitB9":
                CrackpotDigitB9On = result;
                break;
        }
        
        
//        if(name.equals("CrackpotDigitA0")){
//            CrackpotDigitA0On = result;
//        }
//        if(name.equals("CrackpotDigitA1")){
//            CrackpotDigitA1On = result;
//        }
//        if(name.equals("CrackpotDigitA2")){
//            CrackpotDigitA2On = result;
//        }
//        if(name.equals("CrackpotDigitA3")){
//            CrackpotDigitA3On = result;
//        }
//        if(name.equals("CrackpotDigitA4")){
//            CrackpotDigitA4On = result;
//        }
//        if(name.equals("CrackpotDigitA5")){
//            CrackpotDigitA5On = result;
//        }
//        if(name.equals("CrackpotDigitA6")){
//            CrackpotDigitA6On = result;
//        }
//        if(name.equals("CrackpotDigitA7")){
//            CrackpotDigitA7On = result;
//        }
//        if(name.equals("CrackpotDigitA8")){
//            CrackpotDigitA8On = result;
//        }
//        if(name.equals("CrackpotDigitA9")){
//            CrackpotDigitA9On = result;
//        }
//        
//        /**RIGHT CRACKPOT DIGIT*/
//        
//        if(name.equals("CrackpotDigitB0")){
//            CrackpotDigitB0On = result;
//        }
//        if(name.equals("CrackpotDigitB1")){
//            CrackpotDigitB1On = result;
//        }
//        if(name.equals("CrackpotDigitB2")){
//            CrackpotDigitB2On = result;
//        }
//        if(name.equals("CrackpotDigitB3")){
//            CrackpotDigitB3On = result;
//        }
//        if(name.equals("CrackpotDigitB4")){
//            CrackpotDigitB4On = result;
//        }
//        if(name.equals("CrackpotDigitB5")){
//            CrackpotDigitB5On = result;
//        }
//        if(name.equals("CrackpotDigitB6")){
//            CrackpotDigitB6On = result;
//        }
//        if(name.equals("CrackpotDigitB7")){
//            CrackpotDigitB7On = result;
//        }
//        if(name.equals("CrackpotDigitB8")){
//            CrackpotDigitB8On = result;
//        }
//        if(name.equals("CrackpotDigitB9")){
//            CrackpotDigitB9On = result;
//        }

    }

    
    /**
     * setCrackpot(crackpotBalance)
     * 
     * @param crackpotBalance
     * 
     * sets crackpot to crackpotBalance
     */
    public void setCrackpot(int crackpotBalance) {
        clearCrackpotDigits();
        
        if(crackpotBalance < 0){
            crackpotBalance = 0;
        }
        if(crackpotBalance > 99){
            crackpotBalance = 99;
        }
        

            if(crackpotBalance == 0 || crackpotBalance == 10 || crackpotBalance == 20 || crackpotBalance == 30 || crackpotBalance == 40 || crackpotBalance == 50 || crackpotBalance == 60 || crackpotBalance == 70 || crackpotBalance == 80 || crackpotBalance == 90){
                CrackpotDigitB0On = true;
            }
            if(crackpotBalance == 1 || crackpotBalance == 11 || crackpotBalance == 21 || crackpotBalance == 31 || crackpotBalance == 41 || crackpotBalance == 51 || crackpotBalance == 61 || crackpotBalance == 71 || crackpotBalance == 81 || crackpotBalance == 91){
                CrackpotDigitB1On = true;
            }
            if(crackpotBalance == 2 || crackpotBalance == 12 || crackpotBalance == 22 || crackpotBalance == 32 || crackpotBalance == 42 || crackpotBalance == 52 || crackpotBalance == 62 || crackpotBalance == 72 || crackpotBalance == 82 || crackpotBalance == 92){
                CrackpotDigitB2On = true;
            }
            if(crackpotBalance == 3 || crackpotBalance == 13 || crackpotBalance == 23 || crackpotBalance == 33 || crackpotBalance == 43 || crackpotBalance == 53 || crackpotBalance == 63 || crackpotBalance == 73 || crackpotBalance == 83 || crackpotBalance == 93){
                CrackpotDigitB3On = true;
            }
            if(crackpotBalance == 4 || crackpotBalance == 14 || crackpotBalance == 24 || crackpotBalance == 34 || crackpotBalance == 44 || crackpotBalance == 54 || crackpotBalance == 64 || crackpotBalance == 74 || crackpotBalance == 84 || crackpotBalance == 94){
                CrackpotDigitB4On = true;
            }
            if(crackpotBalance == 5 || crackpotBalance == 15 || crackpotBalance == 25 || crackpotBalance == 35 || crackpotBalance == 45 || crackpotBalance == 55 || crackpotBalance == 65 || crackpotBalance == 75 || crackpotBalance == 85 || crackpotBalance == 95){
                CrackpotDigitB5On = true;
            }
            if(crackpotBalance == 6 || crackpotBalance == 16 || crackpotBalance == 26 || crackpotBalance == 36 || crackpotBalance == 46 || crackpotBalance == 56 || crackpotBalance == 66 || crackpotBalance == 76 || crackpotBalance == 86 || crackpotBalance == 96){
                CrackpotDigitB6On = true;
            }
            if(crackpotBalance == 7 || crackpotBalance == 17 || crackpotBalance == 27 || crackpotBalance == 37 || crackpotBalance == 47 || crackpotBalance == 57 || crackpotBalance == 67 || crackpotBalance == 77 || crackpotBalance == 87 || crackpotBalance == 97){
                CrackpotDigitB7On = true;
            }
            if(crackpotBalance == 8 || crackpotBalance == 18 || crackpotBalance == 28 || crackpotBalance == 38 || crackpotBalance == 48 || crackpotBalance == 58 || crackpotBalance == 68 || crackpotBalance == 78 || crackpotBalance == 88 || crackpotBalance == 98){
                CrackpotDigitB8On = true;
            }
            if(crackpotBalance == 9 || crackpotBalance == 19 || crackpotBalance == 29 || crackpotBalance == 39 || crackpotBalance == 49 || crackpotBalance == 59 || crackpotBalance == 69 || crackpotBalance == 79 || crackpotBalance == 89 || crackpotBalance == 99){
                CrackpotDigitB9On = true;
            }
            
            //Tens
            if(crackpotBalance <= 9){
                CrackpotDigitA0On = true;
            }
            if(crackpotBalance > 9 && crackpotBalance < 20){
                CrackpotDigitA1On = true;
            }
            if(crackpotBalance > 19 && crackpotBalance < 30){
                CrackpotDigitA2On = true;
            }
            if(crackpotBalance > 29 && crackpotBalance < 40){
                CrackpotDigitA3On = true;
            }
            if(crackpotBalance > 39 && crackpotBalance < 50){
                CrackpotDigitA4On = true;
            }
            if(crackpotBalance > 49 && crackpotBalance < 60){
                CrackpotDigitA5On = true;
            }
            if(crackpotBalance > 59 && crackpotBalance < 70){
                CrackpotDigitA6On = true;
            }
            if(crackpotBalance > 69 && crackpotBalance < 80){
                CrackpotDigitA7On = true;
            }
            if(crackpotBalance > 79 && crackpotBalance < 90){
                CrackpotDigitA8On = true;
            }
            if(crackpotBalance > 89 && crackpotBalance < 100){
                CrackpotDigitA9On = true;
            }
            
            //System.out.println("CrackpotDigits: Setting CrackpotDigits to: "+crackpotBalance);
    
    }
    
    
    /**
     * increaseCrackpot(int crackpotBalanceNew)
     * 
     * @param crackpotBalanceNew
     */
//    public void increaseCrackpot(int crackpotBalanceNew) {
//        for(int i = 0; i < crackpotBalanceNew; i++){
//            crackpotBalance += 1;
//            
//            //set crackpot to crackpotBalance
//            setCrackpot(crackpotBalance);
//        }
//    }
    
    
    /**
     * decreaseCrackpot(int crackpotBalanceNew)
     * 
     * @param crackpotBalanceNew
     */
//    public void decreaseCrackpot(int crackpotBalanceNew) {
//        for(int i = 0; i < crackpotBalanceNew; i++){
//            crackpotBalance -= 1;
//            
//            //set crackpot to crackpotBalance
//            setCrackpot(crackpotBalance);
//        }
//    }

    
    /**
     * getCrackpot()
     * 
     * @return crackpotBalance
     */
    public int getCrackpot() {
        return Machine.machine.getCrackpot();
    }
    
    
    /**
     * clearCrackpotDigits()
     * 
     * sets allcrackpots to off
     */
    public void clearCrackpotDigits(){
        for(int i = 0; i < allcrackpots.size(); i++){
            setOn(allcrackpots.get(i).getText(), false);
        }
        //System.out.println("CrackpotDigits Cleared!");
    }

    
    /**
     * tick()
     * 
     */
//    public void tick() {
//    }
    
    //@Override
    void on() {
        System.out.println("Turning All Crackpot Digits On");
        for(JButton crackpot : allcrackpots){//int i = 0; i < allcrackpots.size(); i++){
            setOn(crackpot.getText(), true);
        }
    }

    //@Override
    void off() {
        System.out.println("Turning All Crackpot Digits Off");
        clearCrackpotDigits();
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void defaultDigits() {
        setOn(allcrackpots.get(0).getText(), true);
        setOn(allcrackpots.get(10).getText(), true);
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
