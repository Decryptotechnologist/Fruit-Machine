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
 * @author Ghomez
 */
public class TangoDownLogo {//extends Lights {
    
    /**Attributes*/
    
    /**TangoDownLogo light width variable of TangoDownLogo object */
    public int tangodownlogoLightWidth = 180;
    
    /**TangoDownLogo light height variable of TangoDownLogo object */
    public int tangodownlogoLightHeight = 124;
    
    /**Ttangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton Ttangodownlogo;
    private final int TtangodownlogoLgtX = 101, TtangodownlogoLgtY = 14;
    private BufferedImage TtangodownlogoOnlight, TtangodownlogoOfflight;
    private static boolean TtangodownlogoOn;
    
    /**Atangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton Atangodownlogo;
    private final int AtangodownlogoLgtX = 128, AtangodownlogoLgtY = 6;
    private BufferedImage AtangodownlogoOnLight, AtangodownlogoOffLight;
    private static boolean AtangodownlogoOn;
    
    /**N1tangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton N1tangodownlogo;
    private final int N1tangodownlogoLgtX = 175, N1tangodownlogoLgtY = -6;
    private BufferedImage N1tangodownlogoOnlight, N1tangodownlogoOfflight;
    private static boolean N1tangodownlogoOn;
    
    /**Gtangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton Gtangodownlogo;
    private final int GtangodownlogoLgtX = 217, GtangodownlogoLgtY = -23;
    private BufferedImage GtangodownlogoOnLight, GtangodownlogoOffLight;
    private static boolean GtangodownlogoOn;
    
    /**O1tangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton O1tangodownlogo;
    private final int O1tangodownlogoLgtX = 266, O1tangodownlogoLgtY = -32;
    private BufferedImage O1tangodownlogoOnlight, O1tangodownlogoOfflight;
    private static boolean O1tangodownlogoOn;
    
    /**Dtangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton Dtangodownlogo;
    private final int DtangodownlogoLgtX = 187, DtangodownlogoLgtY = 29;
    private BufferedImage DtangodownlogoOnLight, DtangodownlogoOffLight;
    private static boolean DtangodownlogoOn;
    
    /**O2tangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton O2tangodownlogo;
    private final int O2tangodownlogoLgtX = 237, O2tangodownlogoLgtY = 13;
    private BufferedImage O2tangodownlogoOnlight, O2tangodownlogoOfflight;
    private static boolean O2tangodownlogoOn;
    
    /**Wtangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton Wtangodownlogo;
    private final int WtangodownlogoLgtX = 293, WtangodownlogoLgtY = -2;
    private BufferedImage WtangodownlogoOnLight, WtangodownlogoOffLight;
    private static boolean WtangodownlogoOn;
    
    /**N2tangodownlogo button/light variables of TangoDownLogo object */ 
    public JButton N2tangodownlogo;
    private final int N2tangodownlogoLgtX = 341, N2tangodownlogoLgtY = -12;
    private BufferedImage N2tangodownlogoOnlight, N2tangodownlogoOfflight;
    private static boolean N2tangodownlogoOn;
    
    /**tangos List variable of TangoDownLogo object */
    public List<JButton> tangos;
    
    /**Tangoz JPanel variable of TangoDownLogo object */
    public JPanel Tangoz;
    
    /**tangosReverse List variable of TangoDownLogo object */
    private List<JButton> tangosReverse;
    private ScheduledExecutorService excecutorService_SkillTangoDownForward = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillTangoDownReverse = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomTangoDownOn = Executors.newScheduledThreadPool(1);
    private ScheduledExecutorService excecutorService_SkillShotTangoDown = Executors.newSingleThreadScheduledExecutor();
    private JButton[] currentSkillTangoDown = new JButton[1];
    private Runnable skillTangoDownReverse;
    private final ExecutorService skillTangoDownReversePool = Executors.newScheduledThreadPool(1);
    private Runnable skillTangoDownForward;
    private final ExecutorService skillTangoDownForwardPool = Executors.newScheduledThreadPool(1);
    private final Runnable randomOn;
    
    /**Constructor*/
    
    
    /**
     * TangoDownLogo Constructor
     * 
     */
    public TangoDownLogo(){
        tangos = new ArrayList<>();
        init();
        
        skillTangoDownForward = new Runnable(){
            
            @Override
            public void run(){
                for(JButton tango : tangos){
                     if(excecutorService_SkillTangoDownForward.isShutdown() || 
                             excecutorService_RandomTangoDownOn.isShutdown() || 
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
                        setOn(tango.getText(), true);
                        currentSkillTangoDown[0] = tango;
                     }
                }
                
            }
        };
        
        skillTangoDownReverse = new Runnable(){
            @Override
            public void run(){
                for(JButton tango : tangosReverse){
                    currentSkillTangoDown[0] = tango;
                    
                    if(excecutorService_SkillTangoDownReverse.isShutdown() || 
                            excecutorService_RandomTangoDownOn.isShutdown() || 
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
                    setOn(tango.getText(), false);
                    
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
     * Initiates all the TangoDownLogo light images
     * and fires the drawTangoDownLogo method
     *
     */
    private void init(){
            
            TtangodownlogoOnlight = new Texture("/Tango Down/fruit-machine-TANGODOWN-TA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-TA2.png"));
            TtangodownlogoOfflight = new Texture("/Tango Down/fruit-machine-TANGODOWN-TA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-TA1.png"));
            
            AtangodownlogoOnLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-AA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-AA2.png"));
            AtangodownlogoOffLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-AA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-AA1.png"));
            
            N1tangodownlogoOnlight = new Texture("/Tango Down/fruit-machine-TANGODOWN-NA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-NA2.png"));
            N1tangodownlogoOfflight = new Texture("/Tango Down/fruit-machine-TANGODOWN-NA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-NA1.png"));
            
            GtangodownlogoOnLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-GA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-GA2.png"));
            GtangodownlogoOffLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-GA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-GA1.png"));
            
            O1tangodownlogoOnlight = new Texture("/Tango Down/fruit-machine-TANGODOWN-OA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-OA2.png"));
            O1tangodownlogoOfflight = new Texture("/Tango Down/fruit-machine-TANGODOWN-OA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-OA1.png"));
            
            DtangodownlogoOnLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-DA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-DA2.png"));
            DtangodownlogoOffLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-DA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-DA1.png"));
            
            O2tangodownlogoOnlight = new Texture("/Tango Down/fruit-machine-TANGODOWN-OA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-OA2.png"));
            O2tangodownlogoOfflight = new Texture("/Tango Down/fruit-machine-TANGODOWN-OA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-OA1.png"));
            
            WtangodownlogoOnLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-WA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-WA2.png"));
            WtangodownlogoOffLight = new Texture("/Tango Down/fruit-machine-TANGODOWN-WA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-WA1.png"));
            
            N2tangodownlogoOnlight = new Texture("/Tango Down/fruit-machine-TANGODOWN-NA2").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-NA2.png"));
            N2tangodownlogoOfflight = new Texture("/Tango Down/fruit-machine-TANGODOWN-NA1").getImage();//ImageIO.read(getClass().getResource("/Tango Down/fruit-machine-TANGODOWN-NA1.png"));
            
        drawTangoDownLogo();
         
        Tangoz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
        
            Tangoz.setSize(1280, 720);
            Tangoz.setOpaque(false);
            Tangoz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
        
    }
    
    
    /**
     * drawTangoDownLogo()
     * 
     * Draws all the TangoDownLogo images/JButtons
     */
    private void drawTangoDownLogo() {
        //0 : T
        Ttangodownlogo = new JButton("Ttangodownlogo");
        tangos.add(Ttangodownlogo);

        //1 : A
        Atangodownlogo = new JButton("Atangodownlogo");
        tangos.add(Atangodownlogo);

        //2 : N1
        N1tangodownlogo = new JButton("N1tangodownlogo");
        tangos.add(N1tangodownlogo);

        //3 : G
        Gtangodownlogo = new JButton("Gtangodownlogo");
        tangos.add(Gtangodownlogo);
        
        //4 : O1
        O1tangodownlogo = new JButton("O1tangodownlogo");
        tangos.add(O1tangodownlogo);
        
        //5 : D
        Dtangodownlogo = new JButton("Dtangodownlogo");
        tangos.add(Dtangodownlogo);
        
        //6 : O2
        O2tangodownlogo = new JButton("O2tangodownlogo");
        tangos.add(O2tangodownlogo);
        
        //7 : W
        Wtangodownlogo = new JButton("Wtangodownlogo");
        tangos.add(Wtangodownlogo);

        //8 : N2
        N2tangodownlogo = new JButton("N2tangodownlogo");
        tangos.add(N2tangodownlogo);
        
        tangosReverse = new ArrayList<>(tangos);
        Collections.reverse(tangosReverse);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){ 
         
        if (TtangodownlogoOn){
            g.drawImage(TtangodownlogoOnlight, TtangodownlogoLgtX, TtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(TtangodownlogoOfflight, TtangodownlogoLgtX, TtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }

        if (AtangodownlogoOn){
            g.drawImage(AtangodownlogoOnLight, AtangodownlogoLgtX, AtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(AtangodownlogoOffLight, AtangodownlogoLgtX, AtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);                
        }

        if (N1tangodownlogoOn){
            g.drawImage(N1tangodownlogoOnlight, N1tangodownlogoLgtX, N1tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(N1tangodownlogoOfflight, N1tangodownlogoLgtX, N1tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }

        if (GtangodownlogoOn){
            g.drawImage(GtangodownlogoOnLight, GtangodownlogoLgtX, GtangodownlogoLgtY, tangodownlogoLightWidth+6, tangodownlogoLightHeight+2, null);
        } else {
            g.drawImage(GtangodownlogoOffLight, GtangodownlogoLgtX, GtangodownlogoLgtY, tangodownlogoLightWidth+6, tangodownlogoLightHeight+2, null);
        }

        if (O1tangodownlogoOn){
            g.drawImage(O1tangodownlogoOnlight, O1tangodownlogoLgtX, O1tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(O1tangodownlogoOfflight, O1tangodownlogoLgtX, O1tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }

        if (DtangodownlogoOn){
            g.drawImage(DtangodownlogoOnLight, DtangodownlogoLgtX, DtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(DtangodownlogoOffLight, DtangodownlogoLgtX, DtangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }

        if (O2tangodownlogoOn){
            g.drawImage(O2tangodownlogoOnlight, O2tangodownlogoLgtX, O2tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(O2tangodownlogoOfflight, O2tangodownlogoLgtX, O2tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }

        if (WtangodownlogoOn){
            g.drawImage(WtangodownlogoOnLight, WtangodownlogoLgtX, WtangodownlogoLgtY, tangodownlogoLightWidth+2, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(WtangodownlogoOffLight, WtangodownlogoLgtX, WtangodownlogoLgtY, tangodownlogoLightWidth+2, tangodownlogoLightHeight, null);
        }

        if (N2tangodownlogoOn){
            g.drawImage(N2tangodownlogoOnlight, N2tangodownlogoLgtX, N2tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        } else {
            g.drawImage(N2tangodownlogoOfflight, N2tangodownlogoLgtX, N2tangodownlogoLgtY, tangodownlogoLightWidth, tangodownlogoLightHeight, null);
        }
            
        g.dispose();
    }

    
    /**
     * setOn()
     * 
     * @param name
     * @param result
     */
    public void setOn(String name, boolean result) {
        
        switch(name){
            case "Ttangodownlogo":
                TtangodownlogoOn = result;
                break;
            case "Atangodownlogo":
                AtangodownlogoOn = result;
                break;
            case "N1tangodownlogo":
                N1tangodownlogoOn = result;
                break;
            case "Gtangodownlogo":
                GtangodownlogoOn = result;
                break;
            case "O1tangodownlogo":
                O1tangodownlogoOn = result;
                break;
            case "Dtangodownlogo":
                DtangodownlogoOn = result;
                break;
            case "O2tangodownlogo":
                O2tangodownlogoOn = result;
                break;
            case "Wtangodownlogo":
                WtangodownlogoOn = result;
                break;
            case "N2tangodownlogo":
                N2tangodownlogoOn = result;
                break;
        }
        
    }

    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of TangoDownLogo images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "Ttangodownlogo":
                result = TtangodownlogoOn;
                break;
            case "Atangodownlogo":
                result = AtangodownlogoOn;
                break;
            case "N1tangodownlogo":
                result = N1tangodownlogoOn;
                break;
            case "Gtangodownlogo":
                result = GtangodownlogoOn;
                break;
            case "O1tangodownlogo":
                result = O1tangodownlogoOn;
                break;
            case "Dtangodownlogo":
                result = DtangodownlogoOn;
                break;
            case "O2tangodownlogo":
                result = O2tangodownlogoOn;
                break;
            case "Wtangodownlogo":
                result = WtangodownlogoOn;
                break;
            case "N2tangodownlogo":
                result = N2tangodownlogoOn;
                break;
        }
        
        return result;
    }

    
    /**
     * getAllTangoDown()
     * 
     * @return tangos - returns TangoDownLogo images/JButtons
     */
    public List<JButton> getAllTangoDown() {
        return tangos;
    }
    
    
    /**
     * clearTangoDown()
     * 
     * sets tangos to off
     */
    public void clearTangoDown(){
        for(int i = 0; i < tangos.size(); i++){
            setOn(tangos.get(i).getText(), false);
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
        //System.out.println("Turning All TangoDown Lights On");
        for(JButton tango : tangos){
            setOn(tango.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All TangoDown Lights Off");
        for(JButton tango : tangos){
            setOn(tango.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillForward() {
        //System.out.println("Turning Skill TangoDown Lights Up On.");
        
        //skillTangoDownForwardPool = Executors.newFixedThreadPool(1);
        
        skillTangoDownForwardPool.execute(skillTangoDownForward);
        
        //skillTangoDownForwardPool.shutdown();
        //skillTangoDownForwardPool = null;
        
    }

    void skillReverse() {
        //System.out.println("Turning Skill TangoDown Lights Down On.");
        
        //skillTangoDownReversePool = Executors.newFixedThreadPool(1);
        
        skillTangoDownReversePool.execute(skillTangoDownReverse);
        
        //skillTangoDownReversePool.shutdown();
        //skillTangoDownReversePool = null;
        
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Turning Skill Cash On");
        excecutorService_SkillShotTangoDown = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotTangoDown.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillForward();
                } else {
                    skillReverse();
                }
                excecutorService_SkillShotTangoDown.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Turning Random TangoDown On");
        excecutorService_RandomTangoDownOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomTangoDownOn.scheduleAtFixedRate(randomOn, 12, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Turning Random TangoDown Off");
        //System.out.println("Current Skill TangoDown: "+currentSkillTangoDown[0].getText());
        excecutorService_RandomTangoDownOn.shutdown();
        
        try {
            if (!excecutorService_RandomTangoDownOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomTangoDownOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomTangoDownOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TangoDownLogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        off();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(TangoDownLogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        System.out.println("Current Skill cash: "+currentSkillTangoDown[0].getText());
        excecutorService_SkillTangoDownForward.shutdown();
        excecutorService_SkillTangoDownReverse.shutdown();
        
        try {
            if (!excecutorService_SkillTangoDownForward.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillTangoDownForward.shutdownNow();
            }
            if (!excecutorService_SkillTangoDownReverse.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillTangoDownReverse.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillTangoDownForward.shutdownNow();
            excecutorService_SkillTangoDownReverse.shutdownNow();
        }
        
    }

    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        on();
    }
    
}
