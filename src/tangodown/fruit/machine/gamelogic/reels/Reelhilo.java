/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.reels;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.Texture;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;


/**
 * @author Ghomez
 */
public class Reelhilo {
    
    /**Attributes*/
    
    /**Reel2 width variable of Reel2 object */
    public int reelhiloWidth = 136;
    
    /**Reel2 height variable of Reel2 object */
    public int reelhiloHeight = 60;
    
    private final int reelhiloPosX = 298;
    
    private final int reelhiloPosY = 185;
    
    /**ReelhiloPos0 button variables of Reelhilo object */ 
    public JButton reelhiloPos0;
    private BufferedImage reelhiloPos0OnLight;
    private static boolean reelhiloPos0On;
    
    /**reelhiloPos1 button variables of Reelhilo object */ 
    public JButton reelhiloPos1;
    private BufferedImage reelhiloPos1OnLight;
    private static boolean reelhiloPos1On;
    
    /**reelhiloPos2 button variables of Reelhilo object */ 
    public JButton reelhiloPos2;
    private BufferedImage reelhiloPos2OnLight;
    private static boolean reelhiloPos2On;
    
    /**reelhiloPos3 button variables of Reelhilo object */ 
    public JButton reelhiloPos3;
    private BufferedImage reelhiloPos3OnLight;
    private static boolean reelhiloPos3On;
    
    /**reelhiloPos4 button variables of Reelhilo object */ 
    public JButton reelhiloPos4;
    private BufferedImage reelhiloPos4OnLight;
    private static boolean reelhiloPos4On;
    
    /**reelhiloPos5 button variables of Reelhilo object */ 
    public JButton reelhiloPos5;
    private BufferedImage reelhiloPos5OnLight;
    private static boolean reelhiloPos5On;
    
    /**reelhiloPos6 button variables of Reelhilo object */ 
//    public JButton reelhiloPos6;
//    private BufferedImage reelhiloPos6OnLight;
//    private static boolean reelhiloPos6On;
    
    /**reelhiloPos7 button variables of Reelhilo object */ 
    public JButton reelhiloPos7;
    private BufferedImage reelhiloPos7OnLight;
    private static boolean reelhiloPos7On;
    
    /**reelhiloPos8 button variables of Reelhilo object */ 
    public JButton reelhiloPos8;
    private BufferedImage reelhiloPos8OnLight;
    private static boolean reelhiloPos8On;
    
    /**reelhiloPos9 button variables of Reelhilo object */ 
    public JButton reelhiloPos9;
    private BufferedImage reelhiloPos9OnLight;
    private static boolean reelhiloPos9On;
    
    /**reelhiloPos10 button variables of Reelhilo object */ 
    public JButton reelhiloPos10;
    private BufferedImage reelhiloPos10OnLight;
    private static boolean reelhiloPos10On;
    
    /**reelhiloPos11 button variables of Reelhilo object */ 
    public JButton reelhiloPos11;
    private BufferedImage reelhiloPos11OnLight;
    private static boolean reelhiloPos11On;
    
    /**reelhiloPos12 button variables of Reelhilo object */ 
    public JButton reelhiloPos12;
    private BufferedImage reelhiloPos12OnLight;
    private static boolean reelhiloPos12On;
    
    /**reelhiloPos13 button variables of Reelhilo object */ 
    public JButton reelhiloPos13;
    private BufferedImage reelhiloPos13OnLight;
    private static boolean reelhiloPos13On;
    
    /**reelhiloPos14 button variables of Reelhilo object */ 
    public JButton reelhiloPos14;
    private BufferedImage reelhiloPos14OnLight;
    private static boolean reelhiloPos14On;
    
    /**reelhiloPos15 button variables of Reelhilo object */ 
    public JButton reelhiloPos15;
    private BufferedImage reelhiloPos15OnLight;
    private static boolean reelhiloPos15On;
    
    /**reelhiloPos16 button variables of Reelhilo object */ 
    public JButton reelhiloPos16;
    private BufferedImage reelhiloPos16OnLight;
    private static boolean reelhiloPos16On;
    
    /**reelhiloPos17 button variables of Reelhilo object */ 
    public JButton reelhiloPos17;
    private BufferedImage reelhiloPos17OnLight;
    private static boolean reelhiloPos17On;
    
    /**reelhiloPos18 button variables of Reelhilo object */ 
    public JButton reelhiloPos18;
    private BufferedImage reelhiloPos18OnLight;
    private static boolean reelhiloPos18On;
    
    /**reelhiloPos19 button variables of Reelhilo object */ 
    public JButton reelhiloPos19;
    private BufferedImage reelhiloPos19OnLight;
    private static boolean reelhiloPos19On;
    
    /**reelhiloPos20 button variables of Reelhilo object */ 
    public JButton reelhiloPos20;
    private BufferedImage reelhiloPos20OnLight;
    private static boolean reelhiloPos20On;
    
    /**reelhiloPos21 button variables of Reelhilo object */ 
    public JButton reelhiloPos21;
    private BufferedImage reelhiloPos21OnLight;
    private static boolean reelhiloPos21On;
    
    /**reelhiloPos22 button variables of Reelhilo object */ 
    public JButton reelhiloPos22;
    private BufferedImage reelhiloPos22OnLight;
    private static boolean reelhiloPos22On;
    
    /**reelhiloPos23 button variables of Reelhilo object */ 
    public JButton reelhiloPos23;
    private BufferedImage reelhiloPos23OnLight;
    private static boolean reelhiloPos23On;
    
    /**ReelhiloPos24 button variables of Reelhilo object */ 
//    public JButton reelhiloPos24;
//    private BufferedImage reelhiloPos24OnLight;
//    private static boolean reelhiloPos24On;
    
    /**allReelhilo List variable of Reelhilo object */
    private final List<JButton> allReelhilo;
    
    /**reelhiloPanel JPanel variable of Reelhilo object */
    public JPanel reelhiloPanel;
    
    /**allReelhiloRev List variable of Reelhilo object */
    private final List<JButton> allReelhiloRev;
    
    /**spinReelHiLo Runnable variable of Reelhilo object */
    private final Runnable spinReelHiLo;
    
    /**spinReelHiLoReverse Runnable variable of Reelhilo object */
    private final Runnable spinReelHiLoReverse;
    
    /**currentPOS variable of Reelhilo object */
    private int currentPOS;

    
    /**Constructor*/
    
    /**
     * Reelhilo Constructor
     * 
     */
    public Reelhilo(){
        allReelhilo = new ArrayList<>();
        allReelhiloRev = new ArrayList<>();
        init();
        
        spinReelHiLo = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReelhilo.size(); c++){    
                    if(getOn(allReelhilo.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 23){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReelhilo.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReelhilo.get(c).getText(), false);

                        break;
                    } 
                }
            }
        };
        
        spinReelHiLoReverse = new Runnable(){
            @Override
            public void run(){
                int newPOS;
        
                for(int c = 0; c < allReelhiloRev.size(); c++){
                    if(getOn(allReelhiloRev.get(c).getText())){

                        newPOS = c+1;

                        if(newPOS == 23){
                            newPOS = 0;
                        }

                        //set new current position On
                        setOn(allReelhiloRev.get(newPOS).getText(), true);
                        setCurrentPOS(newPOS);

                        //turnoff currentPOS
                        setOn(allReelhiloRev.get(c).getText(), false);

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
     * Initiates all the Reelhilo images/JButtons
     *
     */
    private void init() {
        
            //0: 12
            reelhiloPos0OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0000").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0000.png"));
            //1: Gap
            reelhiloPos1OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0001").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0001.png"));
            //2: 11
            reelhiloPos2OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0002").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0002.png"));
            //3: Gap
            reelhiloPos3OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0003").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0003.png"));
            //4: 10
            reelhiloPos4OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0004").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0004.png"));
            //5: Gap
            reelhiloPos5OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0006").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0005.png"));
            
            //reelhiloPos6OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0006").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0006.png"));
            //6: 9
            reelhiloPos7OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0007").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0007.png"));
            //7: Gap
            reelhiloPos8OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0008").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0008.png"));
            //8: 8
            reelhiloPos9OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0009").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0009.png"));
            //9: Gap
            reelhiloPos10OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0010").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0010.png"));
            //10: 7
            reelhiloPos11OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0011").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0011.png"));
            //11: Gap
            reelhiloPos12OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0012").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0012.png"));
            //12: 6
            reelhiloPos13OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0013").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0013.png"));
            //13: Gap
            reelhiloPos14OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0014").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0014.png"));
            //14: 5
            reelhiloPos15OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0015").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0015.png"));
            //15: Gap
            reelhiloPos16OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0016").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0016.png"));
            //16: 4
            reelhiloPos17OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0017").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0017.png"));
            //17: Gap
            reelhiloPos18OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0018").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0018.png"));
            //18: 3
            reelhiloPos19OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0019").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0019.png"));
            //19: Gap
            reelhiloPos20OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0020").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0020.png"));
            //20: 2
            reelhiloPos21OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0021").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0021.png"));
            //21: Gap
            reelhiloPos22OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0022").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0022.png"));
            //22: 1
            reelhiloPos23OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0023").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0023.png"));
            
            //reelhiloPos24OnLight = new Texture("/Reels/ReelHiLo/ReelHiLo_POS_0024").getImage();//ImageIO.read(getClass().getResource("/Reels/ReelHiLo/ReelHiLo_POS_0024.png"));
               
        drawReelhilo();
         
        reelhiloPanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            render(g2d);

            reelhiloPanel.setSize(1280, 720);
            reelhiloPanel.setOpaque(false);
            reelhiloPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
    }
    
    
    /**
     * drawReelhilo()
     * 
     * Draws all the Reelhilo images/JButtons
     */
    private void drawReelhilo() {
        
        reelhiloPos0 = new JButton("reelhiloPos0");
        allReelhilo.add(reelhiloPos0);
        
        reelhiloPos1 = new JButton("reelhiloPos1");
        allReelhilo.add(reelhiloPos1);
        
        reelhiloPos2 = new JButton("reelhiloPos2");
        allReelhilo.add(reelhiloPos2);
        
        reelhiloPos3 = new JButton("reelhiloPos3");
        allReelhilo.add(reelhiloPos3);
        
        reelhiloPos4 = new JButton("reelhiloPos4");
        allReelhilo.add(reelhiloPos4);
        
        reelhiloPos5 = new JButton("reelhiloPos5");
        allReelhilo.add(reelhiloPos5);
        
//        reelhiloPos6 = new JButton("reelhiloPos6");
//        allReelhilo.add(reelhiloPos6);
        
        reelhiloPos7 = new JButton("reelhiloPos7");
        allReelhilo.add(reelhiloPos7);
        
        reelhiloPos8 = new JButton("reelhiloPos8");
        allReelhilo.add(reelhiloPos8);
        
        reelhiloPos9 = new JButton("reelhiloPos9");
        allReelhilo.add(reelhiloPos9);
        
        reelhiloPos10 = new JButton("reelhiloPos10");
        allReelhilo.add(reelhiloPos10);
        
        reelhiloPos11 = new JButton("reelhiloPos11");
        allReelhilo.add(reelhiloPos11);
        
        reelhiloPos12 = new JButton("reelhiloPos12");
        allReelhilo.add(reelhiloPos12);
        
        reelhiloPos13 = new JButton("reelhiloPos13");
        allReelhilo.add(reelhiloPos13);
        
        reelhiloPos14 = new JButton("reelhiloPos14");
        allReelhilo.add(reelhiloPos14);
        
        reelhiloPos15 = new JButton("reelhiloPos15");
        allReelhilo.add(reelhiloPos15);
        
        reelhiloPos16 = new JButton("reelhiloPos16");
        allReelhilo.add(reelhiloPos16);
        
        reelhiloPos17 = new JButton("reelhiloPos17");
        allReelhilo.add(reelhiloPos17);
        
        reelhiloPos18 = new JButton("reelhiloPos18");
        allReelhilo.add(reelhiloPos18);
        
        reelhiloPos19 = new JButton("reelhiloPos19");
        allReelhilo.add(reelhiloPos19);
        
        reelhiloPos20 = new JButton("reelhiloPos20");
        allReelhilo.add(reelhiloPos20);
        
        reelhiloPos21 = new JButton("reelhiloPos21");
        allReelhilo.add(reelhiloPos21);
        
        reelhiloPos22 = new JButton("reelhiloPos22");
        allReelhilo.add(reelhiloPos22);
        
        reelhiloPos23 = new JButton("reelhiloPos23");
        allReelhilo.add(reelhiloPos23);
        
//        reelhiloPos24 = new JButton("reelhiloPos24");
//        allReelhilo.add(reelhiloPos24);

        allReelhiloRev.addAll(allReelhilo);
        Collections.reverse(allReelhiloRev);
        
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "reelhiloPos0":
                reelhiloPos0On = result;
                break;
            case "reelhiloPos1":
                reelhiloPos1On = result;
                break;
            case "reelhiloPos2":
                reelhiloPos2On = result;
                break;
            case "reelhiloPos3":
                reelhiloPos3On = result;
                break;
            case "reelhiloPos4":
                reelhiloPos4On = result;
                break;
            case "reelhiloPos5":
                reelhiloPos5On = result;
                break;
//            case "reelhiloPos6":
//                reelhiloPos6On = result;
//                break;
            case "reelhiloPos7":
                reelhiloPos7On = result;
                break;
            case "reelhiloPos8":
                reelhiloPos8On = result;
                break;
            case "reelhiloPos9":
                reelhiloPos9On = result;
                break;
            case "reelhiloPos10":
                reelhiloPos10On = result;
                break;
            case "reelhiloPos11":
                reelhiloPos11On = result;
                break;
            case "reelhiloPos12":
                reelhiloPos12On = result;
                break;
            case "reelhiloPos13":
                reelhiloPos13On = result;
                break;
            case "reelhiloPos14":
                reelhiloPos14On = result;
                break;
            case "reelhiloPos15":
                reelhiloPos15On = result;
                break;
            case "reelhiloPos16":
                reelhiloPos16On = result;
                break;
            case "reelhiloPos17":
                reelhiloPos17On = result;
                break;
            case "reelhiloPos18":
                reelhiloPos18On = result;
                break;
            case "reelhiloPos19":
                reelhiloPos19On = result;
                break;
            case "reelhiloPos20":
                reelhiloPos20On = result;
                break;
            case "reelhiloPos21":
                reelhiloPos21On = result;
                break;
            case "reelhiloPos22":
                reelhiloPos22On = result;
                break;
            case "reelhiloPos23":
                reelhiloPos23On = result;
                break;
//            case "reelhiloPos24":
//                reelhiloPos24On = result;
//                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Reelhilo images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "reelhiloPos0":
                result = reelhiloPos0On;
                break;
            case "reelhiloPos1":
                result = reelhiloPos1On;
                break;
            case "reelhiloPos2":
                result = reelhiloPos2On;
                break;
            case "reelhiloPos3":
                result = reelhiloPos3On;
                break;
            case "reelhiloPos4":
                result = reelhiloPos4On;
                break;
            case "reelhiloPos5":
                result = reelhiloPos5On;
                break;
//            case "reelhiloPos6":
//                result = reelhiloPos6On;
//                break;
            case "reelhiloPos7":
                result = reelhiloPos7On;
                break;
            case "reelhiloPos8":
                result = reelhiloPos8On;
                break;
            case "reelhiloPos9":
                result = reelhiloPos9On;
                break;
            case "reelhiloPos10":
                result = reelhiloPos10On;
                break;
            case "reelhiloPos11":
                result = reelhiloPos11On;
                break;
            case "reelhiloPos12":
                result = reelhiloPos12On;
                break;
            case "reelhiloPos13":
                result = reelhiloPos13On;
                break;
            case "reelhiloPos14":
                result = reelhiloPos14On;
                break;
            case "reelhiloPos15":
                result = reelhiloPos15On;
                break;
            case "reelhiloPos16":
                result = reelhiloPos16On;
                break;
            case "reelhiloPos17":
                result = reelhiloPos17On;
                break;
            case "reelhiloPos18":
                result = reelhiloPos18On;
                break;
            case "reelhiloPos19":
                result = reelhiloPos19On;
                break;
            case "reelhiloPos20":
                result = reelhiloPos20On;
                break;
            case "reelhiloPos21":
                result = reelhiloPos21On;
                break;
            case "reelhiloPos22":
                result = reelhiloPos22On;
                break;
            case "reelhiloPos23":
                result = reelhiloPos23On;
                break;
//            case "reelhiloPos24":
//                result = reelhiloPos24On;
//                break;
        }
        
        return result;
    }
    
    
    /**
     * getAllReelhilo()
     * 
     * @return allReelhilo - returns Reelhilo images/JButtons
     */
    public List<JButton> getAllReelhilo() {
        return allReelhilo;
    }
    
    
    /**
     * spinReelHiloReverse()
     * 
     */
    public void spinReelHiloReverse(){
        spinReelHiLoReverse.run();
    }
    
    
    /**
     * spinReelHilo()
     * 
     */
    public void spinReelHilo(){
        spinReelHiLo.run();
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g) {
        
        if (reelhiloPos0On){
            g.drawImage(reelhiloPos0OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos1On){
            g.drawImage(reelhiloPos1OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos2On){
            g.drawImage(reelhiloPos2OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos3On){
            g.drawImage(reelhiloPos3OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos4On){
            g.drawImage(reelhiloPos4OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos5On){
            g.drawImage(reelhiloPos5OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
//        if (reelhiloPos6On){
//            g.drawImage(reelhiloPos6OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
//        } 
            
        if (reelhiloPos7On){
            g.drawImage(reelhiloPos7OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos8On){
            g.drawImage(reelhiloPos8OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos9On){
            g.drawImage(reelhiloPos9OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos10On){
            g.drawImage(reelhiloPos10OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos11On){
            g.drawImage(reelhiloPos11OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos12On){
            g.drawImage(reelhiloPos12OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos13On){
            g.drawImage(reelhiloPos13OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos14On){
            g.drawImage(reelhiloPos14OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos15On){
            g.drawImage(reelhiloPos15OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos16On){
            g.drawImage(reelhiloPos16OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos17On){
            g.drawImage(reelhiloPos17OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos18On){
            g.drawImage(reelhiloPos18OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos19On){
            g.drawImage(reelhiloPos19OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos20On){
            g.drawImage(reelhiloPos20OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

        if (reelhiloPos21On){
            g.drawImage(reelhiloPos21OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos22On){
            g.drawImage(reelhiloPos22OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 
            
        if (reelhiloPos23On){
            g.drawImage(reelhiloPos23OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
        } 

//        if (reelhiloPos24On){
//            g.drawImage(reelhiloPos24OnLight, reelhiloPosX, reelhiloPosY, reelhiloWidth, reelhiloHeight, null);
//        } 
                        
        g.dispose();
    }   

    
    /**
     * isGap(int reelhilo)
     * 
     * @param reelhilo
     * @return 
     */
    public boolean isGap(int reelhilo){
        boolean result;
        
        if(reelhilo == 1 || 
                reelhilo == 3 || 
                reelhilo == 5 || 
                reelhilo == 7 || 
                reelhilo == 10 || 
                reelhilo == 12 || 
                reelhilo == 14 || 
                reelhilo == 16 || 
                reelhilo == 18 || 
                reelhilo == 20){
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    
    /**
     * spinReelHiloReverse()
     * 
     * @param reelHilo
     */
    public void spinReelHiloReverse(int reelHilo) {
        for(int c = 0; c < reelHilo; c++){
            spinReelHiloReverse();
        }
        
    }
    
    
    /**
     * spinReelHilo()
     * 
     * @param reelhilo
     */
    public void spinReelHilo(int reelhilo) {        
        for(int c = 0; c < reelhilo; c++){
            spinReelHilo();
        }
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
     * tick()
     * 
     */
    public void tick() {
    }
    
    
    /**
     * getSymbol(int rHL)
     * 
     * @param rHL
     * @return iconRHL
     */
    public int getSymbol(int rHL) {
        
        int iconRHL = 0;
        
        switch(rHL){
            case 0:
                iconRHL = 12;
                break;
            case 2:
                iconRHL = 11;
                break;
            case 4:
                iconRHL = 10;
                break;
            case 6:
                iconRHL = 9;
                break;
            case 8:
                iconRHL = 8;
                break;
            case 9:
                iconRHL = 7;
                break;
            case 11:
                iconRHL = 6;
                break;
            case 13:
                iconRHL = 5;
                break;
            case 15:
                iconRHL = 4;
                break;
            case 17:
                iconRHL = 3;
                break;
            case 19:
                iconRHL = 2;
                break;
            case 21:
                iconRHL = 1;
                break;
        }
        
        return iconRHL;
    }


}