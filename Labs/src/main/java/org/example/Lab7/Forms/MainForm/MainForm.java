package org.example.Lab7.Forms.MainForm;

import org.example.Lab7.Data.Line;
import org.example.Lab7.Data.Localization.LocalizationController;
import org.example.Lab7.Data.PointContainer;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
    private Line mainLine;
    private PointContainer pointContainer;
    public final int Height = 400;
    public final int Width = 800;
    public String defaultFormName;
    public int requiredPointsCount;
    public LocalizationController localisation;

    public Line getMainLine() {
        return mainLine;
    }

    public void setMainLine(Line mainLine) {
        this.mainLine = mainLine;
    }

    public PointContainer getPointContainer() {
        return pointContainer;
    }

    public void setPointContainer(PointContainer pointContainer) {
        this.pointContainer = pointContainer;
    }
    private void SetToDefaultVariables(){
        localisation = new LocalizationController();
        defaultFormName = localisation.getBundle().getString("DefaultFormName");
        mainLine = new Line();
        pointContainer = new PointContainer();
        requiredPointsCount = 10;
    }
    private void SetToDefaultFormOptions(){
        setTitle(defaultFormName);
        setSize(Width, Height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        repaint();
    }
    public void updateUI() {
        // code to refresh the UI with new localization
        SetToDefaultFormContent();
        revalidate();
        repaint();
    }
    private void  SetToDefaultFormContent(){
        setJMenuBar(new MenuBar(this));
        getContentPane().removeAll();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new ButtonPanel(this), BorderLayout.NORTH);
        getContentPane().add(new DrawingPanel(this), BorderLayout.CENTER);
        getContentPane().add(new ConfigurationPanel(this), BorderLayout.EAST);
    }
    public void SetToDefaultConfiguration(){
        SetToDefaultVariables();
        SetToDefaultFormOptions();
        SetToDefaultFormContent();
    }
    public MainForm() {
        SetToDefaultConfiguration();
        setVisible(true);
    }
}