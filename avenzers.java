//쉴드 클래스
class Shield{
    //변수 접근제한자를 private으로 설정함으로써 이 클래스와 그 상속한 클래스 외에 접근 불가하게 만듬(은닉화)
    private String name;//단체 이름
    private String dir;//리더 이름
    
    //캡슐화: 은닉화된 데이터를 접근하게 하는 방법
    void setName(String name){
        this.name = name;
    }
    //데이터 불러오는 메서드
    String getName(){
        return name;
    }

    void setDir(String dir){
        this.dir = dir;
    }
    String getDir(){
        return dir;
    }
}

//Shield 클래스를 상속받은 Avenzers 클래스
class Avenzers extends Shield{
    //은닉화
    private String team;

    //캡슐화
    void setTeam(String team){
        this.team = team;
    }
    String getTeam(){
        return team;
    }

    void owner(){
        //super을 통해 Shield 클래스에 접근해서 그 데이터를 가져올 수 있음
        System.out.println("소속 기관은: "+super.getName());
        System.out.println("소속 기관 대표는: "+super.getDir());
    }
}

//Avenzers 클래스를 상속받은 Hero클래스
class Hero extends Avenzers{
    //은닉화
    private String Hr;
    private String RN;
    
    //캡슐화
    void setHr(String Hr){
        this.Hr=Hr;
    }
    String getHr(){
        return Hr;
    }

    void setRN(String RN){
        this.RN=RN;
    }
    String getRN(){
        return RN;
    }

    void belong(){
        super.owner();
        System.out.println("소속 팀은: "+super.getTeam());
    }

}

class Main{
    
    public static void main(String[] args) {
        
        Hero Ir = new Hero();//객체화
        Hero Ca = new Hero();
        
        //값을 입력 및 은닉화된 데이터에 접근, 값을 입력
        //아이언맨 객체 인스턴스화(객체 메모리에 할당)
        Ir.setName("쉴드");
        Ir.setDir("닉 퓨리");
        Ir.setRN("토니 스타크");
        Ir.setTeam("어벤져스");
        Ir.setHr("아이언맨");

        //캡틴 아메리카 객체 인스턴스화
        Ca.setName("쉴드");
        Ca.setDir("닉 퓨리");
        Ca.setRN("스티브로저스");
        Ca.setTeam("어벤져스");
        Ca.setHr("캡틴아메리카");

        System.out.println();//개행(줄바꿈)

        //get 메서드로 은닉화된 데이터 접근
        System.out.println(Ir.getHr()+"프로필");
        System.out.println("이름: "+Ir.getRN());
        System.out.println("히어로명: "+Ir.getHr());
        Ir.belong();

        System.out.println(Ca.getHr()+"프로필");
        System.out.println("이름: "+Ir.getRN());
        System.out.println("히어로명: "+Ir.getHr());
        Ir.belong();
    }
    
}