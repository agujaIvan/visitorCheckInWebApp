package edu.matc.controller;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "classtable")
public class Classes {
    private int idClass;
    private LocalDate classStartDate;
    private LocalDate classEndDate;
}
