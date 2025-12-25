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