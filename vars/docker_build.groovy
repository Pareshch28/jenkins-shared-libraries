def call(String Projectname, String Imagetag, String DockerHubUser) {
    sh "docker build -t ${DockerHubUser}/${Projectname}:${Imagetag} ."
    echo "Build successful"
}
