package ProjectJuly;

public class OopStudent {
    String name;
    int age;
    int grade;

    public OopStudent(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade + "\n");
    }
    public static void main(String[] args){

        OopStudent student1=new OopStudent(25,70,"yakub adam ");
        OopStudent student2=new OopStudent(26,80,"hamidie ahmat");
        student1.displayInfo();
        student2.displayInfo();

    }
}
