public class Message {
    String  message;
    long timestamp;
    String topicName;

    public Message(String message, long timestamp, String topicName) {
        this.message = message;
        this.timestamp = timestamp;
        this.topicName = topicName;
    }
}
