import java.util.*;

public class CounterMap {

    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3));
        listInteger.add(3);
        System.out.println(listInteger);

        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int key : listInteger) {
            int counter = counterMap.getOrDefault(key, 0);
            counterMap.put(key, counter + 1);
        }
        System.out.println(counterMap);

        for (int key : counterMap.keySet()) {
            if (counterMap.get(key) > 1) {
                System.out.println("L'occurence " + key + " a été trouvée plus d'une fois");
            }
        }
    }
}


