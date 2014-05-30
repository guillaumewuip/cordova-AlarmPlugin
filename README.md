Cordova AlarmPlugin
===================

Return the next alarm set in the clock app on android.


##Install with plugman
```
plugman install AlarmPlugin
```


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
