FROM cloudbees/jenkins-operations-center:1.625.3.2
ENV JENKINS_UC http://jenkins-updates.cloudbees.com
COPY plugins.txt /plugins.txt
RUN /usr/local/bin/plugins.sh /plugins.txt

COPY ref /usr/share/jenkins/ref

# create a private SSH key to attach slaves
RUN mkdir "/usr/share/jenkins/ref/slaves" && ssh-keygen -N '' -t rsa -f "/usr/share/jenkins/ref/slaves/id_rsa"
