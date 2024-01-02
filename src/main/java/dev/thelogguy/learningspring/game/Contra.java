package dev.thelogguy.learningspring.game;

public class Contra implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Contra: Up");
    }
    @Override
    public void down(){
        System.out.println("Contra: Down");
    }
    @Override
    public void left(){
        System.out.println("Contra: Left");
    }
    @Override
    public void right(){
        System.out.println("Contra: Right");
    }
}
