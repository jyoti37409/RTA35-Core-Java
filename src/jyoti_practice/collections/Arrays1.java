package jyoti_practice.collections;
import java.util.Arrays;
import java.util.List;

public class Arrays1 {

    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] ="A";
        str[1] ="c";
        str[2] ="ca";
        str[3] ="d";
        str[4] ="e";
        System.out.println(Arrays.toString(str));

        int[] nums = {9,1,3,4,5};
        System.out.println(Arrays.toString(nums));
        for(String str1:str){
            System.out.println(str1);
        }
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(str.length);
        System.out.println(str[0]);
        List<String> nmslst = Arrays.asList(str);
        List<Integer> lst = Arrays.stream(nums).boxed().toList();
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("Main method with String[] args");
            main(10); // Calling overloaded main method
        }

        public static void main(int a) {
            System.out.println("Overloaded main method with int: " + a);
        }

        public static void main(double d) {
            System.out.println("Overloaded main method with double: " + d);
        }
    }


}
