package StudentsManager.controller;

import StudentsManager.view.Menu;
import StudentsManager.model.Course;
import StudentsManager.model.Student;
import StudentsManager.model.StudentsList;
import StudentsManager.view.Inputted;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duykhanh
 */
public class Manager {
    StudentsList list;

    public Manager() {
        this.list = new StudentsList();
    }

    public Manager(StudentsList list) {
        this.list = list;
    }

    public void createStudent() {
        String nId;
        String nName;
        Student nSt;
        int count = 0;
        do {
            nId = Inputted.inputPattern("Enter new ID: ", Inputted.VALID_ID,
                    "It must be start with FU followed by 3 digits, example FU123");
            if (list.searchById(nId) != null) {
                System.out.println("Student ID: " + nId + " already exist!\n");
                continue;
            }
            nName = Inputted.inputStringNoBlack("Enter name: ");
            nSt = new Student(nId, nName);
            addCourse(nSt);
            list.add(nSt);
            count++;
            if (!Inputted.inputBoolean("Do you want to continue create new students (Y/N)?: "))
                break;
        } while (true);
        System.out.println("Created " + count + " student(s) successful!\n");
    }

    public void addCourse(Student cSt) {
        String nSemester;
        String nCourseName;
        do {
            nSemester = Inputted.inputPattern("Enter Semester: ", Inputted.VALID_SEM,
                    "It must be the SP, SU or FA semesters of the years 2013-2023, example SP2023");
            nCourseName = Inputted.inputPattern("Enter Course Name: ", Inputted.VALID_COURSE,
                    "Only JAVA, .NET, C/C++ course");
            cSt.addNewCourse(nSemester, nCourseName);
        } while (Inputted.inputBoolean("Do you want to continue add a course (Y/N)?: "));
    }

    public void updateCourse(Course course, Student st) {
        String uSemester;
        String uCourseName;
        do {
            uSemester = Inputted.inputPattern("Enter Semester: ", Inputted.VALID_SEM,
                    "It must be the SP, SU or FA semesters of the years 2013-2023, example SP2023");
            uCourseName = Inputted.inputPattern("Enter Course Name: ", Inputted.VALID_COURSE,
                    "Only JAVA, .NET, C/C++ course");
            if (st.isCourseExist(uSemester, uCourseName)) {
                System.out.println("Course " + uCourseName + " in " + uSemester + " already added!\n");
                continue;
            }
            course.setSemester(uSemester);
            course.setCourseName(uCourseName);
            return;
        } while (Inputted.inputBoolean("Do you want to continue update this student (Y/N)?: "));
    }

    public void editStudent() {
        String eId;
        Student eSt;
        do {
            if (list.isEmpty()) {
                System.out.println("Empty List! No updated/deleted performances!\n");
                return;
            }
            eId = Inputted.inputPattern("Enter ID to search: ", Inputted.VALID_ID,
                    "It must be start with FU followed by 3 digits, example FU123");
            eSt = list.searchById(eId);
            if (eSt == null) {
                System.out.println("Student ID: " + eId + " doesn't exist");
                continue;
            }
            eSt.printCourse();
            switch (Menu.getChoice(Menu.EDIT_OPTIONS)) {
                case 1:
                    updateStudent(eSt);
                    break;
                case 2:
                    deleteStudent(eSt);
                    break;
            }
        } while (Inputted.inputBoolean("Do you want to continue edit other student(s) (Y/N)?: "));
        System.out.println("Edit student(s) successful!");
    }

    private void deleteStudent(Student st) {
        if (!Inputted.inputBoolean("Are you sure to delete this student (Y/N)?: "))
            return;
        System.out.println("Student ID: " + st.getId() + " has been deleted successfully");
        list.remove(st);
    }

    private void updateStudent(Student st) {
        st.printCourse();
        System.out.println("0. Add new course.");
        List<Course> courses = st.getCourses();
        int choice = Inputted.inputInt("Choose a course to update: ", 0, courses.size()) - 1;
        if (choice == -1)
            addCourse(st);
        else
            updateCourse(courses.get(choice), st);
        st.printCourse();
        System.out.println("Student ID: " + st.getId() + " has been updated successfully");
    }

    public void findStudent() {
        if (list.isEmpty()) {
            System.out.println("Empty List! No searched performances!\n");
            return;
        }
        String fName;
        do {
            fName = Inputted.inputStringNoBlack("Enter Name to search: ");
            list.searchListByName(fName).sortByName().printAll();
        } while (Inputted.inputBoolean("Do you want to find other student(s) (Y/N)?: "));
    }

    public void printReport() {
        if (list.isEmpty()) {
            System.out.println("Empty List! No report is printed!\n");
            return;
        }

        String format = "| %3s  | %-7s | %-35s | %7s    |  %4s      |%n";

        System.out.println(
                "+--------------------------------------------------------------------------------+");
        System.out.println(
                "| No.  | ID      | Name                                |   Course   |   Totals   |");
        System.out.println(
                "+--------------------------------------------------------------------------------+");
        int i = 0;
        String order;
        String courseName;
        List<String> course = new ArrayList<>();
        for (Student st : list) {
            for (int j = 0; j < st.getCourses().size(); j++) {
                courseName = st.getCourses().get(j).getCourseName();
                if (!course.contains(courseName))
                    course.add(courseName);
            }
            order = ++i < 10 ? "00" + i : (i < 100 ? "0" + i : "" + i); // set the order
            System.out.format(format, order, st.getId(), st.getName(), course.get(0), st.countCourse(course.get(0)));
            for (int j = 1; j < course.size(); j++) {
                System.out.format(format, "", "", "", course.get(j), st.countCourse(course.get(j)));
            }
            course.clear();
            System.out.println(
                    "+--------------------------------------------------------------------------------+");
        }
    }

}
