package com.company;

/**
 * Created by mike on 4/10/2015.
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
    public Application(){

        initUI();
    }

    private void initUI() {

        add(new Board());// Set the Board() to the center of the JFrame container

        setSize(250, 200);// Sets the size of the acreen

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets to close on exit
        setLocationRelativeTo(null); // Passing NULL here centers the window on the screen
    }

    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }
}
