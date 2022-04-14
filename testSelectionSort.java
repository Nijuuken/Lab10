import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
private SelectionSort sort;
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        SelectionSort sort = new SelectionSort();
        int[] sortArrayAttempt = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        System.out.print("testPositive \nCorrect Case: [" + Sortedarr[0]);
        for(int i = 1; i < Sortedarr.length; ++i) {
        	System.out.print("," + Sortedarr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + sortArrayAttempt[0]);
        for(int i = 1; i < sortArrayAttempt.length; ++i) {
        	System.out.print("," + sortArrayAttempt[i]);
        }
        System.out.println("]");
        assertArrayEquals(sortArrayAttempt,Sortedarr);
    }

    public void testNegative(){

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        SelectionSort sort = new SelectionSort();
        int[] sortArrayAttempt = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        System.out.print("testNegatives \nCorrect Case: [" + Sortedarr[0]);
        for(int i = 1; i < Sortedarr.length; ++i) {
        	System.out.print("," + Sortedarr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + sortArrayAttempt[0]);
        for(int i = 1; i < sortArrayAttempt.length; ++i) {
        	System.out.print("," + sortArrayAttempt[i]);
        }
        System.out.println("]");
        assertArrayEquals(sortArrayAttempt,Sortedarr);

    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        SelectionSort sort = new SelectionSort();
        int[] sortArrayAttempt = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        System.out.print("testMixed \nCorrect Case: [" + Sortedarr[0]);
        for(int i = 1; i < Sortedarr.length; ++i) {
        	System.out.print("," + Sortedarr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + sortArrayAttempt[0]);
        for(int i = 1; i < sortArrayAttempt.length; ++i) {
        	System.out.print("," + sortArrayAttempt[i]);
        }
        System.out.println("]");
        assertArrayEquals(sortArrayAttempt,Sortedarr);
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 8;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        SelectionSort sort = new SelectionSort();
        int[] sortArrayAttempt = sort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/
        System.out.print("testDuplicates \nCorrect Case: [" + Sortedarr[0]);
        for(int i = 1; i < Sortedarr.length; ++i) {
        	System.out.print("," + Sortedarr[i]);
        }
        System.out.println("]");
        System.out.print("Actual Case: [" + sortArrayAttempt[0]);
        for(int i = 1; i < sortArrayAttempt.length; ++i) {
        	System.out.print("," + sortArrayAttempt[i]);
        }
        System.out.println("]");
        assertArrayEquals(sortArrayAttempt,Sortedarr);
    }
}
