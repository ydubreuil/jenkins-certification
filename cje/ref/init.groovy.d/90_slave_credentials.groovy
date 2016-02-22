import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.domains.Domain
import com.cloudbees.jenkins.plugins.sshcredentials.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*
import jenkins.model.Jenkins

def key =  new BasicSSHUserPrivateKey.FileOnMasterPrivateKeySource("${Jenkins.instance.rootDir}/slaves/id_rsa")
def cred = new BasicSSHUserPrivateKey(CredentialsScope.GLOBAL, "ssh-slaves", "jenkins", key, "", "")
SystemCredentialsProvider.getInstance().addCredentials(Domain.global(), cred)

def pubkey = new File("${Jenkins.instance.rootDir}/slaves/id_rsa.pub").text.trim()
Jenkins.instance.setSystemMessage("""
To create a new docker container hosting a SSH slave and get the IP address, run:

CID=\$(docker run -d jenkinsci/ssh-slave "${pubkey}")
docker inspect --format '{{ .NetworkSettings.IPAddress }}' "\$CID"

Then use /home/jenkins as "Remote FS root" in the slave configuration
""")
