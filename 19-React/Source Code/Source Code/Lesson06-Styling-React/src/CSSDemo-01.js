import React, { Component } from 'react';
import './CSSDemo-01.css';

class CSSDemo extends Component {

    render(){
        return (
            <div>
                <h3>PLAIN CSS STYLESHEET FILE</h3>
                <p>Styles are Imported From Plain CSS File</p>
                <div className="CSSDemo">
                    <h2 className="CSSDemo_content">Welcome to REACT JS</h2>
                </div>
            </div>
        )
    }

}
export default CSSDemo