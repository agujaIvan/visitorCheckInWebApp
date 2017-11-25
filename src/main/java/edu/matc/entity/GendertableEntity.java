package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "gendertable", schema = "visitorcheckinappdb", catalog = "")
public class GendertableEntity {
    private int idGenderTable;
    private String genderName;
    private Collection<UsertableEntity> dancertablesByIdGenderTable;

    public GendertableEntity(){}
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idGenderTable", nullable = false)
    public int getIdGenderTable() {
        return idGenderTable;
    }

    public void setIdGenderTable(int idGenderTable) {
        this.idGenderTable = idGenderTable;
    }

    @Basic
    @Column(name = "genderName", nullable = false, length = 45)
    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GendertableEntity that = (GendertableEntity) o;

        if (idGenderTable != that.idGenderTable) return false;
        if (genderName != null ? !genderName.equals(that.genderName) : that.genderName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGenderTable;
        result = 31 * result + (genderName != null ? genderName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "gendertableByGenderTableIdGenderTable")
    public Collection<UsertableEntity> getDancertablesByIdGenderTable() {
        return dancertablesByIdGenderTable;
    }

    public void setDancertablesByIdGenderTable(Collection<UsertableEntity> dancertablesByIdGenderTable) {
        this.dancertablesByIdGenderTable = dancertablesByIdGenderTable;
    }
}
