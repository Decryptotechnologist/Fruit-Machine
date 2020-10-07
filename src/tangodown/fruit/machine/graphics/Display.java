/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.border.*;
import tangodown.fruit.machine.state.StateManager;
import tangodown.fruit.machine.input.*;
import tangodown.fruit.machine.gamelogic.*;
import tangodown.fruit.machine.ui.*;
import tangodown.fruit.machine.splash.SplashScreenDriver;
import tangodown.fruit.machine.utils.Util;

/**
 *
 * @author Ghomez
 */
public class Display {

    /**Attributes*/
    
    /**frame variable of Display object */
    public static JFrame frame;
    
    /**statusbar variable of Display object */
    public static JLabel statusbar;
    
    /**showFPS variable of Display object */
    public static boolean showFPS = true;
    
    /**showUPS variable of Display object */
    public static boolean showUPS;
    
    /**theBank variable of Display object */
    public static String theBank;
    
    /**theCredit variable of Display object */
    public static String theCredit;
    
    /**panel variable of Display object */
    public static JLayeredPane panel;
    
    /**holdNudge variable of Display object */
    public static boolean holdNudge = false;
    
    /**aboutWindow JPanel of Display object */
    public static JPanel aboutWindow;
    
    /**instructionsWindow JPanel of Display object */
    public static JPanel instructionsWindow;
    
    /**showBounds variable of Display object */
    public static boolean showBounds;

    /**theWidth variable of Display object */
    public int theWidth;
    
    /**theHeight variable of Display object */
    public int theHeight;
    
    /**thread variable of Display object */
    public Thread thread;
    
    /**running variable of Display object */
    public static boolean running;
    
    /**thefps variable of Display object */
    public static String thefps;
    
    /**theUps variable of Display object */
    public static String theUps;
    
    /**gameTime variable of Display object */
    public int gameTime;
    
    /**menubar variable of Display object */
    private static JMenuBar menubar;   
    
    /**size variable of Display object */
    private static Dimension size;
    
    /**optionsWindow JPanel of Display object */
    //public static JPanel optionsWindow;
    
    /**redLine Border of Display object */
    public static Border redLine;
    
    /**raisedbevel Border of Display object */
    public static Border raisedbevel;
    
    /**loweredbevel Border of Display object */
    public static Border loweredbevel;
    
    /**compound CompoundBorder of Display object */
    public static CompoundBorder compound;
    
    /**optionsWindow1 JPanel of Display object */
    public static JPanel optionsWindow1;

    /**frameWidth variable of Display object*/
    private int frameWidth = 820;
    
    /**frameHeight variable of Display object*/
    private int frameHeight = 740;
    
    /**panel1 JPanel of Display object */
    public static JPanel panel1;
    

    /**Links*/
    
    /**game variable of Display object */
    public static Game game;
    
    /**machine Machine of Display object */
    public Machine machine;
    
    /**aMachine Machine of Display object */
    public static Machine aMachine;
    
    public static StateManager stateManager;
    
    /**input variable of Display object */
    public Input input;
   
    /**icon variable of Display object */
    public static BufferedImage icon;// = new Texture("/fruit-machine-sprite-Logo").getImage();

    
    
    /**Constructor*/
    
    
    /**
    * Display()
    * 
    * Creates a new Display object
    */
    public Display() {
        System.out.println("New Display Created . . .");
        
        //if frame already exists/not null, dispose() frame
        if(frame != null){
            frame.dispose();
        }
        //Set Look and Feel
        setLAF();
        

        //Set Icon
        setIcon();
        
        //Create new frame: Game.TITLE arg
        frame = new JFrame(Game.TITLE);
        
        //Create new Dimension: frameWidth, frameHeight args
        size = new Dimension(frameWidth, frameHeight);
        
        //Create new panel: new BorderLayout arg
        panel1 = new JPanel(new BorderLayout());
        panel1.setPreferredSize(size);
        
        //Create new panel: new BorderLayout arg
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.setPreferredSize(size);
        
        //Create new layered pane: new BorderLayout arg
        panel = new JLayeredPane();
        panel.setPreferredSize(size);
        
               
        
//        redLine = BorderFactory.createLineBorder(Color.red, 2);
//        raisedbevel = BorderFactory.createRaisedBevelBorder();
//        loweredbevel = BorderFactory.createLoweredBevelBorder();
//        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
//        compound = BorderFactory.createCompoundBorder(redLine, compound);
        
        statusbar = new StatusBar("Ready", SwingConstants.CENTER, raisedbevel);
        game = new Game();
        panel.add(game, BorderLayout.CENTER); 
        
        panel1.add(panel2, BorderLayout.CENTER);
        panel1.add(panel, BorderLayout.CENTER);        
        panel1.add(statusbar, BorderLayout.SOUTH);
            
        frame.setContentPane(panel1);
        frame.setIconImage(icon);
        frame.pack();

        frame.setVisible(true);
        frame.setJMenuBar(new MainMenu(game));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.err.println("Exiting Game!");
                game.stop();
                System.exit(0);
            }
        });

        game.start();
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * setLAF()
    * 
    */
    public static void setLAF() {
        redLine = BorderFactory.createLineBorder(Color.red, 2);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
        compound = BorderFactory.createCompoundBorder(redLine, compound);
        
        //Set LaF
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
        
        UIManager.put("InternalFrame.titleFont", new Font("Digital-7", Font.PLAIN, 12));
        UIManager.put("InternalFrame.borderColor", Color.cyan);
        UIManager.put("InternalFrame.activeTitleBackground", new Color(0.0f, 0.0f, 0.0f, 0.96f));
        UIManager.put("InternalFrame.titleForeground", Color.cyan);
        
        
        UIManager.put("MenuBar.border", BorderFactory.createLineBorder(Color.cyan, 1));
        UIManager.put("MenuBar.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("MenuBar.foreground", Color.cyan);
        UIManager.put("MenuBar.font", new Font("Digital-7", Font.PLAIN, 14));
        
        UIManager.put("Menu.border", BorderFactory.createRaisedBevelBorder());
        UIManager.put("Menu.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("Menu.foreground", Color.cyan);
        UIManager.put("Menu.selectionBackground", Color.cyan);
        UIManager.put("Menu.selectionForeground", new Color(0.0f, 0.0f, 0.0f, 0.96f));
        UIManager.put("Menu.font", new Font("Digital-7", Font.PLAIN, 14));
        
        UIManager.put("Button.border", BorderFactory.createRaisedBevelBorder());
        UIManager.put("Button.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("Button.foreground", Color.cyan);
        UIManager.put("Button.focus", Color.cyan);
        UIManager.put("Button.margin", new Insets(5, 2, 5, 2));
        UIManager.put("Button.font", new Font("Digital-7", Font.PLAIN, 12));
        
        UIManager.put("MenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("MenuItem.foreground", Color.cyan);
        UIManager.put("MenuItem.selectionBackground", Color.cyan);
        UIManager.put("MenuItem.selectionForeground", Color.black);
        UIManager.put("MenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
        
        UIManager.put("CheckBoxMenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("CheckBoxMenuItem.foreground", Color.cyan);
        UIManager.put("CheckBoxMenuItem.selectionBackground", Color.cyan);
        UIManager.put("CheckBoxMenuItem.selectionForeground", Color.black);
        UIManager.put("CheckBoxMenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
        
        UIManager.put("RadioButtonMenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("RadioButtonMenuItem.foreground", Color.cyan);
        UIManager.put("RadioButtonMenuItem.selectionBackground", Color.cyan);
        UIManager.put("RadioButtonMenuItem.selectionForeground", Color.black);
        UIManager.put("RadioButtonMenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
        
        
        UIManager.put("ProgressBar.border", BorderFactory.createLineBorder(Color.red, 1));
        UIManager.put("ProgressBar.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("ProgressBar.foreground", Color.orange);
        UIManager.put("ProgressBar.selectionForeground", new Color(0.15f, 0.15f, 0.15f, 0.96f));
        UIManager.put("ProgressBar.selectionBackground", Color.orange);
        UIManager.put("ProgressBar.font", new Font("Digital-7", Font.PLAIN, 14));
        
        
    }
    
    
    /**
    * setIcon()
    * 
    */
    private void setIcon() {
        //Set Frame Icon Image
        icon = new Texture("/fruit-machine-sprite-Logo").getImage();
    }
    
    
    private static String memoryToMB(long mem){
        DecimalFormat dec = new DecimalFormat("#0.00");
        double result = (double) mem / (double) (1024 * 1024);
        return dec.format(result);
    }
    
    
    /**
     * main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("Starting " + Game.TITLE + " . . . Started by " + Util.getUserNAME());
        System.out.println("Running on OS:     " + Util.getOSName() + " " 
                + Util.getOSARC() + " Processor Cores: " +Runtime.getRuntime().availableProcessors());
        System.out.println("Working Directory: " + Util.getDIR());
        System.out.println("Home Directory:    " + Util.getHomeDIR());
        System.out.println("Memory: Max Memory: " + memoryToMB(Runtime.getRuntime().maxMemory()) + " MB");
        System.out.println("Memory: Total Memory: " + memoryToMB(Runtime.getRuntime().totalMemory()) + " MB");
        System.out.println("Memory: Free Memory: " + memoryToMB(Runtime.getRuntime().freeMemory()) + " MB");
        System.out.println("Memory: Used Memory: " + memoryToMB(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " MB");
        System.out.println("");
        
//        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
//        }
//        
//        UIManager.put("InternalFrame.titleFont", new Font("Digital-7", Font.PLAIN, 12));
//        UIManager.put("InternalFrame.borderColor", Color.cyan);
//        UIManager.put("InternalFrame.activeTitleBackground", new Color(0.0f, 0.0f, 0.0f, 0.96f));
//        UIManager.put("InternalFrame.titleForeground", Color.cyan);
//        
//        
//        UIManager.put("MenuBar.border", BorderFactory.createLineBorder(Color.cyan, 1));
//        UIManager.put("MenuBar.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("MenuBar.foreground", Color.cyan);
//        UIManager.put("MenuBar.font", new Font("Digital-7", Font.PLAIN, 14));
//        
//        UIManager.put("Menu.border", BorderFactory.createRaisedBevelBorder());
//        UIManager.put("Menu.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("Menu.foreground", Color.cyan);
//        UIManager.put("Menu.selectionBackground", Color.cyan);
//        UIManager.put("Menu.selectionForeground", new Color(0.0f, 0.0f, 0.0f, 0.96f));
//        UIManager.put("Menu.font", new Font("Digital-7", Font.PLAIN, 14));
//        
//        UIManager.put("Button.border", BorderFactory.createRaisedBevelBorder());
//        UIManager.put("Button.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("Button.foreground", Color.cyan);
//        UIManager.put("Button.focus", Color.cyan);
//        UIManager.put("Button.margin", new Insets(5, 2, 5, 2));
//        UIManager.put("Button.font", new Font("Digital-7", Font.PLAIN, 12));
//        
//        UIManager.put("MenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("MenuItem.foreground", Color.cyan);
//        UIManager.put("MenuItem.selectionBackground", Color.cyan);
//        UIManager.put("MenuItem.selectionForeground", Color.black);
//        UIManager.put("MenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
//        
//        UIManager.put("CheckBoxMenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("CheckBoxMenuItem.foreground", Color.cyan);
//        UIManager.put("CheckBoxMenuItem.selectionBackground", Color.cyan);
//        UIManager.put("CheckBoxMenuItem.selectionForeground", Color.black);
//        UIManager.put("CheckBoxMenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
//        
//        UIManager.put("RadioButtonMenuItem.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("RadioButtonMenuItem.foreground", Color.cyan);
//        UIManager.put("RadioButtonMenuItem.selectionBackground", Color.cyan);
//        UIManager.put("RadioButtonMenuItem.selectionForeground", Color.black);
//        UIManager.put("RadioButtonMenuItem.font", new Font("Digital-7", Font.PLAIN, 14));
//        
//        
//        UIManager.put("ProgressBar.border", BorderFactory.createLineBorder(Color.red, 1));
//        UIManager.put("ProgressBar.background", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("ProgressBar.foreground", Color.orange);
//        UIManager.put("ProgressBar.selectionForeground", new Color(0.15f, 0.15f, 0.15f, 0.96f));
//        UIManager.put("ProgressBar.selectionBackground", Color.orange);
//        UIManager.put("ProgressBar.font", new Font("Digital-7", Font.PLAIN, 14));
        

        //Set Look and Feel
        setLAF();

        new SplashScreenDriver();
        Display display = new Display();
        
        
        SwingUtilities.updateComponentTreeUI(frame);
    }
    
    
    public static void revalidate(){
        // NOTE: Here we need a workaround for the HW/LW Mixing feature to work
        // correctly due to yet unfixed bug 6852592.
        // The JTextField is a validate root, so the revalidate() method called
        // during the setText() operation does not validate the parent of the
        // component. Therefore, we need to force validating its parent here.
        Container parent = menubar.getParent();
        if (parent instanceof JComponent) {
            ((JComponent)parent).revalidate();
        }
    }
    
    
    public static void addOptions() {
//        optionsWindow.setVisible(true);
        optionsWindow1.setVisible(true);
    }
    
    
    public static void removeOptions() {
//        optionsWindow.setVisible(false);
        optionsWindow1.setVisible(false);
//        optionsWindow.removeAll();
        optionsWindow1.removeAll();
    }
    
    public static void addAbout() {
        aboutWindow.setVisible(true);
    }
    
    
    public static void removeAbout() {
        aboutWindow.setVisible(false);
        aboutWindow.removeAll();
    }
    
    public static void addInstructions() {
        instructionsWindow.setVisible(true);
    }
    
    public static void removeInstructions() {
        instructionsWindow.setVisible(false);
        instructionsWindow.removeAll();
    }
    
    public static void setStatusBar(String msg) {
        statusbar.setText(msg);
    }
    
}
