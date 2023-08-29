import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Joey", "0888992233");
        phonebook.put("Atanas", "0888992244");
        phonebook.put("Ivan", "0888992255");
        phonebook.put("Petar", "0888992266");
        phonebook.put("Georgi", "0888992277");
        System.out.println(phonebook.get("Atanas"));
        System.out.println(phonebook.getOrDefault("Tom", "No number"));
        phonebook.putIfAbsent("Ivan", "0000000");
        System.out.println(phonebook);
        Collection<String> numbersWith088 =
                phonebook.values().stream().filter(value -> value.startsWith("088"))
                        .collect(Collectors.toList());
        System.out.println(numbersWith088);
        Collection<String> namesWithI =
                phonebook.keySet().stream().filter(key -> key.startsWith("I"))
                        .collect(Collectors.toList());
        System.out.println(namesWithI);
    }
}