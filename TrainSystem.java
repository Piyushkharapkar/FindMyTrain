package project2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String , Station> stations = new HashMap<>();
    private Map<String , Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStations(Station station) {
        stations.put(station.getStationID() , station);
    }

    public void addTrain(Train train) {
        trains.put(train.getTrainID() , train);
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrain(String startStationName, String endStationName) {
        List<Schedule> result = new ArrayList<>();
        boolean sourceFound = false;

        for (Schedule schedule : schedules) {
            if (schedule.getStation().getStationName().equals(startStationName)) {
                sourceFound = true;
                result.add(schedule);
            } else if (sourceFound && schedule.getStation().getStationName().equals(endStationName)) {
                result.add(schedule);
                break;
            }
        }

        return result;
    }

}
