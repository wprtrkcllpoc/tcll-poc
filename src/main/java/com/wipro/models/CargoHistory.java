package com.wipro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CargoHistory")
public class CargoHistory {

	private long CargoHistoryId;
    private long CargoId;
    private String CargoEventId;
    private String CargoEventExplanation;
    private String RejectFlag;
 
    public CargoHistory() {
  
    }
 
    public CargoHistory(String cargoEventId, String cargoEventExplanation, String rejectFlag) {
         this.CargoEventId = cargoEventId;
         this.CargoEventExplanation = cargoEventExplanation;
         this.RejectFlag = rejectFlag;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return CargoHistoryId;
    }
    
    public void setCargoHistoryId(long cargoHistoryId) {
        this.CargoHistoryId = CargoHistoryId;
    }
    
    @Column(name = "CargoId", nullable = false)
    public long getCargoId() {
    	 return CargoId;
    }
    
    public void setCargoId(long cargoId) {
        this.CargoId = cargoId;
    }
 
    @Column(name = "CargoEventId", nullable = false)
    public String CargoEventId() {
        return CargoEventId;
    }
    public void setCargoEventId(String cargoEventId) {
        this.CargoEventId = cargoEventId;
    }
 
    @Column(name = "CargoEventExplanation", nullable = false)
    public String getCargoEventExplanation() {
        return CargoEventExplanation;
    }
    public void setCargoEventExplanation(String cargoEventExplanation) {
        this.CargoEventExplanation = cargoEventExplanation;
    }
 
    @Column(name = "RejectFlag", nullable = false)
    public String getERejectFlag() {
        return RejectFlag;
    }
    public void setRejectFlag(String rejectFlag) {
        this.RejectFlag = rejectFlag;
    }

    @Override
    public String toString() {
        return "Employee [CargoId=" + CargoId + ", CargoEventId=" + CargoEventId + ", CargoEventExplanation=" + CargoEventExplanation + ", RejectFlag=" + RejectFlag
       + "]";
    }
 
}