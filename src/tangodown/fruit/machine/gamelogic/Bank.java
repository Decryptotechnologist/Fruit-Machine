/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.gamelogic;

/**
 * @author Ghomez
 */
public class Bank {
    
    /**Attributes*/
    
    /**bankBalance of Bank object */
    private int bankBalance;
    
    /**creditBalance of Bank object */
    private int creditBalance;
    
    /**crackpotBalance of Bank object */
    private int crackpotBalance;
    
    

    
    /**Constructor*/
    
    /**
     * Bank Constructor
     * 
     * @param bank
     * @param credit
     * @param crackpot
     */
    public Bank(int bank, int credit, int crackpot){
        
        bankBalance = bank;//0;
        creditBalance = credit;//0;
        crackpotBalance = crackpot;//0;
        
        String newBankC = "New Bank created at: ";
        System.out.println(newBankC);
        String bankBal = "Bank Balance: "+bankBalance+" at: ";
        System.out.println(bankBal);
        String credBal = "Credit Balance : "+creditBalance+" at: ";
        System.out.println(credBal);
        String crackBal = "Crackpot Balance  : "+crackpotBalance+" at: ";
        System.out.println(crackBal);
    }
    
    /**Public Protocol*/

    
    /**
     * increase Bank
     * 
     * @param newBalance
     */       
    public void increaseBank(int newBalance){
        for(int i = 0; i < newBalance; i++){
            bankBalance += 1;
            
            Machine.setBank(bankBalance);
        }
    }
    
    
    /**
     * decrease Bank
     * 
     * @param newBalance
     */
    public void decreaseBank(int newBalance){
        for(int i = 0; i > newBalance; i++){
            bankBalance -= 1;
            
            Machine.setBank(bankBalance);
        }
    }
    
    
    /**
     * setBank()
     * 
     * @param newBalance
     */
    public void setBank(int newBalance){
       bankBalance = newBalance;
       
       //set credits to creditBalance
       //Machine.setBank(bankBalance);
    }
    
    
    /**
     * getBank()
     * 
     * @return bankBalance
     */
    public int getBank(){
        return bankBalance;
    }

    
    //Credits
    /**
     * increaseCredits()
     * 
     * @param newCreditBalance
     */
    public void increaseCredits(int newCreditBalance){
        for(int i = 0; i < newCreditBalance; i++){
            creditBalance += 1;
            
            //set credits to creditBalance
            setCredits(creditBalance);
        }
    }
    
    
    /**
     * decreaseCredits()
     * 
     * @param newCreditBalance
     */
    public void decreaseCredits(int newCreditBalance){
        for(int i = 0; i < newCreditBalance; i++){
            creditBalance -= 1;
            
            //set credits to creditBalance
            setCredits(creditBalance);
        }
    }
    
    
    /**
     * setCredits()
     * 
     * @param newCreditBalance
     */
    public void setCredits(int newCreditBalance){
       creditBalance = newCreditBalance;
       
       //set credits to creditBalance
       Machine.setCredits(creditBalance);
    }
    
    
    /**
     * getCredits()
     * 
     * @return creditBalance
     */
    public int getCredits(){
        return creditBalance;
    }
    

    //Crackpot
    /**
     * increaseCrackpot(newCPBalance)
     * 
     * @param newCPBalance
     */
    public void increaseCrackpot(int newCPBalance){
        System.out.println("CrackpotDigits Increase: "+newCPBalance);
        for(int i = 0; i < newCPBalance; i++){
            crackpotBalance += 1;
            
            //set crackpot to crackpotBalance
            setCrackpot(crackpotBalance);
        }
    }
    
    
    /**
     * decreaseCrackpot(newCPBalance)
     * 
     * @param newCPBalance
     */
    public void decreaseCrackpot(int newCPBalance){
        System.out.println("CrackpotDigits Decrease: "+newCPBalance);
        for(int i = 0; i > newCPBalance; i++){
            crackpotBalance -= 1;
            
            //set crackpot to crackpotBalance
            setCrackpot(crackpotBalance);
        }
    }
    
    
    /**
     * setCrackpot()
     * 
     * @param newCPBalance
     */
    public void setCrackpot(int newCPBalance){
       crackpotBalance = newCPBalance;
       
       //set crackpot to crackpotBalance
       Machine.machine.setCrackpot(crackpotBalance);
    }
    
    
    /**
     * getCrackpot()
     * 
     * @return crackpotBalance
     */
    public int getCrackpot(){
        return crackpotBalance;
    }
    
}
