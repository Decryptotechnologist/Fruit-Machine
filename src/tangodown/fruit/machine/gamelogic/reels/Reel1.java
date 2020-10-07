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
public class Reel1 {

    /**Attributes*/
    
    /**reel1width variable of Reel1 object */
    public int reel1Width = 176;
    
    /**reel1height variable of Reel1 object */
    public int reel1Height = 152;
    
    /**reel1PosX variable of Reel1 object */
    private final int reel1PosX = 455;
    
    /**reel1PosY variable of Reel1 object */
    private final int reel1PosY = 413;
    
    /**reel1Pos0 button variables of Reel1 object */ 
    public JButton reel1Pos0;
    private BufferedImage reel1Pos0OnLight;
    private static boolean reel1Pos0On;
    
    /**reel1Pos1 button variables of Reel1 object */ 
    public JButton reel1Pos1;
    private BufferedImage reel1Pos1OnLight;
    private static boolean reel1Pos1On;
    
    /**reel1Pos2 button variables of Reel1 object */ 
    public JButton reel1Pos2;
    private BufferedImage reel1Pos2OnLight;
    private static boolean reel1Pos2On;
    
    /**reel1Pos3 button variables of Reel1 object */ 
    public JButton reel1Pos3;
    private BufferedImage reel1Pos3OnLight;
    private static boolean reel1Pos3On;
    
    /**reel1Pos4 button variables of Reel1 object */ 
    public JButton reel1Pos4;
    private BufferedImage reel1Pos4OnLight;
    private static boolean reel1Pos4On;
    
    /**reel1Pos5 button variables of Reel1 object */ 
    public JButton reel1Pos5;
    private BufferedImage reel1Pos5OnLight;
    private static boolean reel1Pos5On;
    
    /**reel1Pos6 button variables of Reel1 object */ 
    public JButton reel1Pos6;
    private BufferedImage reel1Pos6OnLight;
    private static boolean reel1Pos6On;
    
    /**reel1Pos7 button variables of Reel1 object */ 
    public JButton reel1Pos7;
    private BufferedImage reel1Pos7OnLight;
    private static boolean reel1Pos7On;
    
    /**reel1Pos8 button variables of Reel1 object */ 
    public JButton reel1Pos8;
    private BufferedImage reel1Pos8OnLight;
    private static boolean reel1Pos8On;
    
    /**reel1Pos9 button variables of Reel1 object */ 
    public JButton reel1Pos9;
    private BufferedImage reel1Pos9OnLight;
    private static boolean reel1Pos9On;
    
    /**reel1Pos10 button variables of Reel1 object */ 
    public JButton reel1Pos10;
    private BufferedImage reel1Pos10OnLight;
    private static boolean reel1Pos10On;
    
    /**reel1Pos11 button variables of Reel1 object */ 
    public JButton reel1Pos11;
    private BufferedImage reel1Pos11OnLight;
    private static boolean reel1Pos11On;
    
    /**reel1Pos12 button variables of Reel1 object */ 
    public JButton reel1Pos12;
    private BufferedImage reel1Pos12OnLight;
    private static boolean reel1Pos12On;
    
    /**reel1Pos13 button variables of Reel1 object */ 
    public JButton reel1Pos13;
    private BufferedImage reel1Pos13OnLight;
    private static boolean reel1Pos13On;
    
    /**reel1Pos14 button variables of Reel1 object */ 
    public JButton reel1Pos14;
    private BufferedImage reel1Pos14OnLight;
    private static boolean reel1Pos14On;
    
    /**reel1Pos15 button variables of Reel1 object */ 
    public JButton reel1Pos15;
    private BufferedImage reel1Pos15OnLight;
    private static boolean reel1Pos15On;
    
    /**reel1Pos16 button variables of Reel1 object */ 
    public JButton reel1Pos16;
    private BufferedImage reel1Pos16OnLight;
    private static boolean reel1Pos16On;
    
    /**reel1Pos17 button variables of Reel1 object */ 
    public JButton reel1Pos17;
    private BufferedImage reel1Pos17OnLight;
    private static boolean reel1Pos17On;
    
    /**reel1Pos18 button variables of Reel1 object */ 
    public JButton reel1Pos18;
    private BufferedImage reel1Pos18OnLight;
    private static boolean reel1Pos18On;
    
    /**reel1Pos19 button variables of Reel1 object */ 
    public JButton reel1Pos19;
    private BufferedImage reel1Pos19OnLight;
    private static boolean reel1Pos19On;
    
    /**reel1Pos20 button variables of Reel1 object */ 
    public JButton reel1Pos20;
    private BufferedImage reel1Pos20OnLight;
    private static boolean reel1Pos20On;
    
    /**reel1Pos21 button variables of Reel1 object */ 
    public JButton reel1Pos21;
    private BufferedImage reel1Pos21OnLight;
    private static boolean reel1Pos21On;
    
    /**reel1Pos22 button variables of Reel1 object */ 
    public JButton reel1Pos22;
    private BufferedImage reel1Pos22OnLight;
    private static boolean reel1Pos22On;
    
    /**reel1Pos23 button variables of Reel1 object */ 
    public JButton reel1Pos23;
    private BufferedImage reel1Pos23OnLight;
    private static boolean reel1Pos23On;
    
    /**Reel1Pos0 button variables of Reel1 object */ 
    public JButton reel1Pos24;
    private BufferedImage reel1Pos24OnLight;
    private static boolean reel1Pos24On;
    
    /**Reel1Pos0 button variables of Reel1 object */ 
    public JButton reel1Pos25;
    private BufferedImage reel1Pos25OnLight;
    private static boolean reel1Pos25On;
    
    /**reel1Pos26 button variables of Reel1 object */ 
    public JButton reel1Pos26;
    private BufferedImage reel1Pos26OnLight;
    private static boolean reel1Pos26On;
    
    /**reel1Pos27 button variables of Reel1 object */ 
    public JButton reel1Pos27;
    private BufferedImage reel1Pos27OnLight;
    private static boolean reel1Pos27On;
    
    /**reel1Pos28 button variables of Reel1 object */ 
    public JButton reel1Pos28;
    private BufferedImage reel1Pos28OnLight;
    private static boolean reel1Pos28On;
    
    /**reel1Pos29 button variables of Reel1 object */ 
    public JButton reel1Pos29;
    private BufferedImage reel1Pos29OnLight;
    private static boolean reel1Pos29On;
    
    /**reel1Pos30 button variables of Reel1 object */ 
    public JButton reel1Pos30;
    private BufferedImage reel1Pos30OnLight;
    private static boolean reel1Pos30On;
    
    /**reel1Pos31 button variables of Reel1 object */ 
    public JButton reel1Pos31;
    private BufferedImage reel1Pos31OnLight;
    private static boolean reel1Pos31On;
    
    /**allReel1 List variable of Reel1 object */
    private final List<JButton> allReel1;
    
    /**reel1Panel JPanel variable of Reel1 object */
    public JPanel reel1Panel = new JPanel();   
    
    /**reelsBGX variable of Reel1 object */ 
    private final int ReelsbgX = 141;
    
    /**reelsBGY variable of Reel1 object */ 
    private final int ReelsbgY = 345;
    
    /**reelsbg BufferedImage variable of Reel1 object */ 
    private BufferedImage Reelsbg; 
    
    /**R1Hold variable of Reel1 object */ 
    private static boolean R1Hold;
    
    /**allReel1Rev List variable of Reel1 object */
    private final List<JButton> allReel1Rev;
    
    /**spinReel1 Runnable variable of Reel1 object */
    private final Runnable spinReel1;
    
    /**currentPOS variable of Reel1 object */ 
    private int currentPOS;
    
    /**spinReel1Reverse Runnable variable of Reel1 object */
    private final Runnable spinReel1Reverse;
    
    
    
    /**Constructor*/
    
    /**
     * Reel1 Constructor
     * 
     */
    public Reel1(){
        allReel1 = new ArrayList<>();
        allReel1Rev = new ArrayList<>();
        init();
        
        spinReel1 = new Runnable(){
            @Override
            public void run(){
                int newPOS;

                for(int c = 0; c < allReel1.size(); c++){
                    if(getOn(allReel1.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReel1.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel1.get(c).getText(), false);

                        break;
                    } 
                }
        
            }
        };
        
        spinReel1Reverse = new Runnable(){
            @Override
            public void run(){
                int newPOS;

                for(int c = 0; c < allReel1Rev.size(); c++){
                    if(getOn(allReel1Rev.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 32){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReel1Rev.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReel1Rev.get(c).getText(), false);

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
     * Initiates all the Reel1 images/JButtons
     *
     */
    private void init() {
        
        //0: Gold7
        reel1Pos0OnLight = new Texture("/Reels/Reel1/Reel1_POS_0032").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0000.png"));
            //1: Gap
        reel1Pos1OnLight = new Texture("/Reels/Reel1/Reel1_POS_0001").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0001.png"));
        //2: Cherry
        reel1Pos2OnLight = new Texture("/Reels/Reel1/Reel1_POS_0002").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0002.png"));
            //3: Gap
        reel1Pos3OnLight = new Texture("/Reels/Reel1/Reel1_POS_0003").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0003.png"));
        //4: RedBAR
        reel1Pos4OnLight = new Texture("/Reels/Reel1/Reel1_POS_0004").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0004.png"));
            //5: Gap
        reel1Pos5OnLight = new Texture("/Reels/Reel1/Reel1_POS_0005").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0005.png"));
        //6: GoldBAR
        reel1Pos6OnLight = new Texture("/Reels/Reel1/Reel1_POS_0006").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0006.png"));
            //7: Gap
        reel1Pos7OnLight = new Texture("/Reels/Reel1/Reel1_POS_0007").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0007.png"));
        //8: Blue7
        reel1Pos8OnLight = new Texture("/Reels/Reel1/Reel1_POS_0008").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0008.png"));
            //9: Gap
        reel1Pos9OnLight = new Texture("/Reels/Reel1/Reel1_POS_0009").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0009.png"));
        //10: GoldBell
        reel1Pos10OnLight = new Texture("/Reels/Reel1/Reel1_POS_0010").getImage();// ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0010.png"));
            //11: Gap
        reel1Pos11OnLight = new Texture("/Reels/Reel1/Reel1_POS_0011").getImage();// ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0011.png"));
        //12: RedBAR
        reel1Pos12OnLight = new Texture("/Reels/Reel1/Reel1_POS_0012").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0012.png"));
            //13: Gap
        reel1Pos13OnLight = new Texture("/Reels/Reel1/Reel1_POS_0013").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0013.png"));
        //14: Red7
        reel1Pos14OnLight = new Texture("/Reels/Reel1/Reel1_POS_0014").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0014.png"));
            //15: Gap
        reel1Pos15OnLight = new Texture("/Reels/Reel1/Reel1_POS_0015").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0015.png"));
        //16: Cherry
        reel1Pos16OnLight = new Texture("/Reels/Reel1/Reel1_POS_0016").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0016.png"));
            //17: Gap
        reel1Pos17OnLight = new Texture("/Reels/Reel1/Reel1_POS_0017").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0017.png"));
        //18: GreenBAR
        reel1Pos18OnLight = new Texture("/Reels/Reel1/Reel1_POS_0018").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0018.png"));
            //19: Gap
        reel1Pos19OnLight = new Texture("/Reels/Reel1/Reel1_POS_0019").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0019.png"));
        //20: Blue7 (Special)
        reel1Pos20OnLight = new Texture("/Reels/Reel1/Reel1_POS_0020").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0020.png"));
            //21: Gap
        reel1Pos21OnLight = new Texture("/Reels/Reel1/Reel1_POS_0021").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0021.png"));
        //22: Cherry
        reel1Pos22OnLight = new Texture("/Reels/Reel1/Reel1_POS_0022").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0022.png"));
            //23: Gap
        reel1Pos23OnLight = new Texture("/Reels/Reel1/Reel1_POS_0023").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0023.png"));
        //24: Red7
        reel1Pos24OnLight = new Texture("/Reels/Reel1/Reel1_POS_0024").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0024.png"));
            //25: Gap
        reel1Pos25OnLight = new Texture("/Reels/Reel1/Reel1_POS_0025").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0025.png"));
        //26: RedBAR
        reel1Pos26OnLight = new Texture("/Reels/Reel1/Reel1_POS_0026").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0026.png"));
            //27: Gap
        reel1Pos27OnLight = new Texture("/Reels/Reel1/Reel1_POS_0027").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0027.png"));
        //28: GreenBAR  (Special)
        reel1Pos28OnLight = new Texture("/Reels/Reel1/Reel1_POS_0028").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0028.png"));
            //29: Gap
        reel1Pos29OnLight = new Texture("/Reels/Reel1/Reel1_POS_0029").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0029.png"));
        //30: GoldBell
        reel1Pos30OnLight = new Texture("/Reels/Reel1/Reel1_POS_0030").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0030.png"));
            //31: Gap
        reel1Pos31OnLight = new Texture("/Reels/Reel1/Reel1_POS_0032").getImage();//ImageIO.read(getClass().getResource("/Reels/Reel1/Reel1_POS_0031.png"));        


        Reelsbg = new Texture("/Static/fruit-machine-REELS-CASINGA").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-REELS-CASINGA.png"));

        drawReel1();
         
        reel1Panel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            render(g2d);
        
            reel1Panel.setSize(1280, 720);
            reel1Panel.setOpaque(false);
            reel1Panel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        }};
        
    }
    
    
    /**
     * drawReel1()
     * 
     * Draws all the Reel1 images/JButtons
     */
    private void drawReel1() {
        
        reel1Pos0 = new JButton("reel1Pos0");
        allReel1.add(reel1Pos0);
        
        reel1Pos1 = new JButton("reel1Pos1");
        allReel1.add(reel1Pos1);
        
        reel1Pos2 = new JButton("reel1Pos2");
        allReel1.add(reel1Pos2);
        
        reel1Pos3 = new JButton("reel1Pos3");
        allReel1.add(reel1Pos3);
        
        reel1Pos4 = new JButton("reel1Pos4");
        allReel1.add(reel1Pos4);
        
        reel1Pos5 = new JButton("reel1Pos5");
        allReel1.add(reel1Pos5);
        
        reel1Pos6 = new JButton("reel1Pos6");
        allReel1.add(reel1Pos6);
        
        reel1Pos7 = new JButton("reel1Pos7");
        allReel1.add(reel1Pos7);
        
        reel1Pos8 = new JButton("reel1Pos8");
        allReel1.add(reel1Pos8);
        
        reel1Pos9 = new JButton("reel1Pos9");
        allReel1.add(reel1Pos9);
        
        reel1Pos10 = new JButton("reel1Pos10");
        allReel1.add(reel1Pos10);
        
        reel1Pos11 = new JButton("reel1Pos11");
        allReel1.add(reel1Pos11);
        
        reel1Pos12 = new JButton("reel1Pos12");
        allReel1.add(reel1Pos12);
        
        reel1Pos13 = new JButton("reel1Pos13");
        allReel1.add(reel1Pos13);
        
        reel1Pos14 = new JButton("reel1Pos14");
        allReel1.add(reel1Pos14);
        
        reel1Pos15 = new JButton("reel1Pos15");
        allReel1.add(reel1Pos15);
        
        reel1Pos16 = new JButton("reel1Pos16");
        allReel1.add(reel1Pos16);
        
        reel1Pos17 = new JButton("reel1Pos17");
        allReel1.add(reel1Pos17);
        
        reel1Pos18 = new JButton("reel1Pos18");
        allReel1.add(reel1Pos18);
        
        reel1Pos19 = new JButton("reel1Pos19");
        allReel1.add(reel1Pos19);
        
        reel1Pos20 = new JButton("reel1Pos20");
        allReel1.add(reel1Pos20);
        
        reel1Pos21 = new JButton("reel1Pos21");
        allReel1.add(reel1Pos21);
        
        reel1Pos22 = new JButton("reel1Pos22");
        allReel1.add(reel1Pos22);
        
        reel1Pos23 = new JButton("reel1Pos23");
        allReel1.add(reel1Pos23);
        
        reel1Pos24 = new JButton("reel1Pos24");
        allReel1.add(reel1Pos24);
        
        reel1Pos25 = new JButton("reel1Pos25");
        allReel1.add(reel1Pos25);
        
        reel1Pos26 = new JButton("reel1Pos26");
        allReel1.add(reel1Pos26);
        
        reel1Pos27 = new JButton("reel1Pos27");
        allReel1.add(reel1Pos27);
        
        reel1Pos28 = new JButton("reel1Pos28");
        allReel1.add(reel1Pos28);
        
        reel1Pos29 = new JButton("reel1Pos29");
        allReel1.add(reel1Pos29);
        
        reel1Pos30 = new JButton("reel1Pos30");
        allReel1.add(reel1Pos30);
        
        reel1Pos31 = new JButton("reel1Pos31");
        allReel1.add(reel1Pos31);
        
        allReel1Rev.addAll(allReel1);
        Collections.reverse(allReel1Rev);
        
    }
    
    
    /**
     * setR1Hold()
     * 
     * @param result
     */
    public void setR1Hold(boolean result) {
        R1Hold = result;
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "reel1Pos0":
                reel1Pos0On = result;
                break;
            case "reel1Pos1":
                reel1Pos1On = result;
                break;
            case "reel1Pos2":
                reel1Pos2On = result;
                break;
            case "reel1Pos3":
                reel1Pos3On = result;
                break;
            case "reel1Pos4":
                reel1Pos4On = result;
                break;
            case "reel1Pos5":
                reel1Pos5On = result;
                break;
            case "reel1Pos6":
                reel1Pos6On = result;
                break;
            case "reel1Pos7":
                reel1Pos7On = result;
                break;
            case "reel1Pos8":
                reel1Pos8On = result;
                break;
            case "reel1Pos9":
                reel1Pos9On = result;
                break;
            case "reel1Pos10":
                reel1Pos10On = result;
                break;
            case "reel1Pos11":
                reel1Pos11On = result;
                break;
            case "reel1Pos12":
                reel1Pos12On = result;
                break;
            case "reel1Pos13":
                reel1Pos13On = result;
                break;
            case "reel1Pos14":
                reel1Pos14On = result;
                break;
            case "reel1Pos15":
                reel1Pos15On = result;
                break;
            case "reel1Pos16":
                reel1Pos16On = result;
                break;
            case "reel1Pos17":
                reel1Pos17On = result;
                break;
            case "reel1Pos18":
                reel1Pos18On = result;
                break;
            case "reel1Pos19":
                reel1Pos19On = result;
                break;
            case "reel1Pos20":
                reel1Pos20On = result;
                break;
            case "reel1Pos21":
                reel1Pos21On = result;
                break;
            case "reel1Pos22":
                reel1Pos22On = result;
                break;
            case "reel1Pos23":
                reel1Pos23On = result;
                break;
            case "reel1Pos24":
                reel1Pos24On = result;
                break;
            case "reel1Pos25":
                reel1Pos25On = result;
                break;
            case "reel1Pos26":
                reel1Pos26On = result;
                break;
            case "reel1Pos27":
                reel1Pos27On = result;
                break;
            case "reel1Pos28":
                reel1Pos28On = result;
                break;
            case "reel1Pos29":
                reel1Pos29On = result;
                break;
            case "reel1Pos30":
                reel1Pos30On = result;
                break;
            case "reel1Pos31":
                reel1Pos31On = result;
                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Reel1 images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "reel1Pos0":
                result = reel1Pos0On;
                break;
            case "reel1Pos1":
                result = reel1Pos1On;
                break;
            case "reel1Pos2":
                result = reel1Pos2On;
                break;
            case "reel1Pos3":
                result = reel1Pos3On;
                break;
            case "reel1Pos4":
                result = reel1Pos4On;
                break;
            case "reel1Pos5":
                result = reel1Pos5On;
                break;
            case "reel1Pos6":
                result = reel1Pos6On;
                break;
            case "reel1Pos7":
                result = reel1Pos7On;
                break;
            case "reel1Pos8":
                result = reel1Pos8On;
                break;
            case "reel1Pos9":
                result = reel1Pos9On;
                break;
            case "reel1Pos10":
                result = reel1Pos10On;
                break;
            case "reel1Pos11":
                result = reel1Pos11On;
                break;
            case "reel1Pos12":
                result = reel1Pos12On;
                break;
            case "reel1Pos13":
                result = reel1Pos13On;
                break;
            case "reel1Pos14":
                result = reel1Pos14On;
                break;
            case "reel1Pos15":
                result = reel1Pos15On;
                break;
            case "reel1Pos16":
                result = reel1Pos16On;
                break;
            case "reel1Pos17":
                result = reel1Pos17On;
                break;
            case "reel1Pos18":
                result = reel1Pos18On;
                break;
            case "reel1Pos19":
                result = reel1Pos19On;
                break;
            case "reel1Pos20":
                result = reel1Pos20On;
                break;
            case "reel1Pos21":
                result = reel1Pos21On;
                break;
            case "reel1Pos22":
                result = reel1Pos22On;
                break;
            case "reel1Pos23":
                result = reel1Pos23On;
                break;
            case "reel1Pos24":
                result = reel1Pos24On;
                break;
            case "reel1Pos25":
                result = reel1Pos25On;
                break;
            case "reel1Pos26":
                result = reel1Pos26On;
                break;
            case "reel1Pos27":
                result = reel1Pos27On;
                break;
            case "reel1Pos28":
                result = reel1Pos28On;
                break;
            case "reel1Pos29":
                result = reel1Pos29On;
                break;
            case "reel1Pos30":
                result = reel1Pos30On;
                break;
            case "reel1Pos31":
                result = reel1Pos31On;
                break;
        }

        return result;
    }
    
    
    /**
     * getAllReel1()
     * 
     * @return allReel1 - returns Reel1 images/JButtons
     */
    public List<JButton> getAllReel1() {
        return allReel1;
    }
    
    
    /**
     * spinReel1Reverse()
     * 
     */
    public void spinReel1Reverse(){
        spinReel1Reverse.run();
    }
    
    
    /**
     * spinReel1()
     * 
     */
    public void spinReel1(){
        spinReel1.run();
    }

    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g) {
        
        if (reel1Pos0On){
            g.drawImage(reel1Pos0OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos1On){
            g.drawImage(reel1Pos1OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos2On){
            g.drawImage(reel1Pos2OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos3On){
            g.drawImage(reel1Pos3OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos4On){
            g.drawImage(reel1Pos4OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos5On){
            g.drawImage(reel1Pos5OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos6On){
            g.drawImage(reel1Pos6OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos7On){
            g.drawImage(reel1Pos7OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos8On){
            g.drawImage(reel1Pos8OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos9On){
            g.drawImage(reel1Pos9OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos10On){
            g.drawImage(reel1Pos10OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos11On){
            g.drawImage(reel1Pos11OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos12On){
            g.drawImage(reel1Pos12OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos13On){
            g.drawImage(reel1Pos13OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos14On){
            g.drawImage(reel1Pos14OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos15On){
            g.drawImage(reel1Pos15OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos16On){
            g.drawImage(reel1Pos16OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos17On){
            g.drawImage(reel1Pos17OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos18On){
            g.drawImage(reel1Pos18OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos19On){
            g.drawImage(reel1Pos19OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos20On){
            g.drawImage(reel1Pos20OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos21On){
            g.drawImage(reel1Pos21OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos22On){
            g.drawImage(reel1Pos22OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos23On){
            g.drawImage(reel1Pos23OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos24On){
            g.drawImage(reel1Pos24OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos25On){
            g.drawImage(reel1Pos25OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos26On){
            g.drawImage(reel1Pos26OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos27On){
            g.drawImage(reel1Pos27OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos28On){
            g.drawImage(reel1Pos28OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos29On){
            g.drawImage(reel1Pos29OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos30On){
            g.drawImage(reel1Pos30OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        if (reel1Pos31On){
            g.drawImage(reel1Pos31OnLight, reel1PosX, reel1PosY, reel1Width, reel1Height, null);
        } 

        //Draw Reelsbg
        g.drawImage(Reelsbg, ReelsbgX, ReelsbgY, 500, 266, null);
            
        g.dispose();
    }

    
    /**
     * isGap(int reel1)
     * 
     * @param reel1
     * @return 
     */
    public boolean isGap(int reel1){
        boolean result;
        if((reel1 % 2) != 0){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    
    /**
     * spinReel1Reverse()
     * 
     * @param reel1
     */
    public void spinReel1Reverse(int reel1) {
        if(!R1Hold){
            //for(int c = 0; c < reel1; c++){
                spinReel1Reverse();
            //}
        }
    }
    
    
    /**
     * spinReel1()
     * 
     * @param reel1
     */
    public void spinReel1(int reel1) {
        if(!R1Hold){
            for(int c = 0; c < reel1; c++){
                spinReel1();
            }
        }
    }

    
    /**
     * nudgeR1()
     * 
     */
    public void nudgeR1() {
        for(int c = 0; c < 2; c++){
            spinReel1();
        }
    }
    
    
    /**
     * nudgeR1Reverse()
     * 
     */
    public void nudgeR1Reverse() {
        for(int c = 0; c < 2; c++){
            spinReel1Reverse();
        }
    }

    
    /**
     * getR1Hold()
     * 
     * @return R1Hold
     */
    public boolean getR1Hold() {
        return R1Hold;
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
     * getSymbol(int r1)
     * 
     * @param r1
     * @return
     */
    public String getSymbol(int r1) {
        
        String iconR1 = "";
        
        switch(r1){
            case 0:
                iconR1 = "Gold7";
                break;
            case 2:
                iconR1 = "Cherry";
                break;
            case 4:
                iconR1 = "RedBAR";
                break;
            case 6:
                iconR1 = "GoldBAR";
                break;
            case 8:
                iconR1 = "Blue7";
                break;
            case 10:
                iconR1 = "GoldBell";
                break;
            case 12:
                iconR1 = "RedBAR";
                break;
            case 14:
                iconR1 = "Red7";
                break;
            case 16:
                iconR1 = "Cherry";
                break;
            case 18:
                iconR1 = "GreenBAR";
                break;
            case 20:
                iconR1 = "Blue7";
                break;
            case 22:
                iconR1 = "Cherry";
                break;
            case 24:
                iconR1 = "Red7";
                break;
            case 26:
                iconR1 = "RedBAR";
                break;
            case 28:
                iconR1 = "GreenBAR";
                break;
            case 30:
                iconR1 = "GoldBell";
                break;
        }        
        
        return iconR1;
    }

    
    /**
     * isSpecial(int reel1)
     * 
     * @param reel1
     * @return 
     */
    public boolean isSpecial(int reel1) {
        if(reel1 == 20 || reel1 == 28){
            return true;
        } else {
            return false;
        }
    }

    
    public int getIndex(String letEmSpinIcon) {
        int index = 0;
        
        switch(letEmSpinIcon){
            case "Gold7":
                index = 0;
                break;
            case "Cherry":
                index = 2;
                break;
            case "RedBAR":
                index = 4;
                break;
            case "GoldBAR":
                index = 6;
                break;
            case "Blue7":
                index = 8;
                break;
            case "GoldBell":
                index = 10;
                break;
            case "Red7":
                index = 14;
                break;
            case "GreenBAR":
                index = 18;
                break;
        }        
        
        return index;
    }

    
}
