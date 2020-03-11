const http = require('http'); //http is module

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {  //create server is  method
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('data from node js run time');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});