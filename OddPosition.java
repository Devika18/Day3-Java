//Java program to print elements of an array present on odd position

public class OddPosition {
    public static void main(String[] args) {
        int [] a = new int [] {10,20,30,40,50};
        System.out.println("Elements of array present on odd position are: ");

        //Initializing for loop through the array by increamenting value of i by 2
        for(int i=0;i<a.length;i=i+2)
        {
            System.out.println(a[i]);
        }
    }
}
