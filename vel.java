import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IslandTracker {
    private int currentId;
    private Map<Integer, List<Coordinate>> islandMap;

    public IslandTracker() {
        currentId = 0;
        islandMap = new HashMap<>();
    }

    public void addIsland(List<Coordinate> coordinates) {
        currentId++;
        islandMap.put(currentId, coordinates);
    }

    public Map<Integer, List<Coordinate>> getIslandMap() {
        return islandMap;
    }
}

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
