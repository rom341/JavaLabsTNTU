package org.example.Lab7.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointContainer {
    private List<Point> points;

    public PointContainer() {
        points = new ArrayList<>();
    }

    public PointContainer(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void GeneratePoints(int count){
        points.clear();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            points.add(new Point(random.nextInt(300), random.nextInt(300)));
        }
    }
    private int GetPointPositioningFromLine(Point point, Line line){
        //Якщо значення <0 то точка знаходиться зправа від лінії
        return (line.getEnd().getX() - line.getBegin().getX()) * (point.getY() - line.getBegin().getY()) -
                (line.getEnd().getY() - line.getBegin().getY()) * (point.getX() - line.getBegin().getX());
    }
    public int CountOfPointsAtTheLeftFromLine(Line line) {
        int count = 0;
        for (Point point : points) {
            double position = GetPointPositioningFromLine(point, line);
            if (position > 0) {
                count++;
            }
        }
        return count;
    }

}
