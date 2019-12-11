var http = require('http');
var num = 8082

http.createServer(function (req, res) {

    console.log(req.url);

    console.log(req.headers);

    var pinpoint = req.headers['pinpoint'];

    console.log(pinpoint);

    let body = '';
    req.on('data', chunk => {
        body += chunk.toString(); // convert Buffer to string
    });
    req.on('end', function(){
        console.log(body);
        res.end(body);
    });

}).listen(num);

console.log('Server running at http://127.0.0.1:' + num + '/');