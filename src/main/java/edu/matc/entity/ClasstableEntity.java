package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "classtable")
public class ClasstableEntity {
    private int idclassTable;
    private Date classStartDate;
    private Date classEndDate;
    private Time classStartTime;
    private Time classEndTime;
    private String classDays;
    private StyletableEntity styletableEntityById;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idclassTable", nullable = false)
    public int getIdclassTable() {
        return idclassTable;
    }

    public void setIdclassTable(int idclassTable) {
        this.idclassTable = idclassTable;
    }

    @Basic
    @Column(name = "classStartDate", nullable = false)
    public Date getClassStartDate() {
        return classStartDate;
    }

    public void setClassStartDate(Date classStartDate) {
        this.classStartDate = classStartDate;
    }

    @Basic
    @Column(name = "classEndDate", nullable = true)
    public Date getClassEndDate() {
        return classEndDate;
    }

    public void setClassEndDate(Date classEndDate) {
        this.classEndDate = classEndDate;
    }

    @Basic
    @Column(name = "classStartTime", nullable = false)
    public Time getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(Time classStartTime) {
        this.classStartTime = classStartTime;
    }

    @Basic
    @Column(name = "classEndTime", nullable = false)
    public Time getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Time classEndTime) {
        this.classEndTime = classEndTime;
    }

    @Basic
    @Column(name = "classDays", nullable = false, length = 45)
    public String getClassDays() {
        return classDays;
    }

    public void setClassDays(String classDays) {
        this.classDays = classDays;
    }


    @ManyToOne
    @JoinColumn(name ="id", nullable = false)
    public StyletableEntity getStyletableEntityById() {
        return styletableEntityById;
    }

    public void setStyletableEntityById(StyletableEntity styletableEntityById) {
        this.styletableEntityById = styletableEntityById;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClasstableEntity that = (ClasstableEntity) o;

        if (idclassTable != that.idclassTable) return false;
        if (classStartDate != null ? !classStartDate.equals(that.classStartDate) : that.classStartDate != null)
            return false;
        if (classEndDate != null ? !classEndDate.equals(that.classEndDate) : that.classEndDate != null) return false;
        if (classStartTime != null ? !classStartTime.equals(that.classStartTime) : that.classStartTime != null)
            return false;
        if (classEndTime != null ? !classEndTime.equals(that.classEndTime) : that.classEndTime != null) return false;
        if (classDays != null ? !classDays.equals(that.classDays) : that.classDays != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idclassTable;
        result = 31 * result + (classStartDate != null ? classStartDate.hashCode() : 0);
        result = 31 * result + (classEndDate != null ? classEndDate.hashCode() : 0);
        result = 31 * result + (classStartTime != null ? classStartTime.hashCode() : 0);
        result = 31 * result + (classEndTime != null ? classEndTime.hashCode() : 0);
        result = 31 * result + (classDays != null ? classDays.hashCode() : 0);
        return result;
    }

    public ClasstableEntity(){}

    public ClasstableEntity(Date classStartDate, Date classEndDate, Time classStartTime, Time classEndTime,
                            String classDays) {
        this.classStartDate = classStartDate;
        this.classEndDate = classEndDate;
        this.classStartTime = classStartTime;
        this.classEndTime = classEndTime;
        this.classDays = classDays;
        //this.styletableEntityById = styletableEntityById;
    }
}
