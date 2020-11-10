/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayer;

public class Game {

    public static void main(String[] args) {
       Player zain = new Player();
       zain.nama = "Vandex";
       zain.speed = 80;
       zain.hp = 100;
       
       zain.run();
       if (zain.mati()){
       System.out.println("Coba Lagi Eaa :)");
       }
    }
    
}
