package com.britebill.interview.transformers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransformerData {
    public List<String> transformData(List<String> src) {
        List<String> uniqueWordList = withoutRepeatedWords(src);
        List<String> sortedList = sortedByLength(src);
        List<String> upCaseList = convertToUpperCaseList(src);

        return Stream.concat(Stream.concat(uniqueWordList.stream(), sortedList.stream()),
                upCaseList.stream()).collect(Collectors.toList());
    }

    private List<String> withoutRepeatedWords(List<String> stringList) {
        return new ArrayList<>(stringList.stream().distinct().collect(Collectors.toList()));
    }

    private List<String> sortedByLength(List<String> stringList) {
        List<String> sortedList = new ArrayList<>(stringList);
        sortedList.sort(Comparator.comparing(String::length));
        return sortedList;
    }

    private List<String> convertToUpperCaseList(List<String> stringList) {
        return new ArrayList<>(stringList.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
