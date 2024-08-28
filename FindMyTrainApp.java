package project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();
        // Adding Station
        Station station1 = new Station("ST01", "Nagpur");
        Station station2 = new Station("ST02", "Pune");

        // Adding Trains
        Train train1 = new Train("TR01", "Rajdhani Express", "Express");
        Train train2 = new Train("TR02", "Garib Rath Express", "Passenger");

        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);

        platform1.setTrain(train1);
        platform2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);

        station1.setPlatformList(platformList);

        Schedule s1 = new Schedule(train1, station1, "9AM", "9:05AM", platform1);
        Schedule s2 = new Schedule(train2, station2, "10AM", "10:10AM", platform2);

        system.addStations(station1);
        system.addStations(station2);
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source:");
        String source = sc.nextLine();

        System.out.println("Enter the destination:");
        String destination = sc.nextLine();

        List<Schedule> myTrains = system.findMyTrain(source, destination);
        System.out.println("Your trains between " + source + " and " + destination + ":");

        for (Schedule schedule : myTrains) {
            System.out.println(schedule);
        }

        sc.close();
    }
}
