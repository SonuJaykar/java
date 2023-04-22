class Student {
    int enrollmentNo;
    String name;
}

public class practical_6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.enrollmentNo = 1;
        s1.name = "divyan";

        Student s2 = new Student();
        s2.enrollmentNo = 2; 
        s2.name = "sonu";

        Student s3 = new Student();
        s3.enrollmentNo = 3;
        s3.name = "het";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}