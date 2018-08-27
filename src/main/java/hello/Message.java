package hello;

public class Message {
    private long id;
    private String username, body;

    public Message(long id, String username, String body) {
        this.id = id;
        this.username = username;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format(
                "Message[id=%d, username='%s', body='%s']",
                id, username, body);
    }

}