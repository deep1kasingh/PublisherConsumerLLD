public class Topic {
    String topicName;
    long createdAt;

    public Topic(String topicName) {
        this.topicName = topicName;
        this.createdAt = System.currentTimeMillis();
    }
}
