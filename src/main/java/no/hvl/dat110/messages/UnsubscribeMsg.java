package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 
	private String topic;
    public UnsubscribeMsg(String user, String topic) {
    	super(MessageType.UNSUBSCRIBE, user);
    	if (topic == null) {
    		throw new IllegalArgumentException();
    	}
    	this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required
    public String getTopic() {
    	return topic;
    }
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    @Override
    public String toString() {
    	return "Message [type=" + getType() + ", user=" + getUser() + ", topic=" + topic + "]";
    }
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
}
