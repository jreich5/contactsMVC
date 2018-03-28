package controller;

import model.Contacts;
import model.DaoFactory;
import view.ContactsIndexView;
import view.ContactsPromptView;
import view.ExitView;
import view.WelcomeView;

import java.util.Scanner;

public class ViewContactsController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contacts contactsDao = DaoFactory.getContactsDao();

        WelcomeView.showWelcomeView();
        ContactsPromptView.showPromptView();

        if (sc.next().equals("yes")) {
            ContactsIndexView.showContactsView(contactsDao.all());
        }

        ExitView.showExitView();

    }

}
