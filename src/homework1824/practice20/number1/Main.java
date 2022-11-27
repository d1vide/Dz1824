package homework1.practice20.number1;

public class Main { // номер 1-2
    public static void main(String[] args) {
        JenericClass<Integer, Double, String> obj = new JenericClass<>(123, 123.5, "ababa");
        obj.printTypes();
        System.out.println(obj.getVarT() + " " + obj.getVarV() + " " + obj.getVarK());
    }
}
