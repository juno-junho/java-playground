package oop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass2 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new ActionListener() { // 클래스의 정의와 객체 생성을 동시에.
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!");
            }
        });
    }
}

class EventHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!");
    }
}
