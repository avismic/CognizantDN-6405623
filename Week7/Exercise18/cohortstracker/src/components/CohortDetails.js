// src/components/CohortDetails.js

import React from 'react';
import './CohortDetails.css';

const CohortDetails = ({ cohort }) => {
  // ... component code
  if (!cohort) {
    return <div className="cohort-card-empty">No cohort data provided.</div>;
  }

  return (
    <div className="cohort-card">
      <div className={`status-badge ${cohort.status?.toLowerCase()}`}>{cohort.status}</div>
      <h3 className="cohort-code">{cohort.cohortCode}</h3>
      <h4 className="cohort-name">{cohort.cohortName}</h4>
      <p className="cohort-description">{cohort.description}</p>
      <div className="cohort-footer">
        <span>🎓 {cohort.learners} Learners</span>
        <span>📍 {cohort.mode}</span>
      </div>
    </div>
  );
};

// Ensure this line is exactly as follows
export default CohortDetails;