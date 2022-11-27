package homework1824.collections3;

import java.util.Iterator;
class MyList<T> implements Iterable<T> {
    Node<T> head, tail;
    public void add(T data)
    {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    // return Head
    public Node<T> getHead()
    {
        return head;
    }

    // return Tail
    public Node<T> getTail()
    {
        return tail;
    }


    public Iterator<T> iterator()
    {
        return new MyListIterator<T>(this);
    }
}