package ru.itmo.java.basics.lesson3;
import java.util.Calendar;
public class House {
    private int numOfFloors;
    private int yearBuilt;
    private String name;

    public void setHouseDetails(int numOfFloors, int yearBuilt, String name) {
        this.numOfFloors = numOfFloors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void displayHouseDetails() {
        System.out.println("House Details:");
        System.out.println("Количество этажей : " + numOfFloors);
        System.out.println("Год постройки : " + yearBuilt);
        System.out.println("Название : " + name);
    }

    public int getYearsSinceBuilt() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearBuilt;
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.setHouseDetails(2, 1990, "House1");
        house1.displayHouseDetails();
        System.out.println("Years Since Built: " + house1.getYearsSinceBuilt());

        System.out.println();

        House house2 = new House();
        house2.setHouseDetails(3, 2005, "House2");
        house2.displayHouseDetails();
        System.out.println("Years Since Built: " + house2.getYearsSinceBuilt());
    }
}
