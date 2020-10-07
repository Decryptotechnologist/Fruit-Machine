/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.ui;

import tangodown.fruit.machine.graphics.Display;
import tangodown.fruit.machine.gamelogic.Game;
import tangodown.fruit.machine.audio.Sound;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Ghomez
 */
public class MainMenu extends JMenuBar {
    
    private static JRadioButtonMenuItem bgDPGMi;
    private static JRadioButtonMenuItem bgOWWMi;
    private static JRadioButtonMenuItem bgDOMi;
    private static JRadioButtonMenuItem bgLGMi;
    private static JRadioButtonMenuItem bgPMi;
    private static JRadioButtonMenuItem bgBMi;
    private static JRadioButtonMenuItem bgGMi;
    private static JRadioButtonMenuItem bgDLGMi;
    private static JRadioButtonMenuItem bgLMGMi;
    private static JRadioButtonMenuItem bgLPGMi;
    private static JRadioButtonMenuItem bgBPGMi;
    private final JRadioButtonMenuItem reelsForwardMi;
    private final JRadioButtonMenuItem reelsReverseMi;
    
    
    public MainMenu(Game game) {
        System.out.println("MainMenu: New Main Menu Created");
        
        //Setup MainMenu: Icon Images
        ImageIcon exitIcon = new ImageIcon("res/30-512-24.png");//res/icon/exit.png");
        ImageIcon newIcon = new ImageIcon("res/fruitIcon32.ico");
        ImageIcon optionsIcon = new ImageIcon("res/settings.png");
        ImageIcon statusIcon = new ImageIcon("res/statusbar.png");
        ImageIcon fpsIcon = new ImageIcon("res/FPS.png");
        ImageIcon upsIcon = new ImageIcon("res/UPS.png");
        ImageIcon soundIcon = new ImageIcon("res/sound.png");
        ImageIcon musicIcon = new ImageIcon("res/music.png");
        
        //MACHINE
        JMenu fileMenu = new JMenu("Machine");
        fileMenu.setMnemonic(KeyEvent.VK_G);
        
            //MACHINE : NEW MACHINE
            JMenuItem newMi = new JMenuItem("New Machine . . .", newIcon);
            newMi.setMnemonic(KeyEvent.VK_N);
            
            newMi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    //New Machine
                    //game.setMenu(null);
                    game.stateManager.setState("menu");

                    //Display.game = new Game();
                }
            });

            //MACHINE : EXIT
            JMenuItem exitMi = new JMenuItem("Exit", exitIcon);
            exitMi.setMnemonic(KeyEvent.VK_X);

            exitMi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    Sound.quit.play();
                    
                    game.quitGame();
                }
            });
            
        //EDIT
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        //VIEW
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);
        
            //DEVELOPER : SHOW STATUSBAR
            JCheckBoxMenuItem sbarMi = new JCheckBoxMenuItem("Show statubar", statusIcon);
            sbarMi.setMnemonic(KeyEvent.VK_S);
            sbarMi.setSelected(true);

            sbarMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        Display.statusbar.setVisible(true);
                    } else {
                        Display.statusbar.setVisible(false);
                    }

                }

            });

            //DEVELOPER : SHOW FPS
            JCheckBoxMenuItem sfpsMi = new JCheckBoxMenuItem("Show FPS", fpsIcon);
            sfpsMi.setMnemonic(KeyEvent.VK_F);

            sfpsMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        Display.showFPS = true;
                    } else {
                        Display.showFPS = false;
                    }

                }

            });

            //DEVELOPER : SHOW UPS
            JCheckBoxMenuItem sUpsMi = new JCheckBoxMenuItem("Show UPS", upsIcon);
            sUpsMi.setMnemonic(KeyEvent.VK_U);

            sUpsMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        Display.showUPS = true;
                    } else {
                        Display.showUPS = false;
                    }

                }

            });
        
        //DEVELOPER
        JMenu devMenu = new JMenu("Developer");
        devMenu.setMnemonic(KeyEvent.VK_V);
        
        //HELP
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);

        //OPTIONS
        JMenuItem optionsMi = new JMenuItem("Options", optionsIcon);
        optionsMi.setMnemonic(KeyEvent.VK_O);

        optionsMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //new Options().setVisible(true);
                
            }
        });

        

        
        
        //Background Menu Items******************************************************/
        //Background Menu******************************************************/ 
        //DEV : BACKGROUND
        JMenu bgMenu = new JMenu("Background:");

            //Background Menu Item - Select Dark Pea Green
            //DEV : BACKGROUND
            bgDPGMi = new JRadioButtonMenuItem("Select Dark Pea Green");
            bgDPGMi.setSelected(true);

            //Background Menu Item ItemListener - Select Dark Pea Green
            bgDPGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(0);
                
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Orange w white bg
            //DEV : BACKGROUND
            bgOWWMi = new JRadioButtonMenuItem("Select Orange w white bg");
            bgOWWMi.setSelected(false);

            //Background Menu Item ItemListener - Select Orange w white bg
            bgOWWMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(1);
                
                bgDPGMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Dark Orange
            //DEV : BACKGROUND
            bgDOMi = new JRadioButtonMenuItem("Select Dark Orange");
            bgDOMi.setSelected(false);

            //Background Menu Item ItemListener - Select Dark Orange
            bgDOMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(2);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Lime Green
            //DEV : BACKGROUND
            bgLGMi = new JRadioButtonMenuItem("Select Lime Green");
            bgLGMi.setSelected(false);

            //Background Menu Item ItemListener - Select Lime Green
            bgLGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(3);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Pink
            //DEV : BACKGROUND
            bgPMi = new JRadioButtonMenuItem("Select Pink");
            bgPMi.setSelected(false);

            //Background Menu Item ItemListener - Select Pink
            bgPMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(4);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Blue
            //DEV : BACKGROUND
            bgBMi = new JRadioButtonMenuItem("Select Blue");
            bgBMi.setSelected(false);

            //Background Menu Item ItemListener - Select Blue
            bgBMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(5);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Green
            //DEV : BACKGROUND
            bgGMi = new JRadioButtonMenuItem("Select Green");
            bgGMi.setSelected(false);

            //Background Menu Item ItemListener - Select Green
            bgGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(6);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Dark Lime Green
            //DEV : BACKGROUND
            bgDLGMi = new JRadioButtonMenuItem("Select Dark Lime Green");
            bgDLGMi.setSelected(false);

            //Background Menu Item ItemListener - Select Dark Lime Green
            bgDLGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(7);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Light Mint Green
            //DEV : BACKGROUND
            bgLMGMi = new JRadioButtonMenuItem("Select Light Mint Green");
            bgLMGMi.setSelected(false);

            //Background Menu Item ItemListener - Select Light Mint Green
            bgLMGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(8);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLPGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select Light Pea Green
            //DEV : BACKGROUND
            bgLPGMi = new JRadioButtonMenuItem("Select Light Pea Green");
            bgLPGMi.setSelected(false);

            //Background Menu Item ItemListener - Select Light Pea Green
            bgLPGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(9);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgBPGMi.setSelected(false);
            }
            });
            
            //Background Menu Item - Select bright Pea Green
            //DEV : BACKGROUND
            bgBPGMi = new JRadioButtonMenuItem("Select bright Pea Green");
            bgBPGMi.setSelected(false);

            //Background Menu Item ItemListener - Select bright Pea Green
            bgBPGMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                game.machine.setBG(10);
                
                bgDPGMi.setSelected(false);
                bgOWWMi.setSelected(false);
                bgDOMi.setSelected(false);
                bgLGMi.setSelected(false);
                bgPMi.setSelected(false);
                bgBMi.setSelected(false);
                bgGMi.setSelected(false);
                bgDLGMi.setSelected(false);
                bgLMGMi.setSelected(false);
                bgLPGMi.setSelected(false);
            }
            });
            
            
            
            
        //Sound Menu******************************************************/
        //DEV : SOUND
        JMenu sndMenu = new JMenu("Sound:");
        
        //DEV : SOUND : SOUNDFX
        JCheckBoxMenuItem soundMi = new JCheckBoxMenuItem("Sound Enabled", soundIcon);
        soundMi.setMnemonic(KeyEvent.VK_S);
        soundMi.setSelected(true);

        soundMi.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    game.setGameSound(true);
                } else {
                    game.setGameSound(false);
                }
            }
        });
        
        //DEV : SOUND : GAME MUSIC
        JCheckBoxMenuItem musicMi = new JCheckBoxMenuItem("Game Music Enabled", musicIcon);
        musicMi.setMnemonic(KeyEvent.VK_M);
        musicMi.setSelected(true);

        musicMi.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    game.setGameMusic(true);
                } else {
                    game.setGameMusic(false);
                }
                
            }

        });
            
        
        
        //Machine Menu******************************************************/
        //DEV : MACHINE
        JMenu machineMenu = new JMenu("Machine:");
            
            //DEV : MACHINE : BANK
            JMenu bankMenu = new JMenu("Bank:");
            
                //DEV : MACHINE : BANK : RESET BANK
                JMenuItem bankResetMi = new JMenuItem("Reset Bank");
                
                bankResetMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.setBank(0);
                    }

                });
                
                //DEV : MACHINE : BANK : INCREASE BANK 1(£1)
                JMenuItem bankIncrease1Mi = new JMenuItem("Increase Bank £1");
                
                bankIncrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseBank(1);
                    }

                });
                
                //DEV : MACHINE : BANK : INCREASE BANK 2(£2)
                JMenuItem bankIncrease2Mi = new JMenuItem("Increase Bank £2");
                
                bankIncrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseBank(2);
                    }

                });
                
                //DEV : MACHINE : BANK : INCREASE BANK 3(£5)
                JMenuItem bankIncrease3Mi = new JMenuItem("Increase Bank £5");
                
                bankIncrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseBank(5);
                    }

                });
                
                //DEV : MACHINE : BANK : INCREASE BANK 4(£10)
                JMenuItem bankIncrease4Mi = new JMenuItem("Increase Bank £10");
                
                bankIncrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseBank(10);
                    }

                });
                
                //DEV : MACHINE : BANK : DECREASE BANK 1(-£1)
                JMenuItem bankDecrease1Mi = new JMenuItem("Decrease Bank £1");
                
                bankDecrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseBank(1);
                    }

                });
                
                //DEV : MACHINE : BANK : DECREASE BANK 2(-£2)
                JMenuItem bankDecrease2Mi = new JMenuItem("Decrease Bank £2");
                
                bankDecrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseBank(2);
                    }

                });
                
                //DEV : MACHINE : BANK : DECREASE BANK 3(-£5)
                JMenuItem bankDecrease3Mi = new JMenuItem("Decrease Bank £5");
                
                bankDecrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseBank(5);
                    }

                });
                
                //DEV : MACHINE : BANK : DECREASE BANK 4(-£10)
                JMenuItem bankDecrease4Mi = new JMenuItem("Decrease Bank £10");
            
                bankDecrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseBank(10);
                    }

                });
                
            //DEV : MACHINE : FEATURE
            JMenu featureMenu = new JMenu("Feature:");
            
                //DEV : MACHINE : FEATURE : PLAY 3 REELS
                JMenuItem threeReelsPlayMi = new JMenuItem("Play 3 Reels");
            
                threeReelsPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY HILO
                JMenuItem hiloPlayMi = new JMenuItem("Play HiLo");
                
                hiloPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //game.machine.startFeature();
                        game.machine.reels.spinAllReels(20,4,18,0,0);
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY ROULETTE
                JMenuItem roulettePlayMi = new JMenuItem("Play Roulette");
                
                roulettePlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY SKILLSHOT
                JMenuItem skillshotPlayMi = new JMenuItem("Play Skillshot");
                
                skillshotPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY WIN SPINS
                JMenuItem winSpinsPlayMi = new JMenuItem("Play Win Spins");
                
                winSpinsPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY MYSTERY WIN
                JMenuItem mysteryPlayMi = new JMenuItem("Play Mystery Win");
                
                mysteryPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY DOUBLE OR NOTHING
                JMenuItem dorNPlayMi = new JMenuItem("Play Double or Nothing");
                
                dorNPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY SKILL CASH
                JMenuItem skillCashPlayMi = new JMenuItem("Play Skill Cash");
                
                skillCashPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY BAR STOPPA
                JMenuItem barStoppaPlayMi = new JMenuItem("Play BAR Stoppa");
                
                barStoppaPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                //DEV : MACHINE : FEATURE : PLAY CRACKPOT
                JMenuItem crackpotPlayMi = new JMenuItem("Play Crackpot");
            
                crackpotPlayMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.spinAllReels();
                    }

                });
                
                
            //DEV : MACHINE : RNG
            JMenu rngMenu = new JMenu("RNG:");
        
        
            //DEV : MACHINE : REELS
            JMenu reelsMenu = new JMenu("Reels:");
            
                //DEV : MACHINE : REELS : ALL REELS
                JMenu allReelsMenu = new JMenu("All Reels");
                
                    //DEV : MACHINE : REELS : ALL REELS : DEFAULT REELS
                    JMenuItem defaultReelsAllMi = new JMenuItem("Default All Reels", musicIcon);

                    defaultReelsAllMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("ALL_REELS_DEFAULT");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : SET HOLD ON
                    JCheckBoxMenuItem holdOnMi = new JCheckBoxMenuItem("Set Hold On", musicIcon);

                    holdOnMi.addItemListener(new ItemListener() {

                        @Override
                        public void itemStateChanged(ItemEvent e) {

                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                game.machine.execute("HOLD_ON");
                            } else {
                                game.machine.execute("HOLD_OFF");
                            }

                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : CANCEL HOLDS
                    JMenuItem cancelHoldsMi = new JMenuItem("Cancel Holds", musicIcon);

                    cancelHoldsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("HOLD_CANCEL");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : SET SUPER HOLD ON
                    JCheckBoxMenuItem superHoldOnMi = new JCheckBoxMenuItem("Set Super Hold On", musicIcon);

                    superHoldOnMi.addItemListener(new ItemListener() {

                        @Override
                        public void itemStateChanged(ItemEvent e) {

                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                game.machine.execute("SUPER_HOLD_ON");
                            } else {
                                game.machine.execute("SUPER_HOLD_OFF");
                            }

                        }

                    });
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : CANCEL SUPER HOLDS
                    JMenuItem cancelSuperHoldsMi = new JMenuItem("Cancel Super Holds", musicIcon);

                    cancelSuperHoldsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("SUPER_HOLD_CANCEL");
                        }

                    });
                    
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : SET NUDGE ON
                    JCheckBoxMenuItem nudgeOnMi = new JCheckBoxMenuItem("Set Nudge On", musicIcon);

                    nudgeOnMi.addItemListener(new ItemListener() {

                        @Override
                        public void itemStateChanged(ItemEvent e) {

                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                game.machine.execute("NUDGE_ON");
                            } else {
                                game.machine.execute("NUDGE_OFF");
                            }

                        }

                    });
                    
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : CANCEL NUDGES
                    JMenuItem cancelNudgesMi = new JMenuItem("Cancel Nudges", musicIcon);

                    cancelNudgesMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("NUDGE_CANCEL");
                        }

                    });
                    
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS FORWARD
                    reelsForwardMi = new JRadioButtonMenuItem("Select Reel Direction Forward");
                    reelsForwardMi.setSelected(true);

                    reelsForwardMi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_FORWARD_ON");

                            reelsReverseMi.setSelected(false);
                        }
                    });
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS REVERSE
                    reelsReverseMi = new JRadioButtonMenuItem("Select Reel Direction Reverse");

                    reelsReverseMi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_REVERSE_ON");

                            reelsForwardMi.setSelected(false);
                        }
                    });
                    
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN CHERRIES
                    JMenuItem reelsWinSpinCherriesMi = new JMenuItem("Reels Winspin Cherries", musicIcon);

                    reelsWinSpinCherriesMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_CHERRIES");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN MIXED7S
                    JMenuItem reelsWinSpinMixed7sMi = new JMenuItem("Reels Winspin Mixed 7s", musicIcon);

                    reelsWinSpinMixed7sMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_MIXED7S");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN GREEN BARS
                    JMenuItem reelsWinSpinGreenBarsMi = new JMenuItem("Reels Winspin Green Bars", musicIcon);

                    reelsWinSpinGreenBarsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_GREEN_BARS");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN RED BARS
                    JMenuItem reelsWinSpinRedBarsMi = new JMenuItem("Reels Winspin Red Bars", musicIcon);

                    reelsWinSpinRedBarsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_RED_BARS");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN GOLD BARS
                    JMenuItem reelsWinSpinGoldBarsMi = new JMenuItem("Reels Winspin Gold Bars", musicIcon);

                    reelsWinSpinGoldBarsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_GOLD_BARS");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN BLUE 7S
                    JMenuItem reelsWinSpinBlue7sMi = new JMenuItem("Reels Winspin Blue 7s", musicIcon);

                    reelsWinSpinBlue7sMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_BLUE7S");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN RED 7S
                    JMenuItem reelsWinSpinRed7sMi = new JMenuItem("Reels Winspin Red 7s", musicIcon);

                    reelsWinSpinRed7sMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_RED7S");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN GOLD 7S
                    JMenuItem reelsWinSpinGold7sMi = new JMenuItem("Reels Winspin Gold 7s", musicIcon);

                    reelsWinSpinGold7sMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_GOLD7S");
                        }

                    });
                    
                    //DEV : MACHINE : REELS : ALL REELS : REELS WINSPIN GOLD BELLS
                    JMenuItem reelsWinSpinGoldBellsMi = new JMenuItem("Reels Winspin Gold Bells", musicIcon);

                    reelsWinSpinGoldBellsMi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.execute("REELS_WINSPIN_GOLD_BELLS");
                        }

                    });
                    
                    
            
                //DEV : MACHINE : REELS : REEL 1
                JMenu reel1Menu = new JMenu("Reel 1:");
                
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 0 / GOLD 7
                    JMenuItem reel1Spin0Mi = new JMenuItem("Reel1 Spin 0 : Gold 7", musicIcon);

                    reel1Spin0Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(0);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 2 / CHERRY
                    JMenuItem reel1Spin2Mi = new JMenuItem("Reel1 Spin 2 : Cherry", musicIcon);

                    reel1Spin2Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(2);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 4 / RED BARS
                    JMenuItem reel1Spin4Mi = new JMenuItem("Reel1 Spin 4 : Red Bars", musicIcon);

                    reel1Spin4Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(4);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 6 / GOLD BARS
                    JMenuItem reel1Spin6Mi = new JMenuItem("Reel1 Spin 6 : Gold Bars", musicIcon);

                    reel1Spin6Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(6);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 8 / BLUE 7
                    JMenuItem reel1Spin8Mi = new JMenuItem("Reel1 Spin 8 : Blue 7", musicIcon);

                    reel1Spin8Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(8);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 10 / GOLD BELL
                    JMenuItem reel1Spin10Mi = new JMenuItem("Reel1 Spin 10 : Gold Bell", musicIcon);

                    reel1Spin10Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(10);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 12 / RED BARS
                    JMenuItem reel1Spin12Mi = new JMenuItem("Reel1 Spin 12 : Red Bars", musicIcon);

                    reel1Spin12Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(12);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 14 / RED 7
                    JMenuItem reel1Spin14Mi = new JMenuItem("Reel1 Spin 14 : Red 7", musicIcon);

                    reel1Spin14Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(14);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 16 / CHERRY
                    JMenuItem reel1Spin16Mi = new JMenuItem("Reel1 Spin 16 : Cherry", musicIcon);

                    reel1Spin16Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(16);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 18 / GREEN BARS
                    JMenuItem reel1Spin18Mi = new JMenuItem("Reel1 Spin 18 : Green Bars", musicIcon);

                    reel1Spin18Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(18);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 20 / BLUE 7
                    JMenuItem reel1Spin20Mi = new JMenuItem("Reel1 Spin 20 : Blue 7*", musicIcon);

                    reel1Spin20Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(20);
                        }
                        
                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 22 / Cherry
                    JMenuItem reel1Spin22Mi = new JMenuItem("Reel1 Spin 22 : Cherry", musicIcon);

                    reel1Spin22Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(22);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 24 / RED 7
                    JMenuItem reel1Spin24Mi = new JMenuItem("Reel1 Spin 24 : Red 7", musicIcon);

                    reel1Spin24Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(24);
                        }
                        
                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 26 / RED BARS
                    JMenuItem reel1Spin26Mi = new JMenuItem("Reel1 Spin 26 : Red Bars", musicIcon);

                    reel1Spin26Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(26);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 28 / GREEN BAR
                    JMenuItem reel1Spin28Mi = new JMenuItem("Reel1 Spin 28 : Green Bar*", musicIcon);

                    reel1Spin28Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(28);
                        }
                        
                    });
                    
                    //DEV : MACHINE : REELS : REEL 1 : SPIN 30 / GOLD BELL
                    JMenuItem reel1Spin30Mi = new JMenuItem("Reel1 Spin 30 : Gold Bell", musicIcon);

                    reel1Spin30Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel1(30);
                        }
                        
                    });
                    
            
            
                //DEV : MACHINE : REELS : REEL 2
                JMenu reel2Menu = new JMenu("Reel 2:");
                
                
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 0 / GOLD 7
                    JMenuItem reel2Spin0Mi = new JMenuItem("Reel2 Spin 0 : Gold 7", musicIcon);

                    reel2Spin0Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(0);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 2 / GREEN BAR
                    JMenuItem reel2Spin2Mi = new JMenuItem("Reel2 Spin 2 : Green Bar", musicIcon);

                    reel2Spin2Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(2);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 4 / GOLD BARS
                    JMenuItem reel2Spin4Mi = new JMenuItem("Reel2 Spin 4 : Gold Bars", musicIcon);

                    reel2Spin4Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(4);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 6 / CHERRY
                    JMenuItem reel2Spin6Mi = new JMenuItem("Reel2 Spin 6 : Cherry*", musicIcon);

                    reel2Spin6Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(6);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 8 / BLUE 7
                    JMenuItem reel2Spin8Mi = new JMenuItem("Reel2 Spin 8 : Blue 7", musicIcon);

                    reel2Spin8Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(8);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 10 / GREEN BAR
                    JMenuItem reel2Spin10Mi = new JMenuItem("Reel2 Spin 10 : Green Bar", musicIcon);

                    reel2Spin10Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(10);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 12 / CHERRY
                    JMenuItem reel2Spin12Mi = new JMenuItem("Reel2 Spin 12 : Cherry", musicIcon);

                    reel2Spin12Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(12);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 14 / GOLD BELL
                    JMenuItem reel2Spin14Mi = new JMenuItem("Reel2 Spin 14 : Gold Bell", musicIcon);

                    reel2Spin14Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(14);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 16 / GOLD BARS
                    JMenuItem reel2Spin16Mi = new JMenuItem("Reel2 Spin 16 : Gold Bars", musicIcon);

                    reel2Spin16Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(16);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 18 / CHERRY
                    JMenuItem reel2Spin18Mi = new JMenuItem("Reel2 Spin 18 : Cherry*", musicIcon);

                    reel2Spin18Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(18);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 20 / GREEN BAR
                    JMenuItem reel2Spin20Mi = new JMenuItem("Reel2 Spin 20 : Green Bar", musicIcon);

                    reel2Spin20Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(20);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 22 / GOLD 7
                    JMenuItem reel2Spin22Mi = new JMenuItem("Reel2 Spin 22 : Gold 7", musicIcon);

                    reel2Spin22Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(22);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 24 / RED 7
                    JMenuItem reel2Spin24Mi = new JMenuItem("Reel2 Spin 24 : Red 7", musicIcon);

                    reel2Spin24Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(24);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 26 / GREEN BAR
                    JMenuItem reel2Spin26Mi = new JMenuItem("Reel2 Spin 26 : Cherry", musicIcon);

                    reel2Spin26Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(26);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 28 / RED BARS
                    JMenuItem reel2Spin28Mi = new JMenuItem("Reel2 Spin 28 : Red Bars", musicIcon);

                    reel2Spin28Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(28);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 2 : SPIN 30 / GREEN BAR
                    JMenuItem reel2Spin30Mi = new JMenuItem("Reel2 Spin 30 : Green Bar", musicIcon);

                    reel2Spin30Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel2(30);
                        }

                    });
                    
                    
                
                //DEV : MACHINE : REELS : REEL 3
                JMenu reel3Menu = new JMenu("Reel 3:");
                
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 0 / RED BARS
                    JMenuItem reel3Spin0Mi = new JMenuItem("Reel3 Spin 0 : Red Bars", musicIcon);

                    reel3Spin0Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(0);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 2 / CHERRY
                    JMenuItem reel3Spin2Mi = new JMenuItem("Reel3 Spin 2 : Cherry*", musicIcon);

                    reel3Spin2Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(2);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 4 / RED 7
                    JMenuItem reel3Spin4Mi = new JMenuItem("Reel3 Spin 4 : Red 7", musicIcon);

                    reel3Spin4Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(4);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 6 / GREEN BAR
                    JMenuItem reel3Spin6Mi = new JMenuItem("Reel3 Spin 6 : Green Bar*", musicIcon);

                    reel3Spin6Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(6);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 8 / GOLD BARS
                    JMenuItem reel3Spin8Mi = new JMenuItem("Reel3 Spin 8 : Gold Bars", musicIcon);

                    reel3Spin8Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(8);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 10 / BLUE 7
                    JMenuItem reel3Spin10Mi = new JMenuItem("Reel3 Spin 10 : Blue 7", musicIcon);

                    reel3Spin10Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(10);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 12 / CHERRY
                    JMenuItem reel3Spin12Mi = new JMenuItem("Reel3 Spin 12 : Cherry*", musicIcon);

                    reel3Spin12Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(12);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 14 / RED BARS
                    JMenuItem reel3Spin14Mi = new JMenuItem("Reel3 Spin 14 : Red Bars", musicIcon);

                    reel3Spin14Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(14);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 16 / GREEN BAR
                    JMenuItem reel3Spin16Mi = new JMenuItem("Reel3 Spin 16 : Green Bar", musicIcon);

                    reel3Spin16Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(16);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 18 / BLUE 7
                    JMenuItem reel3Spin18Mi = new JMenuItem("Reel3 Spin 18 : Blue 7", musicIcon);

                    reel3Spin18Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(18);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 20 / GOLD BELL
                    JMenuItem reel3Spin20Mi = new JMenuItem("Reel3 Spin 20 : Gold Bell", musicIcon);

                    reel3Spin20Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(20);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 22 / RED BARS
                    JMenuItem reel3Spin22Mi = new JMenuItem("Reel3 Spin 22 : Red Bars*", musicIcon);

                    reel3Spin22Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(22);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 24 / CHERRY
                    JMenuItem reel3Spin24Mi = new JMenuItem("Reel3 Spin 24 : Cherry*", musicIcon);

                    reel3Spin24Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(24);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 26 / RED 7
                    JMenuItem reel3Spin26Mi = new JMenuItem("Reel3 Spin 26 : Red 7", musicIcon);

                    reel3Spin26Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(26);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 28 / GOLD BARS
                    JMenuItem reel3Spin28Mi = new JMenuItem("Reel3 Spin 28 : Gold Bars", musicIcon);

                    reel3Spin28Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(28);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL 3 : SPIN 30 / GOLD 7
                    JMenuItem reel3Spin30Mi = new JMenuItem("Reel3 Spin 30 : Gold 7", musicIcon);

                    reel3Spin30Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReel3(30);
                        }

                    });
                    
                //DEV : MACHINE : REELS : REEL HILO
                JMenu reelHiLoMenu = new JMenu("Reel HiLo:");
                
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 0 / NO: 12
                    JMenuItem reelHiLoSpin0Mi = new JMenuItem("ReelHiLo Spin 0 : No. 12", musicIcon);

                    reelHiLoSpin0Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(0);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 2 / NO: 11
                    JMenuItem reelHiLoSpin2Mi = new JMenuItem("ReelHiLo Spin 2 : No. 11", musicIcon);

                    reelHiLoSpin2Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(2);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 4 / NO: 10
                    JMenuItem reelHiLoSpin4Mi = new JMenuItem("ReelHiLo Spin 4 : No. 10", musicIcon);

                    reelHiLoSpin4Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(4);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 6 / NO: 9
                    JMenuItem reelHiLoSpin6Mi = new JMenuItem("ReelHiLo Spin 6 : No. 9", musicIcon);

                    reelHiLoSpin6Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(6);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 8 / NO: 8
                    JMenuItem reelHiLoSpin8Mi = new JMenuItem("ReelHiLo Spin 8 : No. 8", musicIcon);

                    reelHiLoSpin8Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(8);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 9 / NO: 7
                    JMenuItem reelHiLoSpin9Mi = new JMenuItem("ReelHiLo Spin 9 : No. 7", musicIcon);

                    reelHiLoSpin9Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(9);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 11 / NO: 6
                    JMenuItem reelHiLoSpin11Mi = new JMenuItem("ReelHiLo Spin 11 : No. 6", musicIcon);

                    reelHiLoSpin11Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(11);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 13 / NO: 5
                    JMenuItem reelHiLoSpin13Mi = new JMenuItem("ReelHiLo Spin 13 : No. 5", musicIcon);

                    reelHiLoSpin13Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(13);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 15 / NO: 4
                    JMenuItem reelHiLoSpin15Mi = new JMenuItem("ReelHiLo Spin 15 : No. 4", musicIcon);

                    reelHiLoSpin15Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(15);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 17 / NO: 3
                    JMenuItem reelHiLoSpin17Mi = new JMenuItem("ReelHiLo Spin 17 : No. 3", musicIcon);

                    reelHiLoSpin17Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(17);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 19 / NO: 2
                    JMenuItem reelHiLoSpin19Mi = new JMenuItem("ReelHiLo Spin 19 : No. 2", musicIcon);

                    reelHiLoSpin19Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(19);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL HILO : SPIN 21 / NO: 1
                    JMenuItem reelHiLoSpin21Mi = new JMenuItem("ReelHiLo Spin 21 : No. 1", musicIcon);

                    reelHiLoSpin21Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinReelHiLo(21);
                        }

                    });
                    

                //DEV : MACHINE : REELS : REEL ROULETTE
                JMenu reelRouletteMenu = new JMenu("Roulette:");
                
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 0 / +2 FEATURES
                    JMenuItem reelRouletteSpin0Mi = new JMenuItem("ReelRoulette Spin 0 : +2 Features", musicIcon);

                    reelRouletteSpin0Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(0);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 1 / +3 NUDGES
                    JMenuItem reelRouletteSpin1Mi = new JMenuItem("ReelRoulette Spin 1 : +3 Nudges", musicIcon);

                    reelRouletteSpin1Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(1);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 2 / +1 CASH
                    JMenuItem reelRouletteSpin2Mi = new JMenuItem("ReelRoulette Spin 2 : +1 Cash", musicIcon);

                    reelRouletteSpin2Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(2);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 3 / +2 NUDGES
                    JMenuItem reelRouletteSpin3Mi = new JMenuItem("ReelRoulette Spin 3 : +2 Nudges", musicIcon);

                    reelRouletteSpin3Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(3);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 4 / +1 FEATURES
                    JMenuItem reelRouletteSpin4Mi = new JMenuItem("ReelRoulette Spin 4 : +1 Features", musicIcon);

                    reelRouletteSpin4Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(4);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 5 / +2 NUDGES
                    JMenuItem reelRouletteSpin5Mi = new JMenuItem("ReelRoulette Spin 5 : +2 Nudges", musicIcon);

                    reelRouletteSpin5Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(5);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 6 / +3 CASH
                    JMenuItem reelRouletteSpin6Mi = new JMenuItem("ReelRoulette Spin 6 : +3 Cash", musicIcon);

                    reelRouletteSpin6Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(6);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 7 / +1 WINSPIN
                    JMenuItem reelRouletteSpin7Mi = new JMenuItem("ReelRoulette Spin 7 : +1 WinSpin", musicIcon);

                    reelRouletteSpin7Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(7);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 8 / GAME OVER
                    JMenuItem reelRouletteSpin8Mi = new JMenuItem("ReelRoulette Spin 8 : Game Over", musicIcon);

                    reelRouletteSpin8Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(8);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 9 / +2 CASH
                    JMenuItem reelRouletteSpin9Mi = new JMenuItem("ReelRoulette Spin 9 : +2 Cash", musicIcon);

                    reelRouletteSpin9Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(9);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 10 / +1 NUDGES
                    JMenuItem reelRouletteSpin10Mi = new JMenuItem("ReelRoulette Spin 10 : +1 Nudges", musicIcon);

                    reelRouletteSpin10Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(10);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 11 / +1 FEATURES
                    JMenuItem reelRouletteSpin11Mi = new JMenuItem("ReelRoulette Spin 11 : +1 Features", musicIcon);

                    reelRouletteSpin11Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(11);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 12 / +2 NUDGES
                    JMenuItem reelRouletteSpin12Mi = new JMenuItem("ReelRoulette Spin 12 : +2 Nudges", musicIcon);

                    reelRouletteSpin12Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(12);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 13 / +1 FEATURES
                    JMenuItem reelRouletteSpin13Mi = new JMenuItem("ReelRoulette Spin 13 : +1 Features", musicIcon);

                    reelRouletteSpin13Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(13);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 14 / +1 NUDGES
                    JMenuItem reelRouletteSpin14Mi = new JMenuItem("ReelRoulette Spin 14 : +1 Nudges", musicIcon);

                    reelRouletteSpin14Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(14);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 15 / +1 CASH
                    JMenuItem reelRouletteSpin15Mi = new JMenuItem("ReelRoulette Spin 15 : +1 Cash", musicIcon);

                    reelRouletteSpin15Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(15);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 16 / +1 FEATURES
                    JMenuItem reelRouletteSpin16Mi = new JMenuItem("ReelRoulette Spin 16 : +1 Features", musicIcon);

                    reelRouletteSpin16Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(16);
                        }

                    });
                    
                    //DEV : MACHINE : REELS : REEL ROULETTE : SPIN 17 / +3 CASH
                    JMenuItem reelRouletteSpin17Mi = new JMenuItem("ReelRoulette Spin 17 : +3 Cash", musicIcon);

                    reelRouletteSpin17Mi.addActionListener(new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            game.machine.reels.spinRoulette(17);
                        }

                    });
                    
                    
                    
                reel1Menu.add(reel1Spin0Mi);
                reel1Menu.add(reel1Spin2Mi);
                reel1Menu.add(reel1Spin4Mi);
                reel1Menu.add(reel1Spin6Mi);
                reel1Menu.add(reel1Spin8Mi);
                reel1Menu.add(reel1Spin10Mi);
                reel1Menu.add(reel1Spin12Mi);
                reel1Menu.add(reel1Spin14Mi);
                reel1Menu.add(reel1Spin16Mi);
                reel1Menu.add(reel1Spin18Mi);
                reel1Menu.add(reel1Spin20Mi);
                reel1Menu.add(reel1Spin22Mi);
                reel1Menu.add(reel1Spin24Mi);
                reel1Menu.add(reel1Spin26Mi);
                reel1Menu.add(reel1Spin28Mi);
                reel1Menu.add(reel1Spin30Mi);
                
                reel2Menu.add(reel2Spin0Mi);
                reel2Menu.add(reel2Spin2Mi);
                reel2Menu.add(reel2Spin4Mi);
                reel2Menu.add(reel2Spin6Mi);
                reel2Menu.add(reel2Spin8Mi);
                reel2Menu.add(reel2Spin10Mi);
                reel2Menu.add(reel2Spin12Mi);
                reel2Menu.add(reel2Spin14Mi);
                reel2Menu.add(reel2Spin16Mi);
                reel2Menu.add(reel2Spin18Mi);
                reel2Menu.add(reel2Spin20Mi);
                reel2Menu.add(reel2Spin22Mi);
                reel2Menu.add(reel2Spin24Mi);
                reel2Menu.add(reel2Spin26Mi);
                reel2Menu.add(reel2Spin28Mi);
                reel2Menu.add(reel2Spin30Mi);
                
                reel3Menu.add(reel3Spin0Mi);
                reel3Menu.add(reel3Spin2Mi);
                reel3Menu.add(reel3Spin4Mi);
                reel3Menu.add(reel3Spin6Mi);
                reel3Menu.add(reel3Spin8Mi);
                reel3Menu.add(reel3Spin10Mi);
                reel3Menu.add(reel3Spin12Mi);
                reel3Menu.add(reel3Spin14Mi);
                reel3Menu.add(reel3Spin16Mi);
                reel3Menu.add(reel3Spin18Mi);
                reel3Menu.add(reel3Spin20Mi);
                reel3Menu.add(reel3Spin22Mi);
                reel3Menu.add(reel3Spin24Mi);
                reel3Menu.add(reel3Spin26Mi);
                reel3Menu.add(reel3Spin28Mi);
                reel3Menu.add(reel3Spin30Mi);
                
                reelHiLoMenu.add(reelHiLoSpin0Mi);
                reelHiLoMenu.add(reelHiLoSpin2Mi);
                reelHiLoMenu.add(reelHiLoSpin4Mi);
                reelHiLoMenu.add(reelHiLoSpin6Mi);
                reelHiLoMenu.add(reelHiLoSpin8Mi);
                reelHiLoMenu.add(reelHiLoSpin9Mi);
                reelHiLoMenu.add(reelHiLoSpin11Mi);
                reelHiLoMenu.add(reelHiLoSpin13Mi);
                reelHiLoMenu.add(reelHiLoSpin15Mi);
                reelHiLoMenu.add(reelHiLoSpin17Mi);
                reelHiLoMenu.add(reelHiLoSpin19Mi);
                reelHiLoMenu.add(reelHiLoSpin21Mi);
                
                reelRouletteMenu.add(reelRouletteSpin0Mi);
                reelRouletteMenu.add(reelRouletteSpin1Mi);
                reelRouletteMenu.add(reelRouletteSpin2Mi);
                reelRouletteMenu.add(reelRouletteSpin3Mi);
                reelRouletteMenu.add(reelRouletteSpin4Mi);
                reelRouletteMenu.add(reelRouletteSpin5Mi);
                reelRouletteMenu.add(reelRouletteSpin6Mi);
                reelRouletteMenu.add(reelRouletteSpin7Mi);
                reelRouletteMenu.add(reelRouletteSpin8Mi);
                reelRouletteMenu.add(reelRouletteSpin9Mi);
                reelRouletteMenu.add(reelRouletteSpin10Mi);
                reelRouletteMenu.add(reelRouletteSpin11Mi);
                reelRouletteMenu.add(reelRouletteSpin12Mi);
                reelRouletteMenu.add(reelRouletteSpin13Mi);
                reelRouletteMenu.add(reelRouletteSpin14Mi);
                reelRouletteMenu.add(reelRouletteSpin15Mi);
                reelRouletteMenu.add(reelRouletteSpin16Mi);
                reelRouletteMenu.add(reelRouletteSpin17Mi);
                
                allReelsMenu.add(defaultReelsAllMi);
                allReelsMenu.add(holdOnMi);
                allReelsMenu.add(cancelHoldsMi);
                allReelsMenu.add(superHoldOnMi);
                allReelsMenu.add(cancelSuperHoldsMi);
                allReelsMenu.add(nudgeOnMi);
                allReelsMenu.add(cancelNudgesMi);
                allReelsMenu.add(reelsForwardMi);
                allReelsMenu.add(reelsReverseMi);
                allReelsMenu.add(reelsWinSpinCherriesMi);
                allReelsMenu.add(reelsWinSpinMixed7sMi);
                allReelsMenu.add(reelsWinSpinGreenBarsMi);
                allReelsMenu.add(reelsWinSpinRedBarsMi);
                allReelsMenu.add(reelsWinSpinGoldBarsMi);
                allReelsMenu.add(reelsWinSpinBlue7sMi);
                allReelsMenu.add(reelsWinSpinRed7sMi);
                allReelsMenu.add(reelsWinSpinGold7sMi);
                allReelsMenu.add(reelsWinSpinGoldBellsMi);
                
                reelsMenu.add(allReelsMenu);
                reelsMenu.add(reel1Menu);
                reelsMenu.add(reel2Menu);
                reelsMenu.add(reel3Menu);
                reelsMenu.add(reelHiLoMenu);
                reelsMenu.add(reelRouletteMenu);
                
                
                
                
                
                
        //Lights Menu******************************************************/
        //DEV : LIGHTS
        JMenu lightsMenu = new JMenu("Lights:");
        
            //DEV : LIGHTS : RANDOM ALL
            JCheckBoxMenuItem randomAllMi = new JCheckBoxMenuItem("Random All Illuminated", musicIcon);

            randomAllMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        game.machine.execute("RANDOM_LIGHTS_ALL_ON");
                    } else {
                        game.machine.execute("RANDOM_LIGHTS_ALL_OFF");
                    }

                }

            });
        
            //DEV : LIGHTS : CASH
            JMenu cashMenu = new JMenu("Cash:");
            
                //DEV : LIGHTS : CASH : LOSE
                JCheckBoxMenuItem loseMi = new JCheckBoxMenuItem("Lose Illuminated", musicIcon);

                loseMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(21).getText(), true);
                        } else {
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(21).getText(), false);
                        }

                    }

                });
        
                //DEV : LIGHTS : CASH : TURBO GAMBLE
                JCheckBoxMenuItem turboMi = new JCheckBoxMenuItem("Turbo Gamble Illuminated", musicIcon);

                turboMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(22).getText(), true);
                        } else {
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(22).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : TAKE CASH
                JCheckBoxMenuItem takeCashMi = new JCheckBoxMenuItem("Take Cash Illuminated", musicIcon);

                takeCashMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £1
                JCheckBoxMenuItem pound1Mi = new JCheckBoxMenuItem("£1 Illuminated", musicIcon);

                pound1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£1 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(0).getText(), true);
                            
                            //£1 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(12).getText(), true);
                            
                            //Lower Cherry Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(23).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(24).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(25).getText(), true);
                        } else {
                            //£1 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(0).getText(), false);
                            
                            //£1 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(12).getText(), false);
                            
                            //Lower Cherry Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(23).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(24).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(25).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £2
                JCheckBoxMenuItem pound2Mi = new JCheckBoxMenuItem("£2 Illuminated", musicIcon);

                pound2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£2 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(1).getText(), true);
                            
                            //£2 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(13).getText(), true);
                            
                            //Lower Mixed7s Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(29).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(30).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(31).getText(), true);
                        } else {
                            //£2 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(1).getText(), false);
                            
                            //£2 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(13).getText(), false);
                            
                            //Lower Mixed7s Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(29).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(30).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(31).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £3
                JCheckBoxMenuItem pound3Mi = new JCheckBoxMenuItem("£3 Illuminated", musicIcon);

                pound3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£3 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(2).getText(), true);
                            
                            //£3 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(14).getText(), true);
                            
                            //Lower GreenBAR Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(41).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(42).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(43).getText(), true);
                        } else {
                            //£3 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(2).getText(), false);
                            
                            //£3 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(14).getText(), false);
                            
                            //Lower GreenBAR Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(41).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(42).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(43).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £4
                JCheckBoxMenuItem pound4Mi = new JCheckBoxMenuItem("£4 Illuminated", musicIcon);

                pound4Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£4 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(3).getText(), true);
                            
                            //£4 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(15).getText(), true);
                            
                            //Lower RedBAR Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(44).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(45).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(46).getText(), true);
                        } else {
                            //£4 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(3).getText(), false);
                            
                            //£4 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(15).getText(), false);
                            
                            //Lower RedBAR Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(44).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(45).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(46).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £5
                JCheckBoxMenuItem pound5Mi = new JCheckBoxMenuItem("£5 Illuminated", musicIcon);

                pound5Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£5 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(4).getText(), true);
                            
                            //£5 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(16).getText(), true);
                            
                            //Lower GoldBAR Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(47).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(48).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(49).getText(), true);
                        } else {
                            //£5 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(4).getText(), false);
                            
                            //£5 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(16).getText(), false);
                            
                            //Lower GoldBAR Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(47).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(48).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(49).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £6
                JCheckBoxMenuItem pound6Mi = new JCheckBoxMenuItem("£6 Illuminated", musicIcon);

                pound6Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£6 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(5).getText(), true);                            
                        } else {
                            //£6 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £7
                JCheckBoxMenuItem pound7Mi = new JCheckBoxMenuItem("£7 Illuminated", musicIcon);

                pound7Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£7 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(6).getText(), true);
                            
                            //£7 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(17).getText(), true);
                            
                            //Lower Blue7 Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(35).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(36).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(37).getText(), true);
                        } else {
                            //£7 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(6).getText(), false);
                            
                            //£7 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(17).getText(), false);
                            
                            //Lower Blue7 Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(35).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(36).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(37).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £8
                JCheckBoxMenuItem pound8Mi = new JCheckBoxMenuItem("£8 Illuminated", musicIcon);

                pound8Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£8 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(7).getText(), true);
                        } else {
                            //£8 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £9
                JCheckBoxMenuItem pound9Mi = new JCheckBoxMenuItem("£9 Illuminated", musicIcon);

                pound9Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£9 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(8).getText(), true);
                        } else {
                            //£9 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £10
                JCheckBoxMenuItem pound10Mi = new JCheckBoxMenuItem("£10 Illuminated", musicIcon);

                pound10Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£10 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(9).getText(), true);
                            
                            //£10 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(18).getText(), true);
                            
                            //Lower Red7 Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(38).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(39).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(40).getText(), true);
                        } else {
                            //£10 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(9).getText(), false);
                            
                            //£10 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(18).getText(), false);
                            
                            //Lower Red7 Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(38).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(39).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(40).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £12
                JCheckBoxMenuItem pound12Mi = new JCheckBoxMenuItem("£12 Illuminated", musicIcon);

                pound12Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£12 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(10).getText(), true);
                            
                            //£12 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(19).getText(), true);
                            
                            //Lower Gold7 Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(32).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(33).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(34).getText(), true);
                        } else {
                            //£12 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(10).getText(), false);
                            
                            //£12 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(19).getText(), false);
                            
                            //Lower Gold7 Lights Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(32).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(33).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(34).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : £15
                JCheckBoxMenuItem pound15Mi = new JCheckBoxMenuItem("£15 Illuminated", musicIcon);

                pound15Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            //£15 Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(11).getText(), true);
                            
                            //£15 Lower Cash Light On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(20).getText(), true);
                            
                            //Lower GoldBell Lights On
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(26).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(27).getText(), true);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(28).getText(), true);
                        } else {
                            //£15 Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(11).getText(), false);
                            
                            //£15 Lower Cash Light Off
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(20).getText(), false);
                            
                            //Lower GoldBell Lights Of
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(26).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(27).getText(), false);
                            game.machine.lighter.theCash.setOn(game.machine.lighter.theCash.allCash.get(28).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : ALL CASH
                JCheckBoxMenuItem allCashMi = new JCheckBoxMenuItem("All Cash Illuminated", musicIcon);

                allCashMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CASH_LIGHT_ON");
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), true);
                            loseMi.setSelected(true);
                            turboMi.setSelected(true);
                            takeCashMi.setSelected(true);
                            pound1Mi.setSelected(true);
                            pound2Mi.setSelected(true);
                            pound3Mi.setSelected(true);
                            pound4Mi.setSelected(true);
                            pound5Mi.setSelected(true);
                            pound6Mi.setSelected(true);
                            pound7Mi.setSelected(true);
                            pound8Mi.setSelected(true);
                            pound9Mi.setSelected(true);
                            pound10Mi.setSelected(true);
                            pound12Mi.setSelected(true);
                            pound15Mi.setSelected(true);
                        } else {
                            game.machine.execute("CASH_LIGHT_OFF");
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), false);
                            loseMi.setSelected(false);
                            turboMi.setSelected(false);
                            takeCashMi.setSelected(false);
                            pound1Mi.setSelected(false);
                            pound2Mi.setSelected(false);
                            pound3Mi.setSelected(false);
                            pound4Mi.setSelected(false);
                            pound5Mi.setSelected(false);
                            pound6Mi.setSelected(false);
                            pound7Mi.setSelected(false);
                            pound8Mi.setSelected(false);
                            pound9Mi.setSelected(false);
                            pound10Mi.setSelected(false);
                            pound12Mi.setSelected(false);
                            pound15Mi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : SKILL CASH UP
                JCheckBoxMenuItem skillCashUpMi = new JCheckBoxMenuItem("Skill Cash Up Selected", musicIcon);

                skillCashUpMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CASH_SKILL_UP");
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), true);
                        } else {
                            game.machine.execute("CASH_SKILL_DOWN");
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(4).getText(), false);
                        }

                    }

                });
            
                //DEV : LIGHTS : CASH : SKILLSHOT CASH 
                JCheckBoxMenuItem skillShotCashMi = new JCheckBoxMenuItem("SkillShot Cash Selected", musicIcon);

                skillShotCashMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CASH_SKILLSHOT");
                        }

                    }

                });
                
                //DEV : LIGHTS : CASH : RANDOM CASH 
                JCheckBoxMenuItem randomCashMi = new JCheckBoxMenuItem("Random Cash Selected", musicIcon);

                randomCashMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CASH_RANDOM");
                        }

                    }

                });
                
                
            //DEV : LIGHTS : HILO
            JMenu hiloMenu = new JMenu("HiLo:");
                
                //DEV : LIGHTS : HILO : HI
                JCheckBoxMenuItem hiMi = new JCheckBoxMenuItem("Hi Illuminated", musicIcon);

                hiMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.thehilo.setOn(game.machine.lighter.thehilo.hilos.get(0).getText(), true);
                        } else {
                            game.machine.lighter.thehilo.setOn(game.machine.lighter.thehilo.hilos.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : HILO : LO
                JCheckBoxMenuItem loMi = new JCheckBoxMenuItem("Lo Illuminated", musicIcon);

                loMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.thehilo.setOn(game.machine.lighter.thehilo.hilos.get(1).getText(), true);
                        } else {
                            game.machine.lighter.thehilo.setOn(game.machine.lighter.thehilo.hilos.get(1).getText(), false);
                        }

                    }

                });
            
                //DEV : LIGHTS : HILO : ALL HILO
                JCheckBoxMenuItem allHiloMi = new JCheckBoxMenuItem("All HiLo Illuminated", musicIcon);

                allHiloMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("HILO_LIGHT_ON");
                            hiMi.setSelected(true);
                            loMi.setSelected(true);
                            
                        } else {
                            game.machine.execute("HILO_LIGHT_OFF");
                            hiMi.setSelected(false);
                            loMi.setSelected(false);
                        }

                    }

                });
            
                
                
                
            //DEV : LIGHTS : WINSPINS
            JMenu winSpinsMenu = new JMenu("WinningSpins:");
            
                //DEV : LIGHTS : WINSPINS : 1
                JCheckBoxMenuItem winSpins1Mi = new JCheckBoxMenuItem("Winning Spins 1 Illuminated", musicIcon);

                winSpins1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(1).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(1).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(1).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(1).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : WINSPINS : 2
                JCheckBoxMenuItem winSpins2Mi = new JCheckBoxMenuItem("Winning Spins 2 Illuminated", musicIcon);

                winSpins2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(2).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(3).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(2).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(3).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : WINSPINS : 3
                JCheckBoxMenuItem winSpins3Mi = new JCheckBoxMenuItem("Winning Spins 3 Illuminated", musicIcon);

                winSpins3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(3).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(5).getText(), true);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theWinSpins.setOn(game.machine.lighter.theWinSpins.winspns.get(3).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(5).getText(), false);
                            game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : WINSPINS : ALL WINSPINS
                JCheckBoxMenuItem allWinSpinsMi = new JCheckBoxMenuItem("All Winning Spins Illuminated", musicIcon);

                allWinSpinsMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("WINSPIN_LIGHT_ON");
                            winSpins1Mi.setSelected(true);
                            winSpins2Mi.setSelected(true);
                            winSpins3Mi.setSelected(true);
                        } else {
                            game.machine.execute("WINSPIN_LIGHT_OFF");
                            winSpins1Mi.setSelected(false);
                            winSpins2Mi.setSelected(false);
                            winSpins3Mi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : WINSPINS : SKILL WINSPIN UP
                JCheckBoxMenuItem skillWinSpinUpMi = new JCheckBoxMenuItem("Skill WinSpin Up Selected", musicIcon);

                skillWinSpinUpMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("WINSPIN_SKILL_UP");
                        } else {
                            game.machine.execute("WINSPIN_SKILL_DOWN");
                        }

                    }

                });
            
                //DEV : LIGHTS : WINSPINS : SKILLSHOT WINSPINS
                JCheckBoxMenuItem skillShotWinSpinMi = new JCheckBoxMenuItem("SkillShot WinSpin Selected", musicIcon);

                skillShotWinSpinMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("WINSPIN_SKILLSHOT");
                        }

                    }

                });
                
                //DEV : LIGHTS : WINSPINS : RANDOM WINSPINS 
                JCheckBoxMenuItem randomWinSpinsMi = new JCheckBoxMenuItem("Random WinSpins Selected", musicIcon);

                randomWinSpinsMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("WINSPIN_RANDOM");
                        }

                    }

                });
                
                
                
            //DEV : LIGHTS : CRACKPOT
            JMenu crackpotMenu = new JMenu("Crackpot:");
            
                //DEV : LIGHTS : CRACKPOT : C
                JCheckBoxMenuItem crackpotCMi = new JCheckBoxMenuItem("Crackpot C Illuminated", musicIcon);

                crackpotCMi.setSelected(true);
                crackpotCMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(0).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : R
                JCheckBoxMenuItem crackpotRMi = new JCheckBoxMenuItem("Crackpot R Illuminated", musicIcon);

                crackpotRMi.setSelected(true);
                crackpotRMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(1).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : A
                JCheckBoxMenuItem crackpotAMi = new JCheckBoxMenuItem("Crackpot A Illuminated", musicIcon);

                crackpotAMi.setSelected(true);
                crackpotAMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : C2
                JCheckBoxMenuItem crackpotC2Mi = new JCheckBoxMenuItem("Crackpot C2 Illuminated", musicIcon);

                crackpotC2Mi.setSelected(true);
                crackpotC2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(3).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : K
                JCheckBoxMenuItem crackpotKMi = new JCheckBoxMenuItem("Crackpot K Illuminated", musicIcon);

                crackpotKMi.setSelected(true);
                crackpotKMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : P
                JCheckBoxMenuItem crackpotPMi = new JCheckBoxMenuItem("Crackpot P Illuminated", musicIcon);

                crackpotPMi.setSelected(true);
                crackpotPMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : O
                JCheckBoxMenuItem crackpotOMi = new JCheckBoxMenuItem("Crackpot O Illuminated", musicIcon);

                crackpotOMi.setSelected(true);
                crackpotOMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : T
                JCheckBoxMenuItem crackpotTMi = new JCheckBoxMenuItem("Crackpot T Illuminated", musicIcon);

                crackpotTMi.setSelected(true);
                crackpotTMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theCrackpot.setOn(game.machine.lighter.theCrackpot.crackpots.get(7).getText(), false);
                        }

                    }

                });
            
                //DEV : LIGHTS : CRACKPOT : ALL CRACKPOT
                JCheckBoxMenuItem allCrackpotMi = new JCheckBoxMenuItem("All Crackpot Illuminated", musicIcon);

                allCrackpotMi.setSelected(true);
                allCrackpotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CRACKPOT_LIGHT_ON");
                            crackpotCMi.setSelected(true);
                            crackpotRMi.setSelected(true);
                            crackpotAMi.setSelected(true);
                            crackpotC2Mi.setSelected(true);
                            crackpotKMi.setSelected(true);
                            crackpotPMi.setSelected(true);
                            crackpotOMi.setSelected(true);
                            crackpotTMi.setSelected(true);
                        } else {
                            game.machine.execute("CRACKPOT_LIGHT_OFF");
                            crackpotCMi.setSelected(false);
                            crackpotRMi.setSelected(false);
                            crackpotAMi.setSelected(false);
                            crackpotC2Mi.setSelected(false);
                            crackpotKMi.setSelected(false);
                            crackpotPMi.setSelected(false);
                            crackpotOMi.setSelected(false);
                            crackpotTMi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : SKILL CRACKPOT FORWARD
                JCheckBoxMenuItem skillCrackpotForwardMi = new JCheckBoxMenuItem("Skill Crackpot Forward Illuminated", musicIcon);

                //allCrackpotMi.setSelected(true);
                skillCrackpotForwardMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CRACKPOT_SKILL_FORWARD");
                        } else {
                            game.machine.execute("CRACKPOT_SKILL_REVERSE");
                        }

                    }

                });
                
                //DEV : LIGHTS : CRACKPOT : SKILLSHOT CRACKPOT 
                JCheckBoxMenuItem skillShotCrackpotMi = new JCheckBoxMenuItem("SkillShot Crackpot Selected", musicIcon);

                skillShotCrackpotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CRACKPOT_SKILLSHOT");
                        }

                    }

                });
            
                //DEV : LIGHTS : CRACKPOT : RANDOM CRACKPOT 
                JCheckBoxMenuItem randomCrackpotMi = new JCheckBoxMenuItem("Random Crackpot Selected", musicIcon);

                randomCrackpotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("CRACKPOT_RANDOM");
                        }

                    }

                });
                
                
            //DEV : LIGHTS : FEATURES
            JMenu featuresMenu = new JMenu("Features:");
            
                //DEV : LIGHTS : FEATURES : TAKE FEATURE
                JCheckBoxMenuItem takeFeaturesMi = new JCheckBoxMenuItem("Take Features Illuminated", musicIcon);

                takeFeaturesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 1(Nearest Win)
                JCheckBoxMenuItem features1Mi = new JCheckBoxMenuItem("Features 1 (Nearest Win) Illuminated", musicIcon);

                features1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(0).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 2(Double or Nothing)
                JCheckBoxMenuItem features2Mi = new JCheckBoxMenuItem("Features 2 (Double or Nothing) Illuminated", musicIcon);

                features2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(1).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 3(Win Spins)
                JCheckBoxMenuItem features3Mi = new JCheckBoxMenuItem("Features 3 (Win Spins) Illuminated", musicIcon);

                features3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 4(Mystery Win)
                JCheckBoxMenuItem features4Mi = new JCheckBoxMenuItem("Features 4 (Mystery Win) Illuminated", musicIcon);

                features4Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(3).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 5(Skill Cash)
                JCheckBoxMenuItem features5Mi = new JCheckBoxMenuItem("Features 5 (Skill Cash) Illuminated", musicIcon);

                features5Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 6(BAR Stoppa)
                JCheckBoxMenuItem features6Mi = new JCheckBoxMenuItem("Features 6 (BAR Stoppa) Illuminated", musicIcon);

                features6Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : FEATURE 7(Crackpot)
                JCheckBoxMenuItem features7Mi = new JCheckBoxMenuItem("Features 7 (Crackpot) Illuminated", musicIcon);

                features7Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theFeatures.setOn(game.machine.lighter.theFeatures.allFeatures.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : ALL FEATURES
                JCheckBoxMenuItem allFeaturesMi = new JCheckBoxMenuItem("All Features Illuminated", musicIcon);

                allFeaturesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("FEATURE_LIGHT_ON");
                            takeFeaturesMi.setSelected(true);
                            features1Mi.setSelected(true);
                            features2Mi.setSelected(true);
                            features3Mi.setSelected(true);
                            features4Mi.setSelected(true);
                            features5Mi.setSelected(true);
                            features6Mi.setSelected(true);
                            features7Mi.setSelected(true);
                        } else {
                            game.machine.execute("FEATURE_LIGHT_OFF");
                            takeFeaturesMi.setSelected(false);
                            features1Mi.setSelected(false);
                            features2Mi.setSelected(false);
                            features3Mi.setSelected(false);
                            features4Mi.setSelected(false);
                            features5Mi.setSelected(false);
                            features6Mi.setSelected(false);
                            features7Mi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : SKILL FEATURES UP
                JCheckBoxMenuItem skillFeaturesUpMi = new JCheckBoxMenuItem("Skill Features Up Illuminated", musicIcon);

                skillFeaturesUpMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("FEATURE_SKILL_UP");
                        } else {
                            game.machine.execute("FEATURE_SKILL_DOWN");
                        }

                    }

                });
                
                //DEV : LIGHTS : FEATURES : SKILLSHOT FEATURES
                JCheckBoxMenuItem skillShotFeaturesMi = new JCheckBoxMenuItem("SkillShot Features Illuminated", musicIcon);

                skillShotFeaturesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("FEATURE_SKILLSHOT");
                        }

                    }

                });
            
                //DEV : LIGHTS : FEATURE : RANDOM FEATURE 
                JCheckBoxMenuItem randomFeaturesMi = new JCheckBoxMenuItem("Random Feature Selected", musicIcon);

                randomFeaturesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("FEATURE_RANDOM");
                        }

                    }

                });
                
                
            //DEV : LIGHTS : NUDGES
            JMenu nudgesMenu = new JMenu("Nudges:");
            
                //DEV : LIGHTS : NUDGES : TAKE NUDGES
                JCheckBoxMenuItem takeNudgesMi = new JCheckBoxMenuItem("Take Nudges Illuminated", musicIcon);

                takeNudgesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(10).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(10).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE
//                JCheckBoxMenuItem nudgeMi = new JCheckBoxMenuItem("Nudge Illuminated", musicIcon);
//
//                nudgeMi.addItemListener(new ItemListener() {
//
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//
//                        if (e.getStateChange() == ItemEvent.SELECTED) {
//                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(11).getText(), true);
//                        } else {
//                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(11).getText(), false);
//                        }
//
//                    }
//
//                });
                
                //DEV : LIGHTS : NUDGES : NUDGES
//                JCheckBoxMenuItem nudgesMi = new JCheckBoxMenuItem("Nudges Illuminated", musicIcon);
//
//                nudgesMi.addItemListener(new ItemListener() {
//
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//
//                        if (e.getStateChange() == ItemEvent.SELECTED) {
//                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(12).getText(), true);
//                        } else {
//                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(12).getText(), false);
//                        }
//
//                    }
//
//                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 1
                JCheckBoxMenuItem nudge1Mi = new JCheckBoxMenuItem("Nudge 1 Illuminated", musicIcon);

                nudge1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(0).getText(), true);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(13).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(0).getText(), false);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(13).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 2
                JCheckBoxMenuItem nudge2Mi = new JCheckBoxMenuItem("Nudge 2 Illuminated", musicIcon);

                nudge2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(1).getText(), true);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(14).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(1).getText(), false);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(14).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 3
                JCheckBoxMenuItem nudge3Mi = new JCheckBoxMenuItem("Nudge 3 Illuminated", musicIcon);

                nudge3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(2).getText(), true);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(15).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(2).getText(), false);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(15).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 4
                JCheckBoxMenuItem nudge4Mi = new JCheckBoxMenuItem("Nudge 4 Illuminated", musicIcon);

                nudge4Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(3).getText(), true);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(16).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(3).getText(), false);
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(16).getText(), false);
                        }

                    }

                });
            
                //DEV : LIGHTS : NUDGES : NUDGE 5
                JCheckBoxMenuItem nudge5Mi = new JCheckBoxMenuItem("Nudge 5 Illuminated", musicIcon);

                nudge5Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 6
                JCheckBoxMenuItem nudge6Mi = new JCheckBoxMenuItem("Nudge 6 Illuminated", musicIcon);

                nudge6Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 7
                JCheckBoxMenuItem nudge7Mi = new JCheckBoxMenuItem("Nudge 7 Illuminated", musicIcon);

                nudge7Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 8
                JCheckBoxMenuItem nudge8Mi = new JCheckBoxMenuItem("Nudge 8 Illuminated", musicIcon);

                nudge8Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 10
                JCheckBoxMenuItem nudge10Mi = new JCheckBoxMenuItem("Nudge 10 Illuminated", musicIcon);

                nudge10Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(8).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : NUDGE 99
                JCheckBoxMenuItem nudge99Mi = new JCheckBoxMenuItem("Nudge 99 Illuminated", musicIcon);

                nudge99Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(9).getText(), true);
                        } else {
                            game.machine.lighter.theNudges.setOn(game.machine.lighter.theNudges.allNudges.get(9).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : ALL NUDGES
                JCheckBoxMenuItem allNudgesMi = new JCheckBoxMenuItem("All Nudges Illuminated", musicIcon);

                allNudgesMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("NUDGE_LIGHT_ON");
                            takeNudgesMi.setSelected(true);
                            //nudgeMi.setSelected(true);
                            //nudgesMi.setSelected(true);
                            nudge1Mi.setSelected(true);
                            nudge2Mi.setSelected(true);
                            nudge3Mi.setSelected(true);
                            nudge4Mi.setSelected(true);
                            nudge5Mi.setSelected(true);
                            nudge6Mi.setSelected(true);
                            nudge7Mi.setSelected(true);
                            nudge8Mi.setSelected(true);
                            nudge10Mi.setSelected(true);
                            nudge99Mi.setSelected(true);
                        } else {
                            game.machine.execute("NUDGE_LIGHT_OFF");
                            takeNudgesMi.setSelected(false);
                            //nudgeMi.setSelected(false);
                            //nudgesMi.setSelected(false);
                            nudge1Mi.setSelected(false);
                            nudge2Mi.setSelected(false);
                            nudge3Mi.setSelected(false);
                            nudge4Mi.setSelected(false);
                            nudge5Mi.setSelected(false);
                            nudge6Mi.setSelected(false);
                            nudge7Mi.setSelected(false);
                            nudge8Mi.setSelected(false);
                            nudge10Mi.setSelected(false);
                            nudge99Mi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : SKILL NUDGE UP
                JCheckBoxMenuItem skillNudgeUpMi = new JCheckBoxMenuItem("Skill Nudge Up Selected", musicIcon);

                skillNudgeUpMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("NUDGE_SKILL_UP");
                        } else {
                            game.machine.execute("NUDGE_SKILL_DOWN");
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : SKILLSHOT NUDGE
                JCheckBoxMenuItem skillShotNudgeMi = new JCheckBoxMenuItem("SkillShot Nudge Selected", musicIcon);

                skillShotNudgeMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("NUDGE_SKILLSHOT");
                        }

                    }

                });
                
                //DEV : LIGHTS : NUDGES : RANDOM NUDGES 
                JCheckBoxMenuItem randomNudgeMi = new JCheckBoxMenuItem("Random Nudges Selected", musicIcon);

                randomNudgeMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("NUDGE_RANDOM");
                        }

                    }

                });
                
                
                
            //DEV : LIGHTS : SKILLSHOT
            JMenu skillshotMenu = new JMenu("Skillshot:");
            
                //DEV : LIGHTS : SKILLSHOT : S
                JCheckBoxMenuItem skillshotSMi = new JCheckBoxMenuItem("Skillshot S Illuminated", musicIcon);

                skillshotSMi.setSelected(true);
                skillshotSMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(0).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : K
                JCheckBoxMenuItem skillshotKMi = new JCheckBoxMenuItem("Skillshot K Illuminated", musicIcon);

                skillshotKMi.setSelected(true);
                skillshotKMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(1).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : I
                JCheckBoxMenuItem skillshotIMi = new JCheckBoxMenuItem("Skillshot I Illuminated", musicIcon);

                skillshotIMi.setSelected(true);
                skillshotIMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : L1
                JCheckBoxMenuItem skillshotL1Mi = new JCheckBoxMenuItem("Skillshot L1 Illuminated", musicIcon);

                skillshotL1Mi.setSelected(true);
                skillshotL1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(3).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : L2
                JCheckBoxMenuItem skillshotL2Mi = new JCheckBoxMenuItem("Skillshot L2 Illuminated", musicIcon);

                skillshotL2Mi.setSelected(true);
                skillshotL2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : S2
                JCheckBoxMenuItem skillshotS2Mi = new JCheckBoxMenuItem("Skillshot S2 Illuminated", musicIcon);

                skillshotS2Mi.setSelected(true);
                skillshotS2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : H
                JCheckBoxMenuItem skillshotHMi = new JCheckBoxMenuItem("Skillshot H Illuminated", musicIcon);

                skillshotHMi.setSelected(true);
                skillshotHMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : O
                JCheckBoxMenuItem skillshotOMi = new JCheckBoxMenuItem("Skillshot O Illuminated", musicIcon);

                skillshotOMi.setSelected(true);
                skillshotOMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : T
                JCheckBoxMenuItem skillshotTMi = new JCheckBoxMenuItem("Skillshot T Illuminated", musicIcon);

                skillshotTMi.setSelected(true);
                skillshotTMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(8).getText(), true);
                        } else {
                            game.machine.lighter.theSkillshot.setOn(game.machine.lighter.theSkillshot.skills.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : ALL SKILLSHOT
                JCheckBoxMenuItem allSkillshotMi = new JCheckBoxMenuItem("All Skillshot Illuminated", musicIcon);

                allSkillshotMi.setSelected(true);
                allSkillshotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("SKILLSHOT_LIGHT_ON");
                            skillshotSMi.setSelected(true);
                            skillshotKMi.setSelected(true);
                            skillshotIMi.setSelected(true);
                            skillshotL1Mi.setSelected(true);
                            skillshotL2Mi.setSelected(true);
                            skillshotS2Mi.setSelected(true);
                            skillshotHMi.setSelected(true);
                            skillshotOMi.setSelected(true);
                            skillshotTMi.setSelected(true);
                        } else {
                            game.machine.execute("SKILLSHOT_LIGHT_OFF");
                            skillshotSMi.setSelected(false);
                            skillshotKMi.setSelected(false);
                            skillshotIMi.setSelected(false);
                            skillshotL1Mi.setSelected(false);
                            skillshotL2Mi.setSelected(false);
                            skillshotS2Mi.setSelected(false);
                            skillshotHMi.setSelected(false);
                            skillshotOMi.setSelected(false);
                            skillshotTMi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : SKILL SKILLSHOT FORWARD
                JCheckBoxMenuItem skillSkillshotForwardMi = new JCheckBoxMenuItem("Skill Skillshot Forward Selected", musicIcon);

                skillSkillshotForwardMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("SKILLSHOT_SKILL_FORWARD");
                        } else {
                            game.machine.execute("SKILLSHOT_SKILL_REVERSE");
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : SKILL SKILLSHOT
                JCheckBoxMenuItem skillShotSkillShotMi = new JCheckBoxMenuItem("Skill Skillshot Forward Selected", musicIcon);

                skillShotSkillShotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("SKILLSHOT_SKILL_FORWARD");
                        } else {
                            game.machine.execute("SKILLSHOT_SKILL_REVERSE");
                        }

                    }

                });
                
                //DEV : LIGHTS : SKILLSHOT : RANDOM SKILLSHOT 
                JCheckBoxMenuItem randomSkillshotMi = new JCheckBoxMenuItem("Random SkillShot Selected", musicIcon);

                randomSkillshotMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("SKILLSHOT_RANDOM");
                        }

                    }

                });
                
            
                
                
            //DEV : LIGHTS : STATIC
//            JMenu static1Menu = new JMenu("Static:");
//            
//                JCheckBoxMenuItem allStaticMi = new JCheckBoxMenuItem("All Statics Illuminated", musicIcon);
//
//                allStaticMi.addItemListener(new ItemListener() {
//
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//
//                        if (e.getStateChange() == ItemEvent.SELECTED) {
//                            for(int c = 0; c < game.machine.lighter.theStatic.StaticList.size(); c++){
//                                game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(c).getText(), true);
//                            }
//                            winSpins1Mi.setSelected(true);
//                            winSpins2Mi.setSelected(true);
//                            winSpins3Mi.setSelected(true);
//                        } else {
//                            for(int c = 0; c < game.machine.lighter.theStatic.StaticList.size(); c++){
//                                game.machine.lighter.theStatic.setOn(game.machine.lighter.theStatic.StaticList.get(c).getText(), false);
//                            }
//                            winSpins1Mi.setSelected(false);
//                            winSpins2Mi.setSelected(false);
//                            winSpins3Mi.setSelected(false);
//                        }
//
//                    }
//
//                });
            
            //DEV : LIGHTS : TANGODOWN
            JMenu tangoDownMenu = new JMenu("TangoDown Logo:");
                
                //DEV : LIGHTS : TANGODOWN : T
                JCheckBoxMenuItem tangoDownTMi = new JCheckBoxMenuItem("TangoDown T Illuminated", musicIcon);

                tangoDownTMi.setSelected(true);
                tangoDownTMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(0).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : A
                JCheckBoxMenuItem tangoDownAMi = new JCheckBoxMenuItem("TangoDown A Illuminated", musicIcon);

                tangoDownAMi.setSelected(true);
                tangoDownAMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(1).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : N
                JCheckBoxMenuItem tangoDownNMi = new JCheckBoxMenuItem("TangoDown N Illuminated", musicIcon);

                tangoDownNMi.setSelected(true);
                tangoDownNMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : G
                JCheckBoxMenuItem tangoDownGMi = new JCheckBoxMenuItem("TangoDown G Illuminated", musicIcon);

                tangoDownGMi.setSelected(true);
                tangoDownGMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(3).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : O1
                JCheckBoxMenuItem tangoDownO1Mi = new JCheckBoxMenuItem("TangoDown O1 Illuminated", musicIcon);

                tangoDownO1Mi.setSelected(true);
                tangoDownO1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : D
                JCheckBoxMenuItem tangoDownDMi = new JCheckBoxMenuItem("TangoDown D Illuminated", musicIcon);

                tangoDownDMi.setSelected(true);
                tangoDownDMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : O2
                JCheckBoxMenuItem tangoDownO2Mi = new JCheckBoxMenuItem("TangoDown O2 Illuminated", musicIcon);

                tangoDownO2Mi.setSelected(true);
                tangoDownO2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : W
                JCheckBoxMenuItem tangoDownWMi = new JCheckBoxMenuItem("TangoDown W Illuminated", musicIcon);

                tangoDownWMi.setSelected(true);
                tangoDownWMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : N2
                JCheckBoxMenuItem tangoDownN2Mi = new JCheckBoxMenuItem("TangoDown N2 Illuminated", musicIcon);

                tangoDownN2Mi.setSelected(true);
                tangoDownN2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(8).getText(), true);
                        } else {
                            game.machine.lighter.theTangoDown.setOn(game.machine.lighter.theTangoDown.tangos.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWN : ALL TANGODOWN
                JCheckBoxMenuItem allTangoDownMi = new JCheckBoxMenuItem("All TangoDown Logo Illuminated", musicIcon);

                allTangoDownMi.setSelected(true);
                allTangoDownMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("TANGODOWN_LIGHT_ON");
                            tangoDownTMi.setSelected(true);
                            tangoDownAMi.setSelected(true);
                            tangoDownNMi.setSelected(true);
                            tangoDownGMi.setSelected(true);
                            tangoDownO1Mi.setSelected(true);
                            tangoDownDMi.setSelected(true);
                            tangoDownO2Mi.setSelected(true);
                            tangoDownWMi.setSelected(true);
                            tangoDownN2Mi.setSelected(true);
                        } else {
                            game.machine.execute("TANGODOWN_LIGHT_OFF");
                            tangoDownTMi.setSelected(true);
                            tangoDownAMi.setSelected(true);
                            tangoDownNMi.setSelected(true);
                            tangoDownGMi.setSelected(true);
                            tangoDownO1Mi.setSelected(true);
                            tangoDownDMi.setSelected(true);
                            tangoDownO2Mi.setSelected(true);
                            tangoDownWMi.setSelected(true);
                            tangoDownN2Mi.setSelected(true);
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWNLOGO : SKILL TANGODOWN FORWARD
                JCheckBoxMenuItem skillTangoDownForwardMi = new JCheckBoxMenuItem("Skill Skillshot Forward Selected", musicIcon);

                skillTangoDownForwardMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("TANGODOWN_SKILL_FORWARD");
                        } else {
                            game.machine.execute("TANGODOWN_SKILL_REVERSE");
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWNLOGO : SKILLSHOT TANGODOWN
                JCheckBoxMenuItem skillShotTangoDownMi = new JCheckBoxMenuItem("Skillshot TangoDown Selected", musicIcon);

                skillShotTangoDownMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("TANGODOWN_SKILLSHOT");
                        }

                    }

                });
                
                //DEV : LIGHTS : TANGODOWNLOGO : RANDOM TANGODOWN 
                JCheckBoxMenuItem randomTangoDownMi = new JCheckBoxMenuItem("Random TangoDown Selected", musicIcon);

                randomTangoDownMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("TANGODOWN_RANDOM");
                        }

                    }

                });
            
                
                
            //DEV : LIGHTS : ROULETTE
            JMenu rouletteMenu = new JMenu("Roulette:");
            
                //DEV : LIGHTS : ROULETTE : ROULETTE 1(+2 Features)
                JCheckBoxMenuItem roulette1Mi = new JCheckBoxMenuItem("Roulette 1 (+2 Features) Illuminated", musicIcon);

                roulette1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(0).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 2(+3 Nudges)
                JCheckBoxMenuItem roulette2Mi = new JCheckBoxMenuItem("Roulette 2 (+3 Nudges) Illuminated", musicIcon);

                roulette2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(1).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 3(+1 Cash)
                JCheckBoxMenuItem roulette3Mi = new JCheckBoxMenuItem("Roulette 3 (+1 Cash) Illuminated", musicIcon);

                roulette3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(2).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 4(+2 Nudges)
                JCheckBoxMenuItem roulette4Mi = new JCheckBoxMenuItem("Roulette 4 (+2 Nudges) Illuminated", musicIcon);

                roulette4Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(3).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 5(+3 Features)
                JCheckBoxMenuItem roulette5Mi = new JCheckBoxMenuItem("Roulette 5 (+3 Features) Illuminated", musicIcon);

                roulette5Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(4).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 6(+2 Nudges)
                JCheckBoxMenuItem roulette6Mi = new JCheckBoxMenuItem("Roulette 6 (+2 Nudges) Illuminated", musicIcon);

                roulette6Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(5).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 7(+3 Cash)
                JCheckBoxMenuItem roulette7Mi = new JCheckBoxMenuItem("Roulette 7 (+3 Cash) Illuminated", musicIcon);

                roulette7Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(6).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 8(+Win Spin)
                JCheckBoxMenuItem roulette8Mi = new JCheckBoxMenuItem("Roulette 8 (+Win Spin) Illuminated", musicIcon);

                roulette8Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(7).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 9(Game Over)
                JCheckBoxMenuItem roulette9Mi = new JCheckBoxMenuItem("Roulette 9 (Game Over) Illuminated", musicIcon);

                roulette9Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(8).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 10(+2 Cash)
                JCheckBoxMenuItem roulette10Mi = new JCheckBoxMenuItem("Roulette 10 (+2 Cash) Illuminated", musicIcon);

                roulette10Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(9).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(9).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 11(+1 Nudges)
                JCheckBoxMenuItem roulette11Mi = new JCheckBoxMenuItem("Roulette 11 (+1 Nudges) Illuminated", musicIcon);

                roulette11Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(10).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(10).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 12(+1 Features)
                JCheckBoxMenuItem roulette12Mi = new JCheckBoxMenuItem("Roulette 12 (+1 Features) Illuminated", musicIcon);

                roulette12Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(11).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(11).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 13(+2 Nudges)
                JCheckBoxMenuItem roulette13Mi = new JCheckBoxMenuItem("Roulette 13 (+2 Nudges) Illuminated", musicIcon);

                roulette13Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(12).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(12).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 14(+1 Features)
                JCheckBoxMenuItem roulette14Mi = new JCheckBoxMenuItem("Roulette 14 (+1 Features) Illuminated", musicIcon);

                roulette14Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(13).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(13).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 15(+1 Nudges)
                JCheckBoxMenuItem roulette15Mi = new JCheckBoxMenuItem("Roulette 15 (+1 Nudges) Illuminated", musicIcon);

                roulette15Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(14).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(14).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 16(+1 Cash)
                JCheckBoxMenuItem roulette16Mi = new JCheckBoxMenuItem("Roulette 16 (+1 Cash) Illuminated", musicIcon);

                roulette16Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(15).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(15).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 17(+1 Features)
                JCheckBoxMenuItem roulette17Mi = new JCheckBoxMenuItem("Roulette 17 (+1 Features) Illuminated", musicIcon);

                roulette17Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(16).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(16).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ROULETTE 18(+3 Cash)
                JCheckBoxMenuItem roulette18Mi = new JCheckBoxMenuItem("Roulette 18 (+3 Cash) Illuminated", musicIcon);

                roulette18Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(17).getText(), true);
                        } else {
                            game.machine.lighter.theRoulette.setOn(game.machine.lighter.theRoulette.allRoulette.get(17).getText(), false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : ALL ROULETTE
                JCheckBoxMenuItem allRouletteMi = new JCheckBoxMenuItem("All Roulette Illuminated", musicIcon);

                allRouletteMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("ROULETTE_LIGHT_ON");
                            roulette1Mi.setSelected(true);
                            roulette2Mi.setSelected(true);
                            roulette3Mi.setSelected(true);
                            roulette4Mi.setSelected(true);
                            roulette5Mi.setSelected(true);
                            roulette6Mi.setSelected(true);
                            roulette7Mi.setSelected(true);
                            roulette8Mi.setSelected(true);
                            roulette9Mi.setSelected(true);
                            roulette10Mi.setSelected(true);
                            roulette11Mi.setSelected(true);
                            roulette12Mi.setSelected(true);
                            roulette13Mi.setSelected(true);
                            roulette14Mi.setSelected(true);
                            roulette15Mi.setSelected(true);
                            roulette16Mi.setSelected(true);
                            roulette17Mi.setSelected(true);
                            roulette18Mi.setSelected(true);
                        } else {
                            game.machine.execute("ROULETTE_LIGHT_OFF");
                            roulette1Mi.setSelected(false);
                            roulette2Mi.setSelected(false);
                            roulette3Mi.setSelected(false);
                            roulette4Mi.setSelected(false);
                            roulette5Mi.setSelected(false);
                            roulette6Mi.setSelected(false);
                            roulette7Mi.setSelected(false);
                            roulette8Mi.setSelected(false);
                            roulette9Mi.setSelected(false);
                            roulette10Mi.setSelected(false);
                            roulette11Mi.setSelected(false);
                            roulette12Mi.setSelected(false);
                            roulette13Mi.setSelected(false);
                            roulette14Mi.setSelected(false);
                            roulette15Mi.setSelected(false);
                            roulette16Mi.setSelected(false);
                            roulette17Mi.setSelected(false);
                            roulette18Mi.setSelected(false);
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : SKILL ROULETTE CLOCKWISE
                JCheckBoxMenuItem skillRouletteCWMi = new JCheckBoxMenuItem("Skill Roulette Clock-wise Illuminated", musicIcon);

                skillRouletteCWMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("ROULETTE_SKILL_CW");
                        } else {
                            game.machine.execute("ROULETTE_SKILL_ACW");
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : SKILLSHOT ROULETTE
                JCheckBoxMenuItem skillShotRouletteMi = new JCheckBoxMenuItem("Skillshot Roulette Illuminated", musicIcon);

                skillRouletteCWMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("ROULETTE_SKILLSHOT");
                        }

                    }

                });
                
                //DEV : LIGHTS : ROULETTE : RANDOM ROULETTE 
                JCheckBoxMenuItem randomRouletteMi = new JCheckBoxMenuItem("Random Roulette Selected", musicIcon);

                randomRouletteMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("ROULETTE_RANDOM");
                        }

                    }

                });
        
                
                
        //Digits Menu******************************************************/
        //DEV : DIGITS
        JMenu digitsMenu = new JMenu("Digits:");
        
            //DEV : DIGITS : BANK DIGITS
            JMenu bankDigitsMenu = new JMenu("Bank Digits:");
            
            //DEV : DIGITS : BANK TEXT
            JMenu bankTextMenu = new JMenu("Bank Text:");
            
                //DEV : DIGITS : BANK TEXT : BANK TEXT 1(Game Over)
                JCheckBoxMenuItem bankText1Mi = new JCheckBoxMenuItem("Bank Text 1 (Game Over) Illuminated", musicIcon);

                bankText1Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(0).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(0).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 2(You Won!)
                JCheckBoxMenuItem bankText2Mi = new JCheckBoxMenuItem("Bank Text 2 (You Won!) Illuminated", musicIcon);

                bankText2Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(1).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(1).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 3(Repeat)
                JCheckBoxMenuItem bankText3Mi = new JCheckBoxMenuItem("Bank Text 3 (Repeat) Illuminated", musicIcon);

                bankText3Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(2).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(2).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 4(RepeatY)
                JCheckBoxMenuItem bankText4Mi = new JCheckBoxMenuItem("Bank Text 4 (RepeatY) Illuminated", musicIcon);

                bankText4Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(3).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(3).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 5(RepeatN)
                JCheckBoxMenuItem bankText5Mi = new JCheckBoxMenuItem("Bank Text 5 (RepeatN) Illuminated", musicIcon);

                bankText5Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(4).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(4).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 6(Lose)
                JCheckBoxMenuItem bankText6Mi = new JCheckBoxMenuItem("Bank Text 6 (Lose) Illuminated", musicIcon);

                bankText6Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(5).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(5).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 7(NudgeNow)
                JCheckBoxMenuItem bankText7Mi = new JCheckBoxMenuItem("Bank Text 7 (Nudge Now) Illuminated", musicIcon);

                bankText7Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(6).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(6).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 8(Insert Coin)
                JCheckBoxMenuItem bankText8Mi = new JCheckBoxMenuItem("Bank Text 8 (Insert Coin) Illuminated", musicIcon);

                bankText8Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(7).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(7).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 9(Gamble)
                JCheckBoxMenuItem bankText9Mi = new JCheckBoxMenuItem("Bank Text 9 (Gamble) Illuminated", musicIcon);

                bankText9Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(8).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(8).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 10(Super Hold)
                JCheckBoxMenuItem bankText10Mi = new JCheckBoxMenuItem("Bank Text 10 (Super Hold) Illuminated", musicIcon);

                bankText10Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(9).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(9).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 11(Collect Cash)
                JCheckBoxMenuItem bankText11Mi = new JCheckBoxMenuItem("Bank Text 11 (Collect Cash) Illuminated", musicIcon);

                bankText11Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(10).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(10).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 12(Collect Nudges)
                JCheckBoxMenuItem bankText12Mi = new JCheckBoxMenuItem("Bank Text 12 (Collect Nudges) Illuminated", musicIcon);

                bankText12Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(11).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(11).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 13(Collect Feature)
                JCheckBoxMenuItem bankText13Mi = new JCheckBoxMenuItem("Bank Text 13 (Collect Feature) Illuminated", musicIcon);

                bankText13Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(12).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(12).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 14(Jackpot)
                JCheckBoxMenuItem bankText14Mi = new JCheckBoxMenuItem("Bank Text 14 (Jackpot) Illuminated", musicIcon);

                bankText14Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(13).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(13).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 15(Skillshot)
                JCheckBoxMenuItem bankText15Mi = new JCheckBoxMenuItem("Bank Text 15 (Skillshot) Illuminated", musicIcon);

                bankText15Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(14).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(14).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 16(Let Em Spin)
                JCheckBoxMenuItem bankText16Mi = new JCheckBoxMenuItem("Bank Text 16 (Let Em Spin) Illuminated", musicIcon);

                bankText16Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(15).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(15).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : BANK TEXT 17(Plus)
                JCheckBoxMenuItem bankText17Mi = new JCheckBoxMenuItem("Bank Text 17 (Plus) Illuminated", musicIcon);

                bankText17Mi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(16).getText(), true);
                        } else {
                            game.machine.digits.theBankText.setOn(game.machine.digits.theBankText.allbanktxts.get(16).getText(), false);
                        }

                    }

                });
                
                //DEV : DIGITS : BANK TEXT : ALL BANK TEXT
                JCheckBoxMenuItem allBankTextMi = new JCheckBoxMenuItem("All Bank Text Illuminated", musicIcon);

                allBankTextMi.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            game.machine.execute("BANKTEXT_DIGIT_ON");
                            bankText1Mi.setSelected(true);
                            bankText2Mi.setSelected(true);
                            bankText3Mi.setSelected(true);
                            bankText4Mi.setSelected(true);
                            bankText5Mi.setSelected(true);
                            bankText6Mi.setSelected(true);
                            bankText7Mi.setSelected(true);
                            bankText8Mi.setSelected(true);
                            bankText9Mi.setSelected(true);
                            bankText10Mi.setSelected(true);
                            bankText11Mi.setSelected(true);
                            bankText12Mi.setSelected(true);
                            bankText13Mi.setSelected(true);
                            bankText14Mi.setSelected(true);
                            bankText15Mi.setSelected(true);
                            bankText16Mi.setSelected(true);
                            bankText17Mi.setSelected(true);
                        } else {
                            game.machine.execute("BANKTEXT_DIGIT_OFF");
                            bankText1Mi.setSelected(false);
                            bankText2Mi.setSelected(false);
                            bankText3Mi.setSelected(false);
                            bankText4Mi.setSelected(false);
                            bankText5Mi.setSelected(false);
                            bankText6Mi.setSelected(false);
                            bankText7Mi.setSelected(false);
                            bankText8Mi.setSelected(false);
                            bankText9Mi.setSelected(false);
                            bankText10Mi.setSelected(false);
                            bankText11Mi.setSelected(false);
                            bankText12Mi.setSelected(false);
                            bankText13Mi.setSelected(false);
                            bankText14Mi.setSelected(false);
                            bankText15Mi.setSelected(false);
                            bankText16Mi.setSelected(false);
                            bankText17Mi.setSelected(false);
                        }

                    }

                });
            
                
            //DEV : DIGITS : CREDIT DIGITS
            JMenu creditDigitsMenu = new JMenu("Credit Digits:");
            
                //DEV : DIGITS : CREDIT DIGITS : RESET CREDIT
                JMenuItem creditResetMi = new JMenuItem("Reset Credit");
                
                creditResetMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.setCredits(0);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : INCREASE CREDIT 1(£1)
                JMenuItem creditIncrease1Mi = new JMenuItem("Increase Credit £1");
                
                creditIncrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.increaseCredits(1);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : INCREASE CREDIT 2(£2)
                JMenuItem creditIncrease2Mi = new JMenuItem("Increase Credit £2");
                
                creditIncrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.increaseCredits(2);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : INCREASE CREDIT 3(£5)
                JMenuItem creditIncrease3Mi = new JMenuItem("Increase Credit £5");
                
                creditIncrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.increaseCredits(5);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : INCREASE CREDIT 4(£10)
                JMenuItem creditIncrease4Mi = new JMenuItem("Increase Credit £10");
                
                creditIncrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.increaseCredits(10);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : DECREASE CREDIT 1(-£1)
                JMenuItem creditDecrease1Mi = new JMenuItem("Decrease Credit £1");
                
                creditDecrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.decreaseCredits(1);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : DECREASE CREDIT 2(-£2)
                JMenuItem creditDecrease2Mi = new JMenuItem("Decrease Credit £2");
                
                creditDecrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.decreaseCredits(2);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : DECREASE CREDIT 3(-£5)
                JMenuItem creditDecrease3Mi = new JMenuItem("Decrease Credit £5");
                
                creditDecrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.decreaseCredits(5);
                    }

                });
                
                //DEV : DIGITS : CREDIT DIGITS : DECREASE CREDIT 4(-£10)
                JMenuItem creditDecrease4Mi = new JMenuItem("Decrease Credit £10");
            
                creditDecrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.decreaseCredits(10);
                    }

                });
                
            
                
            
            //DEV : DIGITS : CRACKPOT DIGITS
            JMenu crackpotDigitsMenu = new JMenu("Crackpot Digits:");
            
                //DEV : DIGITS : CRACKPOT DIGITS : RESET CRACKPOT
                JMenuItem crackpotResetMi = new JMenuItem("Reset Crackpot");
                
                crackpotResetMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.setCrackpot(0);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : INCREASE CRACKPOT 1(£1)
                JMenuItem crackpotIncrease1Mi = new JMenuItem("Increase Crackpot £1");
                
                crackpotIncrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseCrackpot(1);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : INCREASE CRACKPOT 2(£2)
                JMenuItem crackpotIncrease2Mi = new JMenuItem("Increase Crackpot £2");
                
                crackpotIncrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseCrackpot(2);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : INCREASE CRACKPOT 3(£5)
                JMenuItem crackpotIncrease3Mi = new JMenuItem("Increase Crackpot £5");
                
                crackpotIncrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseCrackpot(5);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : INCREASE CRACKPOT 4(£10)
                JMenuItem crackpotIncrease4Mi = new JMenuItem("Increase Crackpot £10");
                
                crackpotIncrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.increaseCrackpot(10);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : DECREASE CRACKPOT 1(-£1)
                JMenuItem crackpotDecrease1Mi = new JMenuItem("Decrease Crackpot £1");
                
                crackpotDecrease1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseCrackpot(1);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : DECREASE CRACKPOT 2(-£2)
                JMenuItem crackpotDecrease2Mi = new JMenuItem("Decrease Crackpot £2");
                
                crackpotDecrease2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseCrackpot(2);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : DECREASE CRACKPOT 3(-£5)
                JMenuItem crackpotDecrease3Mi = new JMenuItem("Decrease Crackpot £5");
                
                crackpotDecrease3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseCrackpot(5);
                    }

                });
                
                //DEV : DIGITS : CRACKPOT DIGITS : DECREASE CRACKPOT 4(-£10)
                JMenuItem crackpotDecrease4Mi = new JMenuItem("Decrease Crackpot £10");
            
                crackpotDecrease4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        game.machine.bank.decreaseCrackpot(10);
                    }

                });
            
        
        JMenuItem testMi = new JMenuItem("Test Box", optionsIcon);
        testMi.setMnemonic(KeyEvent.VK_T);
//        optionsMi.setDisplayedMnemonicIndex(2);
//        optionsMi.setSelected(true);

        testMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            //Display.testBox = new TestBox(); //.setVisible(true);
//            testBox.jtext1.setText(Game.systemChecker);
            }
        });
        
        
        //Build background menu******************************************************/
        bgMenu.add(bgDPGMi);
        bgMenu.add(bgOWWMi);
        bgMenu.add(bgDOMi);
        bgMenu.add(bgLGMi);
        bgMenu.add(bgPMi);
        bgMenu.add(bgBMi);
        bgMenu.add(bgGMi);
        bgMenu.add(bgDLGMi);
        bgMenu.add(bgLMGMi);
        bgMenu.add(bgLPGMi);
        bgMenu.add(bgBPGMi);
        
        //Build sound menu******************************************************/
        sndMenu.add(soundMi);
        sndMenu.add(musicMi);
        
        //Build bank menu******************************************************/
        bankMenu.add(bankResetMi);
        bankMenu.addSeparator();
        bankMenu.add(bankIncrease1Mi);
        bankMenu.add(bankIncrease2Mi);
        bankMenu.add(bankIncrease3Mi);
        bankMenu.add(bankIncrease4Mi);
        bankMenu.add(bankDecrease1Mi);
        bankMenu.add(bankDecrease2Mi);
        bankMenu.add(bankDecrease3Mi);
        bankMenu.add(bankDecrease4Mi);
        
        //Build feature menu******************************************************/
        featureMenu.add(threeReelsPlayMi);
        featureMenu.add(hiloPlayMi);
        featureMenu.add(roulettePlayMi);
        featureMenu.add(skillshotPlayMi);
        featureMenu.add(winSpinsPlayMi);
        featureMenu.add(mysteryPlayMi);
        featureMenu.add(dorNPlayMi);
        featureMenu.add(skillCashPlayMi);
        featureMenu.add(barStoppaPlayMi);
        featureMenu.add(crackpotPlayMi);
        
        //Build machine menu******************************************************/
        machineMenu.add(bankMenu);
        machineMenu.addSeparator();
        machineMenu.add(featureMenu);
        machineMenu.addSeparator();
        machineMenu.add(rngMenu);
        
        //Build cash menu******************************************************/
        cashMenu.add(allCashMi);
        cashMenu.add(skillCashUpMi);
        cashMenu.add(skillShotCashMi);
        cashMenu.add(randomCashMi);
        cashMenu.addSeparator();
        cashMenu.add(loseMi);
        cashMenu.add(turboMi);
        cashMenu.add(takeCashMi);
        cashMenu.add(pound1Mi);
        cashMenu.add(pound2Mi);
        cashMenu.add(pound3Mi);
        cashMenu.add(pound4Mi);
        cashMenu.add(pound5Mi);
        cashMenu.add(pound6Mi);
        cashMenu.add(pound7Mi);
        cashMenu.add(pound8Mi);
        cashMenu.add(pound9Mi);
        cashMenu.add(pound10Mi);
        cashMenu.add(pound12Mi);
        cashMenu.add(pound15Mi);
        
        //Build hilo menu******************************************************/
        hiloMenu.add(allHiloMi);
        hiloMenu.addSeparator();
        hiloMenu.add(hiMi);
        hiloMenu.add(loMi);
        
        //Build winspins menu******************************************************/
        winSpinsMenu.add(allWinSpinsMi);
        winSpinsMenu.add(skillWinSpinUpMi);
        winSpinsMenu.add(skillShotWinSpinMi);
        winSpinsMenu.add(randomWinSpinsMi);
        winSpinsMenu.addSeparator();
        winSpinsMenu.add(winSpins1Mi);
        winSpinsMenu.add(winSpins2Mi);
        winSpinsMenu.add(winSpins3Mi);
        
        //Build crackpot menu******************************************************/
        crackpotMenu.add(allCrackpotMi);
        crackpotMenu.add(skillCrackpotForwardMi);
        crackpotMenu.add(skillShotCrackpotMi);
        crackpotMenu.add(randomCrackpotMi);
        crackpotMenu.addSeparator();
        crackpotMenu.add(crackpotCMi);
        crackpotMenu.add(crackpotRMi);
        crackpotMenu.add(crackpotAMi);
        crackpotMenu.add(crackpotC2Mi);
        crackpotMenu.add(crackpotKMi);
        crackpotMenu.add(crackpotPMi);
        crackpotMenu.add(crackpotOMi);
        crackpotMenu.add(crackpotTMi);
        
        //Build skillshot menu******************************************************/
        skillshotMenu.add(allSkillshotMi);
        skillshotMenu.add(skillSkillshotForwardMi);
        skillshotMenu.add(skillShotSkillShotMi);
        skillshotMenu.add(randomSkillshotMi);
        skillshotMenu.addSeparator();
        skillshotMenu.add(skillshotSMi);
        skillshotMenu.add(skillshotKMi);
        skillshotMenu.add(skillshotIMi);
        skillshotMenu.add(skillshotL1Mi);
        skillshotMenu.add(skillshotL2Mi);
        skillshotMenu.add(skillshotS2Mi);
        skillshotMenu.add(skillshotHMi);
        skillshotMenu.add(skillshotOMi);
        skillshotMenu.add(skillshotTMi);
        
        //Build nudges menu******************************************************/
        nudgesMenu.add(allNudgesMi);
        nudgesMenu.add(skillNudgeUpMi);
        nudgesMenu.add(skillShotNudgeMi);
        nudgesMenu.add(randomNudgeMi);
        nudgesMenu.addSeparator();
        nudgesMenu.add(takeNudgesMi);
        //nudgesMenu.add(nudgeMi);
        //nudgesMenu.add(nudgesMi);
        nudgesMenu.add(nudge1Mi);
        nudgesMenu.add(nudge2Mi);
        nudgesMenu.add(nudge3Mi);
        nudgesMenu.add(nudge4Mi);
        nudgesMenu.add(nudge5Mi);
        nudgesMenu.add(nudge6Mi);
        nudgesMenu.add(nudge7Mi);
        nudgesMenu.add(nudge8Mi);
        nudgesMenu.add(nudge10Mi);
        nudgesMenu.add(nudge99Mi);
        
        //Build features menu******************************************************/
        featuresMenu.add(allFeaturesMi);
        featuresMenu.add(skillFeaturesUpMi);
        featuresMenu.add(skillShotFeaturesMi);
        featuresMenu.add(randomFeaturesMi);
        featuresMenu.addSeparator();
        featuresMenu.add(takeFeaturesMi);
        featuresMenu.add(features1Mi);
        featuresMenu.add(features2Mi);
        featuresMenu.add(features3Mi);
        featuresMenu.add(features4Mi);
        featuresMenu.add(features5Mi);
        featuresMenu.add(features6Mi);
        featuresMenu.add(features7Mi);
        
        //Build tangodown menu******************************************************/
        tangoDownMenu.add(allTangoDownMi);
        tangoDownMenu.add(skillTangoDownForwardMi);
        tangoDownMenu.add(skillShotTangoDownMi);
        tangoDownMenu.add(randomTangoDownMi);
        tangoDownMenu.addSeparator();
        tangoDownMenu.add(tangoDownTMi);
        tangoDownMenu.add(tangoDownAMi);
        tangoDownMenu.add(tangoDownNMi);
        tangoDownMenu.add(tangoDownGMi);
        tangoDownMenu.add(tangoDownO1Mi);
        tangoDownMenu.add(tangoDownDMi);
        tangoDownMenu.add(tangoDownO2Mi);
        tangoDownMenu.add(tangoDownWMi);
        tangoDownMenu.add(tangoDownN2Mi);
        
        //Build roulette menu******************************************************/
        rouletteMenu.add(allRouletteMi);
        rouletteMenu.add(skillRouletteCWMi);
        rouletteMenu.add(skillShotRouletteMi);
        rouletteMenu.add(randomRouletteMi);
        rouletteMenu.addSeparator();
        rouletteMenu.add(roulette1Mi);
        rouletteMenu.add(roulette2Mi);
        rouletteMenu.add(roulette3Mi);
        rouletteMenu.add(roulette4Mi);
        rouletteMenu.add(roulette5Mi);
        rouletteMenu.add(roulette6Mi);
        rouletteMenu.add(roulette7Mi);
        rouletteMenu.add(roulette8Mi);
        rouletteMenu.add(roulette9Mi);
        rouletteMenu.add(roulette10Mi);
        rouletteMenu.add(roulette11Mi);
        rouletteMenu.add(roulette12Mi);
        rouletteMenu.add(roulette13Mi);
        rouletteMenu.add(roulette14Mi);
        rouletteMenu.add(roulette15Mi);
        rouletteMenu.add(roulette16Mi);
        rouletteMenu.add(roulette17Mi);
        rouletteMenu.add(roulette18Mi);
        
        //Build lights menu******************************************************/
        lightsMenu.add(randomAllMi);
        lightsMenu.addSeparator();
        lightsMenu.add(cashMenu);
        lightsMenu.add(nudgesMenu);
        lightsMenu.add(featuresMenu);
        lightsMenu.add(crackpotMenu);
        lightsMenu.add(hiloMenu);
        lightsMenu.add(skillshotMenu);
        //lightsMenu.add(static1Menu);
        lightsMenu.add(tangoDownMenu);
        lightsMenu.add(winSpinsMenu);
        lightsMenu.add(rouletteMenu);
        
        //Build bank text menu******************************************************/
        bankTextMenu.add(bankText1Mi);
        bankTextMenu.add(bankText2Mi);
        bankTextMenu.add(bankText3Mi);
        bankTextMenu.add(bankText4Mi);
        bankTextMenu.add(bankText5Mi);
        bankTextMenu.add(bankText6Mi);
        bankTextMenu.add(bankText7Mi);
        bankTextMenu.add(bankText8Mi);
        bankTextMenu.add(bankText9Mi);
        bankTextMenu.add(bankText10Mi);
        bankTextMenu.add(bankText11Mi);
        bankTextMenu.add(bankText12Mi);
        bankTextMenu.add(bankText13Mi);
        bankTextMenu.add(bankText14Mi);
        bankTextMenu.add(bankText15Mi);
        bankTextMenu.add(bankText16Mi);
        bankTextMenu.add(bankText17Mi);
        
        //Build crackpot menu******************************************************/
        crackpotDigitsMenu.add(crackpotResetMi);
        crackpotDigitsMenu.addSeparator();
        crackpotDigitsMenu.add(crackpotIncrease1Mi);
        crackpotDigitsMenu.add(crackpotIncrease2Mi);
        crackpotDigitsMenu.add(crackpotIncrease3Mi);
        crackpotDigitsMenu.add(crackpotIncrease4Mi);
        crackpotDigitsMenu.addSeparator();
        crackpotDigitsMenu.add(crackpotDecrease1Mi);
        crackpotDigitsMenu.add(crackpotDecrease2Mi);
        crackpotDigitsMenu.add(crackpotDecrease3Mi);
        crackpotDigitsMenu.add(crackpotDecrease4Mi);
            
        //Build credit menu******************************************************/
        creditDigitsMenu.add(creditResetMi);
        creditDigitsMenu.addSeparator();
        creditDigitsMenu.add(creditIncrease1Mi);
        creditDigitsMenu.add(creditIncrease2Mi);
        creditDigitsMenu.add(creditIncrease3Mi);
        creditDigitsMenu.add(creditIncrease4Mi);
        creditDigitsMenu.addSeparator();
        creditDigitsMenu.add(creditDecrease1Mi);
        creditDigitsMenu.add(creditDecrease2Mi);
        creditDigitsMenu.add(creditDecrease3Mi);
        creditDigitsMenu.add(creditDecrease4Mi);
        
        //Build digits menu******************************************************/
        digitsMenu.add(bankDigitsMenu);
        digitsMenu.add(bankTextMenu);
        digitsMenu.add(crackpotDigitsMenu);
        digitsMenu.add(creditDigitsMenu);
        
        //Build developer menu******************************************************/
        devMenu.add(machineMenu);
        devMenu.add(reelsMenu);
        devMenu.add(lightsMenu);
        devMenu.add(digitsMenu);
        devMenu.add(sndMenu);
        devMenu.add(bgMenu);
        
        //Build view menu******************************************************/
        viewMenu.add(sfpsMi);
        viewMenu.add(sUpsMi);
        viewMenu.add(sbarMi);
        
        //Build edit menu******************************************************/
        editMenu.add(optionsMi);
        
        //Build file menu******************************************************/
        fileMenu.add(newMi);
        fileMenu.add(exitMi);
        
        //Build help menu******************************************************/
        helpMenu.add(testMi);

        //Build menu bar******************************************************/
        this.add(fileMenu);
        this.add(editMenu);
        this.add(viewMenu);
        this.add(devMenu);
        this.add(Box.createHorizontalGlue());
        this.add(helpMenu);
        this.setVisible(true);
        
        //return menubar;
    }
    
}
