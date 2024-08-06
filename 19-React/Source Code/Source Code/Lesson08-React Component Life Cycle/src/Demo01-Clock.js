import React, { Component } from 'react';

class Clock extends Component {

    constructor(props) {
        super(props);
        this.state = {
            date: new Date()
        }
        console.log('Component Constructed ... ');
    }

    componentDidMount() {
        // It Runs After the Component Output has Been Rendered to the DOM
        console.log('Component Did Mount ...')
        this.clockID = setInterval(
            () => this.tick(),1000
        );
    }

    componentDidUpdate() {
        console.log('Component Did Update ...')
    }

    componentWillUnmount() {
        console.log('Component Will UnMount ... ');
        // It Runs Right Before React Unmounts and Destroys the Component
        clearInterval(this.clockID);
    }

    tick = () => {
        this.setState({
            date : new Date()
        })
    }

    render() {
        console.log(" Component is Rendered ... ");
        return (
            <h2> It is { this.state.date.toLocaleTimeString() } </h2>
        );
    }
}
export default Clock