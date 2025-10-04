/* 
Write a SQL query to identify and resolve update anomalies in a poorly designed table.
 */

-- Poorly designed table with update anomalies.
CREATE TABLE Students (
    StudentID INT,
    CourseID INT,
    CourseName VARCHAR(100),
    InstructorName VARCHAR(100)
);

-- Resolve anomalies by normalizing into three tables
-- Table one
CREATE TABLE Courses (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(100)
);

-- Table two
CREATE TABLE Instructors (
    InstructorID INT PRIMARY KEY,
    InstructorName VARCHAR(100)
);

-- Table three
CREATE TABLE StudentCousrses (
    StudentID INT,
    CourseID INT,
    InstructorID INT,
    PRIMARY KEY (StudentID, CourseID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID),
    FOREIGN KEY (InstructorID) REFERENCES Instructors(InstructorID)
);

/* 
Explanation

    - Purpose of the Query :
        - The goal is to identify update anomalies and resolve them through normalization.
    - Key Components :
        - Courses and Instructors: Store course and instructor details independently.
        - StudentCourses: Links students to courses and instructors

 */