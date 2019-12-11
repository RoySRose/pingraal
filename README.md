

Testing Graalvm Truffle instrumentation APIs

Goal is to create Pinpoint Graalvm Agent to monitor applications running on Graalvm

 ## Reference
 
 https://github.com/graalvm/simpletool 
 
 ## prerequisite
 
 - Running on Graalvm CE 19.2
 
 ## To run
 
 1. create instrument jar  
    `mvn clean install -DskipTests=true`
    
 2. run server.js   
    `node server.js`
    
 3. run 1st node.js which is going to be instrumented  
    `./simpletool node helloworld.js`
