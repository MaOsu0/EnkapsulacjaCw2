package pl.javastart.model;

public class Ticket {
    private int ticketId;
    private Movie movie;
    private Client client;

    public Ticket(int ticketId, Movie movie, Client client) {
        this.ticketId = ticketId;
        this.movie = movie;
        this.client = client;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTicketInfo () {
return ticketId + " | " + movie.getMovieInfo() + " | " + client.getFullName();
    }

}


