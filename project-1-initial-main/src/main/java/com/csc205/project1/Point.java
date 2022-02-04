package com.csc205.project1;

import java.lang.Math;

public class Point {

    //Declaring the variables used for Points
    private double x;
    private double y;

    //Creates a starting Point at the origin point
    public Point () {
        x = 0.0;
        y = 0.0;
    }

    //Creates a new Point with the user's coordinates
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Changes the x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    //Changes the y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    //Changes both coordinates of Point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Moves the Point left or right on the x-axis
    public void shiftX(double n) {
        x += n;
    }

    //Moves the Point up or down on the y-axis
    public void shiftY(double n) {
        y += n;
    }

    //Returns the x-coordinate of the given Point
    public double getX() {
        return x;
    }

    //Returns the y-coordinate of the given Point
    public double getY() {
        return y;
    }

    //Calculates the distance between two given Points
    public double distance(Point point2) {
        double x2 = point2.getX();
        double y2 = point2.getY();
        double distance;
        distance = Math.sqrt((Math.pow((x2 - x), 2)) + Math.pow((y2- y), 2));
        return distance;
    }

    //Calculates the new Point given an angle of rotation
    public void rotate(double angle) {
        x = ((x * Math.cos(angle)) - (y * Math.sin(angle)));
        y = ((x * Math.sin(angle)) + (y * Math.cos(angle)));
    }

    //Converts the Point to a String for printing
    public String toString( ) {
        return ("Point{x = " + x + ", y = " + y + "}");
    }

}