# OAuth Service
This is pan zhang's practice project for micoservice
Build a OAuth Service server, this can be a common service used by multiple service

## OAuth Service
http://localhost:8901/auth/oauth/token

## Encoding
in code, all the password need encoding, default use "{bcrypt}" + encode, it include client_secret and user password
But when send HTTP request, input the raw password like "demo101"