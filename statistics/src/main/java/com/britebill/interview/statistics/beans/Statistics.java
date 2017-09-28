package com.britebill.interview.statistics.beans;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "totalNumberOfWords",
        "totalNumberOfUniqueWords",
        "averageCharactersPerWord",
        "mostRepeatedWord"
})
@XmlRootElement(name = "Statistics")
public class Statistics {

    @XmlElement(name = "TotalNumberOfWords")
    @XmlSchemaType(name = "unsignedInt")
    protected long totalNumberOfWords;
    @XmlElement(name = "TotalNumberOfUniqueWords")
    @XmlSchemaType(name = "unsignedInt")
    protected long totalNumberOfUniqueWords;
    @XmlElement(name = "AverageCharactersPerWord")
    @XmlSchemaType(name = "unsignedInt")
    protected long averageCharactersPerWord;
    @XmlElement(name = "MostRepeatedWord", required = true)
    protected String mostRepeatedWord;

    /**
     * Gets the value of the totalNumberOfWords property.
     *
     */
    public long getTotalNumberOfWords() {
        return totalNumberOfWords;
    }

    /**
     * Sets the value of the totalNumberOfWords property.
     *
     */
    public void setTotalNumberOfWords(long value) {
        this.totalNumberOfWords = value;
    }

    /**
     * Gets the value of the totalNumberOfUniqueWords property.
     *
     */
    public long getTotalNumberOfUniqueWords() {
        return totalNumberOfUniqueWords;
    }

    /**
     * Sets the value of the totalNumberOfUniqueWords property.
     *
     */
    public void setTotalNumberOfUniqueWords(long value) {
        this.totalNumberOfUniqueWords = value;
    }

    /**
     * Gets the value of the averageCharactersPerWord property.
     *
     */
    public long getAverageCharactersPerWord() {
        return averageCharactersPerWord;
    }

    /**
     * Sets the value of the averageCharactersPerWord property.
     *
     */
    public void setAverageCharactersPerWord(long value) {
        this.averageCharactersPerWord = value;
    }

    /**
     * Gets the value of the mostRepeatedWord property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMostRepeatedWord() {
        return mostRepeatedWord;
    }

    /**
     * Sets the value of the mostRepeatedWord property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMostRepeatedWord(String value) {
        this.mostRepeatedWord = value;
    }

}