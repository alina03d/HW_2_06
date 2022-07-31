import java.util.*;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1(){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if(num % 2 == 1){
                System.out.print(num);
            }
        }
        System.out.println(" ");
    }

    private static void task2(){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> result = new TreeSet<>(nums);
        for (Integer num : result) {
            if(num % 2 == 0){
                System.out.print(num);
            }
        }
        System.out.println(" ");
    }

    private static void task3() {
        List<String> words = List.of("И", "небо", "и", "земля", "все", "те", "же", "Все", "в", "те", "же", "воды", "я", "гляжусь");
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
        System.out.println(" ");
    }
    private static void task4() {
        List<String> words = List.of("И", "небо", "и", "земля", "все", "те", "же", "Все", "в", "те", "же", "воды", "я", "гляжусь");
        Map<String,Integer> result = new HashMap<>();
        for (String word:words) {
            if (result.containsKey(word)){
                result.put(word, result.get(word) + 1);
            }else {
                result.put(word,1);
            }
        }
        System.out.println(result);
    }

}