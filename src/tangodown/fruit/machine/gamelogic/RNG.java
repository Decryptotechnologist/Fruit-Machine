/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Ghomez
 */
public final class RNG{
    
    /**Attributes*/
    
    /**random of RNG object */
    public static Random random;
    
    /**random1 of RNG object */
    private static Random random1;
    
    /**result of RNG object */
    private static int result;
    
    /**result1 of RNG object */
    private static int result1;
    
    /**result2 of RNG object */
    private static int result2;
    
    /**result3 of RNG object */
    private static int result3;
    
    /**result4 of RNG object */
    private static int result4;
    
    /**resultR of RNG object */
    private static int resultR;
    
    /**spinResult of RNG object */
    private static int spinResult;
    
    /**start of RNG object */
    public static boolean start = false;
    
    /**reel1result of RNG object */
    public int reel1result;
    
    /**reel2result of RNG object */
    public int reel2result;
    
    /**reel3result of RNG object */
    public int reel3result;
    
    /**reelhiloresult of RNG object */
    public int reelhiloresult;
    
    /**rouletteresult of RNG object */
    public int rouletteresult;
    
    /**holdOn of RNG object */
    private boolean holdOn;
    
    /**nudgeOn of RNG object */
    private boolean nudgeOn;
    
    /**gambleNudgeOn of RNG object */
    private boolean gambleNudgeOn;
    
    /**nudgeresult of RNG object */
    private int nudgeresult;
    private final Runnable spinRNG;
    private final ExecutorService spinRNGPool = Executors.newFixedThreadPool(1);
    
    
    /**Constructor*/
    
    /**
     * RNG Constructor
     * 
     * @param machine
     */    
    public RNG(Machine machine){
       String newRNG = "New RNG created at: ";
       System.out.println(newRNG);
       
       spinRNG = new Runnable(){
            @Override
            public void run(){
                //While running Generate Random Result (1000 x sec [or near as pos])
                genRan();
                
                genResults();

                //generate Hold? || generate Nudges?
                if(!start && machine.getCredits() > 0 && machine.getCurrentCashWin() == 0 && !machine.letEmSpin){
                    if(random.nextInt(300000) == 2){
                        holdOn = true;

                    } else if(random.nextInt(4000) == 2){
                        nudgeOn = true;
                        nudgeresult = random.nextInt(8)+1;

                        //Generate Gamble Nudge
                        if(random.nextInt(30) == 2){
                            gambleNudgeOn = true;
                        }
                    }
                }

                //When start button pressed store Random result to variable
                if(start){

                    spinResult = result;
                    System.out.println("RNG: Lotto result : "+result);

                    if(Game.getMachine().reels.the1stReel.isGap(result1)){
                        result1 += 1;
                    }

                    if(Game.getMachine().reels.the2ndReel.isGap(result2)){
                        result2 += 1;
                    }

                    if(Game.getMachine().reels.the3rdReel.isGap(result3)){
                        result3 += 1;
                    }

                    if(Game.getMachine().lighter.thehiloReel.isGap(result4)){
                        result4 += 1;
                    }

                    if(machine.getWinSpinOn()){
                        reel1result = machine.reels.getReel1WinSpin();
                        reel2result = machine.reels.getReel2WinSpin();
                        reel3result = machine.reels.getReel3WinSpin();
                        reelhiloresult = result4;
                        rouletteresult = resultR;
                    } else {
                        reel1result = result1;
                        reel2result = result2;
                        reel3result = result3;
                        reelhiloresult = result4;
                        rouletteresult = resultR;//-6;
                    }
//                    if(rouletteresult <= 0){
//                        rouletteresult = 0;
//                    }

                    System.out.println("RNG: Reel1 result POS: "+reel1result);
                    System.out.println("RNG: Reel2 result POS: "+reel2result);
                    System.out.println("RNG: Reel3 result POS: "+reel3result);
                    System.out.println("RNG: ReelHilo result POS: "+reelhiloresult);
                    System.out.println("RNG: Roulette result POS: "+rouletteresult);
                    start = false;
                } 
            }

           

        };
       
    }
    
    
    /**Public Protocol*/


    private void genRan() {
       //Generate Random Seed
        random = new Random(System.currentTimeMillis());//new seed
        random1 = new Random(System.currentTimeMillis());//new seed
   }
    
   private void genResults() {
       //While running Generate Random Result (1000 x sec [or near as pos])
        //Random random = new Random(System.currentTimeMillis());//new seed
        result = random.nextInt(4097)+1;

        result1 = random1.nextInt(32);
        result2 = random1.nextInt(32);
        result3 = random1.nextInt(32);
        result4 = random1.nextInt(24);
        resultR = random1.nextInt(17);
   } 
    
    /**
     * getSpinResult()
     * 
     * @return spinResult
     */
    public int getSpinResult() {
        return spinResult;
    }

    
    /**
     * rollEm()
     * 
     */
    public void rollEm() {        
        spinRNGPool.execute(spinRNG);
    }



    /**
     * getHoldOn()
     * 
     * @return holdOn
     */
    public boolean getHoldOn() {
        return holdOn;
    }
    
    
    /**
     * getNudgeOn()
     * 
     * @return nudgeOn
     */
    public boolean getNudgeOn() {
        return nudgeOn;
    }
    
    
    /**
     * getGambleNudgeOn()
     * 
     * @return gambleNudgeOn
     */
    public boolean getGambleNudgeOn() {
        return gambleNudgeOn;
    }
    
    
    /**
     * getNudgeresult()
     * 
     * @return nudgeresult
     */
    public int getNudgeresult() {
        return nudgeresult;
    }
    
    
    /**
     * getReel1result()
     * 
     * @return reel1result
     */
    public int getReel1result() {
        if(reel1result == 0){
            reel1result += Machine.getR1().getAllReel1().size();
        }
        return reel1result;
    }

    
    /**
     * getReel2result()
     * 
     * @return reel2result
     */
    public int getReel2result() {
        if(reel2result == 0){
            reel2result += Machine.getR2().getAllReel2().size();
        }
        return reel2result;
    }

    
    /**
     * getReel3result()
     * 
     * @return reel3result
     */
    public int getReel3result() {
        if(reel3result == 0){
            reel3result += Machine.getR3().getAllReel3().size();
        }
        return reel3result;
    }

    
    /**
     * getReelhiloresult()
     * 
     * @return reelhiloresult
     */
    public int getReelhiloresult() {
        return reelhiloresult;
    }
    
    
    /**
     * getRouletteresult()
     * 
     * @return rouletteresult
     */
    public int getRouletteresult() {
        return rouletteresult;
    }
    
}
