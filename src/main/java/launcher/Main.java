package launcher;

import DAO.DataDao;
import entity.Student;
import marsh_entity.Info;
import marsh_entity.StudentsInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.CustomStudentConverter;
import service.CustomXmlMarshallingHandler;

import java.util.List;


public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        StudentsInfo studentsFromXml = CustomXmlMarshallingHandler.getInstance().
                deMarsh("sourcefile/students.xml");
        for(Info student : studentsFromXml.getStudent()) {
            logger.info(student.toString());
        }
        List<Student> studentForDb = CustomStudentConverter.getInstance().convertInfoToListOfStudents(studentsFromXml);
        DataDao dataDao = new DataDao();
        for(Student student : studentForDb) {
            dataDao.savaData(student);
        }
//        List<Student> studentForDb = dataDao.getAll();
        studentForDb = dataDao.getAll();
        for (Student student : studentForDb) {
            logger.info(student.toString());
        }
//        StudentsInfo studentsForXml = CustomStudentConverter.getInstance().convertListOfStudentsToInfo(studentForDb);
//        CustomXmlMarshallingHandler.getInstance().marsh("sourcefile/students.xml",studentsForXml);
    }
}
