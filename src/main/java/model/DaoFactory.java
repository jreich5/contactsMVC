package model;

import config.Config;

public class DaoFactory {
    private static Contacts contactsDao;
    public static Contacts getContactsDao() {
        if (contactsDao == null) {
            contactsDao = new FileContactsDao(new Config());
        }
        return contactsDao;
    }
}