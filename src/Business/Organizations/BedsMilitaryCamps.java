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
public class BedsMilitaryCamps {
    private static int totalSeatsCount = 10;
    private int totalRowCount = 5;   
    private int totalColCount = 2; 
    private String[] atoz = {"A","B"};    
    private boolean[][] seatsBool;
    
    public BedsMilitaryCamps(){
        this.seatsBool = new boolean[totalRowCount][totalRowCount];
    }    
    

    public static int getTotalSeatsCount() {
        return totalSeatsCount;
    }

    public static void setTotalSeatsCount(int totalSeatsCount) {
        BedsMilitaryCamps.totalSeatsCount = totalSeatsCount;
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
