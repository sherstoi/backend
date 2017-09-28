package com.britebill.interview.statistics.beans;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * Created by iurii on 9/28/17.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Statistics }
     *
     */
    public Statistics createStatistics() {
        return new Statistics();
    }

}

