// src/App.test.js
import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders the main page header", () => {
  render(<App />);
  const headerElement = screen.getByText(
    /GitHub Repositories of User - TechieSyed/i
  );
  expect(headerElement).toBeInTheDocument();
});
