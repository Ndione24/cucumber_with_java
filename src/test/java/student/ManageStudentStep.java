package student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static util.Util.getStudents;


public class ManageStudentStep {


    private StudentManagement studentManagement;
    private Student student;

    private List<Student> studentsList;
    private boolean isStudentExist;

    @Given("^(.*) is an administrator$")
    public void ndioneIsAnAdministrator(String name) {
        System.out.println("The admin is " + name);
        studentManagement = new StudentManagement(new ArrayList<>());
    }


    @Given("a new student with the following details:")
    public void a_new_student_with_the_following_details(List<Map<String, String>> studentInfo) {
        System.out.println("studentInfo = " + studentInfo);
        student = getStudents(studentInfo).get(0);

    }


    @When("I add the student")
    public void iAddTheStudent() {
        studentManagement.addStudent(student);
    }


    @Then("the student should be added successfully")
    public void theStudentShouldBeAddedSuccessfully() {
        assertTrue(studentManagement.getAllStudents().contains(student));
    }


    // add Multiple Student
    @Given("I have a list of students to add")
    public void iHaveAListOfStudentsToAdd(List<Map<String, String>> studentsList) {
        this.studentsList = getStudents(studentsList);
    }

    @When("I add these students in bulk")
    public void iAddTheseStudentsInBulk() {
        studentManagement.setStudents(this.studentsList);
    }

    @Then("all students should be added successfully")
    public void allStudentsShouldBeAddedSuccessfully() {
        assertEquals(studentManagement.getAllStudents().size(), this.studentsList.size());
    }

    @And("Display the list of student")
    public void displayTheListOfStudent() {
        studentManagement
                .getAllStudents()
                .forEach(System.out::println);
    }

    // Search Student by id
    @Given("students are registered with the following details:")
    public void studentsAreRegisteredWithTheFollowingDetails(List<Map<String, String>> studentsList) {
        studentManagement.setStudents(getStudents(studentsList));
    }

    @When("I search for the student with Student ID {int}")
    public void iSearchForTheStudentWithStudentID(int idStudent) {
        isStudentExist = studentManagement.findStudentById(idStudent) != null;
    }

    @Then("I should get the corresponding student")
    public void iShouldGetTheCorrespondingStudent() {
        assertTrue(isStudentExist);
    }

    // Update last name of student
    private String newLastName;

    @Given("an existing student with the following details:")
    public void anExistingStudentWithTheFollowingDetails(List<Map<String, String>> targetStudent) {
        student = getStudents(targetStudent).get(0);
    }

    @When("I update the student's last name to {string}")
    public void iUpdateTheStudentSLastNameTo(String newLastName) {
        this.newLastName = newLastName;
        student.setLastName(newLastName);
    }

    @Then("the student's information should be updated successfully")
    public void theStudentSInformationShouldBeUpdatedSuccessfully() {
        assertEquals(newLastName,student.getLastName());
    }


}
