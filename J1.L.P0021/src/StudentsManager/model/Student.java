package StudentsManager.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duykhanh
 */
public class Student {
    private String id;
    private String name;

    private final List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, String semester, String courseName) {
        this.id = id;
        this.name = name;
        this.courses.add(new Course(semester, courseName));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addNewCourse(String sem, String course) {
        if (isCourseExist(sem, course))
            System.out.println("Course " + course + " in " + sem + " already added");
        else {
            courses.add(new Course(sem, course));
        }
    }

    public int countCourse(String course) {
        int count = 0;
        for (Course c : courses) {
            if (c.getCourseName().equalsIgnoreCase(course))
                count++;
        }
        return count;
    }

    public boolean isCourseExist(String sem, String course) {
        if (courses.isEmpty())
            return false;
        for (Course c : courses) {
            if (c.getCourseName().equalsIgnoreCase(course)
                    && c.getSemester().equalsIgnoreCase(sem))
                return true;
        }
        return false;
    }

    public void printCourse() {
        if (courses.isEmpty()) {
            return;
        }
        System.out.println("Student name: " + name);
        String format = "| %3s  |  %9s   |  %7s      |%n";

        System.out.println(
                "+-------------------------------------+");
        System.out.println(
                "| No.  |  Semester    |   Course      |");
        System.out.println(
                "+-------------------------------------+");
        int i = 0;
        String order;
        for (Course c : courses) {
            order = ++i < 10 ? "0" + i : "" + i;
            System.out.format(format, order, c.getSemester(), c.getCourseName());
        }
        System.out.println(
                "+-------------------------------------+");
    }
}
