// src/EmployeeCard.js (Updated)
import React, { useContext } from "react"; // 1. Import useContext
import ThemeContext from "./ThemeContext"; // 2. Import the ThemeContext [cite: 36]

// The 'theme' prop is removed from the function signature
function EmployeeCard({ employee }) {
  // 3. Retrieve the context value with the help of useContext() [cite: 37]
  const theme = useContext(ThemeContext);

  // 4. Use the variable to pass the className for the elements [cite: 38]
  const cardClassName = `card ${theme}`;
  const buttonClassName = `button ${theme}`;

  return (
    <div className={cardClassName}>
      <img
        src={employee.avatar}
        alt={`${employee.first_name} ${employee.last_name}`}
        className="avatar"
      />
      <h2>
        {employee.first_name} {employee.last_name}
      </h2>
      <p>Email: {employee.email}</p>
      <button className={buttonClassName}>Edit</button>
      <button className={buttonClassName}>Delete</button>
    </div>
  );
}

export default EmployeeCard;
