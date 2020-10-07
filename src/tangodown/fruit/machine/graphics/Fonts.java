/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.graphics;

import tangodown.fruit.machine.gamelogic.Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author Ghomez
 */
public class Fonts {
    
    public static void drawString(Graphics g, Font f, Color c, String text, int x, int y){
        g.setColor(c);
        g.setFont(f);
        g.drawString(text, x, y);
    }

    public static void drawString(Graphics g, Font f, Color c, String text){
        FontMetrics fm = g.getFontMetrics(f);
        int x = Game.getGameWidth() - fm.stringWidth(text) / 2;// Horizontal centre
        int y = ((Game.getGameHeight() - fm.getHeight()) / 2) + fm.getAscent();// Vertical centre
        drawString(g, f, c, text, x, y);
    }
    
    public static void drawString(Graphics g, Font f, Color c, String text, double x){
        FontMetrics fm = g.getFontMetrics(f);
        int y = ((Game.getGameHeight() - fm.getHeight()) / 2) + fm.getAscent();// Vertical centre
        drawString(g, f, c, text, (int) x, y);
    }
    
    public static void drawString(Graphics g, Font f, Color c, String text, int y){
        FontMetrics fm = g.getFontMetrics(f);
        int x = Game.getGameWidth() - fm.stringWidth(text) / 2;// Horizontal centre
        drawString(g, f, c, text, x, y);
    }
}
