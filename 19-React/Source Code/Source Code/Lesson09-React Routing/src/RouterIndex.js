import React from 'react';
import { ReactDOM } from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router } from 'react-router-dom';

ReactDOM.render((
    <Router>
        <App />
    </Router>
), document.getElementById('root'));

// If We Want Our App to Work Offline and Load Faster, We Can Change 
// unregister() to register() below Code. Rem It Has Some Issues
// TO Know More on Service Workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();