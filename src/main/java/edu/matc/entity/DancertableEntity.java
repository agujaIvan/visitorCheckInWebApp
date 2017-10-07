package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import edu.matc.utility.LocalDateAttributeConverter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dancertable", schema = "visitorcheckinappdb", catalog = "")
public class DancertableEntity {
    private int idDancerTable;
    private String dancerUser;
    private String dancerPassword;
    private String dancerEmail;
    private String dancerFistName;
    private String dancerLastName;
    //private Timestamp dancerDate;
    private LocalDate dancerDate;
    private int genderTableIdGenderTable;
    private String dancerPhoto;
    private GendertableEntity gendertableByGenderTableIdGenderTable;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idDancerTable", nullable = false)
    public int getIdDancerTable() {
        return idDancerTable;
    }

    public void setIdDancerTable(int idDancerTable) {
        this.idDancerTable = idDancerTable;
    }

    @Basic
    @Column(name = "dancerUser", nullable = false, length = 45)
    public String getDancerUser() {
        return dancerUser;
    }

    public void setDancerUser(String dancerUser) {
        this.dancerUser = dancerUser;
    }

    @Basic
    @Column(name = "dancerPassword", nullable = true, length = 45)
    public String getDancerPassword() {
        return dancerPassword;
    }

    public void setDancerPassword(String dancerPassword) {
        this.dancerPassword = dancerPassword;
    }

    @Basic
    @Column(name = "dancerEmail", nullable = false, length = 45)
    public String getDancerEmail() {
        return dancerEmail;
    }

    public void setDancerEmail(String dancerEmail) {
        this.dancerEmail = dancerEmail;
    }

    @Basic
    @Column(name = "dancerFistName", nullable = true, length = 45)
    public String getDancerFistName() {
        return dancerFistName;
    }

    public void setDancerFistName(String dancerFistName) {
        this.dancerFistName = dancerFistName;
    }

    @Basic
    @Column(name = "dancerLastName", nullable = true, length = 45)
    public String getDancerLastName() {
        return dancerLastName;
    }

    public void setDancerLastName(String dancerLastName) {
        this.dancerLastName = dancerLastName;
    }

    @Basic
    @Column(name = "dancerDate", nullable = false)
    @Convert(converter = LocalDateAttributeConverter.class)
    public LocalDate getDancerDate() {
        return dancerDate;
    }
    //public Timestamp getDancerDate() {
        //return dancerDate;
    //}

    public void setDancerDate(LocalDate dancerDate) {
        this.dancerDate = dancerDate;
    }

    /*
    @Basic
    @Column(name = "genderTable_idGenderTable", nullable = false)
    public int getGenderTableIdGenderTable() {
        return genderTableIdGenderTable;
    }

    public void setGenderTableIdGenderTable(int genderTableIdGenderTable) {
        this.genderTableIdGenderTable = genderTableIdGenderTable;
    }*/

    @Basic
    @Column(name = "dancerPhoto", nullable = true, length = 45)
    public String getDancerPhoto() {
        return dancerPhoto;
    }

    public void setDancerPhoto(String dancerPhoto) {
        this.dancerPhoto = dancerPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DancertableEntity that = (DancertableEntity) o;

        if (idDancerTable != that.idDancerTable) return false;
        if (genderTableIdGenderTable != that.genderTableIdGenderTable) return false;
        if (dancerUser != null ? !dancerUser.equals(that.dancerUser) : that.dancerUser != null) return false;
        if (dancerPassword != null ? !dancerPassword.equals(that.dancerPassword) : that.dancerPassword != null)
            return false;
        if (dancerEmail != null ? !dancerEmail.equals(that.dancerEmail) : that.dancerEmail != null) return false;
        if (dancerFistName != null ? !dancerFistName.equals(that.dancerFistName) : that.dancerFistName != null)
            return false;
        if (dancerLastName != null ? !dancerLastName.equals(that.dancerLastName) : that.dancerLastName != null)
            return false;
        if (dancerDate != null ? !dancerDate.equals(that.dancerDate) : that.dancerDate != null) return false;
        if (dancerPhoto != null ? !dancerPhoto.equals(that.dancerPhoto) : that.dancerPhoto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDancerTable;
        result = 31 * result + (dancerUser != null ? dancerUser.hashCode() : 0);
        result = 31 * result + (dancerPassword != null ? dancerPassword.hashCode() : 0);
        result = 31 * result + (dancerEmail != null ? dancerEmail.hashCode() : 0);
        result = 31 * result + (dancerFistName != null ? dancerFistName.hashCode() : 0);
        result = 31 * result + (dancerLastName != null ? dancerLastName.hashCode() : 0);
        result = 31 * result + (dancerDate != null ? dancerDate.hashCode() : 0);
        result = 31 * result + genderTableIdGenderTable;
        result = 31 * result + (dancerPhoto != null ? dancerPhoto.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "genderTable_idGenderTable", referencedColumnName = "idGenderTable", nullable = false)
    public GendertableEntity getGendertableByGenderTableIdGenderTable() {
        return gendertableByGenderTableIdGenderTable;
    }

    public void setGendertableByGenderTableIdGenderTable(GendertableEntity gendertableByGenderTableIdGenderTable) {
        this.gendertableByGenderTableIdGenderTable = gendertableByGenderTableIdGenderTable;
    }

    @Override
    public String toString() {
        return "DancertableEntity{" +
                "idDancerTable=" + idDancerTable +
                ", dancerUser='" + dancerUser + '\'' +
                ", dancerPassword='" + dancerPassword + '\'' +
                ", dancerEmail='" + dancerEmail + '\'' +
                ", dancerFistName='" + dancerFistName + '\'' +
                ", dancerLastName='" + dancerLastName + '\'' +
                ", dancerDate=" + dancerDate +
                ", genderTableIdGenderTable=" + genderTableIdGenderTable +
                ", dancerPhoto='" + dancerPhoto + '\'' +
                ", gendertableByGenderTableIdGenderTable=" + gendertableByGenderTableIdGenderTable +
                '}';
    }
}
