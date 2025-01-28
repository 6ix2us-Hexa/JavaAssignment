/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swahililearningapp;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;
public class SwahiliLearningApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    // Create the main frame
        JFrame frame = new JFrame("Swahili Learning App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a label for the title
        JLabel titleLabel = new JLabel("Karibu kwenye programu ya Kujifunza Kiswahili!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create buttons for categories
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton greetingsButton = new JButton("Greetings (Salamu)");
        JButton numbersButton = new JButton("Numbers (Nambari)");
        JButton phrasesButton = new JButton("Common Phrases (Maneno ya Kawaida)");

        buttonPanel.add(greetingsButton);
        buttonPanel.add(numbersButton);
        buttonPanel.add(phrasesButton);

        panel.add(buttonPanel, BorderLayout.CENTER);

        // Create a text area for displaying phrases
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.SOUTH);

        // Add action listeners to buttons
        greetingsButton.addActionListener((ActionEvent e) -> {
            textArea.setText("Salamu (Greetings):\n" +
                    "1. Hello - Habari\n" +
                    "2. Good morning - Habari za asubuhi\n" +
                    "3. Good evening - Habari za jioni\n" +
                    "4. Goodbye - Kwa heri\n");
        });

        numbersButton.addActionListener((ActionEvent e) -> {
            textArea.setText("Nambari (Numbers):\n" +
                    "1 - Moja\n" +
                    "2 - Mbili\n" +
                    "3 - Tatu\n" +
                    "4 - Nne\n" +
                    "5 - Tano\n");
        });

        phrasesButton.addActionListener((ActionEvent e) -> {
            textArea.setText("Maneno ya Kawaida (Common Phrases):\n" +
                    "1. Thank you - Asante\n" +
                    "2. Please - Tafadhali\n" +
                    "3. Sorry - Pole\n" +
                    "4. Yes - Ndiyo\n" +
                    "5. No - Hapana\n");
        });

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }   Scanner scanner = new Scanner(System.in);
        
}

    
    

