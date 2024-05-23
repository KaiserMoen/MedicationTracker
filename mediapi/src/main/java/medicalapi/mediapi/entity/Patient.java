package medicalapi.mediapi.entity;
import java.sql.Date;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Patient implements UserInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String username;
    private String password;
    private int userType;
    private String firstName;
    private String middleName;
    private String surName;    
    private Date birthDate;

    @Override
    public String setUserName(String username) {
        this.username = username;
        return username;
    }

    @Override
    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public int getUserType() {
        return userType;
    }

    @Override
    public int getUserId(){
        return patientId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}