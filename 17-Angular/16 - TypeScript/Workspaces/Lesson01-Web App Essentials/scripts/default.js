let element = document.getElementById("namespan");
            element.innerHTML = 'text changed';
            element.addEventListener('click',()=>{
                alert("text changed");
            });