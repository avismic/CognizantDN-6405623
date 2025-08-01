// src/App.test.js

import { render, screen } from '@testing-library/react';
import App from './App';

test('renders the cohort dashboard header', () => {
  render(<App />);
  const headerElement = screen.getByText(/My Academy Cohort Dashboard/i);
  expect(headerElement).toBeInTheDocument();
});