package Enumeracoes.EX02.entities;

import java.util.Date;
public class HourContract {
    private Date date;
    private Double valuePerHouer;
    private int hours;

    public HourContract(){

    }
    public HourContract(Date d, double v, Integer h){
        this.date = d;
        this.valuePerHouer = v;
        this.hours = h;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getValuePerHouer() {
        return valuePerHouer;
    }
    public void setValuePerHouer(Double valuePerHouer) {
        this.valuePerHouer = valuePerHouer;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        hours = hours;
    }
    public void add(HourContract contract) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public void remove(HourContract contract) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    public double totalValue(){
        return valuePerHouer * hours;
    }
}
