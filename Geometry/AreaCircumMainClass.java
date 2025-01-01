package Geometry;

import java.util.*;

class AreaCircum {
    double area, base, height;
    void triangleArea(){
        System.out.println("Area of a triangle where base "+base+" and height "+height+" is "+(area = (0.5)*base*height));
    }
    double radius,circum;
    void circleCircum(){
        System.out.println("Circumference of the circle of radius "+radius+" is "+(circum = 2*(3.14)*radius));
    }
    double circleArea;
    void circleArea(){
        System.out.println("Area of the circle where radius "+radius+"  is "+(circleArea = 2*2*3.14*radius));
    }
}
class AreaCircumMainClass {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        AreaCircum ac = new AreaCircum();
        int choose;
        System.out.println("Choose Operation : "+'\n'+" 1.TriangleArea "+'\n'+" 2.CircleArea "+'\n'+" 3.CircleCircumference");
        choose = s.nextInt();
        System.out.println("Choose of the operation ");
        switch (choose) {
            case 1:
                System.out.println("Enter the base of the triangle ");
                ac.base = s.nextDouble();
                System.out.println("Enter the height of the triangle ");
                ac.height = s.nextDouble();
                ac.triangleArea();
                break;
            case 2:
                System.out.println("Enter the radius of the circle ");
                ac.radius = s.nextDouble();
                ac.circleArea();
                break;
            case 3:
                System.out.println("Enter the radius of the circle ");
                ac.radius = s.nextDouble();
                ac.circleCircum();
                break;
            default:
                System.out.println("Invalid operations ");
                break;
        }
    }
}

