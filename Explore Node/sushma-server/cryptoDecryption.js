var crypto = require('crypto');

var mykey = crypto.createDecipher('aes-128-cbc', 'mypassword');
var mystr = mykey.update('b11187f0088d169f78fbfc5a017fdee5', 'hex', 'utf8')
mystr += mykey.final('utf8');

console.log(mystr); 