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
public class Features {//extends Lights {
    
    /**Attributes*/
    
    /**Features light width variable of Features object */
    public int FeaturesLightWidth = 128;
    
    /**Features light height variable of Features object */
    public int FeaturesLightHeight = 96;
    
    /**feat1 button/light variables of Features object */ 
    public JButton feat1;
    private final int feat1LgtX = 464, feat1LgtY = 260;
    private BufferedImage feat1Onlight, feat1Offlight;
    private boolean feat1On;
    
    /**feat2 button/light variables of Features object */ 
    public JButton feat2;
    private final int feat2LgtX = 490, feat2LgtY = 225;
    private BufferedImage feat2OnLight, feat2OffLight;
    private boolean feat2On;
    
    /**feat3 button/light variables of Features object */ 
    public JButton feat3;
    private final int feat3LgtX = 510, feat3LgtY = 190;
    private BufferedImage feat3Onlight, feat3Offlight;
    private boolean feat3On;
    
    /**feat4 button/light variables of Features object */ 
    public JButton feat4;
    private final int feat4LgtX = 490, feat4LgtY = 155;
    private BufferedImage feat4OnLight, feat4OffLight;
    private boolean feat4On;
    
    /**feat5 button/light variables of Features object */ 
    public JButton feat5;
    private final int feat5LgtX = 510, feat5LgtY = 120;
    private BufferedImage feat5Onlight, feat5Offlight;
    private boolean feat5On;
    
    /**feat6 button/light variables of Features object */ 
    public JButton feat6;
    private final int feat6LgtX = 480, feat6LgtY = 85;
    private BufferedImage feat6OnLight, feat6OffLight;
    private boolean feat6On;
    
    /**feat7 button/light variables of Features object */ 
    public JButton feat7;
    private final int feat7LgtX = 450, feat7LgtY = 50;
    private BufferedImage feat7Onlight, feat7Offlight;
    private boolean feat7On;
    
    //TAKE FEATURES LIGHT
    
    /**takeFeat button/light variables of Features object */ 
    public JButton takeFeat;
    private final int takeFeatLgtX = 545, takeFeatLgtY = 50;
    private BufferedImage takeFeatOnlight, takeFeatOfflight;
    private boolean takeFeatOn;
    
    /**allFeatures List variable of Features object */
    public List<JButton> allFeatures;
    
    /**featuresPanel JPanel variable of Features object */
    public JPanel featuresPanel;
    
    /**featuresReverse List variable of Features object */
    private List<JButton> featuresReverse;
    private ScheduledExecutorService excecutorService_SkillFeatureUp = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillFeatureDown = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomFeatureOn = Executors.newScheduledThreadPool(1);
    private ScheduledExecutorService excecutorService_SkillShotFeatures = Executors.newSingleThreadScheduledExecutor();
    private JButton currentSkillFeature;
    private Runnable skillFeatureUp;
    private ExecutorService skillFeatureUpPool = Executors.newFixedThreadPool(1);
    private Runnable skillFeatureDown;
    private ExecutorService skillFeatureDownPool = Executors.newFixedThreadPool(1);

    
    /**Constructor*/
    
    /**
     * Features Constructor
     * 
     */
    public Features(){
        allFeatures = new ArrayList<>();
        init();
        
        skillFeatureUp = new Runnable(){
            
            @Override
            public void run(){
                for(JButton feature : allFeatures){
                    if(excecutorService_SkillFeatureUp.isShutdown() || 
                            excecutorService_RandomFeatureOn.isShutdown() || 
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
                        setOn(feature.getText(), true);
                        currentSkillFeature = feature;
                    }
                    
                }
                
            }
        };
        
        skillFeatureDown = new Runnable(){
            @Override
            public void run(){
                for(JButton feature : featuresReverse){
                    currentSkillFeature = feature;
                    
                    if(excecutorService_SkillFeatureDown.isShutdown() || 
                            excecutorService_RandomFeatureOn.isShutdown() || 
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
                    setOn(feature.getText(), false);
                    
                }
                
            }
        };
        
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Features light images
     * and fires the drawFeatures method
     */
    public final void init(){
        
            feat1Onlight = new Texture("/Features/fruit-machine-sprite-nearestwinFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-nearestwinFeatureA1.png"));
            feat1Offlight = new Texture("/Features/fruit-machine-sprite-nearestwinFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-nearestwinFeatureA2.png"));
            
            feat2OnLight = new Texture("/Features/fruit-machine-sprite-doubleornothingFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-doubleornothingFeatureA1.png"));
            feat2OffLight = new Texture("/Features/fruit-machine-sprite-doubleornothingFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-doubleornothingFeatureA2.png"));
            
            feat3Onlight = new Texture("/Features/fruit-machine-sprite-winspinFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-winspinFeatureA1.png"));
            feat3Offlight = new Texture("/Features/fruit-machine-sprite-winspinFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-winspinFeatureA2.png"));
            
            feat4OnLight = new Texture("/Features/fruit-machine-sprite-mysteryFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-mysteryFeatureA1.png"));
            feat4OffLight = new Texture("/Features/fruit-machine-sprite-mysteryFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-mysteryFeatureA2.png"));
            
            feat5Onlight = new Texture("/Features/fruit-machine-sprite-skillcashFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-skillcashFeatureA1.png"));
            feat5Offlight = new Texture("/Features/fruit-machine-sprite-skillcashFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-skillcashFeatureA2.png"));
            
            feat6OnLight = new Texture("/Features/fruit-machine-sprite-barstoppaFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-barstoppaFeatureA1.png"));
            feat6OffLight = new Texture("/Features/fruit-machine-sprite-barstoppaFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-barstoppaFeatureA2.png"));
            
            feat7Onlight = new Texture("/Features/fruit-machine-sprite-crackpotFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-crackpotFeatureA1.png"));
            feat7Offlight = new Texture("/Features/fruit-machine-sprite-crackpotFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-crackpotFeatureA2.png"));
            
            takeFeatOnlight = new Texture("/Features/fruit-machine-sprite-takeFeatureA1").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-takeFeatureA1.png"));
            takeFeatOfflight = new Texture("/Features/fruit-machine-sprite-takeFeatureA2").getImage();//ImageIO.read(getClass().getResource("/Features/fruit-machine-sprite-takeFeatureA2.png"));
            
         drawFeatures();
         
         featuresPanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
        
            featuresPanel.setSize(1280, 720);
            featuresPanel.setOpaque(false);
            featuresPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
            }
        };
         
        
        
    }
    
    
    /**
     * drawFeatures()
     * 
     * Draws all the Features images/JButtons
     */
    private void drawFeatures() {
        //0: Nearest Win
        feat1 = new JButton("feat1");
        allFeatures.add(feat1);

        //1: Double or Nothing
        feat2 = new JButton("feat2");
        allFeatures.add(feat2);

        //2: Win Spins
        feat3 = new JButton("feat3");
        allFeatures.add(feat3);

        //3: Mystery Win
        feat4 = new JButton("feat4");
        allFeatures.add(feat4);
        
        //4: Skill Cash
        feat5 = new JButton("feat5");
        allFeatures.add(feat5);
        
        //5: BAR Stoppa
        feat6 = new JButton("feat6");
        allFeatures.add(feat6);
        
        //6: Crackpot
        feat7 = new JButton("feat7");
        allFeatures.add(feat7);
        
        //7: Take Feature
        takeFeat = new JButton("takeFeat");
        allFeatures.add(takeFeat);
        
        featuresReverse = new ArrayList<>(allFeatures);
        Collections.reverse(featuresReverse);
        
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
                
        if (feat1On){
            g.drawImage(feat1Onlight, feat1LgtX, feat1LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat1Offlight, feat1LgtX, feat1LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat2On){
            g.drawImage(feat2OnLight, feat2LgtX, feat2LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat2OffLight, feat2LgtX, feat2LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat3On){
            g.drawImage(feat3Onlight, feat3LgtX, feat3LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat3Offlight, feat3LgtX, feat3LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat4On){
            g.drawImage(feat4OnLight, feat4LgtX, feat4LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat4OffLight, feat4LgtX, feat4LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat5On){
            g.drawImage(feat5Onlight, feat5LgtX, feat5LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat5Offlight, feat5LgtX, feat5LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat6On){
            g.drawImage(feat6OnLight, feat6LgtX, feat6LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat6OffLight, feat6LgtX, feat6LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (feat7On){
            g.drawImage(feat7Onlight, feat7LgtX, feat7LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        } else {
            g.drawImage(feat7Offlight, feat7LgtX, feat7LgtY, FeaturesLightWidth, FeaturesLightHeight, null);
        }

        if (takeFeatOn){
            g.drawImage(takeFeatOnlight, takeFeatLgtX, takeFeatLgtY, 96, 80, null);
        } else {
            g.drawImage(takeFeatOfflight, takeFeatLgtX, takeFeatLgtY, 96, 80, null);
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
            case "feat1":
                feat1On = result;
                break;
            case "feat2":
                feat2On = result;
                break;
            case "feat3":
                feat3On = result;
                break;
            case "feat4":
                feat4On = result;
                break;
            case "feat5":
                feat5On = result;
                break;
            case "feat6":
                feat6On = result;
                break;
            case "feat7":
                feat7On = result;
                break;
            case "takeFeat":
                takeFeatOn = result;
                break;
        }
        
    }

    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Features images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "feat1":
                result = feat1On;
                break;
            case "feat2":
                result = feat2On;
                break;
            case "feat3":
                result = feat3On;
                break;
            case "feat4":
                result = feat4On;
                break;
            case "feat5":
                result = feat5On;
                break;
            case "feat6":
                result = feat6On;
                break;
            case "feat7":
                result = feat7On;
                break;
            case "takeFeat":
                result = takeFeatOn;
                break;
        }
        
        return result;
    }
    
    
    /**
     * getAllFeatures()
     * 
     * @return allFeatures - returns Features images/JButtons
     */
    public List<JButton> getAllFeatures() {
        return allFeatures;
    }
    
    
    /**
     * clearFeatures()
     * 
     * sets allFeatures to off
     */
    public void clearFeatures(){
        for(int i = 0; i < allFeatures.size(); i++){
            setOn(allFeatures.get(i).getText(), false);
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
        //System.out.println("Turning All Feature lights On");
        for(JButton feature : allFeatures){
            setOn(feature.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All Feature lights Off");
        for(JButton feature : allFeatures){
            setOn(feature.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void skillUp() {
        //System.out.println("Turning Skill Features Lights Up On.");        
        
        //skillFeatureUpPool = Executors.newFixedThreadPool(1);
        
        skillFeatureUpPool.execute(skillFeatureUp);
        
        //skillFeatureUpPool.shutdown();
        //skillFeatureUpPool = null;
        
    }

    
    void skillDown() {
        //System.out.println("Turning Skill Features Lights Down Off.");
        
        //skillFeatureDownPool = Executors.newFixedThreadPool(1);
        
        skillFeatureDownPool.execute(skillFeatureDown);
        
        //skillFeatureDownPool.shutdown();
        //skillFeatureDownPool = null;
    }
    
    /**
     * skillShot()
     * 
     */
    void skillShot() {
        System.out.println("Turning Skill Cash On");
        excecutorService_SkillShotFeatures = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillShotFeatures.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillUp();
                } else {
                    skillDown();
                }
                excecutorService_SkillShotFeatures.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOn()
     * 
     */
    void randomOn() {
        System.out.println("Turning Skill Features On");
        excecutorService_RandomFeatureOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomFeatureOn.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillUp();
                } else {
                    skillDown();
                }
            }
        }, 14, 1, TimeUnit.SECONDS);
    }
    
    /**
     * randomOff()
     * 
     */
    void randomOff() {
        System.out.println("Turning Skill Features Off");
        //System.out.println("Current Skill Features: "+currentSkillFeature.getText());
        excecutorService_RandomFeatureOn.shutdown();
        
        try {
            if (!excecutorService_RandomFeatureOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomFeatureOn.shutdownNow();
            } 
        } catch (InterruptedException e) {
            excecutorService_RandomFeatureOn.shutdownNow();
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
            Logger.getLogger(Crackpot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * skillShotStop()
     * 
     */
    void skillShotStop() {
        System.out.println("Current Skill cash: "+currentSkillFeature.getText());
        excecutorService_SkillFeatureUp.shutdown();
        excecutorService_SkillFeatureDown.shutdown();
        
        try {
            if (!excecutorService_SkillFeatureUp.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillFeatureUp.shutdownNow();
            }
            if (!excecutorService_SkillFeatureDown.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillFeatureDown.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillFeatureUp.shutdownNow();
            excecutorService_SkillFeatureDown.shutdownNow();
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
