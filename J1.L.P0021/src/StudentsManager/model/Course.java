package StudentsManager.model;

/**
 *
 * @author duykhanh
 */
public class Course {
    private String semester;
    private String courseName;

    public Course() {
    }

    public Course(String semester, String courseName) {
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseName + "[" + semester + "]";
    }
}
