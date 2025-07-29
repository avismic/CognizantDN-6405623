import React from "react";
import "./Stylesheets/mystyle.css";

function CalculateScore({ Name, School, Total, goal }) {
  const average = Total / goal;

  return (
    <div className="score-card">
      <h2>Student: {Name}</h2>
      <p>School: {School}</p>
      <p>Total Points: {Total}</p>
      <p>Goal Points: {goal}</p>
      <p>Average Score: {average.toFixed(2)}</p>
    </div>
  );
}

export default CalculateScore;
