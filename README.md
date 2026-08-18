# LogiTrack: Fleet Service

## Overview
This repository houses the Fleet Service, which handles enterprise vehicles, driver profiles, and route scheduling. It relies on synchronous communication to verify stock availability.

## Technical Stack
* Framework: Spring Boot (Spring Web, WebClient)
* Persistence: Spring Data JPA, H2 Database / MySQL
* Resilience: Resilience4j (Circuit Breaker)
* Default Port: 8082

## Core Entities
* **Vehicle**: Manages transportation trucks and capacity details.
* **Driver**: Manages personnel profiles and status.
* **Route / Dispatch**: Transactional entity for route and cargo scheduling.
