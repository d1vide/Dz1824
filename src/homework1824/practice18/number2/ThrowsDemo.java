package homework1.practice18.number2;

//public class ThrowsDemo {
//    public void printSomething(String s) {
//        if (s == null) {
//            throw new NullPointerException("Null into func");
//        }
//        System.out.println(s);
//    }
//}

//public class ThrowsDemo {
//    public void printMessage(String key) {
//        try {
//            String message = getDetails(key);
//            System.out.println( message );
//        } catch (NullPointerException e) {
//            System.out.println("Vveden null");
//        }
//
//    }
//    public String getDetails(String key) {
//        if(key == null) {
//            throw new NullPointerException( "null key in getDetails" );
//        }
//        return "data for" + key; }
//}
//

class ThrowsDemo {
    public void  getS(String s) {
        if (s == null) {
            throw new NullPointerException("askfldsf");
        }
        try {
            System.out.println(s);
        } catch (NullPointerException e) {
            System.out.println("null bil vveden");
        }
    }
}