/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic;

import tangodown.fruit.machine.gamelogic.Machine;

/**
 *
 * @author Ghomez
 */
public class Feature {
    
    /**Attributes*/
    
    /**currentFeat of Feature object */
    private static String currentFeat;

    /**newStar of Feature object */
    public String newStar = "*******************************************************\n";
    
    /**newLine of Feature object */
    public String newLine = "\n";
    
    
    /**Attributes*/
    
    /**extraLife of Feature object */
    public boolean extraLife;
    
    /**hiloNumber of Feature object */
    public static int hiloNumber;
    
    /**featureNumber of Feature object */
    public int featureNumber;
    
    /**cashNumber of Feature object */
    public int cashNumber;
    
    /**cashPot of Feature object */
    public int cashPot;

    /**Links*/
    
    /**Constructor*/
    
    /**Public Protocol*/
    
    /**
     * Hi-Lo game
     * 
     * @param machine
     */
    public static void hiloGame(Machine machine){
        System.out.println("Feature: HiLo Game Activated");
        currentFeat = "HiLo";
        
        //turn off all buttons
//        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(0).getText(), false);
//        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(1).getText(), false);
//        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(2).getText(), false);
//        
//        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(5).getText(), false);
//        machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(6).getText(), false);
        //machine.lighter.theButtonz.setStatic(machine.lighter.theButtonz.allBTNs.get(7).getText(), false);
        
        //turn on flash 2hold/Hi 3hold/Lo buttons
//        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(3).getText(), true);
//        machine.lighter.theButtonz.setFlashing(machine.lighter.theButtonz.allBTNs.get(4).getText(), true);
        
        //turn on flash Hi and Lo lights
//        machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(0).getText(), true);
//        machine.lighter.thehilo.setOn(machine.lighter.thehilo.hilos.get(1).getText(), false);
        
        //getCurrent HiLo No.
        int currentHiLo = machine.reels.getRHL().getSymbol(machine.reels.getRHL().getCurrentPOS());
        System.out.println("Feature: Current HiLo: "+currentHiLo);
        
        int prevHiLo = getHiloNumber();
        System.out.println("Feature: Previous HiLo: "+prevHiLo);
        //When Hi/Lo chosen record choice
        
        //. . . then spin hilo real
        //machine.lighter.thehiloReel.spinReelHilo(4);
        
        //Compare current with current HiLo result and choice to determine win
    }
    
    /**
     * Random bonus  - add cash, add feature, etc
     */
    public static void randomBonus(){
    }
    
    /**
     * add features
     */
    public static void addFeatures(){
    }
    
    /**
     * add cash
     */
    public static void addCash(){
    }
        
    /**
     * add nudges
     */
    public static void addNudges(){
    }
    
    /**
     * collect nudges
     */
    public static String getCurrentFeature(){
        return currentFeat;
    }
    
    /**
     * collect feature
     */
    public static void collectFeature(){
    }
    
    /**
     * Random Feature
     */
    public static void randomFeature(){
    }
    
    /**
     * Skill game
     */
    public static void skillGame(){
    }

    public static int getHiloNumber() {
        return hiloNumber;
    }

    public static void setHiloNumber(int hilo) {
        hiloNumber = hilo;
    }
    
}
