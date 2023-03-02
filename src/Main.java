import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] map = getMap();
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
                { -1, 00, 00, 00, 00, 00, 00, -1, 00, -1, -1, 00, -1, 00, -1},
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
    }

    private static String mapToString(int[][] map) {
        StringBuilder sb = new StringBuilder();
        int length = map.length;

        for (int i = 0; i <= length; i++) {
            if (i == 0){
                sb.append("   †");
            } else {
                sb.append(String.format("%4d", i));
            }
        }
        sb.append("\n");
        for (int row = 0; row < length; row++) {
            sb.append(String.format("%4d", row + 1));
            for (int col = 0; col < map[row].length; col++) {
                if (map[row][col] == -1) {
                    sb.append(String.format("%4s",  "∆"));
                } else {
                    sb.append(String.format("%4s", "•"));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}