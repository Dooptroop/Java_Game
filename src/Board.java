package com.company;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

    public Board() {

        initBoard();
    }

    private void initBoard() {


        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    //    My Method for loading images
    private Image loadImage(String img_path) {
        Image img;
        ImageIcon ii = new ImageIcon(img_path);
        img = ii.getImage();
        return img;
    }


}
