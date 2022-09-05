package com.area.shape;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape name");
        String shapeName=sc.next();
        
        switch(shapeName) {
        case "Square":
            System.out.println("enter the side ");
            double length =sc.nextDouble();
            Square obj=new Square(length);
            System.out.println(obj.area());  
            break;
            
        case "Rectangle":
            System.out.println("enter the length and breadth ");
            double length1 =sc.nextDouble();
            double breadth1=sc.nextDouble();
            Rectangle obj2=new Rectangle(length1 , breadth1);
            System.out.println(obj2.area());
            break;
            
        case "Circle":
            System.out.println("enter the radius ");
            double length2 =sc.nextDouble();
            Circle obj3=new Circle(length2);
            System.out.println(obj3.area());
            break;
            
        case "Triangle":
            System.out.println("enter the base and height ");
            double length3 =sc.nextDouble();
            double breadth3 =sc.nextDouble();
            Triangle obj4=new Triangle(length3 , breadth3);
            System.out.println(obj4.area());
            break;
            
        case "Hexagon":
            System.out.println("enter the side ");
            double length4 =sc.nextDouble();
            Hexagon obj5=new Hexagon(length4);
            System.out.println(obj5.area());    
            break;
            
        default:
            System.out.println("wrong choice ");
            }
	}

}
