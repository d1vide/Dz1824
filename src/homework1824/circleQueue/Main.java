package homework1824.circleQueue;

public class Main {
    public static void main(String[] args) {
        CQueue q = new CQueue();

        // Ошибка, потому что FRONT = -1
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Ошибка при добавлении элемента, потому что FRONT == 0 && REAR == SIZE - 1
        q.enQueue(6);

        q.display();

        int elem = q.deQueue();

        if (elem != -1) {
            System.out.println("Удаленный элемент: " + elem);
        }
        q.display();

        q.enQueue(7);

        q.display();

        // Ошибка при добавлении элемента, потому что FRONT == REAR + 1
        q.enQueue(8);
    }
}