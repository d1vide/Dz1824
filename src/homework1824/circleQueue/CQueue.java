package homework1824.circleQueue;

public class CQueue {
    int SIZE = 5; // Размер круговой очереди
    int front, rear;
    int items[] = new int[SIZE];

    CQueue() {
        front = -1;
        rear = -1;
    }

    // Проверяем, не заполнена ли очередь
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Проверяем, не пуста ли очередь
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Добавляем новый элемент
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Добавлено значение " + element);
        }
    }

    // Удаление элемента
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /*  Внутри Q только один элемент, поэтому очередь сбрасывается
           в начальное состояние после удаления последнего элемента */ else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    void display() {
        /* Функция выводит консоль статус кругового списка*/
        int i;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println("Указатель FRONT-> " + front);
            System.out.println("Элементы -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }
}