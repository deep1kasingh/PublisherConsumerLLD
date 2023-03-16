
/*
Problem Statement
Design and implement an in memory Queue.
You can create multiple topics and push messages to topic.
Messages can be of any form.
Consumers can subscribe to a topic and start consuming.
Enhancement: Multiple consumers can form a group and subscribe to a topic.
Consumers can set offset for a topic.
 */

/*
Publisher:
Broker broker
broker.publishMessage(topicName, message)

Message<T> {
    T message;
    long timestamp;
}

Topic<T> {
    String topicName;
    int createdAt;
}

Broker: Map<topicName, List<Messages{timestamp, }>>
Map<topicName, List<Consumer>>
createTopic(topicName, messageType{enum})
addConsumerGroup(topicName, consumerGroup)
sendMessage(topicName, offset) -> if there are any new messages, send the next offset message, block till new message has come for the consumer

ConsumerGroup {
    Map<topicName, Integer> topicToOffset;
    List<Consumer> consumer;
    addConsumer(consumer);
    subscribeTopic();
    for(each consumer) {
        for (each topic) {
            boolean consumer.consume(topic, currOffset); // retry on failure
        }
    }
}

Consumer:
    Message consume(topic, currOffset); -> update currOffset

 */
public class Main {
    Publisher publisher = new Publisher();

}
