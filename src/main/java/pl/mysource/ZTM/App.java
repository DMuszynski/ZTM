package pl.mysource.ZTM;
import javax.swing.*;

public class App {
    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }


        public static void main(String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
                System.out.println("cos 12");

            }

            });

    }
}
