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
public class Static1 {//extends Lights {

    /**Attributes*/
    
    /**StartFeature light width variable of Static object */
    public int startsFeatLightWidth = 202;
    
    /**StartFeature light height variable of Static object */
    public int startsFeatLightHeight = 144;
    
    /**StartFeatureIcon light width variable of Static object */
    public int startsFeatIconLightWidth = 64;
    
    /**StartFeatureIcon light height variable of Static object */
    public int startsFeatIconLightHeight = 64;
    
    /**startsFeat button/light variables of Static object */ 
    public JButton startsFeat;
    private final int startsFeatLgtX = 596, startsFeatLgtY = 305;
    private BufferedImage startsFeatOnlight;
    private static boolean startsFeatOn;
    
    /**startsFeatIcon1 button/light variables of Static object */ 
    public JButton startsFeatIcon1;
    private final int startsFeatIcon1LgtX = 624, startsFeatIcon1LgtY = 368;
    private BufferedImage startsFeatIcon1OnLight, startsFeatIcon1Offlight;
    private static boolean startsFeatIcon1On;
    
    /**startsFeatIcon2 button/light variables of Static object */ 
    public JButton startsFeatIcon2;
    private final int startsFeatIcon2LgtX = 668, startsFeatIcon2LgtY = 368;
    private BufferedImage startsFeatIcon2Onlight, startsFeatIcon2Offlight;
    private static boolean startsFeatIcon2On;
    
    /**startsFeatIcon3 button/light variables of Static object */ 
    public JButton startsFeatIcon3;
    private final int startsFeatIcon3LgtX = 712, startsFeatIcon3LgtY = 368;
    private BufferedImage startsFeatIcon3OnLight, startsFeatIcon3Offlight;
    private static boolean startsFeatIcon3On;
    
    /**startsFeatIcon3 button/light variables of Static object */ 
    public JButton startsFeatIcon1BG;
    private final int startsFeatIcon1BGLgtX = 624, startsFeatIcon1BGLgtY = 368;
    private BufferedImage startsFeatIcon1BGOnLight, startsFeatIcon1BGOfflight;
    private static boolean startsFeatIcon1BGOn;
    
    /**startsFeatIcon3 button/light variables of Static object */ 
    public JButton startsFeatIcon2BG;
    private final int startsFeatIcon2BGLgtX = 668, startsFeatIcon2BGLgtY = 368;
    private BufferedImage startsFeatIcon2BGOnLight, startsFeatIcon2BGOfflight;
    private static boolean startsFeatIcon2BGOn;
    
    /**startsFeatIcon3 button/light variables of Static object */ 
    public JButton startsFeatIcon3BG;
    private final int startsFeatIcon3BGLgtX = 712, startsFeatIcon3BGLgtY = 368;
    private BufferedImage startsFeatIcon3BGOnLight, startsFeatIcon3BGOfflight;
    private static boolean startsFeatIcon3BGOn;
    
    /**StaticList List variable of Static1 object */
    public List<JButton> StaticList = new ArrayList<>();
    
    /**staticPanel JPanel variable of Static1 object */
    public JPanel staticPanel;

    
    /**Constructor*/
    
    /**
     * Static1 Constructor
     * 
     */
    public Static1(){
        init();
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     * Initiates all the Static1 light images
     * and fires the drawStatix method
     *
     */
    public final void init(){
        
            startsFeatOnlight = new Texture("/Static/fruit-machine-sprite-startsFeatBG").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-startsFeatBG.png"));
            
            startsFeatIcon1OnLight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A2.png"));
            
            startsFeatIcon1Offlight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A1.png"));
            
            startsFeatIcon2Onlight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A2.png"));
            
            startsFeatIcon2Offlight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A1.png"));
            
            startsFeatIcon3OnLight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A2.png"));
            
            startsFeatIcon3Offlight = new Texture("/Static/fruit-machine-sprite-TDIcon64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIcon64-A1.png"));
            
            startsFeatIcon1BGOfflight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A1.png"));
            
            startsFeatIcon1BGOnLight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A2.png"));
            
            startsFeatIcon2BGOfflight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A1.png"));
            
            startsFeatIcon2BGOnLight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A2.png"));
            
            startsFeatIcon3BGOfflight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A1").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A1.png"));
            
            startsFeatIcon3BGOnLight = new Texture("/Static/fruit-machine-sprite-TDIconBG64-A2").getImage();//ImageIO.read(getClass().getResource("/Static/fruit-machine-sprite-TDIconBG64-A2.png"));
            
        drawStatix();
         
        staticPanel = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);

            staticPanel.setSize(1280, 720);
            staticPanel.setOpaque(false);
            staticPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
       
        }};
        
    }
    
    
    /**
     * drawStatix()
     * 
     * Draws all the Static1 images/JButtons
     */
    private void drawStatix() {
        //0
        startsFeat = new JButton("startsFeat");
        StaticList.add(startsFeat);
        
        //1
        startsFeatIcon1BG = new JButton("startsFeatIcon1BG");
        StaticList.add(startsFeatIcon1BG);
        
        //2
        startsFeatIcon1 = new JButton("startsFeatIcon1");
        StaticList.add(startsFeatIcon1);

        //3
        startsFeatIcon2BG = new JButton("startsFeatIcon2BG");
        StaticList.add(startsFeatIcon2BG);
        
        //4
        startsFeatIcon2 = new JButton("startsFeatIcon2");
        StaticList.add(startsFeatIcon2);

        //5
        startsFeatIcon3BG = new JButton("startsFeatIcon3BG");
        StaticList.add(startsFeatIcon3BG);
        
        //6
        startsFeatIcon3 = new JButton("startsFeatIcon3");
        StaticList.add(startsFeatIcon3);

    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        
        g.drawImage(startsFeatOnlight, startsFeatLgtX, startsFeatLgtY, startsFeatLightWidth, startsFeatLightHeight, null);

        if(startsFeatIcon1BGOn){
            g.drawImage(startsFeatIcon1BGOnLight, startsFeatIcon1BGLgtX, startsFeatIcon1BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon1BGOfflight, startsFeatIcon1BGLgtX, startsFeatIcon1BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        if(startsFeatIcon1On){
            g.drawImage(startsFeatIcon1OnLight, startsFeatIcon1LgtX, startsFeatIcon1LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon1Offlight, startsFeatIcon1LgtX, startsFeatIcon1LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        if(startsFeatIcon2BGOn){
            g.drawImage(startsFeatIcon2BGOnLight, startsFeatIcon2BGLgtX, startsFeatIcon2BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon2BGOfflight, startsFeatIcon2BGLgtX, startsFeatIcon2BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        if(startsFeatIcon2On){
            g.drawImage(startsFeatIcon2Onlight, startsFeatIcon2LgtX, startsFeatIcon2LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon2Offlight, startsFeatIcon2LgtX, startsFeatIcon2LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        if(startsFeatIcon3BGOn){
            g.drawImage(startsFeatIcon3BGOnLight, startsFeatIcon3BGLgtX, startsFeatIcon3BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon3BGOfflight, startsFeatIcon3BGLgtX, startsFeatIcon3BGLgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        if(startsFeatIcon3On){
            g.drawImage(startsFeatIcon3OnLight, startsFeatIcon3LgtX, startsFeatIcon3LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }else{
            g.drawImage(startsFeatIcon3Offlight, startsFeatIcon3LgtX, startsFeatIcon3LgtY, startsFeatIconLightWidth, startsFeatIconLightHeight, null);
        }

        g.dispose();
    }

    
    /**
     * getOn()
     * 
     * @param name
     * 
     * @return result - returns result of Static1 images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "startsFeat":
                result = startsFeatOn;
                break;
            case "startsFeatIcon1BG":
                result = startsFeatIcon1BGOn;
                break;
            case "startsFeatIcon1":
                result = startsFeatIcon1On;
                break;
            case "startsFeatIcon2BG":
                result = startsFeatIcon2BGOn;
                break;
            case "startsFeatIcon2":
                result = startsFeatIcon2On;
                break;
            case "startsFeatIcon3BG":
                result = startsFeatIcon3BGOn;
                break;
            case "startsFeatIcon3":
                result = startsFeatIcon3On;
                break;
        }
        
        //starts feat
//        if(name.equals("startsFeat")){
//            result = startsFeatOn;
//        }
//
//        //startsFeatIcon1BG
//        if(name.equals("startsFeatIcon1BG")){
//            result = startsFeatIcon1BGOn;
//        }
//        
//        //startsFeatIcon1
//        if(name.equals("startsFeatIcon1")){
//            result = startsFeatIcon1On;
//        }
//        
//        //startsFeatIcon2BG
//        if(name.equals("startsFeatIcon2BG")){
//            result = startsFeatIcon2BGOn;
//        }
//        
//        //startsFeatIcon2
//        if(name.equals("startsFeatIcon2")){
//            result = startsFeatIcon2On;
//        }
//        
//        //startsFeatIcon3BG
//        if(name.equals("startsFeatIcon3BG")){
//            result = startsFeatIcon3BGOn;
//        }
//        
//        //startsFeatIcon3
//        if(name.equals("startsFeatIcon3")){
//            result = startsFeatIcon3On;
//        }
        
        
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
            case "startsFeat":
                startsFeatOn = result;
                break;
            case "startsFeatIcon1BG":
                startsFeatIcon1BGOn = result;
                break;
            case "startsFeatIcon1":
                startsFeatIcon1On = result;
                break;
            case "startsFeatIcon2BG":
                startsFeatIcon2BGOn = result;
                break;
            case "startsFeatIcon2":
                startsFeatIcon2On = result;
                break;
            case "startsFeatIcon3BG":
                startsFeatIcon3BGOn = result;
                break;
            case "startsFeatIcon3":
                startsFeatIcon3On = result;
                break;
        }
        
        
        //startsFeat
//        if(name.equals("startsFeat")){
//            startsFeatOn = result;
//        }
//        
//        //startsFeatIcon1BG
//        if(name.equals("startsFeatIcon1BG")){
//            startsFeatIcon1BGOn = result;
//        }
//        
//        //startsFeatIcon1
//        if(name.equals("startsFeatIcon1")){
//            startsFeatIcon1On = result;
//        }
//        
//        //startsFeatIcon2BG
//        if(name.equals("startsFeatIcon2BG")){
//            startsFeatIcon2BGOn = result;
//        }
//        
//        //startsFeatIcon2
//        if(name.equals("startsFeatIcon2")){
//            startsFeatIcon2On = result;
//        }
//        
//        //startsFeatIcon3BG
//        if(name.equals("startsFeatIcon3BG")){
//            startsFeatIcon3BGOn = result;
//        }
//        
//        //startsFeatIcon3
//        if(name.equals("startsFeatIcon3")){
//            startsFeatIcon3On = result;
//        }
        
    }
    
    
    /**
     * getAllStatix()
     * 
     * @return StaticList - returns Static1 images/JButtons
     */
    public List<JButton> getAllStatix() {
        return StaticList;
    }
    
    
    /**
     * clearStatic()
     * 
     * sets StaticList to off
     */
    public void clearStatic(){
        for(int i = 0; i < StaticList.size(); i++){
            setOn(StaticList.get(i).getText(), false);
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
        //System.out.println("Turning All Static Lights On");
        for(JButton stat : StaticList){// int i = 0; i < StaticList.size(); i++){
            setOn(stat.getText(), true);
        }
    }

    //@Override
    void off() {
        //System.out.println("Turning All Static Lights Off");
        for(JButton stat : StaticList){// int i = 0; i < StaticList.size(); i++){
            setOn(stat.getText(), false);
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
        setOn(StaticList.get(0).getText(), true);
    }
    
}
