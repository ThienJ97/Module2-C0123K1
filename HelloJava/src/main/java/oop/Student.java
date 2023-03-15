package oop;

class Student {
    // access modifier: private, default, protected, public
    int rollno;     // 0
    private String name;    // null
    private static String college = "BachKhoa";


    public void showInfo() {

    }
    public static void main(String[] args) {
//        Student s1 = new Student();
        System.out.println(Student.college);

//        System.out.println(name);

    }
}