import React from 'react';
import './PostComponent.css';

const postcomponent = (props) => (
    <article className="Post">
        <h1>{props.title}</h1>
        <div className="Info">
            <div className="Author">{props.userid}</div>
        </div>
    </article>
)

export default postcomponent