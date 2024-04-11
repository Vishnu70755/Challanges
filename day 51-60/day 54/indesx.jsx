import React from 'react';
import './App.css';
import TodoList from './TodoList'; // Make sure the path matches where you saved TodoList.js

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <TodoList />
      </header>
    </div>
  );
}

export default App;
