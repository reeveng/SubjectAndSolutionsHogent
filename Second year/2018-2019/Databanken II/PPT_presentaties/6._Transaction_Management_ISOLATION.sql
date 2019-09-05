-- TRANSACTIONS IN SQL SERVER

use xtreme;
-- Transactions as "UNDO": ISOLATION

begin transaction
select salary from Employee where EmployeeID in (1,2)
-- salary = 40000 / 90000
update Employee set Salary = Salary * 1.1
select salary from Employee where EmployeeID in (1,2)
-- salary = 44000 / 99000
-- OEPS: forgot where employeeid in (1,2) in update statement
rollback
select salary from Employee where EmployeeID in (1,2)
-- salary = 40000 / 90000
-- if ok: commit iso rollback
-- other sessions have never seen the new salary
-- due to the isolation property of RDBMS



