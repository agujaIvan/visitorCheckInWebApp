package edu.matc.persistence;

import java.io.Serializable;

public class GenericHibernateDao< T extends Serializable>
        extends AbstractHibernateDao< T > {
}
