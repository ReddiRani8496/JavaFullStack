import React, { Component } from 'react';

class ControlledForm extends Component {

    state = {
        fname: '',
        lname: '',
        email: ''
    }

    constructor(props) {
        super(props);
    }

    changeHandler = (e) => {
        let name = e.target.name;
        let value = e.target.value;
        this.setState({
            [name]: value
        })
        //alert(this.state.fname);
    }

    render(){
        return(
            <div>
                <form>
                    <label> First Name : </label>
                    <input type="text" name="fname" value={this.state.fname}
                           onChange = {this.changeHandler.bind(this)} /> 
                    <br></br>
                    <label> Last Name : </label>
                    <input type="text" name="lname" value={this.state.lname}
                           onChange = {this.changeHandler.bind(this)} /> 
                    <br></br>
                    <label> Email : </label>
                    <input type="email" name="email" value={this.state.email}
                           onChange = {this.changeHandler.bind(this)} /> 
                    <br></br>
                    <input type="submit" value="Submit" />
                </form>
            </div>
        )
    }
}
export default ControlledForm