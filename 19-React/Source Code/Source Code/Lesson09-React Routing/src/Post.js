import React, { Component } from 'react';
import axios from 'axios';

class Post extends Component {

    state = {
        Post: ''
    }

    constructor() {
        super();
        this.handleClick = this.handleClick.bind(this);
    }

    // Making Usage of Axios to Borrow Data 
    handleClick() {
        axios.get('https://jsonplaceholder.typicode.com/posts/3')
        .then(resp => {
            this.setState({
                Post : resp.data.title
            })
        })
    }

    render() {
        return(
            <div>
                <button type="button" onClick={this.handleClick}>Get Data</button>
                <p> { this.state.Post} </p>
            </div>
        )
    }
}
export default Post