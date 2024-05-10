const http = require('http');
const fs = require('fs');
const path = require('path');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  // Serve the HTML file
  if (req.url === '/') {
    fs.readFile(path.join(__dirname, 'index.html'), (err, data) => {
      if (err) {
        res.writeHead(500);
        res.end('Error loading index.html');
        return;
      }
      res.writeHead(200, { 'Content-Type': 'text/html' });
      res.end(data);
    });
  } else if (req.url === '/main.css') {
    // Serve the CSS file
    fs.readFile(path.join(__dirname, 'main.css'), (err, data) => {
      if (err) {
        res.writeHead(500);
        res.end('Error loading main.css');
        return;
      }
      res.writeHead(200, { 'Content-Type': 'text/css' });
      res.end(data);
    });
  } else if (req.url === '/main.java') {
    // Serve the Java file
    fs.readFile(path.join(__dirname, 'main.java'), (err, data) => {
      if (err) {
        res.writeHead(500);
        res.end('Error loading main.java');
        return;
      }
      res.writeHead(200, { 'Content-Type': 'text/plain' });
      res.end(data);
    });
  } else {
    // Handle other requests
    res.statusCode = 404;
    res.setHeader('Content-Type', 'text/plain');
    res.end('Not Found');
  }
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
