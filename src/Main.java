/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;
import java.util.ArrayList;
/**
 *
 * @author AcerAsp4750
 */
public class Main {
    public static ArrayList <Member> member = new ArrayList<>();
    public static void main(String[] args) {
         
         Member m1 = new Member();
         Member m2 = new Member();
         Member m3 = new Member();
         
         m1.setNama("Fatimatuz");
         m1.setTeam("TI");
         m1.setUmur(17);
         m1.setPerformance(100);
         m1.setSuara(100);
         m1.setAttitude(100);
         
         m2.setNama("Zahro");
         m2.setTeam("SI");
         m2.setUmur(19);
         m2.setPerformance(90);
         m2.setSuara(90);
         m2.setAttitude(100);
         
         m3.setNama("Fatimah");
         m3.setTeam("PTI");
         m3.setUmur(20);
         m3.setPerformance(100);
         m3.setSuara(80);
         m3.setAttitude(90);
         
         member.add(m1);
         member.add(m2);
         member.add(m3);
         hasil();
    }
    public static void hasil(){
        System.out.println("============== Daftar Member ===============");
        for (int i=0; i<member.size();i++ ){
            System.out.println("Nama Lengkap : "+member.get(i).getNama());
            System.out.println("Nama Team    : "+member.get(i).getTeam());
            System.out.println("Umur         : "+member.get(i).getUmur());
            System.out.println("Nilai        : "+member.get(i).getNilai());
        System.out.println("=============================================");
        }
    }
   
    
}
