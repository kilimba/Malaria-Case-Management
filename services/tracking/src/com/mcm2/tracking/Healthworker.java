/*Kilimba Analytix*/

package com.mcm2.tracking;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Healthworker generated by hbm2java
 */
@Entity
@Table(name="healthworker"
    ,schema="public"
)
public class Healthworker  implements java.io.Serializable
 {


private Integer id;
private Integer healthFacility;
private String firstName;
private String middleName;
private String surname;
private Integer department;

    public Healthworker() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="id", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="health_facility", nullable=false)
    public Integer getHealthFacility() {
        return this.healthFacility;
    }
    
    public void setHealthFacility(Integer healthFacility) {
        this.healthFacility = healthFacility;
    }

    

    @Column(name="first_name", nullable=false)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    

    @Column(name="middle_name")
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    

    @Column(name="surname", nullable=false)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    

    @Column(name="department", nullable=false)
    public Integer getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Integer department) {
        this.department = department;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Healthworker) )
		 return false;

		 Healthworker that = ( Healthworker ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}
