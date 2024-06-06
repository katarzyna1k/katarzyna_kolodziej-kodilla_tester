package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job doctor = new Doctor(8500, "zajmuje się utrzymywaniem i przywracaniem zdrowia");
        Person person = new Person(doctor, "John", 34);
        person.showResponsibilities();

        Job hairdresser = new Hairdresser(5000, " strzyżeniem, modelowaniem, koloryzacją włosów");
        Person person1 = new Person(hairdresser, "Kevin", 22);
        person1.showResponsibilities();

        Job firefighter = new Firefighter(6500, "ratowanie zagrożonych ludzi, zwierząt, mienia i środowiska");
        Person person2 = new Person(firefighter, "bob", 45);
        person2.showResponsibilities();
        
    }
}
