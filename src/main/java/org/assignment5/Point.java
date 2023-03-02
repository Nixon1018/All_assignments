package org.assignment5;

import java.util.logging.Logger;

public class Point{
    private static final Logger LOGGER=Logger.getLogger("InfoLogging");
    double x;
    double y;
    protected Point(double p1,double p2){
        x=p1;
        y=p2;
    }
    protected String check(double x,double y)
    {
        return ( this.x==x && this.y==y)?"true":"false";

    }
    protected Point(Point p){
        x=p.x;
        y=p.y;
    }

}