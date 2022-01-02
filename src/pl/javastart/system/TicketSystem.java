package pl.javastart.system;

import pl.javastart.model.Client;
import pl.javastart.model.Movie;
import pl.javastart.model.Ticket;

public class TicketSystem {


    private int ticketCount = 0;


    Ticket createTicket (Client client, Movie movie) {
        if (movie.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movie, client);
        }
    }
}
