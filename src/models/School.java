package models;

import java.util.ArrayList;

public class School {

    private ArrayList<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {

        String membersString = "";

        for (int i = 0; i < members.size(); i++) {

            Person person = members.get(i);

            membersString += person.toString() + "\n";
        }

        return membersString;
    }
}
