public class CompareTwoArray {

    public static String compareArray(int[] a , int[]b){
        if(a.length !=b.length){
            return "Arrays is not equal";
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return "Arrays are not equal";
            }
        }
        return "Arrays are equal";
    }


    public static void main(String args[]) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 20, 30, 40};
        System.out.println(compareArray(a,b));

    }
}
