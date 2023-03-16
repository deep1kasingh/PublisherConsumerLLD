public class Publisher {
    private Broker broker;

    public void sendMessage(Message message) {
        this.broker.sendMessage(message);
    }

    public void createTopic(String topicName) {
        this.broker.createTopic(topicName);
    }
}
