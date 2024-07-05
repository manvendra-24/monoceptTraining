use organization;
#1. Display all employee names in ascending order
select ename from emp order by ename asc;

#2. Display all employee names, salary, commision of employees in dept 10
select ename, sal, comm from emp where deptno = 10;

#3. Display all employees in deptno 20 and 30
select * from emp where deptno = 20 or deptno = 30;

#4. Display all employees who are managers(job title)
select * from emp where job = "manager";

#5. Display all employees whose salary is between 2000 to 5000
select ename from emp where sal between 2000 and 5000;

#6. Display all employees whose commision is NULL
select ename from emp where comm IS NULL;

#7. Display employee name, salary, commission in descending order based on salary
select ename, sal, comm from emp order by sal desc;

#8. Display average, max, min and sum of salaries of employees
select avg(sal) as average, max(sal) as max, min(sal) as min, sum(sal) as sum from emp;

#9. Display hire date, current date and tenure(in months) of the employees
select hiredate, curdate() as currentdate, timestampdiff(month, hiredate, curdate()) as tenure from emp;

#10. Display all employees whose name starts with 'S'.
select ename from emp where ename like 's%';

#11. Display unique deptno from emp table
select distinct deptno from emp;

#12. Display employee's job in lower case
select ename, lower(job) as job from emp;

#13. Select top 3 salary earning employees(employees can be more than 3)
select e.* from emp e
join (
    select empno, DENSE_RANK() OVER (ORDER BY sal DESC) as salary_position from emp
) as ranked_emp on e.empno = ranked_emp.empno
where ranked_emp.salary_position <= 3;

#14. Select all clerks and managers in dept 10
select ename from emp where (job = "clerk" or job = "manager") and deptno = 10;

#15. Display all clerks in ascending order of deptno
select ename from emp where job = "clerk" order by deptno asc;

#16. Display all employees department wise
select ename,deptno from emp order by deptno asc;

#17. Display how many employees are there for each job
select job, count(*) as no_of_employees from emp group by job;

#18. Display what jobs are there for each department and number of employees for each job
select deptno, job, count(*) as no_of_employees from emp group by deptno, job;

#19. Display how many employees are there for each department
select deptno, count(*) as no_of_employees from emp group by deptno;

#20. Display the rank of each employee with respect to their salary (highest salary will be rank 1)
SELECT ename, DENSE_RANK() OVER (ORDER BY sal DESC) AS salary_rank,sal FROM emp;
