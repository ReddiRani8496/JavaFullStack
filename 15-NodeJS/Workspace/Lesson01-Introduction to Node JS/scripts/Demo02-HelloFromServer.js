var http = require('http');
http.createServer(function(req,res){
    res.writeHead(200,{
        'Content-Type' : 'text/html'
    });
    var dateObjRef = new Date();
    res.end("Hello World, Current date and time is: " + dateObjRef);
}).listen(3000);