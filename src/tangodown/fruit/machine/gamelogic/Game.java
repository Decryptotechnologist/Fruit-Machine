/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic;

import tangodown.fruit.machine.state.*;
import tangodown.fruit.machine.input.*;
import tangodown.fruit.machine.menu.AboutMenu;
import tangodown.fruit.machine.menu.InstructionsMenu;
import tangodown.fruit.machine.menu.OptionsMenu;
import tangodown.fruit.machine.menu.Menu;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.graphics.Display;
import tangodown.fruit.machine.menu.CreditsMenu;

/**
 *
 * @author Ghomez
 */
public class Game extends Canvas implements Runnable {

    
    /**Attributes*/
    
    /**TITLE variable of Game object*/
    public static final String TITLE = "T@ngoD0wn - Fruit Machine v0.3.5 - Advanced Developer Edition";
    
    /**version variable of Game object*/
    public static String version = "Advanced Developer Edition v0.3.5";
    
    /**Width variable of Game object*/    
    private static int mainWIDTH;// = getGameWidth();// = 600;//Default
    
    /**Height variable of Game object*/
    private static int mainHEIGHT;// = getGameHeight();// = 800;//Default
    
    /**mainSndOn boolean of Game object*/
    public static boolean mainSndOn = true;
    
    private static Game aGame;
    
    /**theWidth variable of Game object*/
    public int theWidth;
    
    /**theHeight variable of Game object*/
    public int theHeight;
    
    /**size variable of Game object*/
    private static Dimension size;
    
    /**thread Thread of Game object*/
    public Thread thread;
    
    /**running boolean of Game object*/
    public static boolean running;
    
    /**gameTime variable of Game object*/
    public int gameTime;
    
    /**panel JLayeredPane of Game object*/
    public static JLayeredPane panel;
    
    /**showFPS boolean of Game object*/
    public static boolean showFPS;
    
    /**showUPS boolean of Game object*/
    public static boolean showUPS;
    
    /**fps variable of Game object*/
    private int fps;
    
    /**ups variable of Game object*/
    private int ups;
    
    /**thefps variable of Game object*/
    public static String thefps;
    
    /**theUps variable of Game object*/
    public static String theUps;
    
    
    
    /**Links*/
    
    /**machine Machine of Game object*/
    public Machine machine;
    
    /**aMachine Machine of Game object*/
    public static Machine aMachine;
    
    /**testBox TestBox of Game object*/
    //public static TestBox testBox;
    
    /**testBox StateManager of Game object*/
    public static StateManager stateManager;
    
    /**ki Input of Game object*/
    public static Input ki;
    
    /**mi MouseInput of Game object*/
    public static MouseInput mi;
    
    public static boolean mainMusicOn;
    
    private final boolean gameSndOn;
    
    private final boolean Paused;
    
    /**menu Menu of Game object*/
    public Menu menu;
    
    private int frames;

    private BufferStrategy bs;
    
    /**instructionsMenu InstructionsMenu of Game object*/
    public InstructionsMenu instructionsMenu;
    
    /**aboutMenu AboutMenu of Game object*/
    public AboutMenu aboutMenu;
    
    /**optionsMenu OptionsMenu of Game object*/
    public OptionsMenu optionsMenu;

    
    
    /**Constructor*/
    
    
    /**
    * Game()
    * 
    * Creates a new Game object
    */ 
    public Game(){
        System.out.println("Game: New Game Created");
        
        //Set Game Width
        theWidth = Game.getGameWidth();
        
        //Set Game Height
        theHeight = Game.getGameHeight();
        
        //Set Game Size
	size = new Dimension(theWidth, theHeight);
	setSize(size);
	setPreferredSize(size);
	setMinimumSize(size);
	setMaximumSize(size);        
        
        //Create Keys and Mouse Input
        ki = new Input();
        mi = new MouseInput();

        //Set Keys and Mouse
        addKeyListener(ki);
        addMouseListener(mi);
        addMouseMotionListener(mi);
              
        //Create Menus
//        instructionsMenu = new InstructionsMenu(this);
//        aboutMenu = new AboutMenu(this);
//        optionsMenu = new OptionsMenu(this);
        
        //Set Game Sound
        this.gameSndOn = Game.getSnd();
        Paused = false;
        
        aGame = this;
        
        init();
    }
    
    
    /**Public Protocol*/
    
    /**
    * init()
    * 
    * Initialises a new Game object
    */ 
    public void init(){
        System.out.println("Game: Initiating Game. . .");
        
        stateManager = new StateManager();
        stateManager.addState(new MenuState());
        stateManager.addState(new GameMenuState());
        
        GameState gs = new GameState();
        
        machine = Machine.newMachine(ki, gs, Display.game);
        //machine = Machine.newMachine(ki, gs, Display.game);
        aMachine = machine;
        
        stateManager.addState(gs);
        stateManager.setState("menu");
    }
    
    
    public void start() {
        if (running) return;
        
            thread = new Thread(this, "Main");
            running = true;
            try{
                thread.start();
            }catch (NullPointerException e){
            }
    }
    
    
    public void stop() {
        if (!running) return;
            running = false;
	    //gameTime = 0;
            System.exit(0);
	try {
            thread.join();
	} catch (InterruptedException e) {
	}
        
    }
    
    
    @Override
    public void run() {
        
        long previousTime = System.nanoTime();
	double ns = 1000000000.0 / 60.0;
	double delta = 0;
	frames = 0;
	int updates = 0;
	long timer = System.currentTimeMillis();

        while (running) {
            long currentTime = System.nanoTime();
            delta += (currentTime - previousTime) / ns;
            previousTime = currentTime;	
            
            if (delta >= 1) {
		tick();
                ki.tick();
                mi.tick();
		updates++;
		delta--;				
            }

            
            while(System.currentTimeMillis() - timer > 1000){
		timer += 1000;

                fps = frames;
		ups = updates;
                thefps = "FPS:"+fps;
                theUps = "UPS:"+ups;
        
                frames = 0;
		updates = 0;
                
            }
            render();
            frames++;
            
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
    }
    
    
    /**
    * getGameWidth()
    * 
    * @return WIDTH - returns Game Width (820)
    */
    public static int getGameWidth(){	
        if(mainWIDTH == 0){
            mainWIDTH = 820;
        }
	return mainWIDTH;
    }

    
    /**
    * getGameHeight()
    * 
    * @return HEIGHT - returns Game Height (740)
    */
    public static int getGameHeight(){
        if(mainHEIGHT == 0){
            mainHEIGHT = 740;
        }
	return mainHEIGHT;
    }

    
    /**
    * getMachine()
    * 
    * @return aMachine - returns a static Machine
    */
    public static Machine getMachine(){       
        return aMachine;
    }
    
    
    /**
     * getSound()
     * 
     * @return mainSndOn - returns Main Sound On Boolean
     */
    public static boolean getSnd(){       
        return mainSndOn;
    }

    
    /**
    * setGameSound(boolean sndOn)
    * 
    * @param sndOn
    */
    public static void setGameSound(boolean sndOn) {
        mainSndOn = sndOn;
    }
    
    /**
     * getSound()
     * 
     * @return mainSndOn - returns Main Sound On Boolean
     */
    public static boolean getMusic(){       
        return mainMusicOn;
    }
    
    
    /**
    * setGameMusic(boolean musicOn)
    * 
    * @param musicOn
    */
    public void setGameMusic(boolean musicOn) {
        mainMusicOn = musicOn;
    }
    
    
    

    
    /**
     * Render
     */
    private void render() {
        bs = getBufferStrategy();
	if (bs == null) {
            try{
                createBufferStrategy(3);
                return;
            } catch(Exception e){
                return;
            }
	}
        Graphics g = bs.getDrawGraphics();
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ///////////////////////////////////////////
        
        
        if(this.menu == null){
            stateManager.render(g2d);
        } else {
            menu.render(g2d);
        }
        
        //////////////////////////////////////////
        //////////////////////////////////////////////
        g2d.dispose();
        bs.show();
        
    }

    /**
     * tick()
     * 
     */
    private void tick() {
       stateManager.tick();
    }    
    
    
    /**
    * getGame()
    * 
    * @return aGame
    */
    public static Game getGame() {
        return aGame;
    }

    
    /**
    * setAbout()
    * 
    */
    public void setAbout() {
        stateManager.setState("GameMenu");
        setMenu(new AboutMenu(this));
        System.out.println("Game: About Menu Set");
    }
    
    
    /**
    * setInstructions()
    * 
    */
    public void setInstructions() {
        stateManager.setState("GameMenu");
        setMenu(new InstructionsMenu(this));
        System.out.println("Game: Help Menu Set");
    }
    
    
    /**
    * setCredits()
    * 
    */
    public void setCredits() {
        //stateManager.setState("GameMenu");
        stateManager.setState("Credits");
        setMenu(new CreditsMenu(this));
        System.out.println("Game: Credits Menu Set");
    }
    
    
    /**
    * setOptions()
    * 
    */
    public void setOptions() {
        stateManager.setState("GameMenu");
        setMenu(new OptionsMenu(this));
        System.out.println("Game: Options Menu Set");
    }

    
    /**
    * setMenu(Menu menu)
    * 
    * Sets a Menu object to a Game object
    * 
    * @param menu
    */ 
    public void setMenu(Menu menu) {
	this.menu = menu;
    }
    
    
    /**
    * quitGame()
    * 
    */
    public static void quitGame() {
        Sound.quit.play();
        
        JOptionPane parent = new JOptionPane();
        int dialog = JOptionPane.showConfirmDialog(parent, "Are You Sure You Want To Quit?", "Quit To Desktop", JOptionPane.YES_NO_OPTION);
        
        parent.setUI(new com.sun.java.swing.plaf.windows.WindowsOptionPaneUI());
        
        if(dialog == 0){
            Sound.quit.stop();
            Sound.sound5.play();
            
            System.out.println("Game: Quit");
            Game.getGame().stop();
            System.exit(0);
        } 
        if(dialog == 1){
            Sound.quit.stop();
            Display.setStatusBar("Ready");
        }

        
    }
    
}
