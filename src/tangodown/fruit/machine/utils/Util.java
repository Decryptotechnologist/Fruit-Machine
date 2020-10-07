/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.utils;

/**
 *
 * @author Ghomez
 */
public class Util {
    
    private static final String OS = System.getProperty("os.name").toUpperCase();
    private static final String OSARC = System.getProperty("os.arch").toUpperCase();
    private static final String OSVER = System.getProperty("os.version").toUpperCase();
    private static final String ODIR = System.getProperty("user.dir").toUpperCase();
    private static final String ONAM = System.getProperty("user.name").toUpperCase();
    private static final String HDIR = System.getProperty("user.home").toUpperCase();

    public static String getOSARC() {
        return OSARC;
    }

    public static String getOSVER() {
        return OSVER;
    }

    public static String getUserNAME() {
        return ONAM;
    }

    public static String getHomeDIR() {
        return HDIR;
    }
    
    
    
    public static String getOSName(){
        return OS;
    }
    
    public static boolean isWindows(){
        return OS.contains("WIN");
    }
    
    public static boolean isMac(){
        return OS.contains("MAC");
    }
    
    public static boolean isUnix(){
        return OS.contains("NIX") || OS.contains("NUX") || OS.contains("AIX");
    }

    public static String getDIR() {
        return ODIR;
    }
    
}
