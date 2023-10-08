Feature: Student Management

  Background:
    Given NDIONE is an administrator

  Scenario: Add a new student
    Given a new student with the following details:
      | First Name | Last Name | Student ID | Date of Birth |
      | John       | Smith     | 12345      | 1995-03-15    |
    When I add the student
    Then the student should be added successfully


  Scenario: Add multiple students in bulk
    Given I have a list of students to add
      | First Name | Last Name | Student ID | Date of Birth |
      | John       | Smith     | 12345      | 1995-03-15    |
      | Alice      | Johnson   | 67890      | 1996-08-20    |
      | Sarah      | Davis     | 54321      | 1997-04-10    |
      | David      | Wilson    | 98765      | 1998-12-05    |
      | Emily      | Brown     | 45678      | 1999-06-25    |
      | Michael    | Lee       | 24680      | 2000-02-15    |
      | Olivia     | Turner    | 13579      | 2001-09-30    |
    When I add these students in bulk
    Then all students should be added successfully
    And Display the list of student


  Scenario: Search for a student by ID
    Given students are registered with the following details:
      | First Name | Last Name | Student ID | Date of Birth |
      | John       | Smith     | 12345      | 1995-03-15    |
      | Alice      | Johnson   | 67890      | 1996-08-20    |
    When I search for the student with Student ID 12345
    Then I should get the corresponding student


  Scenario: Update student information
    Given an existing student with the following details:
      | First Name | Last Name | Student ID | Date of Birth |
      | John       | Smith     | 12345      | 1995-03-15    |
    When I update the student's last name to "Johnson"
    Then the student's information should be updated successfully














