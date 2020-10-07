/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.reels;

import tangodown.fruit.machine.gamelogic.CommandController;
import tangodown.fruit.machine.gamelogic.Machine;

/**
 *
 * @author Ghomez
 */
public class ReelsControls implements CommandController {
    
    Reels reels;
    
    public static final String ALL_REELS_DEFAULT = "ALL_REELS_DEFAULT";
    public static final String HOLD_ON = "HOLD_ON";
    public static final String HOLD_OFF = "HOLD_OFF";
    public static final String HOLD_CANCEL = "HOLD_CANCEL";
    public static final String SUPER_HOLD_ON = "SUPER_HOLD_ON";
    public static final String SUPER_HOLD_OFF = "SUPER_HOLD_OFF";
    public static final String SUPER_HOLD_CANCEL = "SUPER_HOLD_CANCEL";
    public static final String NUDGE_ON = "NUDGE_ON";
    public static final String NUDGE_OFF = "NUDGE_OFF";
    public static final String NUDGE_CANCEL = "NUDGE_CANCEL";
    public static final String REELS_FORWARD_ON = "REELS_FORWARD_ON";
    public static final String REELS_REVERSE_ON = "REELS_REVERSE_ON";
    public static final String REELS_SKILLSHOT = "REELS_SKILLSHOT";
    public static final String REELS_SKILLSHOT_STOP = "REELS_SKILLSHOT_STOP";
    public static final String REELS_RANDOM_ON = "REELS_RANDOM_ON";
    public static final String REELS_RANDOM_OFF = "REELS_RANDOM_OFF";
    
    public static final String REELS_WINSPIN_CHERRIES = "REELS_WINSPIN_CHERRIES";
    public static final String REELS_WINSPIN_MIXED7S = "REELS_WINSPIN_MIXED7S";
    public static final String REELS_WINSPIN_GREEN_BARS = "REELS_WINSPIN_GREEN_BARS";
    public static final String REELS_WINSPIN_RED_BARS = "REELS_WINSPIN_RED_BARS";
    public static final String REELS_WINSPIN_GOLD_BARS = "REELS_WINSPIN_GOLD_BARS";
    public static final String REELS_WINSPIN_BLUE7S = "REELS_WINSPIN_BLUE7S";
    public static final String REELS_WINSPIN_RED7S = "REELS_WINSPIN_RED7S";
    public static final String REELS_WINSPIN_GOLD7S = "REELS_WINSPIN_GOLD7S";
    public static final String REELS_WINSPIN_GOLD_BELLS = "REELS_WINSPIN_GOLD_BELLS";
    
    
    public ReelsControls(Reels reels) {
        this.reels = reels;
    }
    

    @Override
    public void execute(String command) {
        switch(command){
            case ALL_REELS_DEFAULT:
                System.out.println("DEFAULT REELS CALLED!");
                reels.defaultReels();
                break;
            case HOLD_ON:
                reels.setHoldOn(true);
                break;
            case HOLD_OFF:
                reels.setHoldOn(false);
                break;
            case HOLD_CANCEL:
                reels.cancelHolds();
                break;
            case SUPER_HOLD_ON:
                reels.setSuperHoldOn(true);
                break;
            case SUPER_HOLD_OFF:
                reels.setSuperHoldOn(false);
                break;
            case SUPER_HOLD_CANCEL:
                reels.cancelHolds();
                break;
            case NUDGE_ON:
                reels.setNudgeOn(true);
                break;
            case NUDGE_OFF:
                reels.setNudgeOn(false);
                break;
            case NUDGE_CANCEL:
                System.out.println("Not Yet Implemented . . .");
                //reels.canceNudges();
                break;
            case REELS_FORWARD_ON:
                reels.setDirection(0);
                break;
            case REELS_REVERSE_ON:
                reels.setDirection(1);
                break;
            case REELS_WINSPIN_CHERRIES:
                Machine.spinAllReels();
                reels.winSpin("CHERRIES");
                break;
            case REELS_WINSPIN_MIXED7S:
                reels.winSpin("MIXED7S");
                break;
            case REELS_WINSPIN_GREEN_BARS:
                reels.winSpin("GREEN_BARS");
                break;
            case REELS_WINSPIN_RED_BARS:
                reels.winSpin("RED_BARS");
                break;
            case REELS_WINSPIN_GOLD_BARS:
                reels.winSpin("GOLD_BARS");
                break;
            case REELS_WINSPIN_BLUE7S:
                reels.winSpin("BLUE7S");
                break;
            case REELS_WINSPIN_RED7S:
                reels.winSpin("RED7S");
                break;
            case REELS_WINSPIN_GOLD7S:
                reels.winSpin("GOLD7S");
                break;    
            case REELS_WINSPIN_GOLD_BELLS:
                reels.winSpin("GOLD_BELLS");
                break;
//            case REELS_SKILLSHOT:
//                reels.skillShot();
//                break;
//            case REELS_SKILLSHOT_STOP:
//                reels.skillShotStop();
//                break;
//            case REELS_RANDOM_ON:
//                reels.randomOn();
//                break;
//            case REELS_RANDOM_OFF:
//                reels.randomOff();
//                break;
//            default:
//                System.out.println("Sorry no abla - Cash Light operation - vor comma du fro!!!");
        }
    }

    @Override
    public boolean canHandle(String command) {
        if(command.equals(ALL_REELS_DEFAULT) || 
                command.equals(HOLD_ON) || 
                command.equals(HOLD_OFF) || 
                command.equals(HOLD_CANCEL) || 
                command.equals(SUPER_HOLD_ON) || 
                command.equals(SUPER_HOLD_OFF) || 
                command.equals(SUPER_HOLD_CANCEL) || 
                command.equals(NUDGE_ON) || 
                command.equals(NUDGE_OFF) || 
                command.equals(NUDGE_CANCEL) || 
                command.equals(REELS_FORWARD_ON) || 
                command.equals(REELS_REVERSE_ON) || 
                command.equals(REELS_WINSPIN_CHERRIES) || 
                command.equals(REELS_WINSPIN_MIXED7S) || 
                command.equals(REELS_WINSPIN_GREEN_BARS) || 
                command.equals(REELS_WINSPIN_RED_BARS) || 
                command.equals(REELS_WINSPIN_GOLD_BARS) || 
                command.equals(REELS_WINSPIN_BLUE7S) || 
                command.equals(REELS_WINSPIN_RED7S) || 
                command.equals(REELS_WINSPIN_GOLD7S) || 
                command.equals(REELS_WINSPIN_GOLD_BELLS) || 
                command.equals(REELS_SKILLSHOT_STOP) || 
                command.equals(REELS_RANDOM_ON) || 
                command.equals(REELS_RANDOM_OFF)){
            return true;
        }
        return false;
    }
    
}
