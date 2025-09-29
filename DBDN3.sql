-- Write a SQL query to resolve overlapping candidate keys and achieve BCNF

-- Original table with overlapping candidate keys.
CREATE TABLE Courses (
    CourseID INT,
    InstructorID INT,
    InstructorName VARCHAR(100),
    PRIMARY KEY (CourseID, InstructorID)
);

-- Resolve overlapping candidate keys by splitting into two tables.
CREATE TABLE Instructors (
    InstructorID INT PRIMARY KEY,
    InstructorName VARCHAR(100)
);

CREATE TABLE Courses_BCNF (
    CourseID INT,
    InstructorID INT,
    PRIMARY KEY (CourseID, InstructorID),
    FOREIGN KEY (InstructorID) REFERENCES Instructors(InstructorID)
);

/* 
Explanation

Purpose of the Query :
    - The goal is to resolve overlapping candidate keys and achieve BCNF.
Key Components :
    - Instructors: Stores instructor details independently.
    - Courses_BCNF: Links courses to instructors via a foreign key
Why use BCNF? :
    - BCNF eliminates anomalies caused by overlapping candidate keys.
    - It ensures that every determinant is a candidate key.
Real-World Application :
    - In educational systems, separating instructor details avoids 
      conflicts in course assignments.

Notes:
    - BCNF is stricter than 3NF and resolves anomalies not addressed by 3NF.
    - Identify all candidate keys before applying BCNF.


 */

