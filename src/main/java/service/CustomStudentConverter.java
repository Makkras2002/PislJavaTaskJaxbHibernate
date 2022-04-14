package service;

import entity.Student;
import marsh_entity.Cities;
import marsh_entity.Cships;
import marsh_entity.Info;
import marsh_entity.StudentsInfo;

import javax.xml.datatype.DatatypeFactory;
import java.util.ArrayList;
import java.util.List;

public class CustomStudentConverter {
    private static CustomStudentConverter instance;
    private CustomStudentConverter(){
    }
    public static CustomStudentConverter getInstance(){
        if(instance == null) {
            instance = new CustomStudentConverter();
        }
        return instance;
    }
    public List<Student> convertInfoToListOfStudents(StudentsInfo studentsInfo){
        List<Info> infoList = studentsInfo.getStudent();
        List<Student> students = new ArrayList<>();
        for(Info info : infoList) {
            students.add(new Student(info.getId(),info.getName(),info.getSurname(),info.getFatherName(),
                    info.getBirthDate().toGregorianCalendar().toZonedDateTime().toLocalDate(), info.isIsMale(),
                    info.getPassportSeries(),info.getPassportNumber(),info.getIdentificationNumber(),info.getHomeCities().getCity().toArray(new String[0]),
                    info.getLivingAddress(),info.getHomeTel(),info.getMobTel(),info.getCitizenship().getCship().toArray(new String[0]), info.isIsFitToServInTheArmy()));
        }
        return students;
    }

    public StudentsInfo convertListOfStudentsToInfo(List<Student> studentsList) {
        List<Info> infoList = new ArrayList<>();
        for(Student student : studentsList) {
            infoList.add(new Info(student.getName(),student.getSurname(),student.getFatherName(),
                    DatatypeFactory.newDefaultInstance().newXMLGregorianCalendar(student.getBirthDate().toString()),
                    student.isIsMale(),student.getPassportSeries(),student.getPassportNumber(),
                    new Cities(List.of(student.getHomeCities())), student.getLivingAddress(), new Cships(List.of(student.getCitizenship())),
                    student.isFitToServeInTheArmy(), student.getId(),student.getIdentificationNumber(),
                    student.getHomeTel(), student.getMobTel()));
        }
        return new StudentsInfo(infoList);
    }
}
