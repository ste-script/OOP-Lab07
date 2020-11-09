package it.unibo.oop.lab.anonymous1;

import java.util.Comparator;

import it.unibo.oop.lab.socialnetwork.User;

public class AnonymousComparator implements Comparator<User> {

    public AnonymousComparator() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compare(User usr0, User usr1) {
        return usr0.getAge() - usr1.getAge();
    }

}
