-- Write a SQL query to eliminate transitive dependencies and achieve 3NF.

-- Original table with transitive dependency.
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT,
    DepartmentName VARCHAR(100),
    Salary DECIMAL(10, 2)
);

-- Eliminate transitive dependency by splitting into two tables.
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100)
);

CREATE TABLE Employees_3NF (
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT,
    Salary DECIMAL(10, 2),
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);


/* 
Explanation

Purpose of the Query :
        - The goal is to eliminate transitive dependencies by separating dependent 
          attributes into their own tables.
Key Components :
        - Departments: Stores department details independently.
        - Employees_3NF: Links employees to departments via a foreign key.
 */

