package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Gwiazdy poslkiej muzyki", 31.25, 43.0, true));
        stamps.add(new Stamp("300. rocznica urodzin Immanuela Kanta", 31.25, 43.0, false));
        stamps.add(new Stamp("Międzynarodowy Dzień Dziecka", 31.25, 39.5, false));
        stamps.add(new Stamp("80. rocznica bitwy pod Monte Cassino", 31.25, 43.0, true));
        stamps.add(new Stamp("80. rocznica bitwy pod Monte Cassino", 31.2, 43.0, true));
        stamps.add(new Stamp("80. rocznica bitwy pod Monte Cassino", 31.25, 43.0, false));
        stamps.add(new Stamp("Gwiazdy poslkiej muzyki", 31.25, 43.0, true));
        stamps.add(new Stamp("Gwiazdy poslkiej muzyki", 31.25, 43.0, true));

        for (Stamp stampObject : stamps)
            System.out.println(stampObject);

        stamps.size();
        System.out.println(stamps.size());

        for (Stamp stampObject:stamps){
            if(stampObject.getStampLength()>40 && stampObject.isStamped()==true)
                System.out.println(stampObject.getStampName());
        }

    }
}

