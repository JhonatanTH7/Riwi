package WorkPOO2.Exercise3.Classes.Menus;

import WorkPOO2.Exercise3.Classes.CourseManagement;
import WorkPOO2.Exercise3.Classes.SearchCourseByCode;

import javax.swing.*;

public class OptionsExercise3 {
    public void mainOptions(String option) {
        MenusExercise3 menu = new MenusExercise3();
        switch (option) {
            case "1":
                String option1;
                do {
                    option1 = menu.showCoursesMenu();
                    optionsCourses(option1);
                } while (!option1.equals("4"));
                break;
            case "2":
                String option2;
                do {
                    option2 = menu.showStudentsMenu();
                    optionsStudents(option2);
                } while (!option2.equals("4"));
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "See you next time!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not a valid option");
                break;
        }
    }

    public void optionsCourses(String option) {
        CourseManagement courseManagement = new CourseManagement();
        switch (option) {
            case "1":
                courseManagement.addCourse();
                break;
            case "2":
                SearchCourseByCode searchCourseByCode = new SearchCourseByCode();
                break;
            case "3":
                courseManagement.getCoursesList();
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Going back");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not a valid option");
                break;
        }
    }

    public void optionsStudents(String option) {
        switch (option) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Going back");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not a valid option");
                break;
        }
    }

}
