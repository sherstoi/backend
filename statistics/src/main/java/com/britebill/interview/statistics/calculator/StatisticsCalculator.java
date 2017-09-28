package com.britebill.interview.statistics.calculator;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StatisticsCalculator {

    public Long getTotalNumberOfWords(List<String> data) {
        Long totalNumber = null;
        if (CollectionUtils.isNotEmpty(data)) {
            totalNumber = data.stream().count();
        }
        return totalNumber;
    }

    public Long getTotalNumberOfUniqueWords(List<String> data) {
        Long uniqueWords = null;
        if (CollectionUtils.isNotEmpty(data)) {
            uniqueWords = data.stream().distinct().count();
        }
        return uniqueWords;
    }

    public Long getAverageCharactersPerWord(List<String> data) {
        Long averageChar = null;
        if (CollectionUtils.isNotEmpty(data)) {
            Double rez = data.stream().mapToInt(String::length).average().getAsDouble();
            averageChar = rez.longValue();
        }
        return averageChar;
    }

    public String getMostRepeatedWord(List<String> data) {
        String mostRepeteadWord = null;
        if (CollectionUtils.isNotEmpty(data)) {
            mostRepeteadWord = data.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                    .map(Map.Entry::getKey).orElse(null);
        }
        return mostRepeteadWord;
    }
}
