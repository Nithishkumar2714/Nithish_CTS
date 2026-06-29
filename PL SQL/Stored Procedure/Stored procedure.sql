CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2)
);
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(50),
    Department VARCHAR(30),
    Salary DECIMAL(10,2)
);
INSERT INTO Accounts VALUES
(101,1,'Savings',10000),
(102,2,'Savings',5000),
(103,3,'Current',15000);
INSERT INTO Employees VALUES
(1,'Mohan','IT',50000),
(2,'Arya','HR',45000),
(3,'Dinesh','IT',60000);
DELIMITER //
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END //
DELIMITER ;
CALL ProcessMonthlyInterest();
SELECT * FROM Accounts;
DELIMITER //
CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept VARCHAR(30),
    IN bonus DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus / 100)
    WHERE Department = dept;
END //
DELIMITER ;
CALL UpdateEmployeeBonus('IT',10);
SELECT * FROM Employees;
DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN fromAcc INT,
    IN toAcc INT,
    IN amt DECIMAL(10,2)
)
BEGIN
    DECLARE bal DECIMAL(10,2);
    SELECT Balance
    INTO bal
    FROM Accounts
    WHERE AccountID = fromAcc;
    IF bal >= amt THEN
        UPDATE Accounts
        SET Balance = Balance - amt
        WHERE AccountID = fromAcc;
        UPDATE Accounts
        SET Balance = Balance + amt
        WHERE AccountID = toAcc;
        SELECT 'Transfer Successful' AS Result;
    ELSE
        SELECT 'Insufficient Balance' AS Result;
    END IF;
END //
DELIMITER ;
CALL TransferFunds(101,102,500);
SELECT * FROM Accounts;
