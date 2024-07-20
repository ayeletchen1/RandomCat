package org.example;
import javax.swing.JFrame;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.BorderLayout;

public class Window extends JFrame {
    public Window() {
        // הגדרת כותרת החלון
        setTitle("Random Cat Picture");

        // הגדרת גודל החלון
        setSize(800, 600);

        // הגדרת הפעולה שתתבצע כאשר סוגרים את החלון
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            // יצירת URL של תמונה אקראית מהאינטרנט
            URL url = new URL("https://cataas.com/cat");

            // יצירת ImageIcon מה-URL
            ImageIcon imageIcon = new ImageIcon(url);

            // יצירת JLabel עם ה-ImageIcon
            JLabel label = new JLabel(imageIcon);

            // הוספת ה-JLabel לחלון
            add(label, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // מיקום החלון במרכז המסך
        setLocationRelativeTo(null);

        // הפיכת החלון לנראה על המסך
        setVisible(true);
    }

    public static void main(String[] args) {
        // יצירת מופע של המחלקה Window
        new Window();
    }
}




