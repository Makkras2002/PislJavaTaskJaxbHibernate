package service;

import marsh_entity.StudentsInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomXmlMarshallingHandler {
    private static CustomXmlMarshallingHandler instance;
    private static Logger logger = LogManager.getLogger();
    private JAXBContext jaxbContext;
    private CustomXmlMarshallingHandler(){
        try {
            jaxbContext = JAXBContext.newInstance(StudentsInfo.class);
        } catch (JAXBException e) {
            logger.fatal(e.getMessage());
        }
    }
    public static CustomXmlMarshallingHandler getInstance(){
        if(instance == null) {
            instance = new CustomXmlMarshallingHandler();
        }
        return instance;
    }
    public StudentsInfo deMarsh(String xmlFilePath){
        StudentsInfo students = new StudentsInfo();
        try(FileReader fileReader = new FileReader(xmlFilePath)) {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            students = (StudentsInfo) unmarshaller.unmarshal(fileReader);
        } catch (JAXBException | FileNotFoundException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
