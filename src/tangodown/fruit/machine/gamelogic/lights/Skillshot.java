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
public class Skillshot {//extends Lights {
    
    /**Attributes*/
    
    /**Skillshot light width variable of Skillshot object */
    public int skillshotLightWidth = 76;
    
    /**Skillshot light height variable of Skillshot object */
    public int skillshotLightHeight = 88;
    
    /**Sskillshot button/light variables of Skillshot object */ 
    public JButton Sskillshot;
    private final int SskillshotLgtX = 248, SskillshotLgtY = 258;
    private BufferedImage SskillshotOnlight, SskillshotOfflight;
    private static boolean SskillshotOn;
    
    /**Kskillshot button/light variables of Skillshot object */ 
    public JButton Kskillshot;
    private final int KskillshotLgtX = 275, KskillshotLgtY = 273;
    private BufferedImage KskillshotOnLight, KskillshotOffLight;
    private static boolean KskillshotOn;
    
    /**Iskillshot button/light variables of Skillshot object */ 
    public JButton Iskillshot;
    private final int IskillshotLgtX = 297, IskillshotLgtY = 280;
    private BufferedImage IskillshotOnlight, IskillshotOfflight;
    private static boolean IskillshotOn;
    
    /**L1skillshot button/light variables of Skillshot object */ 
    public JButton L1skillshot;
    private final int L1skillshotLgtX = 313, L1skillshotLgtY = 286;
    private BufferedImage L1skillshotOnLight, L1skillshotOffLight;
    private static boolean L1skillshotOn;
    
    /**L2skillshot button/light variables of Skillshot object */ 
    public JButton L2skillshot;
    private final int L2skillshotLgtX = 340, L2skillshotLgtY = 287;
    private BufferedImage L2skillshotOnlight, L2skillshotOfflight;
    private static boolean L2skillshotOn;
    
    /**S2skillshot button/light variables of Skillshot object */ 
    public JButton S2skillshot;
    private final int S2skillshotLgtX = 368, S2skillshotLgtY = 284;
    private BufferedImage S2skillshotOnLight, S2skillshotOffLight;
    private static boolean S2skillshotOn;
    
    /**Hskillshot button/light variables of Skillshot object */ 
    public JButton Hskillshot;
    private final int HskillshotLgtX = 396, HskillshotLgtY = 277;
    private BufferedImage HskillshotOnlight, HskillshotOfflight;
    private static boolean HskillshotOn;
    
    /**Oskillshot button/light variables of Skillshot object */ 
    public JButton Oskillshot;
    private final int OskillshotLgtX = 420, OskillshotLgtY = 265;
    private BufferedImage OskillshotOnLight, OskillshotOffLight;
    private static boolean OskillshotOn;
    
    /**Tskillshot button/light variables of Skillshot object */ 
    public JButton Tskillshot;
    private final int TskillshotLgtX = 441, TskillshotLgtY = 248;
    private BufferedImage TskillshotOnlight, TskillshotOfflight;
    private static boolean TskillshotOn;
    
    /**skills List variable of Skillshot object */
    public List<JButton> skills;
    
    /**skillsReverse List variable of Roulette object */
    public List<JButton> skillsReverse;
    
    /**skillpanel JPanel variable of Skillshot object */
    public JPanel skillpanel;
    private ScheduledExecutorService excecutorService_SkillSkillShotForward = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillSkillShotReverse = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomSkillShotOn = Executors.newScheduledThreadPool(1);
    private ScheduledExecutorService excecutorService_SkillSkillShot = Executors.newSingleThreadScheduledExecutor();
    private JButton currentSkillSkillshot;
    private Runnable skillShotReverse;
    private ExecutorService skillShotReversePool = Executors.newScheduledThreadPool(1);
    private Runnable skillShotForward;
    private ExecutorService skillShotForwardPool = Executors.newScheduledThreadPool(1);

    
    /**Constructor*/
    
    /**
     * Skillshot Constructor
     * 
     */
    public Skillshot(){
        skills = new ArrayList<>();
        init();
        
        skillShotForward = new Runnable(){
            
            @Override
            public void run(){
                for(JButton skill : skills){
                    if(excecutorService_SkillSkillShotForward.isShutdown() || 
                            excecutorService_RandomSkillShotOn.isShutdown() || 
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
                        setOn(skill.getText(), true);
                        currentSkillSkillshot = skill;
                    }
                }
                
            }
        };
        
        skillShotReverse = new Runnable(){
            @Override
            public void run(){
                for(JButton skill : skillsReverse){
                    currentSkillSkillshot = skill;
                    
                    
                    if(excecutorService_SkillSkillShotReverse.isShutdown() || 
                            excecutorService_RandomSkillShotOn.isShutdown() || 
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
                    setOn(skill.getText(), false);
                }
                
            }
        };
        
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Skillshot light images
     * and fires the drawSkillshot method
     * 
     */
    private void init(){
        
            SskillshotOnlight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-S-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-S-A2.png"));
            SskillshotOfflight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-S-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-S-A1.png"));
            
            KskillshotOnLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-K-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-K-A2.png"));
            KskillshotOffLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-K-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-K-A1.png"));
            
            IskillshotOnlight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-I-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-I-A2.png"));
            IskillshotOfflight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-I-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-I-A1.png"));
            
            L1skillshotOnLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-L1-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-L1-A2.png"));
            L1skillshotOffLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-L1-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-L1-A1.png"));
            
            L2skillshotOnlight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-L2-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-L2-A2.png"));
            L2skillshotOfflight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-L2-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-L2-A1.png"));
            
            S2skillshotOnLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-S2-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-S2-A2.png"));
            S2skillshotOffLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-S2-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-S2-A1.png"));
            
            HskillshotOnlight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-H-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-H-A2.png"));
            HskillshotOfflight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-H-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-H-A1.png"));
            
            OskillshotOnLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-O-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-O-A2.png"));
            OskillshotOffLight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-O-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-O-A1.png"));
            
            TskillshotOnlight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-T-A2").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-T-A2.png"));
            TskillshotOfflight = new Texture("/Skillshot/fruit-machine-SKILLSHOT-T-A1").getImage();//ImageIO.read(getClass().getResource("/Skillshot/fruit-machine-SKILLSHOT-T-A1.png"));
            
        drawSkillshot();
         
        skillpanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            skillpanel.setSize(1280, 720);
            skillpanel.setOpaque(false);
            skillpanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
        
        
    }
    
    
    /**
     * drawSkillshot()
     * 
     * Draws all the Skillshot images/JButtons
     */
    private void drawSkillshot() {
        //0
        Sskillshot = new JButton("Sskillshot");
        skills.add(Sskillshot);

        //1
        Kskillshot = new JButton("Kskillshot");
        skills.add(Kskillshot);

        //2
        Iskillshot = new JButton("Iskillshot");
        skills.add(Iskillshot);

        //3
        L1skillshot = new JButton("L1skillshot");
        skills.add(L1skillshot);
        
        //4
        L2skillshot = new JButton("L2skillshot");
        skills.add(L2skillshot);
        
        //5
        S2skillshot = new JButton("S2skillshot");
        skills.add(S2skillshot);
        
        //6
        Hskillshot = new JButton("Hskillshot");
        skills.add(Hskillshot);
        
        //7
        Oskillshot = new JButton("Oskillshot");
        skills.add(Oskillshot);

        //8
        Tskillshot = new JButton("Tskillshot");
        skills.add(Tskillshot);
        
        skillsReverse = new ArrayList<>(skills);
        Collections.reverse(skillsReverse);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        if (SskillshotOn){
            g.drawImage(SskillshotOnlight, SskillshotLgtX, SskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(SskillshotOfflight, SskillshotLgtX, SskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (KskillshotOn){
            g.drawImage(KskillshotOnLight, KskillshotLgtX, KskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(KskillshotOffLight, KskillshotLgtX, KskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (IskillshotOn){
            g.drawImage(IskillshotOnlight, IskillshotLgtX, IskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(IskillshotOfflight, IskillshotLgtX, IskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (L1skillshotOn){
            g.drawImage(L1skillshotOnLight, L1skillshotLgtX, L1skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(L1skillshotOffLight, L1skillshotLgtX, L1skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (L2skillshotOn){
            g.drawImage(L2skillshotOnlight, L2skillshotLgtX, L2skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(L2skillshotOfflight, L2skillshotLgtX, L2skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (S2skillshotOn){
            g.drawImage(S2skillshotOnLight, S2skillshotLgtX, S2skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(S2skillshotOffLight, S2skillshotLgtX, S2skillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (HskillshotOn){
            g.drawImage(HskillshotOnlight, HskillshotLgtX, HskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(HskillshotOfflight, HskillshotLgtX, HskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (OskillshotOn){
            g.drawImage(OskillshotOnLight, OskillshotLgtX, OskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(OskillshotOffLight, OskillshotLgtX, OskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        }

        if (TskillshotOn){
            g.drawImage(TskillshotOnlight, TskillshotLgtX, TskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
        } else {
            g.drawImage(TskillshotOfflight, TskillshotLgtX, TskillshotLgtY, skillshotLightWidth, skillshotLightHeight, null);
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
            case "Sskillshot":
                SskillshotOn = result;
                break;
            case "Kskillshot":
                KskillshotOn = result;
                break;
            case "Iskillshot":
                IskillshotOn = result;
                break;
            case "L1skillshot":
                L1skillshotOn = result;
                break;
            case "L2skillshot":
                L2skillshotOn = result;
                break;
            case "S2skillshot":
                S2skillshotOn = result;
                break;
            case "Hskillshot":
                HskillshotOn = result;
                break;
            case "Oskillshot":
                OskillshotOn = result;
                break;
            case "Tskillshot":
                TskillshotOn = result;
                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Skillshot images/JButtons on
     */
    public boolean getOn(String name){
        
        boolean result = false;
        
        switch(name){
            case "Sskillshot":
                result = SskillshotOn;
                break;
            case "Kskillshot":
                result = KskillshotOn;
                break;
            case "Iskillshot":
                result = IskillshotOn;
                break;
            case "L1skillshot":
                result = L1skillshotOn;
                break;
            case "L2skillshot":
                result = L2skillshotOn;
                break;
            case "S2skillshot":
                result = S2skillshotOn;
                break;
            case "Hskillshot":
                result = HskillshotOn;
                break;
            case "Oskillshot":
                result = OskillshotOn;
                break;
            case "Tskillshot":
                result = TskillshotOn;
                break;
        }
        
        return result;
    }
    
    
    /**
     * getAllSkillshots()
     * 
     * @return skills - returns Skillshot images/JButtons
     */
    public List<JButton> getAllSkillshots() {
        return skills;
    }
    
    
    /**
     * clearSkillshot()
     * 
     * sets skills to off
     */
    public void clearSkillshot(){
        for(int i = 0; i < skills.size(); i++){
            setOn(skills.get(i).getText(), false);
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
        //System.out.println("Turning All Skillshot Lights On");
        for(JButton skill : skills){
            setOn(skill.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All Skillshot Lights Off");
        for(JButton skill : skills){
            setOn(skill.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillForward() {
        //System.out.println("Turning Skill Skillshot Lights Forward On.");
        
//        skillShotForward = new Runnable(){
//            
//            @Override
//            public void run(){
//                for(JButton skill : skills){
//                    if(excecutorService_SkillSkillShotForward.isShutdown() || 
//                            excecutorService_RandomSkillShotOn.isShutdown() || 
//                            Thread.currentThread().isInterrupted()){
//                        try {
//                            Thread.currentThread().join();
//                        } catch (InterruptedException ex) {
//                        }
//                        break;
//                    } else {
//                        try {
//                            Thread.sleep(300);
//                        } catch (InterruptedException ex) {
//                            Thread.currentThread().interrupt();
//                        }
//                        setOn(skill.getText(), true);
//                        currentSkillSkillshot = skill;
//                    }
//                }
//                
//            }
//        };
        
        
        //skillShotForwardPool = Executors.newFixedThreadPool(1);
        
        skillShotForwardPool.execute(skillShotForward);
        
        //skillShotForwardPool.shutdown();
        //skillShotForwardPool = null;
        
    }

    void skillReverse() {
        //System.out.println("Turning Skill Skillshot Lights Reverse On.");
                
//        skillShotReverse = new Runnable(){
//            @Override
//            public void run(){
//                for(JButton skill : skillsReverse){
//                    currentSkillSkillshot = skill;
//                    
//                    
//                    if(excecutorService_SkillSkillShotReverse.isShutdown() || 
//                            excecutorService_RandomSkillShotOn.isShutdown() || 
//                            Thread.currentThread().isInterrupted()){
//                        try {
//                            Thread.currentThread().join();
//                        } catch (InterruptedException ex) {
//                        }
//                        break;
//                    } else {
//                        try {
//                            Thread.sleep(300);
//                        } catch (InterruptedException ex) {
//                            Thread.currentThread().interrupt();
//                        }
//                    }
//                    setOn(skill.getText(), false);
//                }
//                
//            }
//        };
            
        //skillShotReversePool = Executors.newFixedThreadPool(1);
        
        skillShotReversePool.execute(skillShotReverse);
        
        //skillShotReversePool.shutdown();
        //skillShotReversePool = null;
        
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Skillshot: Turning Skill Skillshot On");
        //excecutorService_SkillSkillShot = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillSkillShot.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillForward();
                } else {
                    skillReverse();
                }
                excecutorService_SkillSkillShot.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Skillshot: Turning Random Skillshot On");
        excecutorService_RandomSkillShotOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomSkillShotOn.scheduleAtFixedRate(new Runnable(){
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
        }, 14, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Skillshot: Turning Random Skillshot Off");
        excecutorService_RandomSkillShotOn.shutdown();

        try {
            if (!excecutorService_RandomSkillShotOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomSkillShotOn.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_RandomSkillShotOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Skillshot.class.getName()).log(Level.SEVERE, null, ex);
        }
        on();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(Skillshot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        //System.out.println("Skillshot: Current Skill cash: "+currentSkillSkillshot.getText());
        excecutorService_SkillSkillShotForward.shutdown();
        excecutorService_SkillSkillShotReverse.shutdown();
        
        try {
            if (!excecutorService_SkillSkillShotForward.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillSkillShotForward.shutdownNow();
            }
            if (!excecutorService_SkillSkillShotReverse.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillSkillShotReverse.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillSkillShotForward.shutdownNow();
            excecutorService_SkillSkillShotReverse.shutdownNow();
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
