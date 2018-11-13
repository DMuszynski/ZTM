package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static JFrame newWindow;

    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                newWindow = new Window();
                newWindow.setVisible(true);
            }
        });

    }
}