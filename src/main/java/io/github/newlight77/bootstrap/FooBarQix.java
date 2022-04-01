package io.github.newlight77.bootstrap;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FooBarQix {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";


    public String compute(String input) {
        Integer inputAsInt = Integer.parseInt(input);

        StringBuilder result = new StringBuilder();
        appendIfDivision(inputAsInt, result);

        char[]  chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '3'){
                result.append(FOO);
            }
        }
        if(result.isEmpty()){
            result.append(input);
        }
        return result.toString();
    }

    private void appendIfDivision(Integer inputAsInt, StringBuilder result) {

        Arrays.stream(Division.values()).forEach( d -> {
            if(DivisionPredicate.denominatorPredicate.test(inputAsInt , d.denominator)){
                result.append(d.name());
            }
        });

    }

    class DivisionPredicate {
        private static BiPredicate<Integer, String> denominatorPredicate =  (req, d) -> req % Integer.parseInt(d) == 0;
    }

    enum Division {
        Foo("3"),
        Bar( "5"),
        Qix("7");

        private Division(String denominator){
            this.denominator = denominator;
        }

        private String denominator;

    }
}
