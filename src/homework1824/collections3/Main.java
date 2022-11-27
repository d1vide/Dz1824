package homework1824.collections3;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("123");
        myList.add("456");
        myList.add("789");
        for (String string : myList)
            System.out.println(string);
    }
}
