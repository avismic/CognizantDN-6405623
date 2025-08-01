// src/components/CohortDetails.test.js

import React from 'react';
// Import render and screen from React Testing Library
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom'; // The matchers are already included via setupTests.js

import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort.js';

// The describe block remains the same
describe("Cohort Details Component", () => {

  // Test 1: should create the component
  test("should create the component", () => {
    const testCohort = CohortData[0];
    // 'render' the component into a virtual DOM
    render(<CohortDetails cohort={testCohort} />);
    // Check if an element with the cohort's name is present in the document
    const nameElement = screen.getByText(testCohort.cohortName);
    expect(nameElement).toBeInTheDocument();
  });

  // Test 2: should initialize the props (This is better tested by checking the output)
  test("should display the correct data from props", () => {
    const testCohort = CohortData[0];
    render(<CohortDetails cohort={testCohort} />);
    // We check if the content from props is rendered correctly
    expect(screen.getByText(testCohort.cohortCode)).toBeInTheDocument();
    expect(screen.getByText(testCohort.cohortName)).toBeInTheDocument();
    expect(screen.getByText(testCohort.description)).toBeInTheDocument();
  });

  // Test 3: should display cohort code in h3
  test("should display cohort code in h3", () => {
    const testCohort = CohortData[0];
    render(<CohortDetails cohort={testCohort} />);
    // Get the heading by its level (h3) and its text content
    const h3Element = screen.getByRole('heading', { level: 3, name: testCohort.cohortCode });
    expect(h3Element).toBeInTheDocument();
    // You can also check its content directly
    expect(h3Element.textContent).toBe(testCohort.cohortCode);
  });

  // Test 4: should always render same html (Snapshot Test)
  test("should always render same html", () => {
    const testCohort = CohortData[0];
    // The 'asFragment' function gives us the HTML structure
    const { asFragment } = render(<CohortDetails cohort={testCohort} />);
    // Create the snapshot
    expect(asFragment()).toMatchSnapshot();
  });

});