package org.example;

public class Main {
    public static void main(String[] args) {
        Sport Football=new Sport("Football",11);
        Sport Basketball=new Sport("Basketball",5);
        Athlete athlete1=new Athlete("Cristiano Ronaldo",40,Football);
        Athlete athlete2=new Athlete("Stefen Curry" , 37,Basketball);
        SportsClub club = new SportsClub("Golden State", "USA");


        Football.displayInfo();
        Basketball.displayInfo();

        athlete1.displayInfo();
        athlete2.displayInfo();

        club.displayInfo();
        if(athlete1.getAge()> athlete2.getAge()) {
            System.out.println(athlete1.getFullName()+"is older than"+ athlete2.getFullName());
        } else {
            System.out.println(athlete2.getFullName()+"is older than"+ athlete1.getFullName());

        }
    }
}