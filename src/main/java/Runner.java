import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland);
        }

        System.out.println(scottishIslands);
        System.out.println("----BREAK FOR NEXT QUESTION -----");

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
           for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
//        2. Print the difference between the largest and smallest value
               int max = Collections.max(numbers);
                int min = Collections.min(numbers);

                System.out.println(max - min);
//        3. Print True if the list contains a 1 next to a 1 somewhere.
               boolean containsSame = false;
               for (int i = 0; i < numbers.size() -1; i++) {
                   if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                       containsSame = true;
                   }
                   System.out.println(containsSame);
               }
//        4. Print the sum of the numbers,
            int sum = 0;
               for (int num : numbers) {
                sum += num;
            }
               System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

               int summ = 0;
               boolean excludeAfterThirteen = false;
               for (int numb : numbers){
                   if (numb == 13) {
                       excludeAfterThirteen = true;

                   } else if (!excludeAfterThirteen) {
                       summ += numb;
                   }
                   System.out.println(summ);
               }




        }

    }
}