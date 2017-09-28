package com.britebill.interview.statistics.writers;

import com.britebill.interview.statistics.beans.Statistics;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class JsonStatisticsWriter implements StatisticsWriter {

    public void write(Statistics statistics, File file) {
        try {
            JAXBContext jc = org.eclipse.persistence.jaxb.JAXBContextFactory
                    .createContext(new Class[] { com.britebill.interview.statistics.beans.Statistics.class }, null);
            Marshaller marsh = jc.createMarshaller();
            marsh.setProperty("eclipselink.media-type", "application/json");
            marsh.marshal(statistics, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
