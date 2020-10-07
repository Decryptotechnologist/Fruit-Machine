/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangodown.fruit.machine.graphics;

import tangodown.fruit.machine.gamelogic.Machine;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Texture objects represent a Renderable Texture
 * 
 * @author(s) Ghomez
 */
public class Texture {

    /**Attributes*/                                      
    
    private final static Map<String, BufferedImage> texMap = new HashMap<String, BufferedImage>();
    private BufferedImage img;
    private String fileName;
    private int width;
    private int height;
        

    
    
    /**Constructor*/
    
    
    /**
    * Texture(String fileName)
    * 
    * @param fileName
    */
    public Texture(String fileName) {
        this.fileName = fileName;
        BufferedImage oldTex = texMap.get(fileName);
        if(oldTex != null){
            this.img = oldTex;
        } else {
        
        try {
            System.out.println("Loading Texture: "+Machine.textCount+": " + fileName);
            this.img = ImageIO.read(new File("res"+fileName + ".png"));
            texMap.put(fileName, img);
            Machine.textCount++;
        } catch (IOException ex) {
            Logger.getLogger(Texture.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        this.width = img.getWidth();
        this.height = img.getHeight();
    }
    
    public Texture(Texture spriteSheet, int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        String key = spriteSheet.fileName +"_"+ x +"_"+ y;
        BufferedImage oldI = texMap.get(key);
        if(oldI != null){
            this.img = oldI;
        } else {
            this.img = spriteSheet.img.getSubimage(x * width - width, y * height - height, width, height);
        }
    }
    
    public Texture(Texture spriteSheet, int x, int y, int size) {
        this(spriteSheet, x, y, size, size);
    }
    
    /**
     * finalize()
     * 
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        if(!fileName.isEmpty()){ 
            texMap.remove(fileName);
            System.out.println("Removing Texture from memory: " + fileName);
        }
        super.finalize();
    }
    
    
    /**
    * render(Graphics2D g, int x, int y, int width, int height)
    * 
    * Renders/Repaints Texture Objects
    * 
    * @param g
    * @param x - the x variable Texture object
    * @param y - the y variable Texture object
    */
    public void render(Graphics g, double x, double y){
        g.drawImage(img, (int) x, (int) y, null);
    }
    
    
    /**
    * render(Graphics2D g, int x, int y, int width, int height)
    * 
    * Renders/Repaints Texture Objects
    * 
    * @param g
    * @param x - the x variable Texture object
    * @param y - the y variable Texture object
    * @param width - the width variable Texture object
    * @param height - the height variable Texture object
    */
    public void render(Graphics2D g, int x, int y, int width, int height){
        g.drawImage(img, x, y, width, height, null);
    }
    
    
    /**
    * render(Graphics2D g, int x, int y, int width, int height)
    * 
    * Renders/Repaints Texture Objects
    * 
    * @param g
    * @param x - the x variable Texture object
    * @param y - the y variable Texture object
    * @param width - the width variable Texture object
    * @param height - the height variable Texture object
    * @param col - the col variable Texture object
    */
    public void render(Graphics2D g, int x, int y, int width, int height, Color col){
        g.drawImage(img, x, y, width, height, col, null);
    }
    
    /**
    * render(Graphics g, int destX1, int destX2, int srcX1, int srcX2, int y)
    * 
    * Renders/Repaints Texture Objects
    * 
    * @param g
    * @param destX1 - the destX1 variable Texture object
    * @param destX2 - the destX2 variable Texture object
    * @param srcX1 - the srcX1 variable Texture object
    * @param srcX2 - the srcX2 variable Texture object
    * @param y - the y variable Texture object
    */
    public void render(Graphics g, int destX1, int destX2, int srcX1, int srcX2, int y){
        g.drawImage(img, destX1, y, destX2, y + height, srcX1, 0, srcX2, height, null);
    }
    
    
    /**
     * getImage()
     * 
     * @return img
     */
    public BufferedImage getImage(){
        return img;
    }

    
    /**
     * getWidth()
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }

    
    /**
     * getHeight()
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }
    
    
    
    /**Public Protocol*/
        
    /**
    * loadBitmap()
    * 
    * @param fileName
    * 
    * @return result
    */ 
//    public static Render loadBitmap(String fileName) {
//        
//            BufferedImage image = new Texture(fileName).getImage();//ImageIO.read(Texture.class.getResource(fileName));
//            int width = image.getWidth();
//            int height = image.getHeight();
//            Render result = new Render(width, height);
//            image.getRGB(0, 0, width, height, result.pixels, 0, width);
//            for (int i = 0; i < result.pixels.length; i++) {
//                int in = result.pixels[i];
//                int col = (in & 0xf) >> 2;
//                if (in == 0xffff00ff) {
//                    col = -1;
//                }
//                    
//                result.pixels[i] = col;
//            }
//                
//            return result;
//        
//    }

    
    /**
    * loadBitmapA()
    * 
    * @param fileName
    * 
    * @return result
    */     
//    public static Render loadBitmapA(String fileName) {
//        
//        try {
//            
//            BufferedImage image = ImageIO.read(Texture.class.getResource(fileName));
//            int width = image.getWidth();
//            int height = image.getHeight();
//            Render result = new Render(width, height);
//            image.getRGB(0, 0, width, height, result.pixels, 0, width);
//            
//            return result;
//            
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        
//    }

    
    /**
    * loadBitmapRot()
    * 
    * @param fileName
    * 
    * @return result
    */     
//    public static Render loadBitmapRot(String fileName) {  
//        try {
//            BufferedImage imgR = ImageIO.read(Texture.class.getResource(fileName));
//            int w = imgR.getWidth();
//            int h = imgR.getHeight();
//            int angle = 90;
//            BufferedImage dimg = new BufferedImage(w, h, imgR.getType());
//            Graphics2D g = dimg.createGraphics();
//            g.rotate(Math.toRadians(angle), w / 2, h / 2);
//            g.drawImage(imgR, null, 0, 0);
//
//            int width = dimg.getWidth();
//            int height = dimg.getHeight();
//            Render result = new Render(width, height);
//            dimg.getRGB(0, 0, width, height, result.pixels, 0, width);
//            
//            /*
//             * for (int i = 0; i < result.pixels.length; i++) { int in =
//             * result.pixels[i]; int col = (in & 0xf) >> 2; if (in ==
//             * 0xffff00ff) col = -1; result.pixels[i] = col; }
//             */
//            
//            return result;
//            
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        
//    }

    
    /**
    * loadTranslucentImage()
    * 
    * @param fileName
    * @param transperancy
    * 
    * @return result
    */     
//    public static Render loadTranslucentImage(String fileName, float transperancy) {
//        // Load the image
//        try {
//            BufferedImage imgT = ImageIO.read(Texture.class.getResource(fileName));
//            int w = imgT.getWidth();
//            int h = imgT.getHeight();
//            // Create the image using the
//            BufferedImage aimg = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
//            // Get the images graphics
//            Graphics2D g = aimg.createGraphics();
//            // Set the Graphics composite to Alpha
//            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transperancy));
//            // Draw the LOADED img into the prepared reciver image
//            g.drawImage(imgT, null, 0, 0);
//            // let go of all system resources in this Graphics
//            g.dispose();
//
//            int width = aimg.getWidth();
//            int height = aimg.getHeight();
//            Render result = new Render(width, height);
//            aimg.getRGB(0, 0, width, height, result.pixels, 0, width);
//            
//            /*
//             * for (int i = 0; i < result.pixels.length; i++) { int in =
//             * result.pixels[i]; int col = (in & 0xf) >> 2; if (in ==
//             * 0xffff00ff) col = -1; result.pixels[i] = col; }
//             */
//            
//            return result;
//            
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    
    /**
    * splitImage()
    * 
    * @param img the Enemy1 object
    * @param cols the Enemy1 object
    * @param rows the Enemy1 object
    * 
    * @return imgs
    */    
    // for splitting spritesheets into bufferedImage array
//    public static BufferedImage[] splitImage(BufferedImage Simg, int cols, int rows) {
//        
//        int w = Simg.getWidth() / cols;
//        int h = Simg.getHeight() / rows;
//        int num = 0;
//        BufferedImage imgs[] = new BufferedImage[w * h];
//        for (int y = 0; y < rows; y++) {
//            for (int x = 0; x < cols; x++) {
//                imgs[num] = new BufferedImage(w, h, Simg.getType());
//                // Tell the graphics to draw only one block of the image
//                Graphics2D g = imgs[num].createGraphics();
//                g.drawImage(Simg, 0, 0, w, h, w * x, h * y, w * x + w, h * y + h, null);
//                g.dispose();
//                num++;
//            }
//        }
//            
//        return imgs;  
//    }

    
    /**
    * getCol()
    * 
    * @param c
    * 
    * @return rbg
    */    
//    public static int getCol(int c) {
//        
//        int r = (c >> 16) & 0xff;
//        int g = (c >> 8) & 0xff;
//        int b = (c) & 0xff;
//
//        r = r * 0x55 / 0xff;
//        g = g * 0x55 / 0xff;
//        b = b * 0x55 / 0xff;
//
//        return r << 16 | g << 8 | b;
//        
//    }

    
}
