#WurmMaps Program

## How To Setup
- copy the 'copyme' application yml's without copy me, etc and enter your information
- initial kingdom setup:
  - [http://localhost:7077/admin/kingdoms](http://localhost:7077/admin/kingdoms)
  - There you will be able add kingdoms to database if they are not loaded (conditional button)
- To get kingdom json:
  - [localhost:7077/api/kingdoms](localhost:7077/api/kingdoms)
  - ![kingdomsJson](imgs/kingdomsOfChaos.jpg)
- Access Map:
  - [localhost:7077/map](localhost:7077/map)
  - ![poormapWIP](imgs/poormap.jpeg)
## Tech Stack
- PostGIS (Postgres) [docker] for map data (available)
  - if you create new database you need to run sql to enable extensions for each specific database used
- Keycloak (Oauth2) [docker] for auth (not available: locally)
  - See [keycloak in docker tutorial](https://www.keycloak.org/getting-started/getting-started-docker)
- Thymeleaf for html templating and more server side rendering-esk
- LeafletJS [webjar] for map Front end
- Java Spring Boot (Web, JPA, Security) for server side operations

## Other

- This is a major WIP, use at your own risk

### Todos (MAJOR in no particular order) 
- get map working with icons
- allow entry of items based on roles
- allow deletion of items based on roles
- add kingdom influence overlay
- add locate artifact tooling
- allow for sharing of map locations
- add drawing of "war plans" and share them
- place markers for "maybe" future deeds
- profile setup for users
- add deed costing calculator for known deed sizes
- add other maps
- add search for towers and deeds
- map out roads on surface
  - dijkstra's best route to get there
  - weights of graph based on some topo survey of map
- styling, colors, and fonts
- open some stuff like influence publicly