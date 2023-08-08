package ua.hillel.ForTest;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<Optional<String>> name = Optional.of(Optional.of("JOHN"));
        Optional<String> lowerCaseName = name.flatMap(o -> o.stream().findFirst())
                .map(String::toUpperCase);
       lowerCaseName.ifPresent(System.out::println);;
        System.out.println("hi");
    }

}





