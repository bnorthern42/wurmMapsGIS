#WurmMaps Program

## How To Setup
- copy the 'copyme' application yml's without copy me, etc and enter your information

## Tech Stack
- PostGIS (Postgres) [docker] for map data (available)
  - if you create new database you need to run sql to enable extensions for each specific database used
- Keycloak (Oauth2) [docker] for auth (not available: locally)
  - See [keycloak in docker tutorial](https://www.keycloak.org/getting-started/getting-started-docker)
- Thymeleaf for html templating and more server side rendering-esk
- LeafletJS [webjar] for map Front end
- Java Spring Boot (Web, JPA, Security) for server side operations