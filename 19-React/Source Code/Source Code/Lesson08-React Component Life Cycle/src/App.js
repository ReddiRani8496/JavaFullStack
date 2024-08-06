import logo from './logo.svg';
import './App.css';
import Clock from './Demo01-Clock';

function App() {

  const contentNode = "React Component LifeCycle";
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <h2> { contentNode } </h2>
        <Clock />
      </header>
    </div>
  );
}

export default App;
