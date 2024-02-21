package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.webservice.baseservice.domain.Support.BaseEntity;
import jakarta.persistence.*;


@JsonInclude(Include.NON_NULL)
@Entity
@Table(name="ITINERARY_PARTNER")
public class ItineraryPartner extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @JoinColumn(name="ITINERARY_CODE", 	referencedColumnName="itineraryCode")
    @OneToOne
    private Itinerary itinerary;

    @Id
    @Column(name="ITINERARY_LINE_NUMBER")
    private Integer itinerarylinenumber;


    @JoinColumn(name="PARTNER_CODE", 	referencedColumnName="partnerCode")
    private Partner partner ;

    @Column(name="RANK")
    private Integer rank;


    public ItineraryPartner() {
    }


    public Itinerary getItinerary() {
        return itinerary;
    }
    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
    public Integer getItinerarylinenumber() {
        return itinerarylinenumber;
    }
    public void setItinerarylinenumber(Integer itinerarylinenumber) {
        this.itinerarylinenumber = itinerarylinenumber;
    }


    public Partner getPartner() {
        return partner;
    }
    public void setPartner(Partner partner) {
        this.partner = partner;
    }


    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
