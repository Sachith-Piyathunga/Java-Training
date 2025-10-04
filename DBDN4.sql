/* 
Write a SQL query to identify and resolve update anomalies in a poorly designed table.
 */

-- Poorly designed table with update anomalies.
CREATE TABLE Students (
    StudentID INT,
    CourseID INT,
    CourseName VARCHAR(100),
    InstructorName VARCHAR(100),
);