package Hotel.Booking.example.demo.dto;

import java.time.LocalDate;

public class BookingDTO {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;

}
