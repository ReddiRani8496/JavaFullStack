import CSSInJSDemo from "./CSSInJSDemo";
import React, { Component } from "react";

class CSSDemo2 extends Component {

    render() {
        return(
            <div>
                <h2> CSS IN JS ( File Based )</h2>
                <p>

                </p>
                <div style= { CSSInJSDemo.CSSDemo_CSSInJS }>
                    <p style={ CSSInJSDemo.CSSDemo_CSSInJS }> CSS in JS</p>
                </div>
            </div>
        )
    }
}
export default CSSDemo2