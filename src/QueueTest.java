public class QueueTest {
    public static void main(String[] args) {

        System.out.println("Тестирование класса ArrayQueueModule:");
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println(ArrayQueueModule.element()); // 1
        System.out.println(ArrayQueueModule.dequeue()); // 1
        System.out.println(ArrayQueueModule.size()); // 2
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true


        System.out.println("\nТестирование класса ArrayQueueADT:");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        queueADT.enqueue(3);
        System.out.println(queueADT.element()); // 1
        System.out.println(queueADT.dequeue()); // 1
        System.out.println(queueADT.size()); // 2
        queueADT.clear();
        System.out.println(queueADT.isEmpty()); // true


        System.out.println("\nТестирование класса ArrayQueue:");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.size()); // 2
        queue.clear();
        System.out.println(queue.isEmpty()); // true
    }
}

