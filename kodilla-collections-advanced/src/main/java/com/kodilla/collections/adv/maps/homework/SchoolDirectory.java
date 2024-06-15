package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal xavier = new Principal("Charles Xavier", "Xavier's Institute for Gifted Youngsters");
        Principal graff = new Principal("Hyrum Graff", "Battle School");
        Principal dumbledore = new Principal("Albus Dumbledore", "Hogwarts School of Witchcraft and Wizardry");
        Principal brinkerhoff = new Principal("Richard Brinkerhoff.", "Godolkin University");
        Principal weems = new Principal("Larissa Weems", "Nevermore Academy");
        Principal fogg = new Principal("Henry Fogg", "Brakebills University for Magical Pedagogy");

        School xavierSchool = new School(Arrays.asList(15, 20, 30, 8, 3));
        School graffSchool = new School(Arrays.asList(8, 8, 9, 50));
        School dumbledoreSchool = new School(Arrays.asList(44, 60, 41, 15));
        School brikenhoffSchool = new School(Arrays.asList(3, 15, 8, 4, 12, 0));
        School weemsSchool = new School(Arrays.asList(50, 3, 60, 8, 99, 1));
        School foggSchool = new School(Arrays.asList(14, 33, 6, 51));

        schools.put(xavier, xavierSchool);
        schools.put(graff, graffSchool);
        schools.put(dumbledore, dumbledoreSchool);
        schools.put(brinkerhoff, brikenhoffSchool);
        schools.put(weems, weemsSchool);
        schools.put(fogg, foggSchool);

        for (Map.Entry<Principal, School> schoolInfo : schools.entrySet())
            System.out.println("School :" + schoolInfo.getKey().getSchoolName() + " is run by " + schoolInfo.getKey().getPrincipalName() + ", and there is " + schoolInfo.getValue().getSumOfStudents() + " students.");
    }
}