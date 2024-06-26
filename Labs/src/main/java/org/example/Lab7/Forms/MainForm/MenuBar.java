package org.example.Lab7.Forms.MainForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class MenuBar extends JMenuBar {
    private MainForm mainForm;
    private ResourceBundle bundle;

    public MenuBar(MainForm mainForm) {
        this.mainForm = mainForm;
        bundle = mainForm.localisation.getBundle();

        JMenu fileConfigurationMenu = new JMenu(bundle.getString("File"));
        JMenuItem reloadItem = new JMenuItem(bundle.getString("Reboot"));
        fileConfigurationMenu.add(reloadItem);

        JMenu infoMenu = new JMenu(bundle.getString("Info"));
        JMenuItem creatorInfoItem = new JMenuItem(bundle.getString("AboutAuthor"));
        JMenuItem usageInfoItem = new JMenuItem(bundle.getString("Instruction"));
        JMenuItem programInfoItem = new JMenuItem(bundle.getString("AboutProgram"));
        infoMenu.add(creatorInfoItem);
        infoMenu.add(usageInfoItem);
        infoMenu.add(programInfoItem);

        add(fileConfigurationMenu);
        add(infoMenu);

        reloadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainForm.SetToDefaultConfiguration();
            }
        });

        creatorInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainForm,
                        bundle.getString("WhoCompleted") + "\n" +
                                "Варіант 1");
            }
        });

        usageInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainForm, bundle.getString("InstructionDescription"));
            }
        });

        programInfoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainForm, bundle.getString("ProgramDescription"));
            }
        });

        // Language Selection Menu
        JMenu languageMenu = new JMenu("Language");

        JMenuItem azLangItem = new JMenuItem("Azerbaijani");
        JMenuItem beLangItem = new JMenuItem("Belarusian");
        JMenuItem csLangItem = new JMenuItem("Czech");
        JMenuItem ukLangItem = new JMenuItem("Ukrainian");

        languageMenu.add(azLangItem);
        languageMenu.add(beLangItem);
        languageMenu.add(csLangItem);
        languageMenu.add(ukLangItem);

        add(languageMenu);

        azLangItem.addActionListener(s -> {
            mainForm.localisation.setLanguage("az");
            mainForm.localisation.setCountry("AZ");
            mainForm.updateUI();
        });

        beLangItem.addActionListener(s -> {
            mainForm.localisation.setLanguage("be");
            mainForm.localisation.setCountry("BY");
            mainForm.updateUI();
        });

        csLangItem.addActionListener(s -> {
            mainForm.localisation.setLanguage("cs");
            mainForm.localisation.setCountry("CZ");
            mainForm.updateUI();
        });

        ukLangItem.addActionListener(s -> {
            mainForm.localisation.setLanguage("uk");
            mainForm.localisation.setCountry("UA");
            mainForm.updateUI();
        });

    }
}
