package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "styletable")
public class StyleEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idStyleTable", nullable = false)
    private int idStyleTable;

    @Column(name = "styleName")
    private String styleName;

    @OneToMany(mappedBy = "styleEntity")
    private Set<ClassEntity> classEntity;


    public StyleEntity(){}

    public StyleEntity(String styleName) {
        this.styleName = styleName;
    }

    public int getIdStyleTable() {
        return idStyleTable;
    }

    public void setIdStyleTable(int idStyleTable) {
        this.idStyleTable = idStyleTable;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public Set<ClassEntity> getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(Set<ClassEntity> classEntity) {
        this.classEntity = classEntity;
    }
}
