package dev.thelogguy.learningspring.game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Mario: Up");
    }
    @Override
    public void down(){
        System.out.println("Mario: Down");
    }
    @Override
    public void left(){
        System.out.println("Mario: Left");
    }
    @Override
    public void right(){
        System.out.println("Mario: Right");
    }
}
