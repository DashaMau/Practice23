public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int head;
    private static int tail;
    private static int size;

    static {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    public static void enqueue(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }


    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = elements[head];
        elements[head] = null; // Удаляем ссылку для сборщика мусора
        head = (head + 1) % elements.length;
        size--;
        return result;
    }


    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }


    public static int size() {
        return size;
    }


    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    private static void resize() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[(head + i) % elements.length];
        }
        elements = newArray;
        head = 0;
        tail = size;
    }
}

