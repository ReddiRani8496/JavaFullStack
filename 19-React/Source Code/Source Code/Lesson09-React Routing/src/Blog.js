import React from 'react';
import PostComponent from './PostComponent';
import './Blog.css';
import axios from 'axios';

class Blog extends React.Component {

    state = {
        posts : []
    }

    componentDidMount(){
        axios.get('http://jsonplaceholder.typicode.com/posts')
        .then(response => {
            const posts = response.data.slice(0,3);
            this.setState({
                posts : posts
            })
            
        })
        
    }
    render(){
        const post = this.state.posts.map((post) =>{
            return (
                <PostComponent key={post.id} title={post.title} userid={post.id} />
            )
        })
        return(
            <div>
                <section className = 'Posts'>
                {post}
                </section>
            </div>
        )
    }
}

export default Blog