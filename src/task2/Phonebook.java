package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phonebook {
    public List<Recording> recordingList;

    public Phonebook() {
        recordingList = new ArrayList<>();
    }

    public void add(String name, Integer... phoneNumbers) {
        Recording newRecording = new Recording();
        List<Integer> newPhoneNumbers = new ArrayList<>();
        newRecording.setName(name);
        newRecording.setPhoneNumber(newPhoneNumbers);

        this.recordingList.add(newRecording);
    }

    public Recording find(String name) {

        for (Recording recording : recordingList) {
            if (recording.getName().equals(name)) {
                return recording;
            }
        }

        return null;
    }

    public List<Recording> findAll(String... name) {
        ArrayList<Recording> findResult = new ArrayList<>();

        for (String date : name) {
            for (int j = 0; j < recordingList.size(); j++) {
                if (recordingList.get(j).getName().equals(date)) {
                    findResult.add(recordingList.get(j));
                    break;
                } else if (j == (recordingList.size() - 1)) {
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
                "recordingList=" + recordingList +
                '}';
    }
}
