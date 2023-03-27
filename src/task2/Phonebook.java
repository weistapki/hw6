package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phonebook {
    public List<Recording> catalog;

    public Phonebook() {
        catalog = new ArrayList<>();
    }

    public void add(String name, Integer... phoneNumbers) {
        Recording newRecording = new Recording();
        List<Integer> newPhoneNumbers = new ArrayList<>();

        Collections.addAll(newPhoneNumbers, phoneNumbers);

        newRecording.setName(name);
        newRecording.setPhoneNumber(newPhoneNumbers);

        this.catalog.add(newRecording);
    }

    public Recording find(String name) {

        for (Recording recording : catalog) {
            if (recording.getName().equals(name)) {
                return recording;
            }
        }

        return null;
    }

    public List<Recording> findAll(String... names) {
        ArrayList<Recording> findResult = new ArrayList<>();

        for (String date : names) {
            for (int j = 0; j < catalog.size(); j++) {
                if (catalog.get(j).getName().equals(date)) {
                    findResult.add(catalog.get(j));
                    break;
                } else if (j == (catalog.size() - 1)) {
                    findResult.add(null);
                }
            }
        }

        if (findResult.contains(null)) {
            return null;
        }

        return findResult;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "recordingList=" + catalog +
                '}';
    }
}
