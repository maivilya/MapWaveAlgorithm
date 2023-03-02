package Lesson6;

public class MapToString {
    public String ToString(int[][] map){
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
}
