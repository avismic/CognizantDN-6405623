// src/EmployeesList.js (Updated)
import React from 'react';
import EmployeeCard from './EmployeeCard';

// The 'theme' prop is removed from the function signature and from the EmployeeCard call
function EmployeesList({ employees }) {
  return (
    <div className="employee-list-container">
      {employees.map(employee => (
        <EmployeeCard key={employee.id} employee={employee} />
      ))}
    </div>
  );
}

export default EmployeesList;