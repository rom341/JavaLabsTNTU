package org.example.Lab7.Forms.MainForm;

import org.example.Lab7.Data.Point;
import org.example.Lab7.Data.PointContainer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class DrawingPanel extends JPanel {
    private MainForm mainForm;

    public DrawingPanel(MainForm mainForm) {
        this.mainForm = mainForm;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point mainLineBegin = mainForm.getMainLine().getBegin();
        Point mainLineEnd = mainForm.getMainLine().getEnd();
        PointContainer pointContainer = mainForm.getPointContainer();

        setBorder(new BevelBorder(2));

        if (mainForm.getMainLine() != null) {
            g.drawLine(
                    mainLineBegin.getX(), mainLineBegin.getY(),
                    mainLineEnd.getX(), mainLineEnd.getY()
            );
        }

        if (pointContainer.getPoints() != null) {
            for (Point point : pointContainer.getPoints()) {
                g.fillOval(point.getX(), point.getY(), 5, 5);
            }
        }
    }
}
