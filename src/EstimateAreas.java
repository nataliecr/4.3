import java.util.Scanner;

public class EstimateAreas {
  public static void main(String[] args){
    final double RAD = 6371.01;
      
    double x_a = Math.toRadians(33.7489954);
    double y_a = Math.toRadians(-84.3879824);
    double x_o = Math.toRadians(28.5383355) ;
    double y_o = Math.toRadians(-81.37923649999999);
    double x_s = Math.toRadians(32.0835407);
    double y_s = Math.toRadians(-81.09983419999998);
    double x_c = Math.toRadians(35.2270869);
    double y_c = Math.toRadians(-80.84312669999997);
    
    double side1 = RAD * Math.acos(Math.sin(x_a) * Math.sin(x_o) + 
            Math.cos(x_a) * Math.cos(x_o) * Math.cos(y_a - y_o));
    double side2 = RAD * Math.acos(Math.sin(x_o) * Math.sin(x_s) + 
            Math.cos(x_o) * Math.cos(x_s) * Math.cos(y_o - y_s));
    double side3 = RAD * Math.acos(Math.sin(x_s) * Math.sin(x_a) + 
            Math.cos(x_s) * Math.cos(x_a) * Math.cos(y_s - y_a));
    double s = (side1 + side2 + side3) / 2;
    double a1 = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    
    double side1_2 = RAD * Math.acos(Math.sin(x_s) * Math.sin(x_c) + 
            Math.cos(x_s) * Math.cos(x_c) * Math.cos(y_s - y_c));
    double side2_2 = RAD * Math.acos(Math.sin(x_c) * Math.sin(x_a) + 
            Math.cos(x_c) * Math.cos(x_a) * Math.cos(y_c - y_a));
    double side3_2 = RAD * Math.acos(Math.sin(x_a) * Math.sin(x_s) + 
            Math.cos(x_a) * Math.cos(x_s) * Math.cos(y_a - y_s));
    double s_2 = (side1_2 + side2_2 + side3_2) / 2;
    double a2 = Math.sqrt(s_2*(s_2-side1_2)*(s_2-side2_2)*(s_2-side3_2));
    double area = a1 + a2;
    
    System.out.println("The area is " + area);
    
  }   // main 
} // EstimateAreas
