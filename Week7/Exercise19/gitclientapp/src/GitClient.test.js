// src/GitClient.test.js
import axios from "axios";
import GitClient from "./GitClient";

// We tell Jest to mock the entire axios module.
// This means any calls to axios will be intercepted by Jest.
jest.mock("axios");

// 'describe' creates a test suite, a collection of related tests[cite: 29].
describe("Git Client Tests", () => {
  // 'test' defines an individual test case[cite: 30].
  test("should return repository names for techiesyed", async () => {
    // 1. Arrange: Set up the test data and mock.
    // This is the dummy data we want our "fake" API call to return[cite: 31].
    const dummyRepos = {
      data: [
        { id: 1, name: "Repo1" },
        { id: 2, name: "Repo2" },
      ],
    };

    // We configure the mocked axios.get method.
    // We tell it: "When you are called, pretend you got a successful response
    // from the server and return our dummyRepos".
    axios.get.mockResolvedValue(dummyRepos);

    // 2. Act: Call the method we want to test.
    const response = await GitClient.getRepositories("techiesyed");

    // 3. Assert: Check if the result is what we expect.
    // We expect that our getRepositories method returned the data from our mock[cite: 32].
    expect(response.data.length).toBe(2);
    expect(response.data[0].name).toBe("Repo1");

    // We can also check if the mocked axios.get was called with the correct URL.
    expect(axios.get).toHaveBeenCalledWith(
      "https://api.github.com/users/techiesyed/repos"
    );
  });
});
