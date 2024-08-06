import React, { Component } from 'react';

class UncontrolledForm extends Component {

    submitHandler = (e) => {
        e.preventDefault();
        alert("First Name " + this.refs.txtFName.value + " Submitted ... ");
    }

    render() {
        return (
            <div>
                <form onSubmit= { this.submitHandler } action ="https://google.com">
                    <label> First Name : </label>
                    <input type="text" name="txtFName" ref="txtFName" />
                    <label>  </label>
                    <input type="submit" value="Submit" />
                </form>
            </div>
        )
    }
}
export default UncontrolledForm