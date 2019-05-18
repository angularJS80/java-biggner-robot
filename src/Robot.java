// 로봇 클레스를 정의 한다.
public class Robot {
    //로봇이 가질 수 있는 속성으로 머리 몸통 팔 다리
    // 변수명으로 Head Body Arm Fit
    // 해당 4가지 항목도 속성을 가질 수 있으으로 클래스로 정의 한다.
    // 가질 수 있는 변수 선언
    // 로봇은 스스로 가질 수 있는 능력이 없다. 개발자가 만들어서 부착 시켜 줘야 한다.
    // 대신 부착을 위한 세터 기능은 가지고 있어야 된다. 기능은 메소드로 표현 Settor은 제너레이터로 자동으로 만들어 준다.
    // 로봇에 늦게 나마 이름 속성을 달아 준다.
    String name; // 역시 스스로 이름을 지을수 없다. 세터를 만들어주고 주인이 이름을 달아 줄수 있도록 한다.

    public void setName(String name) {
        this.name = name;
    }

    Head head;
    Body body;
    Arm arm;
    Fit fit;

    // 로봇에 다량의 팔다리를 가질 수 있도록 배열을 선언 했다.
    // 외부에서 부착 해줄 수 있도록 역시 세터를 만들어 주자
    Arm[] arms;

    public void setArms(Arm[] arms) {
        this.arms = arms;
    }

    public void setFits(Fit[] fits) {
        this.fits = fits;
    }

    Fit[] fits;


    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public void setFit(Fit fit) {
        this.fit = fit;
    }
    // 로봇의 큰 형태가 구성 되었다. 1단계 종료

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", body=" + body +
                ", arm=" + arm +
                ", fit=" + fit +
                '}';
    }


    // 2단계 toString 역시 제너레이트로 작성 가능 모든 속성을 표현 하도록 제공된다.


    // 3단계 로봇이 할 수 있는 것
    // 걷기
    public void walk(){
        System.out.println(name+"로봇 걷기 기능이 호출 되었습니다.");
        // 로봇이 걷게 하려면 가지고 있는 발이 음직여야 한다.
        fit.action(name);

    }

    // 서기
    public void standUp(){
        System.out.println(name+"로봇 서기 기능이 호출 되었습니다.");
    }

    // 앉기
    public void sitDown(){
        System.out.println(name+"로봇 앉기 기능이 호출 되었습니다.");
    }

    // 밀기(처음 만든 팔만 음직이는것)
    public void push(){
        System.out.println(name+"로봇 밀기 기능이 호출 되었습니다.");
        // 로봇이 밀기를 하려면 팔을 음직여야 한다.
        // 로봇의 팔의 음직일때 이름을 전달해서 팔이 움직임에 이름을 포함 하도록 해보자.
        arm.action(name);

    }

    // 밀기 (배열 팔을 움직이는것)
    public void allArmpush(){
        System.out.println(name+"로봇 밀기 기능이 호출 되었습니다.");

        // 이제는 팔이 여러개되었다. 하나만 움직이지 말고 모두 움직여 보자.
        for(int i=0;i<arms.length;i++){
            arms[i].action(name);
        }
    }

    // 잡기 기느을 구현 해보자.
    // 손가락이 있어야 잡기 기능이 그럴듯해 보일것이다.
    public void grap(){
        System.out.println(name+"로봇 잡기 기능이 호출 되었습니다.");
        // 손가락이 있어야 되는대 손가락이 있어야 되는곳은 로봇클래스가 아니라 팔클래스이다.

        for(int i=0;i<arms.length;i++){ // 팔갯수만큼 손가락을 각각 손애 부착된 손가락을 움직이도록 팔만큼 포문
            // 팔에 달려있는 손가락 만큼 포문
            for(int x= 0;x<arms[i].fingers.length;x++){
                arms[i].fingers[x].action();
            }

        }
    }
}
