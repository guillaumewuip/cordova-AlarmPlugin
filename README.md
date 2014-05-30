Cordova AlarmPlugin
===================

Return the next alarm set in the clock app on android.


##Install with plugman
```
plugman install --platform android --project <directory> --plugin https://github.com/guillaumewuip/cordova-AlarmPlugin
```
@see http://docs.phonegap.com/en/edge/plugin_ref_plugman.md.html#Using%20Plugman%20to%20Manage%20Plugins


##Somewhere in Javascript
```javascript
window.plugins.AlarmPlugin.getAlarm(
    function (alarm) {
        console.log('Alarm : ', alarm);
    },
    function () {
        console.log('error');
    }
);
```
