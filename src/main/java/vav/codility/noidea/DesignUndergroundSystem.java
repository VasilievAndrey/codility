package vav.codility.noidea;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DesignUndergroundSystem {


    private Map<Integer, Map<String, Integer>> checkIn = new ConcurrentHashMap<>();
    private Map<String, Map<String, Double[]>> average = new ConcurrentHashMap<>();

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> stattions = checkIn.get(id);
        if (stattions == null) {
            stattions = new HashMap<>();
        }
        stattions.put(stationName, t);
        checkIn.put(id, stattions);
    }

    public void checkOut(int id, String stationName, int t) {
        Map<String, Integer> checkIns = checkIn.get(id);
        if (checkIns == null) {
            return;
        }
        Map.Entry<String, Integer> entry = checkIns.entrySet().iterator().next();
        Integer checkinTime = entry.getValue();
        String checkInStation = entry.getKey();
        Map<String, Double[]> statIn = average.get(checkInStation);
        if (statIn == null) {
            statIn = new HashMap<>();
            statIn.put(stationName, new Double[]{(double) t - checkinTime, (double) 1});
        } else {
            Double[] stats = statIn.get(stationName);
            if (stats == null) {
                statIn.put(stationName, new Double[]{(double) t - checkinTime, (double) 1});
            } else {
                double time = stats[0] + t - checkinTime;
                statIn.put(stationName, new Double[]{time, (stats[1] + 1)});
            }
        }
        checkIn.remove(id);
        average.put(checkInStation,statIn);
    }


    public double getAverageTime(String startStation, String endStation) {
        Map<String, Double[]> start = average.get(startStation);
        if (start == null) {
            throw new IllegalArgumentException();
        }

        return start.get(endStation)[0]/ start.get(endStation)[1];
    }
}
