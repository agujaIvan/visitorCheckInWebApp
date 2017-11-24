package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "styletable", schema = "visitorcheckinappdb", catalog = "")
public class StyletableEntity  {
    private int idStyleTable;
    private String styleName;
    //private Set<ClasstableEntity> classtableEntities = new HashSet<ClasstableEntity>(0);

    public StyletableEntity(){}

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idStyleTable", nullable = false)
    public int getIdStyleTable() {
        return idStyleTable;
    }

    public void setIdStyleTable(int idStyleTable) {
        this.idStyleTable = idStyleTable;
    }

    @Basic
    @Column(name = "styleName", nullable = false, length = 45)
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /*@OneToMany(mappedBy = "styletableEntityById")
    public Set<ClasstableEntity> getClasstableEntities() {
        return classtableEntities;
    }

    public void setClasstableEntities(Set<ClasstableEntity> classtableEntities) {
        this.classtableEntities = classtableEntities;
    }*/



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StyletableEntity that = (StyletableEntity) o;

        if (idStyleTable != that.idStyleTable) return false;
        if (styleName != null ? !styleName.equals(that.styleName) : that.styleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStyleTable;
        result = 31 * result + (styleName != null ? styleName.hashCode() : 0);
        return result;
    }
}
