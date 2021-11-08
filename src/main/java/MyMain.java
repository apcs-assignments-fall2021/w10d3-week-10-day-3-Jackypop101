import java.util.ArrayList;

public class MyMain {
    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int w = 0;
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).charAt(0) == 'a'|| list.get(i).charAt(0) == 'A'){
                w += 1;
            }
        }
        return w;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i ++) {
            String a = list.get(i);
            list.set(i,a + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i ++){
            for (int w = 0; w < list2.size(); w ++){
                if (list1.get(i) == list2.get(w)){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int w = 0;
        for (int i = 0; i < list.size(); i ++) {
            if ((list.get(i) % 2 == 1) || (list.get(i) % 2 == -1)) {
                w += 1;
            }
        }
            return w;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            list2.add(arr[i]);
        }
        return list2;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int w = 0;
        while (list2.size() != 0){
                list1.add(list2.get(0));
                list2.remove(0);
        }
        for (int i = 0; i < list1.size() - 1; i++)
            // loop to compare array elements
            for (int j = 0; j < list1.size() - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (list1.get(j) > list1.get(j + 1)) {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                }
        return list1;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
