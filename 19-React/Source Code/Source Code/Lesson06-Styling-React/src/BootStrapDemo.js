import React, { Component } from 'react';
import { Button, Progress } from 'reactstrap';
class BootStrapDemo extends Component {

    state = {
        progessVal : 10
    }

    btnClickHandler = (e) => {
        this.setState({progessVal : 40 })
    }
    render() {
        return (
            <div>
                <Button color="warning" onClick = {this.btnClickHandler}>Update Progress</Button>
                <Progress value={this.state.progessVal} color="info">Completed</Progress>
            </div>
        )
    }
}
export default BootStrapDemo