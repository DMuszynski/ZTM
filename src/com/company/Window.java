package com.company;
import javax.swing.*;

public class Window extends JFrame{

    private int windowWidth = 1366;
    private int windowHeight = 768;
    private String windowName = "ZTM";

    public int getWidth()           {     return this.windowWidth;          }
    public int getHeight()          {     return this.windowHeight;         }
    public String getWindowName()   {     return this.windowName;           }

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(getWidth(), getHeight());
        setLocationRelativeTo(null);
        setTitle(getWindowName());
        setVisible(true);
    }
}
