// java 시작 진입점 클레스 Main 클레스 작성
public class Main {
    // java 시작 진입된 클레스에서 최초 실행 될 메소드 작성
    public static void main(String[] args) {

        // 로봇에 대한 클렛를 정의 한다.
        // 로봇 클래스 정의가 1단계 종료된 상태에서 로봇을 생산 해보자.

        // 생산은 정의된 클레스를 이용하여 메모리에 인스턴스 하는것을 의미 한다.
        Robot robot = new Robot();


        // 만들어진 로봇이 어떻게 생겼는지 출력을 통해 확인 하자.

        System.out.println(robot);
        // 메모리에 로드된 형태만 출력 된다. 어떤 형태의 클레스이고 메모리에서 꺼내올 수있는 표식 같은것이 표기 된다. 여기서 표식은 자바에서 이야기 하는 해쉬 코드 이다.
        // 많은 로봇이 있을때 그중 원하는 로봇을 내부적으로 빠르게 찾기 위한 해쉬 코드이며, 책으로 예를 들면 페이지 번호와 같은 역활을 한다.


        // 로봇을 하나 더 만들어 보자
        Robot robot1 = new Robot();
        //역시 출력으로 확인

        System.out.println(robot1);

        // 해쉬 코드가 다름을 확인 할 수 있다. 로봇과 로봇1은 클래스(정의)는 동일하지만 서로 다른 로봇이다.


        // 로봇에 헤쉬코드이외 어떤 구성이 있는지 출력 할 수 있도록 해보자
        // Java는 인스턴스 변수를 출력 하면 toString() 이라는 메소드를 자동 출력 하도록 설계되어있다. 로봇에 toStirng 기능을 넣어보자

        // toString 를 구현한 Robot 는 해쉬코드가 아닌 구성 요소를 표현 되도록 되어있다. 그러나 로못은 아무것도 부착 되어있지 않은 상태 이다. 때문에 머리 몸통 팔 다리가 널이다.


        // 로봇에 머리 몸통 팔 다리를 만들어서 붙여보자.

        // 먼저 머리 몸통 팔 다리 를 만들자.

        Head head = new Head();


        Arm arm = new Arm();
        arm.setName("한팔짜리 로봇을위해 만든팔");



        Fit fit = new Fit();
        Body body = new Body();
        // 만든 변수들은 모두 아직 사용 되지 않은 상태로 회색으로 표기 된다, 로봇에 부착 해보자.



        robot.setArm(arm);
        robot.setHead(head);
        robot.setBody(body);
        robot.setFit(fit);
        Arm[] arms = creatArms();

        robot.setArms(arms);

        // 부착된 형태에서 로봇을 출력 해보자.


        System.out.println(robot);

        // 로봇에 머리 다리 팔 몸통에 먼가 달려 나온다. 역시 머리는 머리 나름대로 메모리를 차지 하고 있고 ~ 다리까지
        // 각각의 해쉬 코드를 가지고 있다.

        // 로봇에 움직이는 기능 즉 메소드를 만들어 보자
        // 먼저 로봇이 할 수 있는 일 걷기, 밀기, 앉기, 서기 와 같은 행동은 로봇의 전체 적인 입장에서 바라보는 기능으로
        // 로봇 클레스에 메소드 형태로 정의 되어야 한다.

        // 3단계 로봇의 대략 적인 기능의 정의 되었고 호출해보자.
        robot.push();
        robot.sitDown();
        robot.standUp();
        robot.walk();



        Arm[] arms1 = creatArms();
        robot1.setArm(arm);
        robot1.setHead(head);
        robot1.setBody(body);
        robot1.setFit(fit);
        robot1.setArms(arms1);

        robot1.push();
        robot1.sitDown();
        robot1.standUp();
        robot1.walk();


        // 출력이 동일하여 어떤 로봇인지 구분을 못하겠다. 로봇에 이름표를 달아 주자.
        robot.setName("루루");
        robot1.setName("라라");

        // 이름을 달아 주고 다시 로봇에게 명령 해보자.
        robot.push();
        robot.sitDown();
        robot.standUp();
        robot.walk();

        robot1.push();
        robot1.sitDown();
        robot1.standUp();
        robot1.walk();

        // 역시 변화가 없다. 로봇이 이름을 표현 하게 해야 한다.

        // 로봇의 큰범위 기능은 구현이 되었다. 근대 로봇이 말만 할뿐 실 동을을 않한다.
        // 팔은 아무런 동작이 없고 발도 동작이 없다. 각 부품 클래스에 동작을 만들어보자.


        // 오류가 발생 된다. 이유는 두 로봇중 한로봇은 여전히 부품을 부착 하지 않은 상태 이다.


        // 팔도 기능을 상세하게 만들어 본다.

        // 이제 지금까지 만든 로봇은 모두 팔과 다리를 음직 일 수 있다.

        // 누구의 팔다리가 음직이는지 구분하기 어렵다. 코드를 변경해보자.

        // 모든 로봇의 음직임을 알아 볼수 있게 되었다. 문제는 로봇은 팔이하나고 발도 하나다. 전혀 로봇 스럽지 못하다.
        // 사람처럼 2개씩 달아주자.
        // 로봇은 하나의 팔과 하나의 발만 가질 수 있도록 되어있다. 로봇클래스 변경하자

        robot.allArmpush();
        robot1.allArmpush();
        robot.grap();
        // 오류가 발생 된다. 아마도 아까와 같은 경우 일것이다. 두 로봇중 하나는 팔들 이 없다.

        // 밀기 기능에 두팔이 움직이는거 같은대 오른쪽 팔인지 왼쪽 팔인이 어떤 팔인지 구분 할 수 없다.
        // 팔에도 표식을 붙여 주고 표현 할 수 있게 해보자.

        // 팔은 두개 움직이는게 맞아 보이지만 지금까지 팔의 인스턴스는 1개만 만들었다. 로봇은 2 팔도 2 즉 4번 인스턴스가 만들어져야 된다.
        // 한팔짜리 팔이 재사용이 되어 한팔짜리 팔만 여러번 움직이는 상황이 되었다.
        // 각각 새로운 인스턴스를 생성하고 새로운 팔을 달아 주쟈

        // 팔들의 인스턴스는 하나만 가지고 있다. 결국 현재 상황은 로봇별로 서로 다른 팔을 표현 하지만 팔이 옴겨 가는 상황이다.
        // 로봇이 2이면 로봇 팔들 인스턴스도 2개가 되어야 한다.

        // 같은 상황이라는것을 확인해보자.

        System.out.println(robot.arms);
        System.out.println(robot1.arms);

        // 서로 다른 로봇이 같은 팔들이라는 공간에 을 사용하고 있다. 결국 |=| 모양이다 새로 작대기가 로봇이고 가로작대기가 팔일때
        // 모양은 |=   |= 와 같이 각각의 팔들을 가지고 있어야 된다.
        // amrs 를 하나 더 만들자.
        // arms 와 amrs1 로 각각 만들었다. 코드가 보기 불편하고 동일한 페터의 코드가 반복되고 있다. 코드를 줄이고 공통화 해보자.
        // amrs 를 만드는 부분만 분리 해보자.
        // 팔들을 만들때 추가 되야 되는 10줄이 메소드로 작성됨에 따라 코드가 줄어 들었다. 앞으로 팔들을 만드는 부분에 오류가 있다면
        // createArms 메소드만 수정하면 된다.
        // 팔을 3개로 해볼까 ? createArms 만 수정해주면 된다.

    }

    public static Arm[] creatArms(){
        int armCount=3; // 팔은 두개다.
        Arm[] arms= new Arm[armCount];
        // 두개의 팔만 만들면 된다.
        for(int i=0;i<armCount;i++){
            Arm arm = new Arm();
            // 만든 팔에 이름을 붙여주자.
            arm.setName(i+"번째 팔");
            // 팔에 손가락을 만들어 붙여 주자..
            Finger[] fingers = createFingers();
            arm.setFingers(fingers);
            arms[i] = arm;
        }
        return arms;
    }


    public static Finger[] createFingers(){
        // 5개의 손가락을 만들기 위해 코드가 증가 할 것으로 예상된다...
        // 좀더 프로그래머적으로 접근해보자..
        int fingerCount=5; // 팔은 두개다.
        Finger[] fingers= new Finger[fingerCount];
        // 두개의 팔만 만들면 된다.
        for(int i=0;i<fingerCount;i++){
            Finger finger = new Finger();
            // 만든 팔에 이름을 붙여주자.
            finger.setName(i+"번째 손가락");
            fingers[i] = finger;
        }
        return fingers;
        // 언제 손가락을 부착 시켜줘야 될까 ? 팔이 만들어 지는 시점이다...createArm에서 new Arm() 이 발생 하는 근처일 것이다
    }


}
