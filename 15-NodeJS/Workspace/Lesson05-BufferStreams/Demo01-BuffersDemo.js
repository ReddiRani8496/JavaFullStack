buf = new Buffer(256);

len = buf.write("Welcome to node buffers");

console.log("Octets written: " + len);