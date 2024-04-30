package java_homework_week3;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class Programme20 {

    public static void main(String[] args) {
        // Declaring the numeric array
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        System.out.println(isArrayContains(numArray, 1111));
        System.out.println(isArrayContains(numArray, 1789));
    }

    // Declared method to check array contains specific values
    public static boolean isArrayContains(int[] arrVal, int value){
        boolean isValContains = false;
        for (int i = 0; i < arrVal.length; i++) {
            if (arrVal[i] == value) {
                isValContains = true;
                break;
            }
        }
        return isValContains;
    }
}
