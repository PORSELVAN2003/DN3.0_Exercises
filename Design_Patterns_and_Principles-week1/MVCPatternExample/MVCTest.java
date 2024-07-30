public class MVCTest {
    public static void main(String[] args) {

        Student student = new Student("SAM", "24", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("SAM");
        controller.setStudentId("21");
        controller.setStudentGrade("O");

        controller.updateView();
    }
}
