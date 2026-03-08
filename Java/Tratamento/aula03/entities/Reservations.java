package Tratamento.aula03.entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;



public class Reservations {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservations(int number, java.util.Date checkIn2, java.util.Date checkOut2){

    }
    public Reservations(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Integer getRoomNunber() {
        return roomNumber;
    }
    public void setRoomNunber(Integer roomNunber) {
        this.roomNumber = roomNunber;
    }
    public Date getCheckin() {
        return checkIn;
    }
    public Date getCheckout() {
        return checkOut;
    }
    
    public Long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public String updateDates(java.util.Date checkIn2, java.util.Date checkOut2){

        Date now = new Date(roomNumber);
            if(checkIn2.before(now) || checkOut2.before(now)){
            return "Error in reservation: Reservation dates for update must be future dates.";
            }
            if(!checkOut2.after(checkIn2)){
                return "Error in reservation: Check-out date must be after check-in date.";
            }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }
    @Override
    public String toString(){
        return "Room "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkIn)
        + ", check-out: "
        + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
    }
}
