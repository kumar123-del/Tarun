class Student
{
    String name;
    int rollno;
    int marks;
}
public class Objectsinarray 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.name = "tarun";
        s1.rollno = 1;
        s1.marks =99;

        Student s2 = new Student();
        s2.name = "kumar";
        s2.rollno = 2;
        s2.marks = 98;

        Student s3 = new Student();
        s3.name = "indra";
        s3.rollno = 3;
        s3.marks = 100;

        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;
        for(int i=0;i<Students.length;i++)
        {
            System.out.println(Students[i].name + " : " + Students[i].rollno + " : " + Students[i].marks);
        }
    }
}
