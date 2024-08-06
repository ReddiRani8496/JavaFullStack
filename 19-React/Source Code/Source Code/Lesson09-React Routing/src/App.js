import React, {  Component } from 'react';
import logo from './logo.svg';
import './App.css';
import NavBar from './NavBar';
import Outlet from './Outlet';

class App extends Component {
    render() {
      const contentNode = "React Router Demo";

      return (
        <div className="app">
          <h1> { contentNode } </h1>
          <NavBar />
          <Outlet />
        </div>
      )
    }
}
export default App;
