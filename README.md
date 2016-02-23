# Jenkins Certification

To help you prepare the [Jenkins Certification exam](https://www.cloudbees.com/jenkins-certification), this repository contains Docker compose configuration to quickly spin up Jenkins instances with all plugins listed in study guides provided here:

* [Certified Jenkins Engineer Study Guide](https://www.cloudbees.com/sites/default/files/cje_study_guide_final.pdf)
* [Certified CloudBees Jenkins Platform Engineer Study Guide](https://www.cloudbees.com/sites/default/files/ccjpe_study_guide_final.pdf)

**DISCLAIMER**: This is not an **official** repository containing certification material. It's just there to help you train for the certification. Things can be outdated and not aligned with the certification exam.

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

## Cheat sheet

To remove docker containers, launch

    docker-compose rm -f

To clean up volumes, launch

    docker volume rm ccjpe_cjoc_home ccjpe_cm_home cje_jenkins_home

To rebuild docker images

    docker-compose build
    docker-compose up --force-recreate

### For mac user

As we are using `docker-machine` to have our `$DOCKER_HOST`, we cannot access containers through `127.0.0.1`. However, the communication between CJOC and CJE is done inside a private network (see `docker-compose.yml` file). So, in the CJOC global configuration, you **must** keep the `127.0.0.1` even if you access the UI through `docker-machine ip` value. You will have the *reverse proxy warning message* on the manage page, but don't worry about it.
