package StudentsManager.model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author duykhanh
 */
public class StudentsList extends ArrayList<Student> {

    public StudentsList() {
    }

    public StudentsList searchListByName(String name) {
        StudentsList matches = new StudentsList();
        for (Student s : this) {
            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                matches.add(s);
            }
        }
        return matches;
    }

    public Student searchById(String id) {
        for (Student s : this) {
            if (s.getId().equals(id)) {
            }
        }
        return null;
    }

    public StudentsList sortByName() {
        StudentsList sorted = new StudentsList();

        sorted.addAll(this);
        sorted.sort(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                int i = a.getName().compareTo(b.getName());
                return i != 0 ? i : a.getId().compareTo(b.getId());
            }
        });
        return sorted;
    }

    public void printAll() {
        if (isEmpty()) {
            return;
        }

        String format = "| %3s  | %-7s | %-25s | %9s  |  %7s   |%n";

        System.out.println(
                "+----------------------------------------------------------------------+");
        System.out.println(
                "| No.  | ID      | Name                      |  Semester  |   Course   |");
        System.out.println(
                "+----------------------------------------------------------------------+");
        int i = 0;
        String order;
        for (Student st : this) {
            order = ++i < 10 ? "00" + i : (i < 100 ? "0" + i : "" + i);
            System.out.format(format, order, st.getId(), st.getName(),
                    st.getCourses().get(0).getSemester(), st.getCourses().get(0).getCourseName());
            for (int j = 1; j < st.getCourses().size(); j++) {
                System.out.format(format, "", "", "",
                        st.getCourses().get(j).getSemester(), st.getCourses().get(j).getCourseName());
            }
            System.out.println(
                    "+----------------------------------------------------------------------+");
        }
    }
}
