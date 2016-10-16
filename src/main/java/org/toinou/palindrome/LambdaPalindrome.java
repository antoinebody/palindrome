package org.toinou.palindrome;

import org.toinou.palindrome.util.WordsUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by toinou on 16/10/16.
 */
public class LambdaPalindrome {

    public static void main(String[] args) {
        List<String> words = WordsUtil.getWords();
        words.stream().
                collect(Collectors.groupingBy(
                        s -> Stream.of(s.split("")).sorted().collect(Collectors.joining())))
        .values().stream()
                .filter(l -> l.size()>1)
                .forEach(l -> System.out.println(l.size() + " palindrome : " + l));

    }
}
