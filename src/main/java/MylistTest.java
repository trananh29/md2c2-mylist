public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> abc= new MyList<Integer>();
        abc.add(12);
        abc.add(10);
        abc.add(33);
        abc.add(99);
        abc.add(100);
        System.out.println("Element 4" + abc.get(1));
        System.out.println("Element 1" + abc.get(2));
        System.out.println("Element 2 "+ abc.get(3));
       abc.get(6);
       System.out.println("element 6: " + abc.get(6));
    }
}
