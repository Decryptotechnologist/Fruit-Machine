/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.ui;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Ghomez
 */
public class StatusBar extends JLabel {

    private Border border;
    private Font font = new Font("Digital-7", Font.PLAIN, 10);
    private Color foreGroundCol = Color.red;
    private Color backGroundCol = new Color(0.0f, 0.0f, 0.0f, 0.76f);
    
    public StatusBar(String string, int i, Border border) {
        super(string, i);
        setStatusBorder(border);
        
        this.setBorder(this.border);
        this.setFont(font);
        this.setForeground(foreGroundCol);
        this.setBackground(backGroundCol);
        this.setOpaque(true);
    }

    private void setStatusBorder(Border border) {
        this.border = border;
    }

    private void setStatusFont(Font font) {
        this.font = font;
    }

    private void setForeGroundCol(Color foreGroundCol) {
        this.foreGroundCol = foreGroundCol;
    }

    private void setBackGroundCol(Color backGroundCol) {
        this.backGroundCol = backGroundCol;
    }
    
}
