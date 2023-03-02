package Lesson5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[][] map = getMap();
        System.out.println(mapToString(map));
        int[] start = getPoint2D(1,4);
        WaveAlgorithm(map, start);
        System.out.println(mapToString(map));
    }

    private static int[][] getMap(){
        return new int[][] {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
                { -1, 00, -1, -1, -1, 00, -1, -1, 00, -1, -1, -1, 00, 00, -1},
                { -1, 00, 00, 00, -1, 00, -1, -1, 00, -1, 00, -1, 00, 00, -1},
                { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, -1, 00, 00, -1},
                { -1, 00, -1, -1, -1, 00, -1, -1, 00, 00, 00, -1, 00, 00, -1},
                { -1, 00, -1, 00, 00, 00, -1, -1, 00, 00, 00, -1, -1, 00, -1},
                { -1, 00, -1, 00, 00, 00, -1, -1, 00, 00, 00, 00, -1, 00, -1},
                { -1, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1, 00, -1},
                { -1, 00, -1, 00, -1, -1, -1, 00, -1, -1, -1, 00, 00, 00, -1},
                { -1, 00, 00, 00, 00, -1, 00, 00, 00, -1, 00, 00, -1, 00, -1},
                { -1, 00, 00, 00, 00, 00, -1, 00, 00, -1, 00, 00, -1, 00, -1},
                { -1, 00, 00, 00, 00, 00, 00, -1, 00, -1, -1, 00, 00, 00, -1},
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
    }

    private static String mapToString(int[][] map){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= map[0].length; i++) {
            if (i == 0){
                sb.append(String.format("   †"));
            } else {
                sb.append(String.format("%4d", i));
            }
        }
        sb.append("\n");
        for (int row = 0; row < map.length; row++){
            sb.append(String.format("%4d", row + 1));
            for (int col = 0; col < map[row].length; col++) {
                if (map[row][col] == -1){
                    sb.append(String.format("%4d", map[row][col]));
                } else {
                    sb.append(String.format("%4d", map[row][col]));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void WaveAlgorithm(int[][] map, int[] start) {

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(start);
        map[start[0]][start[1]] = 1;

        while (queue.size() != 0) {
            int[] current_Position = queue.remove();
            int posX = current_Position[0];
            int posY = current_Position[1];

            if (map[posX - 1][posY] == 0) {
                int[] temp = new int[] { posX - 1, posY };
                queue.add(temp);
                map[posX - 1][posY] = map[posX][posY] + 1;
            }
            if (map[posX][posY - 1] == 0) {
                int[] temp = new int[] { posX, posY - 1 };
                queue.add(temp);
                map[posX][posY - 1] = map[posX][posY] + 1;
            }
            if (map[posX + 1][posY] == 0) {
                int[] temp = new int[] { posX + 1, posY };
                queue.add(temp);
                map[posX + 1][posY] = map[posX][posY] + 1;
            }
            if (map[posX][posY + 1] == 0) {
                int[] temp = new int[] { posX, posY + 1 };
                queue.add(temp);
                map[posX][posY + 1] = map[posX][posY] + 1;
            }
        }
    }

    public static int[] getPoint2D(int x, int y) {
        return new int[] { y, x };
    }

}