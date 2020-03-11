var crypto
var mykey
var mystr

crypto = require('crypto');


mykey = crypto.createCipher('aes-128-cbc', 'mypassword');
mystr = mykey.update('sushma', 'utf8', 'hex')
mystr += mykey.final('hex');

console.log(mystr);

mykey = crypto.createDecipher('aes-128-cbc', 'mypassword');
mystr = mykey.update('b11187f0088d169f78fbfc5a017fdee5', 'hex', 'utf8')
mystr += mykey.final('utf8');


console.log(mystr);