/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.reels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.Texture;

/**
 *
 * @author Ghomez
 */
public class Reel3 {// implements Runnable {

    /**Attributes*/
    
    /**reel3width variable of Reel3 object */
    public int reel3Width = 176;
    
    /**reel3height variable of Reel3 object */
    public int reel3Height = 152;
    
    /**reel3PosX variable of Reel3 object */
    private final int reel3PosX = 160;
    
    /**reel3PosY variable of Reel3 object */
    private final int reel3PosY = 413;
    
    /**reel3Pos0 button variables of Reel3 object */ 
//    public JButton reel3Pos0;
//    private BufferedImage reel3Pos0OnLight;
//    private static boolean reel3Pos0On;
    
    /**reel3Pos1 button variables of Reel3 object */ 
    public JButton reel3Pos1;
    private BufferedImage reel3Pos1OnLight;
    private static boolean reel3Pos1On;
    
    /**reel3Pos2 button variables of Reel3 object */ 
    public JButton reel3Pos2;
    private BufferedImage reel3Pos2OnLight;
    private static boolean reel3Pos2On;
    
    /**reel3Pos3 button variables of Reel3 object */ 
    public JButton reel3Pos3;
    private BufferedImage reel3Pos3OnLight;
    private static boolean reel3Pos3On;
    
    /**reel3Pos4 button variables of Reel3 object */ 
//    public JButton reel3Pos4;
//    private BufferedImage reel3Pos4OnLight;
//    private static boolean reel3Pos4On;
    
    /**reel3Pos5 button variables of Reel3 object */ 
    public JButton reel3Pos5;
    private BufferedImage reel3Pos5OnLight;
    private static boolean reel3Pos5On;
    
    /**reel3Pos6 button variables of Reel3 object */ 
    public JButton reel3Pos6;
    private BufferedImage reel3Pos6OnLight;
    private static boolean reel3Pos6On;
    
    /**reel3Pos7 button variables of Reel3 object */ 
    public JButton reel3Pos7;
    private BufferedImage reel3Pos7OnLight;
    private static boolean reel3Pos7On;
    
    /**reel3Pos8 button variables of Reel3 object */ 
    public JButton reel3Pos8;
    private BufferedImage reel3Pos8OnLight;
    private static boolean reel3Pos8On;
    
    /**reel3Pos9 button variables of Reel3 object */ 
    public JButton reel3Pos9;
    private BufferedImage reel3Pos9OnLight;
    private static boolean reel3Pos9On;
    
    /**reel3Pos10 button variables of Reel3 object */ 
    public JButton reel3Pos10;
    private BufferedImage reel3Pos10OnLight;
    private static boolean reel3Pos10On;
    
    /**reel3Pos11 button variables of Reel3 object */ 
    public JButton reel3Pos11;
    private BufferedImage reel3Pos11OnLight;
    private static boolean reel3Pos11On;
    
    /**reel3Pos12 button variables of Reel3 object */ 
    public JButton reel3Pos12;
    private BufferedImage reel3Pos12OnLight;
    private static boolean reel3Pos12On;
    
    /**reel3Pos13 button variables of Reel3 object */ 
    public JButton reel3Pos13;
    private BufferedImage reel3Pos13OnLight;
    private static boolean reel3Pos13On;
    
    /**reel3Pos14 button variables of Reel3 object */ 
    public JButton reel3Pos14;
    private BufferedImage reel3Pos14OnLight;
    private static boolean reel3Pos14On;
    
    /**reel3Pos15 button variables of Reel3 object */ 
    public JButton reel3Pos15;
    private BufferedImage reel3Pos15OnLight;
    private static boolean reel3Pos15On;
    
    /**reel3Pos16 button variables of Reel3 object */ 
    public JButton reel3Pos16;
    private BufferedImage reel3Pos16OnLight;
    private static boolean reel3Pos16On;
    
    /**reel3Pos17 button variables of Reel3 object */ 
    public JButton reel3Pos17;
    private BufferedImage reel3Pos17OnLight;
    private static boolean reel3Pos17On;
    
    /**reel3Pos18 button variables of Reel3 object */ 
    public JButton reel3Pos18;
    private BufferedImage reel3Pos18OnLight;
    private static boolean reel3Pos18On;
    
    /**reel3Pos19 button variables of Reel3 object */ 
    public JButton reel3Pos19;
    private BufferedImage reel3Pos19OnLight;
    private static boolean reel3Pos19On;
    
    /**reel3Pos20 button variables of Reel3 object */ 
    public JButton reel3Pos20;
    private BufferedImage reel3Pos20OnLight;
    private static boolean reel3Pos20On;
    
    /**reel3Pos21 button variables of Reel3 object */ 
    public JButton reel3Pos21;
    private BufferedImage reel3Pos21OnLight;
    private static boolean reel3Pos21On;
    
    /**reel3Pos22 button variables of Reel3 object */ 
    public JButton reel3Pos22;
    private BufferedImage reel3Pos22OnLight;
    private static boolean reel3Pos22On;
    
    /**reel3Pos23 button variables of Reel3 object */ 
    public JButton reel3Pos23;
    private BufferedImage reel3Pos23OnLight;
    private static boolean reel3Pos23On;
    
    /**Reel3Pos24 button variables of Reel3 object */ 
    public JButton reel3Pos24;
    private BufferedImage reel3Pos24OnLight;
    private static boolean reel3Pos24On;
    
    /**Reel3Pos25 button variables of Reel3 object */ 
    public JButton reel3Pos25;
    private BufferedImage reel3Pos25OnLight;
    private static boolean reel3Pos25On;
    
    /**reel3Pos26 button variables of Reel3 object */ 
    public JButton reel3Pos26;
    private BufferedImage reel3Pos26OnLight;
    private static boolean reel3Pos26On;
    
    /**reel3Pos27 button variables of Reel3 object */ 
    public JButton reel3Pos27;
    private BufferedImage reel3Pos27OnLight;
    private static boolean reel3Pos27On;
    
    /**reel3Pos28 button variables of Reel3 object */ 
    public JButton reel3Pos28;
    private BufferedImage reel3Pos28OnLight;
    private static boolean reel3Pos28On;
    
    /**reel3Pos29 button variables of Reel3 object */ 
    public JButton reel3Pos29;
    private BufferedImage reel3Pos29OnLight;
    private static boolean reel3Pos29On;
    
    /**reel3Pos30 button variables of Reel3 object */ 
    public JButton reel3Pos30;
    private BufferedImage reel3Pos30OnLight;
    private static boolean reel3Pos30On;
    
    /**reel3Pos31 button variables of Reel3 object */ 
    public JButton reel3Pos31;
    private BufferedImage reel3Pos31OnLight;
    private static boolean reel3Pos31On;
    
    /**reel3Pos32 button variables of Reel3 object */ 
    public JButton reel3Pos32;
    private BufferedImage reel3Pos32OnLight;
    private static boolean reel3Pos32On;
    
    /**reel3Pos33 button variables of Reel3 object */ 
    public JButton reel3Pos33;
    private BufferedImage reel3Pos33OnLight;
    private static boolean reel3Pos33On;
    
    /**allReel3 List variable of Reel3 object */
    private final List<JButton> allReel3;
    
    /**reel3Panel JPanel variable of Reel3 object */
    public JPanel reel3Panel;
    
    /**R3Hold variable of Reel3 object */
    private static boolean R3Hold;
    
    /**allReel3Rev List variable of Reel3 object */
    private final List<JButton> allReel3Rev;
    
    /**spinReel3 Runnable variable of Reel3 object */
    private final Runnable spinReel3;
    
    /**currentPOS variable of Reel3 object */
    private int currentPOS;
    
    /**spinReel3Reverse Runnable variable of Reel3 object */
    private final Runnable spinReel3Reverse;
    
    
    /**Constructor*/    
    
    /**
     * Reel3 Constructor
     * 
     */
    public Reel3(){
        allReel3 = new ArrayList<>();
        allReel3Rev = new ArrayList<>();
        init();
        
        spinReel3 = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReel3.size(); c++){
                    if(getOn(allReel3.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set New current position On
                        setOn(allReel3.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel3.get(c).getText(), false);


                        break;
                    } 
                }
            }
        };
        
        spinReel3Reverse = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReel3Rev.size(); c++){
                    if(getOn(allReel3Rev.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReel3Rev.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel3Rev.get(c).getText(), false);

                        break;
                    } 
                }
            }
        };
        
    }

    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Reel3 images/JButtons
     *
     */
    private void init() {
        
//            reel3Pos0OnLight = new Texture("/Reels/Reel3/Reel3_POS_0000").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0000.png"));
            //0: RedBAR
            reel3Pos1OnLight = new Texture("/Reels/Reel3/Reel3_POS_0001").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0001.png"));
                //1: Gap
            reel3Pos2OnLight = new Texture("/Reels/Reel3/Reel3_POS_0002").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0002.png"));
            //2: Cherry (Special)
            reel3Pos3OnLight = new Texture("/Reels/Reel3/Reel3_POS_0003").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0003.png"));
            
//            reel3Pos4OnLight = new Texture("/Reels/Reel3/Reel3_POS_0004").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0004.png"));
                //3: Gap
            reel3Pos5OnLight = new Texture("/Reels/Reel3/Reel3_POS_0006").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0005.png"));
            //4: Red7
            reel3Pos6OnLight = new Texture("/Reels/Reel3/Reel3_POS_0005").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0006.png"));
                //5: Gap
            reel3Pos7OnLight = new Texture("/Reels/Reel3/Reel3_POS_0008").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0007.png"));
            //6: GreenBAR   (Special)
            reel3Pos8OnLight = new Texture("/Reels/Reel3/Reel3_POS_0007").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0008.png"));
                //7: Gap
            reel3Pos9OnLight = new Texture("/Reels/Reel3/Reel3_POS_0009").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0009.png"));
            //8: GoldBAR
            reel3Pos10OnLight = new Texture("/Reels/Reel3/Reel3_POS_0010").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0010.png"));
                //9: Gap
            reel3Pos11OnLight = new Texture("/Reels/Reel3/Reel3_POS_0012").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0011.png"));
            //10: Blue7
            reel3Pos12OnLight = new Texture("/Reels/Reel3/Reel3_POS_0011").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0012.png"));
                //11: Gap
            reel3Pos13OnLight = new Texture("/Reels/Reel3/Reel3_POS_0013").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0013.png"));
            //12: Cherry    (Special)
            reel3Pos14OnLight = new Texture("/Reels/Reel3/Reel3_POS_0014").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0014.png"));
                //13: Gap
            reel3Pos15OnLight = new Texture("/Reels/Reel3/Reel3_POS_0015").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0015.png"));
            //14: RedBAR
            reel3Pos16OnLight = new Texture("/Reels/Reel3/Reel3_POS_0016").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0016.png"));
                //15: Gap
            reel3Pos17OnLight = new Texture("/Reels/Reel3/Reel3_POS_0017").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0017.png"));
            //16: GreenBAR
            reel3Pos18OnLight = new Texture("/Reels/Reel3/Reel3_POS_0018").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0018.png"));
                //17: Gap
            reel3Pos19OnLight = new Texture("/Reels/Reel3/Reel3_POS_0019").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0019.png"));
            //18: Blue7
            reel3Pos20OnLight = new Texture("/Reels/Reel3/Reel3_POS_0020").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0020.png"));
                //19: Gap
            reel3Pos21OnLight = new Texture("/Reels/Reel3/Reel3_POS_0021").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0021.png"));
            //20: GoldBell
            reel3Pos22OnLight = new Texture("/Reels/Reel3/Reel3_POS_0022").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0022.png"));
                //21: Gap
            reel3Pos23OnLight = new Texture("/Reels/Reel3/Reel3_POS_0023").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0023.png"));
            //22: RedBAR    (Special)
            reel3Pos24OnLight = new Texture("/Reels/Reel3/Reel3_POS_0024").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0024.png"));
                //23: Gap
            reel3Pos25OnLight = new Texture("/Reels/Reel3/Reel3_POS_0025").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0025.png"));
            //24: Cherry    (Special)
            reel3Pos26OnLight = new Texture("/Reels/Reel3/Reel3_POS_0026").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0026.png"));
                //25: Gap
            reel3Pos27OnLight = new Texture("/Reels/Reel3/Reel3_POS_0027").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0027.png"));
            //26: Red7
            reel3Pos28OnLight = new Texture("/Reels/Reel3/Reel3_POS_0028").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0028.png"));
                //27: Gap
            reel3Pos29OnLight = new Texture("/Reels/Reel3/Reel3_POS_0029").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0029.png"));
            //28: GoldBAR
            reel3Pos30OnLight = new Texture("/Reels/Reel3/Reel3_POS_0030").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0030.png"));
                //29: Gap
            reel3Pos31OnLight = new Texture("/Reels/Reel3/Reel3_POS_0031").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0031.png"));
            //30: Gold7
            reel3Pos32OnLight = new Texture("/Reels/Reel3/Reel3_POS_0032").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0032.png"));
                //31: Gap
            reel3Pos33OnLight = new Texture("/Reels/Reel3/Reel3_POS_0033").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel3/Reel3_POS_0033.png"));
            
        drawReel3();
         
        reel3Panel = new JPanel(){
            
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            render(g2d);

            reel3Panel.setSize(1280, 720);
            reel3Panel.setOpaque(false);
            reel3Panel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
    }
    
    
    /**
     * drawReel3()
     * 
     * Draws all the Reel3 images/JButtons
     */
    private void drawReel3() {
        
//        reel3Pos0 = new JButton("reel3Pos0");
//        allReel3.add(reel3Pos0);
        
        reel3Pos1 = new JButton("reel3Pos1");
        allReel3.add(reel3Pos1);
        
        reel3Pos2 = new JButton("reel3Pos2");
        allReel3.add(reel3Pos2);
        
        reel3Pos3 = new JButton("reel3Pos3");
        allReel3.add(reel3Pos3);
        
//        reel3Pos4 = new JButton("reel3Pos4");
//        allReel3.add(reel3Pos4);
        
        reel3Pos5 = new JButton("reel3Pos5");
        allReel3.add(reel3Pos5);
        
        reel3Pos6 = new JButton("reel3Pos6");
        allReel3.add(reel3Pos6);
        
        reel3Pos7 = new JButton("reel3Pos7");
        allReel3.add(reel3Pos7);
        
        reel3Pos8 = new JButton("reel3Pos8");
        allReel3.add(reel3Pos8);
        
        reel3Pos9 = new JButton("reel3Pos9");
        allReel3.add(reel3Pos9);
        
        reel3Pos10 = new JButton("reel3Pos10");
        allReel3.add(reel3Pos10);
        
        reel3Pos11 = new JButton("reel3Pos11");
        allReel3.add(reel3Pos11);
        
        reel3Pos12 = new JButton("reel3Pos12");
        allReel3.add(reel3Pos12);
        
        reel3Pos13 = new JButton("reel3Pos13");
        allReel3.add(reel3Pos13);
        
        reel3Pos14 = new JButton("reel3Pos14");
        allReel3.add(reel3Pos14);
        
        reel3Pos15 = new JButton("reel3Pos15");
        allReel3.add(reel3Pos15);
        
        reel3Pos16 = new JButton("reel3Pos16");
        allReel3.add(reel3Pos16);
        
        reel3Pos17 = new JButton("reel3Pos17");
        allReel3.add(reel3Pos17);
        
        reel3Pos18 = new JButton("reel3Pos18");
        allReel3.add(reel3Pos18);
        
        reel3Pos19 = new JButton("reel3Pos19");
        allReel3.add(reel3Pos19);
        
        reel3Pos20 = new JButton("reel3Pos20");
        allReel3.add(reel3Pos20);
        
        reel3Pos21 = new JButton("reel3Pos21");
        allReel3.add(reel3Pos21);
        
        reel3Pos22 = new JButton("reel3Pos22");
        allReel3.add(reel3Pos22);
        
        reel3Pos23 = new JButton("reel3Pos23");
        allReel3.add(reel3Pos23);
        
        reel3Pos24 = new JButton("reel3Pos24");
        allReel3.add(reel3Pos24);
        
        reel3Pos25 = new JButton("reel3Pos25");
        allReel3.add(reel3Pos25);
        
        reel3Pos26 = new JButton("reel3Pos26");
        allReel3.add(reel3Pos26);
        
        reel3Pos27 = new JButton("reel3Pos27");
        allReel3.add(reel3Pos27);
        
        reel3Pos28 = new JButton("reel3Pos28");
        allReel3.add(reel3Pos28);
        
        reel3Pos29 = new JButton("reel3Pos29");
        allReel3.add(reel3Pos29);
        
        reel3Pos30 = new JButton("reel3Pos30");
        allReel3.add(reel3Pos30);
        
        reel3Pos31 = new JButton("reel3Pos31");
        allReel3.add(reel3Pos31);
        
        reel3Pos32 = new JButton("reel3Pos32");
        allReel3.add(reel3Pos32);
        
        reel3Pos33 = new JButton("reel3Pos33");
        allReel3.add(reel3Pos33);
        
        allReel3Rev.addAll(allReel3);
        Collections.reverse(allReel3Rev);
        
    }
    
    
    /**
     * setR3Hold()
     * 
     * @param result
     */
    public void setR3Hold(boolean result) {
        R3Hold = result;
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
                
        switch(name){
//            case "reel3Pos0":
//                reel3Pos0On = result;
//                break;
            case "reel3Pos1":
                reel3Pos1On = result;
                break;
            case "reel3Pos2":
                reel3Pos2On = result;
                break;
            case "reel3Pos3":
                reel3Pos3On = result;
                break;
//            case "reel3Pos4":
//                reel3Pos4On = result;
//                break;
            case "reel3Pos5":
                reel3Pos5On = result;
                break;
            case "reel3Pos6":
                reel3Pos6On = result;
                break;
            case "reel3Pos7":
                reel3Pos7On = result;
                break;
            case "reel3Pos8":
                reel3Pos8On = result;
                break;
            case "reel3Pos9":
                reel3Pos9On = result;
                break;
            case "reel3Pos10":
                reel3Pos10On = result;
                break;
            case "reel3Pos11":
                reel3Pos11On = result;
                break;
            case "reel3Pos12":
                reel3Pos12On = result;
                break;
            case "reel3Pos13":
                reel3Pos13On = result;
                break;
            case "reel3Pos14":
                reel3Pos14On = result;
                break;
            case "reel3Pos15":
                reel3Pos15On = result;
                break;
            case "reel3Pos16":
                reel3Pos16On = result;
                break;
            case "reel3Pos17":
                reel3Pos17On = result;
                break;
            case "reel3Pos18":
                reel3Pos18On = result;
                break;
            case "reel3Pos19":
                reel3Pos19On = result;
                break;
            case "reel3Pos20":
                reel3Pos20On = result;
                break;
            case "reel3Pos21":
                reel3Pos21On = result;
                break;
            case "reel3Pos22":
                reel3Pos22On = result;
                break;
            case "reel3Pos23":
                reel3Pos23On = result;
                break;
            case "reel3Pos24":
                reel3Pos24On = result;
                break;
            case "reel3Pos25":
                reel3Pos25On = result;
                break;
            case "reel3Pos26":
                reel3Pos26On = result;
                break;
            case "reel3Pos27":
                reel3Pos27On = result;
                break;
            case "reel3Pos28":
                reel3Pos28On = result;
                break;
            case "reel3Pos29":
                reel3Pos29On = result;
                break;
            case "reel3Pos30":
                reel3Pos30On = result;
                break;
            case "reel3Pos31":
                reel3Pos31On = result;
                break;
            case "reel3Pos32":
                reel3Pos32On = result;
                break;
            case "reel3Pos33":
                reel3Pos33On = result;
                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Reel3 images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
//            case "reel3Pos0":
//                result = reel3Pos0On;
//                break;
            case "reel3Pos1":
                result = reel3Pos1On;
                break;
            case "reel3Pos2":
                result = reel3Pos2On;
                break;
            case "reel3Pos3":
                result = reel3Pos3On;
                break;
//            case "reel3Pos4":
//                result = reel3Pos4On;
//                break;
            case "reel3Pos5":
                result = reel3Pos5On;
                break;
            case "reel3Pos6":
                result = reel3Pos6On;
                break;
            case "reel3Pos7":
                result = reel3Pos7On;
                break;
            case "reel3Pos8":
                result = reel3Pos8On;
                break;
            case "reel3Pos9":
                result = reel3Pos9On;
                break;
            case "reel3Pos10":
                result = reel3Pos10On;
                break;
            case "reel3Pos11":
                result = reel3Pos11On;
                break;
            case "reel3Pos12":
                result = reel3Pos12On;
                break;
            case "reel3Pos13":
                result = reel3Pos13On;
                break;
            case "reel3Pos14":
                result = reel3Pos14On;
                break;
            case "reel3Pos15":
                result = reel3Pos15On;
                break;
            case "reel3Pos16":
                result = reel3Pos16On;
                break;
            case "reel3Pos17":
                result = reel3Pos17On;
                break;
            case "reel3Pos18":
                result = reel3Pos18On;
                break;
            case "reel3Pos19":
                result = reel3Pos19On;
                break;
            case "reel3Pos20":
                result = reel3Pos20On;
                break;
            case "reel3Pos21":
                result = reel3Pos21On;
                break;
            case "reel3Pos22":
                result = reel3Pos22On;
                break;
            case "reel3Pos23":
                result = reel3Pos23On;
                break;
            case "reel3Pos24":
                result = reel3Pos24On;
                break;
            case "reel3Pos25":
                result = reel3Pos25On;
                break;
            case "reel3Pos26":
                result = reel3Pos26On;
                break;
            case "reel3Pos27":
                result = reel3Pos27On;
                break;
            case "reel3Pos28":
                result = reel3Pos28On;
                break;
            case "reel3Pos29":
                result = reel3Pos29On;
                break;
            case "reel3Pos30":
                result = reel3Pos30On;
                break;
            case "reel3Pos31":
                result = reel3Pos31On;
                break;
            case "reel3Pos32":
                result = reel3Pos32On;
                break;
            case "reel3Pos33":
                result = reel3Pos33On;
                break;
        }
        
        return result;
    }
 
    
    /**
     * getAllReel3()
     * 
     * @return allReel3 - returns Reel3 images/JButtons
     */
    public List<JButton> getAllReel3() {
        return allReel3;
    }
    
    
    /**
     * spinReel3Reverse()
     * 
     */
    public void spinReel3Reverse(){
        spinReel3Reverse.run();
    }
    
    
    /**
     * spinReel3()
     * 
     */
    public void spinReel3(){
        spinReel3.run();
    }

    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g) {
                
//        if (reel3Pos0On){
//            g.drawImage(reel3Pos0OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
//        } 

        if (reel3Pos1On){
            g.drawImage(reel3Pos1OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos2On){
            g.drawImage(reel3Pos2OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos3On){
            g.drawImage(reel3Pos3OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

//        if (reel3Pos4On){
//            g.drawImage(reel3Pos4OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
//        } 

        if (reel3Pos5On){
            g.drawImage(reel3Pos5OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos6On){
            g.drawImage(reel3Pos6OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos7On){
            g.drawImage(reel3Pos7OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos8On){
            g.drawImage(reel3Pos8OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos9On){
            g.drawImage(reel3Pos9OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos10On){
            g.drawImage(reel3Pos10OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos11On){
            g.drawImage(reel3Pos11OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos12On){
            g.drawImage(reel3Pos12OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos13On){
            g.drawImage(reel3Pos13OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos14On){
            g.drawImage(reel3Pos14OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos15On){
            g.drawImage(reel3Pos15OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos16On){
            g.drawImage(reel3Pos16OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos17On){
            g.drawImage(reel3Pos17OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos18On){
            g.drawImage(reel3Pos18OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos19On){
            g.drawImage(reel3Pos19OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos20On){
            g.drawImage(reel3Pos20OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos21On){
            g.drawImage(reel3Pos21OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos22On){
            g.drawImage(reel3Pos22OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos23On){
            g.drawImage(reel3Pos23OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos24On){
            g.drawImage(reel3Pos24OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos25On){
            g.drawImage(reel3Pos25OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos26On){
            g.drawImage(reel3Pos26OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos27On){
            g.drawImage(reel3Pos27OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos28On){
            g.drawImage(reel3Pos28OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos29On){
            g.drawImage(reel3Pos29OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos30On){
            g.drawImage(reel3Pos30OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos31On){
            g.drawImage(reel3Pos31OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos32On){
            g.drawImage(reel3Pos32OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 

        if (reel3Pos33On){
            g.drawImage(reel3Pos33OnLight, reel3PosX, reel3PosY, reel3Width, reel3Height, null);
        } 
            
        
        g.dispose();
    }

    
    /**
     * isGap(int reel3)
     * 
     * @param reel3
     * @return 
     */
    public boolean isGap(int reel3){
        boolean result;
        if((reel3 % 2) != 0){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    
    /**
     * isSpecial(int reel3)
     * 
     * @param reel3
     * @return 
     */
    public boolean isSpecial(int reel3) {
        if(reel3 == 2 || 
                reel3 == 6 || 
                reel3 == 12 || 
                reel3 == 22 || 
                reel3 == 24){
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * spinReel3Reverse()
     * 
     * @param reel3
     */
    public void spinReel3Reverse(int reel3) {
        if(!R3Hold){
            //for(int c = 0; c < reel3; c++){
                spinReel3Reverse();
            //}
        }
    }
    
    
    /**
     * spinReel3()
     * 
     * @param reel3
     */
    public void spinReel3(int reel3) {
        if(!R3Hold){
            for(int c = 0; c < reel3; c++){
                spinReel3();
            }
        }
    }

    
    /**
     * nudgeR3Reverse()
     * 
     */
    public void nudgeR3Reverse() {
        for(int c = 0; c < 2; c++){
            spinReel3Reverse();
        }
    }
    
    
    /**
     * nudgeR3()
     * 
     */
    public void nudgeR3() {
        for(int c = 0; c < 2; c++){
            spinReel3();
        }
    }

    
    /**
     * getR3Hold()
     * 
     * @return R3Hold
     */
    public boolean getR3Hold() {
        return R3Hold;
    }
    
    
    /**
     * getCurrentPOS()
     * 
     * @return currentPOS
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
     * tick()
     * 
     */
    public void tick() {
    }

    
    /**
     * getSymbol(int r3)
     * 
     * @param r3
     * @return iconR3
     */
    public String getSymbol(int r3) {
        
        String iconR3 = "";
        
        switch(r3){
            case 0:
                iconR3 = "RedBAR";
                break;
            case 2:
                iconR3 = "Cherry";
                break;
            case 4:
                iconR3 = "Red7";
                break;
            case 6:
                iconR3 = "GreenBAR";
                break;
            case 8:
                iconR3 = "GoldBAR";
                break;
            case 10:
                iconR3 = "Blue7";
                break;
            case 12:
                iconR3 = "Cherry";
                break;
            case 14:
                iconR3 = "RedBAR";
                break;
            case 16:
                iconR3 = "GreenBAR";
                break;
            case 18:
                iconR3 = "Blue7";
                break;
            case 20:
                iconR3 = "GoldBell";
                break;
            case 22:
                iconR3 = "RedBAR";
                break;
            case 24:
                iconR3 = "Cherry";
                break;
            case 26:
                iconR3 = "Red7";
                break;
            case 28:
                iconR3 = "GoldBAR";
                break;
            case 30:
                iconR3 = "Gold7";
                break;
        }
        
        return iconR3;
    }

    public int getIndex(String letEmSpinIcon) {
        int index = 0;
        
        switch(letEmSpinIcon){
            case "RedBAR":
                index = 0;
                break;
            case "Cherry":
                index = 2;
                break;
            case "Red7":
                index = 4;
                break;
            case "GreenBAR":
                index = 6;
                break;
            case "GoldBAR":
                index = 8;
                break;
            case "Blue7":
                index = 10;
                break;
            case "GoldBell":
                index = 20;
                break;
            case "Gold7":
                index = 30;
                break;
        }
        
        return index;
    }

    
}
