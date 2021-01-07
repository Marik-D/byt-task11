import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void setIdSender() {
        Contact contact = new Contact();
        contact.setIdSender(5);
        assertEquals(5, contact.getIdSender());
    }

    @Test
    public void setIdReceiver() {
        Contact contact = new Contact();
        contact.setIdReceiver(5);
        assertEquals(5, contact.getIdReceiver());
    }

    @Test
    public void setMessages() {
        Contact contact = new Contact();
        ArrayList<String> messages = new ArrayList<>();
        messages.add("msg 1");
        messages.add("msg 2");
        contact.setMessages(messages);
        assertEquals(messages, contact.getMessages());
    }

    @Test
    public void send() {
        Contact contact = new Contact();
        ArrayList<String> messages = new ArrayList<>();
        messages.add("msg 1");
        messages.add("msg 2");
        contact.setMessages(messages);
        contact.send("foo");
        assertEquals("foo", contact.getMessages().get(2));
    }

    @Test
    public void readOld() {
        Contact contact = new Contact();
        ArrayList<String> messages = new ArrayList<>();
        messages.add("msg 1");
        messages.add("msg 2");
        contact.setMessages(messages);
        assertEquals(messages, contact.readOld(new Date(2011)));
    }
}