/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayer;

public class Player {
      String nama;
    int speed;
    int hp;
    
    void run(){
    System.out.println(nama +" adu kuat...");
    System.out.println("Speed" + speed);
    }
    
    boolean mati(){
    if (hp <= 0) return true;
    return false;
    }
    
}
