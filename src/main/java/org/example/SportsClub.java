package org.example;

public class SportsClub {
    private String clubName;
    private String city;

    public SportsClub(String clubName, String city) {
        this.clubName = clubName;
        this.city = city;
    }
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void displayInfo() {
        System.out.println("Sports Club: " + clubName + ", City: " + city);
    }
}
