package com.company;
import javax.swing.*;

public class Window extends JFrame{

    public static final int WIDTH=1366;
    public static final int HEIGHT=768;

    public Window(){
        add(new Menu());
        setResizable(false);
        pack();
        setTitle("ZTM");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}