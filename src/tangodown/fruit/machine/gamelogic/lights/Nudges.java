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
public class Nudges {//extends Lights {

    /**Attributes*/
    
    /**Nudge lower light theWidth variable of Nudges object */
    public int nudgeLowerLightWidth = 78;
    
    /**Nudge lower light theHeight variable of Nudges object */
    public int nudgeLowerLightHeight = 66;
    
    /**Nudge light theWidth variable of Nudges object */
    public int nudgeLightWidth = 72;
    
    /**Nudge light theHeight variable of Nudges object */
    public int nudgeLightHeight = 46;
    
    /**oneNudge button/light variables of Nudges object */ 
    public JButton oneNudge;
    private final int oneNudgeLgtX = 60, oneNudgeLgtY = 286;
    private BufferedImage oneNudgeOnlight, oneNudgeOfflight;
    private static boolean oneNudgeOn;
    
    /**twoNudge button/light variables of Nudges object */ 
    public JButton twoNudge;
    private final int twoNudgeLgtX = 76, twoNudgeLgtY = 257;
    private BufferedImage twoNudgeOnLight, twoNudgeOffLight;
    private static boolean twoNudgeOn;
    
    /**threeNudge button/light variables of Nudges object */ 
    public JButton threeNudge;
    private final int threeNudgeLgtX = 63, threeNudgeLgtY = 229;
    private BufferedImage threeNudgeOnlight, threeNudgeOfflight;
    private static boolean threeNudgeOn;
    
    /**fourNudge button/light variables of Nudges object */ 
    public JButton fourNudge;
    private final int fourNudgeLgtX = 78, fourNudgeLgtY = 200;
    private BufferedImage fourNudgeOnLight, fourNudgeOffLight;
    private static boolean fourNudgeOn;
    
    /**fiveNudge button/light variables of Nudges object */ 
    public JButton fiveNudge;
    private final int fiveNudgeLgtX = 40, fiveNudgeLgtY = 172;
    private BufferedImage fiveNudgeOnlight, fiveNudgeOfflight;
    private static boolean fiveNudgeOn;
    
    /**sixNudge button/light variables of Nudges object */ 
    public JButton sixNudge;
    private final int sixNudgeLgtX = 56, sixNudgeLgtY = 143;
    private BufferedImage sixNudgeOnLight, sixNudgeOffLight;
    private static boolean sixNudgeOn;
    
    /**sevenNudge button/light variables of Nudges object */ 
    public JButton sevenNudge;
    private final int sevenNudgeLgtX = 58, sevenNudgeLgtY = 113;
    private BufferedImage sevenNudgeOnlight, sevenNudgeOfflight;
    private static boolean sevenNudgeOn;
    
    /**eightNudge button/light variables of Nudges object */ 
    public JButton eightNudge;
    private final int eightNudgeLgtX = 84, eightNudgeLgtY = 82;
    private BufferedImage eightNudgeOnLight, eightNudgeOffLight;
    private static boolean eightNudgeOn;
    
    /**tenNudge button/light variables of Nudges object */ 
    public JButton tenNudge;
    private final int tenNudgeLgtX = 34, tenNudgeLgtY = 24;
    private BufferedImage tenNudgeOnlight, tenNudgeOfflight;
    private static boolean tenNudgeOn;
    
    /**ninetyNineNudge button/light variables of Nudges object */ 
    public JButton ninetyNineNudge;
    private final int ninetyNineNudgeLgtX = 4, ninetyNineNudgeLgtY = -6;
    private BufferedImage ninetyNineNudgeOnLight, ninetyNineNudgeOffLight;
    private static boolean ninetyNineNudgeOn;    
    
    
    /**TAKE NUDGES LIGHTS*/
    
    /**takeNudges button/light variables of Nudges object */ 
    public JButton takeNudges;
    private final int takeNudgesLgtX = 120, takeNudgesLgtY = 274;
    private BufferedImage takeNudgesOnlight, takeNudgesOfflight;
    private static boolean takeNudgesOn;
    
    
    /**LOWER NUDGE LIGHTS*/
    
    /**oneLNudge button/light variables of Nudges object */ 
    public JButton oneLNudge;
    private final int oneLNudgeLgtX = 30, oneLNudgeLgtY = 496;
    private BufferedImage oneLNudgeOnlight, oneLNudgeOfflight;
    private static boolean oneLNudgeOn;
    
    /**twoLNudge button/light variables of Nudges object */ 
    public JButton twoLNudge;
    private final int twoLNudgeLgtX = 70, twoLNudgeLgtY = 460;
    private BufferedImage twoLNudgeOnLight, twoLNudgeOffLight;
    private static boolean twoLNudgeOn;
    
    /**threeLNudge button/light variables of Nudges object */ 
    public JButton threeLNudge;
    private final int threeLNudgeLgtX = 62, threeLNudgeLgtY = 424;
    private BufferedImage threeLNudgeOnlight, threeLNudgeOfflight;
    private static boolean threeLNudgeOn;
    
    /**fourLNudge button/light variables of Nudges object */ 
    public JButton fourLNudge;
    private final int fourLNudgeLgtX = 94, fourLNudgeLgtY = 384;
    private BufferedImage fourLNudgeOnLight, fourLNudgeOffLight;
    private static boolean fourLNudgeOn;
    
    /**Nudge button/light variables of Nudges object */ 
    public JButton Nudge;
    //private final int NudgeLgtX = 360, NudgeLgtY = 231;
    private BufferedImage NudgeOnlight;
    private static boolean NudgeOn;
    
    /**Nudgez button/light variables of Nudges object */ 
    public JButton Nudgez;
    //private final int NudgezLgtX = 368, NudgezLgtY = 215;
    private BufferedImage NudgezOnLight;
    private static boolean NudgezOn;
    
    /**allNudges List variable of Nudges object */
    public List<JButton> allNudges;
    
    /**upperNudge List variable of Nudges object */
    public List<JButton> upperNudge;
    
    /**upperNudge List variable of Nudges object */
    public List<JButton> upperNudgeReverse;
    
    /**lowerNudge List variable of Nudges object */
    public List<JButton> lowerNudge;
    
    /**lowerNudgeReverse List variable of Nudges object */
    public List<JButton> lowerNudgeReverse;
    
    /**Nudges JPanel variable of Nudges object */
    public JPanel Nudges;
    
    /**nudgeBalance variable of Nudges object */
    private int nudgeBalance;
    
    
    private ScheduledExecutorService excecutorService_RandomNudgeOn = Executors.newScheduledThreadPool(1);
    private ScheduledExecutorService excecutorService_SkillNudgeUp = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillNudgeDown = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillLowerNudgeUp = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillLowerNudgeDown = Executors.newSingleThreadScheduledExecutor();
    private JButton currentSkillNudge;
    private ScheduledExecutorService excecutorService_SkillShotNudge;
    private Runnable skillNudgeDown;
    private ExecutorService skillNudgeDownPool = Executors.newFixedThreadPool(1);
    private Runnable skillNudgeUp;
    private ExecutorService skillNudgeUpPool = Executors.newFixedThreadPool(1);
    private Runnable skillLowerNudgeUp;
    private ExecutorService skillLowerNudgeUpPool;
    private Runnable skillLowerNudgeDown;
    private ExecutorService skillLowerNudgeDownPool;
    
    /**Constructor*/
    
    /**
     * Nudges Constructor
     * 
     */
    public Nudges(){
        allNudges = new ArrayList<>();
        upperNudge = new ArrayList<>();
        lowerNudge = new ArrayList<>();
        init();
        
        skillNudgeUp = new Runnable(){
            @Override
            public void run(){
                for(JButton nudge : upperNudge){
                    if(excecutorService_SkillNudgeUp.isShutdown() || 
                            excecutorService_RandomNudgeOn.isShutdown() || 
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
                        setOn(nudge.getText(), true);
                        currentSkillNudge = nudge;
                    }
                    
                }
            }
        };
        
        skillNudgeDown = new Runnable(){
            @Override
            public void run(){
                for(JButton nudge : upperNudgeReverse){
                    currentSkillNudge = nudge;
                    
                    if(excecutorService_SkillNudgeDown.isShutdown() || 
                            excecutorService_RandomNudgeOn.isShutdown() || 
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
                    setOn(nudge.getText(), false);
                    
                }
          
            }
        };
        
        skillLowerNudgeUp = new Runnable(){
            @Override
            public void run(){
                for(JButton nudge : lowerNudge){
                    if(excecutorService_SkillLowerNudgeUp.isShutdown() || 
                            excecutorService_RandomNudgeOn.isShutdown() || 
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
                        setOn(nudge.getText(), true);
                    }

                }

            }
        };
        
        skillLowerNudgeDown = new Runnable(){
                        
            @Override
            public void run(){
                for(JButton nudge : lowerNudgeReverse){
                    if(excecutorService_SkillLowerNudgeDown.isShutdown() || 
                            excecutorService_RandomNudgeOn.isShutdown() || 
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
                    setOn(nudge.getText(), false);
                }

            }
        };
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Nudge light images
     * and fires the drawNudges method
     */
    private void init(){
        
            oneNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-1NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-1NudgeA2.png"));
            oneNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-1NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-1NudgeA1.png"));
            
            twoNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-2NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-2NudgeA2.png"));
            twoNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-2NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-2NudgeA1.png"));
            
            threeNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-3NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-3NudgeA2.png"));
            threeNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-3NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-3NudgeA1.png"));
            
            fourNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-4NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-4NudgeA2.png"));
            fourNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-4NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-4NudgeA1.png"));
            
            fiveNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-5NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-5NudgeA2.png"));
            fiveNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-5NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-5NudgeA1.png"));
            
            sixNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-6NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-6NudgeA2.png"));
            sixNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-6NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-6NudgeA1.png"));
            
            sevenNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-7NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-7NudgeA2.png"));
            sevenNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-7NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-7NudgeA1.png"));
            
            eightNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-8NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-8NudgeA2.png"));
            eightNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-8NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-8NudgeA1.png"));
            
            tenNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-10NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-10NudgeA2.png"));
            tenNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-10NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-10NudgeA1.png"));
            
            ninetyNineNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-99NudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-99NudgeA2.png"));
            ninetyNineNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-99NudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-99NudgeA1.png"));
            
            
            /**TAKE NUDGES LIGHTS*/
            
            takeNudgesOnlight = new Texture("/Nudges/fruit-machine-sprite-takeNudgesB1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-takeNudgesB1.png"));
            takeNudgesOfflight = new Texture("/Nudges/fruit-machine-sprite-takeNudgesB2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-takeNudgesB2.png"));
            
            NudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-Nudge").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-Nudge.png"));
            NudgezOnLight = new Texture("/Nudges/fruit-machine-sprite-Nudgez").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-Nudgez.png"));
            
            /**LOWER NUDGE LIGHTS*/
            
            oneLNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-1LNudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-1LNudgeA2.png"));
            oneLNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-1LNudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-1LNudgeA1.png"));
            
            twoLNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-2LNudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-2LNudgeA2.png"));
            twoLNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-2LNudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-2LNudgeA1.png"));
            
            threeLNudgeOnlight = new Texture("/Nudges/fruit-machine-sprite-3LNudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-3LNudgeA2.png"));
            threeLNudgeOfflight = new Texture("/Nudges/fruit-machine-sprite-3LNudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-3LNudgeA1.png"));
            
            fourLNudgeOnLight = new Texture("/Nudges/fruit-machine-sprite-4LNudgeA2").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-4LNudgeA2.png"));
            fourLNudgeOffLight = new Texture("/Nudges/fruit-machine-sprite-4LNudgeA1").getImage();//ImageIO.read(getClass().getResource("/Nudges/fruit-machine-sprite-4LNudgeA1.png"));
            
        drawNudges();
         
        Nudges = new JPanel(){
        
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                render(g2d);

                Nudges.setSize(1280, 720);
                Nudges.setOpaque(false);
                Nudges.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());

            }
        };
        
        
    }
    
    
    /**
     * drawNudges()
     * 
     * Draws all the Nudges images/JButtons
     */
    private void drawNudges() {
        
        //0
        oneNudge = new JButton("oneNudge");
        allNudges.add(oneNudge);

        //1
        twoNudge = new JButton("twoNudge");
        allNudges.add(twoNudge);

        //2
        threeNudge = new JButton("threeNudge");
        allNudges.add(threeNudge);

        //3
        fourNudge = new JButton("fourNudge");
        allNudges.add(fourNudge);
        
        //4
        fiveNudge = new JButton("fiveNudge");
        allNudges.add(fiveNudge);
        
        //5
        sixNudge = new JButton("sixNudge");
        allNudges.add(sixNudge);
        
        //6
        sevenNudge = new JButton("sevenNudge");
        allNudges.add(sevenNudge);
        
        //7
        eightNudge = new JButton("eightNudge");
        allNudges.add(eightNudge);

        //8
        tenNudge = new JButton("tenNudge");
        allNudges.add(tenNudge);

        //9
        ninetyNineNudge = new JButton("ninetyNineNudge");
        allNudges.add(ninetyNineNudge);

        
        upperNudge.add(oneNudge);
        upperNudge.add(twoNudge);
        upperNudge.add(threeNudge);
        upperNudge.add(fourNudge);
        upperNudge.add(fiveNudge);
        upperNudge.add(sixNudge);
        upperNudge.add(sevenNudge);
        upperNudge.add(eightNudge);
        upperNudge.add(tenNudge);
        upperNudge.add(ninetyNineNudge);
        
        upperNudgeReverse = new ArrayList<>(upperNudge);
        Collections.reverse(upperNudgeReverse);
        
        /**TAKE NUDGES LIGHT*/
        
        //10
        takeNudges = new JButton("takeNudges");
        allNudges.add(takeNudges);
        
        //11
        Nudge = new JButton("Nudge");
        allNudges.add(Nudge);
        
        //12
        Nudgez = new JButton("Nudgez");
        allNudges.add(Nudgez);
        
        
        
        /**LOWER NUDGES LIGHTS*/
        
        //13
        oneLNudge = new JButton("oneLNudge");
        allNudges.add(oneLNudge);
        
        //14
        twoLNudge = new JButton("twoLNudge");
        allNudges.add(twoLNudge);
        
        //15
        threeLNudge = new JButton("threeLNudge");
        allNudges.add(threeLNudge);
        
        //16
        fourLNudge = new JButton("fourLNudge");
        allNudges.add(fourLNudge);
        
        lowerNudge.add(oneLNudge);
        lowerNudge.add(twoLNudge);
        lowerNudge.add(threeLNudge);
        lowerNudge.add(fourLNudge);
        lowerNudge.add(takeNudges);
        
        lowerNudgeReverse = new ArrayList<>(lowerNudge);
        Collections.reverse(lowerNudgeReverse);
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        if (NudgeOn){
            g.drawImage(NudgeOnlight, oneNudgeLgtX, oneNudgeLgtY+14, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, twoNudgeLgtX-26, twoNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (oneNudgeOn){
            g.drawImage(oneNudgeOnlight, oneNudgeLgtX, oneNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(oneNudgeOfflight, oneNudgeLgtX, oneNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (twoNudgeOn){
            g.drawImage(twoNudgeOnLight, twoNudgeLgtX, twoNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(twoNudgeOffLight, twoNudgeLgtX, twoNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, threeNudgeLgtX-26, threeNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (threeNudgeOn){
            g.drawImage(threeNudgeOnlight, threeNudgeLgtX, threeNudgeLgtY, nudgeLightWidth+10, nudgeLightHeight, null);
        } else {
            g.drawImage(threeNudgeOfflight, threeNudgeLgtX, threeNudgeLgtY, nudgeLightWidth+10, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, fourNudgeLgtX-26, fourNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (fourNudgeOn){
            g.drawImage(fourNudgeOnLight, fourNudgeLgtX, fourNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(fourNudgeOffLight, fourNudgeLgtX, fourNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, fiveNudgeLgtX-2, fiveNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (fiveNudgeOn){
            g.drawImage(fiveNudgeOnlight, fiveNudgeLgtX, fiveNudgeLgtY, nudgeLightWidth*2, nudgeLightHeight, null);
        } else {
            g.drawImage(fiveNudgeOfflight, fiveNudgeLgtX, fiveNudgeLgtY, nudgeLightWidth*2, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, sixNudgeLgtX-26, sixNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (sixNudgeOn){
            g.drawImage(sixNudgeOnLight, sixNudgeLgtX, sixNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(sixNudgeOffLight, sixNudgeLgtX, sixNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, sevenNudgeLgtX-32, sevenNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (sevenNudgeOn){
            g.drawImage(sevenNudgeOnlight, sevenNudgeLgtX, sevenNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(sevenNudgeOfflight, sevenNudgeLgtX, sevenNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, eightNudgeLgtX-32, eightNudgeLgtY-22, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (eightNudgeOn){
            g.drawImage(eightNudgeOnLight, eightNudgeLgtX, eightNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        } else {
            g.drawImage(eightNudgeOffLight, eightNudgeLgtX, eightNudgeLgtY, nudgeLightWidth, nudgeLightHeight, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, tenNudgeLgtX+18, tenNudgeLgtY+4, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (tenNudgeOn){
            g.drawImage(tenNudgeOnlight, tenNudgeLgtX, tenNudgeLgtY, nudgeLightWidth*2+20, nudgeLightHeight*2+8, null);
        } else {
            g.drawImage(tenNudgeOfflight, tenNudgeLgtX, tenNudgeLgtY, nudgeLightWidth*2+20, nudgeLightHeight*2+8, null);
        }

        if (NudgezOn){
            g.drawImage(NudgezOnLight, ninetyNineNudgeLgtX+36, ninetyNineNudgeLgtY+6, nudgeLightWidth+55, nudgeLightHeight+72, null);
        }

        if (ninetyNineNudgeOn){
            g.drawImage(ninetyNineNudgeOnLight, ninetyNineNudgeLgtX, ninetyNineNudgeLgtY, nudgeLightWidth*3, nudgeLightHeight*2+15, null);
        } else {
            g.drawImage(ninetyNineNudgeOffLight, ninetyNineNudgeLgtX, ninetyNineNudgeLgtY, nudgeLightWidth*3, nudgeLightHeight*2+15, null);
        }

        //TAKE NUDGES LIGHT           
        if (takeNudgesOn){
            g.drawImage(takeNudgesOnlight, takeNudgesLgtX, takeNudgesLgtY, 94, 86, null);
        } else {
            g.drawImage(takeNudgesOfflight, takeNudgesLgtX, takeNudgesLgtY, 94, 86, null);
        }


        //LOWER NUDGES LIGHTS
        if (oneLNudgeOn){
            g.drawImage(oneLNudgeOnlight, oneLNudgeLgtX, oneLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        } else {
            g.drawImage(oneLNudgeOfflight, oneLNudgeLgtX, oneLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        }

        if (twoLNudgeOn){
            g.drawImage(twoLNudgeOnLight, twoLNudgeLgtX, twoLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        } else {
            g.drawImage(twoLNudgeOffLight, twoLNudgeLgtX, twoLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        }

        if (threeLNudgeOn){
            g.drawImage(threeLNudgeOnlight, threeLNudgeLgtX, threeLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        } else {
            g.drawImage(threeLNudgeOfflight, threeLNudgeLgtX, threeLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        }

        if (fourLNudgeOn){
            g.drawImage(fourLNudgeOnLight, fourLNudgeLgtX, fourLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        } else {
            g.drawImage(fourLNudgeOffLight, fourLNudgeLgtX, fourLNudgeLgtY, nudgeLowerLightWidth, nudgeLowerLightHeight, null);
        }
            
        g.dispose();
    }
    
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Nudges images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "oneNudge":
                result = oneNudgeOn;
                break;
            case "twoNudge":
                result = twoNudgeOn;
                break;
            case "threeNudge":
                result = threeNudgeOn;
                break;
            case "fourNudge":
                result = fourNudgeOn;
                break;
            case "fiveNudge":
                result = fiveNudgeOn;
                break;
            case "sixNudge":
                result = sixNudgeOn;
                break;
            case "sevenNudge":
                result = sevenNudgeOn;
                break;
            case "eightNudge":
                result = eightNudgeOn;
                break;
            case "tenNudge":
                result = tenNudgeOn;
                break;
            case "ninetyNineNudge":
                result = ninetyNineNudgeOn;
                break;
            case "takeNudges":
                result = takeNudgesOn;
                break;
            case "Nudge":
                result = NudgeOn;
                break;
            case "Nudgez":
                result = NudgezOn;
                break;
            case "oneLNudge":
                result = oneLNudgeOn;
                break;
            case "twoLNudge":
                result = twoLNudgeOn;
                break;
            case "threeLNudge":
                result = threeLNudgeOn;
                break;
            case "fourLNudge":
                result = fourLNudgeOn;
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
            case "oneNudge":
                oneNudgeOn = result;
                break;
            case "twoNudge":
                twoNudgeOn = result;
                break;
            case "threeNudge":
                threeNudgeOn = result;
                break;
            case "fourNudge":
                fourNudgeOn = result;
                break;
            case "fiveNudge":
                fiveNudgeOn = result;
                break;
            case "sixNudge":
                sixNudgeOn = result;
                break;
            case "sevenNudge":
                sevenNudgeOn = result;
                break;
            case "eightNudge":
                eightNudgeOn = result;
                break;
            case "tenNudge":
                tenNudgeOn = result;
                break;
            case "ninetyNineNudge":
                ninetyNineNudgeOn = result;
                break;
            case "takeNudges":
                takeNudgesOn = result;
                break;
            case "Nudge":
                NudgeOn = result;
                break;
            case "Nudgez":
                NudgezOn = result;
                break;
            case "oneLNudge":
                oneLNudgeOn = result;
                break;
            case "twoLNudge":
                twoLNudgeOn = result;
                break;
            case "threeLNudge":
                threeLNudgeOn = result;
                break;
            case "fourLNudge":
                fourLNudgeOn = result;
                break;
        }
        
    }
    
    
    /**
     * getAllNudges()
     * 
     * @return allNudges - returns Nudges images/JButtons
     */
    public List<JButton> getAllNudges() {
        return allNudges;
    }
 
    
    /**
     * clearNudges()
     * 
     * sets allNudges to off
     */
    public void clearNudges(){
        for(JButton nudge : allNudges){//int i = 0; i < allNudges.size(); i++){
            setOn(nudge.getText(), false);
        }
        setOn(allNudges.get(11).getText(), true);
        setOn(allNudges.get(12).getText(), true);
    }
    
    
    /**
     * setNudges()
     * 
     * @param newNudgeBalance
     * 
     * sets nudgeBalance to newNudgeBalance
     */
    public void setNudges(int newNudgeBalance) {
        nudgeBalance = newNudgeBalance;
       
       //set nudges to nudgeBalance
       //Machine.setNudges(nudgeBalance);
    }

    
    /**
     * increaseNudges()
     * 
     * @param newNudgeBalance
     */
    public void increaseNudges(int newNudgeBalance) {
        for(int i = 0; i < newNudgeBalance; i++){
            nudgeBalance += 1;
            
            //set credits to creditBalance
            setNudges(nudgeBalance);
        }
    }
    
    
    /**
     * decreaseNudges()
     * 
     * @param newNudgeBalance
     */
    public void decreaseNudges(int newNudgeBalance) {
        for(int i = 0; i < newNudgeBalance; i++){
            nudgeBalance -= 1;
            
            //set credits to creditBalance
            setNudges(nudgeBalance);
        }
    }

    
    /**
     * getNudges()
     * 
     * @return nudgeBalance
     */
    public int getNudges() {
        return nudgeBalance;
    }

    
    /**
     * tick()
     * 
     */
    public void tick() {
    }
    
    /**
     * on()
     * 
     */
    void on() {
        //System.out.println("Nudges: Turning All Nudge lights On");
        for(JButton nudge : allNudges){
            setOn(nudge.getText(), true);
        }
    }

    /**
     * off()
     * 
     */
    void off() {
        //System.out.println("Nudges: Turning All Nudge lights Off");
        for(JButton nudge : allNudges){
            setOn(nudge.getText(), false);
        }
    }

    /**
     * getName()
     * 
     */
    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * skillUp()
     * 
     */
    void skillUp() {
        //System.out.println("Nudges: Turning Skill Nudge Lights Up On.");
        
        //skillNudgeUpPool = Executors.newFixedThreadPool(1);
        
        skillNudgeUpPool.execute(skillNudgeUp);
        
        //skillNudgeUpPool.shutdown();
        //skillNudgeUpPool = null;
    }

    /**
     * skillDown()
     * 
     */
    void skillDown() {
        //System.out.println("Nudges: Turning Skill Nudge Lights Down On.");
        
        //skillNudgeDownPool = Executors.newFixedThreadPool(1);
        
        skillNudgeDownPool.execute(skillNudgeDown);
        
        //skillNudgeDownPool.shutdown();
        //skillNudgeDownPool = null;
        
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Nudges: Turning Skill Nudges On");
        excecutorService_SkillShotNudge = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotNudge.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillUp();
                } else {
                    skillDown();
                }
                excecutorService_SkillShotNudge.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Nudges: Turning Random Nudges On");
        excecutorService_RandomNudgeOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomNudgeOn.scheduleAtFixedRate(new Runnable(){
            
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillUp();
                    
                    skillLowerNudgeUpPool = Executors.newFixedThreadPool(1);
        
                    skillLowerNudgeUpPool.execute(skillLowerNudgeUp);

                    skillLowerNudgeUpPool.shutdown();
                    skillLowerNudgeUpPool = null;
                    
                } else {
                    skillDown();
                    
                    skillLowerNudgeDownPool = Executors.newFixedThreadPool(1);
        
                    skillLowerNudgeDownPool.execute(skillLowerNudgeDown);

                    skillLowerNudgeDownPool.shutdown();
                    skillLowerNudgeDownPool = null;
                }
                
            }
        }, 14, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Nudges: Turning Random Nudges Off");
        //System.out.println("Nudges: Current Skill cash: "+currentSkillNudge.getText());
        excecutorService_RandomNudgeOn.shutdown();
        
        try {
            if (!excecutorService_RandomNudgeOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomNudgeOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomNudgeOn.shutdownNow();
        }
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Nudges.class.getName()).log(Level.SEVERE, null, ex);
        }
        off();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(Nudges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        //System.out.println("Nudges: Current Skill cash: "+currentSkillNudge.getText());
        excecutorService_SkillNudgeUp.shutdown();
        excecutorService_SkillNudgeDown.shutdown();
        excecutorService_SkillLowerNudgeUp.shutdown();
        excecutorService_SkillLowerNudgeDown.shutdown();
        
        try {
            if (!excecutorService_SkillNudgeUp.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillNudgeUp.shutdownNow();
            }
            if (!excecutorService_SkillNudgeDown.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillNudgeDown.shutdownNow();
            }
            if (!excecutorService_SkillLowerNudgeUp.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerNudgeUp.shutdownNow();
            }
            if (!excecutorService_SkillLowerNudgeDown.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillLowerNudgeDown.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillNudgeUp.shutdownNow();
            excecutorService_SkillNudgeDown.shutdownNow();
            excecutorService_SkillLowerNudgeUp.shutdownNow();
            excecutorService_SkillLowerNudgeDown.shutdownNow();
        }
        
    }

    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        System.out.println("Nudges: Turning Default Nudges On");
        off();
        setOn(allNudges.get(11).getText(), true);
        setOn(allNudges.get(12).getText(), true);
    }
    
}
