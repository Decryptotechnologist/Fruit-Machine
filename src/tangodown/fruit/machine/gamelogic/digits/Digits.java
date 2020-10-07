/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic.digits;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import tangodown.fruit.machine.gamelogic.Game;

/**
 *
 * @author Ghomez
 */
public class Digits {

    /**Attributes*/
    
    /**creditDigits List variable of Digits object */
    private List<JButton> creditDigits = new ArrayList<>();
    
    /**crackpotDigits List variable of Digits object */
    private List<JButton> crackpotDigits = new ArrayList<>();
    
    /**bankDigits List variable of Digits object */
    private List<JButton> bankDigits = new ArrayList<>();
    
    /**bankTexts List variable of Digits object */
    private List<JButton> bankTexts = new ArrayList<>();
    
    /**theBank BankDigits variable of Digits object */
    public BankDigits theBank;
    
    /**theBankText BankText variable of Digits object */
    public BankText theBankText;
    
    /**theCredit CreditDigits variable of Digits object */
    public CreditDigits theCredit;
    
    /**theCrackpot CrackpotDigits variable of Digits object */
    public CrackpotDigits theCrackpot;
    
    /**digitsPanel JPanel variable of Digits object */
    public JPanel digitsPanel;
    
    
    /**Constructor*/
    
    /**
     * Digits Constructor
     * 
     * @param machine
     * @param bank
     * @param credit
     * @param crackpot
     */
    public Digits(){//Machine machine, int bank, int credit, int crackpot) { 
        //this.digits = new ArrayList<>();
                
        digitsPanel = new JPanel();
        
        digitsPanel.setSize(1280, 720);
        digitsPanel.setOpaque(false);
        digitsPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        
        //initialize all digit classes
        theBank = new BankDigits();//new BankDigits(bank);
        theBankText = new BankText();
        theCredit = new CreditDigits();//new CreditDigits(credit, machine);
        theCrackpot = new CrackpotDigits();//new CrackpotDigits(crackpot, machine);

        initDefaultDigits();
    }
    
    
    /**Public Protocol*/
    
    /**
     * initDefaultDigits()
     * 
     * Initiates all the Digits light images
     */
    private void initDefaultDigits(){

        //populate all digit lists
        creditDigits = theCredit.getAllCredits();
        
//        turnCreditDigitOn(creditDigits.get(10).getText());
        theCredit.defaultDigits();
        
        crackpotDigits = theCrackpot.getAllCrackpotDigits();
        
//        turnCrackpotDigitOn(crackpotDigits.get(0).getText());
//        turnCrackpotDigitOn(crackpotDigits.get(10).getText());
        theCrackpot.defaultDigits();
        
        bankDigits = theBank.getAllBankDigits();
        
//        turnBankDigitOn(bankDigits.get(10).getText());
//        turnBankDigitOn(bankDigits.get(20).getText());
//        turnBankDigitOn(bankDigits.get(30).getText());
//        turnBankDigitOn(bankDigits.get(40).getText());
//        turnBankDigitOn(bankDigits.get(41).getText());
        theBank.defaultDigits();
        
        bankTexts = theBankText.getAllBankText();
        
//        theBankText.setText(0);
//        turnBankTextOn(bankTexts.get(7).getText());
        theBankText.defaultDigits();
        
        
        digitsPanel.add(theCredit.Creditz, BorderLayout.CENTER);
        digitsPanel.add(theCrackpot.Crackpotz, BorderLayout.CENTER);
        digitsPanel.add(theBank.Bankz, BorderLayout.CENTER);
        digitsPanel.add(theBankText.Banktxtz, BorderLayout.CENTER);
        
    }
    
    
    /**
     * render()
     * 
     * @param g
     */
    public void render(Graphics2D g){
        //digitsPanel.repaint();
    }
    
    
    /**
     * getCrackpotDigitOn()
     * 
     * @param name
     * 
     * @return result - returns result of CrackpotDigit images/JButtons on
     */
    private boolean getCrackpotDigitOn(String name) {
        
        boolean result = false;
        
        for(JButton cpd : crackpotDigits){
            if(name.equals(cpd.getText())){
                result = theCrackpot.getOn(name);
            }   
        }
        
        return result;
    }

    
    /**
     * turnCrackpotDigitOn()
     * 
     * @param name
     */
    private void turnCrackpotDigitOn(String name) {
        theCrackpot.setOn(name, true);
    }
    
    
    /**
     * turnCrackpotDigitOff()
     * 
     * @param name
     */
    private void turnCrackpotDigitOff(String name) {
        theCrackpot.setOn(name, false);
    }
    
    
    /**
     * turnBankDigitOn()
     * 
     * @param name
     * 
     * sets BankDigit images/JButtons on
     */
    public void turnBankDigitOn(String name) {
        theBank.setOn(name, true);
    }
    
    
    /**
     * turnBankDigitOff()
     * 
     * @param name
     * 
     * sets BankDigit images/JButtons off
     */
    public void turnBankDigitOff(String name) {
        theBank.setOn(name, false);
    }
    
    
    /**
     * getBankDigitOn()
     * 
     * @param name
     * 
     * @return result - returns result of BankDigit images/JButtons on
     */
    private boolean getBankDigitOn(String name){
        
        boolean result = false;
        
        for(JButton bd : bankDigits){
            if(name.equals(bd.getText())){
                result = theBank.getOn(name);
            }   
        }
        
        return result;
    }
    
    
    /**
     * turnBankTextOn()
     * 
     * @param name
     * 
     * sets BankText images/JButtons on
     */
    public void turnBankTextOn(String name) {
        theBankText.setOn(name, true);
    }
    
    
    /**
     * turnBankTextOff()
     * 
     * @param name
     * 
     * sets BankText images/JButtons off
     */
    public void turnBankTextOff(String name) {
        theBankText.setOn(name, false);
    }
    
    
    /**
     * getBankTextOn()
     * 
     * @param name
     * 
     * @return result - returns result of BankText images/JButtons on
     */
    private boolean getBankTextOn(String name){
        
        boolean result = false;
        
        for(JButton bd : bankTexts){
            if(name.equals(bd.getText())){
                result = theBankText.getOn(name);
            }   
        }
        
        return result;
    }
    
    
    /**
     * getCreditDigitOn()
     * 
     * @param name
     * 
     * @return result - returns result of CreditDigit images/JButtons on
     */
    private boolean getCreditDigitOn(String name) {
        
        boolean result = false;
        
        for(JButton cd : creditDigits){
            
            if(name.equals(cd.getText())){
                result = theCredit.getOn(name);
            }   
            
        }
        
        return result;
    }

    
    /**
     * turnCreditDigitOn()
     * 
     * @param name
     * 
     * sets CreditDigit images/JButtons on
     */
    public void turnCreditDigitOn(String name) {
        theCredit.setOn(name, true);
    }
    
    
    /**
     * turnCreditDigitOff()
     * 
     * @param name
     * 
     * sets CreditDigit images/JButtons off
     */
    public void turnCreditDigitOff(String name) {
        theCredit.setOn(name, false);
    }

    
    /**
     * tick()
     * 
     */
//    public void tick() {
//    }

    public void gambleBankTextDigitsAB(String gambleType) {
        if(gambleType.equals("Cash")){
            long currentTime = System.currentTimeMillis();
            if((currentTime / 10) % 2 == 0){
                turnBankTextOff(theBankText.allbanktxts.get(8).getText());
                turnBankTextOn(theBankText.allbanktxts.get(10).getText());
            }else{
                turnBankTextOn(theBankText.allbanktxts.get(8).getText());
                turnBankTextOff(theBankText.allbanktxts.get(10).getText());
            }
        }
        if(gambleType.equals("Nudges")){
            long currentTime = System.currentTimeMillis();
            if((currentTime / 10) % 2 == 0){
                turnBankTextOff(theBankText.allbanktxts.get(8).getText());
                turnBankTextOn(theBankText.allbanktxts.get(11).getText());
            }else{
                turnBankTextOn(theBankText.allbanktxts.get(8).getText());
                turnBankTextOff(theBankText.allbanktxts.get(11).getText());
            }
        }
    }

    public void gambleBankTextDigitsAB(String cash, String nudges) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clearBank() {
        theBank.clearBankDigits();
    }

    public void setBank(int bankBalance) {
        theBank.setBank(bankBalance);
    }
    
    public void clearBankText() {
        theBankText.clearBankText();
    }

    public void setBankText(int txt) {
        theBankText.setText(txt);
    }
    
    public void clearCrackpot() {
        theCrackpot.clearCrackpotDigits();
    }

    public void setCrackpot(int crackpotBalance) {
        theCrackpot.setCrackpot(crackpotBalance);
    }
    
    public void clearCredits() {
        theCredit.clearCreditDigits();
    }

    public void setCredits(int creditBalance) {
        theCredit.setCredits(creditBalance);
    }
    
    
    void on() {
        System.out.println("Turning digit On: "+this.getName());
    }

    void off() {
        System.out.println("Turning digit Off: "+this.getName());
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
