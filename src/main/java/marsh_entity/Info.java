
package marsh_entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="father_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birth_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="is_male" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="passport_series" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passport_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="home_cities" type="{http://www.ST.org/students}cities"/>
 *         &lt;element name="living_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="citizenship" type="{http://www.ST.org/students}cships"/>
 *         &lt;element name="is_fit_to_serv_in_the_army" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="identification_number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="home_tel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mob_tel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "info", namespace = "http://www.ST.org/students", propOrder = {
    "name",
    "surname",
    "fatherName",
    "birthDate",
    "isMale",
    "passportSeries",
    "passportNumber",
    "homeCities",
    "livingAddress",
    "citizenship",
    "isFitToServInTheArmy"
})
public class Info {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;
    @XmlElement(name = "father_name", required = true)
    protected String fatherName;
    @XmlElement(name = "birth_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "is_male")
    protected boolean isMale;
    @XmlElement(name = "passport_series", required = true)
    protected String passportSeries;
    @XmlElement(name = "passport_number", required = true)
    protected String passportNumber;
    @XmlElement(name = "home_cities", required = true)
    protected Cities homeCities;
    @XmlElement(name = "living_address", required = true)
    protected String livingAddress;
    @XmlElement(required = true)
    protected Cships citizenship;
    @XmlElement(name = "is_fit_to_serv_in_the_army")
    protected boolean isFitToServInTheArmy;
    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "identification_number")
    protected String identificationNumber;
    @XmlAttribute(name = "home_tel")
    protected String homeTel;
    @XmlAttribute(name = "mob_tel")
    protected String mobTel;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the isMale property.
     * 
     */
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * Sets the value of the isMale property.
     * 
     */
    public void setIsMale(boolean value) {
        this.isMale = value;
    }

    /**
     * Gets the value of the passportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportSeries() {
        return passportSeries;
    }

    /**
     * Sets the value of the passportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportSeries(String value) {
        this.passportSeries = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the homeCities property.
     * 
     * @return
     *     possible object is
     *     {@link Cities }
     *     
     */
    public Cities getHomeCities() {
        return homeCities;
    }

    /**
     * Sets the value of the homeCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cities }
     *     
     */
    public void setHomeCities(Cities value) {
        this.homeCities = value;
    }

    /**
     * Gets the value of the livingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingAddress() {
        return livingAddress;
    }

    /**
     * Sets the value of the livingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingAddress(String value) {
        this.livingAddress = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Cships }
     *     
     */
    public Cships getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cships }
     *     
     */
    public void setCitizenship(Cships value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the isFitToServInTheArmy property.
     * 
     */
    public boolean isIsFitToServInTheArmy() {
        return isFitToServInTheArmy;
    }

    /**
     * Sets the value of the isFitToServInTheArmy property.
     * 
     */
    public void setIsFitToServInTheArmy(boolean value) {
        this.isFitToServInTheArmy = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the homeTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTel() {
        return homeTel;
    }

    /**
     * Sets the value of the homeTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTel(String value) {
        this.homeTel = value;
    }

    /**
     * Gets the value of the mobTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobTel() {
        return mobTel;
    }

    /**
     * Sets the value of the mobTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobTel(String value) {
        this.mobTel = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", fatherName='").append(fatherName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", isMale=").append(isMale);
        sb.append(", passportSeries='").append(passportSeries).append('\'');
        sb.append(", passportNumber='").append(passportNumber).append('\'');
        sb.append(", homeCities=").append(homeCities);
        sb.append(", livingAddress='").append(livingAddress).append('\'');
        sb.append(", citizenship=").append(citizenship);
        sb.append(", isFitToServInTheArmy=").append(isFitToServInTheArmy);
        sb.append(", id=").append(id);
        sb.append(", identificationNumber='").append(identificationNumber).append('\'');
        sb.append(", homeTel='").append(homeTel).append('\'');
        sb.append(", mobTel='").append(mobTel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
