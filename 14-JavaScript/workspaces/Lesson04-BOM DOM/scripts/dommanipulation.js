function actionPerformed() {
    var articleElement = document.getElementById("article-1");
    
    var headingElement = document.createElement("h2");
    var text = "This is a new header text";

    var newTextElement = document.createTextNode(text);

    headingElement.appendChild(newTextElement);

    articleElement.appendChild(headingElement);
}