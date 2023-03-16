import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConsumerGroup {
    Broker broker;
    String name;
    Queue<Consumer> consumers;

    public ConsumerGroup(String name, Broker broker) {
        this.broker = broker;
        this.name = name;
        this.consumers = new LinkedList<>();
    }

    public void subscribe(String topic) {
        this.broker.addConsumerGroup(topic, this);
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public void removeConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }

    public void consume(Message message) {
        Consumer consumer = this.consumers.poll();
        consumer.consume(message);
        this.consumers.add(consumer);
    }

}
