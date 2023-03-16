import java.util.*;

public class Broker {
    Set<Topic> topics;
    Map<String, List<Message>> topicToMessagesMap;
    Map<String, List<ConsumerGroup>> topicToConsumerGroup;

    Map<String, Integer> consumerGroupToCurrOffset;

    public Broker() {
        this.topics = new HashSet<>();
        this.topicToMessagesMap = new HashMap<>();
        this.topicToConsumerGroup = new HashMap<>();
        this.consumerGroupToCurrOffset = new HashMap<>();
    }

    void createTopic(String topicName) {
        topics.add(new Topic(topicName));
        topicToMessagesMap.put(topicName, new ArrayList<>());
    }

    void addConsumerGroup(String topicName, ConsumerGroup consumerGroup) {
        List<ConsumerGroup> consumerGroups = this.topicToConsumerGroup.getOrDefault(topicName, new ArrayList<>());
        consumerGroups.add(consumerGroup);
        this.topicToConsumerGroup.put(topicName, consumerGroups);
    }

    void sendMessage(Message message) {
        List<ConsumerGroup> consumerGroups = this.topicToConsumerGroup.get(message.topicName);
        for(ConsumerGroup consumerGroup: consumerGroups) {
            consumerGroup.consume(message);
        }
    }

}
