# OAuth Service
This is practice project for Microservice
Build an OAuth Service server, this can be a common service used by multiple service

This service will generate JWT token

## OAuth Service
http://localhost:8901/auth/oauth/token

## Encoding
in code, all the password need encoding, default use "{bcrypt}" + encode, it include client_secret and user password
But when send HTTP request, input the raw password like "demo101"