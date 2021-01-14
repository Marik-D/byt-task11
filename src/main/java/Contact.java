import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Contact {
    private int idSender;
    private int idReceiver;
    private List<String> messages;

    public Contact(int idSender, int idReceiver) {
        this.idSender = idSender;
        this.idReceiver = idReceiver;
        this.messages = new ArrayList<>();
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

    public List<String> getMessages() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return idSender == contact.idSender &&
                idReceiver == contact.idReceiver &&
                Objects.equals(messages, contact.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSender, idReceiver, messages);
    }
}
