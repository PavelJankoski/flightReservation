package mk.ukim.finki.emtproject.flightreservation.bookingmenagement.domain.events;

import lombok.Getter;
import mk.ukim.finki.emtproject.flightreservation.bookingmenagement.domain.model.BookingId;
import mk.ukim.finki.emtproject.flightreservation.bookingmenagement.domain.model.BookingStatus;
import mk.ukim.finki.emtproject.flightreservation.bookingmenagement.domain.model.FlightId;
import mk.ukim.finki.emtproject.flightreservation.bookingmenagement.domain.model.FlightSeatId;
import mk.ukim.finki.emtproject.flightreservation.sharedkernel.domain.base.DomainEvent;

import java.time.Instant;

@Getter
public class BookedSeats implements DomainEvent {



    private final BookingId bookingId;
    private final Instant occurredOn;
    private final FlightId flightId;
    private final FlightSeatId flightSeatId;
    private final BookingStatus bookingStatus;

    public BookedSeats(BookingId bookingId, Instant occurredOn, FlightId flightId, FlightSeatId flightSeatId,BookingStatus bookingStatus) {
        this.bookingId = bookingId;
        this.occurredOn = occurredOn;
        this.flightId = flightId;
        this.flightSeatId = flightSeatId;
        this.bookingStatus=bookingStatus;
    }


    @Override
    public Instant occurredOn() {
        return occurredOn;
    }




}
