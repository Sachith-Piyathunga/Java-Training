-- Write a SQL query to resolve partial dependencies and achieve 2NF.

CREATE TABLE Orders (
    OrderID INT,
    CustomerID INT,
    CustomerName VARCHAR(100),
    ProductID INT,
    Queantity into
);

-- Resolve partial dependency by splitting into two tables.

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(100)
);

CREATE TABLE Orders_2FN (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    ProductID INT,
    Queantity INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

