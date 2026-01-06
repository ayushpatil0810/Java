class Student {
    String name;
    int rollNo;
    int marks;
}

public class arrayOfObjects {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Ayush"; 
        s1.rollNo = 6;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Stud1"; 
        s2.rollNo = 11;
        s2.marks = 56;

        Student s3 = new Student();
        s3.name = "Stud2"; 
        s3.rollNo = 23;
        s3.marks = 89;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.printf("Name: %s, Roll No: %d, Marks: %d\n", s.name, s.rollNo, s.marks);
        }

        System.out.println();

        for(Student s : students) {
            System.out.printf("Name: %s, Roll No: %d, Marks: %d\n", s.name, s.rollNo, s.marks);
        }

    }
}
