public class Overloading2 {
    public int area(int a){
        return (a*a);
    }

    public int area(int a, int b){
        return (a*b);
    }

    public double area(double a){
        double pi = 3.14;
        return (pi*a*a);
    }

    public static void main(String[] args){
        Overloading2 fig = new Overloading2();
        System.out.println("Area of Square is "+ fig.area(5));
        System.out.println("Area of Rectangle is "+ fig.area(6,7));
        System.out.println("Area of Circle is "+ fig.area(5.0));
    }
}
