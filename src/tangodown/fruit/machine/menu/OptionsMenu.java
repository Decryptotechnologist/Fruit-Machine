/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.menu;

import tangodown.fruit.machine.input.MouseInput;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.graphics.Fonts;
//import tangodown.fruit.machine.config.Configuration;
import tangodown.fruit.machine.graphics.Display;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Ghomez
 */
public class OptionsMenu extends Menu {
    
    /**Attributes*/
    
    /**OMfirstTick variable of OptionsMenu object */ 
    private boolean OMfirstTick = true;
    
    /**OMTimer variable of OptionsMenu object */ 
    private int OMTimer = 550;
    
    /**tickDelay variable of OptionsMenu object */ 
    private int tickDelay = 60;

    private int width = 600;
    private int height = 720;
    
    //private JButton OK, Cancel;
    private Rectangle rresolution;
    
    private Choice resolution = new Choice();
    //private Choice skyMode = new Choice();
    
    private JTextField twidth, theight, tPname, tPname1, skyMode;
    private JLabel lwidth, lheight, Res, sky, lPname, lPname1;
    
//    Configuration config = new Configuration();
    private int h = 0;
    private int w = 0;
    private int button_width = 80;
    private int button_height = 40;
    
    //public static JPanel window;// = new JPanel();
    
    private String skySel;
    
    public static int selection, selection1;
    private Color optxtColor;
    private JPanel resPanel;
    private Rectangle rresPanel;
    private JPanel dimPanel;
    private Rectangle rdimPanel;
    private JPanel widthPanel;
    private Rectangle rwidthPanel;
    private JPanel heightPanel;
    private Rectangle rheightPanel;
    private JPanel pnamePanel;
    private Rectangle rpnamePanel;
    private JPanel p2namePanel;
    private Rectangle rp2namePanel;
    private JPanel p1namePanel;
    private Rectangle rp1namePanel;
    private JLabel lPname2;
    private JTextField tPname2;
    private JLabel lwidthPX;
    private JLabel lheightPX;
    private JPanel options2Panel;
    private Rectangle roptions2Panel;
    private TitledBorder sndCompound;
    private JLabel lsfx;
    private JLabel lgmeMusic;
    private JCheckBox sndFXcheckBox;
    private JCheckBox gmeMusiccheckBox;
    
    
    /**Constructor*/
    
    
    /**
    * OptionsMenu(Game game)
    * 
    * Creates a new OptionsMenu object
    * 
    * @param game
    */
    public OptionsMenu(Game game) {
        System.out.println("OptionsMenu: New Options Menu Created");
        
        this.game = game;
        Menu.setUp();
        optxtColor = Color.cyan;
        
//        Display.optionsWindow = new JPanel(new FlowLayout());
//        Display.optionsWindow.setBounds(5, 215, 810, 130);
//        Display.optionsWindow.setBorder(compound);
//        Display.optionsWindow.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.96f));
//        Display.optionsWindow.setSize(810, 130);
//        //Display.optionsWindow.setPreferredSize(size);
//        Display.optionsWindow.setOpaque(true);
//        Display.optionsWindow.setVisible(true);
        
        Display.optionsWindow1 = new JPanel(new FlowLayout());
        Display.optionsWindow1.setBounds(5, 350, 810, 130);
        Display.optionsWindow1.setBorder(compound);
        Display.optionsWindow1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.96f));
        Display.optionsWindow1.setSize(810, 130);
        //Display.optionsWindow1.setPreferredSize(size);
        Display.optionsWindow1.setOpaque(true);
        //Display.optionsWindow1.setVisible(true);
    
        //drawButtons();
        
        //Display.panel.add(Display.optionsWindow, 0, 0);
        Display.panel.add(Display.optionsWindow1, 0, 0);
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
     * render(Render target, Graphics2D g)
     * 
     * Renders/Repaints AboutMenu Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
        MouseInput.MouseButton = 0;
        
        g.drawImage(optionsMenuImage, 0, -15, Game.getGameWidth(), Game.getGameHeight()-20, null);

        
        Fonts.drawString(g, new Font("Cosmic Alien", Font.PLAIN, 26), optxtColor, "Options :> ", 186, 198);
        
        
        
        if(MouseInput.MouseX > 600 && MouseInput.MouseX < 600 + 80 && MouseInput.MouseY > 605 && MouseInput.MouseY < 605 + 30) {
            g.drawImage(OKOffBtn, 600, 605, 80, 30, null);
            optxtColor = Color.blue;
            optionsMenuImage = optionsMenuImage1;

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 620 + 43, 609, 22, 20, null);
                g.drawImage(rightArrowIcon, 620 - 28, 610, 22, 20, null);
            }

            if(MouseInput.MouseButton == 1) {
                Sound.sound5.play();
                
                Display.removeOptions();
                game.setMenu(null);
                game.stateManager.setState("menu");
                Display.setStatusBar("Ready");
            }
            
        } else {
            optionsMenuImage = optionsMenuImage0;
            g.drawImage(OKOnBtn, 600, 605, 80, 30, null);
        }
        
        if(MouseInput.MouseX > 710 && MouseInput.MouseX < 710 + 80 && MouseInput.MouseY > 605 && MouseInput.MouseY < 605 + 30) {
            g.drawImage(cancelOffBtn, 710, 605, 80, 30, null);
            optxtColor = Color.green;
            optionsMenuImage = optionsMenuImage1;

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 710 + 83, 609, 22, 20, null);
                g.drawImage(rightArrowIcon, 710 - 25, 610, 22, 20, null);
            }

            if(MouseInput.MouseButton == 1) {
                Sound.sound5.play();
                
                Display.removeOptions();
                game.setMenu(null);
                game.stateManager.setState("menu");
                Display.setStatusBar("Ready");
            }
            
        } else {
            optionsMenuImage = optionsMenuImage0;
            g.drawImage(cancelOnBtn, 710, 605, 80, 30, null);
        }


        g.dispose();
    
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates AboutMenu Object
    * 
    * @param game - the Game of AboutMenu
    * @param up - the up variable of AboutMenu
    * @param down - the down variable of AboutMenu
    * @param left - the left variable of AboutMenu
    * @param right - the right variable of AboutMenu
    * @param fire - the fire variable of AboutMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(OMTimer > 0) {
           OMTimer--;
        }
        if(OMfirstTick) {
            OMfirstTick = false;
            System.out.println("Cue About Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getSnd()){
                Sound.Soundtrack.loop();
            }
            
            //drawButtons();
            Display.addOptions();
        }
        if(OMTimer == 0) {
        }
        
        //Display.revalidate();
    }
    
    /**
    * drawButtons()
    */
//    private void drawButtons() {
//        
//        //resPanel
//        resPanel = new JPanel();
//        rresPanel = new Rectangle(10, 10, 200, 35);
//        resPanel.setBounds(rresPanel);
//        resPanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //resLabel
//        Res = new JLabel("Resolution: ");
//        Res.setBounds(5, 5, 120, 40);
//        Res.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        Res.setForeground(optxtColor);
//
//        //resPanelChoice
//        rresolution = new Rectangle(105, 5, 80, 35);
//        resolution.setBounds(rresolution);
//        //resolution.setFont(new Font("Cosmic Alien", Font.PLAIN, 10));
//        resolution.add("640 x 480");
//        resolution.add("800 x 600");
//        resolution.add("1024 x 768");
//        resolution.add("1240 x 768");
//        resolution.select(0);
//        resolution.setBackground(Color.black);
//        resolution.setForeground(optxtColor);
//        
//        //Build resPanel
//        resPanel.add(Res);
//        resPanel.add(resolution);
//        
//        //Add resPanel
//        Display.optionsWindow.add(resPanel);
//
//        
//        
//        //widthPanel
//        widthPanel = new JPanel();
//        rwidthPanel = new Rectangle(10, 50, 200, 40);
//        widthPanel.setBounds(rwidthPanel);
//        widthPanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //widthLabel
//        lwidth = new JLabel("Width: ");
//        lwidth.setBounds(5, 5, 120, 40);
//        lwidth.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lwidth.setForeground(optxtColor);
//        
//        //widthTextfield
//        twidth = new JTextField("600", 6);
//        twidth.setBounds(130, 5, 80, 40);
//        twidth.setFont(new Font("Cosmic Alien", Font.PLAIN, 14));
//        twidth.setBackground(Color.black);
//        twidth.setForeground(optxtColor);
//        
//        //widthPXLabel
//        lwidthPX = new JLabel("PX");
//        lwidthPX.setBounds(215, 5, 20, 40);
//        lwidthPX.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lwidthPX.setForeground(optxtColor);
//        
//        //Build widthPanel
//        widthPanel.add(lwidth);
//        widthPanel.add(twidth);
//        widthPanel.add(lwidthPX);
//        
//        //Add widthPanel
//        Display.optionsWindow.add(widthPanel);
//        
//        
//        
//        //heightPanel
//        heightPanel = new JPanel();
//        rheightPanel = new Rectangle(10, 90, 200, 40);
//        heightPanel.setBounds(rheightPanel);
//        heightPanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //heightLabel
//        lheight = new JLabel("Height: ");
//        lheight.setBounds(-5, 5, 120, 40);
//        lheight.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lheight.setForeground(optxtColor);
//        
//        //heightTextfield
//        theight = new JTextField("720", 6);
//        theight.setBounds(80, 5, 80, 40);
//        theight.setFont(new Font("Cosmic Alien", Font.PLAIN, 14));
//        theight.setBackground(Color.black);
//        theight.setForeground(optxtColor);
//        
//        //heightPXLabel
//        lheightPX = new JLabel("PX");
//        lheightPX.setBounds(215, 5, 20, 40);
//        lheightPX.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lheightPX.setForeground(optxtColor);
//        
//        //Build heightPanel
//        heightPanel.add(lheight);
//        heightPanel.add(theight);
//        heightPanel.add(lheightPX);
//        
//        //Add heightPanel
//        Display.optionsWindow.add(heightPanel);
//        
//        
//        
//        //Player1 NamePanel
//        pnamePanel = new JPanel();
//        rpnamePanel = new Rectangle(220, 10, 200, 40);
//        pnamePanel.setBounds(rpnamePanel);
//        pnamePanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //Player1 NameLabel
//        lPname = new JLabel("Player1 name: ");
//        lPname.setBounds(5, 5, 120, 40);
//        lPname.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lPname.setForeground(optxtColor);
//
//        //Player1 NameTextfield
//        tPname = new JTextField("Player 1", 10);
//        tPname.setBounds(80, 5, 85, 40);
//        tPname.setFont(new Font("Cosmic Alien", Font.PLAIN, 14));
//        tPname.setBackground(Color.black);
//        tPname.setForeground(optxtColor);
//        
//        //Build Player1 NamePanel
//        pnamePanel.add(lPname);
//        pnamePanel.add(tPname);
//        
//        //Add Player1 NamePanel
//        Display.optionsWindow.add(pnamePanel);
//        
//        
//        
//        //Player2 NamePanel
//        p1namePanel = new JPanel();
//        rp1namePanel = new Rectangle(220, 70, 200, 40);
//        p1namePanel.setBounds(rp1namePanel);
//        p1namePanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //Player2 NameLabel
//        lPname1 = new JLabel("Player2 name: ");
//        lPname1.setBounds(5, 5, 120, 40);
//        lPname1.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lPname1.setForeground(optxtColor);
//
//        //Player2 NameTextfield
//        tPname1 = new JTextField("Player 2", 10);
//        tPname1.setBounds(80, 5, 85, 40);
//        tPname1.setFont(new Font("Cosmic Alien", Font.PLAIN, 14));
//        tPname1.setBackground(Color.black);
//        tPname1.setForeground(optxtColor);
//        
//        //Build Player2 NamePanel
//        p1namePanel.add(lPname1);
//        p1namePanel.add(tPname1);
//        
//        //Add Player2 NamePanel
//        Display.optionsWindow.add(p1namePanel);
//        
//        
//        
//        //Player3 NamePanel
//        p2namePanel = new JPanel();
//        rp2namePanel = new Rectangle(220, 70, 200, 40);
//        p2namePanel.setBounds(rp2namePanel);
//        p2namePanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        //Player3 NameLabel
//        lPname2 = new JLabel("Player3 name: ");
//        lPname2.setBounds(5, 5, 120, 40);
//        lPname2.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        lPname2.setForeground(optxtColor);
//
//        //Player3 NameTextfield
//        tPname2 = new JTextField("Player 3", 10);
//        tPname2.setBounds(80, 5, 85, 40);
//        tPname2.setFont(new Font("Cosmic Alien", Font.PLAIN, 14));
//        tPname2.setBackground(Color.black);
//        tPname2.setForeground(optxtColor);
//        
//        //Build Player3 NamePanel
//        p2namePanel.add(lPname2);
//        p2namePanel.add(tPname2);
//        
//        //Add Player3 NamePanel
//        Display.optionsWindow.add(p2namePanel);
//        
//        
//        redLine = BorderFactory.createLineBorder(Color.red, 2);
//        raisedbevel = BorderFactory.createRaisedBevelBorder();
//        loweredbevel = BorderFactory.createLoweredBevelBorder();
//        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
//        compound = BorderFactory.createCompoundBorder(redLine, compound);
//        
//        sndCompound = BorderFactory.createTitledBorder(compound, "Sound", TitledBorder.LEFT, TitledBorder.TOP);
//        sndCompound.setTitleFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        sndCompound.setTitleColor(optxtColor);
//        
//        //options2Panel
//        options2Panel = new JPanel();
//        roptions2Panel = new Rectangle(5, 70, 590, 100);
//        options2Panel.setBounds(roptions2Panel);
//        options2Panel.setBorder(sndCompound);
//        options2Panel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        
//        
//        
//        //Create SFX CheckBox
//        sndFXcheckBox = new JCheckBox("Sound FX: ", true);
//        sndFXcheckBox.setHorizontalTextPosition(SwingConstants.LEFT);
//        sndFXcheckBox.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        sndFXcheckBox.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        sndFXcheckBox.setForeground(optxtColor);
//        
//        options2Panel.add(sndFXcheckBox);
//        
//        //Add ItemListener to SFX checkBox
//        sndFXcheckBox.addItemListener(new ItemListener() {
//
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    game.setGameSound(true);
//                } else {
//                    game.setGameSound(false);
//                    
//                    Sound.Focus.stop();
//                    Sound.Paused.stop();
//                    Sound.Soundtrack.stop();
//                    Sound.sound5.stop();
//                }
//            }
//        });
//        
//        
//        
//        
//        //Create Game Music CheckBox
//        gmeMusiccheckBox = new JCheckBox("Game Music: ", true);
//        gmeMusiccheckBox.setHorizontalTextPosition(SwingConstants.LEFT);
//        gmeMusiccheckBox.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
//        gmeMusiccheckBox.setFont(new Font("Cosmic Alien", Font.PLAIN, 12));
//        gmeMusiccheckBox.setForeground(optxtColor);
//        
//        //Add ItemListener to Game Music checkBox
//        gmeMusiccheckBox.addItemListener(new ItemListener() {
//
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    game.setGameMusic(true);
//                } else {
//                    game.setGameMusic(false);
//                    
//                    
//                    Sound.Focus.stop();
//                    Sound.Paused.stop();
//                    Sound.Soundtrack.stop();
//                    Sound.sound5.stop();
//                }
//            }
//        });
//        
//        
//        options2Panel.add(gmeMusiccheckBox);
//        
//        //options2Panel.validate();
//        
//        //Add options2Panel
//        Display.optionsWindow1.add(options2Panel);
//        
//        //Validate OptionsWindow
//        //Display.optionsWindow.validate();
//        
//        //Validate OptionsWindow1
//        //Display.optionsWindow1.validate();
//        
//        Display.setStatusBar("Options Menu");
//}

    /**
    * setConfig()
    * 
    */
    private void setConfig(){
        
//        config.saveConfiguration("width", Integer.toString(parseWidth()));
//        config.saveConfiguration("height", Integer.toString(parseHeight()));
//        config.saveConfiguration("skySel", Integer.toString(parseSky()));
//        config.saveConfiguration("Player-Name", tPname.getText());

        JOptionPane.showMessageDialog(null, "Your Settings Have Been Saved :)\n" +
                        "Width Set to: "+parseWidth()+" pixels\n" +
                        "Height Set to: "+parseHeight()+" pixels\n" +
                        "Sky Set to: "+skySel+" Sky\n"+
                        "Player Name: "+tPname.getText());

        //dispose();
        //new Launcher(0);
    }
    
    
    /**
    * parseSky()
    * 
    * @return selection1
    */
    protected int parseSky() {
        drop();
        return selection1;
    }

    
    /**
    * drop()
    * 
    */
    private void drop() {
        selection = resolution.getSelectedIndex();
        if(selection == 0) {
                w = 640;
                h = 480;
        }
        if(selection == 1 || selection == -1) {
                w = 800;
                h = 600;
        }
        if(selection == 2) {
                w = 1024;
                h = 768;
        }
        if(selection == 3) {
                w = 1240;
                h = 768;
        }
        //selection1 = skyMode.getSelectedIndex();
        if(selection1 == 0) {//game sky
                skySel = "Game";
        }
        if(selection1 == 1 || selection == -1) {//natural sky
                skySel = "Natural";
        }
    }
	
    
    /**
    * getSelection()
    * 
    * @return selection
    */
    public static int getSelection() {
        return selection;
    }
	
    
    /**
    * getSelection1()
    * 
    * @return selection1
    */
    public static int getSelection1() {
        return selection1;
    }
	
    
    /**
    * parseWidth()
    * 
    */
    private int parseWidth() {
        try{
                int w = Integer.parseInt(twidth.getText());
                return w;
        }catch(NumberFormatException e) {
                drop();
                return w;
        }
    }

    
    /**
    * parseHeight()
    * 
    */
    private int parseHeight() {
        try{
                int h = Integer.parseInt(theight.getText());
                return h;
        }catch(NumberFormatException e) {
                drop();
                return h;
        }
    }
    
}
