package org.example;

public class Shape {
    public String shapeName;
    public int numberOfEdges;
    public double radius;
    public int edges;
    public double edgeLength;
    public double e1;
    public double e2;
    public double e3;

    public Shape() {
        System.out.println("Creation of shape form");
        shapeName = "Undefined shape";
    }
    public Shape(double radius) { //circle
        System.out.println("Creation of a circle");
        this.radius=radius;
        this.shapeName="circle";

    }
    public Shape(int edges, double edgeLength){ //square
        System.out.println("Creation of a square");
        this.edges=edges;
        this.edgeLength=edgeLength;
        this.shapeName="square";
        this.numberOfEdges=4;
    }
    public Shape(int edges, double e1, double e2){ //rectangle
        System.out.println("Creation of a rectangle");
        this.edges=edges;
        this.e1=e1;
        this.e2=e2;
        this.shapeName="rectangle";
        this.numberOfEdges=4;
    }
    public Shape(int edges, double e1, double e2, double e3){//triangle
        System.out.println("Creation of a triangle");
        this.edges=edges;
        this.e1=e1;
        this.e2=e2;
        this.e3=e3;
        this.shapeName="triangle";
        this.numberOfEdges=3;
    }

    public String getShapeDetails(){
       if(shapeName=="circle")
           return shapeName+" have radius of "+radius;
       if(shapeName=="square")
           return shapeName+" have "+edges+" edges"+", length "+edgeLength;
       if(shapeName=="rectangle")
           return shapeName+" have "+edges+" edges"+", e1:"+e1+" e2:"+e2;
       if(shapeName=="triangle")
           return shapeName+" have "+edges+" edges"+", e1:"+e1+" e2:"+e2+" e3:"+e3;
       return "Undefined shape";
    }

}
