import React, { Component } from 'react';
import fieldValidator from 'validator';
import './controlledFormApp.css';

class ControlledForm1 extends Component{
    state = {
        fname : '',
        lname : '',
        email : ''
    }
    constructor(props){
        super(props)
    }

    changeHandler = (e) => {
        let name = e.target.name;
        let value = e.target.value;
        this.setState({
            [name] : value
        })
    }

    submitHandler = (e) => {
        e.preventDefault();

    }
    handleBlur = (e) => {
        if(e.target.value==''){
            e.target.className='error'
            e.target.focus();
        }
        else
            e.target.className=''
    }

    render(){
        const {fname, lname, email} = this.state;
        const isValid = fname.length>0 && lname.length>0 && fieldValidator.isEmail(email);
        return(
            <div>
                <form onSubmit={this.submitHandler.bind(this)}>
                    <label>First Name: </label>
                    <input type='text' name='fname' value={this.state.fname} 
                    onChange={this.changeHandler.bind(this)} 
                    onBlur={this.handleBlur.bind(this)} required/> <br/>
                    <label>Last Name: </label>
                    <input type='text' name='lname' value={this.state.lname} 
                    onChange={this.changeHandler.bind(this)} 
                    onBlur={this.handleBlur.bind(this)} required/> <br/>
                    <label>Email: </label>
                    <input type='text' name='email' value={this.state.email} 
                    onChange={this.changeHandler.bind(this)} 
                    onBlur={this.handleBlur.bind(this)}/> <br/>
                    <input type='Submit' disabled={!isValid} value='Submit'/>
                </form>
            </div>
        )
    }
}

export default ControlledForm1