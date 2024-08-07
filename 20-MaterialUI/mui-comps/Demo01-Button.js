import React from 'react';
import Button from '@mui/material/Button';

class ButtonDemo extends React.Component {
    render() {
        return (
        <div>
            <div>
                <input type="button" value="Hello World"/>
            </div>

            <div>
                <Button variant="contained">Hello World</Button>
            </div>
        </div>
        );
    }
}
export default ButtonDemo