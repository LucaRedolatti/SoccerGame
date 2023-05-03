/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucar
 */
public class Player implements java.io.Serializable{
    String name;
    String nation;
    int punteggio;

    public Player(String name, String nation) {
        this.name = name;
        this.nation = nation;
        this.punteggio=0;
    }
    
    @Override
    public String toString()
    {
        return "NAME : "+name+" NATION: "+ nation+ " POINTS: "+ punteggio;
    }
    
    
}
