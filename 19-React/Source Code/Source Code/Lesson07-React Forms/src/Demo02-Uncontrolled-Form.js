import React, { Component } from 'react';

class UncontrolledFormDefaultValue extends Component {

    submitHandler = (e) => {
        e.preventDefault();
        alert("First Name " + this.refs.txtFName.value + " Submitted ... ");
    }

    render() {
        return (
            <div>
                <form onSubmit= { this.submitHandler } action ="https://google.com">
                    <label> First Name : </label>
                    <input type="text" name="txtFName" ref="txtFName"  defaultValue="Doe"/>

                    <label> Gender : </label>
                    <label> Male : 
                        <input type="radio" name="optGender" ref="optGender" value="male" defaultChecked />
                    </label>
                    
                    <label> Female : 
                        <input type="radio" name="optGender" ref="optGender" value="female" />
                    </label>

                    <p>City : </p>                    
                    <select name="selCity" defaultValue="LON">
                        <option value="BLR">Bengaluru</option>
                        <option value="NYC">New York</option>
                        <option value="LON">London</option>
                    </select>
                    
                    <label>  </label>
                    <input type="submit" value="Submit" />
                </form>
            </div>
        )
    }
}
export default UncontrolledFormDefaultValue