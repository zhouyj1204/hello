cordova.define("coolPlugin.CoolPlugin", function(require, exports, module) {
var exec = require('cordova/exec');

var myFunc = function(){}

myFunc.prototype.toast = function (arg0, success, error) {
    exec(success, error, 'CoolToast', 'toast', [arg0]);
};

var showt = new myFunc();

module.exports = showt;

});
