package Weeks.Weeks_12;

public class CVSplit {
    public static void main(String[] args) {
        String cv = "Inar Academy\nlove with Java";

        cv.charAt(5);
        //String[]arr =cv.trim().split("\\s");
        String[]arr =cv.trim().split("Java");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        display(arr);
        int count =arr.length;
        System.out.println(count);

    }

    private static void display(String[] arr) {

    }
}
