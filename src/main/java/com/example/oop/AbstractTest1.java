package oop;

abstract class Player{  // 추상 클래스 (미완성 클래스, 미완성 설계도)
    abstract void play(int pos);    // 추상 메소드 (미완성 메소드)
    abstract void stop();   // 추상 메소드(선언부만 있고 구현부 {} 가 없는 메소드)
}

//추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
    void playAudio(){
        System.out.println("Play audio");
    }
    @Override
    void play(int pos) {
        System.out.println(pos + "위치 부터 play 합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class AbstractTest1 {
    public static void main(String[] args) {
//        Player player = new Player(); // 추상 클래스의 객체를 생성 -> 에러
//        AudioPlayer audioPlayer = new AudioPlayer();
        Player audioPlayer = new AudioPlayer(); // 다형성. 리모컨이 Player인것임. 실제 객체는 AudioPlayer. 위와 같은 결과.
        audioPlayer.play(100);
        audioPlayer.stop();
//        audioPlayer.playAudio();
        }
}
