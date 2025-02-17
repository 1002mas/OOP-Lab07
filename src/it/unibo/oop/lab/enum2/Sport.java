/**
 * 
 */
package it.unibo.oop.lab.enum2;

import java.util.ArrayList;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * 
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
    BASKET(5, "Basketball", Place.INDOOR), VOLLEY(6, "Volleyball", Place.INDOOR), TENNIS(1, "Tennis", Place.OUTDOOR),
    BIKE(1, "Bike", Place.OUTDOOR), F1(1, "F1", Place.OUTDOOR), MOTOGP(1, "MotoGP", Place.OUTDOOR),
    SOCCER(11, "Soccer", Place.OUTDOOR);

    /*
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
    private final int noTeamMembers;
    private final String actualName;
    private final Place place;

    /*
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
    Sport(int noTeamMembers, String actualName, Place place) {
        this.noTeamMembers = noTeamMembers;
        this.actualName = actualName;
        this.place = place;
    }

    /*
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
    public boolean isIndividualSport() {
        return this.noTeamMembers == 1;
    }

    public boolean isIndoorSport() {
        return this.place == Place.INDOOR;
    }

    public Place getPlace() {
        return this.place;
    }

    public String toString() {
        return "Sport[ name=" + this.actualName + ", place=" + this.place + ", peoplePerTeam=" + this.noTeamMembers
                + "]";
    }
}
