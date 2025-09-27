-- Write a SQL query to eliminate transitive dependencies and achieve 3NF.

-- Original table with transitive dependency.
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT,
    DepartmentName VARCHAR(100),
    Salary DECIMAL(10, 2)
);








