package com.britebill.interview.statistics.beans;

public class Statistics {
    private String mostRepeatedWord;
    private Long totalNumberOfWords;
    private Long totalNumberOfUniqueWords;
    private Long averageCharactersPerWord;

    public String getMostRepeatedWord() {
        return mostRepeatedWord;
    }

    public void setMostRepeatedWord(String mostRepeatedWord) {
        this.mostRepeatedWord = mostRepeatedWord;
    }

    public Long getTotalNumberOfWords() {
        return totalNumberOfWords;
    }

    public void setTotalNumberOfWords(Long totalNumberOfWords) {
        this.totalNumberOfWords = totalNumberOfWords;
    }

    public Long getTotalNumberOfUniqueWords() {
        return totalNumberOfUniqueWords;
    }

    public void setTotalNumberOfUniqueWords(Long totalNumberOfUniqueWords) {
        this.totalNumberOfUniqueWords = totalNumberOfUniqueWords;
    }

    public Long getAverageCharactersPerWord() {
        return averageCharactersPerWord;
    }

    public void setAverageCharactersPerWord(Long averageCharactersPerWord) {
        this.averageCharactersPerWord = averageCharactersPerWord;
    }
}
