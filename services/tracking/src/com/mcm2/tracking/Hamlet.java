/*Kilimba Analytix*/

package com.mcm2.tracking;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Hamlet generated by hbm2java
 */
@Entity
@Table(name="hamlet"
    ,schema="public"
)
public class Hamlet  implements java.io.Serializable
 {


private Integer hamletId;
private String hamletName;
private Village village;
private Set<Patient> patients = new HashSet<Patient>(0);
private Set<HealthFacility> healthFacilities = new HashSet<HealthFacility>(0);

    public Hamlet() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="hamlet_id", nullable=false)
    public Integer getHamletId() {
        return this.hamletId;
    }
    
    public void setHamletId(Integer hamletId) {
        this.hamletId = hamletId;
    }

    

    @Column(name="hamlet_name")
    public String getHamletName() {
        return this.hamletName;
    }
    
    public void setHamletName(String hamletName) {
        this.hamletName = hamletName;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="village")
    public Village getVillage() {
        return this.village;
    }
    
    public void setVillage(Village village) {
        this.village = village;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="hamlet")
    public Set<Patient> getPatients() {
        return this.patients;
    }
    
    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="hamlet")
    public Set<HealthFacility> getHealthFacilities() {
        return this.healthFacilities;
    }
    
    public void setHealthFacilities(Set<HealthFacility> healthFacilities) {
        this.healthFacilities = healthFacilities;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Hamlet) )
		 return false;

		 Hamlet that = ( Hamlet ) o;

		 return ( (this.getHamletId()==that.getHamletId()) || ( this.getHamletId()!=null && that.getHamletId()!=null && this.getHamletId().equals(that.getHamletId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getHamletId() == null ? 0 : this.getHamletId().hashCode() );

         return result;
     }


}
