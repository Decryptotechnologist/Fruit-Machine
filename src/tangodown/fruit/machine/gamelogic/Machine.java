/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic;

import tangodown.fruit.machine.state.GameState;
import tangodown.fruit.machine.input.Input;
import tangodown.fruit.machine.gamelogic.digits.*;
import tangodown.fruit.machine.gamelogic.lights.*;
import tangodown.fruit.machine.gamelogic.lights.Lights;
import tangodown.fruit.machine.gamelogic.reels.*;
import tangodown.fruit.machine.graphics.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLayeredPane;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.controls.ButtonControls;


/**
 *
 * @author Ghomez
 */
public class Machine implements CommandController {

    /**Attributes*/
    
    /**nudges variable of Machine object*/
    public static int nudges;//1-99
    
    /**balance variable of Machine object*/
    private static int balance;
    
    /**credit variable of Machine object*/
    private static int credit;
    
    /**crackpot variable of Machine object*/
    private static int crackpot;
    
    /**textCount variable of Machine object*/
    public static int textCount = 0;
    
    /**exchange4FeatOn variable of Machine object*/
    private static boolean exchange4FeatOn;
    
    /**gamble variable of Machine object*/
    public boolean gamble;//true/false
    
    /**holdOn variable of Machine object*/
    public boolean holdOn;//hold reels?
    
    /**hold1 variable of Machine object*/
    public boolean hold1;//hold/nudge reel1
    
    /**hold2 variable of Machine object*/
    public boolean hold2;//hold/nudge reel2
    
    /**hold3 variable of Machine object*/
    public boolean hold3;//hold/nudge reel3
    
    /**nudgeOn variable of Machine object*/
    private boolean nudgeOn;
    
    /**iconR1 String of Machine object*/
    private String iconR1;
    
    /**iconR2 String of Machine object*/
    private String iconR2;
    
    /**iconR3 String of Machine object*/
    private String iconR3;
    
    /**iconNudge String of Machine object*/
    private String iconNudge;
    
    /**iconRHL variable of Machine object*/
    private int iconRHL;
    
    /**currentCashWin variable of Machine object*/
    private int currentCashWin;
    
    /**currentNudgeWin variable of Machine object*/
    private int currentNudgeWin;
    
    /**gambleCashOn variable of Machine object*/
    public boolean gambleCashOn;
    
    /**gambleNudgeOn variable of Machine object*/
    public boolean gambleNudgeOn;
    
    /**letEmSpin variable of Machine object*/
    public boolean letEmSpin = false;
    
    /**letEmSpinIcon variable of Machine object*/
    public String letEmSpinIcon = "";
    
    /**spinAll boolean of Machine object*/
    private static boolean spinAll;
    
    /**holdNudge boolean of Machine object*/
    public static boolean holdNudge = false;
    
    /**startFeat boolean of Machine object*/
    private static boolean startFeat;
    
    /**spinAllCount variable of Machine object*/
    private int spinAllCount;
    
    /**spinHiLo boolean of Machine object*/
    private boolean spinHiLo;// = false;
    
    /**spinHILOCount variable of Machine object*/
    private int spinHILOCount = 0;
    
    /**stateName String of Machine object*/
    private final String stateName;
    
    /**machinePanel JLayeredPane of Machine object*/
    public static JLayeredPane machinePanel;
    
    /**currentRouletteWin variable of Machine object*/
    private int currentRouletteWin;
    
    /**gambleHiLoOn boolean of Machine object*/
    private boolean gambleHiLoOn;
    
    
    
    /**Links*/
    
    /**reels Reels of Machine object*/
    public Reels reels;
    
    
    /**feature Feature of Machine object*/
    public Feature feature;
    
    /**rng RNG of Machine object*/
    public static RNG rng;

    /**lighter lights of Machine object*/
    public Lights lighter;
    
    /**Linked Machine object recursive of Machine*/
    public static Machine machine;
    
    /**input Input of Machine object*/
    public Input input;
    
    /**bank Bank of Machine object*/
    public static Bank bank;
    
    /**digits Digits of Machine object*/
    public Digits digits;
    
    /**state GameState of Machine object*/
    private final GameState state;
    private boolean skillshotOn;
    private boolean skillStopHiLoOn;
    private boolean superHoldOn;
    //private final CommandController commCommand;
    private final Game game;
    
    public static List<CommandController> commControllers;
    private MachineState machineState;
    public static boolean winSpinOn;// = true;
    
    
    
    /**Constructor*/
    
    /**
     * Machine Constructor
     * 
     * @param stateName
     * @param state
     * @param game
     */
    public Machine(String stateName, GameState state, Game game){//, List<CommandController> commController) {
        this.state = state;
        this.stateName = stateName;
        this.game = game;
        spinAllCount = 0;
        String newMachC = "New Machine created at: ";
        System.out.println(newMachC);
        
        setMachineState(MachineState.INSERT_COIN);
    }
    
    /**
     * newMachine()
     * 
     * @param input
     * @param state
     * @param game
     * 
     * @return machine
     */
    public static Machine newMachine(Input input, GameState state, Game game){//, List<CommandController> commController) {
        
        String newMach = "New Machine called at: ";
        System.out.println(newMach);
        machine = new Machine(state.getName(), state, game);//, commController);
        
        machine.input = input;
        //machine.gameSndOn = Game.getSnd();
        
        balance = 0;
        credit = 0;
        crackpot = 0;
        
        String newBank = "New Bank called at: ";
        System.out.println(newBank);
        bank = new Bank(balance, credit, crackpot);
        
        String newRNG = "New RNG called at: ";
        System.out.println(newRNG);
        rng = new RNG(machine);
        
        String newDig = "New Digits called at: ";
        System.out.println(newDig);
        machine.digits = new Digits();//machine, bank.getBank(), bank.getCredits(), bank.getCrackpot());
        
        String newLights = "New lights called at: ";
        System.out.println(newLights);
        machine.lighter = new Lights();

        String newReels = "New Reels called at: ";
        System.out.println(newReels);
        //New ThreadPool as arg??
        machine.reels = new Reels();
        
        machinePanel = new JLayeredPane();        
        
        machinePanel.setSize(1280, 720);

        machinePanel.add(machine.lighter.lightsPanel, 0, 0);
        machinePanel.add(machine.digits.digitsPanel, 0, 0);
        machinePanel.add(machine.reels.reelsPanel, 0, 0);
        
        //LightControls lightControls = new LightControls();
        CashLightControls cashLightControls = new CashLightControls(machine.lighter.theCash);
        NudgeLightControls nudgeLightControls = new NudgeLightControls(machine.lighter.theNudges);
        CrackpotLightControls crackpotLightControls = new CrackpotLightControls(machine.lighter.theCrackpot);
        FeaturesLightControls featuresLightControls = new FeaturesLightControls(machine.lighter.theFeatures);
        HiLoLightControls hiloLightControls = new HiLoLightControls(machine.lighter.thehilo);
        RouletteLightControls rouletteLightControls = new RouletteLightControls(machine.lighter.getRoulette());
        SkillshotLightControls skillshotLightControls = new SkillshotLightControls(machine.lighter.theSkillshot);
        //StaticLightControls staticLightControls = new StaticLightControls(machine.lighter.theStatic);
        TangoDownLightControls tangodownLightControls = new TangoDownLightControls(machine.lighter.theTangoDown);
        WinSpinLightControls winspinLightControls = new WinSpinLightControls(machine.lighter.theWinSpins);
        ButtonControls buttonsControls = new ButtonControls(machine.lighter.theButtonz);
        ReelsControls reelsControls = new ReelsControls(machine.reels);
        
        //DigitControls digitControls = new DigitControls();
        BankTextDigitControls banktextDigitControls = new BankTextDigitControls(machine.digits.theBankText);
        BankDigitControls bankDigitControls = new BankDigitControls(machine.digits.theBank);
        CrackpotDigitControls crackpotDigitControls = new CrackpotDigitControls(machine.digits.theCrackpot);
        CreditDigitControls creditDigitControls = new CreditDigitControls(machine.digits.theCredit);
        
        
        List<CommandController> commandControllers = new ArrayList<>();
        //commandControllers.add(lightControls);
        commandControllers.add(cashLightControls);
        commandControllers.add(nudgeLightControls);
        commandControllers.add(crackpotLightControls);
        commandControllers.add(featuresLightControls);
        commandControllers.add(hiloLightControls);
        commandControllers.add(rouletteLightControls);
        commandControllers.add(skillshotLightControls);
        //commandControllers.add(staticLightControls);
        commandControllers.add(tangodownLightControls);
        commandControllers.add(winspinLightControls);
        commandControllers.add(buttonsControls);
        commandControllers.add(reelsControls);
        
        
        //commandControllers.add(digitControls);
        commandControllers.add(banktextDigitControls);
        commandControllers.add(bankDigitControls);
        commandControllers.add(crackpotDigitControls);
        commandControllers.add(creditDigitControls);
        
        
        commandControllers.add(machine);
        Machine.commControllers = commandControllers;
        
        setCredits(credit);
        
        return machine;
    }
    
    
    /**Public Protocol*/

    
    public void init() {
        String machInit = "Initiating Machine. . .";
        System.out.println(machInit);
    }
    
    
    /**
     * setBG(int i)
     * 
     * @param i
     */
    public static void setBG(int i) {
        machine.lighter.bgReferenceA = getBG(i);
    }
	
    
    /**
     * getBG(int i)
     * 
     * @param i
     * @return imgBG
     */
    public static BufferedImage getBG(int i) {
        
        BufferedImage imgBG = null;
        
        if(i == 0){
            //Dark Pea Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11F").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 1){
            //Orange w white bg
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11E").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 2){
            //Dark Orange
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11D").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 3){
            //Lime Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11B").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 4){
            //Pink
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11C").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 5){
            //Blue
            imgBG = new Texture("/Background/Fruit-Machine-MaxB11A").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 6){
            //Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxA11G").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 7){
            //Dark Lime Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxA11H").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 8){
            //Light Mint Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxA11J").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 9){
            //Light Pea Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxA11K").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        if(i == 10){
            //bright Pea Green
            imgBG = new Texture("/Background/Fruit-Machine-MaxA11L").getImage();//ImageIO.read(Machine.class.getResource("/Background/Fruit-Machine-MaxA11I.png"));
        }
        
        
        return imgBG;
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
    }
    
    
    /**
    * setMenu()
    * 
    * Sets a Menu object to a new Machine object
    */ 
    public static void setMenu(){
    }
    
    /**
    * tick()
    * 
    * Tick and Timer for a new Machine object
    */ 
    public void tick() {
        rng.rollEm();
        if(RNG.start){
            machine.setHolds();
        }
        if(machine.getGambleCashOn() && machine.getGambleNudgeOn()){
            machine.digits.clearBankText();
            
            machine.lighter.gambleCashNudgeLightsAB(getCurrentCashWin(), getCurrentNudgeWin());
            machine.digits.gambleBankTextDigitsAB("Cash", "Nudges");
            
        } else if(machine.getGambleCashOn() || machine.getGambleNudgeOn()){
            machine.digits.clearBankText();
            
            if(machine.getGambleCashOn()){
                machine.lighter.gambleCashLightsAB(getCurrentCashWin());
                machine.digits.gambleBankTextDigitsAB("Cash");
            }

            if(machine.getGambleNudgeOn()){
                machine.lighter.gambleNudgeLightsAB(getCurrentNudgeWin());
                machine.digits.gambleBankTextDigitsAB("Nudges");
            }
        }
        
        //If credits equal 0, and gamble nudges or cash is not active show InsertCoin BankText
        if(machine.bank.getCredits() == 0 && !machine.getGambleNudgeOn() && !machine.getGambleCashOn()){
            machine.digits.clearBankText();
            machine.digits.theBankText.setOn(machine.digits.theBankText.getAllBankText().get(7).getText(), true);
        }
        
        //3Reels
        if(spinAll){
            machine.lighter.theButtonz.setFlashing("Start!", false);
            machine.setNudges(0);
            machine.setNudgeOn(false);
            clearWinSpins();
            machine.digits.clearBankText();
            
            if(machine.getWinSpinOn()){
                machine.reels.spinAllReels(machine.reels.getReel1WinSpin(), machine.reels.getReel2WinSpin(), machine.reels.getReel3WinSpin(), Machine.rng.getReelhiloresult(), Machine.rng.getRouletteresult());
            } else {
                if(machine.getLetEmSpinOn()){
                    machine.reels.spinAllReels(machine.getLetEmSpinIcon(), machine.getLetEmSpinIcon(), machine.getLetEmSpinIcon(), Machine.rng.getReelhiloresult(), Machine.rng.getRouletteresult());
                } else {
                    machine.reels.spinAllReels(Machine.rng.getReel1result(), Machine.rng.getReel2result(), Machine.rng.getReel3result(), Machine.rng.getReelhiloresult(), Machine.rng.getRouletteresult());
                    //machine.reels.spinAllReelsReverse(Machine.rng.getReel1result(), Machine.rng.getReel2result(), Machine.rng.getReel3result(), Machine.rng.getReelhiloresult(), Machine.rng.getRouletteresult());
                }
            }
            
            spinAllCount += 1;   
            
            if(spinAllCount == 1){
                Sound.reelSpin.loop();
            }
        }
        
        if(spinAllCount == 120){
            if(machine.getWinSpinOn()){
                machine.reels.spinReel1(machine.reels.getReel1WinSpin());
                machine.reels.spinReel2(machine.reels.getReel2WinSpin());
                machine.reels.spinReel3(machine.reels.getReel3WinSpin());
                machine.reels.spinReelHiLo(0);
                machine.reels.spinRoulette(17);
            } else if(machine.getLetEmSpinOn()){
                machine.reels.spinReel1(machine.reels.the1stReel.getIndex(machine.getLetEmSpinIcon()));
                machine.reels.spinReel2(machine.reels.the2ndReel.getIndex(machine.getLetEmSpinIcon()));
                machine.reels.spinReel3(machine.reels.the3rdReel.getIndex(machine.getLetEmSpinIcon()));
                machine.reels.spinReelHiLo(0);
                machine.reels.spinRoulette(17);
            } else {
                machine.reels.spinReel1(Machine.rng.getReel1result());
                machine.reels.spinReel2(Machine.rng.getReel2result());
                machine.reels.spinReel3(Machine.rng.getReel3result());
                machine.reels.spinReelHiLo(Machine.rng.getReelhiloresult());
                machine.reels.spinRoulette(Machine.rng.getRouletteresult());
            }
            
            Sound.reelSpin.stop();
            Sound.reelStop.play();
            
            spinAll = false;
            machine.setWinSpinOn(false);
            machine.setLetEmSpinOn(false);
            spinAllCount = 0;
            
            calculateWinSpins();

            if(!startFeat && !machine.spinHiLo){
                calculateCashWin();
                calculateNudgeWin();
            }

            //machine.CancelHolds();
            machine.execute("CANCEL_HOLDS");

            if(startFeat){
                machine.lighter.theNudges.setNudges(0);
                machine.setNudgeOn(false);
                //machine.lighter.theButtonz.setFlashing("Start!", false);
            } else {
                if(machine.getCredits() >= 1){
                    selectHoldNudge();
                }
            }
            
//            if(machine.getCredits() >= 1 && machine.spinHiLo == false){
//                machine.lighter.theButtonz.setFlashing("Start!", true);
//            } else {
//                machine.setHoldOn(false);
//            }
            
            //HiLo Game
            if(!spinAll && !RNG.start && machine.getCredits() >= 1 && holdNudge){

                if(Machine.rng.getHoldOn()){
                    machine.setHoldOn(true);
                } else if(Machine.rng.getNudgeOn()){
                    machine.setHoldOn(false);

                    machine.lighter.theNudges.setNudges(Machine.rng.getNudgeresult());
                    machine.setNudgeOn(true);
                    Sound.nudgeNow.play();
                } 

                if(Machine.rng.getGambleNudgeOn()){
                    machine.setHoldOn(false);
                    machine.setNudgeOn(false);

                    machine.lighter.theNudges.setNudges(Machine.rng.getNudgeresult());
                    machine.setGambleNudgeOn(true);

                }

            holdNudge = false;
            
            machine.feature.setHiloNumber(Machine.rng.getReelhiloresult());
        }
            machine.machineStateChanged();
        }
        
        if(machine.spinHiLo){
            Sound.rollHILO.play();
            machine.lighter.thehiloReel.spinReelHilo(Machine.rng.getReelhiloresult());
            
            machine.lighter.theButtonz.setFlashing("HoldReel1", false);
            machine.lighter.theButtonz.setFlashing("HoldReel2", false);
            
            spinHILOCount += 1;    
        }
        
        if(spinHILOCount == 120){
            Sound.rollHILO.stop();
            
            spinHILOCount = 0;
            
            //turn on flash 2hold/Hi 3hold/Lo buttons
            machine.lighter.theButtonz.setFlashing("HoldReel1", true);
            machine.lighter.theButtonz.setFlashing("HoldReel2", true);
                
            if((System.currentTimeMillis() / 450) % 2 == 0){    
                machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(0).getText(), false);
                machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(1).getText(), true);
                
//                machine.lighter.theButtonz.setStatic("HoldReel1", false);
//                machine.lighter.theButtonz.setStatic("HoldReel2", true);
            } else {
                machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(0).getText(), true);
                machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(1).getText(), false);
                
//                machine.lighter.theButtonz.setStatic("HoldReel1", true);
//                machine.lighter.theButtonz.setStatic("HoldReel2", false);
            }
            
            machine.setPlayHiLoOn(false);
            machine.setGambleHiLoOn(true);
        }
        
        //machine.machineStateChanged();
    }    
    
    /**
     * Select Hold/Nudge
     */
    public static void selectHoldNudge(){
        if(machine.getCredits() >= 1){
            holdNudge = true;
        } 
    }
    
    
    /**
     * spinAllReels()
     * 
     * spins all reels / play 3 reels
     */
    public static void spinAllReels(){
        machine.lighter.theButtonz.setFlashing("Start!", false);
        machine.lighter.theButtonz.setStatic("Start!", false);
        machine.lighter.theButtonz.setSelected("Start!", false);
        
        spinAll = true;
        machine.setHolds();
        machine.clearWinSpins();
        machine.lighter.clearCash();
    }
    
    
    public static void spinHiLoReel(){
        machine.lighter.theButtonz.setFlashing("Start!", false);
        machine.lighter.theButtonz.setStatic("Start!", false);
        machine.lighter.theButtonz.setSelected("Start!", false);
                    
        machine.lighter.theButtonz.setFlashing("HoldReel1", false);
        machine.lighter.theButtonz.setFlashing("HoldReel2", false);
        
        machine.spinHiLo = true;
    }
    
    //Cash Functions ***********************************
    
    
    //Gamble Cash Functions
    /**
     * getGambleCashOn()
     * 
     * @return gambleCashOn
     */
    public boolean getGambleCashOn() {
        return machine.gambleCashOn;
    }
    
    
    /**
     * setGambleCashOn(boolean gambleOn)
     * 
     * @param gambleOn
     */
    public void setGambleCashOn(boolean gambleOn) {
        machine.gambleCashOn = gambleOn;
    }
    
    /**
     * getGambleCashOn()
     * 
     * @return gambleCashOn
     */
    public boolean getLetEmSpinOn() {
        return machine.letEmSpin;
    }
    
    
    /**
     * setGambleCashOn(boolean gambleOn)
     * 
     * @param LetEmSpinOn
     */
    public void setLetEmSpinOn(boolean LetEmSpinOn) {
        machine.letEmSpin = LetEmSpinOn;
    }
    
    
    /**
     * gambleCashClicked()
     * 
     */
    public void gambleCashClicked() {
        int current = machine.getCurrentCashWin();
        for(int i = 0; i < 14; i++){
            //Spin HiLo
            machine.lighter.thehiloReel.spinReelHilo(machine.rng.reelhiloresult);
        }
        machine.lighter.clearCash();
        machine.setCurrentCashWin(machine.lighter.newCashWin);
        
        if(current == 0){
            machine.lose();
        }
        if(current > machine.getCurrentCashWin()){
            machine.loseGambleCash();
        }
        machine.digits.clearBankText();
    }


    /**
     * enableExchange()
     * 
     */
    public static void enableExchange(){
        System.out.println("Machine: Exchange For Feature Enabled");
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(6).getText(), true);
    }
    
    /**
     * enableCollectCash()
     * 
     */
    public static void enableCollectCash(){
        System.out.println("Machine: Collect Cash Enabled");
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(1).getText(), true);
        
        machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(1).getText());
        machine.setGambleCashOn(true);
        machine.setNudgeOn(false);
        machine.setGambleNudgeOn(false);
    }
    
    
    /**
     * getCurrentCashWin()
     * 
     * @return currentCashWin
     */
    public int getCurrentCashWin(){
        return machine.currentCashWin;
    }
    
    
    /**
     * increaseCurrentCashWin(int i)
     * 
     */
    public void increaseCurrentCashWin(int i){
        machine.currentCashWin += i;
    }
    
    
    /**
     * decreaseCurrentCashWin(int i)
     * 
     * @param i
     */
    public void decreaseCurrentCashWin(int i){
        machine.currentCashWin -= i;
    }
    
    
    /**
     * setCurrentCashWin(int newBalance)
     * 
     * @param newBalance
     */
    public void setCurrentCashWin(int newBalance) {        
        
        machine.currentCashWin = newBalance;
        
        if(machine.currentCashWin == 0){
            Sound.lose1.play();
        }
        if(machine.currentCashWin == 1){
            calculateCash("Cherry");
            machine.reels.spinAllReels("Cherry", "Cherry", "Cherry", 12, 1);
        }
        if(machine.currentCashWin == 2){
            calculateCash("Mixed7");
            machine.reels.spinAllReels("Gold7", "Blue7", "Red7", 12, 1);
        }
        if(machine.currentCashWin == 3){
            calculateCash("GreenBAR");
            machine.reels.spinAllReels("GreenBAR", "GreenBAR", "GreenBAR", 12, 1);
        }
        if(machine.currentCashWin == 4){
            calculateCash("RedBAR");
            machine.reels.spinAllReels("RedBAR", "RedBAR", "RedBAR", 12, 1);
        }
        if(machine.currentCashWin == 5){
            calculateCash("GoldBAR");
            machine.reels.spinAllReels("GoldBAR", "GoldBAR", "GoldBAR", 12, 1);
        }
        if(machine.currentCashWin == 6){
            calculateCash("SIX");
        }
        if(machine.currentCashWin == 7){
            calculateCash("Blue7");
            machine.reels.spinAllReels("Blue7", "Blue7", "Blue7", 12, 1);
        }
        if(machine.currentCashWin == 8){
            calculateCash("EIGHT");
        }
        if(machine.currentCashWin == 9){
            calculateCash("NINE");
        }
        if(machine.currentCashWin == 10){
            calculateCash("Red7");
            machine.reels.spinAllReels("Red7", "Red7", "Red7", 12, 1);
        }
        if(machine.currentCashWin == 12){
            calculateCash("Gold7");
            machine.reels.spinAllReels("Gold7", "Gold7", "Gold7", 12, 1);
        }
        if(machine.currentCashWin == 15){
            calculateCash("GoldBell");
            machine.reels.spinAllReels("GoldBell", "GoldBell", "GoldBell", 12, 1);
            System.out.println("Machine: JACKPOT!!");
            machine.digits.theBankText.setText(3);
            machine.setGambleCashOn(false);
        }
    }
    
    
    /**
     * calculateCash(String winner)
     * 
     * @param winner
     */
    public void calculateHiLo(String winner){
        
        int oldRouletteWin = currentRouletteWin;
        //Win type
        if(winner.equals("+2 Features")){
            //increase features by 2
            machine.increaseFeatures(2);
            
            currentCashWin = 1;
        }
        if(winner.equals("+1 Features")){
            //increase features by 1
            machine.increaseFeatures(1);
            
            currentCashWin = 2;
        }
        if(winner.equals("+2 Nudges")){
            //increase Nudges by 2
            machine.increaseNudges(2);
            
            currentCashWin = 3;
        }
        if(winner.equals("+1 Nudges")){
            //increase Nudges by 1
            machine.increaseNudges(1);
            
            currentCashWin = 4;
        }
        if(winner.equals("+3 Cash")){
            //increase Cash by 3
            machine.increaseCash(3);
            
            currentCashWin = 5;
        }
        if(winner.equals("+2 Cash")){
            //increase Cash by 2
            machine.increaseCash(2);
            
            currentCashWin = 6;
        }
        if(winner.equals("+1 Cash")){
            //increase Cash by 1
            machine.increaseCash(1);
            
            currentCashWin = 7;
        }
        if(winner.equals("+1 WinSpin")){
            //increase WinSpins by 1
            machine.increaseWinSpins(1);
            
            currentCashWin = 8;
        }
        if(winner.equals("Game Over")){
            //Game Over
            machine.lose();
        }
        
        //enableCollectAll();
        machine.execute("ENABLE_COLLECT_ALL");

    }
    
    
    
    /**
     * calculateCash(String winner)
     * 
     * @param winner
     */
    public void calculateCash(String winner){
        
        int oldCashWin = currentCashWin;
        //Win type
        if(winner.equals("Cherry")){
            //set cash lights to £1
            machine.lighter.turnCashLightOn("cash1Pound");
            machine.lighter.turnCashLightOn("cash1LPound");
            currentCashWin = 1;
        }
        if(winner.equals("Mixed7")){
            //set cash lights to £2
            machine.lighter.turnCashLightOn("cash2Pound");
            machine.lighter.turnCashLightOn("cash2LPound");
            currentCashWin = 2;
            //Sound.win2.play();
        }
        if(winner.equals("GreenBAR")){
            //set cash lights to £3
            machine.lighter.turnCashLightOn("cash3Pound");
            machine.lighter.turnCashLightOn("cash3LPound");
            currentCashWin = 3;
            //Sound.win3.play();
        }
        if(winner.equals("RedBAR")){
            //set cash lights to £4
            machine.lighter.turnCashLightOn("cash4Pound");
            machine.lighter.turnCashLightOn("cash4LPound");
            currentCashWin = 4;
            //Sound.win4.play();
        }
        if(winner.equals("GoldBAR")){
            //set cash lights to £5
            machine.lighter.turnCashLightOn("cash5Pound");
            machine.lighter.turnCashLightOn("cash5LPound");
            currentCashWin = 5;
            //Sound.win1.play();
        }
        if(winner.equals("SIX")){
            //set cash lights to £5
            machine.lighter.turnCashLightOn("cash6Pound");
            //machine.lighter.turnCashLightOn("cash6LPound");
            currentCashWin = 6;
            //Sound.win2.play();
        }
        if(winner.equals("Blue7")){
            //set cash lights to £7
            machine.lighter.turnCashLightOn("cash7Pound");
            machine.lighter.turnCashLightOn("cash7LPound");
            currentCashWin = 7;
            //Sound.win3.play();
        }
        if(winner.equals("EIGHT")){
            //set cash lights to £7
            machine.lighter.turnCashLightOn("cash8Pound");
            //machine.lighter.turnCashLightOn("cash7LPound");
            currentCashWin = 8;
            //Sound.win4.play();
        }
        if(winner.equals("NINE")){
            //set cash lights to £7
            machine.lighter.turnCashLightOn("cash9Pound");
            //machine.lighter.turnCashLightOn("cash7LPound");
            currentCashWin = 9;
            //Sound.win1.play();
        }
        if(winner.equals("Red7")){
            //set cash lights to £10
            machine.lighter.turnCashLightOn("cash10Pound");
            machine.lighter.turnCashLightOn("cash10LPound");
            currentCashWin = 10;
            //Sound.win2.play();
        }
        if(winner.equals("Gold7")){
            //set cash lights to £12
            machine.lighter.turnCashLightOn("cash12Pound");
            machine.lighter.turnCashLightOn("cash12LPound");
            currentCashWin = 12;
            //Sound.win4.play();
        }
        if(winner.equals("GoldBell")){
            //set cash lights to £15
            machine.lighter.turnCashLightOn("cash15Pound");
            machine.lighter.turnCashLightOn("cash15LPound");
            currentCashWin = 15;
            
            jackpot();
        }

        if(machine.currentCashWin > 0 && machine.currentCashWin < 15){
            machine.digits.clearBankText();
            machine.setNudges(0);
            machine.setNudgeOn(false);
            machine.setGambleNudgeOn(false);
            int ran = machine.rng.random.nextInt(4);
            if(oldCashWin < currentCashWin){
                if(ran == 0){
                    Sound.win1.play();
                }
                if(ran == 1){
                    Sound.win2.play();
                }
                if(ran == 2){
                    Sound.win3.play();
                }
                if(ran == 3){
                    Sound.win4.play();
                }
                if(ran == 4){
                    Sound.win5.play();
                }
                
            } else {
                
                if(ran == 0){
                    Sound.lose1.play();
                }
                if(ran == 1){
                    Sound.lose2.play();
                }
                if(ran == 2){
                    Sound.lose3.play();
                }
                if(ran == 3){
                    Sound.lose4.play();
                }
                if(ran == 4){
                    Sound.lose5.play();
                }
            }
            
        }
        
        //enableCollectCash();
        machine.execute("ENABLE_COLLECT_CASH");
        if(machine.currentCashWin > 5){
            //enableExchange();
            machine.execute("ENABLE_EXCHANGE");
        }
    }
    
    
    /**
     * calculateCashWin()
     * 
     */
    public void calculateCashWin() {
        
        iconR1 = getR1().getSymbol(getR1().getCurrentPOS());
        
        iconR2 = getR2().getSymbol(getR2().getCurrentPOS());
        
        iconR3 = getR3().getSymbol(getR3().getCurrentPOS());
        
        iconRHL = getRHL().getSymbol(getRHL().getCurrentPOS());
        
        System.out.println("Machine: Reel Icons = R3: "+iconR3+" R2: "+iconR2+" R1: "+iconR1+" RHL: No. "+iconRHL);
        
        if(iconR3.equals(iconR2) && iconR2.equals(iconR1) && iconR3.equals(iconR1)){
            winCash();
        } else if((iconR3.equals("Red7") || iconR3.equals("Blue7") || iconR3.equals("Gold7")) && (iconR2.equals("Red7") || iconR2.equals("Blue7") || iconR2.equals("Gold7")) && (iconR1.equals("Red7") || iconR1.equals("Blue7") || iconR1.equals("Gold7"))){
            winCash();
        } else if((iconR3.equals(iconR2) || iconR2.equals(iconR1) || iconR3.equals(iconR1)) && (!machine.getGambleNudgeOn() && !machine.getNudgeOn())){
            machine.execute("BANKTEXT_LOSE_ON");
            if(iconR3.equals(iconR2)){// && System.currentTimeMillis() / 150 % 2 == 0){
                calculateLetEmSpin(iconR2);
            } else if(iconR3.equals(iconR1)){// && System.currentTimeMillis() / 150 % 2 == 0){
                calculateLetEmSpin(iconR3);
            } else if(iconR2.equals(iconR1)){// && System.currentTimeMillis() / 150 % 2 == 0){
                calculateLetEmSpin(iconR1);
            }
                
        }
        
    }
    
    
    /**
     * winCash()
     * 
     */
    public void winCash(){
        //machine.CancelHolds();
        machine.execute("CANCEL_HOLDS");
        machine.setHoldOn(false);
        machine.setNudges(0);
        machine.setNudgeOn(false);
        machine.setGambleNudgeOn(false);
        
        machine.digits.clearBankText();
        machine.digits.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(1).getText());
                
        if(iconR3.equals(iconR2) && iconR2.equals(iconR1) && iconR3.equals(iconR1)){
            System.out.println("Machine: You Win 3x "+iconR1+"'s");
            calculateCash(iconR1);
        } else if((iconR3.equals("Red7") || iconR3.equals("Blue7") || iconR3.equals("Gold7")) && (iconR2.equals("Red7") || iconR2.equals("Blue7") || iconR2.equals("Gold7")) && (iconR1.equals("Red7") || iconR1.equals("Blue7") || iconR1.equals("Gold7"))){
            System.out.println("Machine: You Win 3x Mixed7's");
            calculateCash("Mixed7");
        }
        
    }
    
    
    /**
     * collectCashWinnings()
     * 
     */
    public void collectCashWinnings(){
        
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(1).getText(), false);
        
        bank.increaseBank(currentCashWin);
        
        machine.digits.clearBankText();
        machine.lighter.clearCash();
        
        clearCashWin();
    }
    
    
    /**
     * loseGambleCash()
     * 
     */
    public void loseGambleCash(){
        int ran = machine.rng.random.nextInt(4);    
        if(ran == 0){
            Sound.lose1.play();
        }
        if(ran == 1){
            Sound.lose2.play();
        }
        if(ran == 2){
            Sound.lose3.play();
        }
        if(ran == 3){
            Sound.lose4.play();
        }
        if(ran == 4){
            Sound.lose5.play();
        }
            
        machine.setGambleCashOn(false);
        machine.digits.clearBankText();
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(6).getText(), false);
        
        collectCashWinnings();
    }
    
    
    /**
     * clearCashWin()
     * 
     */
    private void clearCashWin() {
        machine.setGambleCashOn(false);
        machine.setGambleNudgeOn(false);

        machine.lighter.clearCash();
        machine.digits.clearBankText();
    }
    
    
    public static boolean getSpinAll() {
        return spinAll;
    }
    
    
    
    //Nudge Functions ***********************************
    /**
     * getNudges()
     * 
     * @return nudges
     */
    public int getNudges(){
        if(machine.getCredits() < 1){
            nudges = 0;
        } else {
            nudges = rng.getNudgeresult();
        }
        
        return nudges;
    }
    
    
    /**
     * setNudges(int nudgeBalance)
     * 
     * @param nudgeBalance
     */
    public static void setNudges(int nudgeBalance) {
        
        machine.lighter.clearNudges();
        machine.digits.clearBankText();
        
        nudges = nudgeBalance;
        machine.lighter.setNudges(nudges);
        machine.lighter.newNudgeWin = nudges;
        
        machine.setCurrentNudgeWin(nudges);
        
        if(nudges > 0){
            //Take Nudge, Nudge and  Nudges lights On
            machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(10).getText());
            machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(11).getText());
            machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(12).getText());
        }
        if(nudges <= 0){
            machine.setNudgeOn(false);
        }
        
        if(nudges == 1){
            //Higher Nudges
            machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(0).getText());
            
            //Lower Nudges
            machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(13).getText());
        }
        if(nudges == 2){
            for(int i = 0; i < 1; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
            
            for(int j = 13; j < 14; j++){
                //Lower Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(j).getText());
            }
        }
        if(nudges == 3){
            for(int i = 0; i < 2; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
            
            for(int j = 13; j < 15; j++){
                //Lower Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(j).getText());
            }
        }
        if(nudges == 4){
            for(int i = 0; i < 3; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
            
            for(int j = 13; j < 16; j++){
                //Lower Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(j).getText());
            }
        }
        
        if(nudges == 5){
            for(int i = 0; i < 4; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        if(nudges == 6){
            for(int i = 0; i < 5; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        if(nudges == 7){
            for(int i = 0; i < 6; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        if(nudges == 8){
            for(int i = 0; i < 7; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        if(nudges == 9){
            for(int i = 0; i < 8; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        if(nudges == 10){
            for(int i = 0; i < 9; i++){
                //Higher Nudges
                machine.lighter.turnNudgeLightOn(machine.lighter.theNudges.allNudges.get(i).getText());
            }
        }
        
    }
    
    
    /**
     * increaseNudges(int i)
     * 
     * @param i
     */
    public void increaseNudges(int i){
        machine.lighter.increaseNudgesLights(i);
    }
    
    
    /**
     * decreaseNudges(int i)
     * 
     * @param i
     */
    public void decreaseNudges(int i){
        machine.lighter.decreaseNudgesLights(i);
    }
    
    /**
     * increaseCash(int i)
     * 
     * @param i
     */
    public void increaseCash(int i){
        machine.lighter.increaseCashLights(i);
    }
    
    
    /**
     * decreaseCash(int i)
     * 
     * @param i
     */
    public void decreaseCash(int i){
        machine.lighter.decreaseCashLights(i);
    }
    
    /**
     * nudgeR1()
     * 
     * nudges reel 1
     */
    public static void nudgeR1(){
        //machine.NudgeReel1();
        machine.execute("NUDGE_REEL1");
        machine.calculateWinSpins();
        
        if(!startFeat){
            machine.calculateCashWin();
        }
    }
    
    
    /**
     * nudgeR2()
     * 
     * nudges reel 2
     */
    public static void nudgeR2(){
        //machine.NudgeReel2();
        machine.execute("NUDGE_REEL2");
        machine.calculateWinSpins();
        
        if(!startFeat){
            machine.calculateCashWin();
        }
    }
    
    
    /**
     * nudgeR3()
     * 
     * nudges reel 3
     */
    public static void nudgeR3(){
        //machine.NudgeReel3();
        machine.execute("NUDGE_REEL3");
        machine.calculateWinSpins();
        
        if(!startFeat){
            machine.calculateCashWin();
        }
    }
    
    /**
     * NudgeReel1()
     * 
     */
    public void NudgeReel1(){
        if(machine.getNudgeOn() && machine.getNudges() > 0){
            machine.reels.nudgeReel1();
            machine.decreaseNudges(1);
        }
    }
    
    
    /**
     * NudgeReel2()
     * 
     */
    public void NudgeReel2(){
        if(machine.getNudgeOn() && machine.getNudges() > 0){
            machine.reels.nudgeReel2();
            machine.decreaseNudges(1);
        }
    }
    
    
    /**
     * NudgeReel3()
     * 
     */
    public void NudgeReel3(){
        if(machine.getNudgeOn() && machine.getNudges() > 0){
            machine.reels.nudgeReel3();
            machine.decreaseNudges(1);
        }
    }
    
    
    /**
     * getNudgeOn()
     * 
     * @return nudgeOn
     */
    public boolean getNudgeOn() {
        return machine.nudgeOn;
    }

    
    /**
     * setNudgeOn(boolean nudgeOn)
     * 
     * @param nudgeOn
     */
    public void setNudgeOn(boolean nudgeOn) {
        if(machine.getCredits() > 0){
            machine.nudgeOn = nudgeOn;
            machine.reels.setNudgeOn(nudgeOn);
            
            if(machine.getNudgeOn() && !machine.getGambleNudgeOn()){
                machine.lighter.theButtonz.setFlashing("HoldReel1", true);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);

                machine.digits.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(6).getText());
            } else {
                machine.lighter.theButtonz.setFlashing("HoldReel1", false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);

                machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(6).getText());
            }
        }
    }

    /**
     * getGambleHiLoOn()
     * 
     * @return gambleHiLoOn
     */
    public boolean getGambleHiLoOn() {
        return machine.gambleHiLoOn;
    }
    
    /**
     * setGambleHiLoOn(boolean gambleHiLoOn)
     * 
     * @param gambleHiLoOn
     */
    public void setGambleHiLoOn(boolean gambleHiLoOn) {
        machine.gambleHiLoOn = gambleHiLoOn;
        
        if(machine.getGambleHiLoOn()){    
            machine.digits.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(8).getText());
        } else {
            machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(8).getText());
        }
        
    }
    
    
    //Gamble Nudge Functions
    /**
     * getGambleNudgeOn()
     * 
     * @return gambleNudgeOn
     */
    public boolean getGambleNudgeOn() {
        return machine.gambleNudgeOn;
    }
    
    
    /**
     * setGambleNudgeOn(boolean gambleNudgeOn)
     * 
     * @param gambleNudgeOn
     */
    public void setGambleNudgeOn(boolean gambleNudgeOn) {
        machine.gambleNudgeOn = gambleNudgeOn;
        
        if(machine.getGambleNudgeOn()){    
            machine.digits.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(8).getText());
        } else {
            machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(8).getText());
        }
        
    }
    
    
    /**
     * enableCollectNudge()
     * 
     */
    public static void enableCollectNudge(){
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(1).getText(), true);
        
        machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(1).getText());
        machine.setGambleCashOn(false);
    }
    
    
    /**
     * collectNudgeWinnings()
     * 
     */
    public void collectNudgeWinnings(){

        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(1).getText(), false);
        machine.lighter.clearNudges();

        machine.currentNudgeWin = machine.getCurrentNudgeWin();

        machine.setCurrentNudgeWin(machine.lighter.newNudgeWin);
        
        if(machine.currentNudgeWin > 0){
            machine.lighter.setNudges(machine.currentNudgeWin);
            machine.setNudgeOn(true);
        } else {
            machine.setNudgeOn(false);
        }

        machine.setGambleNudgeOn(false);
        machine.digits.clearBankText();
        clearNudgeWin();
    }
    
    
    /**
     * gambleNudgeClicked()
     * 
     */
    public void gambleNudgeClicked() {
        int current = machine.getCurrentNudgeWin();
        Sound.gambleNudges.play();
        
        machine.lighter.clearNudges();
        machine.setCurrentNudgeWin(machine.lighter.newNudgeWin);
        
        if(current <= 0){
            machine.lose();
        }
        if(current > machine.getCurrentNudgeWin()){
            machine.loseGambleNudges();
        }
        machine.digits.clearBankText();
    }
    
    
    /**
     * getCurrentNudgeWin()
     * 
     * @return currentNudgeWin
     */
    public int getCurrentNudgeWin(){
        return machine.currentNudgeWin;
    }
    
    
    /**
     * setCurrentNudgeWin(int newBalance)
     * 
     * @param newBalance
     */
    public void setCurrentNudgeWin(int newBalance) {        
        
        machine.currentNudgeWin = newBalance;
        
        if(machine.currentNudgeWin > 0){
            machine.setGambleCashOn(false);
        }
        
        if(machine.currentNudgeWin <= 0){
            machine.lose();
        }
        if(machine.currentNudgeWin == 1){
            calculateNudge("oneNudge");
        }
        if(machine.currentNudgeWin == 2){
            calculateNudge("twoNudge");
        }
        if(machine.currentNudgeWin == 3){
            calculateNudge("threeNudge");
        }
        if(machine.currentNudgeWin == 4){
            calculateNudge("fourNudge");
        }
        if(machine.currentNudgeWin == 5){
            calculateNudge("fiveNudge");
        }
        if(machine.currentNudgeWin == 6){
            calculateNudge("sixNudge");
        }
        if(machine.currentNudgeWin == 7){
            calculateNudge("sevenNudge");
        }
        if(machine.currentNudgeWin == 8){
            calculateNudge("eightNudge");
        }
        if(machine.currentNudgeWin == 9){
            calculateNudge("tenNudge");
        }
        if(machine.currentNudgeWin == 10){
            calculateNudge("ninetyNineNudge");
            System.out.println("Machine: 99 NUDGES!!");
            machine.digits.setBankText(3);
            machine.setGambleNudgeOn(false);
        }
    }
    
    
    /**
     * calculateNudgeWin()
     * 
     */
    public void calculateNudgeWin() {
        
        iconNudge = "";
        
        int nudg = machine.getCurrentNudgeWin();
        
        if(nudg == 1){
            iconNudge = "oneNudge";
        }
        if(nudg == 2){
            iconNudge = "twoNudge";
        }
        if(nudg == 3){
            iconNudge = "threeNudge";
        }
        if(nudg == 4){
            iconNudge = "fourNudge";
        }
        if(nudg == 5){
            iconNudge = "fiveNudge";
        }
        if(nudg == 6){
            iconNudge = "sixNudge";
        }
        if(nudg == 7){
            iconNudge = "sevenNudge";
        }
        if(nudg == 8){
            iconNudge = "eightNudge";
        }
        if(nudg == 9){
            iconNudge = "tenNudge";
        }
        if(nudg == 10){
            iconNudge = "ninetyNineNudge";
        }
    }
    
    
    /**
     * calculateNudge(String winner)
     * 
     * @param winner
     */
    public void calculateNudge(String winner){
        
        //Win type
        if(winner.equals("oneNudge")){
            //set nudge lights to 1
            machine.lighter.turnNudgeLightOn("oneNudge");
            machine.lighter.turnNudgeLightOn("oneLNudge");
            
            currentNudgeWin = 1;
        }
        if(winner.equals("twoNudge")){
            //set nudge lights to 2
            machine.lighter.turnNudgeLightOn("twoNudge");
            machine.lighter.turnNudgeLightOn("twoLNudge");
            
            currentNudgeWin = 2;
        }
        if(winner.equals("threeNudge")){
            //set nudge lights to 3
            machine.lighter.turnNudgeLightOn("threeNudge");
            machine.lighter.turnNudgeLightOn("threeLNudge");
            
            currentNudgeWin = 3;
        }
        if(winner.equals("fourNudge")){
            //set nudge lights to 4
            machine.lighter.turnNudgeLightOn("fourNudge");
            machine.lighter.turnNudgeLightOn("fourLNudge");
            
            currentNudgeWin = 4;
        }
        if(winner.equals("fiveNudge")){
            //set nudge lights to 5
            machine.lighter.turnNudgeLightOn("fiveNudge");
            
            currentNudgeWin = 5;
        }
        if(winner.equals("sixNudge")){
            //set nudge lights to 6
            machine.lighter.turnNudgeLightOn("sixNudge");
            
            currentNudgeWin = 6;
        }
        if(winner.equals("sevenNudge")){
            //set nudge lights to 7
            machine.lighter.turnNudgeLightOn("sevenNudge");
            
            currentNudgeWin = 7;
        }
        if(winner.equals("eightNudge")){
            //set nudge lights to 8
            machine.lighter.turnNudgeLightOn("eightNudge");
            
            currentNudgeWin = 8;
        }
        if(winner.equals("tenNudge")){
            //set nudge lights to 10
            machine.lighter.turnNudgeLightOn("tenNudge");
            
            currentNudgeWin = 9;
        }
        if(winner.equals("ninetyNineNudge")){
            //set nudge lights to 99
            machine.lighter.turnNudgeLightOn("ninetyNineNudge");
            
            currentNudgeWin = 10;
        }

        if(machine.currentNudgeWin > 0){
            int ran = machine.rng.random.nextInt(4);
            if(ran == 0){
                Sound.win5.play();
            }
            if(ran == 1){
                Sound.win4.play();
            }
            if(ran == 2){
                Sound.win3.play();
            }
            if(ran == 3){
                Sound.win2.play();
            }
            if(ran == 4){
                Sound.win1.play();
            }
            
        }
        //enableCollectNudge();
        machine.execute("ENABLE_COLLECT_NUDGES");
    }
    
    
    /**
     * winNudge()
     * 
     */
    public void winNudge(){
        //machine.CancelHolds();
        machine.execute("CANCEL_HOLDS");
        machine.setNudgeOn(false);
        
        machine.digits.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(1).getText());
                
        calculateNudge(iconNudge);
        Sound.win4.play();
    }
    
    
    /**
     * loseGambleNudges()
     * 
     */
    public void loseGambleNudges(){
        machine.setGambleNudgeOn(false);
        machine.setNudgeOn(true);
        
        machine.digits.turnBankTextOff(machine.digits.theBankText.allbanktxts.get(1).getText());
        
        Sound.lose1.play();
        
        collectNudgeWinnings();
    }
    
    
    /**
     * clearNudgeWin()
     * 
     */
    private void clearNudgeWin() {
        machine.setGambleNudgeOn(false);
        machine.setNudgeOn(true);
        machine.digits.clearBankText();
    }
    
    
    /**
     * gambleNudges()
     * 
     */
    public static void gambleNudges(){
        System.out.println("Machine: Gamble Nudges activated!!");
    }
    
    
    /**
     * collectNudges()
     * 
     */
    public static void collectNudges(){
        System.out.println("Machine: Collect Nudges activated!!");
    }
    
    
    
    
    
    
    //Holds Functions ***********************************
    /**
     * getHoldOn()
     * 
     * @return holdOn
     */
    public boolean getHoldOn() {
        return machine.rng.getHoldOn();
    }
    
    
    /**
     * setHoldOn(boolean holdOn)
     * 
     * @param holdOn
     */
    public void setHoldOn(boolean holdOn) {
        if(machine.getCredits() > 0){
            machine.holdOn = holdOn;
            machine.reels.setHoldOn(holdOn);
            
            if(machine.getHoldOn()){
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
            } else {
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
            }
        } else {
            machine.holdOn = false;
        }
    }
    
    /**
     * holdR1()
     * 
     * holds reel 1
     */
    public static void holdR1(){
        if(!startFeat){
            if(Machine.rng.getHoldOn()){
                //machine.HoldReel1();
                machine.execute("HOLD_REEL1");
            } else if(Machine.rng.getNudgeOn()){
                //machine.NudgeReel1();
                machine.execute("NUDGE_REEL1");
            }
        } else {
            machine.gambleHILOClicked("LO", machine.getRHL().getSymbol(machine.getRHL().getCurrentPOS()));
        }
    }
    
    
    /**
     * holdR2()
     * 
     * holds reel 2
     */
    public static void holdR2(){
        if(!startFeat){
            if(Machine.rng.getHoldOn()){
                //machine.HoldReel2();
                machine.execute("HOLD_REEL2");
            } else if(Machine.rng.getNudgeOn()){
                //machine.NudgeReel2();
                machine.execute("NUDGE_REEL2");
            }
        } else {
            machine.gambleHILOClicked("HI", machine.getRHL().getSymbol(machine.getRHL().getCurrentPOS()));
        }
    }
    
    
    /**
     * holdR3()
     * 
     * holds reel 3
     */
    public static void holdR3(){
        if(Machine.rng.getHoldOn()){
            //machine.HoldReel3();
            machine.execute("HOLD_REEL3");
        } else if(Machine.rng.getNudgeOn()){
            //machine.NudgeReel3();
            machine.execute("NUDGE_REEL3");
        }
    }
    
    
    
    /**
     * HoldReel1()
     * 
     */
    public void HoldReel1(){
        if(machine.getHoldOn()){
            machine.reels.holdReel1();
            if(machine.reels.the1stReel.getR1Hold()){
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
                
                machine.lighter.theButtonz.hold1Entered = false;
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), true);
            }else{
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
                
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
            }
        }
    }
    
    
    /**
     * HoldReel2()
     * 
     */
    public void HoldReel2(){
        if(machine.getHoldOn()){
            machine.reels.holdReel2();
            if(machine.reels.the2ndReel.getR2Hold()){
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
                
                machine.lighter.theButtonz.hold2Entered = false;
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), true);
            }else{
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
                
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
            }
        }
    }
    
    
    /**
     * HoldReel3()
     * 
     */
    public void HoldReel3(){
        if(machine.getHoldOn()){
            machine.reels.holdReel3();
            if(machine.reels.the3rdReel.getR3Hold()){
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
                
                machine.lighter.theButtonz.hold3Entered = false;
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), true);
            }else{
                machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
                machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
                
                machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
            }
        }
    }

    
    /**
     * CancelHolds()
     * 
     */
    public void CancelHolds() {
        if(machine.getHoldOn()){
            machine.reels.cancelHolds();
            
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
        }
    }

    
    /**
     * setHolds()
     * 
     */
    public void setHolds() {
        
        if(machine.reels.the1stReel.getR1Hold()){
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(2).getText(), true);
        } else {
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
        }
        
        if(machine.reels.the2ndReel.getR2Hold()){
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
        } else {
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(3).getText(), false);
        }
        
        if(machine.reels.the3rdReel.getR3Hold()){
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
        } else {
            machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
            machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(4).getText(), false);
        }
        
        machine.lighter.theButtonz.setSelected(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
    }
    
    
    
    //Credit Functions ***********************************
    /**
     * getCredits()
     * 
     * @return bank.getCredits()
     */
    public int getCredits(){
        return bank.getCredits();
    }
    
    
    /**
     * increaseCredits(int i)
     * 
     * @param i
     */
    public void increaseCredits(int i){
        bank.increaseCredits(i);
    }
    
    
    /**
     * decreaseCredits(int i)
     * 
     * @param i
     */
    public void decreaseCredits(int i){
        bank.decreaseCredits(i);
    }
    
    
    /**
     * setCredits(int creditBalance)
     * 
     * @param creditBalance
     */
    public static void setCredits(int creditBalance) {
        
        machine.digits.clearCredits();
        machine.digits.clearBankText();
        
        machine.digits.setCredits(creditBalance);
        
        if(creditBalance == 0){
            if(!machine.getGambleCashOn()){
                machine.digits.setBankText(0);
                if(!spinAll && machine.spinAllCount == 0 && !machine.getGambleNudgeOn() && !machine.getPlayHiLoOn() && !Game.stateManager.getCurrentState().getName().equals("menu")){
                    machine.execute("RANDOM_LIGHTS_ALL_ON");
                }
            }
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(0).getText(), false);
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(7).getText(), true);
            
            Display.holdNudge = false;
            machine.setHoldOn(false);
        }
        if(creditBalance == 1){
            Display.holdNudge = true;
            
            machine.execute("RANDOM_LIGHTS_ALL_OFF");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            machine.execute("DEFAULT_LIGHTS_ALL_ON");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            machine.setMachineState(MachineState.PLAY_3_REELS);
            machine.digits.setBankText(1);
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(0).getText(), true);
            machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(7).getText(), false);
            
        }
    }
    
    
    
    
    
    //WinSpin Functions ***********************************
    /**
     * calculateWinSpins()
     * 
     */ 
    public void calculateWinSpins() {
        machine.lighter.calculateWinSpins(getR1().isSpecial(getR1().getCurrentPOS()), getR2().isSpecial(getR2().getCurrentPOS()), getR3().isSpecial(getR3().getCurrentPOS()));
    }
    
    
    /**
     * increaseWinSpins()
     * 
     */
    public void increaseWinSpins() {
        machine.lighter.increaseWinSpins();
    }
    
    
    /**
     * decreaseWinSpins()
     * 
     */
    public void decreaseWinSpins() {
        machine.lighter.decreaseWinSpins();
    }
    
    
    /**
     * clearWinSpins()
     * 
     */
    public void clearWinSpins() {
        machine.lighter.clearWinningSpins();
    }
    
    
    
    
    
    
    //Reel Functions ***********************************
    /**
     * getR1()
     * 
     * @return 
     */
    public static Reel1 getR1() {
        return machine.reels.getReel1();
    }
    
    
    /**
     * getR2()
     * 
     * @return 
     */
    public static Reel2 getR2() {
        return machine.reels.getReel2();
    }
    
    
    /**
     * getR3()
     * 
     * @return 
     */
    public static Reel3 getR3() {
        return machine.reels.getReel3();
    }

    
    /**
     * getRHL()
     * 
     * @return 
     */
    public static Reelhilo getRHL() {
        return machine.reels.getRHL();
    }

    
    
    
    
    //Feature Functions ***********************************
    /**
    * startFeature()
    * 
    * starts Feature
    */
    public static void startFeature() {
        System.out.println("Machine: Starting Feature!!");
        startFeat = true;
        
        //machine.CancelHolds();
        machine.execute(CANCEL_HOLDS);
        machine.setNudges(0);
        machine.setNudgeOn(false);
        //machine.setLetEmSpinOn(false);
        machine.execute("DISABLE_LET_EM_SPIN");
        
        //play HiLo
        machine.playHILO();
        
    }
    
    /**
     * getStartFeature()
     * 
     * @return startFeat
     */
    public static boolean getStartFeature() {
        return startFeat;
    }
    
    /**
     * cancelFeature()
     * 
     * cancels Feature
     */
    public static void cancelFeature() {
        System.out.println("Machine: Cancel Feature!!");
        startFeat = false;
        
        //turn on start button (if credit >0)
        machine.lighter.theButtonz.setFlashing("HoldReel1", false);
        machine.lighter.theButtonz.setFlashing("HoldReel2", false);
        
        machine.setMachineState(MachineState.PLAY_3_REELS);
    }
    
    /**
     * exchange4Feature()
     * 
     */
    public static void exchange4Feature(){
        System.out.println("Machine: Exchange for feature activated!!");
        //startFeature();
        machine.execute("START_FEATURE");
    }
    
    /**
     * exchange4Feature()
     * 
     */
    public static boolean exchange4FeatureOn(){
        return exchange4FeatOn;
    }
    
    /**
     * collectFeature()
     * 
     */
    public static void collectFeature(){
        System.out.println("Machine: Collect feature activated!!");
    }
    
    /**
     * gambleFeature()
     * 
     */
    public static void gambleFeature(){
        System.out.println("Machine: Gamble feature activated!!");
    }
    
    /**
     * EndFeature()
     * 
     */
    public static void EndFeature(){
        System.out.println("Machine: End feature activated!!");
    }
    
    /**
     * loseGambleFeatures()
     * 
     */
    public static void loseGambleFeatures(){
        System.out.println("Machine: Lose Gamble feature activated!!");
    }
    
    
    /**
     * getCrackpot()
     * 
     * @return bank.getCrackpot()
     */
    public int getCrackpot(){
        return bank.getCrackpot();
    }
    
    
    /**
     * increaseCrackpot(int i)
     * 
     * @param i
     */
    public void increaseCrackpot(int i){
        bank.increaseCrackpot(i);
    }
    
    
    /**
     * decreaseCrackpot(int i)
     * 
     * @param i
     */
    public void decreaseCrackpot(int i){
        bank.decreaseCrackpot(i);
    }
    
    /**
     * setCrackpot(int crackpotBalance)
     * 
     * @param crackpotBalance
     */
    public void setCrackpot(int crackpotBalance) {
        machine.digits.clearCrackpot();
        machine.digits.setCrackpot(crackpotBalance);
        
    }

    
    /**
     * setBank(int bankBalance)
     * 
     * @param bankBalance
     */
    public static void setBank(int bankBalance) {
        balance = bankBalance;
        machine.digits.clearBankText();
        
        machine.bank.setBank(balance);
        machine.digits.setBank(balance);
    }
    
    
    public void increseCashLights(int increase){
        machine.lighter.increaseCashLights(increase);
    }
    
    
    public void decreseCashLights(int decrease){
        machine.lighter.decreaseCashLights(decrease);
    }
    
    /**
     * loseGame()
     * 
     */
    public static void loseGame(){
        System.out.println("Machine: Lose Game activated!!");
        machine.execute("BANKTEXT_GAME_OVER_ON");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * lose()
     * 
     */
    public void lose(){
        machine.digits.clearBankText();
        machine.setGambleNudgeOn(false);
        machine.setNudgeOn(false);
        
        machine.execute("BANKTEXT_LOSE_ON");//.turnBankTextOn(machine.digits.theBankText.allbanktxts.get(5).getText());
        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(1).getText(), false);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Machine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /**
     * playHILO()
     * 
     */
    public void playHILO() {        
        machine.feature.hiloGame(machine);
        System.out.println("Machine: PlayHiLo activated!!");
        machine.setPlayHiLoOn(true);
        setMachineState(MachineState.PLAY_HILO);
    }

    
    /**
     * gambleHILOClicked(String result)
     * 
     * @param result
     * @param current
     */
    public void gambleHILOClicked(String result, int current) {
        RNG.start = true;
        machine.spinHiLoReel();
            
        //Compare current with current HiLo result and choice to determine win
        //getCurrent HiLo No.
        int currentHiLo = current;//machine.feature.getHiloNumber();
        
        System.out.println("Machine: Gamble HiLo: "+result+", Current HiLo No.: "+currentHiLo);
        
        int nextHiLo = machine.reels.getRHL().getSymbol(Machine.rng.getReelhiloresult());
        
        String currentRoulette = machine.lighter.theRoulette.getSymbol(Machine.rng.getRouletteresult());
        
        //When Hi/Lo chosen record choice
        if(result.equals("HI")){
            if(currentHiLo < nextHiLo){
                System.out.println("Machine: HI ? You Win :"+nextHiLo+" is greater than "+currentHiLo);
                //increase cash Nudges based on current Roulette
                System.out.println("Machine: You Win :"+currentRoulette);
                machine.setPlayHiLoOn(true);
            } else {
                System.out.println("Machine: HI ? You Lose :"+nextHiLo+" is not greater than "+currentHiLo);
                //turn off hiLo game
                //machine.cancelFeature();
                machine.execute("CANCEL_FEATURE");
            }
        }
        if(result.equals("LO")){
            if(currentHiLo > nextHiLo){
                System.out.println("Machine: LO ? You Win :"+nextHiLo+" is less than "+currentHiLo);
                //increase cash Nudges based on current Roulette
                System.out.println("Machine: You Win :"+currentRoulette);
                machine.setPlayHiLoOn(true);
            } else {
                System.out.println("Machine: LO ? You Lose :"+nextHiLo+" is not less than "+currentHiLo);
                //turn off hiLo game
                //machine.cancelFeature();
                machine.execute("CANCEL_FEATURE");
            }
        }
        System.out.println("Machine: Gamble Hi-Lo activated!! Selected: "+result);
        
    }

    
    /**
     * calculateLetEmSpin(String iconR)
     * 
     * @param iconR
     */
    private void calculateLetEmSpin(String iconR) {
        System.out.println("Machine: LetEmSpin Activated : "+iconR);
        
        machine.setNudgeOn(false);
        machine.setGambleNudgeOn(false);
        
        machine.setHoldOn(true);
        
        //machine.setLetEmSpinOn(true);
        machine.execute("ENABLE_LET_EM_SPIN");
        machine.setLetEmSpinIcon(iconR);//iconR;
    }

    
    public int getBank() {
        return bank.getBank();
    }

    
    private String getLetEmSpinIcon() {
        return machine.letEmSpinIcon;
    }

    
    private void setLetEmSpinIcon(String icon) {
        machine.letEmSpinIcon = icon;
    }

    
    private boolean getPlayHiLoOn() {
        return machine.spinHiLo;
    }
    
    
    private void setPlayHiLoOn(boolean hilo) {
        machine.spinHiLo = hilo;
        
        if(machine.getPlayHiLoOn()){
            machine.setGambleHiLoOn(true);
            
            machine.lighter.theButtonz.setFlashing("HoldReel1", true);
            machine.lighter.theButtonz.setFlashing("HoldReel2", true);

            spinHiLoReel();
        } else {
            machine.setGambleHiLoOn(false);
            
            machine.lighter.theButtonz.setFlashing("HoldReel1", false);
            machine.lighter.theButtonz.setFlashing("HoldReel2", false);
        }
    
    }

    
    private void jackpot() {
        Sound.jackpot.play();
        machine.setNudgeOn(false);
        machine.setGambleNudgeOn(false);
        
        machine.execute("BANKTEXT_JACKPOT_ON");
        
        machine.execute("REELS_REVERSE_ON");
        
        //Spin reels backwards to bells
        machine.execute("REELS_WINSPIN_GOLD_BELLS");
        
        //Light-up all lights in pattern
        machine.execute("RANDOM_ALL_LIGHTS_ON");
        
        //Spin reels forward to bells
        machine.execute("REELS_FORWARD_ON");
        machine.execute("REELS_WINSPIN_GOLD_BELLS");
        
        Display.game.machine.collectCashWinnings();
        
        machine.setGambleCashOn(false);
        currentCashWin = 0;
    }

    
    
    private void increaseWinSpins(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void increaseFeatures(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void enableCollectAll() {
        machine.execute("ENABLE_COLLECT_ALL");
        setMachineState(MachineState.GAMBLE_ALL);
    }
    
    
    private void machineStateChanged(){
        
        if(machine.getCredits() >= 1 && !machine.spinHiLo && !spinAll && !startFeat){
            machine.lighter.theButtonz.setFlashing("Start!", true);
        } else {
            machine.setHoldOn(false);
        }
        
        //record nudges
        int playerNudges = machine.getNudges();
        
        int playerCurrentNudgeWin = machine.getCurrentNudgeWin();
                
        //record nudge on
        boolean playerNudgeOn = machine.getNudgeOn();
        
        //record gamble nudge
        boolean playerNudgeGambleOn = machine.getGambleNudgeOn();
        
        //record skillshot nudge
        boolean playerSkillshotNudgeOn = machine.getGambleCashOn();
        
        
        //record cash
        int playerCash = machine.getCurrentCashWin();
        
        //record gamble cash
        boolean playerCashGambleOn = machine.getGambleCashOn();
        
        //record skillshot cash
        boolean playerSkillshotCashOn = machine.getGambleCashOn();
        
        
        //record bank
        int playerBank = machine.getBank();
        
        //record credits
        int playerCredits = machine.getCredits();
        
        //record crackpot
        int playerCrackpot = machine.getCrackpot();
        
        //record skillshot crackpot
        boolean playerSkillshotCrackpotOn = machine.getGambleCashOn();
        
        
        
        //record reel1
        int playerReel1 = machine.getR1().getCurrentPOS();
        
        //record reel1Symbol
        String playerReel1Symbol = Machine.getR1().getSymbol(playerReel1);
        
        //record reel1Special
        boolean playerReel1Special = Machine.getR1().isSpecial(playerReel1);
        
        
        //record reel2
        int playerReel2 = machine.getR2().getCurrentPOS();
        
        //record reel2Symbol
        String playerReel2Symbol = Machine.getR2().getSymbol(playerReel2);
        
        //record reel2Special
        boolean playerReel2Special = Machine.getR2().isSpecial(playerReel2);
        
        
        //record reel3
        int playerReel3 = machine.getR3().getCurrentPOS();
        
        //record reel3Symbol
        String playerReel3Symbol = Machine.getR3().getSymbol(playerReel3);
        
        //record reel2Special
        boolean playerReel3Special = Machine.getR3().isSpecial(playerReel3);
        
        
        //record reelHiLo
        int playerReelHiLo = machine.getRHL().getCurrentPOS();
        
        //record reelHiLoNo
        int playerReelHiLoNo = machine.getRHL().getSymbol(playerReelHiLo);
        
        //record gamble HiLo on
        boolean playerHiLoGambleOn = machine.getGambleHiLoOn();
        
        //record skillstop HiLo
        boolean playerSkillstopHiLoOn = machine.getSkillstopHiLoOn();
        
        
        
        
        //record roulette
        int playerRoulette = machine.getRoulette().getCurrentPOS();
        
        //record roulette symbol
        String playerRouletteSymbol = machine.getRoulette().getSymbol(playerRoulette);
        
        
        //record win spins
        int playerWinSpins = machine.getWinSpins(playerReel1Special, playerReel2Special, playerReel3Special);
        
        //record feature
        //int playerFeature = machine.getFeature();
        
        //record feature symbol
        String playerFeatureSymbol = Feature.getCurrentFeature();
        
        //record start feature on
        boolean playerStartFeatOn = machine.getStartFeature();
        
        //record play HiLo on
        boolean playerPlayHiLoOn = machine.getPlayHiLoOn();
        
        //record start feature on
        boolean playerSpinHiLoOn = machine.getSpinHiLo();
        
        
        //record hold on
        boolean playerHoldOn = machine.getHoldOn();
        
        //record hold on
        boolean playerSuperHoldOn = machine.getSuperHoldOn();
        
        //record skillshot on
        boolean playerSkillshotOn = machine.getSkillshotOn();
        
        //record LetEmSpin on
        boolean playerLetEmSpinOn = machine.getLetEmSpinOn();
        
        //record LetEmSpin on
        String playerLetEmSpinIcon = machine.getLetEmSpinIcon();
        
        
        
        
        
        //Update Machine
        //Player feedback
            System.out.println("Machine: Player Feedback");
            System.out.println(" ");
            System.out.println("Current Time: "+System.currentTimeMillis());
            System.out.println(" ");
            System.out.println("Current Nudges: "+playerNudges);
            System.out.println("Current NudgeOn: "+playerNudgeOn);
            System.out.println("Current GambleNudgeOn: "+playerNudgeGambleOn);
            System.out.println("Current SkillshotNudgeOn: "+playerSkillshotNudgeOn);
            System.out.println("Current Cash: "+playerCash);
            System.out.println("Current GambleCashOn: "+playerCashGambleOn);
            System.out.println("Current SkillshotCashOn: "+playerSkillshotCashOn);
            System.out.println("Current Bank: "+playerBank);
            System.out.println("Current Credits: "+playerCredits);
            System.out.println("Current Crackpot: "+playerCrackpot);
            System.out.println("Current SkillshotCrackpotOn: "+playerSkillshotCrackpotOn);
            System.out.println(" ");
            System.out.println("Current [Lower] Reels: Reel3 R3POS       Reel2 R2POS       Reel1 R1POS");
            System.out.println("Current [Lower] Reels: "+playerReel3Symbol+" "+playerReel3+"        "+playerReel2Symbol+" "+playerReel2+"           "+playerReel1Symbol+" "+playerReel1);
            System.out.println("Current Special Reels: "+playerReel3Special+" "+playerReel2Special+" "+playerReel1Special);
            System.out.println("Current Win Spins: "+playerWinSpins);
            System.out.println("Current HiLo Reel: NO:"+playerReelHiLoNo+" POS:"+playerReelHiLo);
            System.out.println("Current Roulette: "+playerRouletteSymbol+" POS:"+playerRoulette);
            System.out.println("Current Hold On: "+playerHoldOn);
            System.out.println("Current Nudge On: "+playerNudgeOn+" Current Nudge win: "+playerCurrentNudgeWin);
            System.out.println("Current Gamble Nudge On: "+playerNudgeGambleOn+" Current Nudge win: "+playerCurrentNudgeWin);
            System.out.println("Current Gamble Cash On: "+playerCashGambleOn+" Current Cash win: "+playerCash);
            System.out.println(" ");
            System.out.println("Let-Em-Spin Activated: "+playerLetEmSpinOn);
            System.out.println("Let-Em-Spin Icon: "+playerLetEmSpinIcon);
            System.out.println(" ");
            System.out.println("Start Feature Activated: "+playerStartFeatOn);
            System.out.println("Current Feature: "+playerFeatureSymbol);
            System.out.println("Play-HiLo Activated: "+playerPlayHiLoOn);
            System.out.println("Spin HiLo Activated: "+playerSpinHiLoOn);
            System.out.println("Gamble HiLo Activated: "+playerHiLoGambleOn);
            System.out.println("Skillstop HiLo Activated: "+playerSkillstopHiLoOn);
            System.out.println(" ");
            System.out.println("Skillshot Activated: "+playerSkillshotOn);
            System.out.println("SuperHold Activated: "+playerSuperHoldOn);
            System.out.println(" ");
            System.out.println(" ");
    }

    
    private Roulette getRoulette() {
        return machine.lighter.getRoulette();
    }

    
    private boolean getSuperHoldOn() {
        return superHoldOn;
    }

    
    private boolean getSkillstopHiLoOn() {
        return skillStopHiLoOn;
    }

    
    private boolean getSkillshotOn() {
        return skillshotOn;
    }

    
    private boolean getSpinHiLo() {
        return spinHiLo;
    }

    
    private int getWinSpins(boolean r1, boolean r2, boolean r3) {
        int result = 0;
        
        if(r1){
            result++;
        }
        if(r2){
            result++;
        }
        if(r3){
            result++;
        }
        
        return result;
    }

    
    private Feature getFeature() {
        return machine.feature;
    }
     
    
    public static final String CANCEL_HOLDS = "CANCEL_HOLDS";
    public static final String START_FEATURE = "START_FEATURE";
    public static final String END_FEATURE = "END_FEATURE";
    public static final String CANCEL_FEATURE = "CANCEL_FEATURE";
    
    public static final String HOLD_REEL1 = "HOLD_REEL1";
    public static final String HOLD_REEL2 = "HOLD_REEL2";
    public static final String HOLD_REEL3 = "HOLD_REEL3";
    public static final String NUDGE_REEL1 = "NUDGE_REEL1";
    public static final String NUDGE_REEL2 = "NUDGE_REEL2";
    public static final String NUDGE_REEL3 = "NUDGE_REEL3";
    
    public static final String ENABLE_COLLECT_ALL = "ENABLE_COLLECT_ALL";
    public static final String ENABLE_COLLECT_CASH = "ENABLE_COLLECT_CASH";
    public static final String ENABLE_COLLECT_NUDGES = "ENABLE_COLLECT_NUDGES";
    public static final String ENABLE_EXCHANGE = "ENABLE_EXCHANGE";
    public static final String ENABLE_SUPER_HOLDS = "ENABLE_SUPER_HOLDS";
    public static final String ENABLE_LET_EM_SPIN = "ENABLE_LET_EM_SPIN";
    public static final String DISABLE_LET_EM_SPIN = "DISABLE_LET_EM_SPIN";
    public static final String RANDOM_LIGHTS_ALL_ON = "RANDOM_LIGHTS_ALL_ON";
    public static final String RANDOM_LIGHTS_ALL_OFF = "RANDOM_LIGHTS_ALL_OFF";
    public static final String DEFAULT_LIGHTS_ALL_ON = "DEFAULT_LIGHTS_ALL_ON";
    
    public static final String JACKPOT = "JACKPOT";
    
    
    @Override
    public void execute(String command) {
        Iterator<CommandController> commandIterator = this.commControllers.iterator();
        while(commandIterator.hasNext()){
            CommandController commandController = commandIterator.next();
            if(commandController instanceof Machine){
                switch(command){
                    case Machine.CANCEL_HOLDS:
                        CancelHolds();
                        break;
                    case Machine.START_FEATURE:
                        startFeature();
                        break;
                    case Machine.END_FEATURE:
                        EndFeature();
                        break;
                    case Machine.CANCEL_FEATURE:
                        cancelFeature();
                        break;
                    case Machine.HOLD_REEL1:
                        HoldReel1();
                        break;
                    case Machine.HOLD_REEL2:
                        HoldReel2();
                        break;
                    case Machine.HOLD_REEL3:
                        HoldReel3();
                        break;
                    case Machine.NUDGE_REEL1:
                        NudgeReel1();
                        break;
                    case Machine.NUDGE_REEL2:
                        NudgeReel2();
                        break;
                    case Machine.NUDGE_REEL3:
                        NudgeReel3();
                        break;
                    case Machine.ENABLE_COLLECT_ALL:
                        enableCollectAll();
                        break;
                    case Machine.ENABLE_COLLECT_CASH:
                        enableCollectCash();
                        break;
                    case Machine.ENABLE_COLLECT_NUDGES:
                        enableCollectNudge();
                        break;
                    case Machine.ENABLE_EXCHANGE:
                        enableExchange();
                        break;
                    case Machine.ENABLE_SUPER_HOLDS:
                        setSuperHoldOn(true);
                        break;
                    case Machine.ENABLE_LET_EM_SPIN:
                        setLetEmSpinOn(true);
                        break;
                    case Machine.DISABLE_LET_EM_SPIN:
                        setLetEmSpinOn(false);
                        break;
                    case Machine.JACKPOT:
                        jackpot();
                        break;
//                    case Machine.WINSPIN_LIGHT_OFF:
//                        winspinLights.off();
//                        break;
                    case Machine.RANDOM_LIGHTS_ALL_ON:
                        randomLightsAllOn();
                        break;
                    case Machine.RANDOM_LIGHTS_ALL_OFF:
                        randomLightsAllOff();
                        break;
                    case Machine.DEFAULT_LIGHTS_ALL_ON:
                        defaultLightsAllOn();
                        break;
//                    default:
//                        System.out.println("Sorry no abla - Machine operation - vor comma du fro!!!");
                }
            } else if(commandController instanceof ReelsControls || 
                    commandController instanceof CashLightControls || 
                    commandController instanceof NudgeLightControls || 
                    commandController instanceof FeaturesLightControls || 
                    commandController instanceof CrackpotLightControls || 
                    commandController instanceof TangoDownLightControls){
                commandController.execute(command);
            } else if(commandController.canHandle(command)) {
                commandController.execute(command);
            }
        }
        
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(CANCEL_HOLDS) || 
                command.equals(START_FEATURE) || 
                command.equals(END_FEATURE) || 
                command.equals(CANCEL_FEATURE) || 
                command.equals(HOLD_REEL1) || 
                command.equals(HOLD_REEL2) || 
                command.equals(HOLD_REEL3) || 
                command.equals(NUDGE_REEL1) || 
                command.equals(NUDGE_REEL2) || 
                command.equals(NUDGE_REEL3) ||
                command.equals(ENABLE_COLLECT_ALL) || 
                command.equals(ENABLE_COLLECT_CASH) || 
                command.equals(ENABLE_COLLECT_NUDGES) ||
                command.equals(ENABLE_EXCHANGE) ||
                command.equals(ENABLE_SUPER_HOLDS) || 
                command.equals(ENABLE_LET_EM_SPIN) || 
                command.equals(DISABLE_LET_EM_SPIN) || 
                command.equals(JACKPOT) || 
                command.equals(RANDOM_LIGHTS_ALL_ON) || 
                command.equals(RANDOM_LIGHTS_ALL_OFF) || 
                command.equals(DEFAULT_LIGHTS_ALL_ON)){
            return true;
        }
        return false;
    }

    
    private void setSuperHoldOn(boolean superHoldOn) {
        machine.reels.setSuperHoldOn(superHoldOn);
        if(superHoldOn){
            setMachineState(MachineState.SUPER_HOLDS_ON);
        }
    }

    
    private void randomLightsAllOn() {
        setMachineState(MachineState.RANDOM_LIGHTS_ON);
        machine.execute("CASH_RANDOM_ON");
        machine.execute("CRACKPOT_RANDOM_ON");
        machine.execute("FEATURE_RANDOM_ON");
        machine.execute("NUDGE_RANDOM_ON");
        machine.execute("ROULETTE_RANDOM_ON");
        machine.execute("SKILLSHOT_RANDOM_ON");
        machine.execute("TANGODOWN_RANDOM_ON");
        machine.execute("WINSPIN_RANDOM_ON");
        machine.execute("BUTTONS_RANDOM_ON");
        
    }
    
    
    private void randomLightsAllOff() {
        machine.execute("CASH_RANDOM_OFF");
        machine.execute("CRACKPOT_RANDOM_OFF");
        machine.execute("FEATURE_RANDOM_OFF");
        machine.execute("NUDGE_RANDOM_OFF");
        machine.execute("ROULETTE_RANDOM_OFF");
        machine.execute("SKILLSHOT_RANDOM_OFF");
        machine.execute("TANGODOWN_RANDOM_OFF");
        machine.execute("WINSPIN_RANDOM_OFF");
        machine.execute("BUTTONS_RANDOM_OFF");
    }

    
    private void setMachineState(MachineState machineState) {
        System.out.println("Setting Machine State to: "+machineState.toString());
        this.machineState = machineState;
    }
    
    private MachineState getMachineState() {
        System.out.println("Current Machine State is: "+this.machineState.toString());
        return this.machineState;
    }

    private void defaultLightsAllOn() {
        machine.execute("CASH_LIGHT_DEFAULT");
        
        machine.execute("FEATURE_LIGHT_DEFAULT");
        machine.execute("NUDGE_LIGHT_DEFAULT");
        machine.execute("ROULETTE_LIGHT_DEFAULT");
        machine.execute("SKILLSHOT_LIGHT_DEFAULT");
        machine.execute("TANGODOWN_LIGHT_DEFAULT");
        machine.execute("WINSPIN_LIGHT_DEFAULT");
        machine.execute("CRACKPOT_LIGHT_DEFAULT");
    }

    
    boolean getWinSpinOn() {
        return machine.winSpinOn;
    }
    
    public static void setWinSpinOn(boolean on) {
        machine.winSpinOn = on;
    }
    
}
