package Hotel.Booking.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) //helps ignore null fields when returning an object
public class RoomDTO {
    private Long id;
    private String roomType;
    private String roomPrice;
    private BigDecimal roomPhotoUrl;
    private String roomDescription;
    private List<BookingDTO> bookings;

}
