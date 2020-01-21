package com.andrewd;
import java.util.Comparator;

public class ActorComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        String fullName1 = o1.getFullName();
        String fullName2 = o2.getFullName();
        return fullName1.compareTo( fullName2 );
    }
}
