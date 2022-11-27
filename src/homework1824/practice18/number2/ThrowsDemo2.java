package homework1.practice18.number2;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("mist");
        }

    }
    public void printDetails(String key)  {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println("Mistake");
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "p") {
           throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}

