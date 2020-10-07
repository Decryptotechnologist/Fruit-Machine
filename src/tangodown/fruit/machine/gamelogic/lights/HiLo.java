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
import java.util.List;
import javax.swing.*;


/**
 * @author Ghomez
 */
public class HiLo {//extends Lights {
    
    /**Attributes*/
    
    /**WinningSpinsIcon light width variable of WinningSpins object */
    public int HiLoLightWidth = 64;
    
    /**WinningSpinsIcon light height variable of WinningSpins object */
    public int HiLoLightHeight = 64;
    
    /**WinningSpinsIcon1 button/light variables of WinningSpins object */ 
    public JButton HiLoLightHI;
    private final int HiLoHILgtX = 294, HiLoHILgtY = 169;
    private BufferedImage HiLoHIOnLight, HiLoHIOffLight;
    private static boolean HiLoLightHIOn;
    
    /**WinningSpinsIcon2 button/light variables of WinningSpins object */ 
    public JButton HiLoLightLO;
    private final int HiLoLOLgtX = 397, HiLoLOLgtY = 187;
    private BufferedImage HiLoLOOnlight, HiLoLOOffLight;
    private static boolean HiLoLightLOOn;

    /**HiLoPanel List variable of HiLo object */
    public List<JButton> hilos = new ArrayList<>();
    
    /**HiLoPanel JPanel variable of HiLo object */
    public JPanel HiLoPanel;
    
    
    
    
    /**Constructor*/
    
    /**
     * HiLo Constructor
     * 
     */
    public HiLo(){
        init();
    }
    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     * Initiates all the HiLo light images
     * and fires the drawHiLos method
     */
    public final void init(){
           
            HiLoHIOnLight = new Texture("/Icon/fruit-machine-sprite-hilo-HIA2").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-hilo-HIA2.png"));
            HiLoHIOffLight = new Texture("/Icon/fruit-machine-sprite-hilo-HIA1").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-hilo-HIA1.png"));
            
            HiLoLOOnlight = new Texture("/Icon/fruit-machine-sprite-hilo-LOA2").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-hilo-LOA2.png"));
            HiLoLOOffLight = new Texture("/Icon/fruit-machine-sprite-hilo-LOA1").getImage();//ImageIO.read(getClass().getResource("/Icon/fruit-machine-sprite-hilo-LOA1.png"));
         
        drawHiLos();
         
        HiLoPanel = new JPanel(){
         
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
                
            HiLoPanel.setSize(1280, 720);
            HiLoPanel.setOpaque(false);
            HiLoPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());

        }};
        
        HiLoPanel.add(HiLoLightHI);
        HiLoPanel.add(HiLoLightLO);
            
        
    }
    
    
    /**
     * drawHiLos()
     * 
     * Draws all the HiLo images/JButtons
     */
    private void drawHiLos() {
        //0
        HiLoLightHI = new JButton("HiLoLightHI");
        hilos.add(HiLoLightHI);
        
        //1
        HiLoLightLO = new JButton("HiLoLightLO");
        hilos.add(HiLoLightLO);
        
    }
    
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g){
            
        //HiLo HI LIGHT
        if (HiLoLightHIOn){
            g.drawImage(HiLoHIOnLight, HiLoHILgtX, HiLoHILgtY, HiLoLightWidth, HiLoLightHeight, null);
        } else {
            g.drawImage(HiLoHIOffLight, HiLoHILgtX, HiLoHILgtY, HiLoLightWidth, HiLoLightHeight, null);
        }

        //HiLo LO LIGHT
        if (HiLoLightLOOn){
            g.drawImage(HiLoLOOnlight, HiLoLOLgtX, HiLoLOLgtY, HiLoLightWidth, HiLoLightHeight, null);
        } else {
            g.drawImage(HiLoLOOffLight, HiLoLOLgtX, HiLoLOLgtY, HiLoLightWidth, HiLoLightHeight, null);
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
            case "HiLoLightHI":
                HiLoLightHIOn = result;
                break;
            case "HiLoLightLO":
                HiLoLightLOOn = result;
                break;
        }
        
//        if(name.equals("HiLoLightHI")){
//            HiLoLightHIOn = result;
//        }
//        if(name.equals("HiLoLightLO")){
//            HiLoLightLOOn = result;
//        }
        
    }
    
    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of HiLo images/JButtons on
     */
    public boolean getOn(String name){
    
        boolean result = false;
        
        switch(name){
            case "HiLoLightHI":
                result = HiLoLightHIOn;
                break;
            case "HiLoLightLO":
                result = HiLoLightLOOn;
                break;
        }
        
//        if(name.equals("HiLoLightHI")){
//            result = HiLoLightHIOn;
//        }
//        if(name.equals("HiLoLightLO")){
//            result = HiLoLightLOOn;
//        }
        
        return result;
    }
    
    
    /**
     * getAllHiLos()
     * 
     * @return hilos - returns HiLo images/JButtons
     */
    public List<JButton> getAllHiLos() {
        return hilos;
    }
    
    
    /**
     * clearHiLo()
     * 
     * sets hilos to off
     */
    public void clearHiLo(){
        for(int i = 0; i < hilos.size(); i++){
            setOn(hilos.get(i).getText(), false);
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
        //System.out.println("Turning All HiLo lights On");
        for(JButton hilo : hilos){
            setOn(hilo.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All HiLo lights Off");
        for(JButton hilo : hilos){
            setOn(hilo.getText(), false);
        }
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * defaultLights()
     * 
     */
    void defaultLights() {
        on();
    }
    
}
