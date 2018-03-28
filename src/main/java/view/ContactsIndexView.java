package view;

import model.Contact;

import java.util.List;

public class ContactsIndexView {

    public static void showContactsView(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println("____________________________________");
            System.out.println("Contact name: " + contact.getName());
            System.out.println("Contact number: " + contact.getNumber());
        }
    }

}
