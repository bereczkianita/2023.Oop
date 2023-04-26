public interface IQueue {
     boolean isEmpty();
     boolean isFull();
     void enQueue(Object deQueue);
     Object deQueue();
     void printQueue();

}
