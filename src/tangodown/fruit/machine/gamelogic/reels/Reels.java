/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.reels;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.gamelogic.lights.Lights;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import tangodown.fruit.machine.gamelogic.Machine;
import tangodown.fruit.machine.gamelogic.RNG;

/**
 * @author Ghomez
 */
public class Reels {

    /**Attributes */
    
    /**reel1z List variable of Reels object */
    private List<JButton> reel1z;// = new ArrayList<>();

    /**reel2z List variable of Reels object */
    private List<JButton> reel2z;// = new ArrayList<>();

    /**reel3z List variable of Reels object */
    private List<JButton> reel3z;// = new ArrayList<>();

    /**reelsPanel JPanel variable of Reels object */
    public JPanel reelsPanel;
    
    /**spinReel1 Runnable variable of Reels object */
    private final Runnable spinReel1;
    
    /**spinReel2 Runnable variable of Reels object */
    private final Runnable spinReel2;
    
    /**spinReel3 Runnable variable of Reels object */
    private final Runnable spinReel3;
    
    /**spinReelHiLo Runnable variable of Reels object */
    private final Runnable spinReelHiLo;
    
    /**spinRoulette Runnable variable of Reels object */
    private final Runnable spinRoulette;
    
    /**spinReelsPool ExecutorService variable of Reels object */
    private final ExecutorService spinReelsPool = new ThreadPoolExecutor(3, 60, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(40));
    
    /**spinAdditionalReelsPool ExecutorService variable of Reels object */
    private final ExecutorService spinAdditionalReelsPool = new ThreadPoolExecutor(3, 60, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(40));

    /**reel1Result variable of Reels object */
    private int reel1Result;
    
    /**reel2Result variable of Reels object */
    private int reel2Result;
    
    /**reel3Result variable of Reels object */
    private int reel3Result;
    
    /**reelHiLoResult variable of Reels object */
    private int reelHiLoResult;
    
    /**rouletteResult variable of Reels object */
    private int rouletteResult;
    
    /**holdOn variable of Reels object */
    private boolean holdOn;
    
    /**superHoldOn variable of Reels object */
    private boolean superHoldOn;
    
    /**nudgeOn variable of Reels object */
    private boolean nudgeOn;
    
    /**direction variable of Reels object */
    private String direction;
    
    /**spinReel1Reverse Runnable variable of Reels object */
    private final Runnable spinReel1Reverse;
    
    /**spinReel2Reverse Runnable variable of Reels object */
    private final Runnable spinReel2Reverse;
    
    /**spinReel3Reverse Runnable variable of Reels object */
    private final Runnable spinReel3Reverse;
    
    /**spinReelHiLoReverse Runnable variable of Reels object */
    private final Runnable spinReelHiLoReverse;
    
    /**spinRouletteReverse Runnable variable of Reels object */
    private final Runnable spinRouletteReverse;
    
    /**spinReelsReversePool ExecutorService variable of Reels object */
    private final ExecutorService spinReelsReversePool = new ThreadPoolExecutor(3, 60, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(40));
    
    /**spinAdditionalReelsReversePool ExecutorService variable of Reels object */
    private final ExecutorService spinAdditionalReelsReversePool = new ThreadPoolExecutor(3, 60, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(40));
    
    /**reel1WinSpin variable of Reels object */
    private int reel1WinSpin = 0;
    
    /**reel2WinSpin variable of Reels object */
    private int reel2WinSpin = 0;
    
    /**reel3WinSpin variable of Reels object */
    private int reel3WinSpin = 0;
    
    
    /**Links */
    
    /**the1stReel Reel1 variable of Reels object */
    public Reel1 the1stReel;

    /**the2ndReel Reel2 variable of Reels object */
    public Reel2 the2ndReel;

    /**the3rdReel Reel3 variable of Reels object */
    public Reel3 the3rdReel;
    
    
    /**
     * Constructor
     */
    /**
     * Reels Constructor
     *
     */
    public Reels() {

        reelsPanel = new JPanel();

        reelsPanel.setSize(1280, 720);
        reelsPanel.setOpaque(false);
        reelsPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());

        the1stReel = new Reel1();
        the2ndReel = new Reel2();
        the3rdReel = new Reel3();
        
        reel1z = new ArrayList<>();
        reel2z = new ArrayList<>();
        reel3z = new ArrayList<>();
        
        reelsPanel.add(the1stReel.reel1Panel, BorderLayout.CENTER);
        reelsPanel.add(the2ndReel.reel2Panel, BorderLayout.CENTER);
        reelsPanel.add(the3rdReel.reel3Panel, BorderLayout.CENTER);
        
        
        spinReel1 = new Runnable(){
            @Override
            public void run(){
                the1stReel.spinReel1(reel1Result);
            }
        };
        
        
        spinReel2 = new Runnable(){
            @Override
            public void run(){
                the2ndReel.spinReel2(reel2Result);
            }
        };
                
        spinReel3 = new Runnable(){
            @Override
            public void run(){        
                the3rdReel.spinReel3(reel3Result);
            }
        };
        
        
        spinReelHiLo = new Runnable(){
            @Override
            public void run(){ 
                Lights.thehiloReel.spinReelHilo(reelHiLoResult);
            }
        };
                
                
        spinRoulette = new Runnable(){
            @Override
            public void run(){
                Lights.theRoulette.spinRoulette(rouletteResult);
            }
        };
        
        
        
        spinReel1Reverse = new Runnable(){
            @Override
            public void run(){
                the1stReel.spinReel1Reverse(reel1Result);
            }
        };
        
        spinReel2Reverse = new Runnable(){
            @Override
            public void run(){  
                the2ndReel.spinReel2Reverse(reel2Result);
            }
        };
        
        spinReel3Reverse = new Runnable(){
            @Override
            public void run(){  
                the3rdReel.spinReel3Reverse(reel3Result);
            }
        };
        
        spinReelHiLoReverse = new Runnable(){
            @Override
            public void run(){
                Lights.thehiloReel.spinReelHiloReverse(reelHiLoResult);
            }
        };
        
        spinRouletteReverse = new Runnable(){
            @Override
            public void run(){
                Lights.theRoulette.spinRoulette(rouletteResult);
            }
        };
        

        //initDefaultReels();
        initCustomReels(2,0,6);
        //Gold Bell: 30,14,20 / 10,14,20 *** /Note: Jackpot!!! should not be Gamble-able
        
        //Gold7: 0,0,30 / 0,22,30 ***
        //Red7: 24,28,26 / 24,28,4 / 14,28,4 / 14,28,26 ***
        //Blue7: 20,8,18 / 20,8,10 / 8,8,10 / 8,8,18 ***
        
        //GoldBarz: 6,4,28 / 6,16,28 / 6,16,8 / 6,4,8 ***
        //RedBarz: 12,24,22 / 12,24,0 / 12,24,14 
        //RedBarz: 4,24,0 / 4,24,14 / 4,24,22 ***
        //GreenBarz: 28,20,16 / 28,20,6 / 28,10,6 / 28,10,16 / 28,30,6 / 28,30,16 / 28,2,6 / 28,2,16 ***
        //GreenBarz: 18,20,16 / 18,20,6 / 18,10,6 / 18,10,16 / 18,30,6 / 18,30,16 / 18,2,6 / 18,2,16 ***

        //Mixed7z(2-Gold): (+1Red)0,0,4 / 0,0,26 / 0,22,4 / 0,22,26 / 14,0,30 / 24,0,30 / 14,22,30 / 24,22,30 / 0,28,30 ***
        //Mixed7z(2-Gold): (+1Blue)0,0,10 / 0,0,18 / 0,22,10 / 0,22,18 / 8,0,30 / 20,0,30 / 8,22,30 / 0,8,30 ***
        //Mixed7z(2-Red): (+1Gold)14,28,30 / 24,28,30 / 14,0,4 / 14,0,26 / 24,0,4 / 24,0,26 / 24,22,4 / 24,22,26 / 14,22,4 / 14,22,26 / 0,28,4 / 0,28,26 ***
        //Mixed7z(2-Red): (+1Blue)14,28,10 / 14,28,18 / 24,28,10 / 24,28,18 / 24,8,4 / 24,8,26 / 8,28,4 / 20,28,26 ***
        //Mixed7z(2-Blue): (+1Gold)20,8,30 / 20,0,10 / 20,0,18 / 20,22,10 / 20,22,18 / 8,8,30 / 8,22,10 / 8,22,18 / 0,8,10 / 0,8,18  **
        //Mixed7z(2-Blue): (+1Red)20,8,4 / 20,8,26 / 20,28,10 / 20,28,18 / 8,8,4 / 8,8,26 / 14,8,10 / 14,8,18 / 24,8,10 / 24,8,18 ***
        
        //Mixed7z:(1-ofEach) 0,28,10 / 0,28,18 / 0,8,4 / 0,8,26 ***
        //Mixed7z:(1-ofEach) 8,22,4 / 8,22,26 / 8,0,4 / 8,0,26 / 8,28,30 ***
        //Mixed7z:(1-ofEach) 14,0,10 / 14,0,18 / 14,22,10 / 14,22,18 ***
        //Mixed7z:(1-ofEach) 20,28,30 / 20,22,4 / 20,22,26 / 20,0,4 / 20,0,26 ***
        //Mixed7z:(1-ofEach) 24,0,10 / 24,0,18 / 24,22,10 / 24,22,18 ***
        
        //Cherries: 22,6,2 / 22,6,12 / 22,6,24 / 22,12,2 / 22,12,12 / 22,12,24 ***
        //Cherries: 22,26,2 / 22,26,12 / 22,26,24 / 22,18,2 / 22,18,12 / 22,18,24 ***
        
        //Special: 20,24,22 / 28,24,22 / 20,24,6 / 28,24,6 / 20,6,22 / 28,6,22 ***
        //Special: 28,6,6 / 28,18,2 / 20,18,24 / 28,18,24 / 20,18,2 / 20,6,6 ***
        //Special: 20,6,24 / 20,6,12 / 20,18,12 / 20,24,12 / 28,6,12 / 28,18,12 / 28,24,12 *** 
        
        
    }

    
    
    /**Public Protocol */
    
    
    /**
     * initDefaultReels()
     *
     * Initiates all the Default Reels images
     *
     */
    void defaultReels() {

        //Reel1
        reel1z = getAllReel1();

        //Reel2
        reel2z = getAllReel2();

        //Reel3
        reel3z = getAllReel3();
        
        Machine.spinAllReels();
        
        spinAllReels(0, 0, 30, 0, 17);
        
        the1stReel.setCurrentPOS(0);
        the2ndReel.setCurrentPOS(0);
        the3rdReel.setCurrentPOS(30);
        Lights.thehiloReel.setCurrentPOS(0);
        Lights.theRoulette.setCurrentPOS(17);
    }

    /**
     * initCustomReels(int r1, int r2, int r3)
     *
     * Initiates all the Default Reels images
     *
     * @param r1
     * @param r2
     * @param r3
     */
    private void initCustomReels(int r1, int r2, int r3) {

        //Reel1
        reel1z = getAllReel1();

        turnR1On(reel1z.get(r1).getText());
        the1stReel.setCurrentPOS(r1);

        //Reel2
        reel2z = getAllReel2();

        turnR2On(reel2z.get(r2).getText());
        the2ndReel.setCurrentPOS(r2);

        //Reel3
        reel3z = getAllReel3();

        turnR3On(reel3z.get(r3).getText());
        the3rdReel.setCurrentPOS(r3);
        
        Lights.thehiloReel.setCurrentPOS(0);
        Lights.theRoulette.setCurrentPOS(17);

    }

    /**
     * render()
     *
     * @param g
     */
    public void render(Graphics2D g) {
    }

    /**
     * getAllReel1()
     *
     * @return the1stReel - returns Reel1 images/JButtons
     */
    public List<JButton> getAllReel1() {
        return the1stReel.getAllReel1();
    }

    /**
     * getAllReel2()
     *
     * @return the2ndReel - returns Reel2 images/JButtons
     */
    private List<JButton> getAllReel2() {
        return the2ndReel.getAllReel2();
    }

    /**
     * getAllReel3()
     *
     * @return the3rdReel - returns Reel3 images/JButtons
     */
    private List<JButton> getAllReel3() {
        return the3rdReel.getAllReel3();
    }

    /**
     * turnR1On()
     *
     * @param name
     */
    private void turnR1On(String name) {
        the1stReel.setOn(name, true);
    }

    /**
     * turnR2On()
     *
     * @param name
     */
    private void turnR2On(String name) {
        the2ndReel.setOn(name, true);
    }

    /**
     * turnR3On()
     *
     * @param name
     */
    private void turnR3On(String name) {
        the3rdReel.setOn(name, true);
    }

    /**
     * nudgeReel1()
     *
     */
    public void nudgeReel1() {
        the1stReel.nudgeR1();
    }

    /**
     * nudgeReel2()
     *
     */
    public void nudgeReel2() {
        the2ndReel.nudgeR2();
    }

    /**
     * nudgeReel3()
     *
     */
    public void nudgeReel3() {
        the3rdReel.nudgeR3();
    }

    /**
     * holdReel1()
     *
     */
    public void holdReel1() {
        if (!the1stReel.getR1Hold()) {
            the1stReel.setR1Hold(true);
        } else {
            the1stReel.setR1Hold(false);
        }
    }

    /**
     * holdReel2()
     *
     */
    public void holdReel2() {
        if (!the2ndReel.getR2Hold()) {
            the2ndReel.setR2Hold(true);
        } else {
            the2ndReel.setR2Hold(false);
        }
    }

    /**
     * holdReel3()
     *
     */
    public void holdReel3() {
        if (!the3rdReel.getR3Hold()) {
            the3rdReel.setR3Hold(true);
        } else {
            the3rdReel.setR3Hold(false);
        }
    }

    /**
     * cancelHolds()
     *
     */
    public void cancelHolds() {
        the1stReel.setR1Hold(false);
        the2ndReel.setR2Hold(false);
        the3rdReel.setR3Hold(false);
    }

    /**
     * spinAllReels()
     *
     * @param reel1
     * @param reel2
     * @param reel3
     * @param reelhilo
     * @param roulette
     */
    public void spinAllReels(int reel1, int reel2, int reel3, int reelhilo, int roulette) {
        //System.out.println("Reels: Spinning All Reels . . ."+reel1+reel2+reel3+reelhilo+roulette);

        reel1Result = reel1;
        reel2Result = reel2;
        reel3Result = reel3;
        reelHiLoResult = reelhilo;
        rouletteResult = roulette;     
        
        // passes the Task objects to the pool to execute (Step 3) 
        spinReelsPool.execute(spinReel1); 
        spinReelsPool.execute(spinReel2); 
        spinReelsPool.execute(spinReel3); 
        
        spinAdditionalReelsPool.execute(spinReelHiLo); 
        spinAdditionalReelsPool.execute(spinRoulette);  
        
    }

    /**
     * spinAllReelsReverse()
     *
     * @param reel1
     * @param reel2
     * @param reel3
     * @param reelhilo
     * @param roulette
     */
    public void spinAllReelsReverse(int reel1, int reel2, int reel3, int reelhilo, int roulette) {
        //System.out.println("Reels: Spinning All Reels . . ."+reel1+reel2+reel3+reelhilo+roulette);

        reel1Result = reel1;
        reel2Result = reel2;
        reel3Result = reel3;
        reelHiLoResult = reelhilo;
        rouletteResult = roulette;
        
        // passes the Task objects to the pool to execute (Step 3) 
        spinReelsReversePool.execute(spinReel1Reverse); 
        spinReelsReversePool.execute(spinReel2Reverse); 
        spinReelsReversePool.execute(spinReel3Reverse); 
        
        spinAdditionalReelsReversePool.execute(spinReelHiLoReverse); 
        spinAdditionalReelsReversePool.execute(spinRouletteReverse);  
        
    }

    /**
     * spinReel1()
     *
     * @param reel1
     */
    public void spinReel1(int reel1){
        int difference = the1stReel.getAllReel1().size() - the1stReel.getCurrentPOS();
        reel1Result = difference + reel1;        
//        System.out.println("Reels: R1 Arg: " + reel1 + " Symbol: " + the1stReel.getSymbol(reel1));
//        System.out.println("Reels: R1 Result: " + reel1Result);
//        System.out.println("Reels: Reel1 Size: " + the1stReel.getAllReel1().size());
//        System.out.println("Reels: Reel1 CurrentPOS: " + the1stReel.getCurrentPOS() + " Symbol: " + the1stReel.getSymbol(the1stReel.getCurrentPOS()));
//        System.out.println("Reels: Reel1 Difference: " + difference);
        spinReelsPool.execute(spinReel1);
    }
    
    /**
     * spinReel2()
     *
     * @param reel2
     */
    public void spinReel2(int reel2){
        int difference = the2ndReel.getAllReel2().size() - the2ndReel.getCurrentPOS();
        reel2Result = difference + reel2;
//        System.out.println("Reels: R2 Arg: " + reel2 + " Symbol: " + the2ndReel.getSymbol(reel2));
//        System.out.println("Reels: R2 Result: " + reel2Result);
//        System.out.println("Reels: Reel2 Size: " + the2ndReel.getAllReel2().size());
//        System.out.println("Reels: Reel2 CurrentPOS: " + the2ndReel.getCurrentPOS() + " Symbol: " + the2ndReel.getSymbol(the2ndReel.getCurrentPOS()));
//        System.out.println("Reels: Reel2 Difference: " + difference);
        spinReelsPool.execute(spinReel2); 
    }
    
    /**
     * spinReel3()
     *
     * @param reel3
     */
    public void spinReel3(int reel3){
        int difference = the3rdReel.getAllReel3().size() - the3rdReel.getCurrentPOS();
        reel3Result = difference + reel3;
//        System.out.println("Reels: R3 Arg: " + reel3 + " Symbol: " + the3rdReel.getSymbol(reel3));
//        System.out.println("Reels: R3 Result: " + reel3Result);
//        System.out.println("Reels: Reel3 Size: " + the3rdReel.getAllReel3().size());
//        System.out.println("Reels: Reel3 CurrentPOS: " + the3rdReel.getCurrentPOS() + " Symbol: " + the3rdReel.getSymbol(the3rdReel.getCurrentPOS()));
//        System.out.println("Reels: Reel3 Difference: " + difference);
        spinReelsPool.execute(spinReel3);
    }
    
    /**
     * spinReelHiLo()
     *
     * @param reelhilo
     */
    public void spinReelHiLo(int reelhilo){
        int difference = Lights.thehiloReel.getAllReelhilo().size() - Lights.thehiloReel.getCurrentPOS();
        reelHiLoResult = difference + reelhilo;
//        System.out.println("Reels: RHiLo Arg: " + reelhilo + " No.: " + Lights.thehiloReel.getSymbol(reelhilo));
//        System.out.println("Reels: RHiLo Result: " + reelHiLoResult);
//        System.out.println("Reels: ReelHiLo Size: " + Lights.thehiloReel.getAllReelhilo().size());
//        System.out.println("Reels: ReelHiLo CurrentPOS: " + Lights.thehiloReel.getCurrentPOS() + " Symbol: " + Lights.thehiloReel.getSymbol(Lights.thehiloReel.getCurrentPOS()));
//        System.out.println("Reels: ReelHiLo Difference: " + difference);
        spinReelsPool.execute(spinReelHiLo);
    }
    
    /**
     * spinRoulette()
     *
     * @param roulette
     */
    public void spinRoulette(int roulette){
        int difference = Lights.theRoulette.getAllRoulette().size() - Lights.theRoulette.getCurrentPOS();
        rouletteResult = difference + roulette;
//        System.out.println("Reels: Roulette Arg: " + roulette + " Symbol: " + Lights.theRoulette.getSymbol(roulette));
//        System.out.println("Reels: Roulette Result: " + rouletteResult);
//        System.out.println("Reels: Roulette Size: " + Lights.theRoulette.getAllRoulette().size());
//        System.out.println("Reels: Roulette CurrentPOS: " + Lights.theRoulette.getCurrentPOS() + " Symbol: " + Lights.theRoulette.getSymbol(Lights.theRoulette.getCurrentPOS()));
//        System.out.println("Reels: Roulette Difference: " + difference);
        spinReelsPool.execute(spinRoulette);
    }
    
    
    /**
     * tick()
     *
     */
    public void tick() {
    }

    /**
     * spinAllReels()
     *
     * @param letEmSpinIcon1
     * @param letEmSpinIcon2
     * @param letEmSpinIcon3
     * @param reelhilo
     * @param roulette
     */
    public void spinAllReels(String letEmSpinIcon1, String letEmSpinIcon2, String letEmSpinIcon3, int reelhilo, int roulette) {

        int reel1 = the1stReel.getIndex(letEmSpinIcon1);
        int reel2 = the2ndReel.getIndex(letEmSpinIcon2);
        int reel3 = the3rdReel.getIndex(letEmSpinIcon3);

        spinAllReels(reel1, reel2, reel3, reelhilo, roulette);

    }

    /**
     * getReel1()
     *
     * @return the1stReel
     */
    public Reel1 getReel1() {
        return the1stReel;
    }

    /**
     * getReel2()
     *
     * @return the2ndReel
     */
    public Reel2 getReel2() {
        return the2ndReel;
    }

    /**
     * getReel3()
     *
     * @return the3rdReel
     */
    public Reel3 getReel3() {
        return the3rdReel;
    }

    /**
     * getRHL()
     *
     * @return thehiloReel
     */
    public Reelhilo getRHL() {
        return Lights.thehiloReel;
    }

    /**
     * setHoldOn()
     *
     * @param holdOn
     */
    public void setHoldOn(boolean holdOn) {
        this.holdOn = holdOn;
    }

    /**
     * setSuperHoldOn()
     *
     * @param superHoldOn
     */
    public void setSuperHoldOn(boolean superHoldOn) {
        this.superHoldOn = superHoldOn;
    }

    /**
     * setNudgeOn()
     *
     * @param nudgeOn
     */
    public void setNudgeOn(boolean nudgeOn) {
        this.nudgeOn = nudgeOn;
    }

    /**
     * setDirection()
     *
     * @param dir
     */
    void setDirection(int dir) {
        switch(dir){
            case 0:
                this.direction = "FORWARD";
                break;
            case 1:
                this.direction = "REVERSE";
                break;
            default:
                this.direction = "FORWARD";
        }
    }

    /**
     * winSpin()
     *
     * @param symbol
     */
    void winSpin(String symbol) {
        switch(symbol){
            case "CHERRIES":
                setReel1WinSpin(2);
                setReel2WinSpin(18);//setReel2WinSpin(6);//setReel2WinSpin(12);
                setReel3WinSpin(2);
                
                break;
            case "MIXED7S":
                setReel1WinSpin(24);//setReel1WinSpin(8);
                setReel2WinSpin(28);//setReel2WinSpin(0);
                setReel3WinSpin(30);
                
                break;
            case "GREEN_BARS":
                setReel1WinSpin(18);
                setReel2WinSpin(10);//setReel2WinSpin(2);
                setReel3WinSpin(6);
                
                break;
            case "RED_BARS":
                setReel1WinSpin(26);//setReel1WinSpin(4);
                setReel2WinSpin(24);
                setReel3WinSpin(14);//setReel3WinSpin(22);
                
                break;
            case "GOLD_BARS":
                setReel1WinSpin(6);
                setReel2WinSpin(16);//setReel2WinSpin(4);
                setReel3WinSpin(28);
                
                break;
            case "BLUE7S":
                setReel1WinSpin(8);
                setReel2WinSpin(8);
                setReel3WinSpin(10);
                
                break;
            case "RED7S":
                setReel1WinSpin(14);
                setReel2WinSpin(28);
                setReel3WinSpin(26);//setReel3WinSpin(4);
                
                break;
            case "GOLD7S":
                setReel1WinSpin(0);
                setReel2WinSpin(0);
                setReel3WinSpin(30);
                
                break;
            case "GOLD_BELLS":
                setReel1WinSpin(10);//setReel1WinSpin(30);
                setReel2WinSpin(14);
                setReel3WinSpin(20);
                
                break;
                
        }
        
        Machine.setWinSpinOn(true);
        RNG.start = true;
        Machine.spinAllReels();
    }

    /**
     * getReel1WinSpin()
     *
     * @return reel1WinSpin
     */
    public int getReel1WinSpin(){
        return this.reel1WinSpin;
    }
    
    /**
     * setReel1WinSpin()
     *
     * @param r1ws
     */
    public void setReel1WinSpin(int r1ws){
        this.reel1WinSpin = r1ws;
    }
    
    /**
     * getReel2WinSpin()
     *
     * @return reel2WinSpin
     */
    public int getReel2WinSpin(){
        return this.reel2WinSpin;
    }
    
    /**
     * setReel2WinSpin()
     *
     * @param r2ws
     */
    public void setReel2WinSpin(int r2ws){
        this.reel2WinSpin = r2ws;
    }
    
    /**
     * getReel3WinSpin()
     *
     * @return reel3WinSpin
     */
    public int getReel3WinSpin(){
        return this.reel3WinSpin;
    }
    
    /**
     * setReel3WinSpin()
     *
     * @param r3ws
     */
    public void setReel3WinSpin(int r3ws){
        this.reel3WinSpin = r3ws;
    }
    
}
