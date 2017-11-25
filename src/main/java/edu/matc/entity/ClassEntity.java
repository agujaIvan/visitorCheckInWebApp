package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="classtable")
public class ClassEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idclassTable", nullable = false)
    private int classId;

    @Column(name = "styleTable_id", nullable = false)
    private int styleId;

    @Column(name = "classStartDate", nullable = false)
    private Date classStartDate;

    @Column(name = "classEndDate", nullable = false)
    private Date classEndDate;

    @Column(name = "classStartTime", nullable = false)
    private Time classStartTime;

    @Column(name = "classEndTime", nullable = false)
    private Time classEndTime;

    @Column(name = "classDays", nullable = false)
    private String classDays;

    @ManyToOne
    @JoinColumn(name = "idStyleTable", referencedColumnName = "idStyleTable")
    private StyleEntity styleEntity;

    public ClassEntity(){}

    public ClassEntity(int styleId, Date classStartDate, Date classEndDate, Time classStartTime, Time classEndTime,
                       String classDays) {
        this.styleId = styleId;
        this.classStartDate = classStartDate;
        this.classEndDate = classEndDate;
        this.classStartTime = classStartTime;
        this.classEndTime = classEndTime;
        this.classDays = classDays;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public Date getClassStartDate() {
        return classStartDate;
    }

    public void setClassStartDate(Date classStartDate) {
        this.classStartDate = classStartDate;
    }

    public Date getClassEndDate() {
        return classEndDate;
    }

    public void setClassEndDate(Date classEndDate) {
        this.classEndDate = classEndDate;
    }

    public Time getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(Time classStartTime) {
        this.classStartTime = classStartTime;
    }

    public Time getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Time classEndTime) {
        this.classEndTime = classEndTime;
    }

    public String getClassDays() {
        return classDays;
    }

    public void setClassDays(String classDays) {
        this.classDays = classDays;
    }


    public StyleEntity getStyleEntity() {
        return styleEntity;
    }

    public void setStyleEntity(StyleEntity styleEntity) {
        this.styleEntity = styleEntity;
    }
}
