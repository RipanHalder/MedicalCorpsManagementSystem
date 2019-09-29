/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

/**
 *
 * @author Ripan Halder
 */
public class BedsMedicalCamps {
    private static int totalSeatsCount = 90;
    private int totalRowCount = 15;   
    private int totalColCount = 6; 
    private String[] atoz = {"A","B","C","D","E","F"};    
    private boolean[][] seatsBool;
    
    public BedsMedicalCamps(){
        this.seatsBool = new boolean[totalRowCount][totalRowCount];
    }

    public static int getTotalSeatsCount() {
        return totalSeatsCount;
    }

    public static void setTotalSeatsCount(int totalSeatsCount) {
        BedsMedicalCamps.totalSeatsCount = totalSeatsCount;
    }

    public int getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(int totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public int getTotalColCount() {
        return totalColCount;
    }

    public void setTotalColCount(int totalColCount) {
        this.totalColCount = totalColCount;
    }

    public String[] getAtoz() {
        return atoz;
    }

    public void setAtoz(String[] atoz) {
        this.atoz = atoz;
    }

    public boolean[][] getSeatsBool() {
        return seatsBool;
    }

    public void setSeatsBool(boolean[][] seatsBool) {
        this.seatsBool = seatsBool;
    }
}
