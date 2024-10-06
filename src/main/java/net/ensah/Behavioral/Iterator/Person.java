package net.ensah.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements  Iterable<String>{

   private final List<String> people= new ArrayList<>();

    public Person() {
        people.add("Abdelilah");
        people.add("said");
        people.add("mohamed");
        people.add("ali");
    }

    @Override
    public Iterator<String> iterator() {
        return new UserIterator();
    }

    private class UserIterator implements Iterator<String>{

        private int index=0;

        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return people.get(index++);
            }
            return null;
        }
    }
}
