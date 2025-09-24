/* 
 Singale line comment = ( -- )
 Multi line comment = ( /*  */)

 Problem - Write a SQL query to normalize a table into First Normal Form (1NF).

 */


-- Original table with repeating groups
CREATE TABLE Orders (
    OrderID INT
    CustomerName VARCHAR(100),
    ProductNames VARCHAR(MAX) 
);

-- Normalize the table into 1NF by spliting repeating groups
CREATE TABLE Orders_1NF (
    OrderID INT,
    CustomerName VARCHAR(100),
    ProductName VARCHAR(100)
);


/* 
Explanation:

Purpose of the Query :
        - The goal is to eliminate repeating groups and ensure atomic values in 
          each column, achieving 1NF.
Key Components :
        - Orders_1NF: A normalized table where each product is stored in a 
          separate row.
        - Each column contains only one value per row.
Why use 1NF? :
        - 1NF ensures that data is stored in a structured format, making it 
          easier to query and maintain.
        - It eliminates redundancy caused by repeating groups.
Real-World Application :
        - In an e-commerce system, storing each product in a separate row 
          simplifies order processing.

 */