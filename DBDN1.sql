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


/* 
Explanation:

Purpose of the Query :
        - The goal is to eliminate partial dependencies by separating non-key 
          attributes into their own tables.
Key Components :
        - Customers: Stores customer details independently.
        - Orders_2NF: Links orders to customers via a foreign key.
Why Use 2NF? :
        - 2NF reduces redundancy by ensuring that non-key attributes depend on the 
          entire primary key.
        - It improves data consistency and reduces update anomalies.
Real-World Application :
        - In inventory systems, separating customer and order details avoids 
          duplicating customer information.
          
 */