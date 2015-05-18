/**
 * Created by sourabh on 18/5/15.
 */

module.exports = {
    getId: function(successCallback) {
        cordova.exec(successCallback,
            null, // No failure callback
            "androidId",
            "getId",
            []);
    }
};