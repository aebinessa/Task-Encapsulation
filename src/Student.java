public class Student {
    private String name;
    private int age;
    private double gpa = 0.0;

    public void setGpa(double gpa) {

        if (gpa < 0.0 || gpa > 4.0) {
            gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    public String getGpaStatus() {
        // gpa = 0;, was resetting the code therefore conditions were not working
        String gpaStatus = null;
        if (gpa > 3) {
            gpaStatus = "Excellent";
        } else if (gpa >= 2.0) {
            gpaStatus = "Good";
        } else {
            gpaStatus = "Needs Imporovment";
        }
        return gpaStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentAge() {
        return age;
    }

}
