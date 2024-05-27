// Q5. In the city of Toyland, there are N houses. Noddy is looking for a piece of land in the city
// to build his house. All the houses in the city lie in a straight line and all of them are given a 
// house number and position of the house from the entry point of the city.
// Noddy wants to find the house numbers between which he can build the largest house.
// Write an algorithm to help Noddy to find the house numbers between which he can build his house.

// Hint: No two houses will have the same position in case of multiple such answers,
// print the one with the least distance from the reference point.

// Input Format:
// The first line of the input consists of an integer num, representing the number of houses (N).
// The next N lines consist of two space-separated integers – house Num and pos, representing the house number and the position of the houses.

// Constraints:
// 2 < num < 10^6
// 1 < house Num < num
// 0 < pos < 10^6

// Output Format:
// Print two space-separated integers representing the house numbers in ascending order
// between which the largest plot is available.

// Sample Input:
// 5
// 3 7
// 1 9
// 2 0
// 5 15
// 4 30

// Sample Output:
// 4 5

import java.util.*;

public class LargeHouseInToyland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read the number of houses and their details
        int num = scanner.nextInt();
        int[] houseNums = new int[num];
        int[] positions = new int[num];
        for (int i = 0; i < num; i++) {
            houseNums[i] = scanner.nextInt();
            positions[i] = scanner.nextInt();
        }

        // Step 3: Sort both arrays based on the positions array using Bubble sort
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (positions[i] > positions[j]) {
                    // Swap positions
                    int tempPos = positions[i];
                    positions[i] = positions[j];
                    positions[j] = tempPos;

                    // Swap house numbers
                    int tempHouseNum = houseNums[i];
                    houseNums[i] = houseNums[j];
                    houseNums[j] = tempHouseNum;
                }
            }
        }

        // Step 4: Find the pair of houses with the maximum difference in positions
        int maxDiff = -1;
        int house1 = -1, house2 = -1;
        for (int i = 0; i < num - 1; i++) {
            int diff = positions[i + 1] - positions[i];
            if (diff > maxDiff) {
                maxDiff = diff;
                house1 = houseNums[i];
                house2 = houseNums[i + 1];
            }
        }

        // Step 6: Print the house numbers of the chosen pair in ascending order
        if (house1 < house2) {
            System.out.println(house1 + " " + house2);
        } else {
            System.out.println(house2 + " " + house1);
        }

        scanner.close();
    }
}


// Same problem but using Pointers

// class House {
//     int houseNum;
//     int pos;

//     House(int houseNum, int pos) {
//         this.houseNum = houseNum;
//         this.pos = pos;
//     }
// }

// public class LargeHouseInToyland {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Step 1: Read the number of houses and their details
//         int num = scanner.nextInt();
//         House[] houses = new House[num];
//         for (int i = 0; i < num; i++) {
//             int houseNum = scanner.nextInt();
//             int pos = scanner.nextInt();
//             houses[i] = new House(houseNum, pos);
//         }

//         // Step 2: Sort the array based on the pos property
//         Arrays.sort(houses, Comparator.comparingInt(a -> a.pos));

//         // Step 3: Find the pair of houses with the maximum difference in pos
//         int maxDiff = -1;
//         House house1 = null, house2 = null;
//         for (int i = 0; i < num - 1; i++) {
//             int diff = houses[i + 1].pos - houses[i].pos;
//             if (diff > maxDiff) {
//                 maxDiff = diff;
//                 house1 = houses[i];
//                 house2 = houses[i + 1];
//             }
//         }

//         // Step 4: Print the houseNum of the chosen pair in ascending order
//         if (house1.houseNum < house2.houseNum) {
//             System.out.println(house1.houseNum + " " + house2.houseNum);
//         } else {
//             System.out.println(house2.houseNum + " " + house1.houseNum);
//         }
//         scanner.close();
//     }
// }


// Output:
// ➜  Day1 git:(main) ✗ javac LargeHouseInToyland.java 
// ➜  Day1 git:(main) ✗ java LargeHouseInToyland 
// 5
// 3 7
// 1 9
// 2 0
// 5 15
// 4 30
// 4 5