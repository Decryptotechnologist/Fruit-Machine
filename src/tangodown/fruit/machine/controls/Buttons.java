/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.controls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tangodown.fruit.machine.audio.Sound;
import tangodown.fruit.machine.gamelogic.*;
import tangodown.fruit.machine.graphics.Display;
import tangodown.fruit.machine.graphics.Texture;

/**
 *
 * @author Ghomez
 */
public class Buttons {
    
    private static boolean startBtnOn;
    private static boolean collectBtnOn;
    private static boolean hold1BtnOn;
    private static boolean hold2BtnOn;
    private static boolean hold3BtnOn;
    private static boolean cancelBtnOn;
    private static boolean exchangeBtnOn;
    private static boolean insertCoinBtnOn;
    
    /**Attributes*/
    
    /**Button width variable of UIButtons object */
    public int btnWidth = 124;
    
    /**Button height variable of UIButtons object */
    public int btnHeight = 104;
    
    /**Start button variables of UIButtons object */ 
    public JButton start;
    private Rectangle rstart;
    public int startBtnX = 674, startBtnY = 595;
    private BufferedImage startOnBtnA, startOffBtnA, startOnBtnB, startOffBtnB;
    private boolean startEntered, startBtnStaticOn, startBtnFlashOn, startBtnSelectedOn;
    
    /**Collect button variables of UIButtons object */ 
    public JButton collect;
    private Rectangle rcollect;
    public int collectBtnX = 572, collectBtnY = 595;
    private BufferedImage collectOnBtnA, collectOffBtnA, collectOnBtnB, collectOffBtnB;
    private boolean collectEntered, collectBtnStaticOn, collectBtnFlashOn, collectBtnSelectedOn;//, collectExited;
    
    /**HoldReel1 button variables of UIButtons object */ 
    public JButton holdReel1;
    private Rectangle rholdReel1;
    public int holdReel1BtnX = 464, holdReel1BtnY = 595;
    private BufferedImage holdReel1OnBtnA, holdReel1OffBtnA, holdReel1OnBtnB, holdReel1OffBtnB;
    public boolean hold1Entered, hold1BtnStaticOn, hold1BtnFlashOn, hold1BtnSelectedOn;//, hold1Exited;
    
    /**HoldReel2 button variables of UIButtons object */ 
    public JButton holdReel2;
    private Rectangle rholdReel2;
    public int holdReel2BtnX = 324, holdReel2BtnY = 595;
    private BufferedImage holdReel2OnBtnA, holdReel2OffBtnA, holdReel2OnBtnB, holdReel2OffBtnB;
    public boolean hold2Entered, hold2BtnStaticOn, hold2BtnFlashOn, hold2BtnSelectedOn;//, hold2Exited;
    
    /**HoldReel3 button variables of UIButtons object */ 
    public JButton holdReel3;
    private Rectangle rholdReel3;
    public int holdReel3BtnX = 165, holdReel3BtnY = 595;
    private BufferedImage holdReel3OnBtnA, holdReel3OffBtnA, holdReel3OnBtnB, holdReel3OffBtnB;
    public boolean hold3Entered, hold3BtnStaticOn, hold3BtnFlashOn, hold3BtnSelectedOn;//, hold3Exited;
    
    /**Cancel button variables of UIButtons object */ 
    public JButton cancel;
    private Rectangle rcancel;
    public int cancelBtnX = 30, cancelBtnY = 595;
    private BufferedImage cancelOnBtnA, cancelOffBtnA, cancelOnBtnB, cancelOffBtnB;
    private boolean cancelEntered, cancelBtnStaticOn, cancelBtnFlashOn, cancelBtnSelectedOn;//, cancelExited;
    
    /**Exchange button variables of UIButtons object */ 
    public JButton exchange;
    private Rectangle rexchange;
    public int exchangeBtnX = 576, exchangeBtnY = 358;
    private BufferedImage exchangeOnBtnA, exchangeOnBtnB, exchangeOffBtnA, exchangeOffBtnB;
    private boolean exchangeEntered, exchangeBtnStaticOn, exchangeBtnFlashOn, exchangeBtnSelectedOn;//, exchangeExited;

    /**Insert Coin button variables of UIButtons object */ 
    public JButton insertCoin;
    private Rectangle rinsertCoin;
    public int insertCoinBtnX = 520, insertCoinBtnY = -8;
    private BufferedImage insertCoinOnBtnA, insertCoinOnBtnB, insertCoinOffBtnA, insertCoinOffBtnB;
    private boolean insertCoinEntered, insertCoinBtnStaticOn, insertCoinBtnFlashOn, insertCoinBtnSelectedOn;//, exchangeExited;
    
    
    
    /**Links*/
    
    /**Buttonz variables of UIButtons object */
    public JPanel Buttonz;
    
    /**allBTNs variables of UIButtons object */
    public List<JButton> allBTNs;
    
    /**ButtonzPanel variables of UIButtons object */
    public JPanel ButtonzPanel = new JPanel();
    
    /**gp variables of UIButtons object */
    private GradientPaint gp;
    
    /**buttons variables of UIButtons object */
    List<JButton> buttons = new ArrayList<>();
    
    List<JButton> allBTNsReverse;
    private Runnable skillButtonsForward;
    private JButton currentSkillButton;
    private ExecutorService skillButtonsForwardPool;
    private Runnable skillButtonsReverse;
    private ExecutorService skillButtonsReversePool;
    private ScheduledExecutorService excecutorService_SkillButtons = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_RandomButtonsOn;
    private ScheduledExecutorService excecutorService_SkillButtonsForward = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService excecutorService_SkillButtonsReverse = Executors.newSingleThreadScheduledExecutor();
    
    /**Constructor*/
    
    
    
    /**
     * Buttons()
     * 
     */
    public Buttons(){
        allBTNs = new ArrayList<>();
        init();
    }

    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     * Initiates all the Buttons images/JButtons
     *
     */
    private void init() {
            
            startOnBtnA = new Texture("/Buttons/fruit-machine-sprite-startBTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-startBTNA1.png"));
            startOffBtnA = new Texture("/Buttons/fruit-machine-sprite-startBTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-startBTNA2.png"));
            startOnBtnB = new Texture("/Buttons/fruit-machine-sprite-startBTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-startBTNB2.png"));
            startOffBtnB = new Texture("/Buttons/fruit-machine-sprite-startBTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-startBTNB1.png"));
            
            collectOnBtnA = new Texture("/Buttons/fruit-machine-sprite-collectBTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-collectBTNA1.png"));
            collectOffBtnA = new Texture("/Buttons/fruit-machine-sprite-collectBTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-collectBTNA2.png"));
            collectOnBtnB = new Texture("/Buttons/fruit-machine-sprite-collectBTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-collectBTNB1.png"));
            collectOffBtnB = new Texture("/Buttons/fruit-machine-sprite-collectBTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-collectBTNB2.png"));
            
            holdReel1OnBtnA = new Texture("/Buttons/fruit-machine-sprite-hold1BTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold1BTNA1.png"));
            holdReel1OffBtnA = new Texture("/Buttons/fruit-machine-sprite-hold1BTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold1BTNA2.png"));
            holdReel1OnBtnB = new Texture("/Buttons/fruit-machine-sprite-hold1BTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold1BTNB2.png"));
            holdReel1OffBtnB = new Texture("/Buttons/fruit-machine-sprite-hold1BTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold1BTNB1.png"));
            
            holdReel2OnBtnA = new Texture("/Buttons/fruit-machine-sprite-hold2BTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold2BTNA2.png"));
            holdReel2OffBtnA = new Texture("/Buttons/fruit-machine-sprite-hold2BTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold2BTNA1.png"));
            holdReel2OnBtnB = new Texture("/Buttons/fruit-machine-sprite-hold2BTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold2BTNB1.png"));
            holdReel2OffBtnB = new Texture("/Buttons/fruit-machine-sprite-hold2BTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold2BTNB2.png"));
            
            holdReel3OnBtnA = new Texture("/Buttons/fruit-machine-sprite-hold3BTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold3BTNA1.png"));
            holdReel3OffBtnA = new Texture("/Buttons/fruit-machine-sprite-hold3BTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold3BTNA2.png"));
            holdReel3OnBtnB = new Texture("/Buttons/fruit-machine-sprite-hold3BTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold3BTNB2.png"));
            holdReel3OffBtnB = new Texture("/Buttons/fruit-machine-sprite-hold3BTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-hold3BTNB1.png"));
            
            exchangeOnBtnA = new Texture("/Buttons/fruit-machine-sprite-exchangeBTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-exchangeBTNA1.png"));
            exchangeOffBtnA = new Texture("/Buttons/fruit-machine-sprite-exchangeBTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-exchangeBTNA2.png"));
            exchangeOnBtnB = new Texture("/Buttons/fruit-machine-sprite-exchangeBTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-exchangeBTNB2.png"));
            exchangeOffBtnB = new Texture("/Buttons/fruit-machine-sprite-exchangeBTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-exchangeBTNB1.png"));
            
            cancelOnBtnA = new Texture("/Buttons/fruit-machine-sprite-cancelBTNA1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-cancelBTNA1.png"));
            cancelOffBtnA = new Texture("/Buttons/fruit-machine-sprite-cancelBTNA2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-cancelBTNA2.png"));
            cancelOnBtnB = new Texture("/Buttons/fruit-machine-sprite-cancelBTNB2").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-cancelBTNB2.png"));
            cancelOffBtnB = new Texture("/Buttons/fruit-machine-sprite-cancelBTNB1").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-cancelBTNB1.png"));
            
            insertCoinOnBtnA = new Texture("/Buttons/fruit-machine-sprite-insertCoinBTN").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-insertCoinBTN.png"));
            insertCoinOffBtnA = new Texture("/Buttons/fruit-machine-sprite-insertCoinBTNA").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-insertCoinBTNA.png"));
            insertCoinOnBtnB = new Texture("/Buttons/fruit-machine-sprite-insertCoinBTN").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-insertCoinBTN.png"));
            insertCoinOffBtnB = new Texture("/Buttons/fruit-machine-sprite-insertCoinBTNA").getImage();//ImageIO.read(getClass().getResource("/Buttons/fruit-machine-sprite-insertCoinBTNA.png"));
            
        ButtonzPanel.setSize(1280, 720);
        ButtonzPanel.setOpaque(false);
        ButtonzPanel.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
        ButtonzPanel.setVisible(true);
        ButtonzPanel.setLayout(null);

        drawButtons();

        Buttonz = new JPanel(){
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
                
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            render(g2d);
            
            Buttonz.setSize(1280, 720);
            Buttonz.setOpaque(false);
            Buttonz.setBounds(0, 0, Game.getGameWidth(), Game.getGameHeight());
            Buttonz.setLayout(null);
            Buttonz.add(ButtonzPanel);

        }};
        
        skillButtonsForward = new Runnable(){
            
            @Override
            public void run(){
                for(JButton btn : allBTNs){
                    if(excecutorService_SkillButtonsForward.isShutdown() || 
                            excecutorService_RandomButtonsOn.isShutdown() || 
                            Thread.currentThread().isInterrupted()){
                        try {
                            Thread.currentThread().join();
                        } catch (InterruptedException ex) {
                        }
                        break;
                    } else {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        setStatic(btn.getText(), true);
                        currentSkillButton = btn;
                    }
                }
                
            }
        };
        
        skillButtonsReverse = new Runnable(){
            
            @Override
            public void run(){
                for(JButton btn : allBTNsReverse){
                    currentSkillButton = btn;
                    
                    
                    if(excecutorService_SkillButtonsReverse.isShutdown() || 
                            excecutorService_RandomButtonsOn.isShutdown() || 
                            Thread.currentThread().isInterrupted()){
                        try {
                            Thread.currentThread().join();
                        } catch (InterruptedException ex) {
                        }
                        break;
                    } else {
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    setStatic(btn.getText(), false);
                }
                
            }
        };
         
    }

    
    /**
     * drawButtons()
     * 
     * Draws all the Buttons images/JButtons
     */
    private void drawButtons() {

        /**Buttons*/
        
        //Start Button
        start = new JButton("Start!");
        rstart = new Rectangle(startBtnX, startBtnY, btnWidth, btnHeight);
        start.setBounds(rstart);
        allBTNs.add(start);
        ButtonzPanel.add(start);

        //Collect Button
        collect = new JButton("Collect");
        rcollect = new Rectangle(collectBtnX, collectBtnY, btnWidth, btnHeight);
        collect.setBounds(rcollect);
        allBTNs.add(collect);
        ButtonzPanel.add(collect);

        //Hold1 Button
        holdReel1 = new JButton("HoldReel1");
        rholdReel1 = new Rectangle(holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight);
        holdReel1.setBounds(rholdReel1);
        allBTNs.add(holdReel1);
        ButtonzPanel.add(holdReel1);

        //Hold2 Button
        holdReel2 = new JButton("HoldReel2");
        rholdReel2 = new Rectangle(holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight);
        holdReel2.setBounds(rholdReel2);
        allBTNs.add(holdReel2);
        ButtonzPanel.add(holdReel2);
        
        //Hold3 Button
        holdReel3 = new JButton("HoldReel3");
        rholdReel3 = new Rectangle(holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight);
        holdReel3.setBounds(rholdReel3);
        allBTNs.add(holdReel3);
        ButtonzPanel.add(holdReel3);
        
        //Cancel Button
        cancel = new JButton("Cancel");
        rcancel = new Rectangle(cancelBtnX, cancelBtnY, btnWidth, btnHeight);
        cancel.setBounds(rcancel);
        allBTNs.add(cancel);
        ButtonzPanel.add(cancel);
        
        //Exchange Button
        exchange = new JButton("Exchange");
        rexchange = new Rectangle(exchangeBtnX, exchangeBtnY, 64, 64);
        exchange.setBounds(rexchange);
        allBTNs.add(exchange);
        ButtonzPanel.add(exchange);
        
        //Insert Coin Button
        insertCoin = new JButton("InsertCoin");
        rinsertCoin = new Rectangle(insertCoinBtnX, insertCoinBtnY, btnWidth/2, btnHeight/2);
        insertCoin.setBounds(rinsertCoin);
        allBTNs.add(insertCoin);
        ButtonzPanel.add(insertCoin);
        
        
        allBTNsReverse = new ArrayList<>(allBTNs);
        Collections.reverse(allBTNsReverse);
        /**Listeners*/
        
        //Button Panel Listener
        ButtonzPanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                startEntered = false;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
                ButtonzPanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ButtonzPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        //Start Button Listener
        start.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                startEntered = true;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
            
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            
        });
        
        start.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                startBtnMouseClicked(e);
            }
        });
        
        //Collect Button Listener
        collect.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                collectEntered = true;
                startEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
            
            @Override
            public void mouseClicked(MouseEvent e) {

            }
            
        });
        
        collect.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                collectBtnMouseClicked(e);
            }
        });
        
        //Hold1 Button Listener
        holdReel1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                hold1Entered = true;
                collectEntered = false;
                startEntered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        
        holdReel1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                hold1BtnMouseClicked(e);
            }
        });
        
        //Hold2 Button Listener
        holdReel2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                hold2Entered = true;
                collectEntered = false;
                hold1Entered = false;
                startEntered = false;
                hold3Entered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        holdReel2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                hold2BtnMouseClicked(e);
            }
        });
        
        //Hold3 Button Listener
        holdReel3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                hold3Entered = true;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                startEntered = false;
                cancelEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        holdReel3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                hold3BtnMouseClicked(e);
            }
        });
        
        //Cancel Button Listener
        cancel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                cancelEntered = true;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                startEntered = false;
                exchangeEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cancelBtnMouseClicked(e);
            }
        });
        
        //Exchange Button Listener
        exchange.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                exchangeEntered = true;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                startEntered = false;
                insertCoinEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        exchange.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exchangeBtnMouseClicked(e);
            }
        });
        
        //Insert Coin Button Listener
        insertCoin.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                insertCoinEntered = true;
                exchangeEntered = false;
                collectEntered = false;
                hold1Entered = false;
                hold2Entered = false;
                hold3Entered = false;
                cancelEntered = false;
                startEntered = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
        
        insertCoin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                insertCoinBtnMouseClicked(e);
            }
        });
        
    }
    
    
    /**
     * startBtnMouseClicked(ActionEvent e)
     * 
     */
    private void startBtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Start Clicked!");
        Sound.start.play();
        
        if(Display.game.machine.getGambleCashOn() || Display.game.machine.getGambleNudgeOn()){
            if(Display.game.machine.getGambleCashOn()){
                System.out.println("Buttons: Gamble Cash Clicked!");
                Display.game.machine.gambleCashClicked();
            } else if(Display.game.machine.getGambleNudgeOn()){
                System.out.println("Buttons: Gamble Nudge Clicked!");
                Display.game.machine.gambleNudgeClicked();
            }
        } else {
            Display.game.machine.decreaseCredits(1);
        
            startEntered = false;

            RNG.start = true;
            Display.game.machine.spinAllReels();
        }
        
    }
    
    
    /**
     * collectBtnMouseClicked(ActionEvent e)
     * 
     */
    private void collectBtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Collect Clicked!");
        
        if(Display.game.machine.getGambleCashOn()){
            System.out.println("Buttons: Collect Cash Winnings!");
            Display.game.machine.collectCashWinnings();
        }
        if(Display.game.machine.getGambleNudgeOn()){
            System.out.println("Buttons: Collect Nudge Winnings!");
            Display.game.machine.collectNudgeWinnings();
        }
        Sound.winGambleCash.play();
    }
    
    
    /**
     * hold1BtnMouseClicked(ActionEvent e)
     * 
     */
    private void hold1BtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Hold1 Clicked!");        
        Sound.hold.play();
        Display.game.machine.holdR1();
    }
    
    
    /**
     * hold2BtnMouseClicked(ActionEvent e)
     * 
     */
    private void hold2BtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Hold2 Clicked!");
        Sound.hold.play();
        Display.game.machine.holdR2();
    }
    
    
    /**
     * hold3BtnMouseClicked(ActionEvent e)
     * 
     */
    private void hold3BtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Hold3 Clicked!");
        Sound.hold.play();
        Display.game.machine.holdR3();
    }
    
    
    /**
     * cancelBtnMouseClicked(ActionEvent e)
     * 
     */
    private void cancelBtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Cancel Clicked!");
        Sound.cancel.play();
        Display.game.machine.CancelHolds();
    }
    
    
    /**
     * exchangeBtnMouseClicked(ActionEvent e)
     * 
     */
    private void exchangeBtnMouseClicked(ActionEvent e) {                                    
        System.out.println("Buttons: Exchange Clicked!");
        Machine.exchange4Feature();
        Sound.skillShot.play();
    }
    
    
    /**
     * insertCoinBtnMouseClicked(ActionEvent e)
     * 
     */
    private void insertCoinBtnMouseClicked(ActionEvent e) {
        System.out.println("Buttons: Insert Coin Clicked!");
        Sound.insertCoin.play();
        Display.game.machine.increaseCredits(1);
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * @param g
     */
    public void render(Graphics2D g){
        /**Start images*/
        if(startEntered){   

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.DARK_GRAY, 0, 740, Color.GREEN);
            g.setPaint (gp);

            g.fillRect(startBtnX+25, startBtnY+40, btnWidth-50, btnHeight-85);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(startOffBtnA, startBtnX, startBtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(startOffBtnB, startBtnX, startBtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();


            //draw btn border(mouse over)
            g.drawRect(startBtnX+20, startBtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(startBtnX+10, startBtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(startBtnX+15, startBtnY+25, btnWidth-35, btnHeight-50);

        } else {


            if(startBtnFlashOn){

                //draw btn flash off
                if((System.currentTimeMillis() / 250) % 2 == 0){
                    g.drawImage(startOnBtnA, startBtnX, startBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(startOnBtnB, startBtnX, startBtnY, btnWidth, btnHeight, null);
                }

            } else {

                if(startBtnStaticOn){
                    g.drawImage(startOnBtnB, startBtnX, startBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(startOffBtnB, startBtnX, startBtnY, btnWidth, btnHeight, null);
                }

            }
        }


        /**Collect images*/
        if(collectEntered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.BLACK, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(collectBtnX+25, collectBtnY+40, btnWidth-50, btnHeight-85);

            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(collectOffBtnA, collectBtnX, collectBtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(collectOffBtnB, collectBtnX, collectBtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();


            //draw btn border(mouse over)
            g.setColor(Color.BLACK);
            g.drawRect(collectBtnX+20, collectBtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(collectBtnX+10, collectBtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(collectBtnX+15, collectBtnY+25, btnWidth-35, btnHeight-50);

        } else {

            if(collectBtnFlashOn){

                //draw btn flash off
                if((System.currentTimeMillis() / 250) % 2 == 0){
                    g.drawImage(collectOnBtnA, collectBtnX-3, collectBtnY-3, btnWidth+6, btnHeight+6, null);
                } else {
                    g.drawImage(collectOnBtnB, collectBtnX, collectBtnY, btnWidth, btnHeight, null);
                }

            } else {

                if(collectBtnStaticOn){
                    g.drawImage(collectOnBtnB, collectBtnX, collectBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(collectOffBtnB, collectBtnX, collectBtnY, btnWidth, btnHeight, null);
                }

            }
        }


        /**Hold1 images*/
        if(hold1Entered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.BLUE, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(holdReel1BtnX+25, holdReel1BtnY+40, btnWidth-50, btnHeight-85);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(holdReel1OffBtnA, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(holdReel1OffBtnB, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();


            //draw btn border(mouse over)
            g.setColor(Color.BLUE);
            g.drawRect(holdReel1BtnX+20, holdReel1BtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(holdReel1BtnX+10, holdReel1BtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(holdReel1BtnX+15, holdReel1BtnY+25, btnWidth-35, btnHeight-50);

        } else {

            if(hold1BtnFlashOn){
                if(Machine.rng.getNudgeOn()){

                    //draw btn flash off
                    if((System.currentTimeMillis() / 50) % 2 == 0){
                        g.drawImage(holdReel1OnBtnA, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel1OnBtnB, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                    }

                } else {

                    //draw btn flash off
                    if((System.currentTimeMillis() / 250) % 2 == 0){
                        g.drawImage(holdReel1OnBtnA, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel1OnBtnB, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                    }

                }
            } else {

                if(hold1BtnStaticOn){
                    g.drawImage(holdReel1OnBtnA, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(holdReel1OffBtnB, holdReel1BtnX, holdReel1BtnY, btnWidth, btnHeight, null);
                }

            }

        }


        /**Hold2 images*/
        if(hold2Entered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.BLUE, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(holdReel2BtnX+25, holdReel2BtnY+40, btnWidth-50, btnHeight-85);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(holdReel2OffBtnB, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(holdReel2OffBtnA, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();


            //draw btn border(mouse over)
            g.setColor(Color.BLUE);
            g.drawRect(holdReel2BtnX+20, holdReel2BtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(holdReel2BtnX+10, holdReel2BtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(holdReel2BtnX+15, holdReel2BtnY+25, btnWidth-35, btnHeight-50);

        } else {

            if(hold2BtnFlashOn){

                if(Machine.rng.getNudgeOn()){

                    //draw btn flash off
                    if((System.currentTimeMillis() / 50) % 2 == 0){
                        g.drawImage(holdReel2OnBtnA, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel2OnBtnB, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                    }

                } else {

                    //draw btn flash off
                    if((System.currentTimeMillis() / 250) % 2 == 0){
                        g.drawImage(holdReel2OnBtnA, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel2OnBtnB, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                    }   

                }
            } else {

                if(hold2BtnStaticOn){
                    g.drawImage(holdReel2OnBtnA, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(holdReel2OffBtnA, holdReel2BtnX, holdReel2BtnY, btnWidth, btnHeight, null);
                }
            }
        }


        /**Hold3 images*/
        if(hold3Entered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.BLUE, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(holdReel3BtnX+25, holdReel3BtnY+40, btnWidth-50, btnHeight-85);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(holdReel3OffBtnA, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(holdReel3OffBtnB, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();

            //draw btn border(mouse over)
            g.setColor(Color.BLUE);
            g.drawRect(holdReel3BtnX+20, holdReel3BtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(holdReel3BtnX+10, holdReel3BtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(holdReel3BtnX+15, holdReel3BtnY+25, btnWidth-35, btnHeight-50);

        } else {

            if(hold3BtnFlashOn){

                if(Machine.rng.getNudgeOn()){

                    //draw btn flash off
                    if((System.currentTimeMillis() / 50) % 2 == 0){
                        g.drawImage(holdReel3OnBtnA, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel3OnBtnB, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                    }

                } else {

                    //draw btn flash off
                    if((System.currentTimeMillis() / 250) % 2 == 0){
                        g.drawImage(holdReel3OnBtnA, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                    } else {
                        g.drawImage(holdReel3OnBtnB, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                    }

                }

            } else {

                if(hold3BtnStaticOn){
                    g.drawImage(holdReel3OnBtnA, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(holdReel3OffBtnB, holdReel3BtnX, holdReel3BtnY, btnWidth, btnHeight, null);
                }

            }
        }


        /**Cancel images*/
        if(cancelEntered){

            //draw btn selected/clicked
            gp = new GradientPaint (15, 15, Color.WHITE, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(cancelBtnX+25, cancelBtnY+40, btnWidth-50, btnHeight-85);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(cancelOffBtnA, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(cancelOffBtnB, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();


            //draw btn border
            g.setColor(Color.WHITE);
            g.drawRect(cancelBtnX+20, cancelBtnY+25, btnWidth-35, btnHeight-50);
            g.drawRect(cancelBtnX+10, cancelBtnY+25, btnWidth-20, btnHeight-50);
            g.drawRect(cancelBtnX+15, cancelBtnY+25, btnWidth-35, btnHeight-50);

        } else {

            if(cancelBtnFlashOn){

                //draw btn flash off
                if((System.currentTimeMillis() / 250) % 2 == 0){
                    g.drawImage(cancelOnBtnA, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(cancelOnBtnB, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
                }

            } else {

                if(cancelBtnStaticOn){
                    g.drawImage(cancelOnBtnA, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(cancelOffBtnB, cancelBtnX, cancelBtnY, btnWidth, btnHeight, null);
                }

            }
        }


        /**Exchange images*/
        if(exchangeEntered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.YELLOW, 0, 740, Color.WHITE);
            g.setPaint (gp);

            g.fillOval(exchangeBtnX+12, exchangeBtnY+15, btnWidth-125, btnHeight-128);

            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(exchangeOffBtnA, exchangeBtnX, exchangeBtnY, 64, 64, null);
            } else {
                g.drawImage(exchangeOffBtnB, exchangeBtnX, exchangeBtnY, 64, 64, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();


            //draw btn border(mouse over)
            g.setColor(Color.YELLOW);
            g.drawOval(exchangeBtnX+15, exchangeBtnY+13, btnWidth-92, btnHeight-67);                

        } else {

            if(exchangeBtnFlashOn){

                //draw btn flash off
                if((System.currentTimeMillis() / 250) % 2 == 0){
                    g.drawImage(exchangeOnBtnA, exchangeBtnX, exchangeBtnY, 64, 64, null);
                } else {
                    g.drawImage(exchangeOnBtnB, exchangeBtnX, exchangeBtnY, 64, 64, null);
                }

            } else {

                if(exchangeBtnStaticOn){
                    g.drawImage(exchangeOnBtnA, exchangeBtnX, exchangeBtnY, 64, 64, null);
                } else {
                    g.drawImage(exchangeOffBtnB, exchangeBtnX, exchangeBtnY, 64, 64, null);
                }

            }

        }


        /**Insert coin images*/
        if(insertCoinEntered){

            //draw btn selected/clicked
            gp = new GradientPaint (0, 15, Color.RED, 0, 740, Color.DARK_GRAY);
            g.setPaint (gp);

            g.fillRect(insertCoinBtnX+30, insertCoinBtnY+25, btnWidth-60, btnHeight-50);


            //draw btn flash on
            if((System.currentTimeMillis() / 450) % 2 == 0){
                g.drawImage(insertCoinOnBtnA, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
            } else {
                g.drawImage(insertCoinOffBtnB, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
            }

            //Sound.sound5.stop();
            //Sound.sound5.play();

            //draw btn border
            g.setColor(Color.RED);
            g.drawRect(insertCoinBtnX+30, insertCoinBtnY+25, btnWidth-56, btnHeight-50);
            g.drawRect(insertCoinBtnX+20, insertCoinBtnY+25, btnWidth-41, btnHeight-50);
            g.drawRect(insertCoinBtnX+25, insertCoinBtnY+25, btnWidth-56, btnHeight-50);

        } else {

            if(insertCoinBtnFlashOn){

                //draw btn flash off
                if((System.currentTimeMillis() / 250) % 2 == 0){
                    g.drawImage(insertCoinOnBtnA, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(insertCoinOnBtnB, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
                }

            } else {

                if(insertCoinBtnStaticOn){
                    g.drawImage(insertCoinOnBtnA, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
                } else {
                    g.drawImage(insertCoinOffBtnB, insertCoinBtnX, insertCoinBtnY, btnWidth, btnHeight, null);
                }

            }

        }

        g.dispose();
    }
    
    
    /**
     * getAllButtons()
     * 
     * @return allBTNs - returns allBTNs images/JButtons
     */
    public List<JButton> getAllButtons() {
        return allBTNs;
    }
    

    /**
     * getOn(String name)
     * 
     * @param name
     * 
     * @return result - returns result of Buttons images/JButtons on
     */
    public boolean getOn(String name) {
        
        boolean result = false;
        
        switch(name){
            case "Start!":
                result = startBtnOn;
                break;
            case "Collect":
                result = collectBtnOn;
                break;
            case "HoldReel1":
                result = hold1BtnOn;
                break;
            case "HoldReel2":
                result = hold2BtnOn;
                break;
            case "HoldReel3":
                result = hold3BtnOn;
                break;
            case "Cancel":
                result = cancelBtnOn;
                break;
            case "Exchange":
                result = exchangeBtnOn;
                break;
            case "InsertCoin":
                result = insertCoinBtnOn;
                break;
        }
        
        return result;
    }
    
    
    /**
     * setStatic(String name, boolean result)
     * 
     * @param name
     * @param result
     * 
     */
    public void setStatic(String name, boolean result){
        
        switch(name){
            case "Start!":
                startBtnStaticOn = result;
                break;
            case "Collect":
                collectBtnStaticOn = result;
                break;
            case "HoldReel1":
                hold1BtnStaticOn = result;
                break;
            case "HoldReel2":
                hold2BtnStaticOn = result;
                break;
            case "HoldReel3":
                hold3BtnStaticOn = result;
                break;
            case "Cancel":
                cancelBtnStaticOn = result;
                break;
            case "Exchange":
                exchangeBtnStaticOn = result;
                break;
            case "InsertCoin":
                insertCoinBtnStaticOn = result;
                break;
        }        
    }
    
    
    /**
     * setFlashing(String name, boolean result)
     * 
     * @param name
     * @param result
     * 
     */
    public void setFlashing(String name, boolean result){
        
        switch(name){
            case "Start!":
                startBtnFlashOn = result;
                break;
            case "Collect":
                collectBtnFlashOn = result;
                break;
            case "HoldReel1":
                hold1BtnFlashOn = result;
                break;
            case "HoldReel2":
                hold2BtnFlashOn = result;
                break;
            case "HoldReel3":
                hold3BtnFlashOn = result;
                break;
            case "Cancel":
                cancelBtnFlashOn = result;
                break;
            case "Exchange":
                exchangeBtnFlashOn = result;
                break;
            case "InsertCoin":
                insertCoinBtnFlashOn = result;
                break;
        }
        
    }
    
    
    /**
     * setSelected(String name, boolean result)
     * 
     * @param name
     * @param result
     * 
     */
    public void setSelected(String name, boolean result){
        
        switch(name){
            case "Start!":
                startBtnSelectedOn = result;
                break;
            case "Collect":
                collectBtnSelectedOn = result;
                break;
            case "HoldReel1":
                hold1BtnSelectedOn = result;
                break;
            case "HoldReel2":
                hold2BtnSelectedOn = result;
                break;
            case "HoldReel3":
                hold3BtnSelectedOn = result;
                break;
            case "Cancel":
                cancelBtnSelectedOn = result;
                break;
            case "Exchange":
                exchangeBtnSelectedOn = result;
                break;
            case "InsertCoin":
                insertCoinBtnSelectedOn = result;
                break;
        }
        
    }
    
    
    /**
     * tick()
     * 
     * ticks all the Buttons images/JButtons
     */
    public void tick() {
    }

    void defaultButtons() {
        off();
//        if(Game.getMachine().getCredits() > 0){
//            //set Start Flashing
//            setFlashing("Start!", true);
//        }
    }

    void on() {
        for(JButton btn : allBTNs){
            setStatic(btn.getText(), true);
        }
    }

    void off() {
        for(JButton btn : allBTNs){
            setStatic(btn.getText(), false);
        }
    }

    void flashOn() {
        for(JButton btn : allBTNs){
            setFlashing(btn.getText(), true);
        }
    }

    void flashOff() {
        for(JButton btn : allBTNs){
            setFlashing(btn.getText(), false);
        }
    }
    
    
    void skillForward() {
        
        skillButtonsForwardPool = Executors.newFixedThreadPool(1);
        
        skillButtonsForwardPool.execute(skillButtonsForward);
        
        skillButtonsForwardPool.shutdown();
        skillButtonsForwardPool = null;
        
    }

    void skillReverse() {
            
        skillButtonsReversePool = Executors.newFixedThreadPool(1);
        
        skillButtonsReversePool.execute(skillButtonsReverse);
        
        skillButtonsReversePool.shutdown();
        skillButtonsReversePool = null;
        
    }

    void skillShot() {
        System.out.println("Skillshot: Turning Skill Skillshot On");
        //excecutorService_SkillButtons = Executors.newSingleThreadScheduledExecutor();
        excecutorService_SkillButtons.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 150) % 2 == 0){
                    skillForward();
                } else {
                    skillReverse();
                }
                excecutorService_SkillButtons.shutdown();
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    void skillShotStop() {
        //System.out.println("Skillshot: Current Skill cash: "+currentSkillSkillshot.getText());
        excecutorService_SkillButtonsForward.shutdown();
        excecutorService_SkillButtonsReverse.shutdown();
        
        try {
            if (!excecutorService_SkillButtonsForward.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillButtonsForward.shutdownNow();
            }
            if (!excecutorService_SkillButtonsReverse.awaitTermination(2, TimeUnit.MILLISECONDS)) {
                excecutorService_SkillButtonsReverse.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_SkillButtonsForward.shutdownNow();
            excecutorService_SkillButtonsReverse.shutdownNow();
        }
    }

    void randomOn() {
        System.out.println("Skillshot: Turning Random Skillshot On");
        excecutorService_RandomButtonsOn = Executors.newScheduledThreadPool(1);
        excecutorService_RandomButtonsOn.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run(){
                if((System.currentTimeMillis() / 450) % 2 == 0){
                    if((System.currentTimeMillis() / 150) % 2 == 0){
                        skillForward();
                    } else {
                        skillReverse();
                    }
                } else {
                    if((System.currentTimeMillis() / 300) % 2 == 0){
                        flashOn();
                    } else {
                        flashOff();
                    }
                }
            }
        }, 14, 1, TimeUnit.SECONDS);
    }

    void randomOff() {
        System.out.println("Buttons: Turning Random Buttons Off");
        excecutorService_RandomButtonsOn.shutdown();

        try {
            if (!excecutorService_RandomButtonsOn.awaitTermination(30, TimeUnit.MILLISECONDS)) {
                excecutorService_RandomButtonsOn.shutdownNow();
            }
        } catch (InterruptedException e) {
            excecutorService_RandomButtonsOn.shutdownNow();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buttons.class.getName()).log(Level.SEVERE, null, ex);
        }
        flashOff();
        off();
        try {
            Thread.yield();
        } catch (Exception ex) {
            Logger.getLogger(Buttons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
