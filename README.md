# kotlin-web-maven-spring-websocket-jsp-vanilla

## Description
This is a maven built springboot web app
using the STOMP subprotocol to communicate
over websockets to vanilla javascript jsp clients.
By clients, we mean any number of visitors to
this website will see changes in real time.
  The project is simple, the visitor clicks a
button which is updated on the server as well as
a log. Any new visitor will receive all logs and
an updated click count.

## Tech stack
- kotlin
- maven
  - springboot
  - bootstrap
  - jquery
  - sockjs

## Docker stack
- openjdk:11-jdk

## To run
`sudo ./install.sh -u`
Available at http://localhost/index.jsp

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
https://spring.io/guides/gs/messaging-stomp-websocket/
