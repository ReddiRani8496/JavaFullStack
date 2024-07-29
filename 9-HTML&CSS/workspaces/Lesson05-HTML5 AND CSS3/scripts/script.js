var changeColor = function () {
    document.body.style.backgroundColor = 'acqua';
    var box = document.getElementById('box');
    box.style.backgroundColor = 'blue';
    box.style.width = '500px';
    box.style.height = '500px';
    box.style.float = 'right';
    // box.style.borderRadius = '50%';
    var element = document.getElementsByTagName('h1')[0];
    element.style.color = 'red';
    element.style.align = 'center';
}