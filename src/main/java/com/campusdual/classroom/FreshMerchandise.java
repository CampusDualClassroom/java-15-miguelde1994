package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        return String.format("name: " + name + ", uniqueId: " + uniqueId + ", responsibleId: " + responsibleId + ", zone: " + zone + ", area: " + area + ", shelf: " + shelf + ", quantity: " + quantity + ", expirationDate: " + getFormattedDate(expirationDate));
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public String getFormattedDate(Date datein){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(datein);
    }

    public Date getExpirationDate(){
        return expirationDate;
    }
}
