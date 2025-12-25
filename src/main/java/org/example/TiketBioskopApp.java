package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;

public class TiketBioskopApp extends JFrame {

    CardLayout layout = new CardLayout();
    JPanel mainPanel = new JPanel(layout);

    DefaultTableModel model;
    JTable table;

    JTextField tfFilm, tfStudio, tfJam, tfHarga;
    int selectedRow = -1;

    File dataFile = new File("tiket.csv");

    public TiketBioskopApp() {
        setTitle("Aplikasi Tiket Bioskop");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        model = new DefaultTableModel(
                new String[]{"Judul Film", "Studio", "Jam", "Harga"}, 0
        );
        loadData();

        mainPanel.add(dashboardPanel(), "DASH");
        mainPanel.add(listPanel(), "LIST");
        mainPanel.add(inputPanel(), "INPUT");

        add(mainPanel);
        setVisible(true);
    }

    JPanel dashboardPanel() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(25, 25, 25));

        JPanel card = new JPanel(new GridLayout(4, 1, 15, 15));
        card.setBackground(new Color(35, 35, 35));
        card.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel title = new JLabel("CINEMA TICKET", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));

        card.add(title);
        card.add(btn("📄 List Tiket", () -> layout.show(mainPanel, "LIST")));
        card.add(btn("➕ Input Tiket", () -> layout.show(mainPanel, "INPUT")));
        card.add(btn("❌ Exit", () -> System.exit(0)));

        p.add(card);
        return p;
    }
