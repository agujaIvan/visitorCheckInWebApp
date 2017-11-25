package edu.matc.utility;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.sql.Date;
import java.time.LocalDate;

@Convert
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date>{

    @Override
    public Date convertToDatabaseColumn(LocalDate locDate) {
        return (locDate == null ? null : Date.valueOf(locDate));
    }

    @Override
    public LocalDate convertToEntityAttribute(Date sqlDate) {
        return (sqlDate == null ? null : sqlDate.toLocalDate());
    }
}
