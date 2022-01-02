package pl.javastart.system;

import pl.javastart.model.Client;
import pl.javastart.model.Movie;
import pl.javastart.model.Ticket;

class CinemaSystem {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Omen", "horror", 128,
                16, 72, 72);

        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Zalewska", 19);

        TicketSystem ticketSystem = new TicketSystem();

        Ticket ticket1 = ticketSystem.createTicket(client1, movie1);
        Ticket ticket2 = ticketSystem.createTicket(client2, movie1);


        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getTicketInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getTicketInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));


    }
}