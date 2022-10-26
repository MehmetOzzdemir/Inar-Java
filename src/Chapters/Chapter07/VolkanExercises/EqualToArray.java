package Chapters.Chapter07.VolkanExercises;

public class EqualToArray {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3};
        int [] arr2 ={1,2,3};
        System.out.println(equalToArray(arr1,arr2));
    }
    public static boolean equalToArray(int[] arr1,int[] arr2){
        if (arr1==arr2){
            return true;
        }
        if (arr1==null && arr2!=null){
            return false;
        }
        if (arr1!=null && arr2==null){
            return false;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
}
