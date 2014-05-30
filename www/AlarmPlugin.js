
var AlarmPlugin = function() {};

AlarmPlugin.prototype.getAlarm = function (successCallback, errorCallback, options) {

    if (errorCallback == null) { 
        errorCallback = function() {};
    }

	cordova.exec(successCallback, errorCallback, "AlarmPlugin", "get", []);
};



if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.AlarmPlugin) {
    window.plugins.AlarmPlugin = new AlarmPlugin();
}

if (module && module.exports) {
  module.exports = AlarmPlugin;
}