public class CountObjects {
    private static int c = 0;

    public CountObjects(){
        c++;
    }

    public static int get_count(){
        return c;
    }

    public static void main(String[] args){
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();

        System.out.println("Number of objects: "+ CountObjects.get_count());
    }
}