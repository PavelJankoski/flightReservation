package mk.ukim.finki.emtproject.flightreservation.flightmenagement.domain.model;

import mk.ukim.finki.emtproject.flightreservation.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerId extends DomainObjectId {

    public CustomerId(String id) {
        super(id);
    }

    @SuppressWarnings("unused")
    protected CustomerId(){
        super("");
    }
}
