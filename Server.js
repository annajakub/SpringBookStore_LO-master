var http = require('http'),
    fs = require('fs');

http.createServer(function (req, res) {

    var fileStream = fs.createReadStream("books.html");

    fileStream.on('data', function (data) {
        res.write(data);
    });
    fileStream.on('end', function() {
        res.end();

    });


}).listen(9999);