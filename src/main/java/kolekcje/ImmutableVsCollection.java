package kolekcje;

import java.util.HashSet;
import java.util.Set;

public class ImmutableVsCollection {

    private final Set<String> someSet;

    public ImmutableVsCollection(String someSet1, String someSet2) {
        Set<String> object = new HashSet<>();
        object.add(someSet1);
        object.add(someSet2);
        this.someSet = object;
    }

    public final Set<String> getSomeSet() {
        return new HashSet<>(someSet);
    }

    public static void main(String[] args) {

        ImmutableVsCollection obj = new ImmutableVsCollection("element1", "element2");
        System.out.println(obj.getSomeSet());
        obj.getSomeSet().add("elements3");
        System.out.println(obj.getSomeSet());
    }
}
