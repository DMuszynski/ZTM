package com.company;
import javax.swing.JFrame;

public class Window extends JFrame {

    private int WIDTH = 1366;
    private int HEIGHT = 768;
    private String windowName = "ZTM";


    public int getWidth()           {     return this.WIDTH;        }
    public int getHeight()          {     return this.HEIGHT;       }
    public String getWindowName()   {     return this.windowName;   }

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(getWidth(), getHeight());
        setTitle(getWindowName());
        setVisible(true);
    }
}