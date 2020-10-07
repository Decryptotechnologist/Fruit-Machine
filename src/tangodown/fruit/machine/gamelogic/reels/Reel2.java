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
public class Reel2 {//implements Runnable {

    /**Attributes*/
    
    /**Reel2width variable of Reel2 object */
    public int reel2Width = 176;
    
    /**Reel2height variable of Reel2 object */
    public int reel2Height = 152;
    
    /**reel2PosX variable of Reel2 object */
    private final int reel2PosX = 304;
    
    /**reel2PosY variable of Reel2 object */
    private final int reel2PosY = 413;
    
    /**reel2Pos0 button variables of Reel2 object */ 
//    public JButton reel2Pos0;
//    private BufferedImage reel2Pos0OnLight;
//    private static boolean reel2Pos0On;
    
    /**reel2Pos1 button variables of Reel2 object */ 
    public JButton reel2Pos1;
    private BufferedImage reel2Pos1OnLight;
    private static boolean reel2Pos1On;
    
    /**reel2Pos2 button variables of Reel2 object */ 
    public JButton reel2Pos2;
    private BufferedImage reel2Pos2OnLight;
    private static boolean reel2Pos2On;
    
    /**reel2Pos3 button variables of Reel2 object */ 
    public JButton reel2Pos3;
    private BufferedImage reel2Pos3OnLight;
    private static boolean reel2Pos3On;
    
    /**reel2Pos4 button variables of Reel2 object */ 
    public JButton reel2Pos4;
    private BufferedImage reel2Pos4OnLight;
    private static boolean reel2Pos4On;
    
    /**reel2Pos5 button variables of Reel2 object */ 
    public JButton reel2Pos5;
    private BufferedImage reel2Pos5OnLight;
    private static boolean reel2Pos5On;
    
    /**reel2Pos6 button variables of Reel2 object */ 
    public JButton reel2Pos6;
    private BufferedImage reel2Pos6OnLight;
    private static boolean reel2Pos6On;
    
    /**reel2Pos7 button variables of Reel2 object */ 
    public JButton reel2Pos7;
    private BufferedImage reel2Pos7OnLight;
    private static boolean reel2Pos7On;
    
    /**reel2Pos8 button variables of Reel2 object */ 
    public JButton reel2Pos8;
    private BufferedImage reel2Pos8OnLight;
    private static boolean reel2Pos8On;
    
    /**reel2Pos9 button variables of Reel2 object */ 
    public JButton reel2Pos9;
    private BufferedImage reel2Pos9OnLight;
    private static boolean reel2Pos9On;
    
    /**reel2Pos10 button variables of Reel2 object */ 
//    public JButton reel2Pos10;
//    private BufferedImage reel2Pos10OnLight;
//    private static boolean reel2Pos10On;
    
    /**reel2Pos11 button variables of Reel2 object */ 
    public JButton reel2Pos11;
    private BufferedImage reel2Pos11OnLight;
    private static boolean reel2Pos11On;
    
    /**reel2Pos12 button variables of Reel2 object */ 
    public JButton reel2Pos12;
    private BufferedImage reel2Pos12OnLight;
    private static boolean reel2Pos12On;
    
    /**reel2Pos13 button variables of Reel2 object */ 
    public JButton reel2Pos13;
    private BufferedImage reel2Pos13OnLight;
    private static boolean reel2Pos13On;
    
    /**reel2Pos14 button variables of Reel2 object */ 
    public JButton reel2Pos14;
    private BufferedImage reel2Pos14OnLight;
    private static boolean reel2Pos14On;
    
    /**reel2Pos15 button variables of Reel2 object */ 
    public JButton reel2Pos15;
    private BufferedImage reel2Pos15OnLight;
    private static boolean reel2Pos15On;
    
    /**reel2Pos16 button variables of Reel2 object */ 
    public JButton reel2Pos16;
    private BufferedImage reel2Pos16OnLight;
    private static boolean reel2Pos16On;
    
    /**reel2Pos17 button variables of Reel2 object */ 
    public JButton reel2Pos17;
    private BufferedImage reel2Pos17OnLight;
    private static boolean reel2Pos17On;
    
    /**reel2Pos18 button variables of Reel2 object */ 
    public JButton reel2Pos18;
    private BufferedImage reel2Pos18OnLight;
    private static boolean reel2Pos18On;
    
    /**reel2Pos19 button variables of Reel2 object */ 
    public JButton reel2Pos19;
    private BufferedImage reel2Pos19OnLight;
    private static boolean reel2Pos19On;
    
    /**reel2Pos20 button variables of Reel2 object */ 
    public JButton reel2Pos20;
    private BufferedImage reel2Pos20OnLight;
    private static boolean reel2Pos20On;
    
    /**reel2Pos21 button variables of Reel2 object */ 
    public JButton reel2Pos21;
    private BufferedImage reel2Pos21OnLight;
    private static boolean reel2Pos21On;
    
    /**reel2Pos22 button variables of Reel2 object */ 
    public JButton reel2Pos22;
    private BufferedImage reel2Pos22OnLight;
    private static boolean reel2Pos22On;
    
    /**reel2Pos23 button variables of Reel2 object */ 
    public JButton reel2Pos23;
    private BufferedImage reel2Pos23OnLight;
    private static boolean reel2Pos23On;
    
    /**Reel2Pos24 button variables of Reel2 object */ 
    public JButton reel2Pos24;
    private BufferedImage reel2Pos24OnLight;
    private static boolean reel2Pos24On;
    
    /**Reel2Pos25 button variables of Reel2 object */ 
    public JButton reel2Pos25;
    private BufferedImage reel2Pos25OnLight;
    private static boolean reel2Pos25On;
    
    /**reel2Pos26 button variables of Reel2 object */ 
    public JButton reel2Pos26;
    private BufferedImage reel2Pos26OnLight;
    private static boolean reel2Pos26On;
    
    /**reel2Pos27 button variables of Reel2 object */ 
    public JButton reel2Pos27;
    private BufferedImage reel2Pos27OnLight;
    private static boolean reel2Pos27On;
    
    /**reel2Pos28 button variables of Reel2 object */ 
    public JButton reel2Pos28;
    private BufferedImage reel2Pos28OnLight;
    private static boolean reel2Pos28On;
    
    /**reel2Pos29 button variables of Reel2 object */ 
    public JButton reel2Pos29;
    private BufferedImage reel2Pos29OnLight;
    private static boolean reel2Pos29On;
    
    /**reel2Pos30 button variables of Reel2 object */ 
    public JButton reel2Pos30;
    private BufferedImage reel2Pos30OnLight;
    private static boolean reel2Pos30On;
    
    /**reel2Pos31 button variables of Reel2 object */ 
    public JButton reel2Pos31;
    private BufferedImage reel2Pos31OnLight;
    private static boolean reel2Pos31On;
    
    /**reel2Pos32 button variables of Reel2 object */ 
    public JButton reel2Pos32;
    private BufferedImage reel2Pos32OnLight;
    private static boolean reel2Pos32On;
    
    /**reel2Pos33 button variables of Reel2 object */ 
    public JButton reel2Pos33;
    private BufferedImage reel2Pos33OnLight;
    private static boolean reel2Pos33On;
    
    /**allReel2 List variable of Reel2 object */
    private final List<JButton> allReel2;
    
    /**reel2Panel JPanel variable of Reel2 object */
    public JPanel reel2Panel;    
    
    /**R2Hold variable of Reel2 object */
    private static boolean R2Hold;
    
    /**allReel2Rev List variable of Reel2 object */
    private final List<JButton> allReel2Rev;
    
    /**spinReel2 Runnable variable of Reel2 object */
    private final Runnable spinReel2;
    
    /**currentPOS variable of Reel2 object */
    private int currentPOS;
    
    /**spinReel2Reverse Runnable variable of Reel2 object */
    private final Runnable spinReel2Reverse;
    
    /**Constructor*/
    
    
    /**
     * Reel2 Constructor
     * 
     */
    public Reel2(){
        allReel2 = new ArrayList<>();
        allReel2Rev = new ArrayList<>();
        init();
        
        spinReel2 = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReel2.size(); c++){
                    if(getOn(allReel2.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReel2.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel2.get(c).getText(), false);

                        break;
                    }

                }
            }
        };
        
        spinReel2Reverse = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReel2Rev.size(); c++){
                    if(getOn(allReel2Rev.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReel2Rev.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel2Rev.get(c).getText(), false);

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
     * Initiates all the Reel2 images/JButtons
     *
     */
    private void init() {
        
//            reel2Pos0OnLight = new Texture("/Reels/Reel2/Reel2_POS_0000").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0000.png"));
            //0: Gold7
            reel2Pos1OnLight = new Texture("/Reels/Reel2/Reel2_POS_0001").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0001.png"));
                //1: Gap
            reel2Pos2OnLight = new Texture("/Reels/Reel2/Reel2_POS_0002").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0002.png"));
            //2: GreenBAR
            reel2Pos3OnLight = new Texture("/Reels/Reel2/Reel2_POS_0003").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0003.png"));
                //3: Gap
            reel2Pos4OnLight = new Texture("/Reels/Reel2/Reel2_POS_0004").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0004.png"));
            //4: GoldBAR
            reel2Pos5OnLight = new Texture("/Reels/Reel2/Reel2_POS_0005").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0005.png"));
                //5: Gap
            reel2Pos6OnLight = new Texture("/Reels/Reel2/Reel2_POS_0008").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0006.png"));
            //6: Cherry (Special)
            reel2Pos7OnLight = new Texture("/Reels/Reel2/Reel2_POS_0007").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0007.png"));
                //7: Gap
            reel2Pos8OnLight = new Texture("/Reels/Reel2/Reel2_POS_0010").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0008.png"));
            //8: Blue7
            reel2Pos9OnLight = new Texture("/Reels/Reel2/Reel2_POS_0009").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0009.png"));
            
//            reel2Pos10OnLight = new Texture("/Reels/Reel2/Reel2_POS_0010").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0010.png"));
                //9: Gap
            reel2Pos11OnLight = new Texture("/Reels/Reel2/Reel2_POS_0011").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0011.png"));
            //10: GreenBar
            reel2Pos12OnLight = new Texture("/Reels/Reel2/Reel2_POS_0012").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0012.png"));
                //11: Gap
            reel2Pos13OnLight = new Texture("/Reels/Reel2/Reel2_POS_0014").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0013.png"));
            //12: Cherry
            reel2Pos14OnLight = new Texture("/Reels/Reel2/Reel2_POS_0013").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0014.png"));
                //13: Gap
            reel2Pos15OnLight = new Texture("/Reels/Reel2/Reel2_POS_0015").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0015.png"));
            //14: GoldBell
            reel2Pos16OnLight = new Texture("/Reels/Reel2/Reel2_POS_0016").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0016.png"));
                //15: Gap
            reel2Pos17OnLight = new Texture("/Reels/Reel2/Reel2_POS_0017").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0017.png"));
            //16: GoldBAR
            reel2Pos18OnLight = new Texture("/Reels/Reel2/Reel2_POS_0018").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0018.png"));
                //17: Gap
            reel2Pos19OnLight = new Texture("/Reels/Reel2/Reel2_POS_0019").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0019.png"));
            //18: Cherry    (Special)
            reel2Pos20OnLight = new Texture("/Reels/Reel2/Reel2_POS_0020").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0020.png"));
                //19: Gap
            reel2Pos21OnLight = new Texture("/Reels/Reel2/Reel2_POS_0021").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0021.png"));
            //20: GreenBAR
            reel2Pos22OnLight = new Texture("/Reels/Reel2/Reel2_POS_0022").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0022.png"));
                //21: Gap
            reel2Pos23OnLight = new Texture("/Reels/Reel2/Reel2_POS_0023").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0023.png"));
            //22: Gold7
            reel2Pos24OnLight = new Texture("/Reels/Reel2/Reel2_POS_0024").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0024.png"));
                //23: Gap
            reel2Pos25OnLight = new Texture("/Reels/Reel2/Reel2_POS_0025").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0025.png"));
            //24: RedBAR (Special)
            reel2Pos26OnLight = new Texture("/Reels/Reel2/Reel2_POS_0026").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0026.png"));
                //25: Gap
            reel2Pos27OnLight = new Texture("/Reels/Reel2/Reel2_POS_0027").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0027.png"));
            //26: Cherry
            reel2Pos28OnLight = new Texture("/Reels/Reel2/Reel2_POS_0028").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0028.png"));
                //27: Gap
            reel2Pos29OnLight = new Texture("/Reels/Reel2/Reel2_POS_0029").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0029.png"));
            //28: Red7
            reel2Pos30OnLight = new Texture("/Reels/Reel2/Reel2_POS_0030").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0030.png"));
                //29: Gap
            reel2Pos31OnLight = new Texture("/Reels/Reel2/Reel2_POS_0031").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0031.png"));
            //30: GreenBAR
            reel2Pos32OnLight = new Texture("/Reels/Reel2/Reel2_POS_0032").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0032.png"));
                //31: Gap
            reel2Pos33OnLight = new Texture("/Reels/Reel2/Reel2_POS_0033").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel2/Reel2_POS_0033.png"));
            
        
        drawReel2();
         
        reel2Panel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            render(g2d);
        
            reel2Panel.setSize(1280, 720);
            reel2Panel.setOpaque(false);
            reel2Panel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
            }
        };
        
        
    }
    
    
    /**
     * drawReel2()
     * 
     * Draws all the Reel2 images/JButtons
     */
    private void drawReel2() {
        
//        reel2Pos0 = new JButton("reel2Pos0");
//        allReel2.add(reel2Pos0);
        
        reel2Pos1 = new JButton("reel2Pos1");
        allReel2.add(reel2Pos1);
        
        reel2Pos2 = new JButton("reel2Pos2");
        allReel2.add(reel2Pos2);
        
        reel2Pos3 = new JButton("reel2Pos3");
        allReel2.add(reel2Pos3);
        
        reel2Pos4 = new JButton("reel2Pos4");
        allReel2.add(reel2Pos4);
        
        reel2Pos5 = new JButton("reel2Pos5");
        allReel2.add(reel2Pos5);
        
        reel2Pos6 = new JButton("reel2Pos6");
        allReel2.add(reel2Pos6);
        
        reel2Pos7 = new JButton("reel2Pos7");
        allReel2.add(reel2Pos7);
        
        reel2Pos8 = new JButton("reel2Pos8");
        allReel2.add(reel2Pos8);
        
        reel2Pos9 = new JButton("reel2Pos9");
        allReel2.add(reel2Pos9);
        
//        reel2Pos10 = new JButton("reel2Pos10");
//        allReel2.add(reel2Pos10);
        
        reel2Pos11 = new JButton("reel2Pos11");
        allReel2.add(reel2Pos11);
        
        reel2Pos12 = new JButton("reel2Pos12");
        allReel2.add(reel2Pos12);
        
        reel2Pos13 = new JButton("reel2Pos13");
        allReel2.add(reel2Pos13);
        
        reel2Pos14 = new JButton("reel2Pos14");
        allReel2.add(reel2Pos14);
        
        reel2Pos15 = new JButton("reel2Pos15");
        allReel2.add(reel2Pos15);
        
        reel2Pos16 = new JButton("reel2Pos16");
        allReel2.add(reel2Pos16);
        
        reel2Pos17 = new JButton("reel2Pos17");
        allReel2.add(reel2Pos17);
        
        reel2Pos18 = new JButton("reel2Pos18");
        allReel2.add(reel2Pos18);
        
        reel2Pos19 = new JButton("reel2Pos19");
        allReel2.add(reel2Pos19);
        
        reel2Pos20 = new JButton("reel2Pos20");
        allReel2.add(reel2Pos20);
        
        reel2Pos21 = new JButton("reel2Pos21");
        allReel2.add(reel2Pos21);
        
        reel2Pos22 = new JButton("reel2Pos22");
        allReel2.add(reel2Pos22);
        
        reel2Pos23 = new JButton("reel2Pos23");
        allReel2.add(reel2Pos23);
        
        reel2Pos24 = new JButton("reel2Pos24");
        allReel2.add(reel2Pos24);
        
        reel2Pos25 = new JButton("reel2Pos25");
        allReel2.add(reel2Pos25);
        
        reel2Pos26 = new JButton("reel2Pos26");
        allReel2.add(reel2Pos26);
        
        reel2Pos27 = new JButton("reel2Pos27");
        allReel2.add(reel2Pos27);
        
        reel2Pos28 = new JButton("reel2Pos28");
        allReel2.add(reel2Pos28);
        
        reel2Pos29 = new JButton("reel2Pos29");
        allReel2.add(reel2Pos29);
        
        reel2Pos30 = new JButton("reel2Pos30");
        allReel2.add(reel2Pos30);
        
        reel2Pos31 = new JButton("reel2Pos31");
        allReel2.add(reel2Pos31);
        
        reel2Pos32 = new JButton("reel2Pos32");
        allReel2.add(reel2Pos32);
        
        reel2Pos33 = new JButton("reel2Pos33");
        allReel2.add(reel2Pos33);
        
        allReel2Rev.addAll(allReel2);
        Collections.reverse(allReel2Rev);
        
    }
    
    
    /**
     * setR2Hold()
     * 
     * @param result
     */
    public void setR2Hold(boolean result) {
        R2Hold = result;
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
                
        switch(name){
//            case "reel2Pos0":
//                reel2Pos0On = result;
//                break;
            case "reel2Pos1":
                reel2Pos1On = result;
                break;
            case "reel2Pos2":
                reel2Pos2On = result;
                break;
            case "reel2Pos3":
                reel2Pos3On = result;
                break;
            case "reel2Pos4":
                reel2Pos4On = result;
                break;
            case "reel2Pos5":
                reel2Pos5On = result;
                break;
            case "reel2Pos6":
                reel2Pos6On = result;
                break;
            case "reel2Pos7":
                reel2Pos7On = result;
                break;
            case "reel2Pos8":
                reel2Pos8On = result;
                break;
            case "reel2Pos9":
                reel2Pos9On = result;
                break;
//            case "reel2Pos10":
//                reel2Pos10On = result;
//                break;
            case "reel2Pos11":
                reel2Pos11On = result;
                break;
            case "reel2Pos12":
                reel2Pos12On = result;
                break;
            case "reel2Pos13":
                reel2Pos13On = result;
                break;
            case "reel2Pos14":
                reel2Pos14On = result;
                break;
            case "reel2Pos15":
                reel2Pos15On = result;
                break;
            case "reel2Pos16":
                reel2Pos16On = result;
                break;
            case "reel2Pos17":
                reel2Pos17On = result;
                break;
            case "reel2Pos18":
                reel2Pos18On = result;
                break;
            case "reel2Pos19":
                reel2Pos19On = result;
                break;
            case "reel2Pos20":
                reel2Pos20On = result;
                break;
            case "reel2Pos21":
                reel2Pos21On = result;
                break;
            case "reel2Pos22":
                reel2Pos22On = result;
                break;
            case "reel2Pos23":
                reel2Pos23On = result;
                break;
            case "reel2Pos24":
                reel2Pos24On = result;
                break;
            case "reel2Pos25":
                reel2Pos25On = result;
                break;
            case "reel2Pos26":
                reel2Pos26On = result;
                break;
            case "reel2Pos27":
                reel2Pos27On = result;
                break;
            case "reel2Pos28":
                reel2Pos28On = result;
                break;
            case "reel2Pos29":
                reel2Pos29On = result;
                break;
            case "reel2Pos30":
                reel2Pos30On = result;
                break;
            case "reel2Pos31":
                reel2Pos31On = result;
                break;
            case "reel2Pos32":
                reel2Pos32On = result;
                break;
            case "reel2Pos33":
                reel2Pos33On = result;
                break;   
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Reel2 images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
//            case "reel2Pos0":
//                result = reel2Pos0On;
//                break;
            case "reel2Pos1":
                result = reel2Pos1On;
                break;
            case "reel2Pos2":
                result = reel2Pos2On;
                break;
            case "reel2Pos3":
                result = reel2Pos3On;
                break;
            case "reel2Pos4":
                result = reel2Pos4On;
                break;
            case "reel2Pos5":
                result = reel2Pos5On;
                break;
            case "reel2Pos6":
                result = reel2Pos6On;
                break;
            case "reel2Pos7":
                result = reel2Pos7On;
                break;
            case "reel2Pos8":
                result = reel2Pos8On;
                break;
            case "reel2Pos9":
                result = reel2Pos9On;
                break;
//            case "reel2Pos10":
//                result = reel2Pos10On;
//                break;
            case "reel2Pos11":
                result = reel2Pos11On;
                break;
            case "reel2Pos12":
                result = reel2Pos12On;
                break;
            case "reel2Pos13":
                result = reel2Pos13On;
                break;
            case "reel2Pos14":
                result = reel2Pos14On;
                break;
            case "reel2Pos15":
                result = reel2Pos15On;
                break;
            case "reel2Pos16":
                result = reel2Pos16On;
                break;
            case "reel2Pos17":
                result = reel2Pos17On;
                break;
            case "reel2Pos18":
                result = reel2Pos18On;
                break;
            case "reel2Pos19":
                result = reel2Pos19On;
                break;
            case "reel2Pos20":
                result = reel2Pos20On;
                break;
            case "reel2Pos21":
                result = reel2Pos21On;
                break;
            case "reel2Pos22":
                result = reel2Pos22On;
                break;
            case "reel2Pos23":
                result = reel2Pos23On;
                break;
            case "reel2Pos24":
                result = reel2Pos24On;
                break;
            case "reel2Pos25":
                result = reel2Pos25On;
                break;
            case "reel2Pos26":
                result = reel2Pos26On;
                break;
            case "reel2Pos27":
                result = reel2Pos27On;
                break;
            case "reel2Pos28":
                result = reel2Pos28On;
                break;
            case "reel2Pos29":
                result = reel2Pos29On;
                break;
            case "reel2Pos30":
                result = reel2Pos30On;
                break;
            case "reel2Pos31":
                result = reel2Pos31On;
                break;
            case "reel2Pos32":
                result = reel2Pos32On;
                break;
            case "reel2Pos33":
                result = reel2Pos33On;
                break;   
        }
        
        return result;
    }
    
    
    /**
     * getAllReel2()
     * 
     * @return allReel2 - returns Reel2 images/JButtons
     */
    public List<JButton> getAllReel2() {
        return allReel2;
    }
    
    
    /**
     * spinReel2Reverse()
     * 
     */
    public void spinReel2Reverse(){
        spinReel2Reverse.run();
    }
    
    
    /**
     * spinReel2()
     * 
     */
    public void spinReel2(){
        spinReel2.run();
    }
    
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g) {
//        if (reel2Pos0On){
//            g.drawImage(reel2Pos0OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
//        } 

        if (reel2Pos1On){
            g.drawImage(reel2Pos1OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos2On){
            g.drawImage(reel2Pos2OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos3On){
            g.drawImage(reel2Pos3OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos4On){
            g.drawImage(reel2Pos4OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos5On){
            g.drawImage(reel2Pos5OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos6On){
            g.drawImage(reel2Pos6OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos7On){
            g.drawImage(reel2Pos7OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos8On){
            g.drawImage(reel2Pos8OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos9On){
            g.drawImage(reel2Pos9OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

//        if (reel2Pos10On){
//            g.drawImage(reel2Pos10OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
//        } 

        if (reel2Pos11On){
            g.drawImage(reel2Pos11OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos12On){
            g.drawImage(reel2Pos12OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos13On){
            g.drawImage(reel2Pos13OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos14On){
            g.drawImage(reel2Pos14OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos15On){
            g.drawImage(reel2Pos15OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos16On){
            g.drawImage(reel2Pos16OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos17On){
            g.drawImage(reel2Pos17OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos18On){
            g.drawImage(reel2Pos18OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos19On){
            g.drawImage(reel2Pos19OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos20On){
            g.drawImage(reel2Pos20OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos21On){
            g.drawImage(reel2Pos21OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos22On){
            g.drawImage(reel2Pos22OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos23On){
            g.drawImage(reel2Pos23OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos24On){
            g.drawImage(reel2Pos24OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos25On){
            g.drawImage(reel2Pos25OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos26On){
            g.drawImage(reel2Pos26OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos27On){
            g.drawImage(reel2Pos27OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos28On){
            g.drawImage(reel2Pos28OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos29On){
            g.drawImage(reel2Pos29OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos30On){
            g.drawImage(reel2Pos30OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos31On){
            g.drawImage(reel2Pos31OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos32On){
            g.drawImage(reel2Pos32OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 

        if (reel2Pos33On){
            g.drawImage(reel2Pos33OnLight, reel2PosX, reel2PosY, reel2Width, reel2Height, null);
        } 
            
        g.dispose();
    }

    
    /**
     * isGap(int reel2)
     * 
     * @param reel2
     * @return 
     */
    public boolean isGap(int reel2){
        boolean result;
        if((reel2 % 2) != 0){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    
    /**
     * isSpecial(int reel2)
     * 
     * @param reel2
     * @return 
     */
    public boolean isSpecial(int reel2) {
        
        if(reel2 == 6 || reel2 == 18 || reel2 == 24){
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * spinReel2Reverse()
     * 
     * @param reel2
     */
    public void spinReel2Reverse(int reel2) {
        if(!R2Hold){
            //for(int c = 0; c < reel2; c++){
                spinReel2Reverse();
            //}
        }
    }
    
    
    /**
     * spinReel2()
     * 
     * @param reel2
     */
    public void spinReel2(int reel2) {
        if(!R2Hold){
            for(int c = 0; c < reel2; c++){
                spinReel2();
            }
        }
    }

    
    /**
     * nudgeR2()
     * 
     */
    public void nudgeR2() {
        for(int c = 0; c < 2; c++){
            spinReel2();
        }
    }

    
    /**
     * nudgeR2Reverse()
     * 
     */
    public void nudgeR2Reverse() {
        for(int c = 0; c < 2; c++){
            spinReel2Reverse();
        }
    }
    
    
    /**
     * getR2Hold()
     * 
     * @return R2Hold
     */
    public boolean getR2Hold() {
        return R2Hold;
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
     * getSymbol(int r2)
     * 
     * @param r2
     * @return iconR2
     */
    public String getSymbol(int r2) {
        
        String iconR2 = "";
        
        switch(r2){
            case 0:
                iconR2 = "Gold7";
                break;
            case 2:
                iconR2 = "GreenBAR";
                break;
            case 4:
                iconR2 = "GoldBAR";
                break;
            case 6:
                iconR2 = "Cherry";
                break;
            case 8:
                iconR2 = "Blue7";
                break;
            case 10:
                iconR2 = "GreenBAR";
                break;
            case 12:
                iconR2 = "Cherry";
                break;
            case 14:
                iconR2 = "GoldBell";
                break;
            case 16:
                iconR2 = "GoldBAR";
                break;
            case 18:
                iconR2 = "Cherry";
                break;
            case 20:
                iconR2 = "GreenBAR";
                break;
            case 22:
                iconR2 = "Gold7";
                break;
            case 24:
                iconR2 = "RedBAR";
                break;
            case 26:
                iconR2 = "Cherry";
                break;
            case 28:
                iconR2 = "Red7";
                break;
            case 30:
                iconR2 = "GreenBAR";
                break;
        }        
        
        return iconR2;
    }

    public int getIndex(String letEmSpinIcon) {
        int index = 0;
        
        switch(letEmSpinIcon){
            case "Gold7":
                index = 0;
                break;
            case "GreenBAR":
                index = 2;
                break;
            case "GoldBAR":
                index = 4;
                break;
            case "Cherry":
                index = 6;
                break;
            case "Blue7":
                index = 8;
                break;
            case "GoldBell":
                index = 14;
                break;
            case "RedBAR":
                index = 24;
                break;
            case "Red7":
                index = 28;
                break;
        }        
        
        return index;
    }
    
}
