def call(String url, String branch, String credentialsId) {
    echo "Cloning from Git"
    git url: url, branch: branch, credentialsId: credentialsId
    echo "Git clone successful"
}
