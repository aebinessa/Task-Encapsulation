public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setGpa(4.0);
        String gpaStatus = student.getGpaStatus();
        student.setName("yousef");
        String studentName = student.getStudentName();
        student.setAge(21);

        System.out.println("the student's gpa " + gpaStatus);
        System.out.println("the student's name is" + studentName); // one way of doing it, calling a string
        System.out.println("the student's gpa is " + student.getStudentAge()); // the other way of doing it,
                                                                               // calling the getter from the student
                                                                               // class

    }

}
