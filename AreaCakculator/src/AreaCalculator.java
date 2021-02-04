public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(50));
        System.out.println(area(20,20));
    }
    public static double area(double radius){
        if (radius <0) return -1;
        else return radius*radius*Math.PI;
    }
    public static double area (double x, double y){
        if(x<0 || y<0) return -1;
        else return x*y;
    }
}
