package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import edu.matc.utility.LocalDateAttributeConverter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usertable", schema = "visitorcheckinappdb", catalog = "")
public class UsertableEntity {
    private int idUserTable;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userFirstName;
    private String userLastName;
    //private Timestamp userDate;
    private LocalDate userDate;
    private int genderTableIdGenderTable;
    private String userPhoto;
    private GendertableEntity gendertableByGenderTableIdGenderTable;
    private String userRole;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idUserTable", nullable = false)
    public int getIdUserTable() {
        return idUserTable;
    }

    public void setIdUserTable(int idUserTable) {
        this.idUserTable = idUserTable;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 45)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userPassword", nullable = true, length = 45)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "userEmail", nullable = false, length = 45)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "userFirstName", nullable = true, length = 45)
    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    @Basic
    @Column(name = "userLastName", nullable = true, length = 45)
    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    @Basic
    @Column(name = "userDate", nullable = false)
    @Convert(converter = LocalDateAttributeConverter.class)
    public LocalDate getUserDate() {
        return userDate;
    }

    public void setUserDate(LocalDate userDate) {
        this.userDate = userDate;
    }

    @Basic
    @Column(name = "userPhoto", nullable = true, length = 45)
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Basic
    @Column(name = "userRole", nullable = true, length = 15)
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {this.userRole = userRole;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsertableEntity that = (UsertableEntity) o;

        if (idUserTable != that.idUserTable) return false;
        if (genderTableIdGenderTable != that.genderTableIdGenderTable) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null)
            return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userFirstName != null ? !userFirstName.equals(that.userFirstName) : that.userFirstName != null)
            return false;
        if (userLastName != null ? !userLastName.equals(that.userLastName) : that.userLastName != null)
            return false;
        if (userDate != null ? !userDate.equals(that.userDate) : that.userDate != null) return false;
        if (userPhoto != null ? !userPhoto.equals(that.userPhoto) : that.userPhoto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserTable;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userFirstName != null ? userFirstName.hashCode() : 0);
        result = 31 * result + (userLastName != null ? userLastName.hashCode() : 0);
        result = 31 * result + (userDate != null ? userDate.hashCode() : 0);
        result = 31 * result + genderTableIdGenderTable;
        result = 31 * result + (userPhoto != null ? userPhoto.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idGenderTable", referencedColumnName = "idGenderTable", nullable = false)
    public GendertableEntity getGendertableByGenderTableIdGenderTable() {
        return gendertableByGenderTableIdGenderTable;
    }

    public void setGendertableByGenderTableIdGenderTable(GendertableEntity gendertableByGenderTableIdGenderTable) {
        this.gendertableByGenderTableIdGenderTable = gendertableByGenderTableIdGenderTable;
    }

    @Override
    public String toString() {
        return "UsertableEntity{" +
                "idUserTable=" + idUserTable +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userDate=" + userDate +
                ", genderTableIdGenderTable=" + genderTableIdGenderTable +
                ", userPhoto='" + userPhoto + '\'' +
                ", gendertableByGenderTableIdGenderTable=" + gendertableByGenderTableIdGenderTable +
                '}';
    }
}
