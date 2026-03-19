/* Port từ bản C# (hotel-room.cs) — cấu trúc tương đương. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelRoom {
    static List<Integer> divisors = new ArrayList<>();

    static int[] getDivisors(int number) {
        for (int i = number; --i > 0; ) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }

    static List<List<Integer>> subsets = new ArrayList<>();

    static List<List<Integer>> getSubsets(int[] divisorsArr) {
        for (int division : divisorsArr) {
            // Giữ kích thước tại đầu vòng — tránh sửa list khi foreach (tương tự hạn chế bản C#).
            int size = subsets.size();
            for (int j = 0; j < size; j++) {
                List<Integer> pom = new ArrayList<>();
                pom.add(division);
                subsets.add(pom);
            }
        }
        return subsets;
    }

    static boolean isRoom(List<List<Integer>> subsetList, int room) {
        for (List<Integer> subset : subsetList) {
            int sum = 0;
            for (int v : subset) {
                sum += v;
            }
            if (sum == room) {
                return false;
            }
        }
        return true;
    }

    static void findRoom(int totalRooms) {
        for (int i = 0; ++i <= totalRooms; ) {
            int[] divs = getDivisors(i);
            int sum = 0;
            for (int d : divs) {
                sum += d;
            }

            if (sum <= i) {
                continue;
            }

            if (isRoom(getSubsets(divs), i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the total number of rooms in hotel: ");
            int input = Integer.parseInt(scanner.nextLine().trim());
            findRoom(input);
        } catch (Exception e) {
            System.err.println("There was an error. Please try again!");
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                findRoom(input);
            } catch (Exception e2) {
                System.err.println("Access denied!");
            }
        }
    }
}
