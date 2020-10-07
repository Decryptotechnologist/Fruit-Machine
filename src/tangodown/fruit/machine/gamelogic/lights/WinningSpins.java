/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.lights;

import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.graphics.*;
import tangodown.fruit.machine.audio.Sound;
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
import tangodown.fruit.machine.gamelogic.Machine;



/**
 * @author Ghomez
 */
public final class WinningSpins {//extends Lights {
    
    /**Attributes*/
    
    /**WinningSpinsText light width variable of WinningSpins object */
    public int WinningSpinsTextLightWidth = 225;
    
    /**WinningSpinsText light height variable of WinningSpins object */
    public int WinningSpinsTextLightHeight = 135;
    
    
    /**WinningSpinsIcon light width variable of WinningSpins object */
    public int WinningSpinsIconLightWidth = 70;
    
    /**WinningSpinsIcon light height variable of WinningSpins object */
    public int WinningSpinsIconLightHeight = 66;
    
    
    /**WinningSpinsText button/light variables of WinningSpins object */ 
    public JButton WinningSpinsText;
    private final int WinningSpinsTextLgtX = 266, WinningSpinsTextLgtY = 183;
    private BufferedImage WinningSpinsTextOnlight;
    private static boolean WinningSpinsTextOn;
    
    /**WinningSpinsIcon1 button/light variables of WinningSpins object */ 
    public JButton WinningSpinsIcon1;
    private final int WinningSpinsIcon1LgtX = 318, WinningSpinsIcon1LgtY = 236;
    private BufferedImage WinningSpinsIcon1OnLight, WinningSpinsIcon1OffLight;
    private static boolean WinningSpinsIcon1On;
    
    /**WinningSpinsIcon2 button/light variables of WinningSpins object */ 
    public JButton WinningSpinsIcon2;
    private final int WinningSpinsIcon2LgtX = 345, WinningSpinsIcon2LgtY = 236;
    private BufferedImage WinningSpinsIcon2Onlight, WinningSpinsIcon2OffLight;
    private static boolean WinningSpinsIcon2On;
    
    /**WinningSpinsIcon3 button/light variables of WinningSpins object */ 
    public JButton WinningSpinsIcon3;
    private final int WinningSpinsIcon3LgtX = 372, WinningSpinsIcon3LgtY = 236;
    private BufferedImage WinningSpinsIcon3OnLight, WinningSpinsIcon3OffLight;
    private static boolean WinningSpinsIcon3On;
    
    /**takeCash button/light variables of WinningSpins object */ 
    public JButton takeCash;
    private final int takeCashLgtX = 376, takeCashLgtY = 142;
    private BufferedImage takeCashOnlight, takeCashOfflight;
    private static boolean takeCashOn;

    /**winspns List variable of WinningSpins object */
    public List<JButton> winspns;// = new ArrayList<>();
    
    /**winspinsPanel JPanel variable of WinningSpins object */
    public JPanel winspinsPanel;
    
    /**RoulettebgX variable of WinningSpins object */
    private final int RoulettebgX = 45;
    
    /**RoulettebgY variable of WinningSpins object */
    private final int RoulettebgY = -98;
    
    /**Roulettebg BufferedImage variable of WinningSpins object */
    private BufferedImage Roulettebg;
    
    /**winSpinsAmount variable of WinningSpins object */
    public int winSpinsAmount;
    
    /**r1WinSpin variable of WinningSpins object */
    private boolean r1WinSpin;
    
    /**r2WinSpin variable of WinningSpins object */
    private boolean r2WinSpin;
    
    /**r3WinSpin variable of WinningSpins object */
    private boolean r3WinSpin;
    private List<JButton> winningSpns = new ArrayList<>();
    private List<JButton> winningSpnsReverse;
    private ScheduledExecutorService excecutorService_SkillWinSpinsForward = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillWinSpinsReverse = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomWinSpinsOn = Executors.newScheduledThreadPool(1);
    private Runnable skillWinSpinsForward;
    private ExecutorService skillWinSpinsForwardPool = Executors.newScheduledThreadPool(1);
    private Runnable skillWinSpinsReverse;
    private ExecutorService skillWinSpinsReversePool = Executors.newScheduledThreadPool(1);
    private final Runnable randomOn;
    
    
    /**Constructor*/
    
    /**
     * WinningSpins Constructor
     * 
     */
    public WinningSpins(){
        winspns = new ArrayList<>();
        init();
        
        skillWinSpinsForward = new Runnable(){
            @Override
            public void run(){
                for(JButton winspin : winspns){
                    if(excecutorService_SkillWinSpinsForward.isShutdown() || 
                            excecutorService_RandomWinSpinsOn.isShutdown() || 
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
                        setOn(winspin.getText(), true);
                        //currentSkillCash = cash;
                    }
                    
                    
                }
                
            }
        };
        
        skillWinSpinsReverse = new Runnable(){
            @Override
            public void run(){
                for(JButton winspin : winningSpnsReverse){
                    //currentSkillCash = winspin;
                    
                    if(excecutorService_SkillWinSpinsReverse.isShutdown() || 
                            excecutorService_RandomWinSpinsOn.isShutdown() || 
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
                    setOn(winspin.getText(), false);
                    
                }
                
            }
        };
        
        randomOn = new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 450) % 2 == 0){
                    if((System.currentTimeMillis() / 150) % 2 == 0){
                        skillForward();
                    } else {
                        skillReverse();
                    }
                } else {
                    if((System.currentTimeMillis() / 500) % 2 == 0){
                        on();
                    } else {
                        off();
                    }
                    
                }
                
            }
        };
        
    }
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the WinningSpins light images
     * and fires the drawWinningSpins method
     *
     */
    public void init(){
            
        WinningSpinsTextOnlight = new Texture("/Static/fruit-machine-TEXT-WinningSpins").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-TEXT-WinningSpins.png"));
            
        WinningSpinsIcon1OnLight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA2").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA2.png"));
        WinningSpinsIcon1OffLight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA1").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA1.png"));
            
        WinningSpinsIcon2Onlight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA2").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA2.png"));
        WinningSpinsIcon2OffLight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA1").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA1.png"));
            
        WinningSpinsIcon3OnLight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA2").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA2.png"));
        WinningSpinsIcon3OffLight = new Texture("/Icon/fruit-machine-sprite-winSpinIconA1").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-winSpinIconA1.png"));
            
        Roulettebg = new Texture("/Background/fruit-machine-BACKGROUND-ROULETTE-CENTRE").getImage();//ImageIO.read(getClass().getResource("/Background/fruit-machine-BACKGROUND-ROULETTE-CENTRE.png"));
            
        takeCashOnlight = new Texture("/Cash/fruit-machine-sprite-takeCashB1").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-takeCashB1.png"));
        takeCashOfflight = new Texture("/Cash/fruit-machine-sprite-takeCashB2").getImage();//ImageIO.read(getClass().getResource("/Cash/fruit-machine-sprite-takeCashB2.png"));
            
        drawWinningSpins();
         
        winspinsPanel = new JPanel(){
         
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);

            winspinsPanel.setSize(1280, 720);
            winspinsPanel.setOpaque(false);
            winspinsPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());

        }};
        
        
    }
    
    
    /**
     * drawWinningSpins()
     * 
     * Draws all the WinningSpins images/JButtons
     */
    private void drawWinningSpins() {
        //0
        WinningSpinsText = new JButton("WinningSpinsText");
        winspns.add(WinningSpinsText);
        
        //1
        WinningSpinsIcon1 = new JButton("WinningSpinsIcon1");
        winspns.add(WinningSpinsIcon1);
        
        //2
        WinningSpinsIcon2 = new JButton("WinningSpinsIcon2");
        winspns.add(WinningSpinsIcon2);
        
        //3
        WinningSpinsIcon3 = new JButton("WinningSpinsIcon3");     
        winspns.add(WinningSpinsIcon3);
        
        //4: TAKE CASH LIGHT
        takeCash = new JButton("takeCash");
        winspns.add(takeCash);
        
        winningSpns.add(WinningSpinsIcon1);
        winningSpns.add(WinningSpinsIcon2);
        winningSpns.add(WinningSpinsIcon3);
        
        winningSpnsReverse = new ArrayList<>(winningSpns);
        Collections.reverse(winningSpnsReverse);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        //Draw Roulette BG
        g.drawImage(Roulettebg, RoulettebgX, RoulettebgY, 670, 625, null);

        //Draw Winning Spins Text
        g.drawImage(WinningSpinsTextOnlight, WinningSpinsTextLgtX, WinningSpinsTextLgtY, WinningSpinsTextLightWidth, WinningSpinsTextLightHeight, null);

        //TAKE CASH LIGHT
        if (takeCashOn){
            g.drawImage(takeCashOnlight, takeCashLgtX, takeCashLgtY, 96, 80, null);
        } else {
            g.drawImage(takeCashOfflight, takeCashLgtX, takeCashLgtY, 96, 80, null);
        }

        //Winning Spins Icons
        //Winning Spins Icon1[left]
        if (WinningSpinsIcon1On){
            g.drawImage(WinningSpinsIcon1OnLight, WinningSpinsIcon1LgtX, WinningSpinsIcon1LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        } else {
            g.drawImage(WinningSpinsIcon1OffLight, WinningSpinsIcon1LgtX, WinningSpinsIcon1LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        }

        //Winning Spins Icon2[Centre]
        if (WinningSpinsIcon2On){
            g.drawImage(WinningSpinsIcon2Onlight, WinningSpinsIcon2LgtX, WinningSpinsIcon2LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        } else {
            g.drawImage(WinningSpinsIcon2OffLight, WinningSpinsIcon2LgtX, WinningSpinsIcon2LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        }

        //Winning Spins Icon3[right]
        if (WinningSpinsIcon3On){
            g.drawImage(WinningSpinsIcon3OnLight, WinningSpinsIcon3LgtX, WinningSpinsIcon3LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        } else {
            g.drawImage(WinningSpinsIcon3OffLight, WinningSpinsIcon3LgtX, WinningSpinsIcon3LgtY, WinningSpinsIconLightWidth, WinningSpinsIconLightHeight, null);
        }
            
        g.dispose();
    }
    
    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result){
    
        switch(name){
            case "WinningSpinsText":
                WinningSpinsTextOn = result;
                break;
            case "WinningSpinsIcon1":
                WinningSpinsIcon1On = result;
                break;
            case "WinningSpinsIcon2":
                WinningSpinsIcon2On = result;
                break;
            case "WinningSpinsIcon3":
                WinningSpinsIcon3On = result;
                break;
            case "takeCash":
                takeCashOn = result;
                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of WinningSpins images/JButtons on
     */
    public boolean getOn(String name){
    
        boolean result = false;
        
        switch(name){
            case "WinningSpinsText":
                result = WinningSpinsTextOn;
                break;
            case "WinningSpinsIcon1":
                result = WinningSpinsIcon1On;
                break;
            case "WinningSpinsIcon2":
                result = WinningSpinsIcon2On;
                break;
            case "WinningSpinsIcon3":
                result = WinningSpinsIcon3On;
                break;
            case "takeCash":
                result = takeCashOn;
                break;
        }
        
//        if(name.equals("WinningSpinsText")){
//            result = WinningSpinsTextOn;
//        }
//        if(name.equals("WinningSpinsIcon1")){
//            result = WinningSpinsIcon1On;
//        }
//        if(name.equals("WinningSpinsIcon2")){
//            result = WinningSpinsIcon2On;
//        }
//        if(name.equals("WinningSpinsIcon3")){
//            result = WinningSpinsIcon3On;
//        }
//        //TAKE CASH LIGHT
//        if(name.equals("takeCash")){
//            result = takeCashOn;
//        }
        
        return result;
    }
    
    
    /**
     * getAllWinSpins()
     * 
     * @return winspns - returns WinningSpins images/JButtons
     */
    public List<JButton> getAllWinSpins() {
        return winspns;
    }

    
    /**
     * clearWinSpins()
     * 
     * sets winSpins to off
     */
    public void clearWinSpins() {
        winSpinsAmount = 0;
        
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(1).getText(), false);
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(2).getText(), false);
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(3).getText(), false);
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(4).getText(), false);
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(5).getText(), false);
        Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(6).getText(), false);
        
        Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(1).getText(), false);
        Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(2).getText(), false);
        Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(3).getText(), false);
        
        r1WinSpin = false;
        r2WinSpin = false;
        r3WinSpin = false;
    }
    
    
    /**
     * calculateWinSpins()
     * 
     * @param reel1
     * @param reel2
     * @param reel3
     */
    //@Override
    public void calculateWinSpins(boolean reel1, boolean reel2, boolean reel3) {
        clearWinSpins();
        
        //int r1 = reel1;//Machine.getR1().getCurrentPOS();
        System.out.println("WinningSpins: R1 result : "+reel1);
        //int r2 = reel2;//Machine.getR2().getCurrentPOS();
        System.out.println("WinningSpins: R2 result : "+reel2);
        //int r3 = reel3;//Machine.getR3().getCurrentPOS();
        System.out.println("WinningSpins: R3 result : "+reel3);
        
        if(reel1){//Machine.getR1().isSpecial(r1)){ 
            increaseWinSpins();
            r3WinSpin = true;
            //Play WinSpin Sound
            Sound.winSpin.play();
        }
        if(reel2){//Machine.getR2().isSpecial(r2)){//r2 == 8 || r2 == 20 || r2 == 26){ 
            increaseWinSpins();
            r2WinSpin = true;
            //Play WinSpin Sound
            Sound.winSpin.play();
        }
        if(reel3){//Machine.getR3().isSpecial(r3)){//r3 == 4 || r3 == 8 || r3 == 14 || r3 == 24 || r3 == 26){ 
            increaseWinSpins();
            r1WinSpin = true;
            //Play WinSpin Sound
            Sound.winSpin.play();
        }
        
        setWinSpins();
        
    }

    
    /**
     * increaseWinSpins()
     * 
     */
    public void increaseWinSpins() {
        winSpinsAmount += 1;
    }

    
    /**
     * decreaseWinSpins()
     * 
     */
    public void decreaseWinSpins() {
        winSpinsAmount -= 1;
    }
    
    
    /**
     * setWinSpins()
     * 
     */
    public void setWinSpins() {
        if(winSpinsAmount == 1){
            
            if(r1WinSpin){
                //Higher Win Spin 1 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(1).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(2).getText(), true);
            
                //Lower Win Spin 1
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(1).getText(), true);
            }
            if(r2WinSpin){
                //Higher Win Spin 2 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(3).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(4).getText(), true);
            
                //Lower Win Spin 2
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(2).getText(), true);
            }
            if(r3WinSpin){
                //Higher Win Spin 3 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(5).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(6).getText(), true);
            
                //Lower Win Spin 3
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(3).getText(), true);
            }
        }
        if(winSpinsAmount == 2){
            if(r1WinSpin){
                //Higher Win Spin 1 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(1).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(2).getText(), true);
            
                //Lower Win Spin 1
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(1).getText(), true);
            }
            if(r2WinSpin){
                //Higher Win Spin 2 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(3).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(4).getText(), true);
            
                //Lower Win Spin 2
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(2).getText(), true);
            }
            if(r3WinSpin){
                //Higher Win Spin 3 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(5).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(6).getText(), true);
            
                //Lower Win Spin 3
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(3).getText(), true);
            }
        }
        if(winSpinsAmount == 3){
            if(r1WinSpin){
                //Higher Win Spin 1 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(1).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(2).getText(), true);
            
                //Lower Win Spin 1
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(1).getText(), true);
            }
            if(r2WinSpin){
                //Higher Win Spin 2 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(3).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(4).getText(), true);
            
                //Lower Win Spin 2
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(2).getText(), true);
            }
            if(r3WinSpin){
                //Higher Win Spin 3 + BG
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(5).getText(), true);
                Machine.machine.lighter.theStatic.setOn(Machine.machine.lighter.statics.get(6).getText(), true);
            
                //Lower Win Spin 3
                Machine.machine.lighter.theWinSpins.setOn(Machine.machine.lighter.theWinSpins.winspns.get(3).getText(), true);
            }
            Sound.winSpinWin.play();
            if(!Machine.getStartFeature()){
                Machine.machine.startFeature();
            }
        }
    }

    /**
     * tick()
     * 
     */
    public void tick() {
    }
    
    //@Override
    void on() {
        //System.out.println("Turning All WinSpin Lights On");
        for(JButton winspin : winspns){
            setOn(winspin.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All WinSpin Lights Off");
        for(JButton winspin : winspns){
            setOn(winspin.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillForward() {
        //System.out.println("Turning Skill WinningSpins Forward On.");
        
        //skillWinSpinsForwardPool = Executors.newFixedThreadPool(1);
        
        skillWinSpinsForwardPool.execute(skillWinSpinsForward);
        
        //skillWinSpinsForwardPool.shutdown();
        //skillWinSpinsForwardPool = null;
        
    }

    
    void skillReverse() {
        //System.out.println("Turning Skill WinningSpins Reverse On.");
        
        //skillWinSpinsReversePool = Executors.newFixedThreadPool(1);
        
        skillWinSpinsReversePool.execute(skillWinSpinsReverse);
        
        //skillWinSpinsReversePool.shutdown();
        //skillWinSpinsReversePool = null;
        
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {}
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Turning Random WinningSpins On");
        excecutorService_RandomWinSpinsOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomWinSpinsOn.scheduleAtFixedRate(randomOn, 12, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Turning Skill WinSpin Off");
        //System.out.println("Current Skill WinSpin: "+currentSkillWinningSpins.getText());
        excecutorService_RandomWinSpinsOn.shutdown();
        
        try {
            if (!excecutorService_RandomWinSpinsOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomWinSpinsOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomWinSpinsOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(WinningSpins.class.getName()).log(Level.SEVERE, null, ex);
        }
        off();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(WinningSpins.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        //System.out.println("Current Skill cash: "+currentSkillWinningSpins.getText());
        excecutorService_SkillWinSpinsForward.shutdown();
        excecutorService_SkillWinSpinsReverse.shutdown();
        
        try {
            if (!excecutorService_SkillWinSpinsForward.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillWinSpinsForward.shutdownNow();
            }
            if (!excecutorService_SkillWinSpinsReverse.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillWinSpinsReverse.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillWinSpinsForward.shutdownNow();
            excecutorService_SkillWinSpinsReverse.shutdownNow();
        }
        
    }

    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        off();
    }

    
}
