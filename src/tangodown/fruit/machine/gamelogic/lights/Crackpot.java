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
public class Crackpot {//extends Lights {
    
    /**Attributes*/
    
    /**Crackpot light width variable of Crackpot object */
    public int crackpotLightWidth = 78;
    
    /**Crackpot light height variable of Crackpot object */
    public int crackpotLightHeight = 96;
    
    /**Ccrackpot button/light variables of Crackpot object */ 
    public JButton Ccrackpot;
    private final int CcrackpotLgtX = 241, CcrackpotLgtY = 86;
    private BufferedImage CcrackpotOnlight, CcrackpotOfflight;
    private static boolean CcrackpotOn;
    
    /**Rcrackpot button/light variables of Crackpot object */ 
    public JButton Rcrackpot;
    private final int RcrackpotLgtX = 263, RcrackpotLgtY = 72;
    private BufferedImage RcrackpotOnLight, RcrackpotOffLight;
    private static boolean RcrackpotOn;
    
    /**Acrackpot button/light variables of Crackpot object */ 
    public JButton Acrackpot;
    private final int AcrackpotLgtX = 294, AcrackpotLgtY = 61;
    private BufferedImage AcrackpotOnlight, AcrackpotOfflight;
    private static boolean AcrackpotOn;
    
    /**C2crackpot button/light variables of Crackpot object */ 
    public JButton C2crackpot;
    private final int C2crackpotLgtX = 328, C2crackpotLgtY = 63;
    private BufferedImage C2crackpotOnLight, C2crackpotOffLight;
    private static boolean C2crackpotOn;
    
    /**Kcrackpot button/light variables of Crackpot object */ 
    public JButton Kcrackpot;
    private final int KcrackpotLgtX = 362, KcrackpotLgtY = 63;
    private BufferedImage KcrackpotOnlight, KcrackpotOfflight;
    private static boolean KcrackpotOn;
    
    /**Pcrackpot button/light variables of Crackpot object */ 
    public JButton Pcrackpot;
    private final int PcrackpotLgtX = 396, PcrackpotLgtY = 67;
    private BufferedImage PcrackpotOnLight, PcrackpotOffLight;
    private static boolean PcrackpotOn;
    
    /**Ocrackpot button/light variables of Crackpot object */ 
    public JButton Ocrackpot;
    private final int OcrackpotLgtX = 431, OcrackpotLgtY = 83;
    private BufferedImage OcrackpotOnlight, OcrackpotOfflight;
    private static boolean OcrackpotOn;
    
    /**Tcrackpot button/light variables of Crackpot object */ 
    public JButton Tcrackpot;
    private final int TcrackpotLgtX = 455, TcrackpotLgtY = 87;
    private BufferedImage TcrackpotOnLight, TcrackpotOffLight;
    private static boolean TcrackpotOn;
    
    /**crackpots List variable of Crackpot object */
    public final List<JButton> crackpots;
    
    /**crackpotpanel JPanel variable of Crackpot object */
    public JPanel crackpotpanel; 
    
    private List<JButton> crackpotsReverse;
    private ScheduledExecutorService excecutorService_SkillCrackpotForward = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillCrackpotReverse = Executors.newSingleThreadScheduledExecutor();    
    private ScheduledExecutorService excecutorService_SkillShotCrackpot = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomCrackpotOn = Executors.newScheduledThreadPool(1);
    private JButton currentSkillCrackpot;
    private Runnable skillCrackpotReverse;
    private ExecutorService skillCrackpotReversePool = Executors.newFixedThreadPool(1);
    private Runnable skillCrackpotForward;
    private ExecutorService skillCrackpotForwardPool = Executors.newFixedThreadPool(1);

    
    /**Constructor*/
    
    /**
     * Crackpot Constructor
     * 
     */
    public Crackpot(){
        crackpots = new ArrayList<>();
        init();
        
        skillCrackpotForward = new Runnable(){
            
            @Override
            public void run(){
                for(JButton crackpot : crackpots){
                    if(excecutorService_SkillCrackpotForward.isShutdown() || 
                            excecutorService_RandomCrackpotOn.isShutdown() || 
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
                        setOn(crackpot.getText(), true);
                        currentSkillCrackpot = crackpot;
                    }
                }
        
            }
        };
        
        skillCrackpotReverse = new Runnable(){
            @Override
            public void run(){
                for(JButton crackpot : crackpotsReverse){
                    currentSkillCrackpot = crackpot;
                    
                    if(excecutorService_SkillCrackpotReverse.isShutdown() || 
                            excecutorService_RandomCrackpotOn.isShutdown() || 
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
                    setOn(crackpot.getText(), false);
                }
                
            }
        };
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Crackpot light images
     * and fires the drawCrackpot method
     */
    private void init(){
          
            CcrackpotOnlight = new Texture("/Crackpot/fruit-machine-CRACKPOT-C1-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-C1-A2.png"));
            CcrackpotOfflight = new Texture("/Crackpot/fruit-machine-CRACKPOT-C1-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-C1-A1.png"));
            
            RcrackpotOnLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-R-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-R-A2.png"));
            RcrackpotOffLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-R-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-R-A1.png"));
            
            AcrackpotOnlight = new Texture("/Crackpot/fruit-machine-CRACKPOT-A-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-A-A2.png"));
            AcrackpotOfflight = new Texture("/Crackpot/fruit-machine-CRACKPOT-A-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-A-A1.png"));
            
            C2crackpotOnLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-C2-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-C2-A2.png"));
            C2crackpotOffLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-C2-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-C2-A1.png"));
            
            KcrackpotOnlight = new Texture("/Crackpot/fruit-machine-CRACKPOT-K-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-K-A2.png"));
            KcrackpotOfflight = new Texture("/Crackpot/fruit-machine-CRACKPOT-K-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-K-A1.png"));
            
            PcrackpotOnLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-P-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-P-A2.png"));
            PcrackpotOffLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-P-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-P-A1.png"));
            
            OcrackpotOnlight = new Texture("/Crackpot/fruit-machine-CRACKPOT-O-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-O-A2.png"));
            OcrackpotOfflight = new Texture("/Crackpot/fruit-machine-CRACKPOT-O-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-O-A1.png"));
            
            TcrackpotOnLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-T-A2").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-T-A2.png"));
            TcrackpotOffLight = new Texture("/Crackpot/fruit-machine-CRACKPOT-T-A1").getImage();//ImageIO.read(getClass().getResource("/Crackpot/fruit-machine-CRACKPOT-T-A1.png"));
        
        drawCrackpot();
         
        crackpotpanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
        
            crackpotpanel.setSize(1280, 720);
            crackpotpanel.setOpaque(false);
            crackpotpanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        }};
        
        
    }
    
    
    /**
     * drawCrackpot()
     * 
     * Draws all the Crackpot images/JButtons
     */
    private void drawCrackpot() {
        //0
        Ccrackpot = new JButton("Ccrackpot");
        crackpots.add(Ccrackpot);

        //1
        Rcrackpot = new JButton("Rcrackpot");
        crackpots.add(Rcrackpot);

        //2
        Acrackpot = new JButton("Acrackpot");
        crackpots.add(Acrackpot);

        //3
        C2crackpot = new JButton("C2crackpot");
        crackpots.add(C2crackpot);
        
        //4
        Kcrackpot = new JButton("Kcrackpot");
        crackpots.add(Kcrackpot);
        
        //5
        Pcrackpot = new JButton("Pcrackpot");
        crackpots.add(Pcrackpot);
        
        //6
        Ocrackpot = new JButton("Ocrackpot");
        crackpots.add(Ocrackpot);
        
        //7
        Tcrackpot = new JButton("Tcrackpot");
        crackpots.add(Tcrackpot);
        
        crackpotsReverse = new ArrayList<>(crackpots);
        Collections.reverse(crackpotsReverse);
    }
    
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        if (CcrackpotOn){
            g.drawImage(CcrackpotOnlight, CcrackpotLgtX, CcrackpotLgtY, crackpotLightWidth, crackpotLightHeight, null);
        } else {
            g.drawImage(CcrackpotOfflight, CcrackpotLgtX, CcrackpotLgtY, crackpotLightWidth, crackpotLightHeight, null);
        }

        if (RcrackpotOn){
            g.drawImage(RcrackpotOnLight, RcrackpotLgtX, RcrackpotLgtY, crackpotLightWidth+4, crackpotLightHeight, null);
        } else {
            g.drawImage(RcrackpotOffLight, RcrackpotLgtX, RcrackpotLgtY, crackpotLightWidth+4, crackpotLightHeight, null);
        }

        if (AcrackpotOn){
            g.drawImage(AcrackpotOnlight, AcrackpotLgtX, AcrackpotLgtY, crackpotLightWidth, crackpotLightHeight, null);
        } else {
            g.drawImage(AcrackpotOfflight, AcrackpotLgtX, AcrackpotLgtY, crackpotLightWidth, crackpotLightHeight, null);
        }

        if (C2crackpotOn){
            g.drawImage(C2crackpotOnLight, C2crackpotLgtX, C2crackpotLgtY, crackpotLightWidth-10, crackpotLightHeight-22, null);
        } else {
            g.drawImage(C2crackpotOffLight, C2crackpotLgtX, C2crackpotLgtY, crackpotLightWidth-10, crackpotLightHeight-22, null);
        }

        if (KcrackpotOn){
            g.drawImage(KcrackpotOnlight, KcrackpotLgtX, KcrackpotLgtY, crackpotLightWidth-10, crackpotLightHeight-22, null);
        } else {
            g.drawImage(KcrackpotOfflight, KcrackpotLgtX, KcrackpotLgtY, crackpotLightWidth-10, crackpotLightHeight-22, null);
        }

        if (PcrackpotOn){
            g.drawImage(PcrackpotOnLight, PcrackpotLgtX, PcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight-22, null);
        } else {
            g.drawImage(PcrackpotOffLight, PcrackpotLgtX, PcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight-22, null);
        }

        if (OcrackpotOn){
            g.drawImage(OcrackpotOnlight, OcrackpotLgtX, OcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight-22, null);
        } else {
            g.drawImage(OcrackpotOfflight, OcrackpotLgtX, OcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight-22, null);
        }

        if (TcrackpotOn){
            g.drawImage(TcrackpotOnLight, TcrackpotLgtX, TcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight, null);
        } else {
            g.drawImage(TcrackpotOffLight, TcrackpotLgtX, TcrackpotLgtY, crackpotLightWidth-12, crackpotLightHeight, null);
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
            case "Ccrackpot":
                CcrackpotOn = result;
                break;
            case "Rcrackpot":
                RcrackpotOn = result;
                break;
            case "Acrackpot":
                AcrackpotOn = result;
                break;
            case "C2crackpot":
                C2crackpotOn = result;
                break;
            case "Kcrackpot":
                KcrackpotOn = result;
                break;
            case "Pcrackpot":
                PcrackpotOn = result;
                break;
            case "Ocrackpot":
                OcrackpotOn = result;
                break;
            case "Tcrackpot":
                TcrackpotOn = result;
                break;
        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Crackpot images/JButtons on
     */
    public boolean getOn(String name){
        
        boolean result = false;
        
        switch(name){
            case "Ccrackpot":
                result = CcrackpotOn;
                break;
            case "Rcrackpot":
                result = RcrackpotOn;
                break;
            case "Acrackpot":
                result = AcrackpotOn;
                break;
            case "C2crackpot":
                result = C2crackpotOn;
                break;
            case "Kcrackpot":
                result = KcrackpotOn;
                break;
            case "Pcrackpot":
                result = PcrackpotOn;
                break;
            case "Ocrackpot":
                result = OcrackpotOn;
                break;
            case "Tcrackpot":
                result = TcrackpotOn;
                break;
        }
        
        return result;
    }
    
    
    /**
     * getAllCrackpots()
     * 
     * @return crackpots - returns crackpots images/JButtons
     */
    public List<JButton> getAllCrackpots() {
        return crackpots;
    }
    
    
    /**
     * clearCrackpot()
     * 
     * sets crackpots to off
     */
    public void clearCrackpot(){
        for(int i = 0; i < crackpots.size(); i++){
            setOn(crackpots.get(i).getText(), false);
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
        //System.out.println("Turning all Crackpot lights On");
        for(JButton crackpot : crackpots){
            setOn(crackpot.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning all Crackpot lights Off");
        for(JButton crackpot : crackpots){
            setOn(crackpot.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillForward() {
        //System.out.println("Turning Skill Crackpot Lights Forward On");        
        
        //skillCrackpotForwardPool = Executors.newFixedThreadPool(1);
        
        skillCrackpotForwardPool.execute(skillCrackpotForward);
        
        //skillCrackpotForwardPool.shutdown();
        //skillCrackpotForwardPool = null;
        
    }

    void skillReverse() {
        //System.out.println("Turning Skill Crackpot Lights Reverse On");
        
        //skillCrackpotReversePool = Executors.newFixedThreadPool(1);
        
        skillCrackpotReversePool.execute(skillCrackpotReverse);
        
        //skillCrackpotReversePool.shutdown();
        //skillCrackpotReversePool = null;
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Turning Skill Cash On");
        excecutorService_SkillShotCrackpot = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotCrackpot.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillForward();
                } else {
                    skillReverse();
                }
                excecutorService_SkillShotCrackpot.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Turning Random Crackpot On");
        excecutorService_RandomCrackpotOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomCrackpotOn.scheduleAtFixedRate(new Runnable(){
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
        }, 12, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Turning Random Crackpot Off");
        //System.out.println("Current Skill Crackpot: "+currentSkillCrackpot.getText());
        excecutorService_RandomCrackpotOn.shutdown();
        
        try {
            if (!excecutorService_RandomCrackpotOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomCrackpotOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomCrackpotOn.shutdownNow();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Crackpot.class.getName()).log(Level.SEVERE, null, ex);
        }
        on();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(Crackpot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        //System.out.println("Current Skill cash: "+currentSkillCrackpot.getText());
        excecutorService_SkillCrackpotForward.shutdown();
        excecutorService_SkillCrackpotReverse.shutdown();
        
        try {
            if (!excecutorService_SkillCrackpotForward.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillCrackpotForward.shutdownNow();
            }
            if (!excecutorService_SkillCrackpotReverse.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillCrackpotReverse.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillCrackpotForward.shutdownNow();
            excecutorService_SkillCrackpotReverse.shutdownNow();
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
