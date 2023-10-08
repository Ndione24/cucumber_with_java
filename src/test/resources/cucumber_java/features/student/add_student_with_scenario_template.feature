Feature: Using Scenario Outline

  The Scenario Outline allow you to ...
  In This example, we are going to ...

  Background:
    Given NDIONE is an administrator

  Scenario Outline: Add a new student with specific details
    Given a new student with the following details:
      | First Name | Last Name | Student ID | Date of Birth |
      | <First_Name> | <Last_Name> | <Student_ID> | <Date_of_Birth> |
    When I add the student
    Then the student should be added successfully

    Examples:
      | First_Name | Last_Name | Student_ID | Date_of_Birth |
      | Mouhamad   | one       | 12345      | 1995-03-15    |
      | Alice      | Johnson   | 67890      | 1996-08-20    |
      | Sarah      | Davis     | 54321      | 1997-04-10    |
      | John       | Smith     | 12345      | 1995-03-15    |
      | David      | Wilson    | 98765      | 1998-12-05    |
      | Emily      | Brown     | 45678      | 1999-06-25    |
      | Michael    | Lee       | 24680      | 2000-02-15    |
      | Olivia     | Turner    | 13579      | 2001-09-30    |