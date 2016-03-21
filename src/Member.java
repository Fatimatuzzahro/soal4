/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author AcerAsp4750
 */
public class Member {
    private String nama;
    private String team;
    private int umur;
    private int performance;
    private int suara;
    private int attitude;
    
    public void setNama (String n){
        this.nama=n;
    }
    public void setTeam(String  t){
        this.team=t;
    }
    public void setUmur(int u){
        this.umur=u;
    }
    public void setPerformance(int p){
        this.performance=p;
    }
    public void setSuara(int s){
        this.suara=s;
    }
    public void setAttitude(int a){
        this.attitude=a;
    }
    public String getNama(){
        return nama;
    }
    public String getTeam(){
        return team;
    }
    public int getUmur(){
        return umur;
    }
    public int getPermance(){
        return performance;
    }
    public int getSuara(){
        return suara;
    }
    public int getAttitude(){
        return attitude;
    }
    public double getNilai() {
        double hasil = 0;
        hasil = (performance + suara + attitude) / 3;
        return hasil;
    }
    
    
}
