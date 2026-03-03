package Tratamento.aula03.entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class Reservations {
    private Integer roomNunber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservations(){

    }
    public Reservations(Integer roomNunber, Date checkin, Date checkout) {
        this.roomNunber = roomNunber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Integer getRoomNunber() {
        return roomNunber;
    }
    public void setRoomNunber(Integer roomNunber) {
        this.roomNunber = roomNunber;
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
    public void updateDates(Date checkin, Date checkout){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString(){
        return "Room "
        + roomNunber
        + ", check-in: "
        + sdf.format(checkIn)
        + ", check-out: "
        + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
    }
}
