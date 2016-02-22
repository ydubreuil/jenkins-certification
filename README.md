# Jenkins Certification

To help you prepare the [Jenkins Certification exam](https://www.cloudbees.com/jenkins-certification), this repository contains Docker compose configuration to quickly spin up Jenkins instances with all plugins listed in study guides provided here:

* [Certified Jenkins Engineer Study Guide](https://www.cloudbees.com/sites/default/files/cje_study_guide_final.pdf)
* [Certified CloudBees Jenkins Platform Engineer Study Guide](https://www.cloudbees.com/sites/default/files/ccjpe_study_guide_final.pdf)

## Pre-requisite

Docker and Docker compose must be available on your machine.

## Launch Jenkins

For _Certified Jenkins Engineer_ exam:

    cd cje
    docker-compose up

For _Certified CloudBees Jenkins Platform Engineer_ exam:

    cd ccjpe
    docker-compose up

When the container hosting Jenkins is ready, browse http://localhost:8080
