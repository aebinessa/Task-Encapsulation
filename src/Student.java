public class Student {
    private String name;
    private int age;
    private double gpa;

    public void setGpa(double gpa) {

        if (gpa < 0.0 || gpa > 4.0) {
            gpa = 0.0;
        }
    }

    public String getGpaStatus() {
        gpa = 0;
        String gpaStatus = null;
        if (gpa > 3) {
            gpaStatus = "Excellent";
        } else if (gpa > 2 && gpa < 3) {
            gpaStatus = "Good";
        } else if (gpa < 2) {
            gpaStatus = "Needs Imporovment";
        }
        return gpaStatus;
    }
}
