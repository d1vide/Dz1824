package homework1824.collections3;

import java.util.Iterator;

class MyListIterator<T> implements Iterator<T> {
    private Node<T> current;

    public MyListIterator(MyList<T> list)
    {
        current = list.getHead();
    }

    public boolean hasNext()
    {
        return current != null;
    }

    public T next()
    {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

}