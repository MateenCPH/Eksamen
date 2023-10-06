package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(1, 2, 3);
        Room room2 = new Room(2, 4, 6);
        Room room3 = new Room(3, 6, 9);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building mainBuilding = new Building(rooms, 10, 10, true);

        isNormal(mainBuilding);
        countLampsInBuilding(mainBuilding);
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps = totalLamps + room.getNumberOfLamps();
        }
        //System.out.println("In " + building + " there are " + totalLamps + " lamps");
        return totalLamps;


    }

    public static boolean isNormal(Building building) {
        /*int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        if (numberOfFloors > numberOfRooms) {*/
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            System.out.println("This is not an odd building");
            return true;
        } else {
            System.out.println("This in an odd building");
            return false;
        }

    }
}
