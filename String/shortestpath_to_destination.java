package string;

import java.util.Scanner;

public class shortest_path_toDestination {

    public static float shortestPath(String destination) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < destination.length(); i++) {
            char dir = destination.charAt(i);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path (E/W/N/S): ");
        String destination = sc.nextLine().toUpperCase();

        float distance = shortestPath(destination);

        System.out.println("Shortest Distance = " + distance);

        sc.close();
    }
}
