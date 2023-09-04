package HW2;

interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int size();
}