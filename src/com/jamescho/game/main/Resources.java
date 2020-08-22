package com.jamescho.game.main;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Resources {
    public static BufferedImage welcome, iconimage;
    public static void load(){
        welcome = loadImage("C:\\Users\\KaneP\\Desktop\\repos\\SimpleJavaGDF\\src\\resources\\welcome.png");
        iconimage = loadImage("iconimage.png");


    }
    private static AudioClip loadSound(String filename){
        URL fileURL = Resources.class.getResource("/resources/" + filename);
        return Applet.newAudioClip(fileURL);

    }
    private static BufferedImage loadImage(String filename){
        BufferedImage img = null;
        try {
            img = ImageIO.read(Resources.class.getResourceAsStream("src/resources/" + filename));

        }catch (Exception e){
            System.out.println("error while reading"+ filename);
            e.printStackTrace();
        }
        return img;
    }
}
