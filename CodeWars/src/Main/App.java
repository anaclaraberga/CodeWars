package Main;
import MergeArrays.MergingArrays;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(LeapYears.isLeapYear(2020));
        //System.out.println(LeapYears.isLeapYear(2013));

        MergingArrays.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
        MergingArrays.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 });
        
    }
}
