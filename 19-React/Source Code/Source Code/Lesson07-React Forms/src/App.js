import logo from './logo.svg';
import './App.css';
//import UncontrolledForm from './Demo01-Uncontrolled-Form';
//import UncontrolledFormDefaultValue from './Demo02-Uncontrolled-Form';
//import ControlledForm from './Demo03-Controlled-Form';
//import FormContainer from './Demo04-FormContainer';
import FormContainer1 from './Demo05-FormContainer';

function App() {
  const contentNode = "React Uncontrolled Form";
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
        {/* <UncontrolledForm /> */}
        {/* <UncontrolledFormDefaultValue /> */}

        {/* <ControlledForm /> */}
        {/* <FormContainer /> */}
        <FormContainer1 />
      </header>
    </div>
  );
}
export default App;
