import React, { useState } from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  // State to manage which component is visible. 'all' is the default.
  const [visibleSection, setVisibleSection] = useState('all');

  // Helper function to render components based on state
  const renderContent = () => {
    // This switch statement is one way of conditionally rendering
    switch (visibleSection) {
      case 'courses':
        return <CourseDetails />;
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      default:
        // This shows the final layout from your screenshot
        return (
          <>
            <div className="column">
              <CourseDetails />
            </div>
            <div className="column">
              <BookDetails />
            </div>
            <div className="column">
              <BlogDetails />
            </div>
          </>
        );
    }
  };

  return (
    <div>
      <div className="controls">
        <h3>Conditional Rendering Controls</h3>
        <button onClick={() => setVisibleSection('all')} className={visibleSection === 'all' ? 'active' : ''}>Show All</button>
        <button onClick={() => setVisibleSection('courses')} className={visibleSection === 'courses' ? 'active' : ''}>Show Courses Only</button>
        <button onClick={() => setVisibleSection('books')} className={visibleSection === 'books' ? 'active' : ''}>Show Books Only</button>
        <button onClick={() => setVisibleSection('blogs')} className={visibleSection === 'blogs' ? 'active' : ''}>Show Blogs Only</button>
      </div>

      <div className="app-container">
        {renderContent()}
      </div>
      
      {/* Here are other common ways to do conditional rendering:

        1. Using If/Else (as done in the renderContent function)

        2. Using Ternary Operator:
           { visibleSection === 'all' ? <BookDetails /> : <p>Books are hidden.</p> }
           
        3. Using Logical && Operator (renders only if condition is true):
           { visibleSection === 'books' && <BookDetails /> }
           { visibleSection === 'blogs' && <BlogDetails /> }
      */}

    </div>
  );
}

export default App;