public class CircleAreaCalculator {

    public static double findCircleArea(double diameter) {
        //  radius of the circle
        double radius = diameter / 2.0;
        
        // area of the circle 
        double area = Math.PI * Math.pow(radius, 2);
        
        return area;
    }

    public static void main(String[] args) {
        double diameter = 10.0; // sample

        double area = findCircleArea(diameter);
        System.out.println("The area of the circle with diameter " + diameter + " is: " + area);
    }
}
