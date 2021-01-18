package tutoring02.example;

public class Student {
    private String name;
    private int ban;

    //public Student() { // 직접 입력안하고 Alt + Insert 눌러서 Constructor
    //}


    public Student(String name, int ban) {
        this.name = name;
        this.ban = ban;
    }

    public void study(){
        System.out.println("name : " + name + ", ban: " + ban);
    }
}
