package Module1.day4;

import java.util.Arrays;

public class Sort {
        public static void main(String[] args) {
            Integer[] arr = {1,6,3,7,8,5};
            System.out.println("before sorting");
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("after sorting");
            System.out.println(Arrays.toString(arr));
            System.out.println("---------------");
            String[] array = {"harsh","kalyan","nikash","apoorup"};
            System.out.println("before sorting");
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(("After string"));
            System.out.println(Arrays.toString(array));
        }

    }



