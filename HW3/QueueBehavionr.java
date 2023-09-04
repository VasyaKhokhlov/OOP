package HW3;

interface QueueBehaviour {
    void enqueue(Person person);
    Person dequeue();
    int size();
}