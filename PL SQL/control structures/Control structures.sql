use nk;
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(50),
    DOB DATE,
    Balance DECIMAL(10,2),
    IsVIP BOOLEAN DEFAULT FALSE
);
INSERT INTO Customers VALUES
(101, 'John', '1955-05-10', 12000, FALSE),
(102, 'Alice', '1990-08-15', 15000, FALSE),
(103, 'David', '1960-12-20', 8000, FALSE);
INSERT INTO Loans VALUES
(201, 101, 9.5, '2026-07-10'),
(202, 102, 10.0, '2026-09-20'),
(203, 103, 8.5, '2026-07-05');
UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE CustomerID IN (
    SELECT CustomerID
    FROM (
        SELECT CustomerID
        FROM Customers
        WHERE TIMESTAMPDIFF(YEAR, DOB, CURDATE()) > 60
    ) AS Temp
);
SELECT c.CustomerID, c.Name, l.InterestRate
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE TIMESTAMPDIFF(YEAR, c.DOB, CURDATE()) > 60;
UPDATE Customers
SET IsVIP = TRUE
WHERE Balance > 10000;
SELECT CustomerID, Name, Balance, IsVIP
FROM Customers
WHERE IsVIP = TRUE;
SELECT c.CustomerID,
       c.Name,
       l.LoanID,
       l.DueDate
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);