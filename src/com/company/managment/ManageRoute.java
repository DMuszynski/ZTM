package com.company.managment;

import com.company.Main;
import com.company.Menu;
import com.company.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageRoute extends JPanel{

    private Image background;

    public ManageRoute(){
        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();



        ///////////////////////////   TITLE    /////////////////////////////////////

        JLabel title = new JLabel("Zarządzanie pojazdami");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(Window.WIDTH/2 - 260, 30 , 520, 100);
        title.setForeground(Color.white);
        add(title);


        ///////////////////////////   MANAGMENT PANEL    /////////////////////////////////////

        JPanel managment = new JPanel();
        managment.setSize(400,500);
        managment.setLocation(Window.WIDTH/2 - 500, 150);
        managment.setBackground(new Color(0,0,0,30));
        add(managment);

        ///////////////////////////   CREATION PANEL    /////////////////////////////////////

        JPanel creation = new JPanel();
        creation.setSize(400,500);
        creation.setLocation(Window.WIDTH/2 + 100, 150);
        creation.setBackground(new Color(0,0,0,30));
        add(creation);

        ///////////////////////////   BACK BUTTON    /////////////////////////////////////

        //BACK
        JButton backButton = new JButton("Powrót");
        backButton.setBounds(Window.WIDTH/2 - 50, Window.HEIGHT-80, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new Menu());
                Main.newWindow.revalidate();
            }
        });
        add(backButton);



    }



    /*
    DRAWING BACKGROUND
    */
    private void loadBackground(){
        ImageIcon bg = new ImageIcon("images/background.png");
        background = bg.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g.drawImage(background, 0, 0, null);
    }



}
