package model;

import config.Config;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileContactsDao implements Contacts {

    private Path path;

    public FileContactsDao(Config config) {
        String filePath = config.getPath();
        String file = config.getFile();
        this.path = Paths.get(filePath, file);
    }

    public List<Contact> all() {
        List<Contact> contacts = new ArrayList<>();

        try {
            List<String> contactStrings = Files.readAllLines(path);
            for (String contactString : contactStrings) {
                contacts.add(generateContact(contactString));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;

    }

    private Contact generateContact(String contactString) {
        String[] nameContactArr = contactString.split("\\|");
        return new Contact(nameContactArr[0], nameContactArr[1]);
    }



}
