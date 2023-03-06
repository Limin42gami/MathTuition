package MathTuition;

public class Student {
    private Name name;
    private String kp;
    private String address;
    private String schoolName;
    private int[] marks;

    public Student(Name name, String kp, String address, String schoolName) {
        this.name = name;
        this.kp = kp;
        this.address = address;
        this.schoolName = schoolName;
        this.marks = new int[5];
    }

    public void setMark(int subject, int mark) {
        marks[subject] = mark;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAvgMark() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.length;
    }

    public int getHighestMark() {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    public int getLowestMark() {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getkp() {
        return kp;
    }

    public void setkp(String kp) {
        this.kp = kp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void displayMarks() {
        System.out.println("Marks for " + name.getFirstName() + " " + name.getLastName() + ":");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}
