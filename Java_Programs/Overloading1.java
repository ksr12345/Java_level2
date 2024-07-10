public class Overloading1 {
    public int add(int a, int b){
        return (a+b);
    }

    public int add(int a, int b, int c){
        return (a+b+c);
    }

    public int add(int a, int b, int c, int d){
        return (a+b+c+d);
    }

    public static void main(String[] args){
        Overloading1 sum = new Overloading1();
        System.out.println(sum.add(10, 20));
        System.out.println(sum.add(10, 20, 30));
        System.out.println(sum.add(10, 20, 30,40));
    }
}
