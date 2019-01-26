package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegisterCredentials extends JPanel{

    private Image background;

    public RegisterCredentials(){

        Main.newWindow.setVisible(true);
        setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
        setFocusable(true);
        setLayout(null);
        loadBackground();

        /*
            TITTLE
        */
        JLabel title = new JLabel("ZTM");
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setBounds(Window.WIDTH/2 - 85, 80 , 170, 100);
        title.setForeground(Color.white);
        add(title);




        ///////////////////////////   INPUT FIELDS    /////////////////////////////////////

        // DANE LOGOWANIA
        JLabel personalDataLabel = new JLabel("Dane do logowania");
        personalDataLabel.setFont(new Font("Arial", Font.BOLD, 25));
        personalDataLabel.setBounds(Window.WIDTH/2 - 140, Window.HEIGHT/2 - 125 , 280, 30);
        personalDataLabel.setForeground(Color.white);
        add(personalDataLabel);

        //  NAME FIELD
        JTextField nameField = new JTextField("Nazwa użytkownika", 30);
        nameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 80, 260, 40);
        add(nameField);

        //  SURNAME FIELD
        JTextField surnameField = new JTextField("Hasło", 30);
        surnameField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 - 35, 260, 40);
        add(surnameField);

        //  BIRTH FIELD
        JTextField birthField = new JTextField("Powtórz hasło");
        birthField.setBounds(Window.WIDTH/2 - 130, Window.HEIGHT/2 + 10, 260, 40);
        add(birthField);




        /////   ACTION BUTTONS   /////

        //NEXT
        JButton nextButton = new JButton("Zarejestruj");
        nextButton.setBounds(Window.WIDTH/2 - 75, Window.HEIGHT - 115, 150, 30);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.newWindow.setContentPane(new RegisterCredentials());
                Main.newWindow.revalidate();
            }
        });
        add(nextButton);

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
