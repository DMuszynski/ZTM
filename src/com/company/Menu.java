package com.company;
import javax.swing.*;
import java.awt.*;


public class Menu extends Window{

    public Menu(){

        JPanel loginPanel = new JPanel();
        loginPanel.setSize(300,300);
        loginPanel.setBackground(Color.BLACK);
        loginPanel.add(new JButton("Logowanie"));
        loginPanel.add(new JButton("Rejestracja"));
        loginPanel.setVisible(true);

        setVisible(true);

    }
}