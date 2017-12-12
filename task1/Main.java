package task1;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println(generator.createList(5,0,10));
        System.out.println(generator.createSet(5,0,10));
    }
}
