package entity;



import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;


@Entity()
@Table(name = "students")
@TypeDefs({
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        )
})
public class Student {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "is_male")
    private Boolean isMale;

    @Column(name = "passport_series")
    private String passportSeries;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "identification_number")
    private String identificationNumber;

    @Type( type = "string-array" )
    @Column(
            name = "home_cities",
            columnDefinition = "character varying[]"
    )
    private String[] homeCities;

    @Column(name = "living_address")
    private String livingAddress;

    @Column(name = "home_tel")
    private String homeTel;

    @Column(name = "mob_tel")
    private String mobTel;

    @Type( type = "string-array" )
    @Column(
            name = "citizenship",
            columnDefinition = "character varying[]"
    )
    private String[] citizenship;

    @Column(name = "fit_to_serv_in_army")
    private boolean fitToServeInTheArmy;

    public Student(){
    }

    public Student(long id, String name, String surname, String fatherName,
                   LocalDate birthDate, Boolean isMale, String passportSeries,
                   String passportNumber, String identificationNumber, String[] homeCities,
                   String livingAddress, String homeTel, String mobTel, String[] citizenship,
                   boolean fitToServeInTheArmy) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.isMale = isMale;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.identificationNumber = identificationNumber;
        this.homeCities = homeCities;
        this.livingAddress = livingAddress;
        this.homeTel = homeTel;
        this.mobTel = mobTel;
        this.citizenship = citizenship;
        this.fitToServeInTheArmy = fitToServeInTheArmy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean sex) {
        this.isMale = sex;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String[] getHomeCities() {
        return homeCities;
    }

    public void setHomeCities(String[] homeCities) {
        this.homeCities = homeCities;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getMobTel() {
        return mobTel;
    }

    public void setMobTel(String mobTel) {
        this.mobTel = mobTel;
    }

    public String[] getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String[] citizenship) {
        this.citizenship = citizenship;
    }

    public boolean isFitToServeInTheArmy() {
        return fitToServeInTheArmy;
    }

    public void setFitToServeInTheArmy(boolean fitToServInArmy) {
        this.fitToServeInTheArmy = fitToServInArmy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (fitToServeInTheArmy != student.fitToServeInTheArmy) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (fatherName != null ? !fatherName.equals(student.fatherName) : student.fatherName != null) return false;
        if (birthDate != null ? !birthDate.equals(student.birthDate) : student.birthDate != null) return false;
        if (isMale != null ? !isMale.equals(student.isMale) : student.isMale != null) return false;
        if (passportSeries != null ? !passportSeries.equals(student.passportSeries) : student.passportSeries != null)
            return false;
        if (passportNumber != null ? !passportNumber.equals(student.passportNumber) : student.passportNumber != null)
            return false;
        if (identificationNumber != null ? !identificationNumber.equals(student.identificationNumber) : student.identificationNumber != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(homeCities, student.homeCities)) return false;
        if (livingAddress != null ? !livingAddress.equals(student.livingAddress) : student.livingAddress != null)
            return false;
        if (homeTel != null ? !homeTel.equals(student.homeTel) : student.homeTel != null) return false;
        if (mobTel != null ? !mobTel.equals(student.mobTel) : student.mobTel != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(citizenship, student.citizenship);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (isMale != null ? isMale.hashCode() : 0);
        result = 31 * result + (passportSeries != null ? passportSeries.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (identificationNumber != null ? identificationNumber.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(homeCities);
        result = 31 * result + (livingAddress != null ? livingAddress.hashCode() : 0);
        result = 31 * result + (homeTel != null ? homeTel.hashCode() : 0);
        result = 31 * result + (mobTel != null ? mobTel.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(citizenship);
        result = 31 * result + (fitToServeInTheArmy ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", fatherName='").append(fatherName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", sex=").append(isMale);
        sb.append(", passportSeries='").append(passportSeries).append('\'');
        sb.append(", passportNumber='").append(passportNumber).append('\'');
        sb.append(", identificationNumber='").append(identificationNumber).append('\'');
        sb.append(", homeCities=").append(Arrays.toString(homeCities));
        sb.append(", livingAddress='").append(livingAddress).append('\'');
        sb.append(", homeTel='").append(homeTel).append('\'');
        sb.append(", mobTel='").append(mobTel).append('\'');
        sb.append(", citizenship=").append(Arrays.toString(citizenship));
        sb.append(", fitToServInArmy=").append(fitToServeInTheArmy);
        sb.append('}');
        return sb.toString();
    }
}
