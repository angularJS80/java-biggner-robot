public class Arm {
    // 로봇은 팔을 음직 일 수 있다. 음직이는 기능을 통해 밀기를 구현 할 수 있다.
    // 여러팔이 있을때 구분짖기 위한 표식변수를 만들자.
    String name;

    public void setFingers(Finger[] fingers) {
        this.fingers = fingers;
    }

    Finger[] fingers;

    public void setName(String name) {
        this.name = name;
    }

    public void action(String name){
        //메인에서 넘겨준 name은 로봇의 이름이고 this.name은 중괄호 밖의 name으로 즉 팔의 표식이다.
        System.out.println(name+"의 "+this.name+"팔이 음직인다.");
    }

    // 팔에 손가락 움직이기 기능
    public void actionFings(){
        for(int i=0;i<fingers.length;i++){
            fingers[i].action();

        }
    }
}
