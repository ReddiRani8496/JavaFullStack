var log = {
    info : function(givenInfo) {
        console.log("Info : " + givenInfo);
    },
    
    warn : function(givenWarn) {
        console.warn("Warning : " + givenWarn);
    },
    
    error : function(givenError) {
        console.error("Error : " + givenError)
    }
}

log.info("Happy");
log.warn("Ride slowly");
log.error("Uff, you made some mistake!");

module.exports = log;