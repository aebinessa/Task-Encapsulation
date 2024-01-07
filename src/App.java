public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setGpa(3);
        String gpaStatus = student.getGpaStatus();

        System.out.println("the student's gpa status is " + gpaStatus);

    }
}
