package com.jamescho.game.state;

import com.jamescho.game.main.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MenuState extends State {
    @Override
    public void init() {
        System.out.println("Entered MainState");

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcome,0,0,null);

    }

    @Override
    public void onClick(MouseEvent e) {
        System.out.println("mouse press");

    }

    @Override
    public void onKeyPress(KeyEvent e) {
        System.out.println("key pressed");

    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        System.out.println("key release");

    }
}
