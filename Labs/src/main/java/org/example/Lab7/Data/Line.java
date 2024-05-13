package org.example.Lab7.Data;

public class Line {
    private Point Begin, End;

    public Line() {
        Begin = new Point(0, 0);
        End = new Point(0, 0);
    }

    public Line(Point begin, Point end) {
        Begin = begin;
        End = end;
    }

    public Point getBegin() {
        return Begin;
    }

    public void setBegin(Point begin) {
        Begin = begin;
    }

    public Point getEnd() {
        return End;
    }

    public void setEnd(Point end) {
        End = end;
    }
}
