var http = require('http');
var func = require('./func');
var num = 8083

const server = http.createServer(function (request, response) {

    if(request.url == '/favicon.ico'){
        return;
    }
    console.log("request.url : " + request.url);
    var options = {
        host: '127.0.0.1',
        port: 8082,
        path: '/here',
        method: 'GET'
    };

    var data = [];


    if (request.url == '/pass') {

        console.log("pass received sending request");

        var req = http.request(options, function(response){

            console.log('STATUS: ' + response.statusCode);
            console.log('HEADERS: ' + JSON.stringify(response.headers));
            response.setEncoding('utf8');
            response.on('data', function (chunk) {
                data = chunk;
                console.log('BODY: ' + chunk);
            });

        });

        var body = 'test';
        req.setHeader('Pinpoint', 'wowPinpoint');

        func2(req);

        // req.setRequestHeader('Pinpoint', 'wowPinpoint');

        req.write(body);

        req.end();
        console.log("sending request end");
    }


    // Send the HTTP header
    // HTTP Status: 200 : OK
    // Content Type: text/plain
    response.writeHead(200, {'Content-Type': 'text/plain'});

    // Send the response body as "Hello World"
    response.end(func1() + 'Hello World\n' + ", " + func.func2() + ", "+ data);
    console.log("responded to user=====");
});

server.listen(num);

function func1() {
    return "not instrumented ";
}

function func2() {

    console.log("inside func2");
}

// Console will print the message
console.log('Server running at http://127.0.0.1:' + num + '/pass');