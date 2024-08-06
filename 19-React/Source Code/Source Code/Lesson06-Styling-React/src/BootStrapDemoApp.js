import React, {Component} from 'react';
import './App.css';
import BootStrapDemo from './BootStrapDemo';


class App extends Component {

    render() {
        const contentNode = "BootStrap With React";

        return (
            <div className="App">
                <h2> { contentNode } </h2>

                <BootStrapDemo />
            </div>
        )
    }
}
export default App