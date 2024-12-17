def call(String url, String branch) {
    echo "Cloning from Git"
    git url: url, branch: branch
    echo "Git clone successful"
}
