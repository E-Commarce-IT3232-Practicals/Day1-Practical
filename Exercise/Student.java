//Create a student class  
//create 5 student objects and store it in  a proper datastructure 
//find the average marks of the students 

import java.util.ArrayList;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 75));
        students.add(new Student("Rayan", 82));
        students.add(new Student("Raj", 63));
        students.add(new Student("Ronny", 55));
        students.add(new Student("Smith", 92));

        int total = 0;
        for(Student student : students) {
            total += student.getMarks();
        }

        double avg = total / (double)students.size();

        System.out.println("The average marks: " + avg);
    }
}