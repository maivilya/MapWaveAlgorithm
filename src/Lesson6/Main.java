package Lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenerateMap generateMap = new GenerateMap();
        int[][] map = generateMap.getMap();
        MapToString mapToString = new MapToString();
        System.out.println(mapToString.ToString(map));
        Point point = new Point();
        int[] start = point.getPoint2D(1,4);
        WaveAlgorithm algorithm = new WaveAlgorithm();
        algorithm.waveAlgorithm(map, start);
        System.out.println(mapToString.ToString(map));
    }
}
