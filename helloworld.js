var http = require('http');
var func = require('./func');
var num = 8083

http.createServer(function (request, response) {
    // Send the HTTP header
    // HTTP Status: 200 : OK
    // Content Type: text/plain
    response.writeHead(200, {'Content-Type': 'text/plain'});

    // Send the response body as "Hello World"
    response.end(func1() + 'Hello World\n' + func.func2());
}).listen(num);

function func1() {
    return 2;
}

// Console will print the message
console.log('Server running at http://127.0.0.1:' + num + '/');