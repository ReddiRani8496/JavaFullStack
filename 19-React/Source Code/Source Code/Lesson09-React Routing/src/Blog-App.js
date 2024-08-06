import React, { Component } from 'react';
import './App.css';

import Blog from './Blog';


class App extends Component {

  render() {
   
    let appElement = <div>
      <h1>HTTP Demo</h1>
    </div>;
	
    return (

      <div className='App'>
        {appElement}
        <Blog />
      </div>

    );
  }
}

export default App;
