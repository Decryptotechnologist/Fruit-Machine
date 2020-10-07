/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.splash;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ghomez
 */
public class SplashScreen extends JWindow {
    
    private BorderLayout borderLayout;
    private JLabel imgLabel;
    private JPanel southPanel;
    private FlowLayout southFlow;
    private JProgressBar progressBar;
    private ImageIcon imgIcon;
    
    
    public SplashScreen(){
        this.imgIcon = new ImageIcon("res/splash2.png");
        borderLayout = new BorderLayout();
        imgLabel = new JLabel();
        southPanel = new JPanel();
        southFlow = new FlowLayout();
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        try {
            init();
        } catch(Exception e){
        }
    }
    
    private void init() throws Exception {
        imgLabel.setIcon(imgIcon);
        getContentPane().setLayout(borderLayout);
        southPanel.setLayout(southFlow);
        southPanel.setBackground(Color.BLACK);
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);
        southPanel.add(progressBar, null);
        pack();
    }

    public void setMaxProgress(int maxProgress){
        progressBar.setMaximum(maxProgress);
    }
    
    public void setProgress(int progress){
        double percentage = ((double) progress / (double) progressBar.getMaximum()) * 100;
        String num = String.format("%.0f", percentage);
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                progressBar.setValue(progress);
                progressBar.setString("Loading: " + num + "%");
            }
        });
    }
    
}
