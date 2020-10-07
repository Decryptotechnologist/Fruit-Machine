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
public class CreditDigits {//extends Digits {

    /**Attributes*/
    
    /**CreditDigit width variable of CreditDigits object */
    public int CreditDigitWidth = 36;
    
    /**CreditDigit height variable of CreditDigits object */
    public int CreditDigitHeight = 36;
    
    /**CreditDigitALgtX variables of CreditDigits object */ 
    private final int CreditDigitALgtX = 520;
    
    /**CreditDigitALgtY variables of CreditDigits object */ 
    private final int CreditDigitALgtY = 376;
    
    /**CreditDigitA0 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA0;
    private BufferedImage CreditDigitA0OnImg;
    private static boolean CreditDigitA0On;
    
    /**CreditDigitA1 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA1;
    private BufferedImage CreditDigitA1OnImg;
    private static boolean CreditDigitA1On;
    
    /**CreditDigitA2 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA2;
    private BufferedImage CreditDigitA2OnImg;
    private static boolean CreditDigitA2On;
    
    /**CreditDigitA3 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA3;
    private BufferedImage CreditDigitA3OnImg;
    private static boolean CreditDigitA3On;
    
    /**CreditDigitA4 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA4;
    private BufferedImage CreditDigitA4OnImg;
    private static boolean CreditDigitA4On;
    
    /**CreditDigitA5 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA5;
    private BufferedImage CreditDigitA5OnImg;
    private static boolean CreditDigitA5On;
    
    /**CreditDigitA6 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA6;
    private BufferedImage CreditDigitA6OnImg;
    private static boolean CreditDigitA6On;
        
    /**CreditDigitA7 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA7;
    private BufferedImage CreditDigitA7OnImg;
    private static boolean CreditDigitA7On;
    
    /**CreditDigitA8 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA8;
    private BufferedImage CreditDigitA8OnImg;
    private static boolean CreditDigitA8On;
        
    /**CreditDigitA9 button/light variables of CreditDigits object */ 
    public JButton CreditDigitA9;
    private BufferedImage CreditDigitA9OnImg;
    private static boolean CreditDigitA9On;
    
    
    /**RIGHT CREDIT DIGIT*/ 
    
    /**CreditDigitBLgtX button/light variables of CreditDigits object */ 
    private final int CreditDigitBLgtX = 530;
    
    /**CreditDigitBLgtY button/light variables of CreditDigits object */ 
    private final int CreditDigitBLgtY = 376;
    
    /**CreditDigitB0 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB0;
    private BufferedImage CreditDigitB0OnImg;
    private static boolean CreditDigitB0On;
    
    /**CreditDigitB1 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB1;
    private BufferedImage CreditDigitB1OnImg;
    private static boolean CreditDigitB1On;
    
    /**CreditDigitB2 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB2;
    private BufferedImage CreditDigitB2OnImg;
    private static boolean CreditDigitB2On;
    
    /**CreditDigitB3 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB3;
    private BufferedImage CreditDigitB3OnImg;
    private static boolean CreditDigitB3On;
    
    /**CreditDigitB4 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB4;
    private BufferedImage CreditDigitB4OnImg;
    private static boolean CreditDigitB4On;
    
    /**CreditDigitB5 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB5;
    private BufferedImage CreditDigitB5OnImg;
    private static boolean CreditDigitB5On;
    
    /**CreditDigitB6 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB6;
    private BufferedImage CreditDigitB6OnImg;
    private static boolean CreditDigitB6On;
        
    /**CreditDigitB7 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB7;
    private BufferedImage CreditDigitB7OnImg;
    private static boolean CreditDigitB7On;
    
    /**CreditDigitB8 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB8;
    private BufferedImage CreditDigitB8OnImg;
    private static boolean CreditDigitB8On;
        
    /**CreditDigitB9 button/light variables of CreditDigits object */ 
    public JButton CreditDigitB9;
    private BufferedImage CreditDigitB9OnImg;
    private static boolean CreditDigitB9On;
    
    /**allCredits List variable of CreditDigits object */
    public List<JButton> allCredits;
    
    /**Creditz JPanel variable of CreditDigits object */
    public JPanel Creditz;
    private List<JButton> allCreditsA;
    //private final Machine machine;
    
    /**crackpotBalance variable of Nudges object */
    //private int creditBalance;
    

    
    /**Constructor*/
    
    /**
     * CreditDigits Constructor
     * 
     * @param credit
     * @param machine
     */
    public CreditDigits(){
        allCredits = new ArrayList<>();
        init();
        
        //this.machine = machine;
        //setCredits(credit);
        setCredits(0);
    }
    
    /**Public Protocol*/ 
    
    /**
     * init()
     * 
     * Initiates all the CreditDigits light images
     * and fires the drawCreditDigits method
     *
     */
    private void init(){
        
            CreditDigitA0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            CreditDigitA1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            CreditDigitA2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            CreditDigitA3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            CreditDigitA4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            CreditDigitA5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            CreditDigitA6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            CreditDigitA7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            CreditDigitA8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            CreditDigitA9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
            
            /**CreditDigitB FAR RIGHT*/
            
            CreditDigitB0OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ZERO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ZERO.png"));
            
            CreditDigitB1OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-ONE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-ONE.png"));
            
            CreditDigitB2OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-TWO").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-TWO.png"));
            
            CreditDigitB3OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-THREE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-THREE.png"));
            
            CreditDigitB4OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FOUR").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FOUR.png"));
            
            CreditDigitB5OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-FIVE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-FIVE.png"));
            
            CreditDigitB6OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SIX").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SIX.png"));
            
            CreditDigitB7OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-SEVEN").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-SEVEN.png"));
            
            CreditDigitB8OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-EIGHT").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-EIGHT.png"));
            
            CreditDigitB9OnImg = new Texture("/BankDigits/fruit-machine-DIGIT-NINE").getImage();//ImageIO.read(getClass().getResource("/BankDigits/fruit-machine-DIGIT-NINE.png"));
            
        drawCreditDigits();
         
        Creditz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            Creditz.setSize(1280, 720);
            Creditz.setOpaque(false);
            Creditz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        }};
    }
    
    
    /**
     * drawCreditDigits()
     * 
     * Draws all the CreditDigit images/JButtons
     */
    private void drawCreditDigits() {
        
        CreditDigitA0 = new JButton("CreditDigitA0");
        allCredits.add(CreditDigitA0);

        CreditDigitA1 = new JButton("CreditDigitA1");
        allCredits.add(CreditDigitA1);

        CreditDigitA2 = new JButton("CreditDigitA2");
        allCredits.add(CreditDigitA2);

        CreditDigitA3 = new JButton("CreditDigitA3");
        allCredits.add(CreditDigitA3);
        
        CreditDigitA4 = new JButton("CreditDigitA4");
        allCredits.add(CreditDigitA4);
        
        CreditDigitA5 = new JButton("CreditDigitA5");
        allCredits.add(CreditDigitA5);
        
        CreditDigitA6 = new JButton("CreditDigitA6");
        allCredits.add(CreditDigitA6);
        
        CreditDigitA7 = new JButton("CreditDigitA7");
        allCredits.add(CreditDigitA7);
        
        CreditDigitA8 = new JButton("CreditDigitA8");
        allCredits.add(CreditDigitA8);
        
        CreditDigitA9 = new JButton("CreditDigitA9");
        allCredits.add(CreditDigitA9);
        
        
        /**RIGHT CREDIT DIGIT*/
        
        CreditDigitB0 = new JButton("CreditDigitB0");
        allCredits.add(CreditDigitB0);

        CreditDigitB1 = new JButton("CreditDigitB1");
        allCredits.add(CreditDigitB1);

        CreditDigitB2 = new JButton("CreditDigitB2");
        allCredits.add(CreditDigitB2);

        CreditDigitB3 = new JButton("CreditDigitB3");
        allCredits.add(CreditDigitB3);
        
        CreditDigitB4 = new JButton("CreditDigitB4");
        allCredits.add(CreditDigitB4);
        
        CreditDigitB5 = new JButton("CreditDigitB5");
        allCredits.add(CreditDigitB5);
        
        CreditDigitB6 = new JButton("CreditDigitB6");
        allCredits.add(CreditDigitB6);
        
        CreditDigitB7 = new JButton("CreditDigitB7");
        allCredits.add(CreditDigitB7);
        
        CreditDigitB8 = new JButton("CreditDigitB8");
        allCredits.add(CreditDigitB8);
        
        CreditDigitB9 = new JButton("CreditDigitB9");
        allCredits.add(CreditDigitB9);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     * 
     * repaints all the CrackpotDigit images/JButtons
     */
    public void render(Graphics2D g){
        
        if (CreditDigitA0On){
            g.drawImage(CreditDigitA0OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA1On){
            g.drawImage(CreditDigitA1OnImg, CreditDigitALgtX+4, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA2On){
            g.drawImage(CreditDigitA2OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA3On){
            g.drawImage(CreditDigitA3OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        } 

        if (CreditDigitA4On){
            g.drawImage(CreditDigitA4OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA5On){
            g.drawImage(CreditDigitA5OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA6On){
            g.drawImage(CreditDigitA6OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA7On){
            g.drawImage(CreditDigitA7OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA8On){
            g.drawImage(CreditDigitA8OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitA9On){
            g.drawImage(CreditDigitA9OnImg, CreditDigitALgtX, CreditDigitALgtY, CreditDigitWidth, CreditDigitHeight, null);
        }            

        /**RIGHT CREDIT DIGIT*/

        if (CreditDigitB0On){
            g.drawImage(CreditDigitB0OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB1On){
            g.drawImage(CreditDigitB1OnImg, CreditDigitBLgtX+4, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB2On){
            g.drawImage(CreditDigitB2OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB3On){
            g.drawImage(CreditDigitB3OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        } 

        if (CreditDigitB4On){
            g.drawImage(CreditDigitB4OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB5On){
            g.drawImage(CreditDigitB5OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB6On){
            g.drawImage(CreditDigitB6OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB7On){
            g.drawImage(CreditDigitB7OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB8On){
            g.drawImage(CreditDigitB8OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }

        if (CreditDigitB9On){
            g.drawImage(CreditDigitB9OnImg, CreditDigitBLgtX, CreditDigitBLgtY, CreditDigitWidth, CreditDigitHeight, null);
        }
            
        g.dispose();
    }
    
       
    /**
     * getAllCredits()
     * 
     * @return allCredits - returns allCredits images/JButtons
     */
    public List<JButton> getAllCredits() {
        allCreditsA = new ArrayList<>();
        int j = 0;
        
        for (int i = 0; i < allCredits.size(); i++) {
                allCreditsA.add(j, allCredits.get(i));
                j++;
        }
        
        return allCreditsA;
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "CreditDigitA0":
                CreditDigitA0On = result;
                break;
            case "CreditDigitA1":
                CreditDigitA1On = result;
                break;
            case "CreditDigitA2":
                CreditDigitA2On = result;
                break;
            case "CreditDigitA3":
                CreditDigitA3On = result;
                break;
            case "CreditDigitA4":
                CreditDigitA4On = result;
                break;
            case "CreditDigitA5":
                CreditDigitA5On = result;
                break;
            case "CreditDigitA6":
                CreditDigitA6On = result;
                break;
            case "CreditDigitA7":
                CreditDigitA7On = result;
                break;
            case "CreditDigitA8":
                CreditDigitA8On = result;
                break;
            case "CreditDigitA9":
                CreditDigitA9On = result;
                break;
            case "CreditDigitB0":
                CreditDigitB0On = result;
                break;
            case "CreditDigitB1":
                CreditDigitB1On = result;
                break;
            case "CreditDigitB2":
                CreditDigitB2On = result;
                break;
            case "CreditDigitB3":
                CreditDigitB3On = result;
                break;
            case "CreditDigitB4":
                CreditDigitB4On = result;
                break;
            case "CreditDigitB5":
                CreditDigitB5On = result;
                break;
            case "CreditDigitB6":
                CreditDigitB6On = result;
                break;
            case "CreditDigitB7":
                CreditDigitB7On = result;
                break;
            case "CreditDigitB8":
                CreditDigitB8On = result;
                break;
            case "CreditDigitB9":
                CreditDigitB9On = result;
                break;
        }

    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of CreditDigits images/JButtons on
     */
    public boolean getOn(String name){
        
        boolean result = false;
        
        switch(name){
            case "CreditDigitA0":
                result = CreditDigitA0On;
                break;
            case "CreditDigitA1":
                result = CreditDigitA1On;
                break;
            case "CreditDigitA2":
                result = CreditDigitA2On;
                break;
            case "CreditDigitA3":
                result = CreditDigitA3On;
                break;
            case "CreditDigitA4":
                result = CreditDigitA4On;
                break;
            case "CreditDigitA5":
                result = CreditDigitA5On;
                break;
            case "CreditDigitA6":
                result = CreditDigitA6On;
                break;
            case "CreditDigitA7":
                result = CreditDigitA7On;
                break;
            case "CreditDigitA8":
                result = CreditDigitA8On;
                break;
            case "CreditDigitA9":
                result = CreditDigitA9On;
                break;
            case "CreditDigitB0":
                result = CreditDigitB0On;
                break;
            case "CreditDigitB1":
                result = CreditDigitB1On;
                break;
            case "CreditDigitB2":
                result = CreditDigitB2On;
                break;
            case "CreditDigitB3":
                result = CreditDigitB3On;
                break;
            case "CreditDigitB4":
                result = CreditDigitB4On;
                break;
            case "CreditDigitB5":
                result = CreditDigitB5On;
                break;
            case "CreditDigitB6":
                result = CreditDigitB6On;
                break;
            case "CreditDigitB7":
                result = CreditDigitB7On;
                break;
            case "CreditDigitB8":
                result = CreditDigitB8On;
                break;
            case "CreditDigitB9":
                result = CreditDigitB9On;
                break;
        }
        
        return result;
    }

    
    /**
     * setCredits()
     * 
     * @param creditBalance
     * 
     * sets credits to creditBalance
     */
    public void setCredits(int creditBalance) {

        if(creditBalance < 0){
            creditBalance = 0;
        }
        if(creditBalance > 99){
            creditBalance = 99;
        }
        
            
            if(creditBalance == 0 || creditBalance == 10 || creditBalance == 20 || creditBalance == 30 || creditBalance == 40 || creditBalance == 50 || creditBalance == 60 || creditBalance == 70 || creditBalance == 80 || creditBalance == 90){
                CreditDigitB0On = true;
            }
            if(creditBalance == 1 || creditBalance == 11 || creditBalance == 21 || creditBalance == 31 || creditBalance == 41 || creditBalance == 51 || creditBalance == 61 || creditBalance == 71 || creditBalance == 81 || creditBalance == 91){
                CreditDigitB1On = true;
            }
            if(creditBalance == 2 || creditBalance == 12 || creditBalance == 22 || creditBalance == 32 || creditBalance == 42 || creditBalance == 52 || creditBalance == 62 || creditBalance == 72 || creditBalance == 82 || creditBalance == 92){
                CreditDigitB2On = true;
            }
            if(creditBalance == 3 || creditBalance == 13 || creditBalance == 23 || creditBalance == 33 || creditBalance == 43 || creditBalance == 53 || creditBalance == 63 || creditBalance == 73 || creditBalance == 83 || creditBalance == 93){
                CreditDigitB3On = true;
            }
            if(creditBalance == 4 || creditBalance == 14 || creditBalance == 24 || creditBalance == 34 || creditBalance == 44 || creditBalance == 54 || creditBalance == 64 || creditBalance == 74 || creditBalance == 84 || creditBalance == 94){
                CreditDigitB4On = true;
            }
            if(creditBalance == 5 || creditBalance == 15 || creditBalance == 25 || creditBalance == 35 || creditBalance == 45 || creditBalance == 55 || creditBalance == 65 || creditBalance == 75 || creditBalance == 85 || creditBalance == 95){
                CreditDigitB5On = true;
            }
            if(creditBalance == 6 || creditBalance == 16 || creditBalance == 26 || creditBalance == 36 || creditBalance == 46 || creditBalance == 56 || creditBalance == 66 || creditBalance == 76 || creditBalance == 86 || creditBalance == 96){
                CreditDigitB6On = true;
            }
            if(creditBalance == 7 || creditBalance == 17 || creditBalance == 27 || creditBalance == 37 || creditBalance == 47 || creditBalance == 57 || creditBalance == 67 || creditBalance == 77 || creditBalance == 87 || creditBalance == 97){
                CreditDigitB7On = true;
            }
            if(creditBalance == 8 || creditBalance == 18 || creditBalance == 28 || creditBalance == 38 || creditBalance == 48 || creditBalance == 58 || creditBalance == 68 || creditBalance == 78 || creditBalance == 88 || creditBalance == 98){
                CreditDigitB8On = true;
            }
            if(creditBalance == 9 || creditBalance == 19 || creditBalance == 29 || creditBalance == 39 || creditBalance == 49 || creditBalance == 59 || creditBalance == 69 || creditBalance == 79 || creditBalance == 89 || creditBalance == 99){
                CreditDigitB9On = true;
            }
            
            //Tens
//            if(creditBalance <= 9){
//                CreditDigitA0On = true;
//            }
            if(creditBalance > 9 && creditBalance < 20){
                CreditDigitA1On = true;
            }
            if(creditBalance > 19 && creditBalance < 30){
                CreditDigitA2On = true;
            }
            if(creditBalance > 29 && creditBalance < 40){
                CreditDigitA3On = true;
            }
            if(creditBalance > 39 && creditBalance < 50){
                CreditDigitA4On = true;
            }
            if(creditBalance > 49 && creditBalance < 60){
                CreditDigitA5On = true;
            }
            if(creditBalance > 59 && creditBalance < 70){
                CreditDigitA6On = true;
            }
            if(creditBalance > 69 && creditBalance < 80){
                CreditDigitA7On = true;
            }
            if(creditBalance > 79 && creditBalance < 90){
                CreditDigitA8On = true;
            }
            if(creditBalance > 89 && creditBalance < 100){
                CreditDigitA9On = true;
            }
            
            //System.out.println("CreditDigits: Setting CreditDigits to: "+creditBalance);
    
    }

    
    /**
     * increaseCredits(int newCreditBalance)
     * 
     * @param newCreditBalance
     */
//    public void increaseCredits(int newCreditBalance) {
//        for(int i = 0; i < newCreditBalance; i++){
//            creditBalance += 1;
//            
//            //set credits to creditBalance
//            setCredits(creditBalance);
//        }
//    }
    
    
    /**
     * decreaseCredit(int newCreditBalance)
     * 
     * @param newCreditBalance
     */
//    public void decreaseCredits(int newCreditBalance) {
//        for(int i = 0; i < newCreditBalance; i++){
//            creditBalance -= 1;
//            
//            //set crackpot to crackpotBalance
//            setCredits(creditBalance);
//        }
//    }

    
    /**
     * getCredit()
     * 
     * @return creditBalance
     */
    public int getCredits() {
        return Machine.machine.getCredits();
    }
    
    
    /**
     * clearCreditDigits()
     * 
     * sets allCredits to off
     */
    public void clearCreditDigits(){
        for(int i = 0; i < allCredits.size(); i++){
            setOn(allCredits.get(i).getText(), false);
        }
        //System.out.println("CreditDigits: CreditDigits Cleared!");
    }    

    
    /**
     * tick()
     * 
     */
//    public void tick() {
//    }
    
    //@Override
    void on() {
        System.out.println("Turning Digit On: "+this.getName());
        for(JButton credit : allCredits){//int i = 0; i < allCredits.size(); i++){
            setOn(credit.getText(), true);
        }
    }

    //@Override
    void off() {
        System.out.println("Turning Digit Off: "+this.getName());
        clearCreditDigits();
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void defaultDigits() {
        setOn(allCredits.get(10).getText(), true);
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
