package ru.vsu.cs.scheblykin.gui;

import ru.vsu.cs.scheblykin.util.SwingUtils;

import java.util.Locale;

public class Main {
    public static void winMain() throws Exception {
        //SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ru.vsu.cs.scheblykin.gui.FrameMain().setVisible(true);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        winMain();
    }
}