import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contact {
    private int idSender;
    private int idReceiver;
    private ArrayList<String> messages;

    public Contact(int idSender, int idReceiver) {
        this.idSender = idSender;
        this.idReceiver = idReceiver;
        this.messages = new ArrayList<String>();
    }

    public Contact() {

    }

    public int getIdSender() {
        return idSender;
    }

    public void setIdSender(int idSender) {
        this.idSender = idSender;
    }

    public int getIdReceiver() {
        return idReceiver;
    }

    public void setIdReceiver(int idReceiver) {
        this.idReceiver = idReceiver;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public void send(String message) {
        messages.add(message);
    }

    public List<String> readOld(Date date) {
        return messages;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idSender=" + idSender +
                ", idReceiver=" + idReceiver +
                ", messages=" + messages +
                '}';
    }
}
