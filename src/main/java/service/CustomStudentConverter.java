package service;

import entity.Student;
import marsh_entity.Info;
import marsh_entity.StudentsInfo;

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
}
