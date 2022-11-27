package homework1.practice19.number1;

public class Client {
    private String name;
    private String surname;
    private int inn;

    public Client(String name, String surname, int inn) {
        this.name = name;
        this.surname = surname;
        this.inn = inn;
    }

    public int getInn() {
        return inn;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
